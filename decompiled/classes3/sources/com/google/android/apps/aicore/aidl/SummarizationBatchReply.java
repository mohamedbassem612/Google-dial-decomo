package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SummarizationBatchReply extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(13);
    public final aify a;
    public final java.lang.String b;
    public final int c;

    public SummarizationBatchReply(java.util.List list, java.lang.String str, int i) {
        this.a = aify.n(list);
        this.b = str;
        this.c = i;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.A(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
