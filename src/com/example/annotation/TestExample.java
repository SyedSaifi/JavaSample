package com.example.annotation;

import com.example.annotation.TesterInfo.Priority;

@TesterInfo(createdBy="ssyed.com",
			lastModified="14/01/2015",
			tags={"test","unit"},
			priority=Priority.HIGH)
public class TestExample {
	
		@TestMethod
		void testA() {
		  if (true)
			throw new RuntimeException("This test always failed");
		}
	 
		@TestMethod(enabled=false)
		void testB() {
		  if (false)
			throw new RuntimeException("This test always passed");
		}
	 
		@TestMethod(enabled = true)
		void testC() {
		  if (10 > 1) {
			// do nothing, this test always passed.
		  }
		}
}
