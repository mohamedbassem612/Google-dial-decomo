package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cxp implements defpackage.czo, defpackage.cyi {
    final /* synthetic */ defpackage.cxy a;
    private final /* synthetic */ defpackage.cxs b;

    public cxp(defpackage.cxy cxyVar) {
        this.a = cxyVar;
        this.b = cxyVar.f;
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.b.b;
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.b.c;
    }

    @Override // defpackage.dpl
    public final float dh(long j) {
        return defpackage.dfd.m(this.b, j);
    }

    @Override // defpackage.dpf
    public final float di(float f) {
        return (f / this.b.b) + 0.0f;
    }

    @Override // defpackage.dpf
    public final float dj(int i) {
        return (i / this.b.b) + 0.0f;
    }

    @Override // defpackage.dpf
    public final float dk(long j) {
        return defpackage.dfd.o(this.b, j);
    }

    @Override // defpackage.dpf
    public final float dl(float f) {
        return f * this.b.b;
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final int mo1do(long j) {
        return java.lang.Math.round(defpackage.dfd.o(this.b, j));
    }

    @Override // defpackage.dpf
    public final int dp(float f) {
        return defpackage.dfd.p(this.b, f);
    }

    @Override // defpackage.dpf
    public final long dq(long j) {
        return defpackage.dfd.q(this.b, j);
    }

    @Override // defpackage.dpf
    public final long dr(long j) {
        return defpackage.dfd.r(this.b, j);
    }

    @Override // defpackage.dpl
    public final long ds(float f) {
        return defpackage.dfd.n(this.b, f);
    }

    @Override // defpackage.dpf
    public final long dt(float f) {
        defpackage.cxs cxsVar = this.b;
        return defpackage.dfd.n(cxsVar, (f / cxsVar.b) + 0.0f);
    }

    @Override // defpackage.cyi
    public final defpackage.cyf du(int i, int i2, java.util.Map map, defpackage.aonj aonjVar) {
        return this.b.dx(i, i2, map, aonjVar);
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dv(int i, int i2, defpackage.aonj aonjVar, defpackage.aonn aonnVar, java.util.Map map, defpackage.aonj aonjVar2) {
        return defpackage.den.y(this.b, i, i2, aonjVar, aonnVar, map, aonjVar2);
    }

    @Override // defpackage.cxf
    public final boolean dw() {
        return this.b.dw();
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dx(int i, int i2, java.util.Map map, defpackage.aonj aonjVar) {
        throw null;
    }

    @Override // defpackage.cxf
    public final defpackage.dpq p() {
        return this.b.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    @Override // defpackage.czo
    public final java.util.List s(java.lang.Object obj, defpackage.aonn aonnVar) throws java.lang.Throwable {
        defpackage.dbk dbkVar;
        defpackage.cxq cxqVar;
        defpackage.cxy cxyVar = this.a;
        defpackage.adw adwVar = cxyVar.m;
        defpackage.dbk dbkVar2 = (defpackage.dbk) adwVar.a(obj);
        if (dbkVar2 != null && cxyVar.a.v().indexOf(dbkVar2) < cxyVar.d) {
            return dbkVar2.t();
        }
        defpackage.cfc cfcVar = cxyVar.h;
        if (cfcVar.b < cxyVar.e) {
            defpackage.cwh.c("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        defpackage.dbk dbkVar3 = (defpackage.dbk) adwVar.a(obj);
        int i = cfcVar.b;
        int i2 = cxyVar.e;
        if (i == i2) {
            cfcVar.n(obj);
        } else {
            cfcVar.d(i2, obj);
        }
        cxyVar.e++;
        defpackage.adw adwVar2 = cxyVar.n;
        if (defpackage.adw.f(adwVar2, obj)) {
            dbkVar = (defpackage.dbk) adwVar2.a(obj);
            if (dbkVar != null) {
                cxqVar = (defpackage.cxq) cxyVar.l.a(dbkVar);
            } else {
                cxqVar = null;
            }
            if (cxqVar != null && cxqVar.c) {
                cxyVar.m(dbkVar, obj, false, aonnVar);
            }
            if ((cxqVar != null ? cxqVar.h : null) != null) {
                cxyVar.f(cxqVar, true);
            }
        } else if (dbkVar3 == null) {
            cxyVar.l(obj, aonnVar, false);
            cxyVar.o.n(obj, cxyVar.a(obj));
        } else {
            defpackage.dbk dbkVar4 = cxyVar.a;
            cxyVar.n(dbkVar4.v().indexOf(dbkVar3), dbkVar4.v().size());
            cxyVar.j++;
            adwVar.i(obj);
            adwVar2.n(obj, dbkVar3);
            cxyVar.o.n(obj, cxyVar.a(obj));
            if (dbkVar4.al()) {
                cxyVar.j();
            }
            dbkVar = (defpackage.dbk) adwVar2.a(obj);
            if (dbkVar != null) {
                cxqVar = (defpackage.cxq) cxyVar.l.a(dbkVar);
            } else {
                cxqVar = null;
            }
            if (cxqVar != null) {
                cxyVar.m(dbkVar, obj, false, aonnVar);
            }
            if ((cxqVar != null ? cxqVar.h : null) != null) {
                cxyVar.f(cxqVar, true);
            }
        }
        defpackage.dbk dbkVar5 = (defpackage.dbk) adwVar2.a(obj);
        if (dbkVar5 == null) {
            return defpackage.aokc.a;
        }
        java.util.List listT = dbkVar5.n().t();
        int size = listT.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.dbx) listT.get(i3)).f.b = true;
        }
        return listT;
    }
}
