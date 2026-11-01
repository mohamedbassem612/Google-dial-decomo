package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FontData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(14);
    public final com.google.android.gms.people.cpg.callingcard.v2.FontColor a;
    public final java.lang.Float b;
    public final java.lang.Float c;
    public final java.lang.Integer d;
    public final java.lang.Integer e;
    public final java.lang.Float f;

    public FontData(com.google.android.gms.people.cpg.callingcard.v2.FontColor fontColor, java.lang.Float f, java.lang.Float f2, java.lang.Integer num, java.lang.Integer num2, java.lang.Float f3) {
        this.a = fontColor;
        this.b = f;
        this.c = f2;
        this.d = num;
        this.e = num2;
        this.f = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.FontData) {
            com.google.android.gms.people.cpg.callingcard.v2.FontData fontData = (com.google.android.gms.people.cpg.callingcard.v2.FontData) obj;
            if (j$.util.Objects.equals(this.a, fontData.a) && j$.util.Objects.equals(this.b, fontData.b) && j$.util.Objects.equals(this.c, fontData.c) && j$.util.Objects.equals(this.d, fontData.d) && j$.util.Objects.equals(this.e, fontData.e) && j$.util.Objects.equals(this.f, fontData.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.t(parcel, 2, this.b);
        aais.t(parcel, 3, this.c);
        aais.w(parcel, 4, this.d);
        aais.w(parcel, 5, this.e);
        aais.t(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
