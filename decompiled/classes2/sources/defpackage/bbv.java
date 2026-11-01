package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bbv implements bdy {
    public final defpackage.bbt a;
    public final aaif b;
    private final defpackage.bcl c;

    public bbv(defpackage.bcl bclVar, defpackage.bbt bbtVar, aaif aaifVar) {
        this.c = bclVar;
        this.a = bbtVar;
        this.b = aaifVar;
    }

    public final int a(java.lang.Object obj) {
        return this.b.i(obj);
    }

    public final int b() {
        return this.a.d();
    }

    public final java.lang.Object c(int i) {
        return this.a.e(i);
    }

    public final java.lang.Object d(int i) {
        java.lang.Object objJ = this.b.j(i);
        return objJ == null ? this.a.f(i) : objJ;
    }

    public final void e(int i, java.lang.Object obj, cav cavVar, int i2) {
        int i3;
        int i4;
        java.lang.Object obj2;
        int i5 = i2 & 6;
        cav cavVarB = cavVar.b(1493551140);
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
            den.aC(obj2, i4, this.c.j, cfo.j(726189336, new defpackage.ajs(this, i, 3), cavVarB), cavVarB, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112) | 512);
        } else {
            i4 = i;
            obj2 = obj;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bbu(this, i4, obj2, i2, 0);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bbv) {
            return aooh.n(this.a, ((defpackage.bbv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
