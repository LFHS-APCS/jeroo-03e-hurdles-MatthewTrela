import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test1_hurdles();
    }

    @Before
    public void setup() {

    }

    
    @Test
    public void test1_hurdles()
    {   
        Map.getInstance().loadMap("maps/hurdles1.jev");
        int w = Map.getInstance().getColumns();
        int h = Map.getInstance().getRows();
        Jeroo j1 = new Jeroo(h-1,  0, EAST, 90);
        j1.hurdles();

        assertTrue("should  be at (" + (h-1) + ",17)", Map.getInstance().isJeroo(h-1, 17));
        Map.getInstance().removeJeroo(j1);

    }

}

