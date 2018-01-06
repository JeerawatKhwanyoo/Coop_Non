import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Map  m = new HashMap();
        
       m.put("AA","ABC");
       m.put("AB","ABCD");

       for (Object key : m.keySet()) {
        System.out.println(key.toString() +"  " + m.get(key));
          
       
    }
          
              

    }

}

