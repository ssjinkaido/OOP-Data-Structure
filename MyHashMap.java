import java.util.HashMap;// Import the HashMap class
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, String> family = new HashMap<String, String>();//Creating HasMap
        family.put("father", "Hien");//Put elements in Map
        family.put("mother", "Khanh");
        family.put("daughter", "Uyen");
        family.put("son", "Chinh");
        System.out.println(family);
        //{mother=Khanh, son=Chinh, father=Hien, daughter=Uyen}
        System.out.println(family.get("father"));//get the value of key "father"
        //Hien
        for (Map.Entry m : family.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //mother Khanh
        //son Chinh
        //father Hien
        //daughter Uyen

        family.put("son", "Quang Anh");
        for (Map.Entry m : family.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //mother Khanh
        //son Quang Anh
        //father Hien
        //daughter Uyen

        family.remove("son", "Quang Anh");
        for (Map.Entry m : family.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //mother Khanh
        //father Hien
        //daughter Uyen

        family.remove("mother");
        for (Map.Entry m : family.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //father Hien
        //daughter Uyen
    }
}
