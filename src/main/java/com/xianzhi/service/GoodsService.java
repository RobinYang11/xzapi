package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.GoodBrandBean;
import com.xianzhi.bean.GoodLabelBean;
import com.xianzhi.bean.GoodPictureBean;
import com.xianzhi.bean.GoodSizeBean;
import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;

public interface GoodsService {

	/*
	 * ������Ʒ
	 */
	int insertGoods(GoodsBean goodsBean);

	/*
	 * ������Ʒ
	 */

	int updateGoods(GoodsBean goodsBean, int goodId);

	/*
	 * ɾ����Ʒ
	 */
	int deleleGoods(GoodsBean goodsBean, int goodId);

	/*
	 * ��id��Ʒ
	 */

	GoodsBean getGoodsById(int goodsId);

	/*
	 * ��ҳ��ѯ��Ʒ page ҳ�� offset ÿҳ������
	 */

	List<GoodsBean> getGoodSByPage( int page, int offset);

	/*
	 * ������Ʒ����
	 */
	
	int insertGoodType(GoodTypeBean goodTypeBean);
	
	/*
	 * ��ѯ���з���
	 */
	
	List<GoodTypeBean> getAllGoodType();

	/*
	 * ������Ʒ��λ
	 */

	int insertGoodUnit(GoodUnitBean goodUnitBean);
	
	/*
	 * ������Ʒ����
	 */

	int updateGoodType(GoodTypeBean goodTypeBean);
	
	/*
	 * ��ID��Ʒ����
	 */

	int deleteGoodType( int id);
	
	
	
	/*
	 * ������Ʒ��λ
	 */

	int updateGoodUnit(GoodUnitBean goodUnitBean);

	/*
	 * ��ID��Ʒ��λ
	 */

	int deleteGoodUnit( int id);
	
	/*
	 * ��ѯ������Ʒ��λ
	 */

	List<GoodUnitBean> getAllGoodUnit();
	
	/*
	 * ��ȡ��Ʒ����
	 */
	
	int getTotalGoodSize();
	
	/*
	 * ������ƷƷ��
	 */
	
	int addGoodBrand(GoodBrandBean goodBrandBean);
	
	/*
	 * ������ƷƷ��
	 */

	int updateGoodBrand(GoodBrandBean goodBrandBean);
	
	/*
	 * ��ȡ������ƷƷ��
	 */
	
	List<GoodBrandBean> getAllGoodBrand();
	
	/*
	 * ������Ʒ��ǩ
	 */
	
	int addGoodLabel(GoodLabelBean goodLabelBean);
	
	/*
	 * ������Ʒ��ǩ
	 */
	
	int updateGoodLabel(GoodLabelBean goodLabelBean);
	
	/*
	 * ɾ����Ʒ��ǩ
	 */
	
	void deleteGoodLabel(int id);
	
	/*
	 * ��ȡ��Ʒ��ǩ
	 */
	
	List<GoodLabelBean> getAllGoodLabel();
	
	
	/*
	 * ������Ʒ���
	 * */
	
	int addGoodSize(GoodSizeBean goodSizeBean);
	
	/*
	 * ������Ʒ���
	 * */
	
	int updateGoodSize(GoodSizeBean goodSizeBean);
	
	
	/*
	 * ����Ʒ��ѯ��Ʒ���
	 * */
	
	List<GoodSizeBean> getGoodSizeByGoodId(int goodId);
	
	/*
	 * ɾ����Ʒ���
	 * */
	
	int deleteGoodSizeById(int id);
	
	
	/*
	 * ������ƷͼƬ
	 * */
	
	int addGoodPic(GoodPictureBean goodPictureBean);
	
	/*
	 * ������ƷͼƬ
	 * */
	
	int updateGoodPic(GoodPictureBean goodPictureBean);
	
	
	/*
	 * ����Ʒ��ѯ��ƷͼƬ
	 * */
	
	List<GoodPictureBean> getGoodPicByGoodId(int goodId);
	
	/*
	 * ɾ����ƷͼƬ
	 * */
	
	int deleteGoodPicById(int id);
	
	
	
	
	
}
