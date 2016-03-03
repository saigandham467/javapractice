package KMeans;

import java.util.ArrayList;
import java.util.Random;

public class random{
public static void main(String[] args){
ArrayList<Integer> numbers = new ArrayList<Integer>();   
Random randomGenerator = new Random();
while (numbers.size() < 4) {

    int random = randomGenerator .nextInt(4);
    if (!numbers.contains(random)) {
        numbers.add(random);
        
    }
}
System.out.println(numbers);
}}