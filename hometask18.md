Task 3: Student–Course Enrollment

Create an Enrollment module to allow students to enroll in courses.

Requirements

Create a new entity called Enrollment with:

enrollmentId
studentId
courseId
enrollmentDate
status

status can be:

ACTIVE
COMPLETED
CANCELLED
Create

Create an endpoint to enroll a student:

POST /enrollments

Accept:

{
"studentId": 1,
"courseId": 101,
"enrollmentDate": "2026-09-17",
"status": "ACTIVE"
}

Before saving:

Check whether the student exists.
If student doesn't exist → return "Student not found".
Check whether the course exists.
If course doesn't exist → return "Course not found".
Check whether the student is already enrolled in the same course.
If already enrolled → return "Student already enrolled".
Otherwise save the enrollment.
CRUD

Create:

EnrollmentRepository
EnrollmentController

Endpoints:

GET /enrollments
GET /enrollments/{id}
POST /enrollments
PUT /enrollments/{id}
DELETE /enrollments/{id}
Postman Testing

Test:

Valid enrollment
Invalid student ID
Invalid course ID
Duplicate enrollment
Get all enrollments
Update enrollment status
Delete enrollment
Task 4: Student Marks Management

Create a Marks module.

Entity: Marks

Fields:

markId
studentId
courseId
examName
marks
totalMarks

Example:

{
"studentId": 1,
"courseId": 101,
"examName": "Internal 1",
"marks": 78,
"totalMarks": 100
}
Requirements

Create:

MarksRepository
MarksController

Endpoints:

GET /marks
GET /marks/{id}
POST /marks
PUT /marks/{id}
DELETE /marks/{id}
Validation logic

While creating marks:

Check student exists.
Check course exists.
Marks cannot be negative.
Marks cannot be greater than totalMarks.

For example:

marks = 105
totalMarks = 100

Return:

Marks cannot be greater than total marks
