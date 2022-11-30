import java.io.File;
import java.util.*;

class ViewGroupNew {
    String name;
    int top, bottom, left, right, index;

    ViewGroupNew(String name, int top, int bottom, int left, int right, int index) {
        this.name = name;
        this.bottom = bottom;
        this.top = top;
        this.left = left;
        this.right = right;
        this.index = index;
    }

    public String toString() {
        return this.name + "=>" + this.top + "=>" + this.bottom + "=>" + this.left + "=>" + this.right + "=>" + this.index;
    }
}

public class YandexB2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        String a = sc.nextLine();
        int countOfView = Integer.parseInt(a);
        Map<String, ViewGroupNew> m = new HashMap<>();
        Map<String, List<String>> rel = new HashMap<>();

        for (int i = 0; i < countOfView; i++) {
            String name = sc.next();
            int left = sc.nextInt();
            int top = sc.nextInt();
            int right = sc.nextInt();
            int bottom = sc.nextInt();
            String parent = sc.next();
            ViewGroupNew v = new ViewGroupNew(name, top, bottom, left, right, i);
            m.put(name, v);
            List<String> l = rel.getOrDefault(parent, new ArrayList<>());
            l.add(name);
            rel.put(parent, l);
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("null");
        ViewGroupNew result = null;

        while (!q.isEmpty()) {
            String next = q.poll();
            List<String> children = rel.get(next);
            if (children != null) {
                for (String child : children) {
                    ViewGroupNew viewGroup = m.get(child);
                    if (viewGroup.top <= y && viewGroup.bottom >= y && viewGroup.left <= x && viewGroup.right >= x) {
                        q.add(child);
                        if (result == null || result.index < viewGroup.index)
                            result = viewGroup;
                    }
                }
            }
        }

        System.out.println(result == null ? null : result.name);
    }
}