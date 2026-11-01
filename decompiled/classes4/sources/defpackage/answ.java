package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class answ extends anpv {
    public static final defpackage.anlw b;
    public final android.content.Intent c;
    public final android.os.UserHandle d;
    public final android.content.Context e;
    public final java.util.concurrent.Executor f;
    public final anrc g;
    public final anpu h;
    public defpackage.ansv i;
    public boolean j;
    public ajcq k;
    public defpackage.antw l;
    private final java.util.concurrent.Executor m;
    private boolean n;

    static {
        defpackage.anlw anlwVar = defpackage.anlw.a;
        defpackage.antt anttVar = new defpackage.antt(defpackage.anlw.a);
        anttVar.c(anrl.c, java.lang.Boolean.TRUE);
        b = anttVar.a();
    }

    public answ(android.content.Intent intent, anpq anpqVar) {
        this.c = intent;
        android.os.UserHandle userHandle = (android.os.UserHandle) anpqVar.a(anrl.b);
        this.d = userHandle;
        android.content.Context context = (android.content.Context) anpqVar.a(anrl.a);
        ahvr.cj(context, "SOURCE_ANDROID_CONTEXT");
        android.content.Context applicationContext = context.getApplicationContext();
        this.e = userHandle != null ? f(applicationContext, userHandle) : applicationContext;
        java.util.concurrent.Executor executor = anpqVar.f;
        ahvr.cj(executor, "NameResolver.Args.getOffloadExecutor()");
        this.f = executor;
        this.m = new ajdc(executor);
        this.g = anpqVar.c;
        this.h = anpqVar.d;
    }

    private static android.content.Context f(android.content.Context context, android.os.UserHandle userHandle) {
        try {
            return defpackage.antw.j(context, userHandle);
        } catch (java.lang.ReflectiveOperationException unused) {
            throw new java.lang.IllegalArgumentException("TARGET_ANDROID_USER NameResolver.Arg requires SDK_INT >= R and @SystemApi visibility");
        }
    }

    public final java.lang.String a() {
        return "localhost";
    }

    public final void b() {
        ahvr.bZ(this.l != null, "Not started!");
        e();
    }

    public final void c() {
        this.g.c();
        if (this.n) {
            return;
        }
        this.n = true;
        this.m.execute(new defpackage.alvr(this, 12));
    }

    public final void d(defpackage.antw antwVar) {
        ahvr.bZ(this.l == null, "Already started!");
        ahvr.bZ(!this.n, "Resolver is shutdown");
        this.l = antwVar;
        this.m.execute(new defpackage.alvr(this, 10));
        e();
    }

    public final void e() {
        anrc anrcVar = this.g;
        anrcVar.c();
        if (this.n) {
            return;
        }
        if (this.k != null) {
            this.j = true;
            return;
        }
        ajcq ajcqVarD = aiql.D(new defpackage.agqr(this, 13), this.m);
        this.k = ajcqVarD;
        ajcqVarD.c(new defpackage.alvr(this, 11), anrcVar);
    }
}
