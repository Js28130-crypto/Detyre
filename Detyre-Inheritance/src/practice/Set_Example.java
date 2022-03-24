package practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {
    public static void main(String[] args) {
        //set denostration using hashSet

        Set<String>hash_set=new HashSet<String>();
        hash_set.add("Geeks");
        hash_set.add("For");
        hash_set.add("Geeks");
        hash_set.add("Example");
        hash_set.add("Set");
        System.out.println("Set output without the duplicates");
        System.out.println(hash_set);

        System.out.println("Sorted after passing into treeSet");

        Set<String>tree_set=new TreeSet<String>(hash_set);
        System.out.println(tree_set);
    }
}
