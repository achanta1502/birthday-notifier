# Birthday Notifier

A full-stack application to manage user birthdays and send notifications.

## Features

- Add, edit, and remove users with birthdays
- View upcoming birthdays on the dashboard
- REST API backend (Java Spring Boot)
- React frontend

## Getting Started

### Backend

1. `cd backend`
2. `mvn spring-boot:run`

### Frontend

1. `cd frontend`
2. `npm install`
3. `npm start`

## API Endpoints

- `GET /api/users` — List all users
- `POST /api/users` — Add a new user
- `PUT /api/users/:id` — Edit user
- `DELETE /api/users/:id` — Remove user

## License

MIT