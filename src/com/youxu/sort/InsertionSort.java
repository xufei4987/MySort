package com.youxu.sort;
/**
 * 直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
 * @author youxu
 *
 */
public class InsertionSort {

	//数组内元素交换
	public static void swap(int[] arr, int a, int b) {
		if(a == b) {
			return;
		}
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
	
	//直接插入排序
	public static void sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j] < arr[j-1]) {
				swap(arr, j, j-1);
				j--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {201,233,111,115,22,11,55};
		sort(arr); 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
