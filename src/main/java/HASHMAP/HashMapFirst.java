package HASHMAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapFirst {

    public static void main(String[] args){
        try {

            Map mMap = new HashMap();
            mMap.put("PostgreSQL", "Free Open Source Enterprise Database");
            mMap.put("DB2", "Enterprise Database , It's expensive");
            mMap.put("Oracle", "Enterprise Database , It's expensive");
            mMap.put("MySQL", "Free Open SourceDatabase");

            Iterator iter = mMap.entrySet().iterator();

            while(iter.hasNext()){
                Map.Entry mEntry = (Map.Entry) iter.next();
                System.out.println(mEntry.getKey()+" : "+mEntry.getValue());
            }
            mMap.put("Oracle","Enterprise Database, Its Free Now!");
            System.out.println("One Day Oracle..: "+mMap.get("Oracle"));
        }catch(Exception e){

            System.out.println(e.getCause()+" "+e.toString());
        }
    }
}
