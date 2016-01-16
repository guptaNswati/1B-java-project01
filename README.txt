project folder:
project01_swatig/


Brief description of submitted files:

src/CellularData.java
    - CellularData Class with four private fields/members.
    - Parameter taking constructor for creating object of CellularData type.
    - Includes addCountry() for storing the name of the country in one array and their cellular data in 2D array.     
    - Includes printTableData() for printing the name of the country from an array and its cellular data from 2D array
    - Includes getNumSubscriptionsInCountryForPeriod() for finding the total number of subscriptions in a country in a specified period.


src/TestCellularData.java
    - Includes main() for running the application. 
    - Tests the CellularData class by reading in one dimensional arrays containing cellular data of countries.
    - Prints tables with the name of the country and its partial and full data.   
    - Computes the total number of subscriptions of a specified country in specified years.
    - Includes printf() for 


resources/cellular.csv
    - A CSV (Comma Separated Value) file containing cellular data of 252 countries over many years 
    - Row contains the data of each country 
    - First Column contains the country names
    - From second Column to EOF (end of file), there are number of years starting from 1960 to 2012. 
        
        
RUN.txt
    - console output of CellularData.java & TestCellularData.java

README.txt
    - description of submitted files