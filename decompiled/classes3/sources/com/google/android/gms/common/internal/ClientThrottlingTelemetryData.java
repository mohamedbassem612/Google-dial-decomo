package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ClientThrottlingTelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(18);
    private final java.util.List a;

    /* JADX INFO: compiled from: PG */
    public class ClientThrottlingEventData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(17);
        public final int a;
        public final java.lang.String b;
        public final int c;
        public final int d;

        public ClientThrottlingEventData(int i, java.lang.String str, int i2, int i3) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int i2 = this.a;
            int iF = aais.f(parcel, 20293);
            aais.l(parcel, 1, i2);
            aais.A(parcel, 2, this.b);
            aais.l(parcel, 3, this.c);
            int i3 = this.d;
            aais.l(parcel, 4, i3 > 0 ? i3 : 1);
            aais.g(parcel, iF);
        }
    }

    public ClientThrottlingTelemetryData(java.util.List list) {
        this.a = list;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aify aifyVar = this.a;
        if (aifyVar == null) {
            aifyVar = aike.a;
        }
        aais.E(parcel, 1, aifyVar);
        aais.g(parcel, iF);
    }
}
