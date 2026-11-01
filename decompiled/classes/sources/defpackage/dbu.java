package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dbu extends defpackage.dbt implements defpackage.cyd {
    private java.util.Map f;
    public final defpackage.dck g;
    public long h = 0;
    public final defpackage.cya s = new defpackage.cya(this);
    public final defpackage.ado t;
    private defpackage.cyf u;

    public dbu(defpackage.dck dckVar) {
        this.g = dckVar;
        defpackage.ado adoVar = defpackage.adp.a;
        this.t = new defpackage.ado(6);
    }

    public final long C(defpackage.dbu dbuVar, boolean z) {
        long jD = 0;
        while (!defpackage.aooh.n(this, dbuVar)) {
            if (!this.l || !z) {
                jD = defpackage.dpn.d(jD, this.h);
            }
            defpackage.dck dckVar = this.g.A;
            if (dckVar == null) {
                defpackage.aooh.g();
            }
            this = dckVar.D();
            if (this == null) {
                defpackage.aooh.g();
            }
        }
        return jD;
    }

    public final defpackage.dah D() {
        defpackage.dbv dbvVar = this.g.w.w.p;
        if (dbvVar == null) {
            defpackage.aooh.g();
        }
        return dbvVar;
    }

    public final void E(long j) {
        if (this.h != j) {
            this.h = j;
            defpackage.dbv dbvVar = M().w.p;
            if (dbvVar != null) {
                dbvVar.B();
            }
            W(this.g);
        }
        if (this.n) {
            return;
        }
        Q(L());
    }

    public final void F(defpackage.cyf cyfVar) {
        java.util.Map map;
        if (cyfVar != null) {
            z((((long) cyfVar.c()) << 32) | (((long) cyfVar.b()) & 4294967295L));
        } else {
            z(0L);
        }
        if (!defpackage.aooh.n(this.u, cyfVar) && cyfVar != null && ((((map = this.f) != null && !map.isEmpty()) || !cyfVar.f().isEmpty()) && !defpackage.aooh.n(cyfVar.f(), this.f))) {
            ((defpackage.dbv) D()).p.e();
            java.util.Map linkedHashMap = this.f;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                this.f = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(cyfVar.f());
        }
        this.u = cyfVar;
    }

    @Override // defpackage.dbt
    public final long J() {
        return this.h;
    }

    @Override // defpackage.dbt
    public final defpackage.cxi K() {
        return this.s;
    }

    @Override // defpackage.dbt
    public final defpackage.cyf L() {
        defpackage.cyf cyfVar = this.u;
        if (cyfVar != null) {
            return cyfVar;
        }
        defpackage.cwh.b("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.dbt, defpackage.dby
    public final defpackage.dbk M() {
        return this.g.w;
    }

    @Override // defpackage.dbt
    public final defpackage.dbt N() {
        defpackage.dck dckVar = this.g.z;
        if (dckVar != null) {
            return dckVar.D();
        }
        return null;
    }

    @Override // defpackage.dbt
    public final defpackage.dbt O() {
        defpackage.dck dckVar = this.g.A;
        if (dckVar != null) {
            return dckVar.D();
        }
        return null;
    }

    @Override // defpackage.dbt
    public final void R() {
        dg(this.h, 0.0f, null);
    }

    @Override // defpackage.dbt
    public final boolean V() {
        return this.u != null;
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.g.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.g.b();
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.czc
    public final void dg(long j, float f, defpackage.aonj aonjVar) {
        E(j);
        if (this.m) {
            return;
        }
        t();
    }

    @Override // defpackage.dbt, defpackage.cxf
    public final boolean dw() {
        return true;
    }

    public int e(int i) {
        throw null;
    }

    public int f(int i) {
        throw null;
    }

    @Override // defpackage.czc, defpackage.cxe
    public final java.lang.Object g() {
        return this.g.g();
    }

    @Override // defpackage.cxf
    public final defpackage.dpq p() {
        return this.g.p();
    }

    protected void t() {
        L().i();
    }

    public final long u() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }
}
