public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
//		System.out.println("Square: "+square);
		int mod8 = square/8;
		mod8 = mod8 % 2;
		
		int mod2 = square%2;
		
		if((mod8==0)&&(mod2==0))
			return false;
		else if((mod8==1)&&(mod2==1))
			return false;
		else
			return true;
	}
}
