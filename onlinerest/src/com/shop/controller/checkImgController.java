// 
// 
// 

package com.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.awt.Graphics;
import java.io.OutputStream;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.util.Random;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

@Controller
public class checkImgController
{
    @RequestMapping({ "checkImg" })
    public void checkImg(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        final int width = 120;
        final int height = 30;
        final BufferedImage bufferedImage = new BufferedImage(width, height, 1);
        final Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(this.getRandColor(200, 250));
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.WHITE);
        graphics.drawRect(0, 0, width - 1, height - 1);
        final Graphics2D graphics2d = (Graphics2D)graphics;
        graphics2d.setFont(new Font("\u5b8b\u4f53", 1, 18));
        final String words = "\u7684\u4e00\u4e86\u662f\u6211\u4e0d\u5728\u4eba\u4eec\u6709\u6765\u4ed6\u8fd9\u4e0a\u7740\u4e2a\u5730\u5230\u5927\u91cc\u8bf4\u5c31\u53bb\u5b50\u5f97\u4e5f\u548c\u90a3\u8981\u4e0b\u770b\u5929\u65f6\u8fc7\u51fa\u5c0f\u4e48\u8d77\u4f60\u90fd\u628a\u597d\u8fd8";
        final Random random = new Random();
        final StringBuffer sb = new StringBuffer();
        int x = 10;
        for (int i = 0; i < 4; ++i) {
            graphics2d.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            final int jiaodu = random.nextInt(60) - 30;
            final double theta = jiaodu * 3.141592653589793 / 180.0;
            final int index = random.nextInt(words.length());
            final char c = words.charAt(index);
            sb.append(c);
            graphics2d.rotate(theta, x, 20.0);
            graphics2d.drawString(String.valueOf(c), x, 20);
            graphics2d.rotate(-theta, x, 20.0);
            x += 30;
        }
        request.getSession().setAttribute("checkcode", (Object)sb.toString());
        System.out.println(sb.toString());
        graphics.setColor(this.getRandColor(160, 200));
        for (int j = 0; j < 30; ++j) {
            final int x2 = random.nextInt(width);
            final int x3 = random.nextInt(12);
            final int y1 = random.nextInt(height);
            final int y2 = random.nextInt(12);
            graphics.drawLine(x2, y1, x2 + x3, x3 + y2);
        }
        graphics.dispose();
        ImageIO.write(bufferedImage, "jpg", (OutputStream)response.getOutputStream());
    }
    
    private Color getRandColor(int fc, int bc) {
        final Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        final int r = fc + random.nextInt(bc - fc);
        final int g = fc + random.nextInt(bc - fc);
        final int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}
