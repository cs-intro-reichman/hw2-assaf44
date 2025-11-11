// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
// step 1: recieving a number and setting up base
	int times = Integer.parseInt(args[0]);
	int denominator = 1;
	double approxPi = 0;
	// step 2: building the loop
	for (int i = 0; i < times; i++){
		if (i % 2 ==0){
			approxPi = approxPi + (1.0 / denominator);
		}
		else{
			approxPi = approxPi - (1.0 / denominator);
		}
		denominator = (denominator + 2);
	}
// step 3: organizing and printing
	System.out.println("pi according to java: " + Math.PI);
	System.out.println("pi, approximated:     " + approxPi * 4);
	}
}