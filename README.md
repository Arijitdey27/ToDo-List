# 📝 To-Do List Web Application

A simple **To-Do List application** built using **Java, JSP, MySQL, CSS, and JavaScript**.  
This project demonstrates CRUD operations (Create, Read, Update, Delete) with user-friendly UI.

---

## 🚀 Features
- Add new tasks  
- View all tasks  
- Edit and update tasks  
- Delete tasks  
- Persistent storage using **MySQL** database  
- Simple and responsive UI  

---

## 🛠️ Tech Stack
- **Backend:** Java (Servlets & JSP)  
- **Frontend:** JSP, CSS, JavaScript  
- **Database:** MySQL  
- **Server:** Apache Tomcat  

---

## ⚙️ Installation & Setup

### 1. Clone the repository
```bash
git clone https://github.com/your-username/todo-list.git


2. Configure Database

Open MySQL and create a database:

CREATE DATABASE todo_db;


Import the provided SQL file (todo_db.sql) into your database.

Update the database configuration inside the project (e.g., DBConnection.java or config file):

String url = "jdbc:mysql://localhost:3306/todo_db"; // Update port if different
String username = "your-username";
String password = "your-password";
