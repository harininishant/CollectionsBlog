import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface IterateEample {
    public static void main(String[] args) {

        List<String>L=new ArrayList<>();
        L.add("a");
        L.add("b");
        L.add("c");

        for (String temp:L){

            System.out.println(temp);
            
        }

    }

}
