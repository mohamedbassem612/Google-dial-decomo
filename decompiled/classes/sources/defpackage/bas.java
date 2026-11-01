package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bas implements defpackage.bdy {
    public final defpackage.bar a;
    public final defpackage.aaif b;
    public final defpackage.nf c;
    private final defpackage.bbh d;

    public bas(defpackage.bbh bbhVar, defpackage.bar barVar, defpackage.nf nfVar, defpackage.aaif aaifVar) {
        this.d = bbhVar;
        this.a = barVar;
        this.c = nfVar;
        this.b = aaifVar;
    }

    @Override // defpackage.bdy
    public final int a(java.lang.Object obj) {
        return this.b.i(obj);
    }

    @Override // defpackage.bdy
    public final int b() {
        return this.a.d();
    }

    @Override // defpackage.bdy
    public final java.lang.Object c(int i) {
        return this.a.e(i);
    }

    @Override // defpackage.bdy
    public final java.lang.Object d(int i) {
        java.lang.Object objJ = this.b.j(i);
        return objJ == null ? this.a.f(i) : objJ;
    }

    @Override // defpackage.bdy
    public final void e(int i, java.lang.Object obj, defpackage.cav cavVar, int i2) {
        int i3;
        int i4;
        java.lang.Object obj2;
        int i5 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-462424778);
        if (i5 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.D(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.B(this) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            i4 = i;
            obj2 = obj;
            defpackage.den.aC(obj2, i4, this.d.m, defpackage.cfo.j(-824725566, new defpackage.dfj(this, i, 1), cavVarB), cavVarB, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112) | 512);
        } else {
            i4 = i;
            obj2 = obj;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bbu(this, i4, obj2, i2, 1);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bas) {
            return defpackage.aooh.n(this.a, ((defpackage.bas) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
