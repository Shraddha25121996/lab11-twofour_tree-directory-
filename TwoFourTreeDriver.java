/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.twofournode;

/**
 *
 * @author shraddhapatel
 */
public class TwoFourTreeDriver {
   public static void main(String[] args) {
        TwoFourTree tree = new TwoFourTree();

        int[] keys = {10, 20, 30, 40, 50, 5, 15, 25, 35};

        System.out.println("Inserting keys...");
        for (int key : keys) {
            tree.insert(key);
        }

        System.out.println("\nFinal Inorder Traversal:");
        tree.inorder();
    }
}
    