package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(0);
    public final java.lang.String a;
    public final java.lang.String b;
    public final com.google.android.gms.wearable.internal.WebIconParcelable c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.Float f;
    public final com.google.android.gms.wearable.internal.AppWearDetailsParcelable g;

    public AppParcelable(java.lang.String str, java.lang.String str2, com.google.android.gms.wearable.internal.WebIconParcelable webIconParcelable, java.lang.String str3, java.lang.String str4, java.lang.Float f, com.google.android.gms.wearable.internal.AppWearDetailsParcelable appWearDetailsParcelable) {
        this.a = str;
        this.b = str2;
        this.c = webIconParcelable;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = appWearDetailsParcelable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.wearable.internal.AppParcelable appParcelable = (com.google.android.gms.wearable.internal.AppParcelable) obj;
            if (j$.util.Objects.equals(this.a, appParcelable.a) && j$.util.Objects.equals(this.b, appParcelable.b) && j$.util.Objects.equals(this.c, appParcelable.c) && j$.util.Objects.equals(this.d, appParcelable.d) && j$.util.Objects.equals(this.e, appParcelable.e) && j$.util.Objects.equals(this.f, appParcelable.f) && j$.util.Objects.equals(this.g, appParcelable.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final java.lang.String toString() {
        com.google.android.gms.wearable.internal.WebIconParcelable webIconParcelable = this.c;
        return "AppParcelable{title='" + this.b + "', developerName='" + this.d + "', formattedPrice='" + this.e + "', starRating=" + this.f + ", wearDetails=" + java.lang.String.valueOf(this.g) + ", deepLinkUri='" + this.a + "', icon=" + java.lang.String.valueOf(webIconParcelable) + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, this.a);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.A(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.t(parcel, 6, this.f);
        aais.z(parcel, 7, this.g, i);
        aais.g(parcel, iF);
    }
}
