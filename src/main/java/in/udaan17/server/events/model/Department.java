package in.udaan17.server.events.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import in.udaan17.server.events.util.ObjectIdDeSerializer;
import in.udaan17.server.events.util.ObjectIdSerializer;
import org.bson.types.ObjectId;

import java.util.ArrayList;

/**
 * Creator: vbarad
 * Date: 2017-02-26
 * Project: events-server
 */
public final class Department {
  @JsonDeserialize(using = ObjectIdDeSerializer.class)
  @JsonSerialize(using = ObjectIdSerializer.class)
  @JsonProperty(value = "_id")
  private ObjectId _id;
  
  @JsonProperty(value = "name")
  private String name;
  
  @JsonProperty(value = "alias")
  private String alias;
  
  @JsonProperty(value = "events")
  private ArrayList<Event> events;
  
  @JsonProperty(value = "heads")
  private ArrayList<BranchManager> heads;
  
  @JsonProperty(value = "coHeads")
  private ArrayList<BranchManager> coHeads;
  
  public Department(ObjectId _id, String name, String alias, ArrayList<Event> events, ArrayList<BranchManager> heads, ArrayList<BranchManager> coHeads) {
    this._id = _id;
    this.name = name;
    this.alias = alias;
    this.events = events;
    this.heads = heads;
    this.coHeads = coHeads;
  }
  
  public String getId() {
    return _id.toHexString();
  }
  
  public String getName() {
    return name;
  }
  
  public String getAlias() {
    return alias;
  }
  
  public ArrayList<Event> getEvents() {
    return events;
  }
  
  public ArrayList<BranchManager> getHeads() {
    return heads;
  }
  
  public ArrayList<BranchManager> getCoHeads() {
    return coHeads;
  }
}
