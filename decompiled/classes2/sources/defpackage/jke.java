package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jke {
    public static final aimz a = aimz.i("com/android/dialer/blockreportspam/BlockingNumberAndOptionallyReportingAsSpamFragmentPeer");
    public final defpackage.jjy b;
    public final rlv c;
    public final ucr d;
    public final agtj e;
    public final defpackage.jmk f;
    public final aoss g;
    public final agtk h;
    public final agtk i;
    public final agtk j;
    public final agtk k;
    public final agtk l;
    public final uhs m;
    public final zjm n;
    public final zjm o;
    public final gpd p;
    public final ucm q;
    private final kgl r;
    private final ipc s;

    public jke(defpackage.jjy jjyVar, ucm ucmVar, rlv rlvVar, gpd gpdVar, kgl kglVar, ipc ipcVar, ucr ucrVar, uhs uhsVar, agtj agtjVar, zjm zjmVar, defpackage.jmk jmkVar, zjm zjmVar2, aoss aossVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(kglVar, "blocking");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(aossVar, "lightweightScope");
        this.b = jjyVar;
        this.q = ucmVar;
        this.c = rlvVar;
        this.p = gpdVar;
        this.r = kglVar;
        this.s = ipcVar;
        this.d = ucrVar;
        this.m = uhsVar;
        this.e = agtjVar;
        this.n = zjmVar;
        this.f = jmkVar;
        this.o = zjmVar2;
        this.g = aossVar;
        this.h = new defpackage.jka(this);
        this.i = new defpackage.jjz(this);
        this.j = new defpackage.jkd(this);
        this.k = new defpackage.jkc(this);
        this.l = new defpackage.jkb();
    }

    public static final defpackage.al a(defpackage.jmk jmkVar) {
        aooh.f(jmkVar, "argument");
        defpackage.jjy jjyVar = new defpackage.jjy();
        amxr.g(jjyVar);
        ahgl.b(jjyVar, jmkVar);
        return jjyVar;
    }

    public final void b(defpackage.jjx jjxVar) {
        this.c.n(rmw.m);
        int iAD = a.aD(jjxVar.g);
        if (iAD != 0 && iAD == 2) {
            this.s.bm(rmu.m);
        }
        this.e.i(zoe.N(this.r.j(aify.p(jjxVar.c), jjxVar.e)), this.i);
    }
}
