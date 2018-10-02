public class arrays {

        public static void main(String[] args) {
            int[] a = new int[3];
            a[0] = 1;
            a[0] = 5;
            a[1] = 2;
            a[2] = 3;
            char[] c = new char[2];
            c[0]= 'f';
            c[1]= 'g';
            byte[] byteArrays = new byte[1];
            byteArrays[0] = 10;
            float[] floatArrays = {
                  100 , 200 , 300 ,
                  400 , 500 ,
                  1200 , 1500,
                    15000
            };
            String[][] petnames = {
                    {"Kitty ", "Flappy ", "Cuite "},
                    {"Cat ", "Bird ", "Doggie "},
                    {"Micko ", "Alfie ", "Rob "},
            };
            System.out.println(petnames[0][0] + petnames[1][0] + petnames[2][0]);
            System.out.println(petnames[0][1] + petnames[1][1] + petnames[2][1]);
            System.out.println(petnames[0][2] + petnames[1][2] + petnames[2][2]);
            System.out.println(byteArrays[0]);
            System.out.println(floatArrays[0] + floatArrays[1]);
            System.out.println(a[0]);
            System.out.println(c[0]);
            System.out.println(c[1]);
        }
    }
