# TestShopee
GUIDELINE TO GET CODE AND TO RUN SCRIPT
•	In your PC, open folder which will content test scripts (Ex: Folder name as "New Folder")
•	Right-click on the space in "New Folder" folder, select “Git Bash here” 
•	Open cmd GIT bash
•	Input cmd GIT bash:
$git clone https://github.com/phungle3001/TestShopee.git
(For login: phungle3001@gmail.com/P@ssword3001)
Wait few minute until clone completely 
•	Verify visible of TestShopee in local PC: ../New Folder/TestShopee
•	Access to folder:  ../New Folder/TestShopee/Test
•	Right-click on the space in "Test" folder, select “Git Bash here” 
•	Input cmd GIT bash (At the first time, using this command for Maven project built/ Run script):
$mvn clean install
Wait few minute until running completely  
•	Input cmd GIT bash (From the second time, using this command for run script):
$mvn test
Wait few minute until running completely 
•	After running completely, open report file by web:
Access to test-output folder:   ../New Folder/TestShopee/Test/test-output
Click on “index.xml” file to open report by web browser


