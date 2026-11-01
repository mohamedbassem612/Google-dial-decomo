package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SummarizationBatchMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(12);
    public final aify a;
    public final java.lang.String b;
    public final com.google.android.apps.aicore.aidl.SummarizationArguments c;

    public SummarizationBatchMessage(java.util.List list, java.lang.String str, com.google.android.apps.aicore.aidl.SummarizationArguments summarizationArguments) {
        this.a = aify.n(list);
        this.b = str;
        this.c = summarizationArguments;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
