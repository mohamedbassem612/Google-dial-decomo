package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cxs implements defpackage.czo {
    public defpackage.dpq a = defpackage.dpq.b;
    public float b;
    public float c;
    final /* synthetic */ defpackage.cxy d;

    public cxs(defpackage.cxy cxyVar) {
        this.d = cxyVar;
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.b;
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.c;
    }

    @Override // defpackage.dpl
    public final /* synthetic */ float dh(long j) {
        return defpackage.dfd.m(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / this.b) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i) {
        return (i / this.b) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * this.b;
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        return java.lang.Math.round(defpackage.dfd.o(this, j));
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final /* synthetic */ long ds(float f) {
        return defpackage.dfd.n(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return defpackage.dfd.n(this, (f / this.b) + 0.0f);
    }

    @Override // defpackage.cyi
    public final /* synthetic */ defpackage.cyf du(int i, int i2, java.util.Map map, defpackage.aonj aonjVar) {
        return dx(i, i2, map, aonjVar);
    }

    @Override // defpackage.cyi
    public final /* synthetic */ defpackage.cyf dv(int i, int i2, defpackage.aonj aonjVar, defpackage.aonn aonnVar, java.util.Map map, defpackage.aonj aonjVar2) {
        return defpackage.den.y(this, i, i2, aonjVar, aonnVar, map, aonjVar2);
    }

    @Override // defpackage.cxf
    public final boolean dw() {
        defpackage.dbk dbkVar = this.d.a;
        return dbkVar.av() == 4 || dbkVar.av() == 2;
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dx(int i, int i2, java.util.Map map, defpackage.aonj aonjVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.cwh.d(defpackage.a.bA(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.cxr(i, i2, map, this, this.d, aonjVar);
    }

    @Override // defpackage.cxf
    public final defpackage.dpq p() {
        return this.a;
    }

    @Override // defpackage.czo
    public final java.util.List s(java.lang.Object obj, defpackage.aonn aonnVar) throws java.lang.Throwable {
        defpackage.cxy cxyVar = this.d;
        cxyVar.j();
        defpackage.dbk dbkVar = cxyVar.a;
        int iAv = dbkVar.av();
        if (iAv != 1 && iAv != 3 && iAv != 2 && iAv != 4) {
            defpackage.cwh.d("subcompose can only be used inside the measure or layout blocks");
        }
        defpackage.adw adwVar = cxyVar.m;
        java.lang.Object objA = adwVar.a(obj);
        if (objA == null) {
            objA = (defpackage.dbk) cxyVar.n.i(obj);
            if (objA != null) {
                if (cxyVar.j <= 0) {
                    defpackage.cwh.d("Check failed.");
                }
                cxyVar.j--;
            } else {
                objA = cxyVar.e(obj);
                if (objA == null) {
                    objA = cxyVar.d(cxyVar.d);
                }
            }
            adwVar.n(obj, objA);
        }
        defpackage.dbk dbkVar2 = (defpackage.dbk) objA;
        if (defpackage.ajsz.bH(dbkVar.v(), cxyVar.d) != dbkVar2) {
            int iIndexOf = dbkVar.v().indexOf(dbkVar2);
            if (iIndexOf < cxyVar.d) {
                defpackage.cwh.c(defpackage.a.bg(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = cxyVar.d;
            if (i != iIndexOf) {
                cxyVar.n(iIndexOf, i);
            }
        }
        cxyVar.d++;
        cxyVar.m(dbkVar2, obj, false, aonnVar);
        return (iAv == 1 || iAv == 3) ? dbkVar2.t() : dbkVar2.s();
    }
}
