package pt.ulisboa.tecnico.cmov.locmess;

/**
 * Created by Pedro on 29/03/2017.
 */

import java.util.ArrayList;

public class Message {
    private String _name;
    private String _location;
    private String  _message;

    public Message() {}

    public String get_name() {
        return _name;
    }
    public void set_name(String _name) {
        this._name = _name;
    }
    public String get_location() {
        return _location;
    }
    public void set_location(String _location) {
        this._location = _location;
    }
    public String get_message() {
        return _message;
    }
    public void set_message(String _message) {
        this._message = _message;
    }
}