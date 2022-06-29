import java.util.HashSet;

public class FirstRepeatedWordInString {

	public static void main(String[] args) {

		String u
	      = "Ravi  been saying that he had been there";
		solve(u);
	}

	public static void solve(String s)
	{
		String str="";
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				str +=s.charAt(i);
			}
			
			else
			{
				if(hs.contains(str))
				{
					if(str=="")
						System.out.println("Not Found");
					else
					System.out.print(str); 
				}
				else
				{
					hs.add(str);
					str="";
				}
			}
			
		}
		
	}
}
