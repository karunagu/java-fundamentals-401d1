
public class ArrayReverse {
  public static void main(String[] args) {
        int[] srcArray = {4,73,810,1,110};
        printArray(srcArray, "Before Reverse");
        reverseArray(srcArray);
        printArray(srcArray,"After Reverse");
  }
  public static void reverseArray(int[] revArray) {
        int length = revArray.length;
        for (int i=0;i<(length/2);i++) {
          int swapElement = revArray[i];              // Store the element to be swapped
          revArray[i] = revArray[(length-1)-i];       
          revArray[(length-1)-i] = swapElement;      
        }
  }
  public static void printArray(int[] prtArray, String msg) {
        System.out.println(msg);
        for (int i=0;i<prtArray.length;i++) {
          System.out.println(prtArray[i]);
        }
  }
}
