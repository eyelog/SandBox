package yandex.tasks;

import java.io.*;

public class PlaneSatesJava {

    public static void main(String[] args) throws Exception
    {
        StreamTokenizer in = new StreamTokenizer(
                new BufferedInputStream(
                        new FileInputStream(new File("src/main/java/yandex/tasks/input.txt"))));
        PrintStream out = new PrintStream(new File("output.txt"));


        String str = in.sval;

        System.out.println(str);
    }
}
