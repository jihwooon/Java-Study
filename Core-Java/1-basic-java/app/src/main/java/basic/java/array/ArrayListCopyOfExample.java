package basic.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCopyOfExample {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        friends.add("Paul");
        friends.add("jihwooon");
        friends.remove(1);
        friends.set(0, "Paul");
        System.out.println("friends" + friends);
        String getNumber = friends.get(0);
        System.out.println("getNumber : " + getNumber);


        for (int i = 0; i < friends.size(); i++) {
            System.out.println("friends.get(i) : " + friends.get(i));
        }

        ArrayList<String> people = friends;
        people.set(0, "Mary");

        ArrayList<String> copiedFriends = new ArrayList<>(friends);

        String result = copiedFriends.get(0);
        System.out.println(result);

        friends = new ArrayList<>(List.of("Peter", "Paul", "Mary"));
        String[] names = friends.toArray(new String[0]);
        System.out.println("friends : " + Arrays.toString(names));

        String elemnts = friends.toString();
        System.out.println(elemnts);

        int sum = 0;
        int[] loops = {1, 2, 3, 4, 5};

        for (int i = 0; i < loops.length; i++) {
            sum += loops[i];
        }
        System.out.println("sum : " + sum);

        for (int loop : loops) {
            sum += loop;
        }

        System.out.println("forEach : " + sum);
    }

}
