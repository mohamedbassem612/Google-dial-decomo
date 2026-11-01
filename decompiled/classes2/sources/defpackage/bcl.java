package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcl implements ati {
    public static final ckb a = cfd.q(new defpackage.aem(5), new defpackage.bcm(1));
    public boolean b;
    public defpackage.bcb c;
    public final ccp d;
    public float e;
    public final czg f;
    public final bcu g;
    public final bdu h;
    public final beo i;
    public final bel j;
    public final ccp k;
    public final ccp l;
    public final bep m;
    public dbk n;
    public final afob o;
    public final kaw p;
    public final kaw q;
    private final ati r;
    private int s;
    private final boolean t;
    private final aoir u;
    private final ccp v;
    private final ccp w;

    public bcl(int i, int i2) {
        this.o = new afob(i, i2);
        defpackage.bcb bcbVar = defpackage.bco.a;
        cdu cduVar = cdu.b;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bcbVar, cduVar);
        this.q = new kaw((byte[]) null, (char[]) null, (byte[]) null);
        this.r = new aqo(new defpackage.auj(this, 15));
        this.t = true;
        this.f = new defpackage.bci(this);
        this.g = new bcu();
        this.h = new bdu();
        this.p = new kaw((char[]) null, (char[]) null);
        this.i = null;
        this.u = aooc.ah(1, new defpackage.apv(this, 8));
        this.j = new bel();
        aojh aojhVar = aojh.a;
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(aojhVar, cduVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(aojhVar, cduVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cdu cduVar2 = cdu.c;
        this.v = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar2);
        this.w = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar2);
        this.m = new bep();
    }

    private final rai l() {
        return (rai) this.u.a();
    }

    public final float a(float f) {
        return this.r.a(f);
    }

    public final int b() {
        return this.o.b();
    }

    public final int c() {
        return this.o.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [aonn] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final java.lang.Object d(defpackage.aoc aocVar, aonn aonnVar, aoln aolnVar) {
        defpackage.bcj bcjVar;
        ?? r7;
        if (aolnVar instanceof defpackage.bcj) {
            bcjVar = (defpackage.bcj) aolnVar;
            int i = bcjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcjVar.d = i - Integer.MIN_VALUE;
            } else {
                bcjVar = new defpackage.bcj(this, aolnVar);
            }
        } else {
            bcjVar = new defpackage.bcj(this, aolnVar);
        }
        java.lang.Object obj = bcjVar.b;
        aolu aoluVar = aolu.a;
        int i2 = bcjVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = bcjVar.a;
                aocVar = bcjVar.e;
                aooc.af(obj);
                r7 = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        if (this.d.a() == defpackage.bco.a) {
            bcu bcuVar = this.g;
            bcjVar.e = aocVar;
            bcjVar.a = aonnVar;
            bcjVar.d = 1;
            if (bcuVar.f(bcjVar) == aoluVar) {
                r7 = aonnVar;
                r7 = aonnVar;
                return aoluVar;
            }
        }
        r7 = aonnVar;
        r7 = aonnVar;
        r7 = aonnVar;
        ati atiVar = this.r;
        bcjVar.e = null;
        bcjVar.a = null;
        bcjVar.d = 2;
        if (atiVar.d(aocVar, (aonn) r7, bcjVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    public final void e(defpackage.bcb bcbVar, boolean z, boolean z2) {
        java.lang.Object obj;
        defpackage.bcc bccVar;
        defpackage.bce bceVar;
        beo beoVar = bcbVar.k;
        if (beoVar != null) {
            beoVar.c = bcbVar.l.size();
        }
        int i = 0;
        if (z) {
            k();
            this.b = true;
        } else if (this.b) {
            this.c = bcbVar;
            cko ckoVar = (cko) ckw.i.i();
            aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            cko ckoVarH = cfd.h(ckoVar);
            try {
                bep bepVar = this.m;
                if (bepVar.d()) {
                    int i2 = bcbVar.b;
                    afob afobVar = this.o;
                    if (i2 == afobVar.c() && (bceVar = bcbVar.a) != null) {
                        defpackage.bcc[] bccVarArr = bceVar.b;
                        bccVar = bccVarArr.length != 0 ? bccVarArr[0] : null;
                        if (bccVar != null && bccVar.a == afobVar.b()) {
                            bepVar.b();
                        }
                    }
                }
                return;
            } finally {
                cfd.i(ckoVar, ckoVarH, aonjVarI);
            }
        }
        this.e -= bcbVar.d;
        this.d.b(bcbVar);
        defpackage.bce bceVar2 = bcbVar.a;
        this.w.b(java.lang.Boolean.valueOf(((bceVar2 == null || bceVar2.a == 0) && bcbVar.b == 0) ? false : true));
        this.v.b(java.lang.Boolean.valueOf(bcbVar.c));
        afob afobVar2 = this.o;
        if (z2) {
            int i3 = bcbVar.b;
            if (i3 < 0.0f) {
                defpackage.avo.d("scrollOffset should be non-negative");
            }
            afobVar2.e(i3);
        } else {
            if (bceVar2 != null) {
                defpackage.bcc[] bccVarArr2 = bceVar2.b;
                defpackage.bcc bccVar2 = bccVarArr2.length == 0 ? null : bccVarArr2[0];
                if (bccVar2 != null) {
                    obj = bccVar2.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            afobVar2.c = obj;
            if (afobVar2.a || bcbVar.n > 0) {
                afobVar2.a = true;
                int i4 = bcbVar.b;
                if (i4 < 0.0f) {
                    defpackage.avo.d(a.bw((byte) 41, i4, "scrollOffset should be non-negative ("));
                }
                if (bceVar2 != null) {
                    defpackage.bcc[] bccVarArr3 = bceVar2.b;
                    bccVar = bccVarArr3.length != 0 ? bccVarArr3[0] : null;
                    if (bccVar != null) {
                        i = bccVar.a;
                    }
                }
                afobVar2.f(i, i4);
            }
            defpackage.bbo bboVarK = k();
            if (bboVarK != null && this.t) {
                rai raiVarL = l();
                defpackage.bbp bbpVar = bboVarK.b;
                bbpVar.a = bcbVar;
                bbpVar.b = raiVarL;
                bboVarK.a.b(bbpVar);
            }
        }
        if (z) {
            this.m.c(bcbVar.e, bcbVar.g, bcbVar.f);
        }
        this.s++;
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.w.a()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) this.v.a()).booleanValue();
    }

    public final boolean h() {
        return this.r.h();
    }

    public final defpackage.bcb i() {
        return (defpackage.bcb) this.d.a();
    }

    public final void j(float f, defpackage.bcb bcbVar) {
        defpackage.bbo bboVarK = k();
        if (bboVarK == null || !this.t) {
            return;
        }
        rai raiVarL = l();
        defpackage.bbp bbpVar = bboVarK.b;
        bbpVar.a = bcbVar;
        bbpVar.b = raiVarL;
        bboVarK.a.a(bbpVar, f);
    }

    public final defpackage.bbo k() {
        cko ckoVar = (cko) ckw.i.i();
        aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        cko ckoVarH = cfd.h(ckoVar);
        try {
            defpackage.bbo bboVar = ((defpackage.bcb) this.d.a()).r;
            cfd.i(ckoVar, ckoVarH, aonjVarI);
            if (bboVar != null) {
                return bboVar;
            }
            return null;
        } catch (java.lang.Throwable th) {
            cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th;
        }
    }
}
