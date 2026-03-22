# smart-energy-landing
## Quick Start Guide for Developers

### 1. Prerequisites
- **JDK 17+** (Amazon Corretto or Oracle)
- **Git**
- **Maven 3.8+**
- **IntelliJ IDEA** (recommended)

### 2. Setup & Installation
1. Clone the repo: `git clone https://github.com/your-user/smart-energy.git`
2. Go to project directory: `cd smart-energy`
3. Install dependencies: `mvn clean install`

### 3. Database Configuration
By default, the project uses **H2 In-Memory DB**. No setup required.
To use **PostgreSQL**, update `src/main/resources/application.properties`.

### 4. Running the Project
Execute: `mvn spring-boot:run`
The app will be available at: `http://localhost:8080`
Swagger UI: `http://localhost:8080/swagger-ui.html`
