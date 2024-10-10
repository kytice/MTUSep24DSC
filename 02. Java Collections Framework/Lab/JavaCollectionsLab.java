package Lab;
import java.util.*;
import java.io.*;

public class JavaCollectionsLab {
    public static void main(String[] args) {
        // Question 1: LinkedList operations
        linkedListExercise();

        // Question 2: Set implementations
        setImplementations();
    }

    // Question 1
    private static void linkedListExercise() {
        LinkedList<String> names = new LinkedList<>();

        // (i) Add names
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        // (ii) Insert "Ray" after May
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("May")) {
                iterator.add("Ray");
                break;
            }
        }

        // (iii) Delete Jay
        names.remove("Jay");

        // (iv) Display names from beginning and end
        System.out.println("___________________");
        System.out.println("Names from beginning:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("___________________");
        System.out.println("Names from end:");
        Iterator<String> descendingIterator = names.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // (v) Add Kay again and display
        names.add("Kay");
        System.out.println("___________________");
        System.out.println("Names after adding Kay again:");
        for (String name : names) {
            System.out.println(name);
        }
    }
    // Question 2
    private static void setImplementations() {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        String[] names = {"Kay", "Jay", "May", "Fay", "Kay"};

        for (String name : names) {
            hashSet.add(name);
            treeSet.add(name);
        }
        // HashSet:
        // - Elements aren't sorted
        System.out.println("___________________");
        System.out.println("HashSet:");
        for (String name : hashSet) {
            System.out.println(name);
        }

        // TreeSet:
        // - Elements are sorted in natural order (alphabetical in this case)
        System.out.println("___________________");
        System.out.println("TreeSet:");
        for (String name : treeSet) {
            System.out.println(name);
        }
        // The main difference:
        // HashSet is faster for adding and checking if an element exists
        // TreeSet keeps elements sorted but is slower for adding and removing
    }
}
