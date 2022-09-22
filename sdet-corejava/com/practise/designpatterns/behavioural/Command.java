package com.practise.designpatterns.behavioural;
// separating layers of concern
// open for extension closed for modification
// Each object has its own responsibility
public interface Command {
    void execute();
    void unexecute();
}
