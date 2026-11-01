package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CitationSource extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(6);
    public final int a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;

    public CitationSource(int i, int i2, java.lang.String str, java.lang.String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.g(parcel, iF);
    }
}
