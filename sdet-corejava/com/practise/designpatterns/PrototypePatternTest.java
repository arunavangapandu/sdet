package com.practise.designpatterns;

// prototype: used when the object is very expensive to create
// cloning the object does hte trick
// create new objects with clone(), not new()
// this pattern makes use of an interface for implementing prototype instance
// shallow cloning and deep cloning
// shallow cloning will copy only the instance variables of an object
// deep cloning copy other object references as well
// although object is copied, each object instance is still be unique
// it comes with other patterns, increased complexity to use  deep copy

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) {
        //  List<String> features = new ArrayList<>();
        List<String> features  = Arrays.asList("start up", "perform test", "shut down");
        Components components = new Components();
        components.setName("googles");
        components.setFunctionality("Read temperature of objects");

        Robot robot = new Robot(1, features, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getID());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeatures());

        System.out.println(anotherRobot.getID());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeatures());
    }




}
