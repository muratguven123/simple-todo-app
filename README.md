# TodoList Application

This project is a Spring Boot-based application for managing a Todo List. It provides CRUD (Create, Read, Update, Delete) operations for three main entities: Categories, Tasks, and Users.

## Features

- Manage **Categories**: Create, update, view, and delete categories.
- Manage **Tasks**: Create, update, view, and delete tasks associated with categories.
- Manage **Users**: Create, update, view, and delete user accounts.

## Project Structure

### 1. Controllers
Controllers handle HTTP requests and provide endpoints for interacting with the system.

- **CategoryController**
  - Endpoint: `/category`
  - Provides CRUD operations for categories&#8203;:contentReference[oaicite:0]{index=0}.

- **TaskController**
  - Endpoint: `/taskcontroller`
  - Provides CRUD operations for tasks&#8203;:contentReference[oaicite:1]{index=1}.

- **UsersController**
  - Endpoint: `/users`
  - Provides CRUD operations for users&#8203;:contentReference[oaicite:2]{index=2}.

### 2. Entities
Entities represent the data model in the database.

- **Category**
  - Fields: `id`, `name`&#8203;:contentReference[oaicite:3]{index=3}.

- **Task**
  - Fields: `id`, `name`, `category`&#8203;:contentReference[oaicite:4]{index=4}.

- **Users**
  - Fields: `id`, `name`, `email`, `password`&#8203;:contentReference[oaicite:5]{index=5}.

### 3. Services
Services contain the business logic of the application.

- **CategoryService**
  - Provides methods for managing categories, including fetching all categories, finding by ID, adding, updating, and deleting&#8203;:contentReference[oaicite:6]{index=6}.

- **TaskService**
  - Provides methods for managing tasks, including fetching all tasks, finding by ID, adding, updating, and deleting&#8203;:contentReference[oaicite:7]{index=7}.

- **UserService**
  - Provides methods for managing users, including fetching all users, finding by ID, adding, updating, and deleting&#8203;:contentReference[oaicite:8]{index=8}.

## Prerequisites

- Java 17 or higher
- Maven or Gradle
- A database (e.g., MySQL, PostgreSQL) configured for Spring JPA.

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>

 ## Access the API at:

Categories: http://localhost:8080/category

Tasks: http://localhost:8080/taskcontroller

Users: http://localhost:8080/users


- ## API Endpoints
-**Categories**-

- GET /category: Fetch all categories.

- GET /category/id: Fetch a category by ID.

- POST /category: Add a new category.

- PUT /category/{id}: Update an existing category.

- DELETE /category: Delete a category.

-**Tasks**-
- GET /taskcontroller: Fetch all tasks.

- GET /taskcontroller/{id}: Fetch a task by ID.

- POST /taskcontroller: Add a new task.

- PUT /taskcontroller/{id}: Update an existing task.

- DELETE /taskcontroller: Delete a task.

-**Users**-
- GET /users: Fetch all users.

- GET /users/{id}: Fetch a user by ID.

- POST /users: Add a new user.

- PUT /users/{id}: Update an existing user.

- DELETE /users: Delete a user.


## Technologies Used
- Spring Boot: Application framework.
  
- Spring Data JPA: Database interaction.

- Lombok: Simplify Java entity definitions.

- Jakarta Persistence: Entity modeling.

- Maven: Build tool.
