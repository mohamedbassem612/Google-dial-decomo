package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Cp2Identifier extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(2);
    public final long a;
    public final java.lang.String b;

    public Cp2Identifier(long j, java.lang.String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.Cp2Identifier) {
            com.google.android.gms.people.cpg.cpgex.Cp2Identifier cp2Identifier = (com.google.android.gms.people.cpg.cpgex.Cp2Identifier) obj;
            if (this.a == cp2Identifier.a && j$.util.Objects.equals(this.b, cp2Identifier.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.a;
        int iF = aais.f(parcel, 20293);
        aais.m(parcel, 1, j);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
