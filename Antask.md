Task 1: Authentication (Auth) – Detailed
Create an Authentication module for students without using JWT or Spring Security.
Requirements:

Add username and password fields in the existing Student entity.
Create an AuthController with the following two endpoints:
Register
Accept student details including username and password
Check whether the username already exists in the database
If username already exists → return proper error message
If username is new → save the student and return success message

Login
Accept username and password
Check if the username exists
If username does not exist → return “Username not found”
If password is incorrect → return “Invalid Password”
If both username and password are correct → return “Login Successful” along with student name

Handle all the logic only inside the controller (no service layer needed for this task).
Test both Register and Login properly using Postman.

Task 2: Course Management
Create a complete Course Management module (new CRUD).
Requirements:

Create a new entity called Course with the following fields:
courseId
courseName
department
duration (in months)
fees

Create CourseRepository.
Create CourseController with full CRUD operations:
Get all courses
Get course by ID
Create new course
Update existing course
Delete course

Test all the endpoints using Postman.
