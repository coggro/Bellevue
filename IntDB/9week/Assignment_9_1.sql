/*
* CIST 308
* Corey Gross
* 17 April 2017
* Assignment 9.1
*/

--Lesson 12
--Create a view called EMP_VU based on the employee number, employee name, and department number from the EMP table.  
--Change the heading for the employee name to EMPLOYEE.
CREATE VIEW EMP_VU AS SELECT EMPNO, ENAME, DEPTNO FROM EMP;

--Display the contents of the EMP_VU view.
SELECT * FROM EMP_VU;

--Select the view name and text from the data dictionary USER_VIEWS.
SELECT VIEW_NAME, TEXT FROM USER_VIEWS;

--Using your EMP_VU, enter a query to display all employee names and department numbers.
SELECT ENAME, DEPTNO FROM EMP_VU;

--Create a view named DEPT20 that contains the employee number, employee name, and department number for all employees in 
--department 20.  Label the view columns EMPLOYEE_ID, EMPLOYEE, and DEPARTMENT_ID.  Do not allow an employee to be 
--reassigned to another department through the view.
CREATE VIEW DEPT20 AS SELECT EMPNO EMPLOYEE_ID, ENAME EMPLOYEE, DEPTNO DEPARTMENT_ID FROM EMP WHERE DEPTNO = 20;

--Display the structure and contents of the DEPT20 view.
DESCRIBE DEPT20;
SELECT * FROM DEPT20;

--Attempt to reassign Smith to department 30.
UPDATE DEPT20 SET DEPARTMENT_ID = 30 WHERE EMPLOYEE='SMITH';

--Create a view called SALARY_UV based on the employee name, department name, salary, and salary grade for all employees.  Label the column Employee, Department, Salary, and Grade, respectively.
CREATE VIEW SALARY_UV AS SELECT ENAME, DNAME, SAL, GRADE FROM EMP e, DEPT d, SALGRADE s WHERE e.DEPTNO = d.DEPTNO AND e.SAL BETWEEN s.LOSAL AND s.HISAL;

--Lesson 13
--Create a sequence to be used with the primary key column of the DEPARTMENT table.  The sequence should start at 80 and 
--have a maximum value of 260.  Have your sequence increment by ten numbers. Name the sequence DEPT_ID_SEQ.
CREATE SEQUENCE DEPT_ID_SEQ START WITH 60 INCREMENT BY 10 MAXVALUE 200;

--Write a script to display the following information about your sequences: sequence name, maximum value, increment size, 
--and the last number.
SELECT SEQUENCE_NAME, MAX_VALUE, INCREMENT_BY, LAST_NUMBER FROM USER_SEQUENCES;

--Write an interactive script to insert a row into the DEPARTMENT table.  Be sure to use the sequence that you created for 
--the ID column.  Create a customized prompt to enter the department name. 
ACCEPT NAME PROMPT 'DNAME: ' INSERT INTO DEPARTMENT(ID, NAME);

--Create a non-unique index on the foreign key column (deptno) in the EMPLOYEE table.
CREATE INDEX EMPLOYEE_DEPT_ID_INDEX ON EMPLOYEE (DEPT_ID);

--Display the indexes and uniqueness that exist in the data dictionary for the EMPLOYEE table.
SELECT INDEX_NAME, TABLE_NAME, UNIQUENESS FROM USER_INDEXES WHERE TABLE_NAME = 'EMPLOYEE';
