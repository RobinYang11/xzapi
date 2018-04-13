package com.xianzhi.utils;

import java.io.File;

public class PathUtil {

	private static String seperator = System.getProperty("file.separator");
	public static String virtualPath = "/img";

	/**
	 * @description:��������ͼƬͳһ�洢·��
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
	 * @description:����Ʒ��logo�洢·��
	 * @param :brandId
	 * @author:robin
	 */
	public static String getBrandImgPath(String name) {

		String brandPath = "/" + name + "/";
		return brandPath.replace("/", seperator);
	}

	/**
	 * @description :����Ŀ¼
	 * @param:·��
	 * @author:robin
	 */
	public static void makeDir(String dir) {
		File dirPath = new File(dir);

		if (!dirPath.exists()) {
			dirPath.mkdirs();
		}

	}

	/**
	 * @description :��������Ŀ¼
	 * @param:server ������������ip,
	 * port �˿�,imgPath ͼƬ·�� , imgName ͼƬ����
	 * @author:robin
	 */
	public static String getVirtualPath(String Server, String port, String imgPath, String imgName) {

		String path = "http://" + Server + ":" + port + virtualPath + imgPath + imgName;

		return path.replace("/", seperator);
	}

	/**
	 * @description:���ɵ���ͼƬ·��
	 * @param :shopID
	 * @author:robin
	 */

	public static String getShopImagePath(long shopId) {

		String imagePath ="/shopImg/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}

	/**
	 * @description:������ƷͼƬ·��
	 * @param :goodId
	 * @author:robin
	 */
	public static String getGoodImagePath(int goodId) {
		String imagePath ="/shopImg/" + goodId + "/";
		return imagePath.replace("/", seperator);
	}

}
