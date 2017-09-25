public class StringBufferDemo
{
    public static void main(String[]args)
    {
        StringBuffer stringBuffer=new StringBuffer("123");
        System.out.println("String Capacity:"+stringBuffer.capacity());
        System.out.println("String Length:"+stringBuffer.length());
        stringBuffer.insert(3,"456");
        System.out.println("String:"+stringBuffer);
        stringBuffer.replace(0,1,"2");
        System.out.println("String:"+stringBuffer);
        stringBuffer.append("7");
        System.out.println(stringBuffer);
    }
}
