package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class k {
    public final java.util.ArrayList a = new java.util.ArrayList();

    public final void a(defpackage.l lVar) {
        float f;
        float f2;
        float f3;
        java.util.ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= lVar.e) {
                break;
            }
            defpackage.m mVar = ((defpackage.m[]) lVar.g.c)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                mVar.e[i2] = 0.0f;
            }
            mVar.e[mVar.c] = 1.0f;
            if (mVar.h == 4) {
                arrayList.add(mVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            defpackage.m mVar2 = (defpackage.m) arrayList.get(i3);
            int i4 = mVar2.b;
            if (i4 != -1) {
                defpackage.i iVar = lVar.c[i4].d;
                int i5 = iVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    defpackage.m mVarD = iVar.d(i6);
                    if (mVarD == null) {
                        f3 = f;
                    } else {
                        float fB = iVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = mVarD.e;
                            fArr[i7] = fArr[i7] + (mVar2.e[i7] * fB);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(mVarD)) {
                            arrayList.add(mVarD);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    mVar2.e[i8] = f2;
                }
            } else {
                f2 = f;
            }
            i3++;
            f = f2;
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        java.lang.String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            defpackage.m mVar = (defpackage.m) arrayList.get(i);
            java.util.Objects.toString(mVar);
            java.lang.String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = mVar.e;
                if (i2 < 6) {
                    strConcat2 = (strConcat2 + fArr[i2]).concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}
