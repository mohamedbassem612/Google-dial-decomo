package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CitationMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(5);
    public final aify a;

    public CitationMetadata(java.util.List list) {
        this.a = aify.n(list);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.g(parcel, iF);
    }
}
