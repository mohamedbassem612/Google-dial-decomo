package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Identifier extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(8);
    public final com.google.android.gms.people.cpg.cpgex.Account a;
    public final java.lang.Long b;
    public final java.lang.Long c;
    public final com.google.android.gms.people.cpg.cpgex.Cp2Identifier d;

    public Identifier(com.google.android.gms.people.cpg.cpgex.Account account, java.lang.Long l, java.lang.Long l2, com.google.android.gms.people.cpg.cpgex.Cp2Identifier cp2Identifier) {
        this.a = account;
        this.b = l;
        this.c = l2;
        this.d = cp2Identifier;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.Identifier) {
            com.google.android.gms.people.cpg.cpgex.Identifier identifier = (com.google.android.gms.people.cpg.cpgex.Identifier) obj;
            if (j$.util.Objects.equals(this.a, identifier.a) && j$.util.Objects.equals(this.b, identifier.b) && j$.util.Objects.equals(this.c, identifier.c) && j$.util.Objects.equals(this.d, identifier.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, reflectedParcelable, i);
        aais.y(parcel, 2, this.b);
        aais.y(parcel, 3, this.c);
        aais.z(parcel, 4, this.d, i);
        aais.g(parcel, iF);
    }
}
