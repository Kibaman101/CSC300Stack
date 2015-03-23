
public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		Stack theStack = new Stack();
		theStack.push(10);
		theStack.push(3);
		theStack.push(7);
		theStack.push(13);
		theStack.push(4);
		System.out.println(theStack.peek());
	}
}
