public class RandomFortune {
    
    public static void main(String[] args) {
        
        readFortune();
        

    //     String[] fortunes = {
    //         "You will get very rich",
    //         "You will find love soon",
    //         "You will start to smell bad",
    //         "You will eat chip"
    //     };

    //     java.util.Random randomGenerator = new java.util.Random();
    //     int randomNumber = randomGenerator.nextInt(4);

    //     System.out.println(fortunes[randomNumber]);

    }


    public static void readFortune() {
        java.util.Random randomGenerator = new java.util.Random();
        int randomNumber = randomGenerator.nextInt(4);

        String[] fortunes = {
            "You will get very rich",
            "You will find love soon",
            "You will start to smell bad",
            "You will eat chip"
        };


        System.out.println(fortunes[randomNumber]);
    }
}
