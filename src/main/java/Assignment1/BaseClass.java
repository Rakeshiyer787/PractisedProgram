package Assignment1;

class BaseClass {
    public void Print() {
        System.out.println("Base");
    }
}

    class Derived extends BaseClass {
        public void Print() {
            System.out.println("Derived");
        }
    }

    class Main {
        public static void Doprint(BaseClass o) {
            o.Print();
        }
        public static void main(String[] args) {
            BaseClass x = new BaseClass();
            BaseClass y = new Derived();
            Derived z = new Derived();
            Doprint(x);
            Doprint(y);
            Doprint(z);
        }
    }
