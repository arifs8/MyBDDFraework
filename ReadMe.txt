


											Apache Maven Project Template for Eclipse Project
											
I chose the BDD Cucumber framework for its clear alignment with business requirements, readability in test scenarios, and support for reusable step definitions.

org.apache.maven as a template for Eclipse Maven projects because it provides a solid skeleton , foundation and best practices for managing and building Java projects with Maven.

i. Official Apache Maven Project: org. apache.maven is the official project maintained by the Apache Software Foundation. As a widely adopted build automation tool, Maven has a large and active community, ensuring continuous development, bug fixes, and support.

ii. Standardized Project Structure: The org. apache. maven template enforces a standardized project structure, making it easier for developers to understand and navigate the project. It follows the convention over configuration principle, providing predefined directories for source code, resources, tests, and configuration files.

iii. Dependency Management: Maven simplifies dependency management by allowing you to declare dependencies in the pom.xml file. The org.apache.maven template includes the necessary configuration to manage dependencies efficiently, including transitive dependencies and version conflicts.

iv. Build Lifecycle and Plugins: Maven defines a build lifecycle consisting of phases, and plugins are bound to these phases to perform various tasks like compiling code, running tests, packaging artifacts, and deploying them. The org.apache.maven template sets up the default build lifecycle and includes commonly used plugins to accomplish these tasks.

v. Maven Repository Integration: Maven integrates seamlessly with repositories, such as the Central Repository, where you can find a vast number of open-source libraries and frameworks. By using the org.apache.maven template, you can easily specify dependencies from these repositories, and Maven will automatically download them during the build process.

vi. Continuous Integration (CI) and Build Automation: Many CI tools and build automation systems have native support for Maven. By using the org.apache.maven template, you can easily integrate your project into these systems, enabling automated builds, testing, and deployment.


								Project Title : Cucumber BDD  Framework using POM and Page Factory.

1. When we say we are developing some framework we need to have below:
		i.   Datadriven Approach.
		ii.  Utilitys.
		iii. Modules
		iv.  library.
		v.   Reporting.
		vi.  Browser Launch
		
		by considering all these parameters i have choosen to develop ,  Cucucmber BDD Framework with PAge object model and Page Factory as my framework.

2.I have used Maven Selenium project for our test automation. 
		Maven is a build automation tool that manages dependencies and builds our project. 
		It's particularly useful for Java projects like ours,as it helps ensure that we have all the necessary libraries and dependencies to compile and run our code.

	
3. BDD - Feature -> resouces , Step defination -> test/java , runner file -> test/java
We have written selenium Automation code which is actually using POM and Page factory

4. POM - page obejct model is a Design Pattern 
	i. By using POM we can test only Web Applications and Mobile apps we cant test API's., Firstly POM focus on page layer where it Segregate our application to diffrent pages
	ii. Page Factory : Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. In Page Factory, we use @FindBy annotation. The initElements method is used to initialize web elements.
	
5.  Utilities    -> Reusable code , ElementUtils -> clickOnElemt(Webelement element, long durationInSec){ 
															WebElement element3 = waitForElement(element, durationInSeconds);
															element3.click();
													 }
													 
													1. getTextFromElement(WebElement element, long durationInSeconds){}
													2. typeTextIntoElement(WebElement element, String textToBeTyped, long durationInSeconds) {}
													3. waitForElement(WebElement element, long durationInSeconds) { }
													4. selectOptionInDropdown(WebElement element, String dropdownOption, long durationInSeconds) {} 
													5. acceptAlert(WebElement element, long durationInSeconds) {}
													6. dissmissAlert(long durationInSeconds) {}
													7. Alert waitForAlert(long durationInSeconds) {}
													8. mouseHoverAndClick(WebElement element, long durationInSeconds) {}
													9. visibilityOfElement(WebElement element, long durationInSeconds) {}
													10. List<WebElement> visibilityOfElements(List<WebElement> element, long durationInSeconds) {}
													
   configReader -> what ever the config required to run our project shuch as browser , env , URl's , 
    commonUtills -> We have implemented constants when ever it is required we can call this thing through out our framework.

6. Factory --> Browser factory -> we have initializeBrowser by passing 
		public static webDriver initializaBrowser(String browserName){
		}
		
		This code will choose the browser from the config file and return the driver at the end.

7. Hooks -> 1. Src/test/java create a pkg @before @after -> quite @afterStep-> Svcreenshot code
	i. We have written @Before and @After annotations , we have written this all because by using this annotation @Before and @after code will execute after each scenario.
	ii. In @Before tag we are initializing the property file by using the configReader class we have initializing theproperties(),
						we are initializing the browser 
						we are callling the browser 
	iii. @After we are quiting the browser , and taking the screenshot and attaching to the report.
	
8. Test Runner ->  we have provided the feature file path and glueing with -> stepdefination and Hooks 
once we say plugin we use preety , html , json and extend report
Where as @Runwith is from junit and (Cucumber.class) is from cucumber junit

9. Config.Propertie --> This File stores the information that remains static throughout the framework such as browser Specification and URL's ETC.
Which resides in src/test/Resources

10. I have also done Parallel execution , Screenshot scenario and reporting part as well.

11. If you want to run this framework we need to go testrunner right click and run the junit , 
		apart from junit we can also run this by clicking on project right clik and Maven Clean / Test.
		The maven will only identify the java file which is begin with Test and end with Test java file.
		
		
12. Apart from the config.properties how are we passing the data , We are passing those data from the feature files.
	The main advantage of this BDD cuccumber framework is we dont have to read the data from excel files.
	If we are using TestNG, Hybridmodel FW with POM and page factory there we may using excel file to the automation scripts.	