Overview
--------
Project Name: User Details Management Application
-------------------------------------------------
The User Details Management Application is designed to collect and manage basic user details, such as first name, last name, phone number, email ID, and address. 
The application will provide an intuitive interface for performing CRUD operations, including data validation for each field. 
It will store the user data in a database and ensure proper validation and error handling.

The application will be developed using a web-based approach and will focus on simplicity, security, and performance.

Key Features:
-------------
. User Registration and Management: Users can add, edit, and delete their details. 
. CRUD Operations: Full CRUD functionality is implemented to manage user data. 
. Data Validation: Proper validation is enforced for each input field, including format checks for email and phone numbers. 
. Responsive Design: The user interface is responsive and can be used across different devices. 
. User-Friendly Error Handling: Clear validation messages are displayed for any incorrect input.

Technology Stack:
-----------------
. java: 17 
. Backend: Spring Boot (Java) 
. Database: MySQL(Depending on the stack) 
. Validation: Hibernate Validator (for Spring Boot) 
. Build Tool: Maven
. Version Control: Git (hosted on GitHub) 
. Deployment: optional for deployment phase

Functional Requirements:
------------------------
. User Registration: Users can register by providing their first name, last name, phone number, email, and address.

CRUD Operations:
----------------
. Create: Add a new user by filling out a form with the required fields. 
. Read: Display a list of all registered users. 
. Update: Edit an existing user's details. 
. Delete: Remove a user from the database.

Data Validation:
----------------
. First name and last name must contain only alphabetic characters. 
. Phone numbers must follow a predefined format (e.g., +CountryCode- 9388374932). 
. Email IDs must follow a standard email format (e.g., jdury93@gmail.com). 
. Address should be valid and alphanumeric.

Solution Architecture:
----------------------
  Layered Architecture:
  ---------------------
  . Presentation Layer (Frontend): Handle user interactions and provide a responsive design.
  . Business Logic Layer (Backend): Spring Boot will handle the core business logic, including CRUD operations and validation.
  . Data Layer (Database): MySQL will be used for persistent data storage, where user details are stored and managed.
  
Design Decisions:
-----------------
. Spring Boot is chosen for the backend for its scalability, ease of integration with databases, and built-in validation support. 
. MySQL is selected based on the flexibility of relational databases. 
. Hibernate Validator will ensure that all user inputs are validated server-side before being saved to the database.

Prerequisites:
-------------
Backend:
--------
  . Java 17
  . Maven/ for dependency management
  . Spring Boot Starter (via Maven)
Database:
---------
   . MySQL installed or available through a cloud provider.
   
Build and Run:
--------------
Backend (Spring Boot):
----------------------
Clone the repository: git clone https://github.com/your-user/user-management-app.git
Navigate to the project directory: cd user-management-app/backend
Build the project: mvn clean install
Run the application: mvn spring-boot:run
Access URLs:
Backend API URL: http://localhost:8080/user

Documentation:
--------------
API Documentation: The API endpoints are documented using Postman OpenAPI. Visit /Postman/ for the interactive documentation. Database Design: The user details are stored in a user collection/table with the following structure:

{
    "id":103,
    "firstname":"Alok",
    "lastname":"Sahoo",
    "phonenum":9388374932,
    "email":"jdury93@gmail.com"
}
Source Code:
------------
Repository: [Github - https://github.com/manasgithubit/UserDetailsManagementApp.git]
