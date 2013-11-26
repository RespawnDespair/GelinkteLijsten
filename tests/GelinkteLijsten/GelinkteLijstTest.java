package GelinkteLijsten;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jelle
 */
public class GelinkteLijstTest {
    
    public GelinkteLijstTest() {
    }
    
    /**
     * Test of getFirst method, of class GelinkteLijst.
     */
    @Test
    public void AddItemAanLijst() {
        System.out.println("AddItemAanLijst");
        GelinkteLijst instance = new GelinkteLijst();
        Integer obj = new Integer(1);
        
        instance.insertFirst(obj);
        
        assertEquals(obj, instance.getFirst());
    }
    
    @Test
    public void AddMeerdereItemsAanLijst() {
        System.out.println("AddMeerdereItemsAanLijst");
        GelinkteLijst instance = new GelinkteLijst();
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        
        instance.insertLast(obj);
        instance.insertLast(obj2);
        instance.insertLast(obj3);
        
        assertEquals(obj, instance.getFirst());
        assertEquals(obj3, instance.getLast());
    }  

    @Test
    public void AddMeerdereItemsBeforeAndAfter() {
        System.out.println("AddMeerdereItemsBefore");
        GelinkteLijst instance = new GelinkteLijst();
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        
        instance.insertFirst(obj);
        instance.insertBefore(obj2, obj);
        instance.insertAfter(obj3, obj);
        
        assertEquals(obj2, instance.getFirst());
        assertEquals(obj3, instance.getLast());
    }  
    
    @Test
    public void RemoveTest1() {
        System.out.println("RemoveTest1");
        GelinkteLijst instance = new GelinkteLijst();
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        
        instance.insertFirst(obj);
        instance.insertLast(obj2);
        instance.insertLast(obj3);
        
        instance.remove(obj3);
        assertEquals(obj2, instance.getLast());
    }  
    
    @Test
    public void RemoveTest2() {
        System.out.println("RemoveTest2");
        GelinkteLijst instance = new GelinkteLijst();
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        
        instance.insertFirst(obj);
        instance.insertLast(obj2);
        instance.insertLast(obj3);
        
        instance.remove(obj);
        assertEquals(obj2, instance.getFirst());
    }  
    
    @Test
    public void RemoveTest3() {
        System.out.println("RemoveTest3");
        GelinkteLijst instance = new GelinkteLijst();
        Integer obj = new Integer(1);
        Integer obj2 = new Integer(1);
        Integer obj3 = new Integer(1);
        
        instance.insertFirst(obj);
        instance.insertLast(obj2);
        instance.insertLast(obj3);
        
        instance.remove(obj2);
        assertEquals(obj, instance.getFirst());
        assertEquals(obj3, instance.getFirst());
    } 

}