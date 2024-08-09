Payment Service Application
	This is a Spring Boot application that manages Payments and interacts with a order service. 

Features
	Payment Management: Create and manage payments.
	
	
Technologies Used
	Spring Boot: Framework for building Java applications.
	



Project Structure

	src/
	├── main/
	│   ├── java/
	│   │   ├── com.practice.paymentservice/
	│   │   │   ├── controller/   # Contains REST controllers
	│   │   │   ├── dto/          # Data Transfer Objects
	│   │   │   ├── service/      # Service layer
	│   │   │   └── util/         # Utility classes
	│   ├── resources/
	│   │   ├── application.properties   # Configuration files



Prerequisites
	Java 17: Ensure that JDK 17 is installed.
	Maven: For building and running the application.
	
Getting Started
1. Clone the Repository
	git clone https://github.com/your-username/orderservice.git
	cd orderservice
	
2. Build the Application
	mvn clean install
	
3. Run the Application
	mvn spring-boot:run
	

	
	
REST API Endpoints
	Create Order
	URL: /api/payment
	Method: POST
	Request Body:	
		{
			"orderId": "order12345",
			"cardNumber": "1234-5678-9876-5432",
			"amount": 100.0
		}
	Responses:
		for success :   "order12345"      some paymentId
		for fail :   "FAIL"