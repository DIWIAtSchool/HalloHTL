public class Person {
    private int alter;
    private String name;

    public Person(int alter, String name) {
        this.alter = alter;
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        int x = alter;
        this.alter = x;
    }

    public String description() {
        String s = "Meine Name ist: ";
        s += this.name;
        s += " und mein Alter ist: ";
        s += this.alter;
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }
}
