public class RechercherJoueur {

	public static void main(String[] args) {

		List<Joueur> lesJoueurs = new ArrayList<Joueur>() ;
		
		lesJoueurs.add( new Joueur( 25 , "Camille" , "France" , 372 ) ) ;
		lesJoueurs.add( new Joueur( 27 , "Kévin" , "France" , 108 ) ) ;
		lesJoueurs.add( new Joueur( 30 , "Sébastien" , "France" , 10 ) ) ;
		lesJoueurs.add( new Joueur( 31 , "Lisa" , "Algérie" , 208 ) ) ;
		lesJoueurs.add( new Joueur( 100 , "Alexis" , "France" , 243 ) ) ;
		lesJoueurs.add( new Joueur( 101 , "Nicolas" , "France" , 718 ) ) ;
		lesJoueurs.add( new Joueur( 102 , "Florian" , "France" , 529 ) ) ;
		lesJoueurs.add( new Joueur( 103 , "Hamza" , "Maroc" , 572 ) ) ;
		lesJoueurs.add( new Joueur( 104 , "Aïcha" , "Maroc" , 328 ) ) ;
		lesJoueurs.add( new Joueur( 105 , "Ilona" , "Norvège" , 254 ) ) ;
		lesJoueurs.add( new Joueur( 107 , "Georges" , "France" , 212 ) ) ;
		lesJoueurs.add( new Joueur( 108 , "Cody" , "France" , 925 ) ) ;
		lesJoueurs.add( new Joueur( 109 , "Vincent" , "France" , 482 ) ) ;
		lesJoueurs.add( new Joueur( 111 , "Thomas" , "France" , 528 ) ) ;

		System.out.println( "\n\n---- Liste non triée des joueurs ----\n\n" ) ;
		
		for( Joueur unJoueur : lesJoueurs ){
			System.out.println( "\t- " + unJoueur ) ;
		}
		
		Joueur leJoueurRecherche = new Joueur( 100 , "Alexis" , "France" ) ;
		System.out.println( "\nIndice du joueur n°100 dans la liste : " + lesJoueurs.indexOf( leJoueurRecherche ) );
		

	}

}
