![Image](cd-no-arg.png)\
`cd` with no argument navigates you to the outermost directory. <br>
Here, `cd` takes you outside the lecture1 directory. <br>
`cd` with no argument serves as a quick way to exit the directories you are in if you need to. 


![Image](cat-no-arg.png)\
`cat` with no argument allows you to write text in the terminal and prints the same text. <br>
If I were to write cat with no argument and then write anything in the terminal say for example hello world, <br> it would print out hello world



![Image](ls-no-arg.png)\
`ls` with no argument tells you the directories and files within your current directory. <br>
Here, ls prints the lecture1 directory since it is in the workspace. <be>
If there were any other directory other than lecture1 it would show them as well.




![Image](cd-directory.png)\
`cd` with a directory navigates you to the directory you are looking for. <br>
Here, `cd lecture1` takes you to the lecture1 directory <br>
It is important to note that the argument directory has to be within the current directory <br>
Or else you would get a message `bash: cd: directory-name: No such file or directory` <br>
At the same time, the argument directory should not be within a sub-directory of the current directory you have navigated to with cd <br>
In the case that the argument directory is in a sub directory you would have to navigate to it in the command <br>
So if you wanted to go to the messages directory within the lecture1 directory you would write `cd lecture1/messages/` in the terminal. <br>



![Image](ls-directory.png)\
`ls` with a directory tells you the directories and files within your current directory. <br>
So in this case `ls lecture1` tells you the directories and files within lecture1 including Hello.java, messages, and README <br>
We can also see that the files are in the typical green font and the directories are in a blue font to compare easily. 


![Image](cat-directory.png)\
`cat` with a directory returns the statement `cat: messages/: Is a directory` <br>
It indicated that nothing will be printed as the argument is a directory and not a printable file. <br>



![Image](cd-file.png)\
`cd` with a file as an argument gives you an error <br>
This is because you cannot navigate to a file <br>
You can only navigate to a directory.


![Image](ls-file.png)\
`ls` with a file as an argument states the file name. <br>
`ls` is used to state contents in a directory <br> 
A file by itself is not a directory and so here, it just gives us the file name. 


![Image](cat-file.png)\
`cat` with a file prints out the content of the file when run. <br>
In this case, we used cat with the java file Hello.java <br>
This simply returns all the content in that file.

