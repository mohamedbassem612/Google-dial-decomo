package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NodeMigratedEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(3);
    public final java.lang.String a;
    public final com.google.android.gms.common.data.DataHolder b;

    public NodeMigratedEventParcelable(java.lang.String str, com.google.android.gms.common.data.DataHolder dataHolder) {
        this.a = str;
        this.b = dataHolder;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
