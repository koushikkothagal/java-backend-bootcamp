# The goal
TODO
Overview of what we'll be learning but from the perspective of the final objective. 
What do you want to be able to do after the bootcamp ends?
Mainly placeholder at this point. It makes sense to visit this and add specifics after the curriculum is finalized

# Understanding a web application

A web application is a program that runs on a web server and is accessed over the internet through a web browser. When a user navigates to the URL of a web application in their web browser, the browser sends a request to the web server where the application is hosted. 

The web server then processes the request, which can include querying a database, performing calculations, or executing other logic. The server generates a response, which is typically in the form of an HTML document, and sends it back to the user's browser. 

The browser then renders the HTML and displays the web page to the user. The user can interact with the web page by clicking buttons, filling out forms, and so on. These actions trigger additional requests to the server, which then sends back additional responses, allowing the user to interact with the web application in real time.

## Application architecture

The three-tier architecture is a software design pattern commonly used in the development of web applications. It is comprised of three distinct layers: the presentation layer, the application logic layer, and the data layer.

The presentation layer is the user interface, which is the part of the application that the user interacts with. This layer is responsible for the look and feel of the application, and is typically implemented using HTML, CSS, and JavaScript. It communicates with the application logic layer to receive data and present it to the user.

The application logic layer contains the business logic of the application. This is where the bulk of the application's functionality is implemented. It communicates with both the presentation layer to receive user input and provide data for rendering, and the data layer to retrieve and store data.

The data layer is responsible for providing an interface to the data stored in a database. It abstracts the underlying database technology, making it easy to switch to a different database system without changing the application logic. This layer communicates with the application logic layer to retrieve and store data, which is in turn called by the presentation layer.

The separation of the application into these distinct layers allows for greater flexibility and maintainability, as each layer can be developed and modified independently of the others.

Note: 
This architecture is a common starting point for web applications and is surely the simplest. There are several other advanced architecture styles - like distributed microservices. For most of this bootcamp, keep this three tier architecture in mind. Once you are comfortable with this model, we will be switching to the distributed model and looking at more advanced architectures.

## Frontend vs Backend
The front end and back end of a web application refer to the different components that make up the overall system.

The front end, also known as the client-side, is the portion of the application that is responsible for the user interface and the way the user interacts with the application. It is what the user sees and interacts with when they visit a website. The front end is typically implemented using technologies such as HTML, CSS, and JavaScript. It communicates with the back end to retrieve data and display it to the user, as well as to send user input to the back end for processing.

The back end, also known as the server-side, is responsible for the behind-the-scenes functionality of the application. It handles tasks such as processing user input, querying databases, performing calculations, and generating responses. The back end is typically implemented using languages such as Python, Ruby, or Java, and it may use technologies such as web frameworks, databases, and APIs.

In summary, the front end is responsible for the user interface, and how user interacts with the application, while the back end handles the application logic, calculations, database and server-side tasks.

The front end and back end communicate with each other using a variety of techniques, such as HTTP requests and responses. When a user interacts with a front-end feature of the website, such as a form submission, it sends an HTTP request to the server, the back-end, which then processes the data, interacts with the database if needed, and sends a response back to the front-end to be displayed to the user.

## How a web request works

When a JavaScript client application makes an HTTP request to a Java back-end service, the following steps occur:

- The JavaScript client application creates _request_ object. This object contains information such as the method (e.g. GET, POST, PUT), the URL, and any data that needs to be sent with the request.
- The JavaScript client sends the request to the server using the XMLHttpRequest or Fetch API. This is an asynchronous operation, which means the JavaScript code will continue to execute while the request is being processed.
- The request is received by the back-end service, which is typically implemented using a Java web framework such as Spring. The framework extracts the information from the request, such as the method and the URL, and routes it to the appropriate code in the back-end service.
- The back-end service processes the request, which can include querying a database, performing calculations, or executing other logic. 
- The back-end service generates a response, which is typically in the form of an HTTP response object. The response contains information such as the status code (e.g. 200 OK, 404 Not Found) and any data that needs to be sent back to the client.
- The response is sent back to the JavaScript client application. The JavaScript client receives the response and can process the data or update the user interface accordingly.

It's important to note that the request and response are sent over the HTTP or HTTPS protocol, which provides a standardized way for web clients and servers to communicate. And also to note that the above is a common pattern, with many variations and alternatives using different technologies and protocols such as WebSockets, gRPC and so on.

In this bootcamp, we will focus on the most popular protocol used for this today - using HTTP and HTTPS.


# What we'll be building

Final project options:

- A RESTful API (Application Programming Interface) for a e-commerce website that allows users to view products, add items to a shopping cart, and place orders

- A social media platform that allows users to create profiles, post updates, and connect with friends

- A project management tool that allows teams to collaborate on tasks and projects

- A blog / Content Management System that allows organizations to manage and distribute content through website or application, consisting of a "public" set of APIs for viewing and navigating blog and a "private" set of APIs for managing content

- A job portal that allows job seekers and recruiters to connect, search and apply for jobs, the backend would handle user management, job posting, and resume management 


# Where we'll be building
TODO
Explain dev workflow
- Setup Java locally
- Setup database locally
- Execute and verify locally
- Deploy to cloud (TBD)

# Setting up Java
## On Windows
Below steps can be used to setup OpenJDK 19 (latest stable GA version) on your Windows PC.
### Downloading Java
1.	Open https://jdk.java.net/19/ in your web browser.
2.	Click in ‘zip’ hyperlink against Windows/ x64 as highlighted in image below:
![](assets/java_setup_win/01openjdk-download.png)

3.	Create a new folder in C:\ of computer called openjdk.
![](assets/java_setup_win/04openjdk-folder.png)

4.	Copy the downloaded zip file (from step 2) into Java folder and unzip it.

Absolute path in image above will be “C:\openjdk\jdk-19.0.2”. If your folder name is different, make the changes accordingly.
       
### Setting up Java in PATH variable and JAVA_HOME variable.

Java should be set in PATH variable so that it is available to all the programs easily without needing the absolute path of java program.

JAVA_HOME variable is used by many java programs and it is advised to setup same.

Steps to setup:

1.	Press Windows + r key to open ‘Run’ window and type in sysdm.cpl.

![](assets/java_setup_win/07system-prop.png)

2.	Press ‘OK’ button to open System Properties.

![](assets/java_setup_win/08sys_prop-home.png)

3.	Navigate to ‘Advanced’ tab as highlighted in image above and click in ‘Environment Variables’ button as shown in image below.

![](assets/java_setup_win/09sys-prop-adv.png)

4.	Under the ‘System Variables’ section, click on 'New' button as highlighted below.

![](assets/java_setup_win/10env-var.png)

5.	This will open a window that will allow you to setup system variable.

![](assets/java_setup_win/11new-var.png)

6.	Enter the below values in the corresponding fields and click on ‘OK’ button.

Variable name: JAVA_HOME

Variable value: C:\openjdk\jdk-19.0.2

Note: Variable value should be same as what has been noted down in step 5 – d of Downloading Java section.

![](assets/java_setup_win/12new-var-fill.png)

7.	A new entry should be created as shown in image below:
![](assets/java_setup_win/13java_home_set.png)

8.	Select the row having variable name as ‘Path’ and click on edit button.

![](assets/java_setup_win/14path-edit.png)

9.	Click on ‘New’ button as shown below.

![](assets/java_setup_win/15path-new.png)

10.	Enter below text in newly added row as show in image below.
%JAVA_HOME%\bin

![](assets/java_setup_win/16java-path-set.png)

11.	Select the newly added row and continue to click on ‘Move Up’ button as highlighted below until the newly added row is on the top.

![](assets/java_setup_win/17java-path-top.png)

12.	Continue to click on ‘OK’ buttons to close the Windows opened.

### Verifying Java setup:

After performing all the steps above, open jdk should be setup on your computer. Perform below steps to check if the jdk is correctly setup.

1.	Press windows + r button to open ‘Run’ window and type cmd in text box.

![](assets/java_setup_win/18run-cmd.png)

2.	Click on ‘OK’ button to open command prompt.

Note: Any existing opened command prompt will not give you correct results. You need to open a new instance of command prompt.

3.	Run the below commands to check to Java is correctly set.

echo %JAVA_HOME%

java -version

javac -version

You should get an output similar to what has been shown in image below.

![](assets/java_setup_win/19java-verify.png)

## On Linux
Different Linux distros uses different package managers to install software. If you are familiar with installing software on your Linux machine, you can use inbuilt package manager for installation. After installing Java, you can proceed to verifying Java section and verify if Java is correctly installed.

For a more generic experience and to avoid permission issues, we will follow steps to setup Java manually.

Below steps can be used to setup OpenJDK 19 (latest stable GA version) on your Linux PC.
### Downloading Java

1.	Open https://jdk.java.net/19/ in your web browser.

This step can be done any PC and is used to just get URL to download openjdk binaries for setting up on Linux PC.

2.	Right click ‘zip’ hyperlink against ‘Linux / x64’ as highlighted in image below and click ‘Copy Link’.

At time of writing this article, URL is: https://download.java.net/java/GA/jdk19.0.2/fdb695a9d9064ad6b064dc6df578380c/7/GPL/openjdk-19.0.2_linux-x64_bin.tar.gz

![](assets/java_setup_linux/01copyurl.png)

Make a note of copied URL. This will be used to download openjdk on Linux PC.

3.	Login to your Linux PC and open terminal app.

4.	Make a new folder openjdk19 at your home directory and navigate to the newly created directory.
```sh
$ mkdir ~/openjdk19
$ cd ~/openjdk19
```
![](assets/java_setup_linux/02createdirs.png)

5.	Use wget to download the openjdk from the URL copied from Step 2.
```sh
~/openjdk19$ wget https://download.java.net/java/GA/jdk19.0.2/fdb695a9d9064ad6b064dc6df578380c/7/GPL/openjdk-19.0.2_linux-x64_bin.tar.gz
```
![](assets/java_setup_linux/03downloadjava.png)

6.	List the files in openjdk19 directory and extract the downloaded tar ball.
```sh
~/openjdk19$ tar -xvf openjdk-19.0.2_linux-x64_bin.tar.gz
```
![](assets/java_setup_linux/04extractjava.png)

7.	List the files again:
```sh
~/openjdk19$ ll
```
Navigate to extracted directory (jdk-19.0.2)
```sh
~/openjdk19$ cd jdk-19.0.2
```
Get the absolute path of directory:
```sh
~/openjdk19/jdk-19.0.2$ pwd
```
![](assets/java_setup_linux/05getabsolutepath.png)

8.	This the Path where openjdk has been downloaded and extracted. Make a Note of this path.

### Setting up Java in PATH variable and JAVA_HOME variable.

1.	Open the .bashrc file in your home directory in any text editor.
```sh
~/openjdk19$ nano ~/.bashrc
```
2.	Navigate to end of the file and make below entries in the file:
```sh
export JAVA_HOME=/home/mohit/openjdk19/jdk-19.0.2
export PATH=$JAVA_HOME/bin:$PATH
```
![](assets/java_setup_linux/06editbashrc.png)

3.	Save the file and exit the editor.

(For nano editor, use ‘Ctrl + X’ to exit. Editor will ask confirmation to save changes to file. Just press Enter key to make changes in .bashrc file).

4.	(Optional) Verify if changes are saved properly by listing the content of file.
```sh
~/openjdk$ cat ~/.bashrc
```
![](assets/java_setup_linux/07catbashrc.png)

5.	Execute below command to ensure changes are applied.
```sh
~/openjdk10$ source ~/.bashrc
```
![](assets/java_setup_linux/08applychanges.png)

### Verifying Java setup:

Run the below commands to check to Java is correctly set.
```sh
~/openjdk19$ echo $JAVA_HOME
~/openjdk19$ java -version
~/openjdk19$ javac -version
```
![](assets/java_setup_linux/09verifyjava.png)

## On Mac
1. Click the link below to get to the download page.  
   [https://jdk.java.net/19/](https://jdk.java.net/19/)

2. Click on the "tar.gz" file appropriate for your processor. 

   Intel processor: Click on "tar.gz" to the right of "macOs/x64".
   
   Apple Silicon processor: Click on "tar.gz" to the right of "macOS/AArch64". 

   ![](assets/OpenJDK_MacOs/OpenJDK_Mac01.png)

3. After the file has been downloaded, move it over to the home directory if it is not there already. 

   To get to the home directory:
   ```sh  
   $ cd ~
   ``` 

   To see all of the files in the current directory:
   ```sh  
   $ ls
   ```

   There file name of "openjdk-19.0.2_macos-aarch64_bin.tar.gz" or "openjdk-19.0.2_macos-x64_bin.tar.gz" should be in your home directory.  


4. Make a directory named "OpenJDK" in the home directory by      entering the following.  

   ```sh  
   $ mkdir OpenJDK
   ```   

5. Use the following command extract and move the files into the "OpenJDK" directory. 

   For Intel Processor:
   ```sh  
   $ tar -xf openjdk-19.0.2_macos-x64_bin.tar.gz -C $HOME/OpenJDK
   ```  

   For Apple Silicon Processor:
   ```sh  
   $ tar -xf openjdk-19.0.2_macos-aarch64_bin.tar.gz -C $HOME/OpenJDK
   ```

6. Verify that the files exist by entering the following into the terminal to get to the "bin" directory.

   ```sh  
   $ cd OpenJDK/jdk-19.0.2.jdk/Contents/Home/bin
   ```  

7. Check if the Java runtime environment (JRE) and the Java compiler exist by entering the following.

   ```sh  
   $ java -version  
   openjdk version 19.0.2 2023-01-17  
   OpenJDK Runtime Environment (build 19.0.2+7-44)  
   OpenJDK 64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)
   ```  
      
   ```sh  
   $ javac -version  
   javac 19.0.2
   ```  


8. Set up home and PATH environment variables by entering the following.

   ```sh  
   $ cat >> .zshrc  
   export JAVA_HOME=$HOME/OpenJDK/jdk-19.0.2.jdk/Contents/Home
   export PATH=$JAVA_HOME/bin:$PATH
   ```  

   If it freezes, hit Crtl+C.  

9. You can verify that the home and PATH environment variables are in the file.

   ```sh  
   $ cat .zshrc
   export JAVA_HOME=$HOME/OpenJDK/jdk-19.0.2.jdk/Contents/Home
   export PATH=$JAVA_HOME/bin:$PATH
   ``` 

10. Close and reopen the terminal. If everything was successful, you can check for the version of JRE and the Java Compiler from the home directory.

      ```sh  
      $ java -version  
      openjdk version 19.0.2 2023-01-17  
      OpenJDK Runtime Environment (build 19.0.2+7-44)  
      OpenJDK  64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)
      ```  
         
      ```sh  
      $ javac -version  
      javac 19.0.2
      ```

## Setting up Java using sdkman
   - Install sdkman goto: [sdkman.io](https://sdkman.io/install) and follow the setps as per your OS
   - Installing java see here: [https://sdkman.io/usage](https://sdkman.io/usage)


# Setting up a relational DB (PostgresDB)
TODO
Steps to get PostgresDB installed locally
    - Offline installer (https://www.postgresql.org/download/)
    - Docker option
Possibly prerecorded videos. Need offline support

# Git and GitHub

## On Windows
1. Go to download page using the following link

   [https://git-scm.com/downloads](https://git-scm.com/downloads)

2. Click on Windows to download for windows
   ![](assets/download_page_1.png)
3. Upon on clicking on it, you will be navigated to the following page, click 'Click here to download' and Git bash will be downloaded.
   ![](assets/download_page_2.png)
4. Now, double-click on downloaded exe file. You will be prompted to select Yes or No, select Yes.
5. Installation window will open, click on Next and you will be asked to choose installation directory, choose it and click on next.
   ![](assets/install_window_1.png)
   ![](assets/install_window_2.png)
6. For the next upcoming screens just choose the default options and click next and wait for the installation to complete.
7. After the installation is finished, click on Finish.
8. To verify if git was properly installed, open terminal/command prompt/git bash and type

   ```git --version```
9. You should see something like this.
   ![](assets/git_install_verify.png)
    ### Post Install
10. Now that git is successfully installed, there are a couple of things that needs to be done.
    1. First, configure your username and email since every git commit uses this information, type the following commands in terminal

                git config --global user.name "Vijaysai"
                git config --global user.email "vijaysai@example.com"
    2. To verify if your username and email were properly set use the following command
    
        ```git config user.name``` 
    
        ```git config user.email``` 
       
       You should see the email and name that you have set earlier, if not run the commands in step 10.1 again.
    4. Now clone the repository using the following command 
       
       ```git clone https://github.com/koushikkothagal/java-backend-bootcamp.git```
    

## On Linux

Linux comes with git pre-installed, you can check the version of git by typing the following command in terminal

```console
$ git --version
git version 2.37.1
```

If that's not the case, follow the steps below to install git

1. Open terminal and type the following command to update the package list

```console
sudo apt-get update
```
2. Type the following command to install git
```console
sudo apt-get install git
```
![git installing](./assets/git-linux-setup/installing-git.png)

3. After the installation is complete, set up your username and email by typing the following commands in terminal


```console
git config --global user.name "yourUserName"

git config --global user.email "youremail@example.com"
```

4. Now you are ready to clone the repository, type the following command in terminal

```console
git clone https://github.com/koushikkothagal/java-backend-bootcamp.git
```

# Setting up IntelliJ
## On MacOS
1. Go the download page by clicking the link below.

   [https://www.jetbrains.com/idea/download/?ij80pr#section=mac](https://www.jetbrains.com/idea/download/?ij80pr#section=mac)

2. Click on .dmg underneath Community Edition and select option appropriate for your processor.
![](assets/intelliJMacOS/intelliJ_01.png)

3. After the download has finished, click on the completed download.
![](assets/intelliJMacOS/intelliJ_02.png)

4. Click and drag the IntelliJ IDEA CE icon over to the Applications folder.
![](assets/intelliJMacOS/intelliJ_03.png)

5. Click on New Project.

   ![](assets/intelliJMacOS/intelliJ_05.png)

6. Click on the JDK tab and select your newly downloaded Java 17 JDK from the previous section.
   ![](assets/intelliJMacOS/intelliJ_06.png)

7. When you open your project for the first time, IntelliJ will be indexing the JDK. You will be able to use the IDE after indexing is complete.
![](assets/intelliJMacOS/intelliJ_07.png)

 ### Post Install
 ## Git
8. Click on VCS (Version Control System) and click on "Enable Version Control Integration" on your project. 
![](assets/intelliJMacOS/intelliJ_08.png)

9. You will be prompted with choices for "Version Control Integration". Select Git and then OK. 
![](assets/intelliJMacOS/intelliJ_09.png)


# Demo of an individual Git + GitHub workflow
TODO

Process of setting up a new GitHub repo, cloning, making changes, commit and push
Cloning a repo, submitting a pull request

# Homework
[Instructions](homework.md)
