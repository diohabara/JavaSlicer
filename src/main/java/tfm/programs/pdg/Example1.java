package tfm.programs.pdg;

import tfm.utils.Logger;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        if (x < y) {
            while (x < y) {
                y = x;

                for(int i : Arrays.asList(1, 2, 3, 4,5 )) {
                    y += x;
                    if (x > y)
                        continue;
                    x = y;

//                    while (x > 1) {
//                        y += 12;
//                        x = y;
//                    }
                }

                x++;
            }

            y = x + 1;
        } else {
            x = 4;
            y *= x;
        }

//        int e = (Integer) x;
//
//        switch (x) {
//            case 1:
//                e = 2;
//
//                while (1 < 4) {
//                    y = 2;
//
//                    if (4 < 1) {
//                        break;
//                    }
//                }
//
//                e = 5;
//
//                break;
//            case 2:
//                e = 3;
//            case 3:
//                e = 4;
//                break;
//            default:
//        }

        Logger.log(y);
    }
}
