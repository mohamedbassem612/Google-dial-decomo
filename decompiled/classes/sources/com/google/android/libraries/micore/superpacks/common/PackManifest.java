package com.google.android.libraries.micore.superpacks.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class PackManifest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR;
    public static final defpackage.aify j;
    public static final java.util.Date k;
    public static final defpackage.agab l;

    static {
        defpackage.agab agabVar = new defpackage.agab((int[]) null);
        l = agabVar;
        j = defpackage.aify.p(agabVar);
        k = new java.util.Date(Long.MAX_VALUE);
        CREATOR = new defpackage.aaso(10);
    }

    public static defpackage.adis q() {
        defpackage.adis adisVar = new defpackage.adis();
        adisVar.m(0L);
        adisVar.g(0L);
        adisVar.j(0);
        adisVar.h(0);
        adisVar.n(true);
        adisVar.i(k);
        return adisVar;
    }

    public static java.lang.String r(java.lang.String str) {
        java.util.List listJ = defpackage.ahzf.d("_").j(str);
        java.lang.String str2 = (java.lang.String) listJ.get(0);
        java.lang.String str3 = listJ.size() > 1 ? (java.lang.String) listJ.get(1) : null;
        java.lang.String str4 = (java.lang.String) defpackage.ahzf.d("-").j(str2).get(0);
        return str3 != null ? defpackage.a.bE(str3, (byte) 95, str4) : str4;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract com.google.android.libraries.micore.superpacks.base.VersionedName e();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.micore.superpacks.common.PackManifest) {
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) obj;
            if (p() != null) {
                return p().equals(packManifest.p());
            }
            if (packManifest.p() == null) {
                return true;
            }
        }
        return false;
    }

    public abstract defpackage.adis f();

    public abstract defpackage.aify g();

    public abstract defpackage.aify h();

    public final int hashCode() {
        if (p() != null) {
            return p().hashCode();
        }
        return 0;
    }

    public abstract defpackage.aigf i();

    public abstract java.lang.String j();

    public abstract java.lang.String k();

    public abstract java.lang.String l();

    public abstract java.util.Date m();

    public abstract boolean n();

    public defpackage.adhv o() {
        defpackage.adhv adhvVar = defpackage.adhv.a;
        defpackage.ajiu ajiuVar = new defpackage.ajiu((char[]) null);
        ajiuVar.g().l(i());
        return ajiuVar.f();
    }

    public defpackage.adhw p() {
        java.lang.String strK = k();
        java.lang.String strJ = j();
        int i = defpackage.adhw.c;
        return new defpackage.adhb(strK, strJ);
    }

    public final java.lang.String toString() {
        return j();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(e(), i);
        parcel.writeString(k());
        parcel.writeString(j());
        parcel.writeLong(d());
        parcel.writeLong(c());
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeStringList(g());
        parcel.writeStringList(h());
        parcel.writeString(l());
        parcel.writeLong(m().getTime());
        parcel.writeString(o().b("label", null));
    }
}
