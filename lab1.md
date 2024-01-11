![Image](cd-no-arg.png)\
The working directory when the command was run was lecture1. <br>
`cd` with no argument navigates you to the outermost/root directory. <br>
Here, `cd` takes you to the outermost/root directory outside lecture1. <br>
`cd` with no argument serves as a quick way to exit the directories you are in if you need to. <br>
The output in the screenshot above is not an error.


![Image](cat-no-arg.png)\
The working directory when the command was run was the root directory. <br>
`cat` with no argument allows you to write text in the terminal and prints the same text. <br>
If I were to write cat with no argument and then write anything in the terminal say for example hello world, <br> it would print out hello world.<br>
The output in the screenshot above is not an error.



![Image](ls-no-arg.png)\
The working directory when the command was run was the root directory. <br>
`ls` with no argument tells you the directories and files within your working directory. <br>
Here, `ls` prints the lecture1 directory since it is in the working directory. <br>
If there were any other directories or files other than lecture1 it would show them as well. <br>
The output in the screenshot above is not an error.




![Image](cd-directory.png)\
The working directory when the command was run was the root directory. <br>
`cd` with a directory navigates you to the directory you are looking for. <br>
Here, `cd lecture1` takes you to the lecture1 directory <br><br>
It is important to note that the argument directory has to be within the working directory <br>
Or else you would get a message `bash: cd: directory-name: No such file or directory` <br><br>
If the argument directory is within a sub-directory of the working directory, you have to navigate to it within the command. <br><br>
So if you wanted to go to the messages directory within the lecture1 directory you would write `cd lecture1/messages/` in the terminal.<br>
The output in the screenshot above is not an error.



![Image](ls-directory.png)\
The working directory when the command was run was the root directory. <br>
`ls` with a directory tells you the directories and files within the argument directory. <br>
So in this case `ls lecture1` tells you the directories and files within lecture1 including Hello.java, messages, and README <br>
We can also see that the file names are in the typical green font and the directory names are in a blue font for easy comparison. <br>
The output in the screenshot above is not an error.


![Image](cat-directory.png)\
The working directory when the command was run was the lecture1 directory. <br>
`cat` with a directory returns the statement `cat: messages/: Is a directory` <br>
The output in the screenshot above is an error. <br>
This is because the argument is a directory and not a printable file. <br>



![Image](cd-file.png)\
The working directory when the command was run was the lecture1 directory. <br>
`cd` with a file as an argument gives you an error <br>
The output in the screenshot above is an error. <br>
This is because you cannot `cd` to a file <br>
You can only `cd` to a directory.<br>



![Image](ls-file.png)\
The working directory when the command was run was the lecture1 directory. <br>
`ls` with a file as an argument states the file name if it exists in the working directory. <br>
A file by itself is not a directory; here, it just gives us the file name because it exists in the working directory. 
<br>
The output in the screenshot above is not an error.


![Image](cat-file.png)\
The working directory when the command was run was the lecture1 directory. <br>
`cat` with a file prints out the content of the file when run. <br>
In this case, we used `cat` with the java file Hello.java <br>
This returns all the content in that file. <br>
The output in the screenshot above is not an error.

