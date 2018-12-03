public class Rev
{
  public static void main(String[] args)
   {
     char str[]={'h','e','l','l','o'};
    /* System.out.print(str[4]);
     for (int i=4;i>0;i--)
      {
         System.out.print(str[i]);
      }
    */ char temp;
     char rev;
     char begin,end;
     begin=0;
     end=strlen(str)-1;
    
     while(begin<end)
     {
          temp=begin;
          begin=end;
          end=temp;
     } 
     System.out.println("reverse of the string:"+rev);
   }
}