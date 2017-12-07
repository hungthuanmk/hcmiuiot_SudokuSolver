package club.hcmiuiot.sudokusolver;

public class Algorithm {
	private static int _len = 9;
	private int matrix[][];
	
	public static int get_len() {
		return _len;
	}

	public static void set_len(int _len) {
		Algorithm._len = _len;
	}

	private int feasible(int S[][], int x, int y, int k) {
		int i = 0, j = 0;
	    for(i = 0; i <9 ; i++) {
	        if(S[x][i] == k) return 0;
	    }
	    
	    for(i = 0; i <9 ; i++) {
	            if(S[i][y] == k) return 0;
	        }
	    int a = x/3, b = y/3;
	    for(i = 3*a; i < 3*a+3; i++) {
	        for(j = 3*b; j < 3*b+3; j++) {
	            if(S[i][j] == k) return 0;
	        }
	    }
	    return 1;	
	}
}
