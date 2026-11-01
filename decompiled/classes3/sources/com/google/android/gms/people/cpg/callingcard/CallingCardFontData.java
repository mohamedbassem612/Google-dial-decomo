package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CallingCardFontData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(3);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;

    public CallingCardFontData(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = i2;
        this.i = f7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.CallingCardFontData) {
            com.google.android.gms.people.cpg.callingcard.CallingCardFontData callingCardFontData = (com.google.android.gms.people.cpg.callingcard.CallingCardFontData) obj;
            if (this.a == callingCardFontData.a && this.b == callingCardFontData.b && this.c == callingCardFontData.c && this.d == callingCardFontData.d && this.e == callingCardFontData.e && this.f == callingCardFontData.f && this.g == callingCardFontData.g && this.h == callingCardFontData.h && this.i == callingCardFontData.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Float.valueOf(this.a), java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c), java.lang.Float.valueOf(this.d), java.lang.Float.valueOf(this.e), java.lang.Float.valueOf(this.f), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.h), java.lang.Float.valueOf(this.i)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        float f = this.a;
        int iF = aais.f(parcel, 20293);
        aais.k(parcel, 1, f);
        aais.k(parcel, 2, this.b);
        aais.k(parcel, 3, this.c);
        aais.k(parcel, 4, this.d);
        aais.k(parcel, 5, this.e);
        aais.k(parcel, 6, this.f);
        aais.l(parcel, 7, this.g);
        aais.l(parcel, 8, this.h);
        aais.k(parcel, 9, this.i);
        aais.g(parcel, iF);
    }
}
