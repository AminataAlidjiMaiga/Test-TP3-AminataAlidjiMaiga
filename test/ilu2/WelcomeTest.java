package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {


	@BeforeEach
	public void initialisation()
	{
		System.out.println("Lancement des tests");

	}
	
	@Test
	void test1() {
		assertEquals(Welcome.welcome("bob"),"Hello,Bob");
	}
	@Test
	void test2() {
		assertEquals(Welcome.welcome(" "),"Hello, my friend");
		assertEquals(Welcome.welcome("  "),"Hello, my friend");
	}

	@Test
	void test3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO,JERRY !");
	}

	@Test
	void test4() {
		assertEquals(Welcome.welcome("Amy,Bob"),"Hello,Amy,Bob");
		assertEquals(Welcome.welcome("amy,bob"),"Hello,Amy,Bob");
	}
	/*@Test
	void test5() {
		assertEquals(Welcome.welcome("Amy,bob,Jerry"),"Hello,Amy,Bob,Jerry");
		assertEquals(Welcome.welcome("amy,Bob,jerry,Tom,bambi"),"Hello,Amy,Bob,Jerry,Tom,Bambi");
		System.out.println("Test 5 OK");
	}*/

	////Test 5 en contradiction avec le test 7

	@Test
	void test6() {
		assertEquals(Welcome.welcome("Amy,BOB,Jerry"),"Hello,Amy,Jerry.AND HELLO,BOB !");
	}
	
	
	@Test
	void test7() {
		assertEquals(Welcome.welcome("bob,amy,jerry"),"Hello,Bob,Amy and Jerry");
		assertEquals(Welcome.welcome("Bob,AMY,Jerry,JACK"),"Hello,Bob and Jerry.AND HELLO,AMY AND JACK !");
		assertEquals(Welcome.welcome("Bob,AMY,Jerry,JACK,TOM,Aminata"),"Hello,Bob,Jerry and Aminata.AND HELLO,AMY,JACK AND TOM !");
	}
}
