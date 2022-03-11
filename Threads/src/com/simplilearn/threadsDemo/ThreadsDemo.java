package com.simplilearn.threadsDemo;

public class ThreadsDemo extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadsDemo mt = new  ThreadsDemo();
  		mt.start();
 	}
}