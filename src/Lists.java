import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    public static void list(){
        //Array List
        List<String> names = new ArrayList<>();
        names.add("Tshepo");
        names.add("Mpho");
        names.add("Bonolo");
        names.add("Lebo");
        names.add(0, "Katleho");
        names.add(2, "MphoJr");

        System.out.println("A list of names in the Array List");
        System.out.println(names);

        LinkedList<Object> games = new LinkedList<>(names);
        games.add(1, "Fifa");
        games.removeLast();
        games.add("GTA");
        games.add(0, "ClashOfClans");

        //Prints the list
        ListIterator<Object> listIterator = games.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        //prints the list backward
        listIterator = games.listIterator(games.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
