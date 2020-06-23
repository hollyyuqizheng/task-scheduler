package com.google.sps.data;

/** Models a calendar event that the user creates. */
public class CalendarEvent {
  private final String name;
  private final Long startTime;
  private final Long endTime;

  // TODO: does an event need an ID?

  public CalendarEvent(String name, Long startTime, Long endTime) {
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

  public Long getStartTime() {
    return startTime;
  }

  public Long getEndTime() {
    return endTime;
  }
}
