package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class woj implements defpackage.wot {
    private boolean a;
    private java.lang.Long b;

    @Override // defpackage.wot
    public final defpackage.wos a(defpackage.wos wosVar) {
        aooh.f(wosVar, "model");
        defpackage.vqf vqfVarP = wsc.P(wosVar.p());
        defpackage.vqu vquVarR = wsc.R(vqfVarP.f().p());
        akzx akzxVar = (akzx) vquVarR.a;
        defpackage.wox woxVar = ((defpackage.wpg) akzxVar.b).g;
        if (woxVar == null) {
            woxVar = defpackage.wox.a;
        }
        aooh.e(woxVar, "getCachedIvrDataTimestamp(...)");
        akzx akzxVarP = woxVar.p();
        aooh.f(akzxVarP, "builder");
        boolean z = this.a;
        akzxVarP.u();
        ((defpackage.wox) akzxVarP.b).c = z;
        java.lang.Long l = this.b;
        if (l != null) {
            long jLongValue = l.longValue();
            akzxVarP.u();
            ((defpackage.wox) akzxVarP.b).b = jLongValue;
        }
        alad aladVarP = akzxVarP.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.wox woxVar2 = (defpackage.wox) aladVarP;
        aooh.f(woxVar2, "value");
        akzxVar.u();
        defpackage.wpg wpgVar = (defpackage.wpg) akzxVar.b;
        j$.util.Objects.requireNonNull(woxVar2);
        wpgVar.g = woxVar2;
        wpgVar.b |= 4;
        vqfVarP.g(vquVarR.q());
        return vqfVarP.e();
    }

    @Override // defpackage.wot
    public final void b(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int i = worVar.b;
        int iH = wsc.H(i);
        if (iH == 0) {
            throw null;
        }
        int i2 = iH - 1;
        if (i2 == 12) {
            this.a = true;
            this.b = java.lang.Long.valueOf((i == 14 ? (defpackage.wni) worVar.c : defpackage.wni.a).c);
        } else {
            if (i2 != 13) {
                throw new java.lang.IllegalStateException("Unsupported Action");
            }
            this.a = false;
        }
    }

    @Override // defpackage.wot
    public final int c(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int iH = wsc.H(worVar.b);
        if (iH == 0) {
            throw null;
        }
        int i = iH - 1;
        if (i != 12) {
            if (i != 13) {
                return 1;
            }
            if (this.a) {
                return 2;
            }
        } else if (!this.a) {
            return 2;
        }
        return 3;
    }

    @Override // defpackage.wot
    public final void d(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
    }
}
