package com.google.android.libraries.micore.superpacks.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class Slice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(11);

    public static defpackage.adiv g() {
        defpackage.adiv adivVar = new defpackage.adiv();
        adivVar.g(0);
        adivVar.d(0);
        adivVar.c(0);
        adivVar.e(0);
        adivVar.b(0);
        return adivVar;
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

    public abstract com.google.android.libraries.micore.superpacks.common.PackManifest f();

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[PHI: r0 r1 r6
      0x003a: PHI (r0v4 int) = (r0v3 int), (r0v3 int), (r0v5 int), (r0v6 int) binds: [B:9:0x002b, B:11:0x002e, B:16:0x0039, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v0 int), (r1v2 int) binds: [B:9:0x002b, B:11:0x002e, B:16:0x0039, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r6v2 int) = (r6v1 int), (r6v5 int), (r6v5 int), (r6v5 int) binds: [B:9:0x002b, B:11:0x002e, B:16:0x0039, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.lang.String h(boolean z, boolean z2) {
        java.lang.String string;
        java.lang.String strA;
        defpackage.adhw adhwVarP = f().p();
        if (z) {
            string = adhwVarP.e(z2);
        } else {
            string = z2 ? adhwVarP.toString() : ((defpackage.adhb) adhwVarP).b;
        }
        int iC = c();
        int iB = b();
        int iD = d();
        int iA = a();
        if (iC == 0) {
            iC = 0;
            if (iB != 0) {
                strA = defpackage.adik.a(iC, iB, iD, iA);
            } else {
                if (iD != 0) {
                    iB = 0;
                } else if (iA != 0) {
                    iB = 0;
                    iD = 0;
                } else {
                    strA = null;
                }
                strA = defpackage.adik.a(iC, iB, iD, iA);
            }
        } else {
            strA = defpackage.adik.a(iC, iB, iD, iA);
        }
        int iE = e();
        java.lang.String strG = iE != 0 ? defpackage.adik.g(iE) : null;
        if (strA == null && strG == null) {
            return string;
        }
        java.lang.String strConcat = "{".concat(java.lang.String.valueOf(string));
        if (strA != null) {
            strConcat = defpackage.a.br(strA, strConcat, ", ");
        }
        if (strG != null) {
            strConcat = defpackage.a.br(strG, strConcat, ", ");
        }
        return strConcat.concat("}");
    }

    public java.lang.String toString() {
        return h(false, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(f(), i);
        parcel.writeInt(c());
        parcel.writeInt(b());
        parcel.writeInt(d());
        parcel.writeInt(a());
        parcel.writeInt(e());
    }
}
