package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class BasePriority implements android.os.Parcelable {
    public static final com.google.android.libraries.micore.superpacks.base.BasePriority a = new com.google.android.libraries.micore.superpacks.base.AutoValue_BasePriority(0, 1);
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(7);

    public static void d(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Invalid priority value:"));
        }
    }

    public abstract int a();

    public abstract int b();

    public final int c(int i) {
        return a() == 0 ? i + b() : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        int iA = a();
        int iB = b();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        sb.append(iA == 1 ? "absolute:" : "relative:");
        sb.append(iB);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(a());
    }
}
