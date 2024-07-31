public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;

        while(x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if(x == 3) {
                e2.count = e2.count + 1;
            }
            if(x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

// x = 0
// hello
// e1count = 1
// e2count = 1

// x = 1
// hello
// e1count = 2
// e2count = 3

// x = 2
// hello
// e1count = 3
// e2count = 5

// x = 3
// hello
// e1count = 4
// e2count = 6
// e2count = 6 + 4 = 10

// x = 4 
// DONE