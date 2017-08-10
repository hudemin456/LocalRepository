package com.pojo;

public class faqs {
				private int fid;
				private String title;
				private String createdate;
				private String content;
				private classes c;
				public faqs(int fid, String title, String createdate,
						String content, classes c) {
					super();
					this.fid = fid;
					this.title = title;
					this.createdate = createdate;
					this.content = content;
					this.c = c;
				}
				public faqs() {
					super();
					// TODO Auto-generated constructor stub
				}
				public int getFid() {
					return fid;
				}
				public void setFid(int fid) {
					this.fid = fid;
				}
				public String getTitle() {
					return title;
				}
				public void setTitle(String title) {
					this.title = title;
				}
				public String getCreatedate() {
					return createdate;
				}
				public void setCreatedate(String createdate) {
					this.createdate = createdate;
				}
				public String getContent() {
					return content;
				}
				public void setContent(String content) {
					this.content = content;
				}
				public classes getC() {
					return c;
				}
				public void setC(classes c) {
					this.c = c;
				}
}
