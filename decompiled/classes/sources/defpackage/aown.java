package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aown extends defpackage.apbi {
    private final defpackage.aowe c;
    private final defpackage.zzx d;

    public aown(long j, defpackage.aown aownVar, defpackage.aowe aoweVar, int i) {
        super(j, aownVar, i);
        this.c = aoweVar;
        this.d = new defpackage.zzx(defpackage.aowg.b << 1);
    }

    @Override // defpackage.apbi
    public final int a() {
        return defpackage.aowg.b;
    }

    public final java.lang.Object b(int i, java.lang.Object obj) {
        return this.d.aa((i << 1) + 1).a(obj);
    }

    public final java.lang.Object c(int i) {
        return this.d.aa(i << 1).a;
    }

    public final java.lang.Object d(int i) {
        return this.d.aa((i << 1) + 1).a;
    }

    public final java.lang.Object e(int i) {
        java.lang.Object objC = c(i);
        h(i, null);
        return objC;
    }

    public final defpackage.aowe f() {
        defpackage.aowe aoweVar = this.c;
        if (aoweVar == null) {
            defpackage.aooh.g();
        }
        return aoweVar;
    }

    public final void g(int i, boolean z) {
        if (z) {
            f().v((this.b * ((long) defpackage.aowg.b)) + ((long) i));
        }
        r();
    }

    public final void h(int i, java.lang.Object obj) {
        this.d.aa(i << 1).b(obj);
    }

    public final void i(int i, java.lang.Object obj) {
        this.d.aa((i << 1) + 1).c(obj);
    }

    public final boolean j(int i, java.lang.Object obj, java.lang.Object obj2) {
        return this.d.aa((i << 1) + 1).d(obj, obj2);
    }

    @Override // defpackage.apbi
    public final void k(int i, defpackage.aolr aolrVar) {
        defpackage.aonj aonjVar;
        defpackage.aonj aonjVar2;
        int i2 = defpackage.aowg.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        java.lang.Object objC = c(i);
        while (true) {
            java.lang.Object objD = d(i);
            if ((objD instanceof defpackage.aovq) || (objD instanceof defpackage.aoww)) {
                if (j(i, objD, z ? defpackage.aowg.j : defpackage.aowg.k)) {
                    h(i, null);
                    g(i, !z);
                    if (!z || (aonjVar = f().a) == null) {
                        return;
                    }
                    aoil.e(aonjVar, objC, aolrVar);
                    return;
                }
            } else {
                if (objD == defpackage.aowg.j || objD == defpackage.aowg.k) {
                    break;
                }
                if (objD != defpackage.aowg.g && objD != defpackage.aowg.f) {
                    if (objD == defpackage.aowg.i || objD == defpackage.aowg.d || objD == defpackage.aowg.l) {
                        return;
                    }
                    java.util.Objects.toString(objD);
                    throw new java.lang.IllegalStateException("unexpected state: ".concat(java.lang.String.valueOf(objD)));
                }
            }
        }
        h(i, null);
        if (!z || (aonjVar2 = f().a) == null) {
            return;
        }
        aoil.e(aonjVar2, objC, aolrVar);
    }
}
