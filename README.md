# Bookstore Management System

A simple Bookstore Management System built with Spring Boot, Spring Data JPA, and MySQL. It provides RESTful endpoints for managing books, including CRUD operations, search by title, and filtering by price.

---

## Project Structure

Bookstore-Management-System/  
├── BookStoreManagement  
│   ├── src/  
│   │   ├── main/  
│   │   │   ├── java/  
│   │   │   │   └── com.example.bookstore  
│   │   │   │       ├── controller/  
│   │   │   │       ├── entity/  
│   │   │   │       ├── repository/  
│   │   │   │       └── BookstoreApplication.java  
│   │   │   └── resources/  
│   │   │       └── application.properties  
│   ├── pom.xml  
└── README.md

---

## How to Run the Project

1. Clone the repository  
2. Import the project into your IDE (IntelliJ/Eclipse)  
3. Set up MySQL and create a database  
4. Update the database configuration in `application.properties`  
5. Use the command `mvn spring-boot:run` to start the application  
6. Test the endpoints using Postman  

---

## Features

- Add new books to the inventory  
- View all books  
- Search books by title  
- Filter books by price  
- Delete books by ID  
- Update book information  

---

## Technologies Used

- Java  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- Postman (for API testing)  

---

## API Endpoints

| Method | Endpoint              | Description               |
|--------|-----------------------|---------------------------|
| GET    | /books                | Get all books             |
| GET    | /books/{id}           | Get a book by ID          |
| GET    | /books/title/{title}  | Search books by title     |
| GET    | /books/price/{price}  | Filter books by price     |
| POST   | /books                | Add a new book            |
| PUT    | /books/{id}           | Update book by ID         |
| DELETE | /books/{id}           | Delete book by ID         |

---

## Screenshots & Demo

### Add New Book  
![Add Book](assets/add-book.png)

### View All Books  
![View Books](assets/view-books.png)

### Search Book by Title  
![Search Book](assets/search-book.png)

### Demo Video  
▶️ [Watch Demo Video](assets/demo-video.mp4)

---

## Author

Darshan A  
[GitHub Profile](https://github.com/darshan-a28)

