package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AIFeature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(3);
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public final int i;

    public AIFeature(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, int i5, java.lang.String str3, int i6) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = str3;
        this.i = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.AIFeature) {
            com.google.android.apps.aicore.aidl.AIFeature aIFeature = (com.google.android.apps.aicore.aidl.AIFeature) obj;
            if (this.c == aIFeature.c && this.d == aIFeature.d && j$.util.Objects.equals(this.a, aIFeature.a) && this.e == aIFeature.e && this.f == aIFeature.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f)});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("name", this.a);
        ahymVarL.b("modelName", this.b);
        ahymVarL.e("type", this.c);
        ahymVarL.e("variant", this.d);
        ahymVarL.e("id", this.e);
        ahymVarL.e("version", this.f);
        ahymVarL.e("releaseStage", this.i);
        return ahymVarL.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.l(parcel, 5, this.e);
        aais.l(parcel, 6, this.f);
        aais.l(parcel, 7, this.g);
        aais.A(parcel, 8, this.h);
        aais.l(parcel, 9, this.i);
        aais.g(parcel, iF);
    }
}
