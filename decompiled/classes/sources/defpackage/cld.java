package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cld implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.runtime.snapshots.SnapshotStateList createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        int i = parcel.readInt();
        defpackage.bly blyVar = new defpackage.bly(parcel, classLoader, 17);
        if (i == 0) {
            return new androidx.compose.runtime.snapshots.SnapshotStateList();
        }
        cht chtVarJ = defpackage.chx.a.j();
        for (int i2 = 0; i2 < i; i2++) {
            chtVarJ.add(blyVar.a(java.lang.Integer.valueOf(i2)));
        }
        return new androidx.compose.runtime.snapshots.SnapshotStateList(chtVarJ.c());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new androidx.compose.runtime.snapshots.SnapshotStateList[i];
    }
}
