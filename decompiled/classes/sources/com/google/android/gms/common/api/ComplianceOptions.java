package com.google.android.gms.common.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ComplianceOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(10);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.ComplianceOptions)) {
            return false;
        }
        com.google.android.gms.common.api.ComplianceOptions complianceOptions = (com.google.android.gms.common.api.ComplianceOptions) obj;
        return this.a == complianceOptions.a && this.b == complianceOptions.b && this.c == complianceOptions.c && this.d == complianceOptions.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Boolean.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        return "ComplianceOptions{callerProductId=" + this.a + ", dataOwnerProductId=" + this.b + ", processingReason=" + this.c + ", isUserData=" + this.d + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 1, i2);
        defpackage.aais.l(parcel, 2, this.b);
        defpackage.aais.l(parcel, 3, this.c);
        defpackage.aais.h(parcel, 4, this.d);
        defpackage.aais.g(parcel, iF);
    }
}
