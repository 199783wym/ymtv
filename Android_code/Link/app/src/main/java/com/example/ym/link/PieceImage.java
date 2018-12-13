package com.example.ym.link;

import android.graphics.Bitmap;

public class PieceImage {

    private Bitmap image;
    private int iamgeId;

    public PieceImage(Bitmap image, int imageId){
        super();
        this.image =image;
        this.iamgeId =imageId;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public int getIamgeId() {
        return iamgeId;
    }

    public void setIamgeId(int iamgeId) {
        this.iamgeId = iamgeId;
    }
}

