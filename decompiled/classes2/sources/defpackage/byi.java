package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byi extends cmv implements dbd {
    public defpackage.apy a;
    public aonn b;
    public aso c;
    public boolean d;

    public byi(defpackage.apy apyVar, aonn aonnVar, aso asoVar) {
        this.a = apyVar;
        this.b = aonnVar;
        this.c = asoVar;
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        java.lang.Object objD;
        czc czcVarV = cydVar.v(j);
        if (!cyiVar.dw() || !this.d) {
            aoiu aoiuVar = (aoiu) this.b.a(new dpp((((long) czcVarV.a) << 32) | (((long) czcVarV.b) & 4294967295L)), new dpd(j));
            defpackage.aqj aqjVar = (defpackage.aqj) aoiuVar.a;
            java.lang.Object obj = aoiuVar.b;
            if (!aqjVar.g(obj) && (objD = aqjVar.d(0)) != null) {
                obj = objD;
            }
            if (aooh.n(this.a.p(), aqjVar) && java.lang.Float.isNaN(this.a.c()) && aqjVar.a > 0) {
                this.a.q(defpackage.app.b(new defpackage.bxb(4)), obj);
            }
            this.a.q(aqjVar, obj);
        }
        this.d = cyiVar.dw() || this.d;
        return den.z(cyiVar, czcVarV.a, czcVarV.b, new afx(cyiVar, this, czcVarV, 11, (short[]) null));
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.f(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.g(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.h(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.i(this, cxfVar, cxeVar, i);
    }

    public final void u() {
        this.d = false;
    }
}
