package controllers;

import models.Array;

public class SearchMethod {
    public int linearSearch(Array a, int n) {
        for (int i = 0; i < a.getSize(); i++) {
            if (a.getArray()[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public int binarySearch(Array a, int n) {
        int[] arr = a.getArray();
        
        if (!isSorted(arr)) {
            return -2;
        }
        
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // kiểm tra xem x có ở chính giữa không
            if (arr[m] == n)
                return m;

            // Nếu x lớn hơn, bỏ qua nửa bên trái
            if (arr[m] < n)
                l = m + 1;

            // Nếu x nhỏ hơn, bỏ qua nửa bên phải
            else
                r = m - 1;
        }

        // phần tử không tồn tại
        return -1;
    }
    
    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
