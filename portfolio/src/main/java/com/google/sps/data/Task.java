package com.google.sps.data;

/**
 * Models a task that the user creates. 
 */ 

public final class Task {

  private final String name; 
  private final String description; 
  private final int durationMinute;
  private final int priority; 

  //TODO: does a task need an ID? 

  public Task(String name, String description, int durationMinute, int priority) {
    if (durationMinute == null) {
      throw new IllegalArgumentException("Task needs a duration");
    }

    this.name = name;
    this.description = description; 
    this.durationMinute = durationMinute;
    this.priority = priority; 
  }

  public String getName() {
    return name; 
  }

  public String getDescription() {
    return description; 
  }

  public int getDurationMinute() {
    return durationMinute;
  }

  public int getPriority() {
    return priority; 
  }

}
