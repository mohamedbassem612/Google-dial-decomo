package com.google.android.libraries.abuse.hades.signals.gmsclient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ReadSignalOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(17);
    public static final com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions a = new com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions(null);
    public final java.lang.String b;

    public ReadSignalOptions(java.lang.String str) {
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        java.lang.String str = this.b;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.g(parcel, iF);
    }
}
