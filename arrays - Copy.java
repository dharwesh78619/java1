import java.util.Arrays;
class main{
public static void main(String args[]){
int[] n1={2,3,12,4,12,-2};
int[] n3=new int[5];
int[] n2=new int[n1.length];
System.arraycopy(n1,0,n2,0,n1.length);
System.out.println("n2= "+Arrays.toString(n3));
}
}