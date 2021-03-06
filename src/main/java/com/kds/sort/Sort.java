package com.kds.sort;

import edu.princeton.cs.algs4.StdOut;

public class Sort {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public    static void show(Comparable[] a){
        for(Comparable i:a){
            StdOut.print(i+" ");
        }
    }
    public static boolean isSorted(Comparable[] a){
        for(int i=0;i<a.length;i++)
            if(less(a[i],a[i-1]))
                return false;
        return true;
    }
}
