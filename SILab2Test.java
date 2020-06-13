import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.junit.Assert.*;

public class SILab2Test {

     private List<String> createList(String... elems){
         return new ArrayList<>(Arrays.asList(elems));
        }

     @Test
    boolean everyPath()
     {
         RuntimeException ex;
         //1,2,3,4,26
         ex= assertArrayEquals(RuntimeException.class, ()-> SILab2.function(null,"covek1"));
         assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

         //1,5,6,7,8,24,26
         ex= assert(RuntimeException.class, ()-> SILab2.function("covek1","covek1"));
         assertTrue(ex.getMessage().contains("User already exists!"));

         //1,5,9,10,11,23,24,26

     }
     @Test
    void everyStatement()
     {
         RuntimeException ex;

         ex= assertThrows(RuntimeException.class, ()-> SILab2.function(null,"covek1"));
         assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

         ex= assertThrows(RuntimeException.class, ()-> SILab2.function("covek1","covek1"));
         assertTrue(ex.getMessage().contains("User already exists!"));


     }
}