package com.example.pattern.ObserverDesignPattern;


/*Observer pattern is used when there is one to many relationship between objects such as if one object is modified, 
 * its depenedent objects are to be notified automatically.
 * Observer pattern uses three actor classes. Subject, Observer and Client. Subject, 
 * an object having methods to attach and de-attach observers to a client object.
 * Java Message Service (JMS) uses Observer pattern
 */
public class ObserverPatternDemo {
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}