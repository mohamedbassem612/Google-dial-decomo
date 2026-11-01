package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apy {
    public aonj a;
    public final defpackage.apx b;
    public final ceg c;
    public final ceg d;
    private final ccp e;
    private final ccp f;
    private final cer g;
    private final ccp h;
    private final ccp i;
    private final nf j;

    public apy(java.lang.Object obj) {
        this.a = new apk(3);
        this.j = new nf((char[]) null, (byte[]) null, (byte[]) null);
        cdu cduVar = cdu.c;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        defpackage.mq mqVar = new defpackage.mq(this, 19);
        ajxw ajxwVar = ceo.a;
        this.g = new cbk(mqVar, (cen) null);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(Float.NaN);
        new cbk(new defpackage.mq(this, 20), cduVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.aqj(aokc.a, new float[0]), cduVar);
        this.b = new defpackage.apx(this);
    }

    private final boolean r(java.lang.Object obj) {
        nf nfVar = this.j;
        boolean zC = ((apdp) nfVar.a).c();
        if (zC) {
            try {
                defpackage.apx apxVar = this.b;
                float fC = p().c(obj);
                if (!java.lang.Float.isNaN(fC)) {
                    apxVar.a(fC, 0.0f);
                    m(null);
                }
                l(obj);
                n(obj);
            } finally {
                nfVar.Q();
            }
        }
        return zC;
    }

    private final void s(defpackage.aqj aqjVar) {
        this.i.b(aqjVar);
    }

    public final float a(float f) {
        float fD = d(f);
        float fE = fD - e();
        this.b.a(fD, 0.0f);
        return fE;
    }

    public final float b() {
        return this.d.c();
    }

    public final float c() {
        return this.c.c();
    }

    public final float d(float f) {
        return aooc.s((java.lang.Float.isNaN(c()) ? 0.0f : c()) + f, p().b(), p().a());
    }

    public final float e() {
        if (java.lang.Float.isNaN(c())) {
            defpackage.avo.d("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c();
    }

    public final java.lang.Object f(defpackage.aoc aocVar, aono aonoVar, aoln aolnVar) {
        java.lang.Object objO = this.j.O(aocVar, new defpackage.bhp(this, aonoVar, (aoln) null, 1), aolnVar);
        return objO != aolu.a ? aojh.a : objO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(java.lang.Object obj, defpackage.aoc aocVar, aonp aonpVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.apu apuVar;
        defpackage.apy apyVar;
        java.lang.Throwable th;
        if (aolnVar instanceof defpackage.apu) {
            apuVar = (defpackage.apu) aolnVar;
            int i = apuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apuVar.c = i - Integer.MIN_VALUE;
            } else {
                apuVar = new defpackage.apu(this, aolnVar);
            }
        } else {
            apuVar = new defpackage.apu(this, aolnVar);
        }
        java.lang.Object obj2 = apuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = apuVar.c;
        if (i2 == 0) {
            aooc.af(obj2);
            if (p().g(obj)) {
                try {
                    nf nfVar = this.j;
                    apyVar = this;
                    try {
                        defpackage.ako akoVar = new defpackage.ako(apyVar, obj, aonpVar, (aoln) null, 2);
                        apuVar.c = 1;
                        if (nfVar.O(aocVar, akoVar, apuVar) == aoluVar) {
                            return aoluVar;
                        }
                        apyVar.m(null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        th = th;
                        apyVar.m(null);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    apyVar = this;
                }
            } else if (((java.lang.Boolean) this.a.a(obj)).booleanValue()) {
                n(obj);
                l(obj);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                aooc.af(obj2);
                apyVar = this;
                apyVar.m(null);
            } catch (java.lang.Throwable th4) {
                th = th4;
                apyVar = this;
                apyVar.m(null);
                throw th;
            }
        }
        return aojh.a;
    }

    public final java.lang.Object h() {
        return this.e.a();
    }

    public final java.lang.Object i() {
        return this.h.a();
    }

    public final java.lang.Object j() {
        return this.f.a();
    }

    public final java.lang.Object k() {
        return this.g.a();
    }

    public final void l(java.lang.Object obj) {
        this.e.b(obj);
    }

    public final void m(java.lang.Object obj) {
        this.h.b(obj);
    }

    public final void n(java.lang.Object obj) {
        this.f.b(obj);
    }

    public final boolean o() {
        return i() != null;
    }

    public final defpackage.aqj p() {
        return (defpackage.aqj) this.i.a();
    }

    public final void q(defpackage.aqj aqjVar, java.lang.Object obj) {
        if (aooh.n(p(), aqjVar)) {
            return;
        }
        s(aqjVar);
        if (r(obj)) {
            return;
        }
        m(obj);
    }

    public apy(java.lang.Object obj, defpackage.aqj aqjVar) {
        this(obj);
        s(aqjVar);
        r(obj);
    }

    public apy(java.lang.Object obj, aonj aonjVar) {
        this(obj);
        this.a = aonjVar;
    }
}
