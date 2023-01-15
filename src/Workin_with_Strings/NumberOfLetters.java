package Workin_with_Strings;

public class NumberOfLetters {
    public static void main(String[] args) {
        buildDictionary("Hello");
    }
    static void  buildDictionary(String text){
        text = text.toLowerCase();

        int[] result = new int['�' - '�' + 1]; //32 length
        System.out.println('�'+ 1);
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= '�' && ch <= '�'){
                result[ch - '�']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + '�') + " = " + result[i]);
        }
    }
}
