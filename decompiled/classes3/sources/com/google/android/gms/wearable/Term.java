package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Term extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(16);
    public final int a;
    public final java.lang.String b;
    public final boolean c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;

    public Term(int i, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i2) {
        this.a = i;
        this.d = str2;
        this.c = z;
        this.b = str;
        this.e = str3;
        this.f = i2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.l(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
