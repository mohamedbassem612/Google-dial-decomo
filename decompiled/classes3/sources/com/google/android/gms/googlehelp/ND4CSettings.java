package com.google.android.gms.googlehelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ND4CSettings extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(2);
    boolean a;
    java.lang.String b;

    public ND4CSettings(boolean z, java.lang.String str) {
        this.a = z;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.g(parcel, iF);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
