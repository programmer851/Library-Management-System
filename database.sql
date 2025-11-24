CREATE DATABASE librarydb;

USE librarydb;

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    issued BOOLEAN DEFAULT FALSE
);
