package com.exilant.day1;

public class LambdaThread04 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi i m from Anonymous call  start");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(" Anonymous end");
				
			}
		}).start();
		
		///////////////////////Lambda Based///////////////
		
		new Thread(()->{
			System.out.println("Hi i m from Lambda");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("lambda end");
			}).start();
	}

}
