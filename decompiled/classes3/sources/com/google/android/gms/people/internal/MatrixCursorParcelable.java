package com.google.android.gms.people.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MatrixCursorParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(11);
    private final android.database.Cursor a;
    private final int b;

    public MatrixCursorParcelable(android.database.Cursor cursor) {
        this.a = cursor;
        this.b = cursor == null ? 0 : cursor.getCount();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.database.Cursor cursor = this.a;
        if (cursor == null) {
            parcel.writeInt(0);
            parcel.writeStringArray(new java.lang.String[0]);
            parcel.writeInt(0);
            return;
        }
        try {
            int columnCount = cursor.getColumnCount();
            parcel.writeInt(columnCount);
            parcel.writeStringArray(cursor.getColumnNames());
            parcel.writeInt(this.b);
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                java.lang.Object[] objArr = new java.lang.Object[columnCount];
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        objArr[i2] = null;
                    } else if (type == 1) {
                        objArr[i2] = java.lang.Integer.valueOf(cursor.getInt(i2));
                    } else if (type == 2) {
                        objArr[i2] = java.lang.Float.valueOf(cursor.getFloat(i2));
                    } else if (type == 3) {
                        objArr[i2] = cursor.getString(i2);
                    } else if (type == 4) {
                        objArr[i2] = cursor.getBlob(i2);
                    }
                }
                parcel.writeArray(objArr);
            }
        } finally {
            this.a.close();
        }
    }
}
