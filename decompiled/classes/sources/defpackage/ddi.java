package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ddi extends defpackage.cag {
    public ddi(defpackage.dbk dbkVar) {
        super(dbkVar);
    }

    @Override // defpackage.cag
    protected final void e() {
        ((defpackage.dbk) this.a).Q();
    }

    @Override // defpackage.cag, defpackage.cah
    public final void f() {
        defpackage.dcv dcvVar = ((defpackage.dbk) this.a).k;
        if (dcvVar != null) {
            dcvVar.y();
        }
    }

    @Override // defpackage.cag, defpackage.cah
    public final void g() {
        defpackage.diw diwVar;
        defpackage.cnf cnfVar;
        defpackage.diw diwVar2;
        defpackage.dbk dbkVar = (defpackage.dbk) this.b;
        if (!dbkVar.al()) {
            defpackage.cwh.c("onReuse is only expected on attached node");
        }
        android.view.ViewParent viewParent = dbkVar.l;
        if (viewParent != null) {
            android.view.View view = ((dqc) viewParent).c;
            if (view.getParent() != viewParent) {
                viewParent.addView(view);
            } else {
                ((dqc) viewParent).g.a();
            }
        }
        defpackage.cxy cxyVar = dbkVar.x;
        if (cxyVar != null) {
            cxyVar.k(false);
        }
        dbkVar.p = false;
        if (dbkVar.D) {
            dbkVar.D = false;
        } else {
            dbkVar.Y();
        }
        int i = dbkVar.c;
        defpackage.dcv dcvVar = dbkVar.k;
        if (dcvVar != null && (diwVar2 = ((defpackage.deg) dcvVar).o) != null) {
            diwVar2.f(dbkVar);
        }
        dbkVar.c = defpackage.dig.a.addAndGet(1);
        defpackage.dcv dcvVar2 = dbkVar.k;
        if (dcvVar2 != null) {
            defpackage.aco acoVar = ((defpackage.deg) dcvVar2).H;
            acoVar.d(i);
            acoVar.g(dbkVar.c, dbkVar);
        }
        defpackage.dce dceVar = dbkVar.v;
        dceVar.b();
        dceVar.e();
        if (dceVar.i(8)) {
            dbkVar.I();
        }
        dbkVar.X(dbkVar);
        defpackage.dcv dcvVar3 = dbkVar.k;
        if (dcvVar3 != null && (cnfVar = ((defpackage.deg) dcvVar3).K) != null) {
            if (cnfVar.h.e(i)) {
                cnfVar.g.c(cnfVar.b, i, false);
            }
            defpackage.die dieVarQ = dbkVar.q();
            if (dieVarQ != null && defpackage.adw.f(dieVarQ.c, defpackage.din.r)) {
                cnfVar.h.d(dbkVar.c);
                cnfVar.g.c(cnfVar.b, dbkVar.c, true);
            }
        }
        defpackage.dcv dcvVar4 = dbkVar.k;
        if (dcvVar4 == null || (diwVar = ((defpackage.deg) dcvVar4).o) == null) {
            return;
        }
        diwVar.e(dbkVar);
    }

    @Override // defpackage.cah
    public final /* bridge */ /* synthetic */ void i(int i, java.lang.Object obj) {
        ((defpackage.dbk) this.b).E(i, (defpackage.dbk) obj);
    }

    @Override // defpackage.cah
    public final /* bridge */ /* synthetic */ void j(int i, java.lang.Object obj) {
    }

    @Override // defpackage.cah
    public final void k(int i, int i2, int i3) {
        ((defpackage.dbk) this.b).N(i, i2, i3);
    }

    @Override // defpackage.cah
    public final void l(int i, int i2) {
        ((defpackage.dbk) this.b).R(i, i2);
    }
}
