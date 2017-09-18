package com.vueoschina.cn.bean;

import java.io.Serializable;

public class RelativeResponseBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String title;
	
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "RelativeResponseBean [title=" + title + ", url=" + url + "]";
	}
}
