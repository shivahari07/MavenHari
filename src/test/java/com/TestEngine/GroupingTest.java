package com.TestEngine;

import org.testng.annotations.Test;

public class GroupingTest {
	
@Test(dependsOnMethods = "Kholi", groups = "cricket")
private void Sachin() {
System.out.println("100");
}
	
@Test(groups = "cricket")
private void Kholi() {
System.out.println("200");
}
	
@Test(dependsOnMethods = "Kamal", groups = "Actor")
private void Suriya() {
System.out.println("Ayan");
}

@Test(groups = "Actor")
private void Kamal() {
System.out.println("Vikram");
}
@Test(groups = "Actress")
private void Nikhila() {
System.out.println("JOJO");
}
@Test(dependsOnMethods = "Nikhila", groups = "Actress")
private void Sam() {
System.out.println("24");
}
}
