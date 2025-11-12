public class TimeCalc {
    public static void main(String[] args) {
// step 1: recieving information
        String Rtime = (args[0]);
        String minutesToAdd = (args[1]);
// step 2: converting String to int
        int hours = Integer.parseInt(Rtime.substring(0, 2));
        int minutes = Integer.parseInt(Rtime.substring(3, 5));
        int minutesToAddInt = Integer.parseInt(minutesToAdd);
// step 3: converting hours to minutes and adding the sums
        int tempTime = ((hours * 60) + minutes + minutesToAddInt);
// step 4: converting back to formal time
        int totalHours = (tempTime / 60);
        int newHours = (totalHours % 24);
        int newMinutes = (tempTime - (totalHours * 60));
// step 5: attention to special cases
        String printStringHours = String.valueOf(newHours);
        String printH;
            if (newHours < 10){
            printH = ("0" + printStringHours);
            }
                else{
                printH = printStringHours;
                }
        String printStringMinutes = String.valueOf(newMinutes);
        String printM;
            if (newMinutes == 0){
            printM = ("00");
                }else if (newMinutes < 10){
                        printM = ("0" + printStringMinutes);
                }else{
                        printM = (printStringMinutes);
                }
// step 6: printing
        System.out.println(printH + ":" + printM);
    }
}