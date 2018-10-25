
package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TransactionType {

    @JsonProperty("PAYMENT")
    PAYMENT("PAYMENT"),
    @JsonProperty("FEE")
    FEE("FEE"),
    @JsonProperty("ADJUSTMENT")
    ADJUSTMENT("ADJUSTMENT"),
    @JsonProperty("INTEREST")
    INTEREST("INTEREST");
    private final String value;
    private final static Map<String, TransactionType> VALUE_CACHE = new HashMap<String, TransactionType>();

    static {
        for (TransactionType c: values()) {
            VALUE_CACHE.put(c.value, c);
        }
    }

    private TransactionType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static TransactionType fromValue(String value) {
        return VALUE_CACHE.get(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
