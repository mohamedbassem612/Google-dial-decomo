package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cnt extends defpackage.cmv implements defpackage.ddh, defpackage.dao, defpackage.dbb {
    public final defpackage.aonj a;
    public defpackage.cnt b;
    public long c;
    public defpackage.cnt d;
    private final java.lang.Object e;

    public cnt(byte[] bArr) {
        this.a = null;
        this.e = defpackage.cnr.a;
        this.c = 0L;
    }

    public final void b(ni niVar) {
        defpackage.cnt cntVar = this.b;
        if (cntVar != null) {
            cntVar.b(niVar);
        }
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    public final void d(ni niVar) {
        defpackage.ddh ddhVar;
        defpackage.cnt cntVar;
        defpackage.cnt cntVar2 = this.b;
        defpackage.cnt cntVar3 = null;
        if (cntVar2 == null || !rt.g(cntVar2, defpackage.ru.p(niVar))) {
            if (this.t.D) {
                defpackage.aoot aootVar = new defpackage.aoot();
                defpackage.den.p(this, new cns(aootVar, this, niVar));
                ddhVar = (defpackage.ddh) aootVar.a;
            } else {
                ddhVar = null;
            }
            cntVar = (defpackage.cnt) ddhVar;
        } else {
            cntVar = cntVar2;
        }
        if (cntVar != null) {
            if (cntVar2 == null) {
                cntVar.d(niVar);
            } else if (!defpackage.aooh.n(cntVar, cntVar2)) {
                if (cntVar != null) {
                    cntVar.d(niVar);
                    cntVar3 = cntVar;
                }
                if (cntVar2 != null) {
                    cntVar2.b(niVar);
                }
                cntVar = cntVar3;
            } else if (cntVar != null) {
                cntVar.d(niVar);
            }
        } else if (cntVar2 != null) {
            cntVar2.b(niVar);
        } else if (!defpackage.aooh.n(cntVar, cntVar2)) {
            if (cntVar != null) {
                cntVar.d(niVar);
                cntVar3 = cntVar;
            }
            if (cntVar2 != null) {
                cntVar2.b(niVar);
            }
            cntVar = cntVar3;
        } else if (cntVar != null) {
            cntVar.d(niVar);
        }
        this.b = cntVar;
    }

    @Override // defpackage.ddh
    public final java.lang.Object db() {
        return this.e;
    }

    @Override // defpackage.dbz
    public final void h(long j) {
        this.c = j;
    }

    @Override // defpackage.cmv
    public final void u() {
        this.d = null;
        this.b = null;
    }

    public cnt() {
        this(null);
    }

    @Override // defpackage.dbb
    public final /* synthetic */ void g(defpackage.cxi cxiVar) {
    }
}
