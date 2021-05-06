# Swift Starterkit 


This Starter kit is to perform Create and Read operations for order and kitchen services with MS SQL SERVER EXPRESS EDITION .It also includes features such as : namingserver ,zipkin,mssql db connections,reselience4j circuit breaker ,kafka messaging .

Build Instructions
------------------

a) Run pom.xml in all the individual folders(ie kitchen,namingserver,order)
   -----------------------------------------------------------------------

                           mvn clean install 
                                  OR 
                 right click the folder in STS ->Run As -> Maven install

   This command will build the following projects : namingserver ,kitchen ,order 

----------------------------------------------------------------
b)Run the below command in all the above modules
  ---------------------------------------------
           mvn spring-boot:run
                   OR
        right click the folder in STS  ->Run As -> Spring Boot Application   


------------------------------------------------------------------
c) Check the below end point
 -----------------------------

Naming server - http://localhost:8761/ 
order         - http://localhost:8092/order
kitchen       - http://localhost:8091/kitchen
zipkin        - http://localhost:9411/         
(check logs from zipkin)

