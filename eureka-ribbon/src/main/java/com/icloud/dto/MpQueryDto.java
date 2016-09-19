package com.icloud.dto;

import java.util.ArrayList;
import java.util.List;

import com.icloud.model.MerchantsMp;

public class MpQueryDto extends BaseDto {
 
	private int offset = 1;
	private int pageSize = 10;
	private List<MerchantsMp> mps = new ArrayList<MerchantsMp>();

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<MerchantsMp> getMps() {
		return mps;
	}

	public void setMps(List<MerchantsMp> mps) {
		this.mps = mps;
	}

	public MpQueryDto(String resultType, String resultCode,
			String errorMsg, int offset, int pageSize) {
		super();
		this.resultType = resultType;
		this.resultCode = resultCode;
		this.errorMsg = errorMsg;
		this.offset = offset;
		this.pageSize = pageSize;
	}

	public MpQueryDto(String resultType, String resultCode, int offset,
			int pageSize, List<MerchantsMp> mps) {
		super();
		this.resultType = resultType;
		this.resultCode = resultCode;
		this.offset = offset;
		this.pageSize = pageSize;
		this.mps = mps;
	}

}
