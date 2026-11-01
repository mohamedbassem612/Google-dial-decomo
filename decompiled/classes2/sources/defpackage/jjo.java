package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jjo {
    public static final aimz a = aimz.i("com/android/dialer/blockreportspam/BlockOptionallyReportDialogFragmentPeer");
    public final defpackage.jjf b;
    public final rlv c;
    public final ucr d;
    public final agtj e;
    public final defpackage.jmk f;
    public final aoss g;
    public boolean h;
    public boolean i;
    public final java.util.concurrent.atomic.AtomicBoolean j;
    public final agtk k;
    public final agtk l;
    public final agtk m;
    public final agtk n;
    public final agtk o;
    public final agtk p;
    public final uhs q;
    public final zjm r;
    public final zjm s;
    public final zjm t;
    public final gpd u;
    public final ucm v;
    private final kgl w;
    private final ipc x;

    public jjo(defpackage.jjf jjfVar, ucm ucmVar, rlv rlvVar, gpd gpdVar, kgl kglVar, ipc ipcVar, ucr ucrVar, uhs uhsVar, agtj agtjVar, zjm zjmVar, defpackage.jmk jmkVar, zjm zjmVar2, zjm zjmVar3, aoss aossVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(kglVar, "blocking");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(aossVar, "lightweightScope");
        this.b = jjfVar;
        this.v = ucmVar;
        this.c = rlvVar;
        this.u = gpdVar;
        this.w = kglVar;
        this.x = ipcVar;
        this.d = ucrVar;
        this.q = uhsVar;
        this.e = agtjVar;
        this.r = zjmVar;
        this.f = jmkVar;
        this.s = zjmVar2;
        this.t = zjmVar3;
        this.g = aossVar;
        this.j = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.k = new defpackage.jji(this);
        this.l = new defpackage.jjh(this);
        this.m = new defpackage.jjm(this);
        this.n = new defpackage.jjk(this);
        this.o = new defpackage.jjl(this);
        this.p = new defpackage.jjj();
    }

    public static final int c(boolean z) {
        return z ? 2132017583 : 2132017585;
    }

    public static final void d(android.view.View view, android.widget.CompoundButton compoundButton) {
        dzs.i(view, new defpackage.jjn(compoundButton));
    }

    public final void a(int i) {
        defpackage.jjx jjxVar = this.f.d;
        if (jjxVar == null) {
            jjxVar = defpackage.jjx.a;
        }
        defpackage.jjf jjfVar = this.b;
        java.lang.String str = jjxVar.c;
        aooh.e(str, "getNormalizedNumber(...)");
        defpackage.hht.c(jjfVar, str, i);
    }

    public final void b(defpackage.jjx jjxVar) {
        this.c.n(rmw.m);
        int iAD = a.aD(jjxVar.g);
        if (iAD != 0 && iAD == 2) {
            this.x.bm(rmu.m);
        }
        this.e.i(zoe.N(this.w.j(aify.p(jjxVar.c), jjxVar.e)), this.l);
    }
}
