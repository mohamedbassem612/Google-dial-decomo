package com.google.android.libraries.micore.superpacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class SuperpackManifest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(6);

    public static defpackage.adgm e() {
        defpackage.adgm adgmVar = new defpackage.adgm();
        adgmVar.e(0);
        adgmVar.c(defpackage.aike.a);
        return adgmVar;
    }

    public abstract int a();

    public abstract defpackage.aigf b();

    public abstract java.lang.String c();

    public com.google.android.libraries.micore.superpacks.base.VersionedName d() {
        java.lang.String strC = c();
        int iA = a();
        defpackage.adik.k("version", iA);
        return new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(strC, iA);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.micore.superpacks.SuperpackManifest) {
            com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifest = (com.google.android.libraries.micore.superpacks.SuperpackManifest) obj;
            com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameD = d();
            if (versionedNameD != null) {
                return versionedNameD.equals(superpackManifest.d());
            }
            if (superpackManifest.d() == null) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Collection f() {
        return b().values();
    }

    public final int hashCode() {
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameD = d();
        if (versionedNameD != null) {
            return versionedNameD.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return d().toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeInt(a());
        parcel.writeParcelableArray((com.google.android.libraries.micore.superpacks.common.PackManifest[]) f().toArray(new com.google.android.libraries.micore.superpacks.common.PackManifest[0]), i);
    }
}
