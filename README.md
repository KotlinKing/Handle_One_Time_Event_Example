# Handle_One_Time_Event_Example
Example showing how to send one time events with kotlin channels

## Why the need for handling events? 

So common problem in kotlin is to use live data or state flow in case of handling message
means that trigger responsible for showing error message is sent through liveData or through state flow 
that means if you rotate your device then that message will fire again. 
which shouldn't be happening.

Therefore to handle such type of cases we use a custom Event class that just handles this event.
This thing works. 
But with kotlin channels you can do it much easier and much beautiful way. 





























