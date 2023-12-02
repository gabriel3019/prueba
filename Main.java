public class Main{
	public static void main(String[] args){
	int suma =0;

	for(int i = 0; i <args.length;i++){
	suma += Integer.parseInt(args[i]);
		}
		System.out.println("La suma es: "+ suma);
	}
}
