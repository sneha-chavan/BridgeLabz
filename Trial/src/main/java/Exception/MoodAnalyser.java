package Exception;

public class MoodAnalyser implements MoodInterface{

	@Override
	public String moodAnalyse(String input) throws MoodAnalysisException {
		try {
			if(input.contains("SAD"))
				return "SAD";
			else
				return "Happy";
			
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Please enter the proper message");
		}
		
	}
	

}
