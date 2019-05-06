package cn.net.sinodata.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.imageio.ImageIO;

public final class ImageUtil
{
  private static final char[] chars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
  private static final int SIZE = 4;
  private static final int LINES = 5;

  public static Object[] createImage(Integer width, Integer height, Color color)
  {
    StringBuffer sb = new StringBuffer();
    int FONT_SIZE = height.intValue() - 4;

    BufferedImage image = new BufferedImage(width
      .intValue(), height.intValue(), 1);

    Graphics graphic = image.getGraphics();

    graphic.setColor(color);

    graphic.fillRect(0, 0, width.intValue(), height.intValue());

    Random ran = new Random();
    for (int i = 0; i < 4; i++)
    {
      int n = ran.nextInt(chars.length);

      Color fontColor = null;
      do
        fontColor = getRandomColor();
      while ((color.getBlue() < fontColor.getBlue() - 20) && (color.getRed() < fontColor.getRed() - 20));
      graphic.setColor(fontColor);

      graphic.setFont(new Font(null, 3, FONT_SIZE));

      graphic.drawString(chars[n] + " ", i * width
        .intValue() / 4, height.intValue() - 4);

      sb.append(chars[n]);
    }

    for (int i = 0; i < 5; i++)
    {
      graphic.setColor(getRandomColor());

      graphic.drawLine(ran.nextInt(width.intValue()), ran.nextInt(height.intValue()), ran
        .nextInt(width
        .intValue()), ran.nextInt(height.intValue()));
    }

    return new Object[] { sb.toString(), image };
  }

  public static Color getRandomColor()
  {
    Random ran = new Random();

    Color color = new Color(ran.nextInt(256), ran
      .nextInt(256), 
      ran.nextInt(256));
    return color;
  }

  public static void main(String[] args) throws IOException {
    Object[] objs = createImage(Integer.valueOf(100), Integer.valueOf(35), new Color(121, 136, 178));
    BufferedImage image = (BufferedImage)objs[1];

    OutputStream os = new FileOutputStream("d:/1.png");
    ImageIO.write(image, "png", os);
    os.close();
  }
}