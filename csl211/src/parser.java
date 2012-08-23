import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class parser {

/*
Graph g = readGraph();

private Graph readGraph() {
// TODO Auto-generated method stub
return null;
}
*/
public static void main(String[] arg)
{
	
	int[][] g=new int[105][105];
File f=new File("asd.txt");

try {
Scanner s=new Scanner(f);
for(int n=1;n<441;n++)
{s.next();
	int b=Integer.parseInt(s.next());
int c=Integer.parseInt(s.next());

g[b][c]=1;
g[c][b]=1;
//System.out.println(b+" "+c);//System.out.println(c);
}} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println(g[56][33]);



}}