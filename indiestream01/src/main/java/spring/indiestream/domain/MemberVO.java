package spring.indiestream.domain;

import java.util.List;

public class MemberVO {
	private String memberId;
	private String password;
	private String name;
	private String profilePhto;
	private String introduction;
	private int reportCount;
	private List<String> genreList;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfilePhto() {
		return profilePhto;
	}
	public void setProfilePhto(String profilePhto) {
		this.profilePhto = profilePhto;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getReportCount() {
		return reportCount;
	}
	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}
	public List<String> getGenreList() {
		return genreList;
	}
	public void setGenreList(List<String> genreList) {
		this.genreList = genreList;
	}
	
}
