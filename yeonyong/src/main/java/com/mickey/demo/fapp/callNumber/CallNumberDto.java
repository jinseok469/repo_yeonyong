package com.mickey.demo.fapp.callNumber;

public class CallNumberDto {
	private String seq;
	private String user_seq;
	private String callNumber;
	private String callCategory;
	private Integer leaderNumber;
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(String user_seq) {
		this.user_seq = user_seq;
	}
	public String getCallNumber() {
		return callNumber;
	}
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	public String getCallCategory() {
		return callCategory;
	}
	public void setCallCategory(String callCategory) {
		this.callCategory = callCategory;
	}
	public Integer getLeaderNumber() {
		return leaderNumber;
	}
	public void setLeaderNumber(Integer leaderNumber) {
		this.leaderNumber = leaderNumber;
	}
}
