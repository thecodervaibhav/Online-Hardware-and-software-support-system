<h1 align="center"> Hi,<img style="width: 35px;" src="https://raw.githubusercontent.com/ABSphreak/ABSphreak/master/gifs/Hi.gif" alt=""> Everyone <a href="#" target="_blank"> Welcome </a></h1>


<h1 align="center">Online Hardware and software support system</h1>
<h3>Project Description:</h3> 
<p>The system will be available on an online platform for 24x7 access to the employees, the engineers, the Head of the Department and the administration. It Helps keeping your IT staff productive with fast, accurate, remote technical support for your System environment. It provides defect support for a broad range of Products running on System hardware.<p/>
<p>Factors to consider include cost of downtime, skills, retention, overheads, customer satisfaction, and many others.</p>

<p>Employees of the organization uses IT based hardware for their daily work. If by some reason, these hardware goes down it is very
important to take care of these hardware and in case of fault , that should be repaired in priority basis. To maintain and support these
hardwares there exists a separate department, generally known as “SYSTEM ENGINEERS DEPARTMENT” . For any problem, concerned
employee must report to this department. Engineers from this department take care of the problem.</p>

<h3>Users:</h3>
	<h4 style="font-weight: bold;">1. HOD</h4>
	<h4 style="font-weight: bold;">2. Engineer</h4>
	<h4 style="font-weight: bold;">3. Employee</h4>
	
<img style="width: 100%;" src="https://github.com/thecodervaibhav/cowardly-wine-9340/blob/main/m.png" alt="">


<h3>Roles for the HOD:</h3>
<p>•	Login into the system </p>
<p>•	Register a new Engineer with a username(email) and password and the category (Hardware/software)</p>
<p>•	Can see List of all the Registered Engineers.</p>
<p>•	Can Delete any Engineers from the system</p>
<p>•	Can able to see all the raised problem.</p>
<p>•	Can assign any problem to any Engineer.</p>
<h3>Roles of Engineer:</h3>
<p>•	Each engineer has their own account by which they can login.(credentials given by the HOD)</p>
<p>•	Engineer can view the problem assigned to him by HOD .</p>
<p>•	Engineer can update the status of the problem addressed by him . i. e. whether it solved or any thing .</p>
<p>•	They can see list of all the problems attended by him/her.</p>
<p>•	Engineer can change his password.</p>

<h3>Roles of Employee:</h3>

<p>•	Employee can register himself with his username and password.</p>
<p>•	Each employee has their account in the system with which they can login</p>
<p>•	Employee can register any complain (hardware / software ) through the system. After registering the complain a complain id is generated by the system.</p>
<p>•	Employee can see the status of their problem by using complain id . Status means they can check who (engineer) is assigned to his problem.</p>
<p>•	They can see all complain history raised by him/her.</p>
<p>•	Employee can change his/her password.</p>

<h2 align="left"><i>Tech Stack Use for Creating a Project :</i></h2>
<div align="left">
<!-- <img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/> -->
<img alt="Java" src="https://img.shields.io/badge/java-f89820.svg?style=for-the-badge&logo=java&logoColor=white"/>
<img alt="MySQL" src="https://img.shields.io/badge/MySql-00758f?style=for-the-badge&logo=mysql&logoColor=white"/>

<h2>Key Learning From Project</h2>
<p>Got more Idea about implementing a Mysql query.</p>
<p>Cleared idea about how Jdbc work</p>
<p>learning Relation betweem may to many Tables in MySQL</p>
<p>Learn how Create a Flow of LLD</p>
<p> Learn Concept of DAO pattern how to implements in Design </p>

<h2>Responsibilities<h2>

<h4>To create user undestable Application where All functionalities proper work with Mysql query where sorting filtering and manupualtiong a any table data very easy.And connnectinng jdbc to Mysql for more dynamic maintain Relationship between all tables.</h4>

<h1>All Steps Are as Follows: </h1>

Step 1: Creating a required Database.
	
	
	Create a database sb101_project;
	use sb101_project;


------------------------------------------------------------------------------------------------------------------------------------------------------------

Step2: Create a All reruired tables:



	1. create HOD table
	(
	username varchar(15),
	password varchar(15)
	);
	
--------------------------------------------------------------------------------------------------------------------------------------------------------

	2.create table engineer
	  (
	  EngId primary key auto increment,
	  EngName varchar(15),
	  EngUserName varchar(15) unique,
	  EngPasswor varchar(15),
	  EngCategory varchar(20)
	  );

-----------------------------------------------------------------------------------------------------------------------------------------------------------

	3.create table Problems
	(
	pid int primary key auto_increment,
	pname varchar(20),
	pcategory varchar(15)
	);
------------------------------------------------------------------------------------------------------------------------------------------------------------

	  **Relation between enployee and engineer and problems;

          4.create table employee_engineer
   	  (
  	   rpid int,
   	  reid int,
   	  FOREIGN KEY (rpid) REFERENCES problems(pid),
  	   FOREIGN KEY (reid) REFERENCES engineer (Engid)
   	  );


 <div style="display: grid; grid-template-columns: repeat(2,1fr); " >
  <img style="width: 200px;" src="https://github.com/thecodervaibhav/cowardly-wine-9340/blob/main/1.png" alt="">
  <img style="width: 200px;" src="https://github.com/thecodervaibhav/cowardly-wine-9340/blob/main/2.png" alt="">
  <img style="width: 200px;" src="https://github.com/thecodervaibhav/cowardly-wine-9340/blob/main/3.png" alt="">
  <img style="width: 200px;" src="https://github.com/thecodervaibhav/cowardly-wine-9340/blob/main/4.png" alt="">
 </div>


------------------------------------------------------------------------------------------------------------------------------------------------------------
Step 3: Create a Separated Unitily package fro making a database connection...

	1. DButil
	
	Class.forName("com.mysql.cj.jdbc.Driver");
		
        String url="jdbc:mysql://localhost:3306/sb101_project";

------------------------------------------------------------------------------------------------------------------------------------------------------------

Step 3: Create a Bean Classes

	1. Hod.
	2. Engineer.
	3. Employee.
	4. EmployeePro.

------------------------------------------------------------------------------------------------------------------------------------------------------------

Step 3: Create a DAO Interfaces and its Implementation class.

	1. HodDao (I).
	   HodDaoImpl (C).

	2. EngineerDao (I).
	   EngineerDaoImpl (C).

	3. EmployeeDao (I).
	   EmployeeDaoImpl (C).

        4. ProblemsDao (I).
	   ProblemsDaoImpl (C).
	

------------------------------------------------------------------------------------------------------------------------------------------------------------

Step 4: Create a Separated Exception classes.

	1. HodException (C).
	

	2. EngineerException (C).
	 

	3. EmployeeException (C).
	  

        4. ProblemsException (C).
	


------------------------------------------------------------------------------------------------------------------------------------------------------------

Step 5: Create a Separated use cases classes.

	I. Use Cases for HOD...	

	1. use Cases for HOD:
	   **HodLoginUseCase...

	   a. username : admin.
	   b. password : admin123..

	2. Register a new Engineer with a username(email) and password and the category (Hardware/software)
	   **RegisterEngineerUseCase1
	   **Query:  PreparedStatement ps=conn.prepareStatement("insert into Employee(engName,engUserName,engPassword) values(?,?,?)");

	   a. username (email) : HODchoice
	   b. password         : HODchoice
	   
	3.Can see a List of all the Registered Engineers.
	   **AllEngineeerDetailsUseCase
	   **Query:  PreparedStatement ps=conn.prepareStatement("select * from engineer");
	
        4.Can Delete any Engineers from the system
	   **DeleteEnginnerUseCase
	   **Query: PreparedStatement ps = conn.prepareStatement("delete from Engineer where engname = ?");
	
	5.Can able to see all the raised problems.
	   **	
	   **Query:PreparedStatement ps=conn.prepareStatement("select * from problems");
			 
	
	6.Can assign any problem to any Engineer.
           **AssignProblemToEngineerUseCase
	   **Query: PreparedStatement ps=conn.prepareStatement("select * from engineer where engid=?");
	
------------------------------------------------------------------------------------------------------------------------------------------------------------

	II. Use Cases for Engineer...	

	1.Each engineer has an account by which they can log in. (credentials given by the HOD)
	***EngineerLoginUseCase
	Query :PreparedStatement ps =conn.prepareStatement("select * from Employee where empUserName=? AND empPassword=?");
		 

	2.Engineer can view the problem assigned to him by HOD.
	***GetEngineerToAssignProblem
	Query : PreparedStatement ps=conn.prepareStatement("select e.engid,p.pid, e.engname,p.pname,e.engcategory,p.status from engineer e INNER JOIN problems p INNER JOIN employee_engineer ee ON e.engid=ee.reid AND p.pid=ee.rpid AND p.pname =?;");
		
		
	3.Engineer can update the status of the problem addressed by him. i. e. whether it is solved or anything.
	***UpdateProblemStatusUseCase.
	Query :PreparedStatement ps= conn.prepareStatement("update problems set status = ? where pid= ?");
			 
		
	
	4.They can see a list of all the problems attended by him/her.
	***GetListOfEmployeeAssignProblemUseCase.
	Query : PreparedStatement ps=conn.prepareStatement("select e.engid, e.engname,e.engcategory,p.pname from engineer e INNER JOIN problems p INNER JOIN employee_engineer ee ON e.engid=ee.reid AND p.pid=ee.rpid AND p.pname=?");
			
		
		
	5.Engineer can change his password.
	***UpdatePasswordToEngineerUseCase
	Query :PreparedStatement ps= conn.prepareStatement("update Engineer set Engpassword= ? where EngUserName= ? AND EngPassword= ? ");			
		 

------------------------------------------------------------------------------------------------------------------------------------------------------------

	II. Use Cases for Engineer...	


	1.Employee can register himself with his username and password.
	***RegisterEmployeeUseCase1
	***Query :PreparedStatement ps=conn.prepareStatement("insert into Employee(empName,empUserName,empPassword) values(?,?,?)");
	

	2.Each employee has their account in the system with which they can log in
	***EmployeeLoginUseCase
	***Query :PreparedStatement ps =conn.prepareStatement("select * from Employee where empUserName=? AND empPassword=?");
		
	
	3.Employee can register any complaint (hardware/software) through the system. After registering the complaint a complaint id is generated by the system.
	***CreateProblemUseCase
	***Query :PreparedStatement ps=conn.prepareStatement("insert into Problems(pname,pcategory)values(?,?)");
		
	
	4.Employees can see the status of their problem by using complaint id. Status means they can check who (engineer) is assigned to his problem.
	***UpdateProblemStatusUseCase
	***Query :PreparedStatement ps=	conn.prepareStatement("select * from problems");
		

	5.They can see all complaints history raised by him/her.
	***GetEngineerToAssignProblem
	***Query :PreparedStatement ps=conn.prepareStatement("select e.engid,p.pid, e.engname,p.pname,e.engcategory,p.status from engineer e INNER JOIN problems p INNER JOIN employee_engineer ee ON e.engid=ee.reid AND p.pid=ee.rpid AND p.pname =?;");
		

	6.Employee can change his/her password.
	***AllProblemListUseCase
	***Query :PreparedStatement ps= conn.prepareStatement("update employee set emppassword= ? where empUserName= ? AND empPassword= ? ");			
		


------------------------------------------------------------------------------------------------------------------------------------------------------------



