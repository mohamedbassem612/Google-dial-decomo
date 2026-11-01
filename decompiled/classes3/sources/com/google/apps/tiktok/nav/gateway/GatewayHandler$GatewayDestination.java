package com.google.apps.tiktok.nav.gateway;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GatewayHandler$GatewayDestination implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(7);
    public final int a;
    public final java.util.List b;
    public final android.app.PendingIntent c;
    public final boolean d;
    public final java.lang.Integer e;
    private final java.lang.String f;

    public GatewayHandler$GatewayDestination(int i, java.util.List list, java.lang.String str, boolean z, java.lang.Integer num, android.app.PendingIntent pendingIntent) {
        this.a = i;
        this.b = list;
        this.f = str;
        this.d = z;
        this.e = num;
        this.c = pendingIntent;
    }

    public static com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination a(java.lang.String str) {
        return new com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination(4, aike.a, str, false, null, null);
    }

    public static com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination b(android.content.Intent intent) {
        return new com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination(1, aify.p(intent), null, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeString(this.f);
        parcel.writeInt(this.d ? 1 : 0);
        java.lang.Integer num = this.e;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        android.app.PendingIntent pendingIntent = this.c;
        if (pendingIntent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(pendingIntent, i);
        }
    }
}
