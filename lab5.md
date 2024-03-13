**Part 1**<br>
Student: Hey, in the code below I used the command `bash script.sh` by my logic, the variable result should be 4 and everything up till 4 including 4 should be printed. However, instead of 0, 1, 2, 3, 4 only 0, 1, 2, 3 is printed. I am guessing it has something to do with the for-loop. 

<img width="1293" alt="Screenshot 2024-03-12 at 8 26 13 PM" src="https://github.com/AaravKhanduja/cse15l-lab-reports/assets/142117840/1818b3b2-8e16-4d94-b5d7-b48062a6404d">

TA:
Hey, try using 2 other numbers like 1 and 7 and see if everything is printed up till 7 or 8. 

Student: Here, <img width="1086" alt="Screenshot 2024-03-12 at 8 28 07 PM" src="https://github.com/AaravKhanduja/cse15l-lab-reports/assets/142117840/b82f78c5-c01e-4884-99ef-4a4227be59c8">


TA: the bug is clearly line 10. The for loop condition should be `i <= result` instead of `i < result`. This will fix the bug and so you will see everything up till 8 printed.

Student: The code seems correct now thanks,<img width="1298" alt="Screenshot 2024-03-12 at 8 36 29 PM" src="https://github.com/AaravKhanduja/cse15l-lab-reports/assets/142117840/52eeffba-5644-4d3e-b7a3-f4205b2d7edb">


Maintain the directory structure <br>
`-test-folder/` <br>
` -script.sh`<br>
` -main.java`

**Part 2** <br>

I always used Github but never really understood ssh when I cloned repositories before this class. This became pretty clear to me by the second half of the quarter. <br>
Also learning how to debug was helpful. Before this class, I'd only use the VScode extension but never knew how to run Junit through the command line. <br>
Finally, I really liked working in pairs during labs. My partner and I both learned how to review each other's code which is something I expect to be doing when I work in software development. 
