package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzk implements mln {
    public boolean a;
    private final ajct b;
    private final rlv c;
    private final aoin d;
    private final mkj e;
    private final zjm f;
    private final gpd g;
    private final acxg h;
    private final defpackage.pgi i;

    public vzk(ajct ajctVar, defpackage.pgi pgiVar, acxg acxgVar, zjm zjmVar, gpd gpdVar, rlv rlvVar, aoin aoinVar, mkj mkjVar) {
        this.b = ajctVar;
        this.i = pgiVar;
        this.h = acxgVar;
        this.f = zjmVar;
        this.g = gpdVar;
        this.c = rlvVar;
        this.d = aoinVar;
        this.e = mkjVar;
    }

    public final void b(miw miwVar) {
        android.telecom.PhoneAccountHandle phoneAccountHandleA;
        this.g.i((java.lang.String) null).b(mce.A);
        if (miwVar.d) {
            this.c.o(rmx.AQ);
        }
        akzx akzxVarM = jxb.b.m();
        int i = true != miwVar.d ? 3 : 24;
        akzxVarM.u();
        jxb jxbVar = akzxVarM.b;
        jxbVar.d = i - 1;
        jxbVar.c |= 1;
        boolean z = this.a;
        akzxVarM.u();
        jxb jxbVar2 = akzxVarM.b;
        jxbVar2.c |= 131072;
        jxbVar2.s = z;
        j$.util.Optional optionalG = this.f.g();
        defpackage.vxc vxcVar = new defpackage.vxc(akzxVarM, 8);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            java.lang.Object obj2 = vxcVar.a;
            defpackage.abtr abtrVar = (defpackage.abtr) ((ucm) obj).b;
            if (abtrVar.r()) {
                akzx akzxVar = (akzx) obj2;
                akzxVar.u();
                jxb jxbVar3 = akzxVar.b;
                jxbVar3.c |= 524288;
                jxbVar3.u = true;
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
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(miwVar.e);
        amdxVar.v(true != miwVar.d ? 3 : 24);
        amdxVar.m((jxb) akzxVarM.p());
        if (((java.lang.Boolean) this.d.a()).booleanValue() && (phoneAccountHandleA = this.e.a()) != null) {
            amdxVar.r(phoneAccountHandleA);
        }
        this.h.w((defpackage.zrx) amdxVar.a);
    }

    public final ajcq c(java.lang.String str) {
        return ahrv.g(this.i.r()).h(new vuj(this, 13), this.b);
    }

    public final /* synthetic */ void a(mjc mjcVar) {
    }
}
