package com.oocl.dasmamo.sw;


public class Deadlock {
	 static Boolean lock1 = true;
	 static Boolean lock2 = false;
	public Deadlock() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
	}
	
	private static class ThreadDemo1 extends Thread{
		public void run() {
			synchronized(lock1) {
				System.out.println("Thread 1: Holding Lock 1...");
				try {
					Thread.sleep(10);
				}catch(InterruptedException e) {
					
				}
				System.out.println("Thread 1: Waiting for lock2...");
				synchronized(lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}
	
	private static class ThreadDemo2 extends Thread{
		public void run() {
			synchronized(lock1) {
				System.out.println("Thread 2: Holding Lock 2...");
				try {
					Thread.sleep(10);
				}catch(InterruptedException e) {
					
				}
				System.out.println("Thread 2: Waiting for lock1...");
				synchronized(lock2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}

