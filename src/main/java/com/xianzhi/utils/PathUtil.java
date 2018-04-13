package com.xianzhi.utils;

import java.io.File;

public class PathUtil {

	private static String seperator = System.getProperty("file.separator");
	public static String virtualPath = "/img";

	/**
	 * @description:生成所有图片统一存储路径
	 * @param :none
	 * @author:robin
	 */
	public static String getBaseImgPath() {

		String basePath = "";
		String osName = System.getProperty("os.name");
		if (osName.toLowerCase().startsWith("win")) {
			basePath = "D:/xianzhi/image";
		} else {
			basePath = "/home/xianzhi/image";
		}

		basePath = basePath.replace("/", seperator);
		return basePath;
	}

	/**
	 * @description:生成品牌logo存储路径
	 * @param :brandId
	 * @author:robin
	 */
	public static String getBrandImgPath(String name) {

		String brandPath = "/" + name + "/";
		return brandPath.replace("/", seperator);
	}

	/**
	 * @description :创建目录
	 * @param:路径
	 * @author:robin
	 */
	public static void makeDir(String dir) {
		File dirPath = new File(dir);

		if (!dirPath.exists()) {
			dirPath.mkdirs();
		}

	}

	/**
	 * @description :生成虚拟目录
	 * @param:server 服务域名或者ip,
	 * port 端口,imgPath 图片路径 , imgName 图片名称
	 * @author:robin
	 */
	public static String getVirtualPath(String Server, String port, String imgPath, String imgName) {

		String path = "http://" + Server + ":" + port + virtualPath + imgPath + imgName;

		return path.replace("/", seperator);
	}

	/**
	 * @description:生成店铺图片路径
	 * @param :shopID
	 * @author:robin
	 */

	public static String getShopImagePath(long shopId) {

		String imagePath ="/shopImg/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}

	/**
	 * @description:生成商品图片路径
	 * @param :goodId
	 * @author:robin
	 */
	public static String getGoodImagePath(int goodId) {
		String imagePath ="/shopImg/" + goodId + "/";
		return imagePath.replace("/", seperator);
	}

}
