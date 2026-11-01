package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMBlob extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(16);
    public final byte[] a;
    public final java.lang.String b;

    public LLMBlob(byte[] bArr, java.lang.String str) {
        this.a = bArr;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iF = aais.f(parcel, 20293);
        aais.q(parcel, 1, bArr);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
