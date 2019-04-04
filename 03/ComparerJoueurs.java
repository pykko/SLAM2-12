public class ComparerJoueurs {

	public static void main(String[] args) {
		
		Joueur jr1 = new Joueur( 11 , "Anaïs" , "Canada" , 293 ) ;
		Joueur jr2 = new Joueur( 22 , "Amandine" , "France" , 182 ) ;
		
		int resComp = jr1.compareTo( jr2 ) ;
		
		switch( resComp ){
		
			case 0 :
				System.out.println( jr1.getNom() + " et " + jr2.getNom() + " ont remporté le même nombre de victoires." ) ;
				break ;
				
			case 1 :
				System.out.println( jr1.getNom() + " est meilleure qu'" + jr2.getNom() ) ;
				break ;
				
			case -1 :
				System.out.println( jr2.getNom( + " est meilleure qu'" + jr1.getNom( ) ;
				break ;
				
				
			default :
				System.out.println( "Résultat pas du tout prévu :(" ) ;
		
		}

	}

}
