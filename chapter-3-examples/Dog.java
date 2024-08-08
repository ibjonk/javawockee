public class Dog {

String name;
public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.bark();    
    dog1.name = "Bart";

    //make a dog array
    Dog[] myDogs = new Dog[3];
    
    //put some dogs in the dog array
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;

    //add names to dogs 1 and 2 using the array references
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    //what is myDogs[2]'s name?'
    System.out.print("Last dog's name is ");
    System.out.println(myDogs[2].name);

    //loop through the array
    //length is a built in variable that returns the length
    int x = 0;
    while (x < myDogs.length) {
        myDogs[x].bark();
        myDogs[x].eat();
        myDogs[x].chaseCat();
        x = x + 1;
    }

    }

    public void bark() {
        System.out.println(name + " says woof");
    }

    public void eat() {
        System.out.println("nom nom");
    }

    public void chaseCat() {
        System.out.println("chasing chasing chasing");
    }


}