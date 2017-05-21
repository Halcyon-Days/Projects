package io.github.halcyon_daze.find_cost_of_tile_to_cover_w_x_h_floor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class CostOfFloor implements ActionListener{
    
    JFrame MainGUI;
    private JTextField widthTextField;
    private JTextField heightTextField;
    private JTextField tileSizeTextField;
    private JTextField costTextField;
    private JButton findCostButton;
    
    private JLabel costOfTiles;
    private JLabel numberOfTiles;
    
    private JLabel widthText;
    private JLabel heightText;
    private JLabel costText;
    private JLabel sizeOfTilesText;
    
    CostOfFloor() {
        MainGUI = new JFrame("Cost Of Floor");
        
        MainGUI.setLayout(new FlowLayout());
     
        MainGUI.setSize(300, 250);
        MainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        widthText = new JLabel("Width of floor in inches: ");
        widthTextField = new JTextField(10);
        widthTextField.setText("20");
        
        heightText = new JLabel("Height of floor in inches: ");
        heightTextField = new JTextField(10);
        heightTextField.setText("20");
        
        sizeOfTilesText = new JLabel("Size of tile in inches: ");
        tileSizeTextField = new JTextField(10);
        tileSizeTextField.setText("4");
        
        costText = new JLabel("Cost of tiles: ");
        costTextField = new JTextField(10);
        costTextField.setText("10");
        
        findCostButton = new JButton("Find Cost");
        findCostButton.setPreferredSize(new Dimension(200,30));
        findCostButton.addActionListener(this);
        
        costOfTiles = new JLabel("", FlowLayout.RIGHT);
        costOfTiles.setVerticalAlignment(SwingConstants.BOTTOM);
        
        numberOfTiles = new JLabel("", FlowLayout.RIGHT);
        numberOfTiles.setVerticalAlignment(SwingConstants.BOTTOM);
        
        MainGUI.add(widthText);
        MainGUI.add(widthTextField);
        
        MainGUI.add(heightText);
        MainGUI.add(heightTextField);
        
        MainGUI.add(sizeOfTilesText);
        MainGUI.add(tileSizeTextField);
        
        MainGUI.add(costText);
        MainGUI.add(costTextField);
        
        MainGUI.add(findCostButton);
        MainGUI.add(costOfTiles);
        MainGUI.add(numberOfTiles);
        
        MainGUI.setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        
        float floorWidth = Float.valueOf(widthTextField.getText());
        float floorHeight = Float.valueOf(heightTextField.getText());
        float tileCost = Float.valueOf(costTextField.getText());
        float tileSize = Float.valueOf(tileSizeTextField.getText());
    
        if (floorWidth < tileSize || floorHeight < tileSize){
            numberOfTiles.setText("Invalid Tile Size");   
            costOfTiles.setText("Invalid Tile Size");
        } else if (floorWidth % tileSize != 0 || floorHeight % tileSize != 0 ) {
            numberOfTiles.setText("Number of Tiles = " + (int) (floorWidth/tileSize) * (int) (floorHeight/tileSize) + " with " + String.format("%.2f", (floorWidth*floorHeight)/(tileSize*tileSize)) + "\" remaining space");
            costOfTiles.setText("Cost of tiles = $" + tileCost * (int)(floorWidth/tileSize) * (int)(floorHeight/tileSize));
        } else {
            numberOfTiles.setText("Number of Tiles = " + (int)(floorWidth/tileSize) * (int)(floorHeight/tileSize));
            costOfTiles.setText("Cost of tiles = $" + tileCost * (int)(floorWidth/tileSize) * (int)(floorHeight/tileSize));
        }

    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SwingUtilities.invokeLater ( new Runnable(){
            public void run() {
                new CostOfFloor();
            }
        });

    }

}
