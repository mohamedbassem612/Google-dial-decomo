package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FontColor extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(13);
    public final float a;
    public final float b;
    public final float c;
    public final java.lang.Float d;

    public FontColor(float f, float f2, float f3, java.lang.Float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.FontColor) {
            com.google.android.gms.people.cpg.callingcard.v2.FontColor fontColor = (com.google.android.gms.people.cpg.callingcard.v2.FontColor) obj;
            if (this.a == fontColor.a && this.b == fontColor.b && this.c == fontColor.c && j$.util.Objects.equals(this.d, fontColor.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Float.valueOf(this.a), java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c), this.d});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        float f = this.a;
        int iF = aais.f(parcel, 20293);
        aais.k(parcel, 1, f);
        aais.k(parcel, 2, this.b);
        aais.k(parcel, 3, this.c);
        aais.t(parcel, 4, this.d);
        aais.g(parcel, iF);
    }
}
