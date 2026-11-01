package com.google.android.gms.common.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(11);
    final int a;
    public final java.lang.String b;

    public Scope(int i, java.lang.String str) {
        defpackage.aais.aq(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.api.Scope) {
            return this.b.equals(((com.google.android.gms.common.api.Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 1, this.a);
        defpackage.aais.A(parcel, 2, this.b);
        defpackage.aais.g(parcel, iF);
    }
}
