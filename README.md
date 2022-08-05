# banking-application
## By Imran
### Introduction
**_This is a simple banking application that contains a 'Customer' CRUD app with multiple 'Bank accounts' CRUD functionality ._**
<br>

### Installation
*The project is created with Maven, so you need to import it to the IDE and build the project to resolve the dependencies.*

### Database structure
*You will need to create a MySQL database with the name banking-application and add credentials to application.properties under src/main/resources*

<img src=https://github.com/imranow/banking-application/blob/main/assets/app_properties.png>
<br>

### Features
* add new customer
* add new account
* read customer
* read account
* update customer details
* update account details
* delete customer by id
* delete account by id
* check customer username and password
* check account accountnumber and pin

<br>

### Project Features
* Below is an outline of the project structure on SpringBoot

<img src =https://github.com/imranow/banking-application/blob/main/assets/bank_fullscreen1.png>
<img src =https://github.com/imranow/banking-application/blob/main/assets/bank_fullscreen2.png>

<br>

### Database
* Below is an ERD diagram describing the relationsip between Customer and Account

<img src=https://github.com/imranow/banking-application/blob/main/assets/mysql_diagram.png>

*As you can see the tables are linked by Customer ID*

<br>

#### Execution using Postman - CRUD

**Customer**

*create customer*

<img src =https://github.com/imranow/banking-application/blob/main/assets/Customer_create.png>

*read customer*

<img src = https://github.com/imranow/banking-application/blob/main/assets/customer_read.png>

*update customer details*

<img src=https://github.com/imranow/banking-application/blob/main/assets/customer_update.png>

*delete customer*

<img src=https://github.com/imranow/banking-application/blob/main/assets/customer_delete.png>

*check customer*

<img src=https://github.com/imranow/banking-application/blob/main/assets/customer_checkusernamepassword.png>

<br>

**Account**

*create account*

<img src=https://github.com/imranow/banking-application/blob/main/assets/account_create.png>

*read account*

<img src=https://github.com/imranow/banking-application/blob/main/assets/account_readaccountnumber.png>

*update account*

<img src=https://github.com/imranow/banking-application/blob/main/assets/account_updatewithid.png>

*delete account*

<img src=https://github.com/imranow/banking-application/blob/main/assets/account_delete.png>

*check account*

<img src=https://github.com/imranow/banking-application/blob/main/assets/account_checkaccountnumber.png>

<br>

### How to execute application on Spring Boot:

* This is a Spring Boot application so it uses Tom cat server
* The port number used is 8085 so make sure that port number is free
* Once you have imported the project onto Spring Boot you can run it by either; 
  1. Right clicking on application and Run as Spring Boot appication
  2. Right clicking on application and Run as Java application
* After getting the server up and running, you can run the CRUD operations using Postman as shown above

<br>

### Testing

*As you can see below, testCreate was done to test the functionality of the system but unfortunately did not pass*
<br>
*Test were done using Mockito and JUnit testing*

<img src=https://github.com/imranow/banking-application/blob/main/assets/Junit_test.png>

<br>

### What I've learnt from this Project:

*_I have learnt how to build a back-end API that can perform CRUD operations using Postman and build various Java and Spring Boot functionalities such as JUnit testing and LOMBOK. I've also learnt how to use MySQL to connect the database. In this project I expected it to be very difficult due to the short deadline and as it was my first time learning Java. In the future I'd like to correct some mistakes made such as the JUnit testing and on the CRUD operations(checking the account and customer) as shown above. I'd also like to design a front end instead of using Postman and add functionality such as adding interest rates on certain account types._*






