package com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class WallapapersItem implements Serializable {

	@Override
	public String toString() {
		return "WallapapersItem{" +
				"images=" + images +
				", catName='" + catName + '\'' +
				'}';
	}

	@SerializedName("images")
	private List<String> images;

	@SerializedName("catName")
	private String catName;

	public List<String> getImages(){
		return images;
	}

	public String getCatName(){
		return catName;
	}
}