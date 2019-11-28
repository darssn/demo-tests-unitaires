import static org.junit.Assert.*;

import org.junit.Test;

import dev.utils.StringUtils;

public class StringUtilsTest {

	@Test

	public void testFunct() {

		int result = StringUtils.levenshteinDistance("oki", "ok");

		assertEquals("Le resultat est bon", 1, result);

	}
	@Test
	public void testFunctEspace() {

		int result = StringUtils.levenshteinDistance("oki       ", "ok");

		assertEquals("Le resultat est bon", 1, result);

	}
	@Test
	
	public void testFunctNull() {

		int result = StringUtils.levenshteinDistance(null, "ok");

		assertEquals("Le resultat est bon", 0, result);

	}

}
