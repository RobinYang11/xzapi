package com.xianzhi.utils;

import java.io.File;

public class PathUtil {

	private static String seperator = System.getProperty("file.separator");

	/**
	 * @description:生成所有图片统一存储路径
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
	 * @description:生成品牌logo存储路径
	 * @param :brandId
	 *            品牌ID
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
	 * @description:生成店铺图片路径
	 * @param :shopID
	 * @author:robin
	 */

	public static String getShopImagePath(long shopId) {

		String basePath = getBaseImgPath();
		String imagePath = basePath + "/shopImg/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}

	/**
	 * @description:生成商品图片路径
	 * @param :goodId
	 * @author:robin
	 */

	public static String getGoodImagePath(int goodId) {

		String basePath = getBaseImgPath();
		String imagePath = basePath + "/shopImg/" + goodId + "/";
		return imagePath.replace("/", seperator);
	}

}
