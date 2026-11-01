package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ChannelEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(6);
    final com.google.android.gms.wearable.internal.ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(com.google.android.gms.wearable.internal.ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(defpackage.aavu aavuVar) {
        int i = this.b;
        if (i == 1) {
            aavuVar.g(this.a);
            return;
        }
        if (i == 2) {
            aavuVar.h(this.a);
            return;
        }
        if (i == 3) {
            aavuVar.i(this.a);
        } else if (i != 4) {
            android.util.Log.w("ChannelEventParcelable", a.bj(i, "Unknown type: "));
        } else {
            aavuVar.j(this.a);
        }
    }

    public final java.lang.String toString() {
        java.lang.String string;
        java.lang.String string2;
        int i = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        if (i == 1) {
            string = "CHANNEL_OPENED";
        } else if (i == 2) {
            string = "CHANNEL_CLOSED";
        } else if (i != 3) {
            string = i != 4 ? java.lang.Integer.toString(i) : "OUTPUT_CLOSED";
        } else {
            string = "INPUT_CLOSED";
        }
        int i2 = this.c;
        if (i2 == 0) {
            string2 = "CLOSE_REASON_NORMAL";
        } else if (i2 == 1) {
            string2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i2 != 2) {
            string2 = i2 != 3 ? java.lang.Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE";
        } else {
            string2 = "CLOSE_REASON_REMOTE_CLOSE";
        }
        return "ChannelEventParcelable[, channel=" + strValueOf + ", type=" + string + ", closeReason=" + string2 + ", appErrorCode=" + this.d + ']';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.l(parcel, 3, this.b);
        aais.l(parcel, 4, this.c);
        aais.l(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
