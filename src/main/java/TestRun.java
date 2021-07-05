public class TestRun {

    public static void main(String[] args) {

        LinkedListExample R = new LinkedListExample();
        R.addUser(new User("Bob", "Williams", 1));
        R.addUser(new User("Ron", "B", 2));
        R.addUser(new User("Jane", "Mills", 3));
        R.addUser(new User("George", "Clooney", 4));
        System.out.println(R.getUser(1));
    }
}
