package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cle {
    public static final java.lang.Object a = new java.lang.Object();

    public static final int a(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList) {
        defpackage.clt cltVar = snapshotStateList.a;
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        }
        return ((defpackage.clm) defpackage.ckw.f(cltVar, snapshotStateList)).c;
    }

    public static final defpackage.clm b(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList) {
        defpackage.clt cltVar = snapshotStateList.a;
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        }
        return (defpackage.clm) defpackage.ckw.i(cltVar, snapshotStateList);
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bv((byte) 41, i2, i, "index (", ") is out of bound of [0, "));
        }
    }

    public static final boolean d(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, defpackage.aonj aonjVar) {
        int i;
        defpackage.chm chmVar;
        java.lang.Object objA;
        defpackage.cko ckoVarB;
        boolean z;
        do {
            java.lang.Object obj = a;
            synchronized (obj) {
                defpackage.clt cltVar = snapshotStateList.a;
                if (cltVar == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                }
                defpackage.clm clmVar = (defpackage.clm) defpackage.ckw.f(cltVar, snapshotStateList);
                i = clmVar.b;
                chmVar = clmVar.a;
            }
            if (chmVar == null) {
                defpackage.aooh.g();
            }
            cht chtVarJ = chmVar.j();
            objA = aonjVar.a(chtVarJ);
            defpackage.chm chmVarC = chtVarJ.c();
            if (defpackage.aooh.n(chmVarC, chmVar)) {
                break;
            }
            defpackage.clt cltVar2 = snapshotStateList.a;
            if (cltVar2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            }
            synchronized (defpackage.ckw.b) {
                ckoVarB = defpackage.ckw.b();
                defpackage.clm clmVar2 = (defpackage.clm) defpackage.ckw.k(cltVar2, snapshotStateList, ckoVarB);
                synchronized (obj) {
                    int i2 = clmVar2.b;
                    if (i2 == i) {
                        clmVar2.a = chmVarC;
                        z = true;
                        clmVar2.c++;
                        clmVar2.b = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.ckw.r(ckoVarB, snapshotStateList);
        } while (!z);
        return ((java.lang.Boolean) objA).booleanValue();
    }

    public static final void e() {
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
    }
}
