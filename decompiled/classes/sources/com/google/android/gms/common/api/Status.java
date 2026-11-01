package com.google.android.gms.common.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, defpackage.aadl {
    public static final android.os.Parcelable.Creator CREATOR;
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(0, null, null, null);
    public static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(14, null, null, null);
    public static final com.google.android.gms.common.api.Status c = new com.google.android.gms.common.api.Status(8, null, null, null);
    public static final com.google.android.gms.common.api.Status d = new com.google.android.gms.common.api.Status(15, null, null, null);
    public static final com.google.android.gms.common.api.Status e = new com.google.android.gms.common.api.Status(16, null, null, null);
    public final int f;
    public final java.lang.String g;
    public final android.app.PendingIntent h;
    public final com.google.android.gms.common.ConnectionResult i;

    static {
        defpackage.aais.aA(23);
        CREATOR = new defpackage.ccu(12);
    }

    public Status(int i, java.lang.String str, android.app.PendingIntent pendingIntent, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = connectionResult;
    }

    public final java.lang.String a() {
        java.lang.String str = this.g;
        return str == null ? defpackage.aais.aA(this.f) : str;
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.f == status.f && j$.util.Objects.equals(this.g, status.g) && j$.util.Objects.equals(this.h, status.h) && j$.util.Objects.equals(this.i, status.i);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aehj.bX("statusCode", a(), arrayList);
        defpackage.aehj.bX("resolution", this.h, arrayList);
        return defpackage.aehj.bW(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.f;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 1, i2);
        defpackage.aais.A(parcel, 2, this.g);
        defpackage.aais.z(parcel, 3, this.h, i);
        defpackage.aais.z(parcel, 4, this.i, i);
        defpackage.aais.g(parcel, iF);
    }

    @java.lang.Deprecated
    public Status(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this(17, str, connectionResult.a(), connectionResult);
    }

    @Override // defpackage.aadl
    public final com.google.android.gms.common.api.Status b() {
        return this;
    }
}
