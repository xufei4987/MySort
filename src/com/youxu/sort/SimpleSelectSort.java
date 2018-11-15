package com.youxu.sort;
/**
 * 简单选择排序是最简单直观的一种算法，
 * 基本思想为每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，
 * 直到所有元素排完为止，简单选择排序是不稳定排序
 * @author youxu
 *
 */
public class SimpleSelectSort {
	//数组内元素交换
	public static void swap(int[] arr, int a, int b) {
		if(a == b) {
			return;
		}
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
	//简单选择排序
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}

			swap(arr, i, min);

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
