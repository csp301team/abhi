public class vgy
{
	public static int mi(int a,int b){
		int y=0;
		if(a<=b){
			y=a;
		}else{
			y=b;
		}return y;
	}
	public static void doo(int[][] g){
		for(int k=0;k<g.length;k++){
			for(int i=0;i<g.length;i++){
				for(int j=0;j<g.length;j++){
					
						g[i][j]=mi((g[i][k]+g[k][j]),(g[i][j]));
				
						
					
				}
			}
		}
	}
	public static void main(String[]args){
		int[][] h={{0,999,1},{999,0,1},{1,1,0}};
		doo(h);
		//System.out.println(mi(1,2));

		System.out.print(h[0][1]);
	}
}