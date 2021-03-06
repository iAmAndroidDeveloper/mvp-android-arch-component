package com.quangnguyen.stackoverflowclient.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author QuangNguyen (quangctkm9207).
 */
public class User {
  @SerializedName("user_id")
  private long id;

  @SerializedName("display_name")
  private String name;

  @SerializedName("link")
  private String link;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }
}
