package com.ausoft;

import javax.swing.*;
import java.awt.*;

public class CheckoutView  extends JFrame {

    public JTextField txtProductID = new JTextField(30);
    public JTextField txtProductName = new JTextField(30);
    public JTextField txtProductPrice = new JTextField(30);
    public JTextField txtProductQuantity = new JTextField(30);

    public JButton btnLoad = new JButton("Load");
    public JButton btnPay = new JButton("Pay");

    public CheckoutView() {

        this.setTitle("Checkout");
        this.setSize(new Dimension(600, 300));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));


        JPanel line1 = new JPanel();
        line1.add(new JLabel("Product ID"));
        line1.add(txtProductID);
        this.getContentPane().add(line1);

        JPanel line2 = new JPanel();
        line2.add(new JLabel("Product Name"));
        line2.add(txtProductName);
        this.getContentPane().add(line2);

        JPanel line3 = new JPanel();
        line3.add(new JLabel("Price"));
        line3.add(txtProductPrice);
        this.getContentPane().add(line3);

        JPanel line4 = new JPanel();
        line4.add(new JLabel("Quantity"));
        line4.add(txtProductQuantity);
        this.getContentPane().add(line4);


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnLoad);
        buttonPanel.add(btnPay);

        this.getContentPane().add(buttonPanel);


    }

}

