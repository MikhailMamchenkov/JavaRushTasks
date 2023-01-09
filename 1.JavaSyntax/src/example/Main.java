package example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dag dag = new Dag();
        Plain plain = new Plain();
     /*   dag.fly();
        plain.fly();*/

        List <Fly> list = new ArrayList<>();
        list.add(dag);
        list.add(plain);
        for (Fly fly : list) {
            fly.fly();
        }
    }
}
