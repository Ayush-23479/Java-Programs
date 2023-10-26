public class stringMethod {
    public static void main(String[] args) {
        String name = "Ayush";
        System.out.println(name);

        int value= name.length();
        System.out.println(value);

        String lstring=name.toLowerCase();
        System.out.println(lstring);

        String ustring=name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString ="  Ayush  ";
        System.out.println(nonTrimmedString);

        String trimmedString= nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('s','f'));
        System.out.println(name.replace("h","hverma"));

        System.out.println(name.startsWith("Ayu"));
        System.out.println(name.endsWith("ush"));

        System.out.println(name.charAt(4));

        String modifications= "AyushVerma";
        System.out.println(modifications.indexOf("er"));
        System.out.println(modifications.indexOf("er",4));
        System.out.println(modifications.lastIndexOf("ma",8));

        System.out.println(name.equals("ayush"));
        System.out.println(name.equalsIgnoreCase("Ayush"));

        System.out.println("Iam escaping sequence \t double quote  ");
    }
}
