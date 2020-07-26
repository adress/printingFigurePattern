/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingfigurepattern;

/**
 *
 * @author Andres
 */
public class Square1 {

    /**
     * @author Andres Aranda
     * @param length corresponds to the size of the array.
     */
    public void print(int length) {
        // 
        int limitRow = 0;
        int filaCentro = (length + 1) / 2;
        for (int row = 1; row <= length; row++) {
            for (int column = 1; column <= length; column++) {
                if (column >= 1 + limitRow && column <= length - limitRow) {
                    if (row % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (column % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            limitRow = (row < filaCentro) ? (limitRow + 1) : (limitRow - 1);
        }
    }

}
