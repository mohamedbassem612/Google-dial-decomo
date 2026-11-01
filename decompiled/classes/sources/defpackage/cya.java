package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cya implements defpackage.cxi {
    private final defpackage.dbu a;

    public cya(defpackage.dbu dbuVar) {
        this.a = dbuVar;
    }

    private final long b() {
        defpackage.dbu dbuVarJ = defpackage.vn.j(this.a);
        return defpackage.mni.aM(j(dbuVarJ.s, 0L, true), a().j(dbuVarJ.g, 0L, true));
    }

    public final defpackage.dck a() {
        return this.a.g;
    }

    @Override // defpackage.cxi
    public final defpackage.cxi dn() {
        defpackage.dbu dbuVarD;
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        defpackage.dck dckVar = a().w.p().A;
        if (dckVar == null || (dbuVarD = dckVar.D()) == null) {
            return null;
        }
        return dbuVarD.s;
    }

    @Override // defpackage.cxi
    public final long h() {
        defpackage.dbu dbuVar = this.a;
        return (((long) dbuVar.a) << 32) | (((long) dbuVar.b) & 4294967295L);
    }

    @Override // defpackage.cxi
    public final long i(defpackage.cxi cxiVar, long j) {
        return j(cxiVar, j, true);
    }

    @Override // defpackage.cxi
    public final long j(defpackage.cxi cxiVar, long j, boolean z) {
        if (!(cxiVar instanceof defpackage.cya)) {
            defpackage.dbu dbuVarJ = defpackage.vn.j(this.a);
            long j2 = j(dbuVarJ.s, j, z);
            long j3 = dbuVarJ.h;
            long jAM = defpackage.mni.aM(j2, (((long) java.lang.Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L));
            defpackage.cxi cxiVar2 = dbuVarJ.g;
            defpackage.cxi cxiVarR = cxiVar2.r();
            if (cxiVarR != null) {
                cxiVar2 = cxiVarR;
            }
            return defpackage.mni.bl(jAM, cxiVar2.j(cxiVar, 0L, z));
        }
        boolean z2 = !z;
        defpackage.dbu dbuVar = ((defpackage.cya) cxiVar).a;
        defpackage.dck dckVar = dbuVar.g;
        dckVar.an();
        defpackage.dbu dbuVarD = a().ah(dckVar).D();
        if (dbuVarD != null) {
            long jC = defpackage.dpn.c(defpackage.dpn.d(dbuVar.C(dbuVarD, z2), defpackage.dfd.l(j)), this.a.C(dbuVarD, z2));
            return (((long) java.lang.Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        defpackage.dbu dbuVarJ2 = defpackage.vn.j(dbuVar);
        long jD = defpackage.dpn.d(defpackage.dpn.d(dbuVar.C(dbuVarJ2, z2), dbuVarJ2.h), defpackage.dfd.l(j));
        defpackage.dbu dbuVar2 = this.a;
        defpackage.dbu dbuVarJ3 = defpackage.vn.j(dbuVar2);
        long jC2 = defpackage.dpn.c(jD, defpackage.dpn.d(dbuVar2.C(dbuVarJ3, z2), dbuVarJ3.h));
        long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits((int) (jC2 >> 32))) << 32;
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        defpackage.dck dckVar2 = dbuVarJ3.g.A;
        if (dckVar2 == null) {
            defpackage.aooh.g();
        }
        defpackage.dck dckVar3 = dbuVarJ2.g.A;
        if (dckVar3 == null) {
            defpackage.aooh.g();
        }
        return dckVar2.j(dckVar3, jFloatToRawIntBits | jFloatToRawIntBits2, z);
    }

    @Override // defpackage.cxi
    public final long k(long j) {
        return a().k(defpackage.mni.bl(0L, b()));
    }

    @Override // defpackage.cxi
    public final long l(long j) {
        return a().l(defpackage.mni.bl(j, b()));
    }

    @Override // defpackage.cxi
    public final long m(long j) {
        return a().m(defpackage.mni.bl(j, b()));
    }

    @Override // defpackage.cxi
    public final long n(long j) {
        return defpackage.mni.bl(a().n(j), b());
    }

    @Override // defpackage.cxi
    public final long o(long j) {
        return defpackage.mni.bl(a().o(j), b());
    }

    @Override // defpackage.cxi
    public final defpackage.cpn q(defpackage.cxi cxiVar, boolean z) {
        return a().q(cxiVar, z);
    }

    @Override // defpackage.cxi
    public final defpackage.cxi r() {
        defpackage.dbu dbuVarD;
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        defpackage.dck dckVar = a().A;
        if (dckVar == null || (dbuVarD = dckVar.D()) == null) {
            return null;
        }
        return dbuVarD.s;
    }

    @Override // defpackage.cxi
    public final boolean t() {
        return this.a.l;
    }

    @Override // defpackage.cxi
    public final boolean u() {
        return a().u();
    }
}
