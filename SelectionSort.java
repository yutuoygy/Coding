public class Solution {
  public int[] solve(int a[]) {
    if (a.length == 0 || a == null){
      return a;
    }
    
    int global, temp;
      for (int i = 0; i < a.length-1; i++) {
        global = i;
        for (int j = i+1; j< a.length; j++) {
          if (a[j] < a[global]) {
            global = j;
          }
        }
        temp = a[i];
        a[i] = a[global];
        a[global]=temp;
    }
    return a;
  }
}
