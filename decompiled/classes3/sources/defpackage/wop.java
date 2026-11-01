package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wop implements defpackage.wot {
    private static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/state/XatuLifecycleUpdater");
    private defpackage.won b;
    private java.lang.Long c;

    public wop(aazc aazcVar) {
        aooh.f(aazcVar, "clock");
        this.b = defpackage.won.UNKNOWN;
    }

    @Override // defpackage.wot
    public final defpackage.wos a(defpackage.wos wosVar) {
        aooh.f(wosVar, "model");
        defpackage.vqf vqfVarP = wsc.P(wosVar.p());
        akzx akzxVarM = defpackage.woo.a.m();
        aooh.f(akzxVarM, "builder");
        defpackage.won wonVar = this.b;
        aooh.f(wonVar, "value");
        akzxVarM.u();
        ((defpackage.woo) akzxVarM.b).c = wonVar.a();
        java.lang.Long l = this.c;
        if (l != null) {
            long jLongValue = l.longValue();
            akzxVarM.u();
            defpackage.woo wooVar = (defpackage.woo) akzxVarM.b;
            wooVar.b |= 1;
            wooVar.d = jLongValue;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.woo wooVar2 = (defpackage.woo) aladVarP;
        aooh.f(wooVar2, "value");
        akzx akzxVar = (akzx) vqfVarP.a;
        akzxVar.u();
        defpackage.wos wosVar2 = (defpackage.wos) akzxVar.b;
        j$.util.Objects.requireNonNull(wooVar2);
        wosVar2.d = wooVar2;
        wosVar2.b |= 2;
        return vqfVarP.e();
    }

    @Override // defpackage.wot
    public final void b(defpackage.wor worVar) {
        defpackage.won wonVar;
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int i = worVar.b;
        int iH = wsc.H(i);
        if (iH == 0) {
            throw null;
        }
        int i2 = iH - 1;
        if (i2 == 7) {
            wonVar = defpackage.won.CLOSED;
        } else if (i2 == 14) {
            if ((i == 18 ? (defpackage.wnr) worVar.c : defpackage.wnr.a).c) {
                wonVar = !(worVar.b == 18 ? (defpackage.wnr) worVar.c : defpackage.wnr.a).d ? defpackage.won.CLOSED : defpackage.won.UI_SHOWN_NOT_IN_SESSION;
            } else {
                wonVar = defpackage.won.NOT_A_XATU_CALL;
            }
        } else if (i2 == 10) {
            wonVar = defpackage.won.UI_SHOWN_NOT_IN_SESSION;
        } else {
            if (i2 != 11) {
                throw new java.lang.IllegalStateException("Unsupported Action");
            }
            this.c = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
            wonVar = defpackage.won.IN_SESSION;
        }
        this.b = wonVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r10.b == defpackage.won.UNKNOWN) goto L53;
     */
    @Override // defpackage.wot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.wor r11) throws aois {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wop.c(wor):int");
    }

    @Override // defpackage.wot
    public final void d(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
    }
}
