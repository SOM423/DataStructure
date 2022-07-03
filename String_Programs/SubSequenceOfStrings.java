import java.util.List;

public class SubSequenceOfStrings {
	

	public static void main(String[] args) {

		findSubseq("abc", "");	
	}
	
	public static void findSubseq(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		findSubseq(str.substring(1), ans+str.charAt(0));
		
		findSubseq(str.substring(1), ans);
	}

}
