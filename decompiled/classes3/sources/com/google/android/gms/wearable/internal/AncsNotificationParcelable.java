package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AncsNotificationParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(1);
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final java.lang.String k;
    private final java.lang.String l;

    public AncsNotificationParcelable(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, byte b, byte b2, byte b3, byte b4, java.lang.String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.l = str6;
        this.g = b;
        this.h = b2;
        this.i = b3;
        this.j = b4;
        this.k = str7;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.wearable.internal.AncsNotificationParcelable ancsNotificationParcelable = (com.google.android.gms.wearable.internal.AncsNotificationParcelable) obj;
            if (this.a == ancsNotificationParcelable.a && this.g == ancsNotificationParcelable.g && this.h == ancsNotificationParcelable.h && this.i == ancsNotificationParcelable.i && this.j == ancsNotificationParcelable.j && this.b.equals(ancsNotificationParcelable.b) && ((str = this.c) == null ? ancsNotificationParcelable.c == null : str.equals(ancsNotificationParcelable.c)) && this.d.equals(ancsNotificationParcelable.d) && this.e.equals(ancsNotificationParcelable.e) && this.f.equals(ancsNotificationParcelable.f) && ((str2 = this.l) == null ? ancsNotificationParcelable.l == null : str2.equals(ancsNotificationParcelable.l))) {
                java.lang.String str3 = this.k;
                if (str3 != null) {
                    return str3.equals(ancsNotificationParcelable.k);
                }
                if (ancsNotificationParcelable.k == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a + 31) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode2 = ((((((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        java.lang.String str2 = this.l;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        java.lang.String str3 = this.k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AncsNotificationParcelable{, id=" + this.a + ", appId='" + this.b + "', dateTime='" + this.c + "', eventId=" + ((int) this.g) + ", eventFlags=" + ((int) this.h) + ", categoryId=" + ((int) this.i) + ", categoryCount=" + ((int) this.j) + ", packageName='" + this.k + "'}";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        java.lang.String str = this.b;
        aais.A(parcel, 3, str);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.A(parcel, 6, this.e);
        aais.A(parcel, 7, this.f);
        java.lang.String str2 = this.l;
        if (str2 != null) {
            str = str2;
        }
        aais.A(parcel, 8, str);
        aais.i(parcel, 9, this.g);
        aais.i(parcel, 10, this.h);
        aais.i(parcel, 11, this.i);
        aais.i(parcel, 12, this.j);
        aais.A(parcel, 13, this.k);
        aais.g(parcel, iF);
    }
}
