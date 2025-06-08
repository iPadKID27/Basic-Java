public class StringConstructors {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("Good Moring");
        char data[] = {'H', 'o', 't', ' ', 'D', 'o', 'g'};
        String str3 = new String(data);
        String str4 = new String(data, 4, 3);
        byte bytedata[] = {(byte) 'l', (byte) 'i',
                           (byte) 'n', (byte) 'e',
                           (byte) 'a', (byte) 'r'};
        String srt5 = new String(bytedata);
        String str6 = new String(bytedata, 3, 3);
        StringBuffer sb = new StringBuffer("Have a great day !");
        String str7 = new String(sb);

        System.out.println("str1 is: " + str1);
        System.out.println("str2 is: " + str2);
        System.out.println("str3 is: " + str3);
        System.out.println("str4 is: " + str4);
        System.out.println("str5 is: " + srt5);
        System.out.println("str6 is: " + str6);
        System.out.println("str7 is: " + str7);
    }
}
