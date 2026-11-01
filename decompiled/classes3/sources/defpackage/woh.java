package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class woh implements defpackage.wot {
    private boolean a;

    @Override // defpackage.wot
    public final defpackage.wos a(defpackage.wos wosVar) {
        aooh.f(wosVar, "model");
        defpackage.vqf vqfVarP = wsc.P(wosVar.p());
        defpackage.vqu vquVarR = wsc.R(vqfVarP.f().p());
        defpackage.vqu vquVarS = wsc.S(vquVarR.p().p());
        java.lang.Object obj = vquVarS.a;
        boolean z = this.a;
        akzx akzxVar = (akzx) obj;
        akzxVar.u();
        ((defpackage.woy) akzxVar.b).c = z;
        vquVarR.r(vquVarS.s());
        vqfVarP.g(vquVarR.q());
        return vqfVarP.e();
    }

    @Override // defpackage.wot
    public final void b(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int iH = wsc.H(worVar.b);
        if (iH == 0) {
            throw null;
        }
        int i = iH - 1;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("Unsupported Action");
            }
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.wot
    public final int c(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int iH = wsc.H(worVar.b);
        if (iH == 0) {
            throw null;
        }
        int i = iH - 1;
        if (i != 0) {
            if (i != 1) {
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
