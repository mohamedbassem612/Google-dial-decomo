package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMAudio extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable, java.lang.AutoCloseable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(15);
    public final android.os.ParcelFileDescriptor a;
    public final java.lang.String b;

    public LLMAudio(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str) {
        this.a = parcelFileDescriptor;
        this.b = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.xhp.s(this.a);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
