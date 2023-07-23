import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    }
    public static void task1() {
        System.out.println("task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for ( Integer i = 0;i<nums.size();i++){
            if(nums.get(i)%2==1){
                System.out.println(nums.get(i));
            }


        }
    }
    public static void task2() {
        System.out.println("task 2");
        List<Integer> num = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        int prevNum = Integer.MIN_VALUE;
        for ( Integer i = 0;i<num.size();i++){
            if(num.get(i)%2==0 && num.get(i) != prevNum) {

                System.out.println(num.get(i));
                prevNum=num.get(i);
            }


        }
    }
    public static void task3() {
        System.out.println("task 3");
        Set<String> animals =new HashSet<>(List.of("cat","cut","kit","kit"));
        System.out.println(animals);


    }
    public static void task4() {
        System.out.println("task 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String>answer = new HashSet<>(strings);
        Collections.sort(strings);
        System.out.println(strings.size() - answer.size());


    }
}