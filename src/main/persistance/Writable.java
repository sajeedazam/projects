package persistance;

import org.json.JSONObject;

//citation: from JsonSerializationDemo
public interface Writable {
    // EFFECTS: returns this as JSON object
    JSONObject toJson();
}
