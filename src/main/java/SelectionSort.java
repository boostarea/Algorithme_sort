import java.util.Arrays;

/**
 * @Description 选择排序
 * @Author ooooor
 * @Date 2018/11/28 10:14 PM
 **/
public class SelectionSort {

    /**
     * 原地、不稳定排序
     * 插入排序变异版
     * 时间复杂度： 最好、最坏、平均：O(n^2)
     * @param args
     */
    public static void main(String[] args) {
        int[] data = new int[]{4, 6, 5, 3, 1, 2};

        for (int i=0; i<data.length; i++) {
            int value = data[i];
            int min = i;
            //未排序区找出最小元素
            for (int j=i; j<data.length; j++) {
                if (value > data[j]) {
                    min =j;
                    value=data[j];
                }
            }
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;
        }
        System.out.println(Arrays.toString(data));
    }
}
