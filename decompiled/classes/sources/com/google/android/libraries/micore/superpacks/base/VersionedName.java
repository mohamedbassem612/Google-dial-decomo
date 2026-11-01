package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class VersionedName implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(9);

    public static com.google.android.libraries.micore.superpacks.base.VersionedName c(java.lang.String str, int i) {
        defpackage.adik.k("version", i);
        return new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(str, i);
    }

    public abstract int a();

    public abstract java.lang.String b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = (com.google.android.libraries.micore.superpacks.base.VersionedName) obj;
        return !b().equals(versionedName.b()) ? b().compareTo(versionedName.b()) : java.lang.Integer.compare(a(), versionedName.a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return b() + '.' + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeInt(a());
    }
}
