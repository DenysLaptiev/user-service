# User Service

## Project Overview
The **User Service** is a part of the **AWS Acquaintance Project**. It handles:
- User registration and authentication.
- JWT token generation and management.
- Secure storage of connection secrets using AWS Secrets Manager.
- Subscription to AWS SNS events triggered by the [Image Service](https://github.com/DenysLaptiev/image-service).

## Features
- **Spring Security** for authentication and authorization.
- Integration with AWS SNS for event notifications.
- Endpoints for:
  - User registration.
  - Login to obtain JWT tokens.
  - Confirmation of file deletion to interact with the Step Function

## Deployment
- Deployed on AWS EC2 instances using **Terraform**.
- Database hosted on AWS RDS (PostgreSQL).

## Related Services
- [Image Service](https://github.com/DenysLaptiev/image-service)
- [Lambda Function](https://github.com/DenysLaptiev/lambda)
