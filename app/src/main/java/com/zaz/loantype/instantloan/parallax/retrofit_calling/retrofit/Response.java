package com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("wallapapers")
	private List<WallapapersItem> wallapapers;

	public List<WallapapersItem> getWallapapers(){
		return wallapapers;
	}
}