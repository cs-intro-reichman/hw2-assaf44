// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]){
// step 1: recieving upperBound and mode
        int upperBound = Integer.parseInt(args[0]);
        String mode = args[1];
// step 2: loop until reaching 1
        for (int i = 1; i <= upperBound; i++){
            int currentNumber = i;
            int steps = 0;
// step 3: mode v
            if (mode.equals("v")){
                System.out.print(i + " ");
                while (currentNumber != 1){
                    steps++;
                    if (currentNumber % 2 == 0){
                        currentNumber = currentNumber / 2;
                    } else{
                        currentNumber = (currentNumber * 3) + 1;
                    }
                    System.out.print(currentNumber + " ");
                }
                System.out.println("(" + steps + ")");
            }
// step 4: mode c
            else if (mode.equals("c")){
                while (currentNumber != 1){
                    steps++;
                    if (currentNumber % 2 == 0){
                        currentNumber = currentNumber / 2;
                    } else{
                        currentNumber = (currentNumber * 3) + 1;
                    }
                }
            }
        }
// stewp 5: mandatory printing
        System.out.println("Every one of the first " + upperBound + " hailstone sequences reached 1.");
    }
}