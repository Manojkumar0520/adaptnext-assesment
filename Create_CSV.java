package com.products.com;

import java.io.File;
import java.io.PrintWriter;

public class Create_CSV {
	public static void main (String[] args) {
		
		try {
			PrintWriter pw= new PrintWriter(new File("C:\\Users\\manoj\\Desktop\\csv\\adaptnext.csv"));
		    StringBuilder sb= new StringBuilder();
			
		    sb.append("sl_no");
		    sb.append(",");
		    sb.append("Product Name");
		    sb.append(",");
		    sb.append("Product Price");
		    sb.append(",");
		    sb.append("Product Code");
		    sb.append(",");
	   	    sb.append("Model Number");
		    sb.append(",");
		    sb.append("Product Category");
		    sb.append(",");
		    sb.append("Product Description");
		    sb.append("\r\n");
		    
		    sb.append("1");
		    sb.append(",");
		    sb.append("Dell G3 Laptop");
		    sb.append(",");
		    sb.append("$ 1774.20");
		    sb.append(",");
		    sb.append("G3 15");
		    sb.append(",");
		    sb.append("G3579-5965BLK-PUS");
		    sb.append(",");
		    sb.append("Gaming Laptop");
		    sb.append(",");
		    sb.append("Gaming Laptop 15.6, Intel® Core™ i5-8300H, NVIDIA® GeForce® GTX 1050 4GB, 256GB SSD Storage, 8GB RAM");
		    sb.append("\r\n");
		    
		    sb.append("2");
		    sb.append(",");
		    sb.append("Dell G15 laptop");
		    sb.append(",");
		    sb.append("$919.00");
		    sb.append(",");
		    sb.append("G15");
		    sb.append(",");
		    sb.append("G3579-5965BLK-PUS");
		    sb.append(",");
		    sb.append("Gaming Laptop");
		    sb.append(",");
		    sb.append("Ryzen Edition Gaming 15 Laptop 15.6 FHD 120Hz Anti-glare Display AMD Hexa-Core Ryzen 5 5600H 8GB DDR4 256GB SSD GeFore RTX");
		    sb.append("\r\n");
		    
		    sb.append("3");
		    sb.append(",");
		    sb.append("Dell Laptop");
		    sb.append(",");
		    sb.append("$699.00");
		    sb.append(",");
		    sb.append("Not Avilable");
		    sb.append(",");
		    sb.append("M6800");
		    sb.append(",");
		    sb.append("Gaming Laptop");
		    sb.append(",");
		    sb.append("Gaming Laptop Core i7 2.7GHz Quad Core 16GB Memory 2 x 500GB Hard Drive Nvidia Graphics Windows 10 Home");
		    sb.append("\r\n");
		    
		    sb.append("4");
		    sb.append(",");
		    sb.append("Union & Scale™ Desk");
		    sb.append(",");
		    sb.append("$219.99");
		    sb.append(",");
		    sb.append("MidMod 60");
		    sb.append(",");
		    sb.append("Not Available");
		    sb.append(",");
		    sb.append("Laptop Desk");
		    sb.append(",");
		    sb.append("Rectangular computer and writing desk Dimensions: 29.5\"H x 59.7\"W x 29.4\"D");
		    sb.append("\r\n");
		    
		    sb.append("5");
		    sb.append(",");
		    sb.append("Staples Gillespie Desk");
		    sb.append(",");
		    sb.append("$129.99");
		    sb.append(",");
		    sb.append("L-Shaped Desk");
		    sb.append(",");
		    sb.append("Not Available");
		    sb.append(",");
		    sb.append("writing and Laptop desk");
		    sb.append(",");
		    sb.append("Rectangular computer and writing desk Dimensions: 29.5 H x 59.7W x 29.4 D");
		    sb.append("\r\n");
		    
		    sb.append("6");
		    sb.append(",");
		    sb.append("Staples Kendall Park Desk");
		    sb.append(",");
		    sb.append("$279.99");
		    sb.append(",");
		    sb.append("L-Shaped desk");
		    sb.append(",");
		    sb.append("Not Avilable");
		    sb.append(",");
		    sb.append("writing and Laptop desk");
		    sb.append(",");
		    sb.append("One letter file sized drawers Two additional drawers for additional storage Grommets for cable management Overall Dimensions: 30 H x 58.5 W x 58.5 D");
		    sb.append("\r\n");
		    
		    sb.append("7");
		    sb.append(",");
		    sb.append("WorkPro® chair");
		    sb.append(",");
		    sb.append("$189.99");
		    sb.append(",");
		    sb.append("WorkPro® 1000 Series");
		    sb.append(",");
		    sb.append("Not Available");
		    sb.append(",");
		    sb.append("Office Chair");
		    sb.append(",");
		    sb.append("This WorkPro 1000 Series ergonomic mesh task chair features rolling casters so you can move freely around your work area and supports weights up to 275 lbs.");
		    sb.append("\r\n");
		    
		    sb.append("8");
		    sb.append(",");
		    sb.append("Flash Furniture Ergonomic LeatherSoft™ Chair");
		    sb.append(",");
		    sb.append("$249.99");
		    sb.append(",");
		    sb.append("	BT-2690P-GG");
		    sb.append(",");
		    sb.append("	346053");
		    sb.append(",");
		    sb.append("Office Chair");
		    sb.append(",");
		    sb.append("Contemporary Office Chair. LeatherSoft Upholstery. Mid-Back Design with Headrest. Built-In Lumbar Support. Contrasting Stitching. CA117 Fire Retardant Foam. Waterfall Seat reduces pressure on your legs. Swivel Seat. Pneumatic Seat Height Adjustment. Nylon Arms. Heavy Duty Nylon Base. Dual Wheel Casters");
		    sb.append("\r\n");
		    
		    sb.append("9");
		    sb.append(",");
		    sb.append("Realspace® Chair");
		    sb.append(",");
		    sb.append("$299.99");
		    sb.append(",");
		    sb.append("MC-1068M-BLACK");
		    sb.append(",");
		    sb.append("493876");
		    sb.append(",");
		    sb.append("Office Chair");
		    sb.append(",");
		    sb.append("A tilt-lock mechanism and adjustable tilt tension allow flexible seating angles and support reclining function, and the mesh back fabric ensures ample airflow to keep your cool during extended work sessions. The customizable back and arm height enable effortless personalization for optimal comfort");
		    sb.append("\r\n");
		    
		    sb.append("10");
		    sb.append(",");
		    sb.append("Shaquille O'Neal™ Chair");
		    sb.append(",");
		    sb.append("$299.99");
		    sb.append(",");
		    sb.append("51435--VN");
		    sb.append(",");
		    sb.append("8085683");
		    sb.append(",");
		    sb.append("Office Chair"); 
		    sb.append(",");
		    sb.append("Color (Seat)-Gray. Width-27-1/2 in. Height-46-3/4 in.Depth-29 in. Weight Capacity (Seat)-400lb. Length (Seat)-22-1/4 in.Color (Frame)-Black Width (Seat)	18-1/2 in.Height (Maximum) - Floor To Seat	22 in.Height (Minimum) - Floor To Seat	19 in. Chair Back Style-High-Back");
		    sb.append("\r\n");
		    
		    pw.write(sb.toString());
		    pw.close();
		    System.out.println("finished");
		   
		}catch (Exception e) {
		
		
		// TODO Auto-generated method stub

	}

  }
	
}
	
    
