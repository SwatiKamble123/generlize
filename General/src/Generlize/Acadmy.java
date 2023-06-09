package Generlize;

public class Acadmy {

	public static void main(String[] args) {
	

		Sport game(int intrest) {
			if (intrest == 1) {
				return new Football();
			} else if (intrest == 2) {
				return new Hockey();
			} else if (intrest == 3) {
				return new Cricket();
		}else

		{
			return null;

		}

	}

	}

	
