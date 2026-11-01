package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ChannelImpl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient$Channel {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(7);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public ChannelImpl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ahvr.ci(str);
        this.a = str;
        ahvr.ci(str2);
        this.b = str2;
        ahvr.ci(str3);
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.internal.ChannelImpl) {
            com.google.android.gms.wearable.internal.ChannelImpl channelImpl = (com.google.android.gms.wearable.internal.ChannelImpl) obj;
            if (this.a.equals(channelImpl.a) && j$.util.Objects.equals(channelImpl.b, this.b) && j$.util.Objects.equals(channelImpl.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        java.lang.String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + strTrim + ", nodeId=" + this.b + ", path=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
