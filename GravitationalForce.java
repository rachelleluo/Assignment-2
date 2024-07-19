//test values 135.0 260.0 10.5
public class GravitationalForce{
    public static void main(String[] args){
        //take in args as doubles
        //Double.parseDouble(args[0]), etc.
        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double g = 6.6743e-11;

        /*DO NOT DISPLAY ANYTHING BESIDES THE FINAL RESULT VALUE, if there is an error (r = 0.0),
        then just terminate the program*/
        if(r != 0.0){
            double F = g * (m1 * m2) / (r * r);
            System.out.println(F);
        }

    }
}