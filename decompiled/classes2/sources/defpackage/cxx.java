package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cxx implements defpackage.czm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ cxy a;
    final /* synthetic */ java.lang.Object b;

    public cxx(cxy cxyVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = cxyVar;
        this.b = obj;
    }

    private final cxq e() {
        cxy cxyVar = this.a;
        dbk dbkVar = (dbk) cxyVar.n.a(this.b);
        if (dbkVar != null) {
            return (cxq) cxyVar.l.a(dbkVar);
        }
        return null;
    }

    @Override // defpackage.czm
    public final defpackage.czn a() {
        if (this.$cid != 0) {
            return this.a.a(this.b);
        }
        cxq cxqVarE = e();
        if (cxqVarE != null) {
            this.a.f(cxqVarE, false);
        }
        return this.a.a(this.b);
    }

    @Override // defpackage.czm
    public final void b() {
        if (this.$cid == 0) {
            cxq cxqVarE = e();
            if ((cxqVarE != null ? cxqVarE.h : null) != null) {
                this.a.i(this.b);
            }
        }
    }

    @Override // defpackage.czm
    public final boolean c() {
        cxq cxqVarE;
        defpackage.ccy ccyVar;
        if (this.$cid != 0 || (cxqVarE = e()) == null || (ccyVar = cxqVarE.h) == null) {
            return true;
        }
        return ccyVar.a();
    }

    @Override // defpackage.czm
    public final void d(defpackage.ceb cebVar) {
        if (this.$cid == 0) {
            cxq cxqVarE = e();
            defpackage.ccy ccyVar = cxqVarE != null ? cxqVarE.h : null;
            if (ccyVar == null || ccyVar.a()) {
                return;
            }
            cko ckoVar = (cko) ckw.i.i();
            aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            cko ckoVarH = cfd.h(ckoVar);
            try {
                ccyVar.b(cebVar);
                cfd.i(ckoVar, ckoVarH, aonjVarI);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    cfd.i(ckoVar, ckoVarH, aonjVarI);
                    throw th2;
                }
            }
        }
    }
}
