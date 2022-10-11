# ResponseIoAssignment
 
In our code, there are 4 main packages in src/main/java

Enums Package

o   It contains the things that are remained constant throughout the execution i.e: DriverTypes and Environment type

2. Support Package

It contains 3 files

o   Driver Manager: The driver is initialized in this file

o   Config Reader: All the configuration properties from properties is being read in this file.

o   Page Object Manager: The objects of all the pages are returns from here to access the functions of pages

3. Pages Package

This package contains the pages for different functionality or tabs. Like loginPage, searchPatient page etc.

4. Context Package

Context package returns the driver object and page object manager object that is used to access the functions of the pages.

Steps followed while coding:

·       Features files are written

·       Step definitions are written

·       Page object model is used

·       Pages are created. Then its object is returned from page object manager class.

·        Step definition file takes the context of page object manager class and from that context takes the object of respective page and call the functions of that page


Reporting Mechanism:

·       For reporting, we are using the cucumber.

After execution, a report is generated that could be found under the (target -> cucumber-html-report -> index.html) folder of the framework.
