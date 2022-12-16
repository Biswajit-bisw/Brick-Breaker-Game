/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.project1;
//
///**
// *
// * @author hp
// */
//public class Project1 {
//
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
package com.mycompany.project1;

import javax.swing.JFrame;

/**
 *
 * @author chinm
 */
public class Project1 {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay2 gameplay = new GamePlay2();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }

}
