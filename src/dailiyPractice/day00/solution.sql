-- Create customers table
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50)
);

-- Insert sample data into customers table
INSERT INTO customers (customer_id, customer_name)
VALUES
(1, 'Alice'),
(2, 'Bob'),
(3, 'Charlie'),
(4, 'David');

-- Create orders table
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- Insert sample data into orders table
INSERT INTO orders (order_id, customer_id, order_date)
VALUES
(101, 1, '2024-10-01'),
(102, 1, '2024-10-02'),
(103, 3, '2024-10-03'),
(104, 4, '2024-10-04');


SELECT customers.customer_name, orders.order_id
FROM customers
LEFT JOIN orders
ON customers.customer_id = orders.customer_id;


