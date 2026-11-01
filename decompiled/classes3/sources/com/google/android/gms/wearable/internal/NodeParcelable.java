package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NodeParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(4);
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final boolean d;

    public NodeParcelable(java.lang.String str, java.lang.String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.wearable.internal.NodeParcelable) {
            return ((com.google.android.gms.wearable.internal.NodeParcelable) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Node{" + this.b + ", id=" + this.a + ", hops=" + this.c + ", isNearby=" + this.d + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.A(parcel, 3, this.b);
        aais.l(parcel, 4, this.c);
        aais.h(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
