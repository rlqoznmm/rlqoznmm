
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * An Element is the base class for both vertices and edges.
 * An element has an identifier that must be unique to its inheriting classes (vertex or edges).
 * An element can maintain a collection of key/value properties.
 * Keys are always Strings and values can be any Object.
 * Particular implementations can reduce the space of objects that can be used as values.
 * Typically, objects are Java primitives (e.g. String, long, int, boolean, etc.)
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public abstract class Element {
    private Map<String, Object> property = new HashMap<>();

    /**
     * Return the object value associated with the provided string key.
     * If no value exists for that key, return null.
     *
     * @param key the key of the key/value property
     * @return the object value related to the string key
     */
    public Object getProperty(String key) {
        if (property.containsKey(key)) {
            return property.get(key);
        } else {
            return null;
        }
    }

    /**
     * Return all the keys associated with the element.
     *
     * @return the set of all string keys associated with the element
     */
    public Set<String> getPropertyKeys() {
        return property.keySet();
    }

    /**
     * Assign a key/value property to the element.
     * If a value already exists for this key, then the previous key/value is overwritten.
     *
     * @param key   the string key of the property
     * @param value the object value o the property
     */
    public void setProperty(String key, Object value) {
        property.put(key, value);
    }

    /**
     * An identifier that is unique to its inheriting class.
     * All vertices of a graph must have unique identifiers.
     * All edges of a graph must have unique identifiers.
     *
     * @return the identifier of the element
     */
    public Object getId() {
        return property.get("ID");
    }

}