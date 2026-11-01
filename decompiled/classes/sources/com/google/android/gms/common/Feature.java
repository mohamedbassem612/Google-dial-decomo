package com.google.android.gms.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(8);
    public final java.lang.String a;

    @java.lang.Deprecated
    public final int b;
    public final boolean c;
    private final long d;

    public Feature(java.lang.String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.d = j;
        this.c = z;
    }

    public final long a() {
        long j = this.d;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.common.Feature feature;
        return (obj instanceof com.google.android.gms.common.Feature) && (feature = (com.google.android.gms.common.Feature) obj) != null && j$.util.Objects.equals(this.a, feature.a) && a() == feature.a() && this.c == feature.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Long.valueOf(a()), java.lang.Boolean.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aehj.bX("name", this.a, arrayList);
        defpackage.aehj.bX("version", java.lang.Long.valueOf(a()), arrayList);
        defpackage.aehj.bX("is_fully_rolled_out", java.lang.Boolean.valueOf(this.c), arrayList);
        return defpackage.aehj.bW(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        if (str != null) {
            int iF2 = defpackage.aais.f(parcel, 1);
            parcel.writeString(str);
            defpackage.aais.g(parcel, iF2);
        }
        int i2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        long jA = a();
        parcel.writeInt(524291);
        parcel.writeLong(jA);
        boolean z = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        defpackage.aais.g(parcel, iF);
    }
}
