package com.xianzhi.utils;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;

import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	
	private static final Random r = new Random();
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	
	public static void main(String[] args) throws IOException {
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		File file=new File("/Users/Administrator/Desktop/s.jpg");

		Thumbnails.of(new File("C:/Users/Administrator/Desktop/s.jpg")).size(200,200)
		.watermark(Positions.BOTTOM_LEFT, ImageIO.read(new File("C:/Users/Administrator/Desktop/c.jpg")), 0.5f)
		.outputQuality(0.5f).toFile("s_marked.jpg");
	}
	
	/**
	 * 生成随机文件名，当前年月日小时分钟秒钟+五位随机数
	 * 
	 * @return
	 */
	public static String getRandomFileName() {
		// 获取随机的五位数
		int rannum = r.nextInt(89999) + 10000;
		String nowTimeStr = sDateFormat.format(new Date());
		return nowTimeStr + rannum;
	}
}
