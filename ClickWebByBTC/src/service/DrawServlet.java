package service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

public class DrawServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("image/jpeg");
		createImage(response.getOutputStream());
	}
	
	private void createImage(OutputStream out) {
		int width = 100;
		int height = 100;
		
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g = bi.createGraphics();
		
		// set background color
		g.setBackground(Color.BLUE);
		g.clearRect(0, 0, width, height);
		
		// set  color
		g.setColor(Color.RED);
		
		g.drawLine(0, 0, 99, 99);
		g.dispose();
		bi.flush();
		
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(bi);
		param.setQuality(1.0f, false);
		encoder.setJPEGEncodeParam(param);
		
		try {
			encoder.encode(bi);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
