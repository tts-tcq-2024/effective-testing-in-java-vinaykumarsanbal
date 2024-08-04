public class Tshirts {
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms >38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) {
        assert(size(38) == "M");
        assert(size(42) == "L");        
        System.out.println("All is well (maybe!)");
    }
}
