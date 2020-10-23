package daily_java.day04;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Author QIAN-feng
 * @Date 2020/10/23
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] array2 = {"bbb", "aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        String str = "asv76agfqwdfvasdfvjh";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i>=0; i--){
            System.out.println(chars[i]+" ");
        }
    }
}
