import java.util.Scanner;
public class Number {
	
	int content;

	public void setContent (int content) {
		this.content =  content;
	}
	public int getContent(){
		return content;
	}
	public Number (int content){
		this.content = content;
	}

	public void multiplicationTable(){
		Scanner input = new Scanner(System.in);
		content = input.nextInt();
		for(int i = 1; i<=12;i++) {
			System.out.println(i + " * " + content + " = " + (i * content));


       }

	}
}