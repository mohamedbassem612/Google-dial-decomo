package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jgs implements defpackage.jfg {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/session/BeeslyV2SessionLoggingListener");
    private final ixt b;
    private final defpackage.mba c;
    private boolean d;
    private long e;
    private final qbe f;

    public jgs(qbe qbeVar, aazc aazcVar, ixt ixtVar, defpackage.mba mbaVar) {
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aazcVar, "clock");
        this.f = qbeVar;
        this.b = ixtVar;
        this.c = mbaVar;
    }

    private final void b(defpackage.hxe hxeVar, boolean z) {
        qbc qbcVar;
        int iOrdinal = hxeVar.ordinal();
        if (iOrdinal == 1) {
            this.c.b(mce.hS);
            qbcVar = z ? qbc.oa : qbc.oq;
        } else if (iOrdinal == 2) {
            this.c.a(mcd.bk);
            qbcVar = z ? qbc.nZ : qbc.op;
        } else {
            if (iOrdinal != 3) {
                return;
            }
            this.c.a(mcd.bk);
            qbcVar = z ? qbc.ob : qbc.or;
        }
        this.f.a(qbcVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.jgr jgrVar;
        if (aolnVar instanceof defpackage.jgr) {
            jgrVar = (defpackage.jgr) aolnVar;
            int i = jgrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jgrVar.c = i - Integer.MIN_VALUE;
            } else {
                jgrVar = new defpackage.jgr(this, aolnVar);
            }
        } else {
            jgrVar = new defpackage.jgr(this, aolnVar);
        }
        java.lang.Object objF = jgrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jgrVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            ixt ixtVar = this.b;
            jgrVar.c = 1;
            objF = ixtVar.f(jgrVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        long jLongValue = ((java.lang.Number) objF).longValue();
        if (!this.d && this.e > 0 && jLongValue > 0 && j$.time.Instant.now().toEpochMilli() - this.e > jLongValue * 1000) {
            a.b().l("com/android/dialer/beesly/impl/v2/service/session/BeeslyV2SessionLoggingListener", "maybeLogDisclaimerBroken", 148, "BeeslyV2SessionLoggingListener.kt").v("Beesly disclaimer broken playback detected (V2)");
            this.f.a(qbc.oL);
        }
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object f(aoln aolnVar) {
        this.f.a(qbc.os);
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.jfg
    public final java.lang.Object g(defpackage.jfl jflVar, aoln aolnVar) throws aois {
        qbc qbcVar;
        qbc qbcVar2;
        if (jflVar instanceof defpackage.jfh) {
            defpackage.jfh jfhVar = (defpackage.jfh) jflVar;
            b(jfhVar.a, true);
            defpackage.hxe hxeVar = jfhVar.b;
            if (hxeVar != null) {
                b(hxeVar, false);
            }
        } else if (jflVar instanceof defpackage.jfi) {
            qbe qbeVar = this.f;
            int iOrdinal = ((defpackage.jfi) jflVar).a.ordinal();
            if (iOrdinal != 1) {
                qbcVar2 = iOrdinal != 2 ? qbc.oc : qbc.oe;
            } else {
                qbcVar2 = qbc.od;
            }
            qbeVar.a(qbcVar2);
        } else if (jflVar instanceof defpackage.jfj) {
            qbe qbeVar2 = this.f;
            switch (((defpackage.jfj) jflVar).a.ordinal()) {
                case 1:
                    qbcVar = qbc.og;
                    break;
                case 2:
                    qbcVar = qbc.oh;
                    break;
                case 3:
                    qbcVar = qbc.oi;
                    break;
                case 4:
                    qbcVar = qbc.oj;
                    break;
                case 5:
                    qbcVar = qbc.ok;
                    break;
                case 6:
                    qbcVar = qbc.ol;
                    break;
                default:
                    qbcVar = qbc.of;
                    break;
            }
            qbeVar2.a(qbcVar);
        } else {
            if (!aooh.n(jflVar, defpackage.jfk.a)) {
                throw new aois();
            }
            this.f.a(qbc.nY);
        }
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object h(aoln aolnVar) {
        this.f.a(qbc.nQ);
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object i(aoln aolnVar) {
        this.f.a(qbc.nT);
        java.lang.Object objA = a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.jfg
    public final java.lang.Object q() {
        this.f.a(qbc.nV);
        this.d = true;
        this.c.b(mce.hR);
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object r() {
        this.e = j$.time.Instant.now().toEpochMilli();
        this.f.a(qbc.nU);
        this.c.b(mce.hQ);
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object s() {
        this.f.a(qbc.nR);
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.jfg
    public final java.lang.Object t(defpackage.jfo jfoVar) throws aois {
        if (jfoVar instanceof defpackage.jfm) {
            this.f.a(((defpackage.jfm) jfoVar).a.ordinal() != 1 ? qbc.on : qbc.oo);
        } else {
            if (!aooh.n(jfoVar, defpackage.jfn.a)) {
                throw new aois();
            }
            this.f.a(qbc.om);
        }
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object u() {
        this.f.a(qbc.nS);
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object v() {
        this.f.a(qbc.nP);
        return aojh.a;
    }
}
