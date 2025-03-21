public class compare {
    public static void main(String[] args) {
        String name="slno";
        String array[]={"apple","ball","cat","dog"};
        String ans=array[0];
        for(int i=1;i<array.length;i++){
            ans=(ans+" "+array[i]);
        }
        System.out.println("\""+name+"\"");
        System.out.println(ans);
        System.out.println(name.equals("slno"));
    }
}
