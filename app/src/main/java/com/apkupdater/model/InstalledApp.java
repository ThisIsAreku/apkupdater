package com.apkupdater.model;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class InstalledApp
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private String mName;
	private String mPname;
	private String mVersion;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getName(
	) {
		return mName;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void setName(
		String mame) {
		mName = mame;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getPname() {
		return mPname;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void setPname(String pname) {
		mPname = pname;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getVersion() {
		return mVersion;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void setVersion(String version) {
		mVersion = version;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////