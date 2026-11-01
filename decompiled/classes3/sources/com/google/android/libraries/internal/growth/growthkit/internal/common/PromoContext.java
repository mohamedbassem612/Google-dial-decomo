package com.google.android.libraries.internal.growth.growthkit.internal.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class PromoContext implements android.os.Parcelable {
    public static final aiof a = aiof.i("GnpSdk");
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(0);

    public static defpackage.adrp h() {
        defpackage.adrp adrpVar = new defpackage.adrp((byte[]) null);
        adrpVar.g(aikj.b);
        return adrpVar;
    }

    public abstract long a();

    public abstract aigf b();

    public abstract akhl c();

    public abstract defpackage.aksc d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract java.lang.String e();

    public abstract java.lang.String f();

    public abstract void g();

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(e());
        defpackage.akmr.s(parcel, c());
        parcel.writeLong(a());
        aigf aigfVarB = b();
        parcel.writeInt(aigfVarB.size());
        for (java.util.Map.Entry entry : aigfVarB.entrySet()) {
            parcel.writeInt(((akjb) entry.getKey()).f);
            parcel.writeParcelable((android.os.Parcelable) entry.getValue(), i);
        }
        parcel.writeString(f());
        defpackage.aksc akscVarD = d();
        parcel.writeInt(akscVarD != null ? 1 : 0);
        if (akscVarD != null) {
            defpackage.akmr.s(parcel, d());
        }
    }
}
