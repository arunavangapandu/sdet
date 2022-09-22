package com.practise.designpatterns.behavioural;

class SendToLogisticsCommand implements Command {
    public void execute (){
        // Insert into logistics table
    }
    public void unexecute (){
        // Delete from the logistics table
    }
}