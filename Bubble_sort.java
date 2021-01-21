import java.io.*;
class Bubble_sort
{
  static void main()throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int i,j;
    String t;
    String m[]=new String [10];
    System.out.println("Enter Names: ");
    for(i=0 ; i<10 ; i++)
      m[i]=br.readLine();
    for(i=0 ; i<9 ; i++)
    {
      for(j=(i+1);j<10;j++)
      {
        if(m[i].compareTo(m[j])>0);
        {
          t=m[i];
          m[i]=m[j];
          m[j]=t;
        }
      }
    }
    System.out.print("The names in ascending order are : ");
    for(i=0;i<10;i++)
      System.out.println(m[i]);
  }
}
