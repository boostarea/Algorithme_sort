import java.util.Arrays;

/**
 * @Description 插入排序
 * @Author ooooor
 * @Date 2018/11/27 10:37 PM
 **/
public class InsertionSort {

    /**
     * 原地、稳定排序算法
     * 时间复杂度： 最好O(n) 最坏O(n^2) 平均时间复杂度： 相当于在数组中插入一个数据(O(n))，执行n遍： O(n^2)
     * @param args
     */
    public static void main(String[] args) {
        int[] data = new int[]{4, 6, 5, 3, 1, 2};
        fromEndToStart(Arrays.copyOf(data, data.length));
        fromStartToEnd(Arrays.copyOf(data, data.length));
    }

    private static void fromStartToEnd(int[] data) {
        for (int i=1; i < data.length; i++) {
            int value = data[i];

            int j=0;
            int insertIndex=i;
            for (; j < i; j++) {
                if(value >= data[j]) {
                    break;
                }
                insertIndex = insertIndex > j ? j : insertIndex;
                data[j+1]=data[j];
            }
            data[insertIndex]=value;
        }
        System.out.println(Arrays.toString(data));
    }

    private static void fromEndToStart(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int value = data[i];    // 参与比较的元素

            // 已排序区
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value >= data[j]) {
                    break;
                }
                // tip: 数组移动交换， value被暂存，直到找到插入位置
                data[j + 1] = data[j];
            }
            data[j + 1] = value;
        }
        System.out.println(Arrays.toString(data));
    }
}
