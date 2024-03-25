import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTesting {

	JenkinsTester tester;
	
	@BeforeEach
	void instantiate() {
		tester = new JenkinsTester();
	}
	
	@Test
	void testAdd() {
		assertEquals(1, tester.add(1,0));
	}
	
	@Test
	void testMultiply() {
		assertEquals(0, tester.multiply(1, 0));
	}
	
	@Test
	void testSubtract() {
		assertEquals(1, tester.subtract(2, 1));
	}

}
