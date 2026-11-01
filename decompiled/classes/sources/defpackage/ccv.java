package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ccv implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.runtime.ParcelableSnapshotMutableState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        defpackage.cdu cduVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        java.lang.Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            cduVar = defpackage.cdu.b;
        } else if (i == 1) {
            cduVar = defpackage.cdu.c;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException(defpackage.a.bs(i, "Unsupported MutableState policy ", " was restored"));
            }
            cduVar = defpackage.cdu.a;
        }
        return new androidx.compose.runtime.ParcelableSnapshotMutableState(value, cduVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new androidx.compose.runtime.ParcelableSnapshotMutableState[i];
    }
}
