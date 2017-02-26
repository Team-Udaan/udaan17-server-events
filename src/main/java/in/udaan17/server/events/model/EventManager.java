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
public final class EventManager {
  @JsonDeserialize(using = ObjectIdDeSerializer.class)
  @JsonSerialize(using = ObjectIdSerializer.class, as = String.class)
  @JsonProperty(value = "_id")
  private ObjectId _id;
  
  @JsonProperty(value = "name")
  private String name;
  
  @JsonProperty(value = "mobile")
  private String mobile;
  
  public EventManager(ObjectId _id, String name, String mobile) {
    this._id = _id;
    this.name = name;
    this.mobile = mobile;
  }
  
  public String getId() {
    return _id.toHexString();
  }
  
  public String getName() {
    return name;
  }
  
  public String getMobile() {
    return mobile;
  }
}
