package com.google.android.gms.googlehelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FRDProductSpecificDataEntry extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(20);
    final int a;
    final int b;
    final java.util.List c;
    final java.util.List d;
    final java.util.List e;
    final java.util.List f;
    final byte[][] g;
    final java.lang.Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = java.lang.Boolean.valueOf(z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.googlehelp.FRDProductSpecificDataEntry) {
            com.google.android.gms.googlehelp.FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (com.google.android.gms.googlehelp.FRDProductSpecificDataEntry) obj;
            if (this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && j$.util.Objects.equals(this.c, fRDProductSpecificDataEntry.c) && j$.util.Objects.equals(this.d, fRDProductSpecificDataEntry.d) && j$.util.Objects.equals(this.e, fRDProductSpecificDataEntry.e) && j$.util.Objects.equals(this.f, fRDProductSpecificDataEntry.f) && java.util.Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && j$.util.Objects.equals(this.h, fRDProductSpecificDataEntry.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), this.c, this.d, this.e, this.f, java.lang.Integer.valueOf(java.util.Arrays.deepHashCode(this.g)), this.h});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.l(parcel, 3, this.b);
        aais.C(parcel, 4, this.c);
        aais.x(parcel, 5, this.d);
        aais.C(parcel, 6, this.e);
        aais.x(parcel, 7, this.f);
        aais.r(parcel, 8, this.g);
        aais.o(parcel, 9, this.h);
        aais.g(parcel, iF);
    }
}
