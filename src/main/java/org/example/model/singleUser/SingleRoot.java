package org.example.model.singleUser;

import org.example.model.listUsers.Data;
import org.example.model.listUsers.Support;

public class SingleRoot {

    private Data data;
    private Support support;

    public SingleRoot(Data data, Support support) {
        this.data = data;
        this.support = support;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}


