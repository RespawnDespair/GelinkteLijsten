package GelinkteLijsten;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jelle
 */
public class WachtrijTest {
    
    public WachtrijTest() {
    }

    /**
     * Test of enqueue method, of class Wachtrij.
     */
    @Test
    public void testEnqueue() {
        System.out.println("testEnqueue");
        Wachtrij instance = new Wachtrij();
        
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(2);
        Integer obj3 = new Integer(3);
        
        instance.enqueue(obj3);
        instance.enqueue(obj2);
        instance.enqueue(obj);
        
        assertEquals(obj3, instance.front());
    }
    
    @Test
    public void testEnqueueDequeue() {
        System.out.println("testEnqueueDequeue");
        Wachtrij instance = new Wachtrij();
        
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(2);
        Integer obj3 = new Integer(3);
        
        instance.enqueue(obj3);
        instance.enqueue(obj);
        instance.enqueue(obj2);        
        
        assertEquals(obj3, instance.front());
        instance.dequeue();
        assertEquals(obj, instance.front());
    }
}