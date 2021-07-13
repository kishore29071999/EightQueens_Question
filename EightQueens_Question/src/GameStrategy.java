public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		
		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
//		WRITE YOUR LOGIC HERE...............................

		if(numQueens==0)
		{
			placedQueens[row][col] = true;
			numQueens++;
			return isValid;
		}
		else
		{
			int flag = 1;
			for(int i=0;i<8;i++)
			{
				if((placedQueens[i][col] == true)||(placedQueens[row][i] == true))
				{
					isValid = false;
					return isValid;
				}
			}
			for(int i=row, j=col;(i>=0)&&(j>=0);i--,j--)
			{
				if(placedQueens[i][j] == true)
				{
					isValid = false;
					return isValid;
				}
			}
			for(int i=row, j=col;(i<8)&&(j<8);i++,j++)
			{
				if(placedQueens[i][j] == true)
				{
					isValid = false;
					return isValid;
				}
			}
			for(int i=row, j=col;(i>=0)&&(j<8);i--,j++)
			{
				if(placedQueens[i][j] == true)
				{
					isValid = false;
					return isValid;
				}
			}
			for(int i=row, j=col;(i<8)&&(j>=0);i++,j--)
			{
				if(placedQueens[i][j] == true)
				{
					isValid = false;
					return isValid;
				}
			}
			if(isValid)
			{
				//valid placement
				placedQueens[row][col] = true;
				numQueens++;
			}
			return isValid;
		}
		
		
//		return isValid;
	}
}














