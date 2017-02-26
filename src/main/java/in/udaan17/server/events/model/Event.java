package in.udaan17.server.events.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import in.udaan17.server.events.util.ObjectIdDeSerializer;
import in.udaan17.server.events.util.ObjectIdSerializer;
import org.bson.types.ObjectId;

/**
 * Creator: vbarad
 * Date: 2017-02-26
 * Project: events-server
 */
public final class Event {
  @JsonDeserialize(using = ObjectIdDeSerializer.class)
  @JsonSerialize(using = ObjectIdSerializer.class)
  @JsonProperty(value = "_id")
  private ObjectId _id;
  
  @JsonProperty(value = "name")
  private String name;
  
  @JsonProperty(value = "eventDescription")
  private String eventDescription;
  
  @JsonProperty(value = "participants")
  private String participants;
  
  @JsonProperty(value = "fees")
  private String fees;

//  @JsonProperty(value = "managers")
//  private ArrayList<EventManager> managers;
  
  @JsonProperty(value = "email")
  private String email;
  
  @JsonProperty(value = "round1Description")
  private String round1Description;
  
  @JsonProperty(value = "round2Description")
  private String round2Description;
  
  @JsonProperty(value = "round3Description")
  private String round3Description;
  
  public Event() {
    
  }
  
  public Event(ObjectId _id, String name, String eventDescription, String participants, String fees/*, ArrayList<EventManager> managers*/, String email, String round1Description, String round2Description, String round3Description) {
    this._id = _id;
    this.name = name;
    this.eventDescription = eventDescription;
    this.participants = participants;
    this.fees = fees;
//    this.managers = managers;
    this.email = email;
    this.round1Description = round1Description;
    this.round2Description = round2Description;
    this.round3Description = round3Description;
  }
  
  public String getId() {
    return _id.toHexString();
  }
  
  public String getName() {
    return name;
  }
  
  public String getEventDescription() {
    return eventDescription;
  }
  
  public String getParticipants() {
    return participants;
  }
  
  public String getFees() {
    return fees;
  }

//  public ArrayList<EventManager> getManagers() {
//    return managers;
//  }
  
  public String getEmail() {
    return email;
  }
  
  public String getRound1Description() {
    return round1Description;
  }
  
  public String getRound2Description() {
    return round2Description;
  }
  
  public String getRound3Description() {
    return round3Description;
  }
}
