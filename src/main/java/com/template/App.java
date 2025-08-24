package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        if(number % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if(a > b){
            return a;
        } else{
            return b;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        StringBuilder sb = new StringBuilder(input).reverse();
        return sb.toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        if(number > 1){
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    return false;
                }
            }
        } else{
            return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min >= array[i]){
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int result = 0;
        for(int i = 0; i< array.length; i++){
            result += array[i];
        }
        return result;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return  celsius * 9/5 + 32;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        // TODO: Implement this method
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        // TODO: Implement this method
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        // Aun no vimos exceptions en Java pero por alguna razon si no incluyo la exception el testeo me tira error.
        int max = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(max <= list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        // TODO: Implement this method
        List<Integer> odd = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                odd.add(list.get(i));
            }
        }
        return odd;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        // TODO: Implement this method
        List<String> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);
        return resultList;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        // TODO: Implement this method
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(element)){
                return true;
            }
        }
        return false;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        // TODO: Implement this method
        List<String> upperList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            upperList.add(list.get(i).toUpperCase());
        }
        return upperList;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        // TODO: Implement this method
        Set<Integer> noDupSet = new HashSet<>(list);
        return  new ArrayList<>(noDupSet);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        // TODO: Implement this method
        return new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        // TODO: Implement this method
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        // TODO: Implement this method
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        // TODO: Implement this method
        List<String> mapList = new ArrayList<>();
        for(String i :  map.keySet()){
            mapList.add(i + " -> " + map.get(i));
        }
        return mapList;
    }
}
