public class DogFour {
    int size;
    String name;

    void bark(int numOfBarks) {
        int x = 0;
        while (x < numOfBarks) {
            if (size > 60) {
                System.out.println("WOOF");
                numOfBarks = numOfBarks - 1;
            } else if (size > 14 ) {
                System.out.println("ruff");
                numOfBarks = numOfBarks - 1;
            } else {
                System.out.println("yip");
                numOfBarks = numOfBarks - 1;
            }
        }
    }
}
