# StackMp3Player
A simple mock Mp3Player featuring the MF Doom album "Mm..Food". It allows the user to choose a track from the album by number and have the song printed to the console. This Mp3Player comes with an "Up Next" feature  where the user can see what song is next in the album up to the last one.

This is a knowledge experiment to test my newly gained knowledge of how the stack data structure works.

The current issue i am experiencing is that when the user wants to play he next/previous song, the stack variable will not update. In other words, I would like to re-stack the stack.

Update: I was able to solve the problem of re-stacking my "Up Next" Mp3player Stack via. experimentation. I found that if I pop the stack prior to the increment/decrement of the 'Tracknum' variable and re-push the stack, then it gives the same result!
