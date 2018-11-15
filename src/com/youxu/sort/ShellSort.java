package com.youxu.sort;
/**
 * 希尔排序(快速排序)是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止。
 * @author youxu
 *
 */
public class ShellSort {
	//数组内元素交换
	public static void swap(int[] arr, int a, int b) {
		if(a == b) {
			return;
		}
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
	
	public static void sort(int[] arr) {
		//计算每次间隔gap
		for(int gap = arr.length/2; gap > 0; gap = gap/2) {
			//将以gap间隔形成一组的数据进行插入排序
			for(int i = gap; i < arr.length; i++) {
				int j = i;
				while(j-gap >= 0 && arr[j] < arr[j-gap]) {
					swap(arr, j, j-gap);
					j = j-gap;
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
