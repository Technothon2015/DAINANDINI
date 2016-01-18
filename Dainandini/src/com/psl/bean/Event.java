package com.psl.bean;

import java.util.Date;

public class Event {

	int eventId;
	String username;
	EventType eventType;
	String eventDescription;
	Date postDate;
	EventStatus eventStatus;
	EventPriority eventPriority;
	
	public Event() {
		// TODO Auto-generated constructor stub
	}

	public Event(int eventId, String username, EventType eventType,
			String eventDescription, Date postDate, EventStatus eventStatus,
			EventPriority eventPriority) {
		super();
		this.eventId = eventId;
		this.username = username;
		this.eventType = eventType;
		this.eventDescription = eventDescription;
		this.postDate = postDate;
		this.eventStatus = eventStatus;
		this.eventPriority = eventPriority;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public EventStatus getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}

	public EventPriority getEventPriority() {
		return eventPriority;
	}

	public void setEventPriority(EventPriority eventPriority) {
		this.eventPriority = eventPriority;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", username=" + username
				+ ", eventType=" + eventType + ", eventDescription="
				+ eventDescription + ", postDate=" + postDate
				+ ", eventStatus=" + eventStatus + ", eventPriority="
				+ eventPriority + "]";
	}
	
	
	
}
