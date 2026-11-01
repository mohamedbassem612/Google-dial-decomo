package com.google.android.libraries.abuse.hades.signals.gmsclient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ReadSignalResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(18);
    public final com.google.android.libraries.abuse.hades.signals.gmsclient.SignalValue a;
    public final java.lang.String b;

    static {
        new com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult(null, "");
    }

    public ReadSignalResult(com.google.android.libraries.abuse.hades.signals.gmsclient.SignalValue signalValue, java.lang.String str) {
        aooh.f(str, "sourcePackage");
        this.a = signalValue;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
