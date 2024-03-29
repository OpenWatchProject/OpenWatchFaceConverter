package com.openwatchproject.watchfaceconverter.model;

import java.util.List;

public class ClockSkinItem {
    public int arrayType;
    public int range;
    public int centerX;
    public int centerY;
    public int color;
    public String colorArray;
    public int direction;
    public String drawable;
    public int mulRotate;
    public String name;
    public float offsetAngle;
    public int rotate;
    public int startAngle;
    public int textSize;
    public int duration;
    public int count;
    public String valueType;
    public float progressDiliverArc;
    public int progressdiliverCount;
    public int progressRadius;
    public String progressStroken;
    public String pictureShadow;
    public int frameDuration;
    public String className;
    public String packageName;
    public String childFolder;
    public List<String> drawables;
    public float angle;
    public int width;
    public int radius;
    public int rotateMode;
    public int repeat;

    public ClockSkinItem() {
        this.mulRotate = 1;
        this.width = 5;
        this.radius = 50;
        this.direction = 1;
        this.textSize = 18;
        this.rotateMode = 3;
        this.range = 30;
        //this.centerX = 200;
        //this.centerY = 200;
    }

    public float getAngle() {
        return angle;
    }

    public int getArrayType() {
        return arrayType;
    }

    public void setArrayType(int arrayType) {
        this.arrayType = arrayType;
    }

    public List<String> getDrawables() {
        return drawables;
    }

    public void setDrawables(List<String> drawables) {
        this.drawables = drawables;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getColorArray() {
        return colorArray;
    }

    public void setColorArray(String colorArray) {
        this.colorArray = colorArray;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getDrawable() {
        if (isAnimation()) {
            long now = System.currentTimeMillis();
            //now += timeZone.getOffset(now);
            int frame = (int) (Math.floor(now / frameDuration) % drawables.size());
            return drawables.get(frame);
        }

        return drawable;
    }

    public void setDrawable(String drawable) {
        this.drawable = drawable;
    }

    public int getMulRotate() {
        if (mulRotate == 0)
            return 1;

        return mulRotate;
    }

    public void setMulRotate(int mulRotate) {
        this.mulRotate = mulRotate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOffsetAngle() {
        return offsetAngle;
    }

    public void setOffsetAngle(float offsetAngle) {
        this.offsetAngle = offsetAngle;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public float getProgressDiliverArc() {
        return progressDiliverArc;
    }

    public void setProgressDiliverArc(float progressDiliverArc) {
        this.progressDiliverArc = progressDiliverArc;
    }

    public int getProgressdiliverCount() {
        return progressdiliverCount;
    }

    public void setProgressdiliverCount(int progressdiliverCount) {
        this.progressdiliverCount = progressdiliverCount;
    }

    public int getProgressRadius() {
        return progressRadius;
    }

    public void setProgressRadius(int progressRadius) {
        this.progressRadius = progressRadius;
    }

    public String getProgressStroken() {
        return progressStroken;
    }

    public void setProgressStroken(String progressStroken) {
        this.progressStroken = progressStroken;
    }

    public String getPictureShadow() {
        return pictureShadow;
    }

    public void setPictureShadow(String pictureShadow) {
        this.pictureShadow = pictureShadow;
    }

    public void setFramerate(double framerate) {
        this.frameDuration = (int) Math.round((double) 1000 / framerate);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getChildFolder() {
        return childFolder;
    }

    public void setChildFolder(String childFolder) {
        this.childFolder = childFolder;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getRepeat() {
        return repeat;
    }

    public boolean isAnimation() {
        return frameDuration != 0;
    }
}
