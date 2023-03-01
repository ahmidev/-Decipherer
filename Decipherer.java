class Decipherer {
	public static String decryptMessage(String message){
		//Calcule la longueur de la chaîne et divise-la par 2, tu obtiendras ainsi le "chiffre-clé".
		int keyNumber = message.length() / 2;
	
		//Récupère ensuite la sous-chaîne de la longueur du chiffre-clé, en commençant à partir du 6ème caractère.
		String substringMessage = message.substring(6, keyNumber+5);
		
		
		
		//Remplace les chaînes '@#?' par un espace.
		String newMessage = substringMessage.replace("@#?", "");
		
		
		//Pour finir, inverse la chaîne de caractères.
		StringBuilder sb = new StringBuilder(newMessage);
		sb.reverse();
		
		String reverseMessage = sb.toString();
		
		return reverseMessage ; 

	}
	public static void main(String[] args) {
	
	System.out.println(decryptMessage("0@sn9sirppa@#?ia'jgtvryko1"));
	System.out.println(decryptMessage("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
	System.out.println(decryptMessage("aopi?sedohtém@#?sedhtmg+p9l!"));
	
	}





}
