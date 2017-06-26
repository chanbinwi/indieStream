package spring.indiestream.domain;

import java.util.List;

public class SnsBoardVO {
	private int snsBoardNo;
	private String snsWriter;
	private String postedTime;
	private String snsContent;
	private String videoUrl;
	/*private List<ImageVO> imageList;
	private List<LikerVO> likerList;
	private List<ReplyVO> replyList;
	private List<HashtagVO> hashtagList;
	private List<ReportVO> reportList;*/
	public SnsBoardVO(int snsBoardNo, String snsWriter, String postedTime, String snsContent, String videoUrl) {
		super();
		this.snsBoardNo = snsBoardNo;
		this.snsWriter = snsWriter;
		this.postedTime = postedTime;
		this.snsContent = snsContent;
		this.videoUrl = videoUrl;
	}
	public SnsBoardVO() {
		super();
	}
	@Override
	public String toString() {
		return "SnsBoardVO [snsBoardNo=" + snsBoardNo + ", snsWriter=" + snsWriter + ", postedTime=" + postedTime
				+ ", snsContent=" + snsContent + ", videoUrl=" + videoUrl + "]";
	}
	
	
	
}
