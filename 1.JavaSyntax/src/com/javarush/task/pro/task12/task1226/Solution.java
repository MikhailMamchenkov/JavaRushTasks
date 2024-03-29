package com.javarush.task.pro.task12.task1226;

/* 
Бой гладиаторов
*/

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        Robot amigoRobot = new Robot(Arrays.asList(null, new Core(1), new Core(2), null,
                new Core(4), new Core(5), null, new Core(7), null, new Core(9)));

        Robot diegoRobot = new Robot(Arrays.asList(new Core(0), null, null, new Core(3), null,
                new Core(5), new Core(6), new Core(7), null, null));

        fixRobot(amigoRobot);
        fixRobot(diegoRobot);

        printRobot(amigoRobot);
        System.out.println();
        printRobot(diegoRobot);
    }

    public static void printRobot(Robot robot) {
        robot.getCores().forEach(System.out::println);
    }

    public static void fixRobot(Robot robot) {
        int coreCount = 0;

        List<Core> cores = robot.getCores();
        for (int i = 0; i < cores.size(); i++) {
            Core core = cores.get(i);
            if (Objects.isNull(core)) {
                cores.set(i, new Core(coreCount));
            }
            coreCount++;
        }
    }
}