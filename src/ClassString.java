public class ClassString
{
    public static void main(String[] args)
    {
        String sentence="Java is fun! I love Java!";
        System.out.println(sentence.charAt(3));
        String sentence1=new String("Java is Fun! I love Java!");
        System.out.println(sentence.compareTo(sentence1));
        String sentence2=sentence.concat(" I learn CSC200 now.");
        System.out.println(sentence2);
        String sentence3=new String(" I LEARN CSC200 NOW.");
        System.out.println(sentence3.equals(sentence2));
        System.out.println(sentence.equalsIgnoreCase(sentence1));
        System.out.println(sentence.indexOf("fun"));
        System.out.println(sentence.lastIndexOf("a"));
        System.out.println(sentence.length());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.replace("Java","CSC"));
        System.out.println(sentence.substring(5));
        System.out.println(sentence.substring(0,5));
        String string1=new String("      ABC      ");
        System.out.println(string1+"\n"+string1.trim());
    }

}
