public class ComparerJoueurs {

	public static void main(String[] args) {
		
		Joueur jr1 = new Joueur( 28 , "Rollois" , "France" , 30 ) ;
		Joueur jr2 = new Joueur( 28 , "Rollois" , "France" , 30 ) ;
		
		System.out.println( "Premier joueur : " + jr1 ) ;
		System.out.println( "Second joueur  : " + jr2 ) ;
		
		System.out.println( "\n\n\n---- Comparaison avec l'opérateur == ----\n" ) ;
		
		if( jr1 == jr2 ){
			System.out.println( "Joueurs identiques" ) ;
		}
		else {
			System.out.println( "Joueurs différents" ) ;
		}
		
		System.out.println( "\n\n\n---- Comparaison avec la méthode equals() ----\n" ) ;
		
		if( jr1.equals( jr2 ) ){
			System.out.println( "Joueurs identiques" ) ;
		}
		else {
			System.out.println( "Joueurs différents" ) ;
		}

	}

}
