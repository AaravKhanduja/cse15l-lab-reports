![Image](ssh_git.png)
<br>
From the screenshot above, it can be inferred that I have logged into ieng6 using `ssh akhanduja@ieng6.ucsd.edu` and do not need a password as my keys have been set up already. 
I cloned the repository using `git clone <Ctrl+V>` which securely clones it on the ieng system.


I then ran the JUnit tests, 1 of which failed as you can see below. using the command `javac -cp <Ctrl+V> and `java -cp <Ctrl+V>`
<br>
![Image](tests_failed.png)

<br>
In order to fix the ListExamples.java directly from the command line I used vim. <br>
I used the command `vim ListExamples.java` <br> 
I then used the following keystrokes: <br>
Keys pressed: 
` \<down\> <down> <down> <down> <down> <down> <down> <down> <br>
  <a> <br>
  <left> <left> <left> <left> <left> <left> <left> <br>
  <Delete> 2 <Esc> <br>
  :w :qa! <br>)`
\The left arrows and down simply moved the cursor. 'a' shifted the mode to append from where I could change index1 to index2 using the `delete` and `2` keys. In order to save the changes in the file I used the command `:w` and then to exit `vim` I used the command `:qa!`.<br>

![Image](tests-passed.png)
<br>
In order to run the tests again I used `<up>` to get the same commands to run JUnit tests. 
You can see from the screenshot above that they ran successfully. 
<br>

