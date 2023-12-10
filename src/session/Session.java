package session;

import java.util.*;

/**
 *
 * @author Marko Milosevic
 */
public class Session {

    private static final Session instance = new Session();
    private final Map<Object, Object> map = new HashMap<>();

    public static Session getInstance() {
        return instance;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

}
