public class DogFourTestDrive {
    
    public static void main(String[] args) {
        DogFour one = new DogFour();
        one.size = 70;
        DogFour two = new DogFour();
        two.size = 8;
        DogFour three = new DogFour();
        three.size = 35;

        one.bark(3);
        two.bark(4);
        three.bark(2);

    }
}
