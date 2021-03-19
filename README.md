# PILLOWLUX

## Project Description

PillowLux is an online shopping platform for eco-friendly pillows. At PillowLux, customers can register and place orders online. While site admin can run queries to retrieve a customer by their registered ID, pull reports for the most purchased item, least purchased item, as well as the average order price.

## Technologies Used

* Spring Tool Suite 4 - version 2.4.3
* Spring Framework, JPA/Hibernate
* Java - version 1.8 
* AWS's RDS & EC2
* PostgreSQL
* Kubernetes
* Maven
* Log4J
* Fluent D
* Loki
* Grafana
* Git

## Features

* Admin can retrieve average order price
* Admin can retrieve the least and most purchased item
* Admin can look up a customer in the system by their ID
* Customers can register online
* Customers can place orders online

To-do list:

* Create additional functionality for customers to view their placed orders 
* Create additional functionality for Admin to retrieve specific customer orders

## Getting Started

> Works on Windows.Verify for Linux and MacOS.
- run command `git clone https://github.com/faveme/PillowLux.git`
- run `mvn spring-boot:build-image` in local project directory
- run `sudo docker tag <image−id> <user−name>/<image−name>:<tag>`
- run `sudo push <user−name>/image−name` to push image to Docker Hub registrey
> This image name to be used in your configured manifests.
> You will need to set up a kubernetes cluster and deploy manifests.
> Set up AWS EC2 instance to serve as Kubernetes nodes.


## Usage

Use your EC2 URL to send HTTP requests to. Below are examples of URIs you can add to the end of your URL for requests, as well as details on the HTTP methods used and how to structure requests.

 "GET" to get a customer id
`/data/admin/customers/(insert customer number here)`

"GET" to get most purchased item
 `/data/admin/customers/mostPurchasedItem`
   
 "GET" to get least purchased item
 `/data/admin/customers/leastPurchasedItem`
 
 "GET" to get averageOrderPrice
 `/data/admin/customers/averageOrderPrice`
 
 

 
   "POST" for customer to register 
` /data/customers`
`{
  "first_name" : "Bob",
  "last_name" : "Jones",
	"email" : "jones@gmail.com",
	"password" : "pword",
	"dob" : "1990-12-29",
	"address" : "423,silver st",
	"city" : "Irvine",
	"state" : "California"
}`




 "POST" for customer to place online order
 `/data/order`  
`{    "customerID":1,
     "comments":"Great shopping experience! ",
     "city":"Irvine",
     "products":[
    {"productID":1},
    {"productID":2},
    {"productID":3}
    ]
}`

## License

This project uses the following license: [<license_name>](<link>).
