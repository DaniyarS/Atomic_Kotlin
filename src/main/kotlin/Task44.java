import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = reader.readLine().split(" ");
        String[] pattern = reader.readLine().split(" ");
        boolean matched = true;

        if (strings.length != pattern.length) {
            matched = false;
        } else {
            Map<String, String> map = new HashMap();

            for (int i = 0; i < strings.length; i++) {
                if (map.containsKey(strings[i])) {
                    if (!map.get(strings[i]).equals(pattern[i])) {
                        matched = false;
                    }
                } else {
                    map.put(strings[i], pattern[i]);
                }
            }
        }

        System.out.println(matched);
        reader.close();
        writer.close();
    }
}
