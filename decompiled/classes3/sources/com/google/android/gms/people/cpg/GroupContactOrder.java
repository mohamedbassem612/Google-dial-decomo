package com.google.android.gms.people.cpg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GroupContactOrder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(19);
    public final java.lang.String a;
    public final java.util.List b;
    public final long c;

    public GroupContactOrder(java.lang.String str, java.util.List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.people.cpg.GroupContactOrder groupContactOrder = (com.google.android.gms.people.cpg.GroupContactOrder) obj;
            if (j$.util.Objects.equals(this.a, groupContactOrder.a) && j$.util.Objects.equals(this.b, groupContactOrder.b) && this.c == groupContactOrder.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Long.valueOf(this.c)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.x(parcel, 2, this.b);
        aais.m(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
