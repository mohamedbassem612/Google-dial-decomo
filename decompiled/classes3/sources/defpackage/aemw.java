package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aemw implements aemh {
    public static final /* synthetic */ int b = 0;
    private static final xm k;
    private final android.content.Context c;
    private final defpackage.aaqj d;
    private final java.util.concurrent.Executor e;
    private final aelx f;
    private final aabx g;
    private final aada i;
    private final aada j;
    public final java.util.concurrent.CopyOnWriteArrayList a = new java.util.concurrent.CopyOnWriteArrayList();
    private final defpackage.aaqi h = new defpackage.aaqi() { // from class: aemv
        @Override // defpackage.aaqi
        public final void a() {
            java.util.Iterator it = this.a.a.iterator();
            while (it.hasNext()) {
                ((defpackage.aemg) it.next()).a();
            }
        }
    };

    static {
        xm xmVar = new xm((char[]) null);
        xmVar.a = 1;
        k = xmVar;
    }

    public aemw(android.content.Context context, aada aadaVar, defpackage.aaqj aaqjVar, aada aadaVar2, aelx aelxVar, java.util.concurrent.Executor executor, aabx aabxVar) {
        this.c = context;
        this.i = aadaVar;
        this.d = aaqjVar;
        this.j = aadaVar2;
        this.e = executor;
        this.f = aelxVar;
        this.g = aabxVar;
    }

    public static java.lang.Object h(ajcq ajcqVar, java.lang.String str) throws java.util.concurrent.ExecutionException {
        try {
            return aiql.H(ajcqVar);
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if ((cause instanceof aacm) || (cause instanceof aacl)) {
                throw e;
            }
            android.util.Log.e("OneGoogle", java.lang.String.format("Failed to load %s. Exception: %s", str, aehj.m(cause)));
            return null;
        }
    }

    private final ajcq i(int i) {
        return aacn.f(i) ? aiql.y(new aacm(i, "Google Play Services not available", this.g.m(this.c, i, (java.lang.String) null))) : aiql.y(new aacl(i));
    }

    public final ajcq a() {
        return c();
    }

    public final ajcq b(java.lang.String str) {
        return ajan.f(c(), ahqx.a(new defpackage.adek(str, 10)), ajbm.a);
    }

    public final ajcq c() {
        ajcq ajcqVarC;
        aabx aabxVar = this.g;
        android.content.Context context = this.c;
        aemb aembVar = this.f;
        ajcq ajcqVarA = aembVar.a();
        int iL = aabxVar.l(context, 10000000);
        if (iL != 0) {
            ajcqVarC = i(iL);
        } else {
            aada aadaVar = this.i;
            xm xmVar = k;
            aaoo aaooVar = defpackage.aaqn.e;
            aade aadeVar = aadaVar.i;
            defpackage.aasd aasdVar = new defpackage.aasd(aaooVar, aadeVar, xmVar);
            aadeVar.b(aasdVar);
            ajcqVarC = aesg.c(aasdVar, ahqx.a(new defpackage.adfe(20)), ajbm.a);
        }
        ajcq ajcqVar = ajcqVarC;
        final aemb aembVar2 = aembVar;
        ajcq ajcqVarF = ahvr.F(new java.util.concurrent.Callable() { // from class: aelz
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String[] strArr = aemb.a;
                java.lang.String str = zwk.a;
                return java.util.Arrays.asList(zwq.i(aembVar2.b, strArr));
            }
        }, aembVar2.c);
        return ahvr.ai(new ajcq[]{ajcqVarA, ajcqVar, ajcqVarF}).o(new defpackage.wwx((java.lang.Object) ajcqVarA, (java.lang.Object) ajcqVarF, (java.lang.Object) ajcqVar, 12, (byte[]) null), ajbm.a);
    }

    public final void d(defpackage.aemg aemgVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList.isEmpty()) {
            defpackage.aaqj aaqjVar = this.d;
            aafe aafeVarV = aaqjVar.v(this.h, defpackage.aaqi.class.getName());
            defpackage.aarv aarvVar = new defpackage.aarv(aafeVarV);
            defpackage.aaav aaavVar = new defpackage.aaav(aarvVar, 7);
            defpackage.aaav aaavVar2 = new defpackage.aaav(aarvVar, 8);
            aafl aaflVar = new aafl();
            aaflVar.a = aaavVar;
            aaflVar.b = aaavVar2;
            aaflVar.c = aafeVarV;
            aaflVar.f = 2720;
            aaqjVar.l(aaflVar.a());
        }
        copyOnWriteArrayList.add(aemgVar);
    }

    public final void e(defpackage.aemg aemgVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        copyOnWriteArrayList.remove(aemgVar);
        if (copyOnWriteArrayList.isEmpty()) {
            this.d.j(aais.ay(this.h, defpackage.aaqi.class.getName()), 2721);
        }
    }

    public final ajcq f(java.lang.String str, int i) {
        return g(str, i);
    }

    public final ajcq g(java.lang.String str, int i) {
        int iL = this.g.l(this.c, 10400000);
        if (iL != 0) {
            return i(iL);
        }
        aada aadaVar = this.j;
        int iF = aesg.f(i);
        defpackage.aasg aasgVar = defpackage.aaqn.a;
        aade aadeVar = aadaVar.i;
        defpackage.aasf aasfVar = new defpackage.aasf(aasgVar, aadeVar, str, iF);
        aadeVar.b(aasfVar);
        return aesg.c(aasfVar, new defpackage.adfe(19), this.e);
    }
}
