import java.util.function.Predicate;
class PredicateEx {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };

    public static void predicate_negate()
    {

        Predicate<String> lengthGTThan100=P->P.equals("A");
        String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                + "film starring Kevin Durant";

        boolean outcome = hasLengthOf10.and(lengthGTThan100).test(lengthGTThan10);
        System.out.println(outcome);
    }
    public static void main(String[] args)
    {
        predicate_negate();
    }
}