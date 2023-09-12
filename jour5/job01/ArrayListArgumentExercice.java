import java.util.ArrayList;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<String> strings = new ArrayList<>();

        while(i < args.length){
            strings.add(args[i]);
            i++;
        }
        
        i = 0;
        while (i < strings.size()) {
            System.out.println(strings.get(i));
            i++;
        }
    }
}