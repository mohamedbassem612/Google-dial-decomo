package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConnectionConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aavw();
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public volatile java.lang.String g;
    public final boolean h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final int k;
    public final java.util.List l;
    public final boolean m;
    public final boolean n;
    public final com.google.android.gms.wearable.ConnectionRestrictions o;
    public final boolean p;
    public final com.google.android.gms.wearable.ConnectionDelayFilters q;
    public final int r;
    public final int s;
    public final boolean t;

    public ConnectionConfiguration(java.lang.String str, java.lang.String str2, int i, int i2, boolean z, boolean z2, java.lang.String str3, boolean z3, java.lang.String str4, java.lang.String str5, int i3, java.util.List list, boolean z4, boolean z5, com.google.android.gms.wearable.ConnectionRestrictions connectionRestrictions, boolean z6, com.google.android.gms.wearable.ConnectionDelayFilters connectionDelayFilters, int i4, int i5, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = list;
        this.m = z4;
        this.n = z5;
        this.o = connectionRestrictions;
        this.p = z6;
        this.q = connectionDelayFilters;
        this.r = i4;
        this.s = i5;
        this.t = z7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.wearable.ConnectionConfiguration)) {
            return false;
        }
        com.google.android.gms.wearable.ConnectionConfiguration connectionConfiguration = (com.google.android.gms.wearable.ConnectionConfiguration) obj;
        return j$.util.Objects.equals(this.a, connectionConfiguration.a) && j$.util.Objects.equals(this.b, connectionConfiguration.b) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(connectionConfiguration.c)) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(connectionConfiguration.d)) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(connectionConfiguration.e)) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.h), java.lang.Boolean.valueOf(connectionConfiguration.h)) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.m), java.lang.Boolean.valueOf(connectionConfiguration.m)) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.n), java.lang.Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.h), java.lang.Boolean.valueOf(this.m), java.lang.Boolean.valueOf(this.n)});
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionConfiguration[ Name=");
        sb.append(this.a);
        sb.append(", Address=");
        java.lang.String str = this.b;
        java.lang.String strConcat = "{invalid address}";
        if (str != null && str.length() == 17) {
            strConcat = "XX:XX:XX:XX:".concat(java.lang.String.valueOf(str.substring(12)));
        }
        sb.append(strConcat);
        sb.append(", Type=");
        sb.append(this.c);
        sb.append(", Role=");
        sb.append(this.d);
        sb.append(", Enabled=");
        sb.append(this.e);
        sb.append(", IsConnected=");
        sb.append(this.f);
        sb.append(", PeerNodeId=");
        sb.append(this.g);
        sb.append(", BtlePriority=");
        sb.append(this.h);
        sb.append(", NodeId=");
        sb.append(this.i);
        sb.append(", PackageName=");
        sb.append(this.j);
        sb.append(", ConnectionRetryStrategy=");
        sb.append(this.k);
        sb.append(", allowedConfigPackages=");
        sb.append(this.l);
        sb.append(", Migrating=");
        sb.append(this.m);
        sb.append(", DataItemSyncEnabled=");
        sb.append(this.n);
        sb.append(", ConnectionRestrictions=");
        sb.append(this.o);
        sb.append(", removeConnectionWhenBondRemovedByUser=");
        sb.append(this.p);
        sb.append(", maxSupportedRemoteAndroidSdkVersion=");
        sb.append(this.r);
        sb.append(", runtimeType=");
        sb.append(this.s);
        sb.append(", skipConnectingIfDeviceNotBonded=");
        sb.append(this.t);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.l(parcel, 4, this.c);
        aais.l(parcel, 5, this.d);
        aais.h(parcel, 6, this.e);
        aais.h(parcel, 7, this.f);
        aais.A(parcel, 8, this.g);
        aais.h(parcel, 9, this.h);
        aais.A(parcel, 10, this.i);
        aais.A(parcel, 11, this.j);
        aais.l(parcel, 12, this.k);
        aais.C(parcel, 13, this.l);
        aais.h(parcel, 14, this.m);
        aais.h(parcel, 15, this.n);
        aais.z(parcel, 16, this.o, i);
        aais.h(parcel, 17, this.p);
        aais.z(parcel, 18, this.q, i);
        aais.l(parcel, 19, this.r);
        aais.l(parcel, 20, this.s);
        aais.h(parcel, 21, this.t);
        aais.g(parcel, iF);
    }
}
