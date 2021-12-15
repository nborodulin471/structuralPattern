package facade;

public class BinOps {
    public String sum(String a, String b) {
        int binStr1 = Integer.parseInt(a);
        int binStr2 = Integer.parseInt(b);
        int res =  binStr1 + binStr2;
        return Integer.toBinaryString(res);
    }

    public String mult(String a, String b) {
        int binStr1 = Integer.parseInt(a);
        int binStr2 = Integer.parseInt(b);
        int res =  binStr1 * binStr2;
        return Integer.toBinaryString(res);
    }
}
