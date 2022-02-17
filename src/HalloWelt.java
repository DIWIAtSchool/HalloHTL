import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
        int n = 0;
        String text = "Das ist ein String";

        Person meinePerson = new Person(15, "Hugo");
        meinePerson.setAlter(15);
        meinePerson.description();

        List<Person> people = new ArrayList<>();
        people.add(meinePerson);
        int elems = people.size();
        for (int i=0; i < elems; i++)
        {
            people.get(i).description();
        }
        for (Person p: people)
        {
            p.description();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib Deinen Namen ein:");
        String name = scanner.nextLine();
        meinePerson.setName(name);

        String ausgabe = "";
        int x = 5;
        ausgabe = "." + x;



        boolean eingabeOk = false;
        while (eingabeOk == false) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Bitte gib nun Dein Alter ein:");
                int alter = scan.nextInt();
                eingabeOk = true;
                meinePerson.setAlter(alter);
                if (alter < 25) {
                    System.out.println("Jung");
                } else if (alter < 35) {
                    System.out.println("Mittelater");
                } else {
                    System.out.println("Alt");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Keine Zahl");
                eingabeOk = false;
            }
        }
        System.out.println(meinePerson.description());
    }
}
