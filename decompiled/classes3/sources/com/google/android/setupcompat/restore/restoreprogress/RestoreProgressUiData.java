package com.google.android.setupcompat.restore.restoreprogress;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RestoreProgressUiData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(16);
    public final defpackage.aggc a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final java.lang.String n;
    public final java.lang.String o;
    public final boolean p;
    public final java.lang.String q;
    public final java.lang.String r;
    public final java.lang.String s;

    public RestoreProgressUiData(defpackage.aggc aggcVar, boolean z, int i, int i2, int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, boolean z3, boolean z4, boolean z5, int i4, java.lang.String str4, java.lang.String str5, boolean z6, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        aooh.f(aggcVar, "progressUiType");
        this.a = aggcVar;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = i4;
        this.n = str4;
        this.o = str5;
        this.p = z6;
        this.q = str6;
        this.r = str7;
        this.s = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.setupcompat.restore.restoreprogress.RestoreProgressUiData) {
            com.google.android.setupcompat.restore.restoreprogress.RestoreProgressUiData restoreProgressUiData = (com.google.android.setupcompat.restore.restoreprogress.RestoreProgressUiData) obj;
            if (this.a == restoreProgressUiData.a && this.b == restoreProgressUiData.b && this.c == restoreProgressUiData.c && this.d == restoreProgressUiData.d && this.e == restoreProgressUiData.e && aooh.n(this.f, restoreProgressUiData.f) && aooh.n(this.g, restoreProgressUiData.g) && aooh.n(this.h, restoreProgressUiData.h) && this.i == restoreProgressUiData.i && this.j == restoreProgressUiData.j && this.k == restoreProgressUiData.k && this.l == restoreProgressUiData.l && this.m == restoreProgressUiData.m && aooh.n(this.n, restoreProgressUiData.n) && aooh.n(this.o, restoreProgressUiData.o) && this.p == restoreProgressUiData.p && aooh.n(this.q, restoreProgressUiData.q) && aooh.n(this.r, restoreProgressUiData.r) && aooh.n(this.s, restoreProgressUiData.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.f;
        int iL = (((((((((iHashCode + anty.L(this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.g;
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.h;
        int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + anty.L(this.i)) * 31) + anty.L(this.j)) * 31) + anty.L(this.k)) * 31) + anty.L(this.l)) * 31) + this.m) * 31;
        java.lang.String str4 = this.n;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.o;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + anty.L(this.p)) * 31;
        java.lang.String str6 = this.q;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.r;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.s;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "RestoreProgressUiData(progressUiType=" + this.a + ", progressIndeterminate=" + this.b + ", progressValue=" + this.c + ", progressIcon=" + this.d + ", bottomSheetIcon=" + this.e + ", bottomSheetTitle=" + this.f + ", bottomSheetDescription=" + this.g + ", bottomSheetButtonText=" + this.h + ", bottomSheetProgressBarVisible=" + this.i + ", bottomSheetCardVisible=" + this.j + ", bottomSheetCardHighlighted=" + this.k + ", bottomSheetCardShowIndicator=" + this.l + ", bottomSheetCardIcon=" + this.m + ", bottomSheetCardTitle=" + this.n + ", bottomSheetCardDescription=" + this.o + ", toolTipVisible=" + this.p + ", toolTipTitle=" + this.q + ", toolTipDescription=" + this.r + ", toolTipButtonText=" + this.s + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }
}
