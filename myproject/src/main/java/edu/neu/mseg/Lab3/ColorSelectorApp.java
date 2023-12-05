package edu.neu.mseg.Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelectorApp {
    private JFrame frame;
    private JPanel panel;
    private JComboBox<String> colorDropdown;
    private JLabel colorLabel;
    private JLabel outputLabel;

    public ColorSelectorApp() {
        // Create the main frame
        frame = new JFrame("Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold components
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a dropdown for color selection
        String[] colors = {"Red", "Blue", "Green"};
        colorDropdown = new JComboBox<>(colors);

        // Create a label to display the selected color
        colorLabel = new JLabel("Selected Color: ");

        // Create a label for output text
        outputLabel = new JLabel();

        // Add an action listener to the dropdown to respond to color selection
        colorDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorDropdown.getSelectedItem();
                setColorAndText(selectedColor);
            }
        });

        // Add components to the panel
        panel.add(colorDropdown);
        panel.add(colorLabel);
        panel.add(outputLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility
        frame.setVisible(true);
    }

    // Method to set the color of the circle and update the output text
    private void setColorAndText(String color) {
        Color selectedColor = Color.BLACK; // Default color if not recognized

        switch (color.toLowerCase()) {
            case "red":
                selectedColor = Color.RED;
                break;
            case "blue":
                selectedColor = Color.BLUE;
                break;
            case "green":
                selectedColor = Color.GREEN;
                break;
        }

        // Update the circle color
        panel.setBackground(selectedColor);

        // Update the output text
        outputLabel.setText("Selected Color: " + color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorSelectorApp();
            }
        });
    }
}
