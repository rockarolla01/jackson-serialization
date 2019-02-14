package com.rockarolla;

import java.util.List;

/**
 * @author rockarolla01
 * Date: 15.02.2019
 */
public class DataTransferObject {

    private String name;
    private List<Object> objects;

    public DataTransferObject() {

    }

    public DataTransferObject(String name, List<Object> objects) {
        this.name = name;
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "DataTransferObject{" +
                "name='" + name + '\'' +
                ", objects=" + objects +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
