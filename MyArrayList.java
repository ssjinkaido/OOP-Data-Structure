import java.io.*;
import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr
                = new ArrayList<String>();
        arr.add("Tung");
        arr.add("Huyen");
        arr.add("Quan");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        arr.add("Quang Anh");
        arr.add("Chinh");
        arr.remove(1);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        arr.remove("Chinh");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
