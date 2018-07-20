package javase01.itcast20;

import java.util.Arrays;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/9 14:53
 * @since JDK 1.8
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = {11, 33, 44, 66, 88,77,22};
//        System.out.println(Arrays.toString(a));
        // 排序。
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // 调用binarySearch()方法前要先调用sort方法对数组进行排序
        // 进行十分查找。
        // 注：这里面不能看 原数组，要看排序后的哪个数组
        int binarySearch = Arrays.binarySearch(a, 88);
        System.out.println("binarSearch: " + binarySearch);

    }
}
