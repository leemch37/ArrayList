package com.example.ccei.appadapterpj;

import android.graphics.drawable.Drawable;

/**
 * Created by ccei on 2016-07-08.
 */
public class TARAValueObject {
    public String memberName;
    public Drawable memberImage;
    public int likeCount;

    public TARAValueObject(String memberName, Drawable memberImage) {
        this.memberName = memberName;
        this.memberImage = memberImage;
    }
}