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
		assertEquals(Welcome.affichage("bob"),"Hello,bob");
	}
	
	void test2() {
		assertEquals(Welcome.affichage(" "),"Hello, my friend");
		assertEquals(Welcome.affichage("bob"),"Hello,Bob");
		assertEquals(Welcome.affichage("  "),"Hello, my friend");
	}
	
	void test3() {
		assertEquals(Welcome.affichage("JERRY"),"HELLO, JERRY");
	}
	
	void test4() {
		assertEquals(Welcome.affichage("Amy,Bob"),"Hello, Amy, Bob”");
		
	}
	void test5() {
		assertEquals(Welcome.affichage("Amy,Bob,Jerry"),"Hello, Amy, Bob, Jerry”");
		assertEquals(Welcome.affichage("Amy,Bob,Jerry,Tom,Bambi"),"Hello, Amy, Bob, Jerry, Tom, Bambi");
	}
	void test6() {
		assertEquals(Welcome.affichage("Amy, BOB, Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.affichage("Amy, BOB, TOM, Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB, TOM !");
	}
	void test7() {
		assertEquals(Welcome.affichage("Bob, Amy, Jerry"),"Hello, Amy and Jerry!");
		assertEquals(Welcome.affichage("Bob, AMY, Jerry, JACK"),"Hello, bob and jerry AND HELLO AMY AND JACK !");
		assertEquals(Welcome.affichage("Bob, AMY, Jerry, JACK, TOM, Aminata"),"Hello, bob,jerry and Aminata. AND HELLO AMY AND JACK AND TOM !");
	}
	void test8() {
		assertEquals(Welcome.affichage("Bob , Amy    "),"“Hello, Bob and Amy");
		assertEquals(Welcome.affichage("Bob, AMY,         Jerry,       JACK, TOM,       Aminata"),"Hello, bob,jerry and Aminata. AND HELLO AMY AND JACK AND TOM !");

	}
}
