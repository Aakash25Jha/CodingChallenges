package challenges;
public class ChallengeByRajat {
	public static void main(String[] args) 
	{	
		int a,b,c,d;
		int[] arr={4,3,7,6,9,1,2}; //Expected{2,3,9,6,7,1,4}
		b=arr.length-1;
		for(a=0;a<arr.length/2;a++)
		{
			if(a%2==0 && b%2==0)
			{
				c=arr[a];
				arr[a]=arr[b];
				arr[b]=c;
			}
			b--;
		}
		for(d=0;d<arr.length;d++)
		{
		System.out.print(arr[d]+",");
		}
	}
}
