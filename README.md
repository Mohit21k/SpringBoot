# SpringBoot

#Installation Steps:
Download the zip file of project.
Unzip it and import it as gradle project in your eclipse workspace.
Change distribution url in gradle/wrapper/gradle-wrapper.properties file as per your local gradle installation.
Right click on project on do gradle refresh and it will build download and build whole project.
Right click on SpringBootDemoApplication.java class and do run as java application.
This will launch Spring Boot with minimal configuration and application will be ready to run on embbed tomcat.

METHOD:POST
Url to add shop information 
http://localhost:8080/shopInfo/addshopinfo

Request:
{
   "shopName": "Domino's",
   "shopAddress": "MBP Mahape",
   "shopPostCode": "400710"
}

Response:
SpringBootDemoApplication.java class and do run as java application.

{
   "shopId": "1",
   "shopName": "Domino's",
   "shopAddress": "MBP Mahape",
   "shopPostCode": "400710",
   "shopLatitude": 19.1087863,
   "shopLongitude": 73.0201256
}

Method:POST
Url to retrieve nearest shop information
http://localhost:8080/shopInfo/nearestShopInfo

Request:
{
   "lat": "19.1585",
   "lng": "72.9989"
}

Response:

{
   "shopId": "1",
   "shopName": "Domino's",
   "shopAddress": "MBP Mahape",
   "shopPostCode": "400710",
   "shopLatitude": 19.1087863,
   "shopLongitude": 73.0201256
}
