/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.melcloud.internal.api.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The {@link Preset} is responsible of JSON data For MELCloud API
 * Preset data
 * Generated with jsonschema2pojo
 *
 * @author Luca Calcaterra - Initial contribution
 */
public class Preset {

    @SerializedName("SetTemperature")
    @Expose
    private Double setTemperature;
    @SerializedName("Power")
    @Expose
    private Boolean power;
    @SerializedName("OperationMode")
    @Expose
    private Integer operationMode;
    @SerializedName("VaneHorizontal")
    @Expose
    private Integer vaneHorizontal;
    @SerializedName("VaneVertical")
    @Expose
    private Integer vaneVertical;
    @SerializedName("FanSpeed")
    @Expose
    private Integer fanSpeed;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Client")
    @Expose
    private Integer client;
    @SerializedName("D" + "eviceLocation")
    @Expose
    private Integer deviceLocation;
    @SerializedName("Number")
    @Expose
    private Integer number;
    @SerializedName("Configuration")
    @Expose
    private String configuration;
    @SerializedName("NumberDescription")
    @Expose
    private String numberDescription;

    public Double getSetTemperature() {
        return setTemperature;
    }

    public void setSetTemperature(Double setTemperature) {
        this.setTemperature = setTemperature;
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Integer getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(Integer operationMode) {
        this.operationMode = operationMode;
    }

    public Integer getVaneHorizontal() {
        return vaneHorizontal;
    }

    public void setVaneHorizontal(Integer vaneHorizontal) {
        this.vaneHorizontal = vaneHorizontal;
    }

    public Integer getVaneVertical() {
        return vaneVertical;
    }

    public void setVaneVertical(Integer vaneVertical) {
        this.vaneVertical = vaneVertical;
    }

    public Integer getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Integer fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(Integer deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getNumberDescription() {
        return numberDescription;
    }

    public void setNumberDescription(String numberDescription) {
        this.numberDescription = numberDescription;
    }

}
