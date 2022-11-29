package Practice;

public class Continue_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 20, i = 0;
		while (i < limit) 
		{
			i++;
			if (i % 3 == 0)
				continue;
		}

		System.out.print(+i);
	}

}
