package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class RegistrationConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(8);

    public static defpackage.adhz j() {
        defpackage.adhz adhzVar = new defpackage.adhz();
        adhzVar.b = null;
        adhzVar.e(0);
        adhzVar.d(0);
        adhzVar.g(0);
        adhzVar.c(0);
        adhzVar.h(0);
        adhzVar.f(defpackage.adhv.a);
        return adhzVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract int e();

    public abstract defpackage.adhv f();

    public abstract defpackage.aify g();

    public abstract java.lang.String h();

    public abstract java.lang.String i();

    public java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.c();
        ahymVar.b("url", i());
        ahymVar.b("const", defpackage.adik.a(c(), b(), d(), a()));
        ahymVar.b("flags", defpackage.adik.g(e()));
        ahymVar.b("scheme", h());
        ahymVar.b("val", g());
        ahymVar.e("extras", f().b.keySet().size());
        return ahymVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(i());
        parcel.writeString(h());
        parcel.writeInt(c());
        parcel.writeInt(b());
        parcel.writeInt(d());
        parcel.writeInt(a());
        parcel.writeInt(e());
        parcel.writeStringList(g());
    }
}
