package com.google.android.gms.clearcut.sampler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SamplerConfigParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(4);
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final java.lang.String e;

    public SamplerConfigParcelable(int i, double d, int i2, int i3, java.lang.String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = airu.a;
        airr airrVar = aisb.a;
        aisa aisaVar = new aisa();
        aisaVar.k(this.a);
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(this.b);
        aisaVar.b(4, (int) jDoubleToRawLongBits);
        aisaVar.b(4, jDoubleToRawLongBits >>> 32);
        aisaVar.k(this.c);
        aisaVar.k(this.d);
        java.lang.String str = this.e;
        if (str != null) {
            aisaVar.i(str, java.nio.charset.StandardCharsets.UTF_8);
        }
        return aisaVar.o().a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.j(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.g(parcel, iF);
    }
}
