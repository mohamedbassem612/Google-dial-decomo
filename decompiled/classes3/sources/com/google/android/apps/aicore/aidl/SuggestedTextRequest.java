package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SuggestedTextRequest extends com.google.android.apps.aicore.aidl.AbstractRequest {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(9);
    public final aify a;
    public final int b;

    public SuggestedTextRequest(java.util.List list, int i) {
        this.a = aify.n(list);
        this.b = i;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.l(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
