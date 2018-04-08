package com.xianzhi.utils;

import java.io.File;

public class PathUtil {

	private static String seperator = System.getProperty("file.separator");

	/**
	 * @description:��������ͼƬͳһ�洢·��
	 * @param :none
	 * @author:robin
	 */

	public static String getBaseImgPath() {

		String basePath = "";
		String osName = System.getProperty("os.name");
		if (osName.toLowerCase().startsWith("win")) {
			basePath = "xianzhi/image";
		} else {
			basePath = "/home/xianzhi/image";
		}

		basePath = basePath.replace("/", seperator);
		return basePath;
	}

	/**
	 * @description:����Ʒ��logo�洢·��
	 * @param :brandId
	 *            Ʒ��ID
	 * @author:robin
	 */

	public static String getBrandImgPath(int brandId) {

		String basePath = PathUtil.getBaseImgPath();
		String brandPath = basePath + "/" + brandId + "/";
		File dirPath = new File(brandPath);
		if (!dirPath.exists()) {
			dirPath.mkdirs();
		}
		return brandPath.replace("/", seperator);
	}

	/**
	 * @description:���ɵ���ͼƬ·��
	 * @param :shopID
	 * @author:robin
	 */

	public static String getShopImagePath(long shopId) {

		String basePath = getBaseImgPath();
		String imagePath = basePath + "/shopImg/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}

	/**
	 * @description:������ƷͼƬ·��
	 * @param :goodId
	 * @author:robin
	 */

	public static String getGoodImagePath(int goodId) {

		String basePath = getBaseImgPath();
		String imagePath = basePath + "/shopImg/" + goodId + "/";
		return imagePath.replace("/", seperator);
	}

}
