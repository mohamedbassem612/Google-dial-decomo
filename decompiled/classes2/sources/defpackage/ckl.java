package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ckl extends ckk {
    private final ckk l;
    private boolean m;

    public ckl(long j, ckv ckvVar, aonj aonjVar, aonj aonjVar2, ckk ckkVar) {
        super(j, ckvVar, aonjVar, aonjVar2);
        this.l = ckkVar;
        ckkVar.f();
    }

    private final void D() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.g();
    }

    public final cks c() {
        defpackage.ckl cklVar;
        ckk ckkVar = this.l;
        if (ckkVar.f || ((cko) ckkVar).j) {
            return new ckq(this);
        }
        ady adyVar = ((ckk) this).g;
        java.util.Map mapN = adyVar != null ? ckw.n(ckkVar.v(), this, ckkVar.x()) : null;
        java.lang.Object obj = ckw.b;
        synchronized (obj) {
            ckw.t(this);
            if (adyVar == null || adyVar.d == 0) {
                cklVar = this;
                cklVar.y();
            } else {
                cklVar = this;
                cks cksVarT = cklVar.t(ckkVar.v(), adyVar, mapN, ckkVar.x());
                if (!aooh.n(cksVarT, ckr.a)) {
                    return cksVarT;
                }
                ady adyVarS = ckkVar.s();
                if (adyVarS != null) {
                    adyVarS.f(adyVar);
                } else {
                    ckkVar.u(adyVar);
                    ((ckk) cklVar).g = null;
                }
            }
            long j = ((cko) cklVar).i;
            if (aooh.b(ckkVar.v(), j) < 0) {
                ckkVar.l();
            }
            ckkVar.A(ckkVar.x().b(j).a(((ckk) cklVar).d));
            ckkVar.o(j);
            int i = ((cko) cklVar).k;
            ((cko) cklVar).k = -1;
            if (i >= 0) {
                int[] iArr = ckkVar.e;
                if (iArr == null) {
                    aooh.i("<this>");
                }
                int length = iArr.length;
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                if (iArrCopyOf == null) {
                    aooh.g();
                }
                ckkVar.e = iArrCopyOf;
            }
            ckv ckvVar = ((ckk) cklVar).d;
            synchronized (obj) {
                ckkVar.d = ckkVar.d.c(ckvVar);
                ckk ckkVar2 = cklVar.l;
                int[] iArrCz = ((ckk) cklVar).e;
                if (iArrCz.length != 0) {
                    int[] iArr2 = ckkVar2.e;
                    if (iArr2.length != 0) {
                        iArrCz = ajsz.cz(iArr2, iArrCz);
                    }
                    ckkVar2.e = iArrCz;
                }
            }
            ((ckk) cklVar).f = true;
            cklVar.D();
            return ckr.a;
        }
    }

    public final void d() {
        if (((cko) this).j) {
            return;
        }
        super.d();
        D();
    }
}
