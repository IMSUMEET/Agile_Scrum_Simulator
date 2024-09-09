# Agile Scrum Simulator

Agile Scrum Simulator is a robust software tool built with JavaFX for a rich, interactive user interface and Spring Boot powering the backend. This application provides a comprehensive simulation of Agile project management, focusing on the Scrum framework. It allows users to model and experience key Scrum processes, including:

- Sprint Planning
- Backlog Managementg
- Task Assignment
- Sprint Progress Tracking
- Sprint Review and Reporting

This project delivers an immersive, hands-on experience of managing Agile projects from start to finish, offering a practical and engaging tool for both learning and professional use.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Contributions](#contributions)

## Features

- **Sprint Planning**: Create and manage sprints, assign tasks from the backlog.
- **Backlog Management**: Add, update, and prioritize backlog items.
- **Task Allocation**: Allocate tasks to team members during sprint planning.
- **Sprint Progress Tracking**: Monitor progress and completion of tasks during a sprint.
- **Sprint Review**: Evaluate sprint outcomes and generate reports.
- **Real-time updates**: Back-end simulation of real-time updates using Spring Boot services.

## Technologies

- **JavaFX**: For creating a rich, interactive desktop application UI.
- **Spring Boot**: For handling back-end logic, REST APIs, and real-time task tracking.
- **JPA / Hibernate**: For managing persistence and database operations.
- **H2 Database**: An in-memory database for simulating real-time data operations (or swap with MySQL/PostgreSQL if needed).
- **Maven**: For managing project dependencies and building the project.

## Prerequisites

To run this project, you will need:

- **Java 11 or higher**
- **Maven** (for building the project)
- **A modern IDE** like IntelliJ IDEA, Eclipse, or NetBeans.

## Project Structure

```bash
agile-scrum-simulator/
│
├── src/main/java/com/agile/scrum
│   ├── controller/          # JavaFX controllers
│   ├── model/               # Data models (Sprint, Backlog, Task)
│   ├── service/             # Spring Boot services for business logic
│   ├── repository/          # JPA repositories for database interaction
│   └── SimulatorApp.java    # Main entry point for JavaFX
│
├── src/main/resources
│   ├── templates/           # FXML views for JavaFX
│   ├── application.properties # Spring Boot configuration
│
└── pom.xml                  # Maven configuration and dependencies
```

## Usage

1. Create a Project: Start by creating a new Agile project from the dashboard.
2. Manage Backlog: Add user stories, tasks, and prioritize them in the backlog section.
3. Sprint Planning: Create new sprints, allocate tasks to team members, and define the sprint duration.
4. Track Sprint: During an ongoing sprint, you can monitor the progress, mark tasks as completed, or shift them back to the backlog if necessary.
5. Sprint Review: At the end of a sprint, you can review the completed work and generate a performance report.

## Contributions

Contributing
Contributions are welcome! To contribute:

1. Fork the project.
2. Create a new feature branch.
   ```bash
   git checkout -b feature-branch
   ```
3. Commit Your Changes
   ```bash
   git commit -m "Add some feature"
   ```
4. Push Your Branch
   ```bash
   git push origin feature-branch
   ```
5. Open Pull Request
