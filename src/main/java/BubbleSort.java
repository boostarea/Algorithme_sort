import java.util.Arrays;

/**
 * @Description 冒泡排序
 * @Author ooooor
 * @Date 2018/11/26 11:10 PM
 **/
public class BubbleSort {

    /**
     * 原地、稳定排序算法
     * 时间复杂度： 最好O(n) 最坏O(n^2)
     * 平均时间复杂度： 逆序度=满有序度-有序度， 最坏情况，需要进行n*(n-1)/2次交换， 平均n*(n-1)/4, 上限为O(n^2)
     * @param args
     */
    public static void main(String[] args) {

        int[] data = new int[]{4, 6, 5, 3, 1, 2};
        int temp;
        boolean isChanged = false;
        // 冒泡次数
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data.length-i-1; j++) {

                if (data[j]>data[j+1]) {
                    temp=data[j+1];
                    data[j+1]=data[j];
                    data[j]=temp;
                    isChanged=true;
                }
            }
            if (!isChanged) {
                break;
            }
        }
        System.out.println(Arrays.toString(data));


    }
}
