package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agy implements agm, cdv {
    public final ccp b;
    public final ccp c;
    public final ccp d;
    public final ccp e;
    public final ccp f;
    public final ccp g;
    public final ccp h;
    public boolean i;
    public defpackage.agy j;
    public final aomy k;
    public final ceg l;
    public defpackage.agu m;
    private final ccp n;
    private boolean o;
    private ahc p;
    private final ccp q;

    public agy(defpackage.agx agxVar, defpackage.afg afgVar, defpackage.ahg ahgVar, den denVar, izg izgVar) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cdu cduVar = cdu.c;
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool2, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(agxVar, cduVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(afgVar, cduVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(ahgVar, cduVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool2, cduVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(denVar, cduVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(izgVar, cduVar);
        this.q = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.k = new defpackage.ny(this, afgVar, 3, null);
    }

    private final boolean t() {
        return d().e() || (e().a().i() && !e().a().e()) || !((java.lang.Boolean) this.f.a()).booleanValue();
    }

    private final boolean u() {
        ahc ahcVarS;
        defpackage.agu aguVar = this.m;
        return (aguVar == null || (ahcVarS = aguVar.s()) == null || !ahcVarS.k()) ? false : true;
    }

    public final float a() {
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    public final void b(csj csjVar, apkl apklVar) throws java.lang.Throwable {
        defpackage.agy agyVar;
        cpn cpnVarB;
        float f;
        float f2;
        float fB;
        if (o() && g() == null) {
            agyVar = this;
            agyVar.l(apklVar.i());
        } else {
            agyVar = this;
        }
        cso csoVarG = agyVar.g();
        if (csoVarG == null || (cpnVarB = agyVar.e().a().b()) == null || !agyVar.o()) {
            return;
        }
        long jD = cpnVarB.d();
        csj csjVar2 = 4294967295;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jD & 4294967295L));
        ahc ahcVarF = agyVar.f();
        cxi cxiVar = ahcVarF != null ? ahcVarF.c : null;
        cxi cxiVarD = agyVar.e().b.d();
        float fA = 1.0f;
        float fA2 = 0.0f;
        if (ahcVarF != null && ahcVarF.k() && cxiVar != null && cxiVar.u() && cxiVarD.u()) {
            fA = ahcVarF.a();
            long jA = defpackage.agw.a(cxiVar, cxiVarD, ahcVarF.b());
            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jA >> 32));
            float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jA & 4294967295L));
            fB = dpn.b(0L);
            f2 = fIntBitsToFloat4;
            f = fIntBitsToFloat3;
            fA2 = dpn.a(0L);
        } else {
            f = 0.0f;
            f2 = 0.0f;
            fB = 0.0f;
        }
        csjVar.q().c.r(fA2, fB);
        float f3 = -fA2;
        float f4 = -fB;
        try {
            try {
                long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(f)) << 32;
                long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L;
                csg csgVarQ = csjVar.q();
                long jA2 = csgVarQ.a();
                csgVarQ.b().g();
                try {
                    csgVarQ.c.q(fA, fA, jFloatToRawIntBits | jFloatToRawIntBits2);
                    csjVar.q().c.r(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        try {
                            den.H(csjVar, csoVarG);
                            csjVar.q().c.r(-fIntBitsToFloat, -fIntBitsToFloat2);
                            csgVarQ.b().e();
                            csgVarQ.h(jA2);
                            apnt apntVar = csjVar.q().c;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            csgVarQ.b().e();
                            csgVarQ.h(jA2);
                            throw th;
                        }
                    } finally {
                        csjVar.q().c.r(-fIntBitsToFloat, -fIntBitsToFloat2);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                csjVar2.q().c.r(f3, f4);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            csjVar2 = csjVar;
            csjVar2.q().c.r(f3, f4);
            throw th;
        }
    }

    public final float c() {
        return this.l.c();
    }

    public final defpackage.afg d() {
        return (defpackage.afg) this.d.a();
    }

    public final defpackage.agx e() {
        return (defpackage.agx) this.c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r2 = e().b();
        r3 = r2.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r4 >= r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r5 = r2.get(r4);
        r6 = (defpackage.agy) r5;
        r7 = r6.u();
        r6 = r6.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r6 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r6 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r5 = (defpackage.agy) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        r2 = r5.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r2 = r2.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r2 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ahc f() {
        /*
            r8 = this;
            izg r0 = r8.s()
            r0.y()
            afg r0 = r8.d()
            alg r0 = r0.a
        Ld:
            r1 = 0
            if (r0 == 0) goto L89
            boolean r2 = r0 instanceof defpackage.aje
            if (r2 == 0) goto L86
            agu r0 = r8.m
            if (r0 == 0) goto L89
            ahc r0 = r0.s()
            if (r0 == 0) goto L89
            boolean r2 = r0.j()
            if (r2 == 0) goto L28
            ahc r2 = r8.p
            if (r2 != 0) goto L7b
        L28:
            boolean r2 = r8.u()
            if (r2 == 0) goto L35
            boolean r2 = r8.q()
            if (r2 != 0) goto L72
            goto L3b
        L35:
            boolean r2 = r8.q()
            if (r2 == 0) goto L72
        L3b:
            agx r2 = r8.e()
            java.util.List r2 = r2.b()
            int r3 = r2.size()
            r4 = 0
        L48:
            if (r4 >= r3) goto L63
            java.lang.Object r5 = r2.get(r4)
            r6 = r5
            agy r6 = (defpackage.agy) r6
            boolean r7 = r6.u()
            boolean r6 = r6.q()
            if (r7 == 0) goto L5e
            if (r6 == 0) goto L60
            goto L64
        L5e:
            if (r6 == 0) goto L64
        L60:
            int r4 = r4 + 1
            goto L48
        L63:
            r5 = r1
        L64:
            agy r5 = (defpackage.agy) r5
            if (r5 == 0) goto L72
            agu r2 = r5.m
            if (r2 == 0) goto L72
            ahc r2 = r2.s()
            if (r2 != 0) goto L73
        L72:
            r2 = r0
        L73:
            boolean r3 = r8.u()
            if (r3 == 0) goto L7d
            r8.p = r2
        L7b:
            r1 = r2
            goto L89
        L7d:
            boolean r0 = r0.j()
            if (r0 != 0) goto L7b
            r8.p = r1
            goto L7b
        L86:
            alg r0 = r0.a
            goto Ld
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agy.f():ahc");
    }

    public final cso g() {
        return (cso) this.q.a();
    }

    public final void i() {
        ahj ahjVar = e().b;
        boolean z = this.o;
        this.o = false;
        if (z) {
            e().b.f(this.o);
        }
        defpackage.agx agxVarE = e();
        adq adqVar = agxVarE.g;
        adqVar.p(this);
        agxVarE.d();
        ahjVar.e.p(this);
        ahjVar.g(ahjVar.a() + 1);
        if (adqVar.f()) {
            aoov.an(agxVarE.b.a, (aolr) null, 0, new defpackage.fyn(agxVarE, this, (aoln) null, 1), 3);
        }
        e().c();
    }

    public final void j() {
        ahj ahjVar = e().b;
        defpackage.agx agxVarE = e();
        agxVarE.g.q(this);
        agxVarE.d();
        n();
        adq adqVar = ahjVar.e;
        java.lang.Object[] objArr = adqVar.a;
        int i = adqVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            agm agmVar = (agm) objArr[i2];
            defpackage.agy agyVar = agmVar instanceof defpackage.agy ? (defpackage.agy) agmVar : null;
            if (aooh.n(agyVar != null ? agyVar.e() : null, e())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || i2 >= adqVar.b - 1) {
            adqVar.q(this);
        } else {
            adqVar.k(i2 + 1, this);
        }
        ahjVar.g(ahjVar.a() + 1);
        e().c();
    }

    public final void k(boolean z) {
        this.n.b(java.lang.Boolean.valueOf(z));
    }

    public final void l(cso csoVar) {
        this.q.b(csoVar);
    }

    public final void m(defpackage.agy agyVar) {
        if (aooh.n(this.j, agyVar)) {
            return;
        }
        this.j = agyVar;
        e().b.h();
    }

    public final void n() {
        ahc ahcVarF;
        boolean z = this.o;
        boolean z2 = false;
        if (r() && e().f() && (d().f() || ((ahcVarF = f()) != null && ahcVarF.k()))) {
            z2 = true;
        }
        this.o = z2;
        if (z2 != z) {
            e().b.f(this.o);
        }
    }

    public final boolean o() {
        if (t() && e().e() && r() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
            return e().b.i() || u();
        }
        return false;
    }

    public final boolean p() {
        if (e().e()) {
            return !o() && t();
        }
        return true;
    }

    public final boolean q() {
        return d().e();
    }

    public final boolean r() {
        izg izgVarS = s();
        if (!((java.lang.Boolean) this.n.a()).booleanValue()) {
            return false;
        }
        izgVarS.y();
        return true;
    }

    public final izg s() {
        return (izg) this.h.a();
    }

    public final void h() {
    }
}
