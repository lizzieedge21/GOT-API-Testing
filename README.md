# GOT-API-Testing

How to use my framework: 

- Within the tester class you have to create tests of what you expect and then call methods from the character DTO or the Header DTO which both communicate with the file reader class to capture the API data. 

- The POJO also uses the file reader to transfer the body of the API into getters and setters to then be called into the DTO.

- The DTO holds all of the methods that return certain data from the API
- The DTO also holds methods that will check the size of a DTO and boolean methods to check whether the parameter types are being returned correctly. 

- This allows the Tester Class to be what the tester will make use of and decide what kinds of test they will want to run and what is of significance to them and their clients. 

Limitations 
- Certain things cannot be tested - such as the date as this is constantly changing however we can test whether the return type is what we expect of a date. 

