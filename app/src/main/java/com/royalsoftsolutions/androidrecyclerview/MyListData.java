package com.royalsoftsolutions.androidrecyclerview;

public class MyListData {
    private String description;
    private int imgId;
    private String description2;

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }



  public   MyListData(String description, int imgId,String description2){
      this.description = description;
      this.description2 = description2;
      this.imgId = imgId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
