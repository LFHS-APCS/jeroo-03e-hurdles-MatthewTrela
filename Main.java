/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int num = r.nextInt(5) + 1;
        Map.getInstance().loadMap("maps/hurdles" + num + ".jev");

        new JerooGUI();
        Main m = new Main();
        m.runJerooCode();

    }

    /**
     * You can change which tests you are running here.
     */
    public void runJerooCode() {
        Jeroo j1 = new Jeroo(23,  0, EAST, 90);
        j1.hurdles();
        
 
    }

}
