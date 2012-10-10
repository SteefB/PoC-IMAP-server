package models;

import java.util.List;

public class Email {

	private String subject;
	
	public Contact sender;
	
	private List<Contact> receivers;
	
	private String message;
	
	private List<Attachment> attachments;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Contact getSender() {
		return sender;
	}

	public void setSender(Contact sender) {
		this.sender = sender;
	}

	public List<Contact> getReceivers() {
		return receivers;
	}

	public void setReceivers(List<Contact> receivers) {
		this.receivers = receivers;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	
	
}
