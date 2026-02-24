# Expense Tracker API (Spring Boot)

## Overview
A RESTful Expense Tracker API built using Spring Boot.  
Supports CRUD operations, filtering by category, total expense calculation,
input validation, and global exception handling.

---

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Jakarta Validation
- Embedded Tomcat

---

## Features
- Add new expense
- Get all expenses
- Filter expenses by category
- Calculate total expenses
- Delete expense by ID
- Input validation
- Clean error handling

---

## API Endpoints

### Add Expense
**POST** `/api/expenses`

Request Body:
```json
{
  "amount": 500,
  "category": "Food",
  "description": "Dinner",
  "date": "2026-02-23"
}
Response: 201 Created

### Get All Expenses

GET /api/expenses
Response: 200 OK

### Filter by Category

GET /api/expenses?category=Food
Response: 200 OK

### Get Total Expenses

GET /api/expenses/total
Response: 200 OK

### Delete Expense

DELETE /api/expenses/{id}
Response: 204 No Content

### Validation Example (400 Bad Request)

If invalid data is submitted, the API returns a structured validation error response.

Example invalid request:

{
  "amount": -100,
  "category": "",
  "description": "",
  "date": null
}

Response:

{
  "amount": "Amount must be positive",
  "category": "Category is required",
  "description": "Description is required",
  "date": "Date is required"
}

Database

Uses in-memory H2 database for development.
Can be replaced with MySQL, PostgreSQL, or Oracle in production by updating datasource configuration.

Future Improvements

Pagination support
Authentication & Authorization (JWT)
Migration to PostgreSQL/MySQL
Docker support