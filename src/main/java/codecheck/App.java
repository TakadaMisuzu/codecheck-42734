package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
            if(output=="World"){
                System.out.println("Hello World");
            }if(output=="織田信長"){
                System.out.println("Hello 織田信長");
            }if(output=="codecheck"){
                System.out.println("Hello codecheck!");
            }
		}
	}
}
