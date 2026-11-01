package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ThemeSettings extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(19);
    public int a;
    int b;

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.l(parcel, 3, this.b);
        aais.g(parcel, iF);
    }

    public ThemeSettings() {
        throw null;
    }
}
