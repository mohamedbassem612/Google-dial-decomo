package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class WebIconParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(0);
    public final java.lang.String a;
    public final int b;
    public final int c;

    public WebIconParcelable(java.lang.String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.wearable.internal.WebIconParcelable webIconParcelable = (com.google.android.gms.wearable.internal.WebIconParcelable) obj;
            if (this.b == webIconParcelable.b && this.c == webIconParcelable.c && j$.util.Objects.equals(this.a, webIconParcelable.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "WebIconParcelable{%dx%d - %s}", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.a);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, this.a);
        aais.l(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
