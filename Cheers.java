public class Cheers {
        public static void main(String[] args) {
//step 1: recieving name and times to cheer
        String name1 = (args[0]);
        int times1 = Integer.parseInt(args[1]);
// step 2: convertig name1 to capital letters and converting times1 to int
        String name2 = name1.toUpperCase ();
        String anLetters = "AEFHILMNORSX";
// step 3: breaking down name2 to letters
                for (int i = 0; i < name2.length(); i++){
                char letter2 = name2.charAt(i);
// step 4: distinguishing between "a" and "an", and printing first part
                        if (anLetters.indexOf(letter2) != -1){
                        System.out.println("Give me an " + letter2 + ":" + " " + letter2 + "!");
                                }
                                else{
                        System.out.println("Give me a  " + letter2 + ":" + " " + letter2 + "!");
                                }
                }
        System.out.println("What does that spell?");
                                        for (int i = 0; i < times1; i++){
                                        System.out.println(name2 + "!!!");
                                        }
                                }
        }