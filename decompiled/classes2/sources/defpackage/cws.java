package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cws implements defpackage.cwr, cyi, cyb {
    public final dbg a;
    public cwq b;
    public boolean c;

    public cws(dbg dbgVar, cwq cwqVar) {
        this.a = dbgVar;
        this.b = cwqVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final cxi dd(czb czbVar) throws aoiq {
        dbk dbkVar = ((dck) this.a).w.j;
        if (dbkVar == null) {
            cwh.a("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new aoiq();
        }
        if (!dbkVar.i) {
            return dbkVar.p();
        }
        dbk dbkVarK = dbkVar.k();
        return dbkVarK != null ? dbkVarK.o() : ((dbk) dbkVar.u().get(0)).p();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final cxi de(cxi cxiVar) throws aoiq {
        cya cyaVar;
        if (cxiVar instanceof cya) {
            return cxiVar;
        }
        if (cxiVar instanceof dck) {
            dbu dbuVarD = ((dck) cxiVar).D();
            return (dbuVarD == null || (cyaVar = dbuVarD.s) == null) ? cxiVar : cyaVar;
        }
        cwh.a("Unsupported LayoutCoordinates");
        throw new aoiq();
    }

    public final /* synthetic */ long df(cxi cxiVar, cxi cxiVar2, boolean z) {
        return den.B(this, cxiVar, cxiVar2, z);
    }

    public final float dh(long j) {
        return dfd.m(this.a, j);
    }

    public final float di(float f) {
        return (f / this.a.a()) + 0.0f;
    }

    public final float dj(int i) {
        return (i / this.a.a()) + 0.0f;
    }

    public final float dk(long j) {
        return dfd.o(this.a, j);
    }

    public final float dl(float f) {
        return f * this.a.a();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m87do(long j) {
        return java.lang.Math.round(dfd.o(this.a, j));
    }

    public final int dp(float f) {
        return dfd.p(this.a, f);
    }

    public final long dq(long j) {
        return dfd.q(this.a, j);
    }

    public final long dr(long j) {
        return dfd.r(this.a, j);
    }

    public final long ds(float f) {
        return dfd.n(this.a, f);
    }

    public final long dt(float f) {
        dbg dbgVar = this.a;
        return dfd.n(dbgVar, (f / dbgVar.a()) + 0.0f);
    }

    public final cyf du(int i, int i2, java.util.Map map, aonj aonjVar) {
        return this.a.dx(i, i2, map, aonjVar);
    }

    public final cyf dv(int i, int i2, aonj aonjVar, aonn aonnVar, java.util.Map map, aonj aonjVar2) {
        return this.a.dv(i, i2, aonjVar, aonnVar, map, aonjVar2);
    }

    public final boolean dw() {
        return false;
    }

    public final cyf dx(int i, int i2, java.util.Map map, aonj aonjVar) {
        throw null;
    }

    public final dpq p() {
        return this.a.p();
    }

    @Override // defpackage.cwo
    public final long s() {
        dbu dbuVar = this.a.h;
        if (dbuVar == null) {
            aooh.g();
        }
        cyf cyfVarL = dbuVar.L();
        return (((long) cyfVarL.c()) << 32) | (((long) cyfVarL.b()) & 4294967295L);
    }
}
