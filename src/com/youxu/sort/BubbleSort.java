package com.youxu.sort;
/**
 * 冒泡排序的基本思想是，对相邻的元素进行两两比较，顺序相反则进行交换，这样每一趟会将最小或最大的元素“浮”到顶端，最终达到完全有序
 * @author youxu
 *
 */
public class BubbleSort {
	//数组内元素交换
	public static void swap(int[] arr, int a, int b) {
		if(a == b) {
			return;
		}
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
	
	//冒泡排序
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
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
