package com.google.android.libraries.micore.superpacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class SyncResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(2);
    public static final java.util.Comparator a = new defpackage.aeov(1);

    public static aify h(android.os.Parcelable[] parcelableArr) {
        if (parcelableArr == null) {
            return aike.a;
        }
        aift aiftVar = new aift(4);
        for (android.os.Parcelable parcelable : parcelableArr) {
            aiftVar.i((com.google.android.libraries.micore.superpacks.common.PackManifest) parcelable);
        }
        return aiftVar.h();
    }

    public static final java.lang.String i(java.util.List list) {
        return adik.e(list, new defpackage.adfe(4));
    }

    public abstract aify a();

    public abstract aify b();

    public abstract aify c();

    public abstract aify d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract byte[] g();

    public java.lang.String toString() {
        ahym ahymVar = new ahym("");
        ahymVar.b("old", c());
        ahymVar.b("new", b());
        ahymVar.g("metadata", g() != null);
        ahymVar.g("last batch", f());
        return ahymVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelableArray((com.google.android.libraries.micore.superpacks.common.PackManifest[]) c().toArray(new com.google.android.libraries.micore.superpacks.common.PackManifest[0]), i);
        parcel.writeParcelableArray((com.google.android.libraries.micore.superpacks.common.PackManifest[]) b().toArray(new com.google.android.libraries.micore.superpacks.common.PackManifest[0]), i);
        parcel.writeParcelableArray((com.google.android.libraries.micore.superpacks.common.PackManifest[]) a().toArray(new com.google.android.libraries.micore.superpacks.common.PackManifest[0]), i);
        parcel.writeParcelableArray((com.google.android.libraries.micore.superpacks.common.PackManifest[]) d().toArray(new com.google.android.libraries.micore.superpacks.common.PackManifest[0]), i);
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeByteArray(g());
    }
}
