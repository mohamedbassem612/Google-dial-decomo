package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tda implements mln {
    private static final aimz b = aimz.i("com/android/dialer/rtt/settings/impl/precalldialpad/RttPreCallDialpadIntegration");
    public boolean a;
    private final ajcu c;
    private final tcv d;
    private final aoin e;
    private final mkj f;
    private final gpd g;
    private final acxg h;
    private final defpackage.pgi i;

    public tda(ajcu ajcuVar, tcv tcvVar, defpackage.pgi pgiVar, gpd gpdVar, acxg acxgVar, aoin aoinVar, mkj mkjVar) {
        this.c = ajcuVar;
        this.d = tcvVar;
        this.i = pgiVar;
        this.g = gpdVar;
        this.h = acxgVar;
        this.e = aoinVar;
        this.f = mkjVar;
    }

    public final void b(miw miwVar) {
        android.telecom.PhoneAccountHandle phoneAccountHandleA;
        b.b().l("com/android/dialer/rtt/settings/impl/precalldialpad/RttPreCallDialpadIntegration", "click", 73, "RttPreCallDialpadIntegration.java").v("enter");
        akzx akzxVarM = jxb.b.m();
        boolean z = miwVar.d;
        akzxVarM.u();
        jxb jxbVar = akzxVarM.b;
        jxbVar.d = (true != z ? 3 : 24) - 1;
        jxbVar.c |= 1;
        boolean z2 = this.a;
        akzxVarM.u();
        jxb jxbVar2 = akzxVarM.b;
        jxbVar2.c |= 131072;
        jxbVar2.s = z2;
        jxb jxbVarP = akzxVarM.p();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(miwVar.e);
        amdxVar.v(true == miwVar.d ? 24 : 3);
        amdxVar.m(jxbVarP);
        miu miuVar = miwVar.c;
        if (miuVar == null) {
            miuVar = miu.a;
        }
        miv mivVarB = miv.b(miuVar.c);
        if (mivVarB == null) {
            mivVarB = miv.a;
        }
        if (mivVarB == miv.e) {
            amdxVar.p(true);
        } else {
            this.g.i((java.lang.String) null).b(mce.A);
        }
        if (((java.lang.Boolean) this.e.a()).booleanValue() && (phoneAccountHandleA = this.f.a()) != null) {
            amdxVar.r(phoneAccountHandleA);
        }
        this.h.w((defpackage.zrx) amdxVar.a);
    }

    public final ajcq c(java.lang.String str) {
        b.b().l("com/android/dialer/rtt/settings/impl/precalldialpad/RttPreCallDialpadIntegration", "load", 116, "RttPreCallDialpadIntegration.java").v("enter");
        defpackage.pgi pgiVar = this.i;
        ajcq ajcqVarA = this.d.a();
        ajcq ajcqVarR = pgiVar.r();
        return ahvr.ak(new ajcq[]{ajcqVarA, ajcqVarR}).o(new defpackage.tbb((java.lang.Object) this, ajcqVarA, ajcqVarR, 2), this.c);
    }

    public final /* synthetic */ void a(mjc mjcVar) {
    }
}
