package com.webwangbao.house.common.constants;
/**
 * @author :wangbao02
 * @desc:公用枚举类
 * @date:2018/04/18
 */
public enum HouseUserType {

	SALE(1),BOOKMARK(2);
	
	public final Integer value;
	
	private HouseUserType(Integer value){
		this.value = value;
	}
}
