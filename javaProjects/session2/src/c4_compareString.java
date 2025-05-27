public class c4_compareString {
    public static void c4(){
        String s1, s2;
        s1="Abcbb"; s2="abgksajdhb";
        System.out.println(s1.compareTo(s2)); // compare in unicode
        //- 'c' has a Unicode value of 99.
        //- 'g' has a Unicode value of 103.
        //- The difference is 99 - 103 = -4.
        //That’s why "abc".compareTo("abg") returns -4—the method subtracts the Unicode value
        // of 'g' from 'c', indicating that "abc" comes before "abg" in lexicographical order.

        // but if theres a difference before it, for exp i just added A != a then it will 65 - 97
        // and then it stop, it doesnt compare the rest

        System.out.println(s1.charAt(1));
        System.out.println(s1.indexOf('b')); // first occurrence
        System.out.println(s2.indexOf('b', 3));// fromIndex
        // same as strings...

    }
}
