package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzn implements mln {
    private static final aimz d = aimz.i("com/android/dialer/voiceprecalldialpad/waittime/WaitTimePreCallDialpadIntegration");
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(new defpackage.vzm(j$.util.Optional.empty(), 0));
    public final android.content.Context b;
    public final zjm c;
    private final aoin e;
    private final ajcu f;
    private final aoin g;
    private final mkj h;
    private final acxg i;

    public vzn(aoin aoinVar, android.content.Context context, ajcu ajcuVar, acxg acxgVar, zjm zjmVar, aoin aoinVar2, mkj mkjVar) {
        this.e = aoinVar;
        this.b = context;
        this.f = ajcuVar;
        this.i = acxgVar;
        this.c = zjmVar;
        this.g = aoinVar2;
        this.h = mkjVar;
    }

    public final void a(mjc mjcVar) {
        miu miuVar = mjcVar.c;
        if (miuVar == null) {
            miuVar = miu.a;
        }
        miv mivVarB = miv.b(miuVar.c);
        if (mivVarB == null) {
            mivVarB = miv.a;
        }
        if (mivVarB == miv.f) {
            a.bI(d.c().m(aioa.b), "ignore onButtonShown because of the wrong state", "com/android/dialer/voiceprecalldialpad/waittime/WaitTimePreCallDialpadIntegration", "onButtonShown", (char) 194, "WaitTimePreCallDialpadIntegration.java", zct.b);
        }
    }

    public final void b(miw miwVar) {
        android.telecom.PhoneAccountHandle phoneAccountHandleA;
        miu miuVar = miwVar.c;
        if (miuVar == null) {
            miuVar = miu.a;
        }
        miv mivVarB = miv.b(miuVar.c);
        if (mivVarB == null) {
            mivVarB = miv.a;
        }
        defpackage.vzm vzmVar = (defpackage.vzm) this.a.get();
        if (mivVarB == miv.f) {
            a.bI(d.c().m(aioa.b), "ignore the click of chat button because of the wrong state", "com/android/dialer/voiceprecalldialpad/waittime/WaitTimePreCallDialpadIntegration", "click", 'g', "WaitTimePreCallDialpadIntegration.java", zct.b);
            return;
        }
        if (mivVarB == miv.c) {
            akzx akzxVarM = jxb.b.m();
            int i = 1;
            int i2 = true != miwVar.d ? 3 : 24;
            akzxVarM.u();
            jxb jxbVar = akzxVarM.b;
            jxbVar.d = i2 - 1;
            jxbVar.c |= 1;
            miu miuVar2 = miwVar.c;
            if (miuVar2 == null) {
                miuVar2 = miu.a;
            }
            byte[] bArr = null;
            if (miuVar2.i == vzmVar.b) {
                j$.util.Optional optionalG = this.c.g();
                defpackage.whq whqVar = new defpackage.whq(akzxVarM, vzmVar, i, bArr);
                if (true == optionalG.isPresent()) {
                    java.lang.Object obj = optionalG.get();
                    java.lang.Object obj2 = whqVar.b;
                    java.lang.Object obj3 = whqVar.a;
                    java.lang.Object obj4 = ((ucm) obj).b;
                    boolean zIsPresent = ((defpackage.vzm) obj3).a.isPresent();
                    akzx akzxVar = (akzx) obj2;
                    akzxVar.u();
                    jxb jxbVar2 = akzxVar.b;
                    jxbVar2.c |= 262144;
                    jxbVar2.t = zIsPresent;
                    defpackage.abtr abtrVar = (defpackage.abtr) obj4;
                    boolean zR = abtrVar.r();
                    akzxVar.u();
                    jxb jxbVar3 = akzxVar.b;
                    jxbVar3.c |= 524288;
                    jxbVar3.u = zR;
                    if (abtrVar.r()) {
                        int iS = abtrVar.s(2);
                        akzxVar.u();
                        jxb jxbVar4 = akzxVar.b;
                        jxbVar4.c |= 1048576;
                        jxbVar4.v = iS;
                        int iS2 = abtrVar.s(3);
                        akzxVar.u();
                        jxb jxbVar5 = akzxVar.b;
                        jxbVar5.c |= 2097152;
                        jxbVar5.w = iS2;
                        int iS3 = abtrVar.s(4);
                        akzxVar.u();
                        jxb jxbVar6 = akzxVar.b;
                        jxbVar6.c |= 4194304;
                        jxbVar6.x = iS3;
                    }
                }
            }
            defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
            amdxVar.s(miwVar.e);
            amdxVar.v(true != miwVar.d ? 3 : 24);
            amdxVar.m((jxb) akzxVarM.p());
            if (((java.lang.Boolean) this.g.a()).booleanValue() && (phoneAccountHandleA = this.h.a()) != null) {
                amdxVar.r(phoneAccountHandleA);
            }
            this.i.w((defpackage.zrx) amdxVar.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, usa] */
    public final ajcq c(java.lang.String str) {
        if (afsq.bT(str) < ((java.lang.Long) this.e.a()).longValue()) {
            return aiql.z(aikn.a);
        }
        zjm zjmVar = this.c;
        return ahvr.H(zjmVar.g().isPresent() ? ((ucm) zjmVar.g().orElseThrow()).c.b(str) : aiql.z(j$.util.Optional.empty()), new vuj(this, 14), this.f);
    }
}
