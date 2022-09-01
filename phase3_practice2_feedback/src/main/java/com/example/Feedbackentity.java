package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedbackentity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "uid", updatable = false, nullable = false)
	    private int uid;
	       
	    @Column(name = "user")
	    private String user;
	    @Column(name = "rating")
	    private int rating;
	    @Column(name = "comment")
	    private String comment;
		
		
		public Feedbackentity(String user, int rating, String comment) {
			super();
			this.user = user;
			this.rating = rating;
			this.comment = comment;
		}
		
		public Feedbackentity() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		
		@Override
		public String toString() {
			return "Feedback [uid = " + uid + ", User = " + user + ", Rating = " + rating + ", Comment = " + comment + "]\n";
		}
		
}
