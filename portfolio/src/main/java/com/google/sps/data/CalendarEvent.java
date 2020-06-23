package com.google.sps.data;

/**
 * Models a calendar event that the user creates. 
 */ 

public class Event {
  private final String name;
  private final long startTime; 
  private final long endTime;

  //TODO: does an event need an ID? 

  public Event(String name, long startTime, long endTime) {
    if (startTime == null) {
      throw new IllegalArgumentException("Event needs a start time");
    }
    if (endTime == null) {
      throw new IllegalArgumentException("Event needs an end time");
    }
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime; 
  }

  public String getName() {
    return name; 
  }

  public long getStartTime() {
    return startTime; 
  }

  public long getEndTime() {
    return endTime; 
  }
}
