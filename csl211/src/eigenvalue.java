import java.util.LinkedList;

public class eigenvalue{
	public static double max(double[] g){
		double y=0;
		for(int i=0;i<g.length;i++){
			if(y<g[i]){y=g[i];}
		}return y;
	}
	public static LinkedList<Integer> adj(int[][] g,int i){
		LinkedList l=new LinkedList();
		for(int h=0;h<g.length;h++){
			if(g[i][h]==1){
				l.add(h);
			}
		}
		return l;
	}
	int[][] g={{1,0,1},{0,1,1},{1,1,1}};
	public static double miny(int[][] g){
		double[] b=new double[g.length];for(int i=0;i<b.length;i++){
		
			b[i]=1;
		}
		double[] c=new double[g.length];for(int i=0;i<b.length;i++){
		
			c[i]=1;
		}
		for(int k=0;k<999999999;k++){
		for (int i=0;i<g.length;i++){
			LinkedList l=adj(g,i);double r=0;
			for(int y=0;y<l.size();y++){
				r=r+c[(int) l.get(y)];
			}b[i]=r;
			
			
			
		}
		
		
		for(int i=0;i<b.length;i++){
			double bi=max(b);
			b[i]=b[i]/bi;
		}
for(int i=0;i<b.length;i++){
			
			c[i]=b[i];
		}
		
	}return b[0];
		}
	public static void main(String[]args){
		int[][] k={{1,0,1},{0,1,1},{1,1,1}};
		System.out.println(miny(k));
		
		
	}
}