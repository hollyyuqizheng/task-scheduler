class CalendarEvent{
  constructor(name, startTime, endTime) {
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime;
  }
}

/** 
 * Onclick function for "Add this event" button.
 * Retrievs the new event's name, start and end times, and creates a new 
 * CalendarEvent from these information. Adds the new event to the 
 * event list. 
 */
function createNewCalendarEvent() {
  startTime = document.getElementById('new-event-start-time').value;
  endTime = document.getElementById('new-event-end-time').value;
  eventName = document.getElementById('new-event-name').value;

  newCalendarEvent = new CalendarEvent(eventName, startTime, endTime);

  updateCalendarEventList(newCalendarEvent); 

  document.getElementById('new-event-name').value = ''; 
}

/** Creates a single element for a new calendar event. */
function updateCalendarEventList(newCalendarEvent) {
  newEventElement = document.createElement('li');
  newEventElement.innerText = 'New Event: ' + newCalendarEvent.name 
      + ' starts at ' + newCalendarEvent.startTime
      + ' ends at ' + newCalendarEvent.endTime; 

  eventList = document.getElementById('new-event-list');
  eventList.innterHTML = ''; 
  eventList.appendChild(newEventElement); 
}
