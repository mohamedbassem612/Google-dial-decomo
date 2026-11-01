package com.google.android.gms.clearcut.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class PlayLoggerContext extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(6);
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final boolean e;
    public final java.lang.String f;
    public final boolean g;
    public final int h;
    public final java.lang.Integer i;
    public final boolean j;
    public final int k;

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayLoggerContext(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2, defpackage.zzv zzvVar) {
        int i3;
        boolean zA = zzvVar.a(defpackage.zzw.ANDROID_ID);
        boolean zEquals = zzvVar.equals(defpackage.zzv.b);
        if (i2 == 0) {
            throw null;
        }
        if (zzvVar.equals(defpackage.zzv.a)) {
            i3 = 0;
        } else {
            defpackage.ailj it = zzvVar.d.iterator();
            int i4 = -1;
            while (it.hasNext()) {
                i4 &= ~((defpackage.zzw) it.next()).e;
            }
            i3 = i4;
        }
        this(str, i, -1, str3, zA, str2, zEquals, i2 - 1, null, false, i3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.clearcut.internal.PlayLoggerContext) {
            com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = (com.google.android.gms.clearcut.internal.PlayLoggerContext) obj;
            if (j$.util.Objects.equals(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && j$.util.Objects.equals(this.f, playLoggerContext.f) && j$.util.Objects.equals(this.d, playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && j$.util.Objects.equals(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.f, this.d, java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.g), java.lang.Integer.valueOf(this.h), this.i, java.lang.Boolean.valueOf(this.j), java.lang.Integer.valueOf(this.k)});
    }

    public final java.lang.String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        java.lang.String str = this.a;
        if (str != null) {
            int iF2 = defpackage.aais.f(parcel, 2);
            parcel.writeString(str);
            defpackage.aais.g(parcel, iF2);
        }
        int i2 = this.b;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        int i3 = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        java.lang.String str2 = this.d;
        if (str2 != null) {
            int iF3 = defpackage.aais.f(parcel, 5);
            parcel.writeString(str2);
            defpackage.aais.g(parcel, iF3);
        }
        boolean z = this.e;
        parcel.writeInt(262151);
        parcel.writeInt(z ? 1 : 0);
        java.lang.String str3 = this.f;
        if (str3 != null) {
            int iF4 = defpackage.aais.f(parcel, 8);
            parcel.writeString(str3);
            defpackage.aais.g(parcel, iF4);
        }
        boolean z2 = this.g;
        parcel.writeInt(262153);
        parcel.writeInt(z2 ? 1 : 0);
        int i4 = this.h;
        parcel.writeInt(262154);
        parcel.writeInt(i4);
        defpackage.aais.w(parcel, 11, this.i);
        boolean z3 = this.j;
        parcel.writeInt(262156);
        parcel.writeInt(z3 ? 1 : 0);
        int i5 = this.k;
        parcel.writeInt(262157);
        parcel.writeInt(i5);
        defpackage.aais.g(parcel, iF);
    }

    public PlayLoggerContext(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, java.lang.String str3, boolean z2, int i3, java.lang.Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }
}
