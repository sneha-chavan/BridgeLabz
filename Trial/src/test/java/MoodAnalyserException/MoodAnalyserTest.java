package MoodAnalyserException;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import Exception.MoodAnalyser;
import Exception.MoodAnalysisException;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MoodAnalyserTest {
	@Test
	public void checkIfHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			String result = moodAnalyser.moodAnalyse(null);
			Assert.assertEquals("HAPPY", result);

		}
		catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		
	}

}
