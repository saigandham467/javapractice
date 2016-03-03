package collectionFramework;
import java.util.*;


public class HashSetDemo {
	public static void main(String[] args){
		HashSet<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		hs.add("America");
		System.out.println("Hash set="+hs);
		Iterator<String> it=hs.iterator();
		System.out.println("Elements using Iterator");
		while(it.hasNext()){
			String s=it.next().toString();
			System.out.println(s);
		}
		for(String s:hs){
			System.out.println(s);
		}
		System.out.println(hs.contains("India"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
	}

}
