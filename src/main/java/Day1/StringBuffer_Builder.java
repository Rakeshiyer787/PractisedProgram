package Day1;

public class StringBuffer_Builder {
    public static void main(String[] args) {
        long statrtime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("time");
            result.append("taken");
        }
        long endtime1 = System.currentTimeMillis();
        System.out.println("String Buffer");
        System.out.println("time" + "taken" + (endtime1 - statrtime1));

        //...............******...............
        //StringBulider
        long statrtime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            StringBuilder res = new StringBuilder();
            res.append("time");
            res.append("taken");
        }
        long endtime2 = System.currentTimeMillis();
        System.out.println("String Builder");
        System.out.println("time" + "taken" + (endtime2 - statrtime2));


    }
}


