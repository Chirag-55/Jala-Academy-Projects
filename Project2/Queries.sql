-- Display snum, sname, city, and comm of all salespeople.
SELECT SNUM, SNAME, CITY, COMM FROM SALESPEOPLE;

-- Display all snum without duplicates from all orders.
SELECT DISTINCT SNUM FROM ORDERS;

-- Display names and commissions of all salespeople in London.
SELECT SNAME, COMM FROM SALESPEOPLE WHERE CITY = 'London';

-- All customers with a rating of 100.
SELECT * FROM CUST WHERE RATING = 100;

-- Produce orderno, amount, and date from all rows in the order table.
SELECT ONUM, AMT, ODATE FROM ORDERS;

-- All customers in San Jose, who have a rating more than 200.
SELECT * FROM CUST WHERE CITY = 'San Jose' AND RATING > 200;

-- All customers who were either located in San Jose or had a rating above 200.
SELECT * FROM CUST WHERE CITY = 'San Jose' OR RATING > 200;

-- All orders for more than $1000.
SELECT * FROM ORDERS WHERE AMT > 1000;

-- Names and cities of all salespeople in London with a commission above 0.10.
SELECT SNAME, CITY FROM SALESPEOPLE WHERE CITY = 'London' AND COMM > 0.10;

-- All customers excluding those with a rating <= 100 unless they are located in Rome.
SELECT * FROM CUST WHERE RATING > 100 OR (RATING <= 100 AND CITY = 'Rome');

-- All salespeople either in Barcelona or in London.
SELECT * FROM SALESPEOPLE WHERE CITY IN ('Barcelona', 'London');

-- All salespeople with commission between 0.10 and 0.12. (Boundary values should be excluded)
SELECT * FROM SALESPEOPLE WHERE COMM > 0.10 AND COMM < 0.12;

-- All customers with NULL values in the city column.
SELECT * FROM CUST WHERE CITY IS NULL;

-- All orders taken on Oct 3rd and Oct 4th 1994.
SELECT * FROM ORDERS WHERE ODATE IN ('1994-10-03', '1994-10-04');

-- All customers serviced by Peel or Motika.
SELECT * FROM CUST WHERE SNUM IN (SELECT SNUM FROM SALESPEOPLE WHERE SNAME IN ('Peel', 'Motika'));

-- All customers whose names begin with a letter from A to B.
SELECT * FROM CUST WHERE CNAME LIKE 'A%' OR CNAME LIKE 'B%';

-- All orders except those with 0 or NULL value in amt field.
SELECT * FROM ORDERS WHERE AMT IS NOT NULL AND AMT != 0;

-- Count the number of salespeople currently listing orders in the order table.
SELECT COUNT(DISTINCT SNUM) FROM ORDERS;

-- Largest order taken by each salesperson, datewise.
SELECT SNUM, MAX(AMT) AS LARGEST_ORDER FROM ORDERS GROUP BY SNUM, ODATE;

-- Largest order taken by each salesperson with an order value more than $3000.
SELECT SNUM, MAX(AMT) AS LARGEST_ORDER FROM ORDERS WHERE AMT > 3000 GROUP BY SNUM;

-- Which day had the highest total amount ordered.
SELECT ODATE, SUM(AMT) AS TOTAL_AMOUNT FROM ORDERS GROUP BY ODATE ORDER BY TOTAL_AMOUNT DESC LIMIT 1;

-- Count all orders for Oct 3rd.
SELECT COUNT(*) FROM ORDERS WHERE ODATE = '1994-10-03';

-- Count the number of different non-NULL city values in the customers table.
SELECT COUNT(DISTINCT CITY) FROM CUST WHERE CITY IS NOT NULL;

-- Select each customer’s smallest order.
SELECT CNUM, MIN(AMT) AS SMALLEST_ORDER FROM ORDERS GROUP BY CNUM;

-- First customer in alphabetical order whose name begins with G.
SELECT * FROM CUST WHERE CNAME LIKE 'G%' ORDER BY CNAME LIMIT 1;

-- Get the output like "For dd/mm/yy there are _ orders."
SELECT CONCAT('For ', DATE_FORMAT(ODATE, '%d/%m/%y'), ' there are ', COUNT(*), ' orders.') AS OUTPUT
FROM ORDERS
GROUP BY ODATE;

-- Assume that each salesperson has a 12% commission. Produce orderno, salesperson no., and the amount of the salesperson’s commission for that order.
SELECT ONUM, SNUM, AMT * 0.12 AS COMMISSION FROM ORDERS;

-- Find the highest rating in each city. Put the output in this form. For the city (city), the highest rating is : (rating).
SELECT CITY, MAX(RATING) AS HIGHEST_RATING FROM CUST GROUP BY CITY;

-- Display the totals of orders for each day and place the results in descending order.
SELECT ODATE, SUM(AMT) AS TOTAL_AMOUNT FROM ORDERS GROUP BY ODATE ORDER BY TOTAL_AMOUNT DESC;

-- All combinations of salespeople and customers who shared a city. (ie same city )
SELECT S.SNUM, S.SNAME, C.CNUM, C.CNAME, C.CITY
FROM SALESPEOPLE S, CUST C
WHERE S.CITY = C.CITY;

-- Name of all customers matched with the salespeople serving them.
SELECT C.CNAME, S.SNAME
FROM CUST C
JOIN SALESPEOPLE S ON C.SNUM = S.SNUM;

-- List each order number followed by the name of the customer who made the order.
SELECT O.ONUM, C.CNAME
FROM ORDERS O
JOIN CUST C ON O.CNUM = C.CNUM;

-- Names of the salesperson and customer for each order after the order number.
SELECT O.ONUM, S.SNAME AS SALES_PERSON, C.CNAME AS CUSTOMER
FROM ORDERS O
JOIN SALESPEOPLE S ON O.SNUM = S.SNUM
JOIN CUST C ON O.CNUM = C.CNUM;

-- Produce all customers serviced by salespeople with a commission above 12%.
SELECT C.*
FROM CUST C
JOIN SALESPEOPLE S ON C.SNUM = S.SNUM
WHERE S.COMM > 0.12;

-- Calculate the amount of the salesperson’s commission on each order with a rating above 100.
SELECT O.ONUM, S.SNUM, O.AMT * S.COMM AS COMMISSION
FROM ORDERS O
JOIN SALESPEOPLE S ON O.SNUM = S.SNUM
WHERE O.RATING > 100;

-- Find all pairs of customers having the same rating.
SELECT C1.CNUM AS CNUM1, C1.CNAME AS CNAME1, C2.CNUM AS CNUM2, C2.CNAME AS CNAME2, C1.RATING
FROM CUST C1, CUST C2
WHERE C1.CNUM < C2.CNUM AND C1.RATING = C2.RATING;

-- Policy is to assign three salespersons to each customer. Display all such combinations.
SELECT C.CNUM, C.CNAME, S1.SNUM AS SNUM1, S1.SNAME AS SNAME1, S2.SNUM AS SNUM2, S2.SNAME AS SNAME2, S3.S
