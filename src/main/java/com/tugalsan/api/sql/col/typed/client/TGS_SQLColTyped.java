package com.tugalsan.api.sql.col.typed.client;

public class TGS_SQLColTyped {

    public static TGS_SQLColTyped of(CharSequence columnName) {
        return new TGS_SQLColTyped(columnName);
    }

    public TGS_SQLColTyped(CharSequence columnName) {
        this.columnName = columnName.toString();
    }
    final public String columnName;

    @Override
    public String toString() {
        return columnName;
    }

    public boolean familyLng() {
        return TGS_SQLColTypedUtils.familyLng(columnName);
    }

    public boolean familyStr() {
        return TGS_SQLColTypedUtils.familyStr(columnName);
    }

    public boolean familyBytes() {
        return TGS_SQLColTypedUtils.familyBytes(columnName);
    }

    public boolean groupLnk() {
        return typeLngLnk() || typeStrLnk();
    }

    public boolean typeLng() {
        return TGS_SQLColTypedUtils.typeLng(columnName);
    }

    public boolean typeLngDate() {
        return TGS_SQLColTypedUtils.typeLngDate(columnName);
    }

    public boolean typeLngTime() {
        return TGS_SQLColTypedUtils.typeLngTime(columnName);
    }

    public boolean typeLngDbl() {
        return TGS_SQLColTypedUtils.typeLngDbl(columnName);
    }

    public boolean typeLngLnk() {
        return TGS_SQLColTypedUtils.typeLngLnk(columnName);
    }

    public boolean typeStr() {
        return TGS_SQLColTypedUtils.typeStr(columnName);
    }

    public boolean typeStrLnk() {
        return TGS_SQLColTypedUtils.typeStrLnk(columnName);
    }

    public boolean typeStrFile() {
        return TGS_SQLColTypedUtils.typeStrFile(columnName);
    }

    public boolean typeBytes() {
        return TGS_SQLColTypedUtils.typeBytes(columnName);
    }

    public boolean typeBytesRow() {
        return TGS_SQLColTypedUtils.typeBytesRow(columnName);
    }

    public boolean typeBytesStr() {
        return TGS_SQLColTypedUtils.typeBytesStr(columnName);
    }
}
