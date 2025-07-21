USE bookstore;

CREATE TABLE books (
    reference_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(50) NOT NULL,
    published_year INT,
    genre VARCHAR(25) NOT NULL,
    price DECIMAL(6, 2) NOT NULL,
    units INT NOT NULL
);

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    email VARCHAR(50),
    pass VARCHAR(20) NOT NULL,
    first_name VARCHAR(15) NOT NULL,
    last_name VARCHAR(15)
);
