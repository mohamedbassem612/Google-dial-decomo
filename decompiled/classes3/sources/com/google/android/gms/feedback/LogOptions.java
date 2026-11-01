package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LogOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(18);
    final java.lang.String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final com.google.android.gms.feedback.ServiceDumpRequest[] f;
    final boolean g;

    public LogOptions(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, com.google.android.gms.feedback.ServiceDumpRequest[] serviceDumpRequestArr, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
        this.g = z5;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.Parcelable[], com.google.android.gms.feedback.ServiceDumpRequest[]] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.h(parcel, 3, this.b);
        aais.h(parcel, 4, this.c);
        aais.h(parcel, 5, this.d);
        aais.h(parcel, 6, this.e);
        aais.D(parcel, 7, (android.os.Parcelable[]) this.f, i);
        aais.h(parcel, 8, this.g);
        aais.g(parcel, iF);
    }
}
