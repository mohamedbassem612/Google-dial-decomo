package com.google.android.libraries.micore.superpacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class SlicingResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR;

    static {
        defpackage.adgk adgkVarE = e();
        adgkVarE.c(true);
        adgkVarE.a = null;
        adgkVarE.a();
        CREATOR = new defpackage.aaso(5);
    }

    public static defpackage.adgk e() {
        defpackage.adgk adgkVar = new defpackage.adgk();
        adgkVar.c(true);
        return adgkVar;
    }

    public abstract defpackage.aify a();

    public abstract boolean b();

    public abstract byte[] c();

    public defpackage.aify d() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.b("slices", a());
        ahymVar.g("last batch", b());
        ahymVar.g("sync metadata", c() != null);
        return ahymVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelableArray((com.google.android.libraries.micore.superpacks.common.Slice[]) a().toArray(new com.google.android.libraries.micore.superpacks.common.Slice[0]), i);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeByteArray(c());
    }
}
