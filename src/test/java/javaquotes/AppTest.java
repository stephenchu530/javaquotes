/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaquotes;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasQuotes() {
        App classUnderTest = new App();
        assertNotNull("Should not be null", classUnderTest.getQuote());
    }
}
