package com.webwangbao.house.common.model;
/**
 * @author :wangbao02
 * @desc:小区
 * @date:2018/04/18
 */
public class Community {
	private Integer id;
	private String cityCode;
	private String cityName;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
