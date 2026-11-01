package com.google.protobuf.contrib.android;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ProtoParsers$InternalDontUse implements com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto {
    public static final android.os.Parcelable.Creator CREATOR = new agmr(11);
    private volatile byte[] a;
    private volatile albh b;

    public ProtoParsers$InternalDontUse(byte[] bArr, albh albhVar) {
        boolean z = true;
        if (bArr == null && albhVar == null) {
            z = false;
        }
        ahvr.bN(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = albhVar;
    }

    public final albh a(albh albhVar, akzq akzqVar) {
        try {
            return b(albhVar, akzqVar);
        } catch (alaz e) {
            throw new java.lang.IllegalStateException((java.lang.Throwable) e);
        }
    }

    public final albh b(albh albhVar, akzq akzqVar) {
        if (this.b == null) {
            this.b = albhVar.L().h(this.a, akzqVar).r();
        }
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.a == null) {
            int iL = this.b.l();
            byte[] bArr = new byte[iL];
            try {
                this.b.S(new akzh(bArr, 0, iL));
                this.a = bArr;
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
