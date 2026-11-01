package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdi {
    private static defpackage.apdi e;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    private apdi(android.content.Context context) {
        this.d = new defpackage.akgm();
        defpackage.akgk akgkVar = new defpackage.akgk(context.getAssets());
        this.a = akgkVar;
        this.c = new defpackage.akgt(new defpackage.ajyk("Metadata", (byte[]) null), akgkVar, null);
        this.b = new defpackage.akgt(new defpackage.ajyk("ShortNums", (byte[]) null), akgkVar);
        new defpackage.aogc(akgkVar, new defpackage.akgq(new defpackage.akgo(0)));
    }

    public static synchronized void d(android.content.Context context) {
        if (e != null) {
            throw new java.lang.IllegalStateException("Context already configured");
        }
        e = new defpackage.apdi(context);
    }

    public static defpackage.apdi f() {
        defpackage.apdi apdiVar = e;
        if (apdiVar != null) {
            return apdiVar;
        }
        throw new java.lang.IllegalStateException("Context not configured");
    }

    public final int a() {
        return ((defpackage.alac) this.a).a;
    }

    public final defpackage.alcr b() {
        return ((defpackage.alac) this.a).b;
    }

    public final void c(java.lang.Object obj) {
        if (((defpackage.alac) this.a).a() != defpackage.alcs.h) {
            return;
        }
        ((java.lang.Integer) obj).intValue();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq e(int i) {
        return defpackage.ahvr.H(this.c.submit(defpackage.ahqx.i(new lqh(this, i, 11))), new tbc(i, 7), this.b);
    }

    public apdi(defpackage.alcr alcrVar, java.lang.Object obj, defpackage.alcr alcrVar2, java.lang.Object obj2) {
        this.a = alcrVar;
        this.c = obj;
        this.d = alcrVar2;
        this.b = obj2;
    }

    public apdi(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService2) {
        this.a = context;
        this.d = executor;
        this.b = scheduledExecutorService;
        this.c = scheduledExecutorService2;
    }

    public apdi(java.lang.Object obj, defpackage.aono aonoVar, defpackage.aono aonoVar2, defpackage.aono aonoVar3) {
        this.a = obj;
        this.b = aonoVar;
        this.c = aonoVar2;
        this.d = aonoVar3;
    }

    public apdi(defpackage.albh albhVar, java.lang.Object obj, defpackage.albh albhVar2, defpackage.alac alacVar) {
        if (albhVar != null) {
            if (alacVar.b == defpackage.alcr.MESSAGE && albhVar2 == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.d = albhVar;
            this.b = obj;
            this.c = albhVar2;
            this.a = alacVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public apdi() {
        throw null;
    }

    public apdi(android.content.Context context, android.content.pm.PackageManager packageManager, defpackage.ajct ajctVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(packageManager, "packageManager");
        defpackage.aooh.f(ajctVar, "backgroundExecutor");
        this.a = context;
        this.d = packageManager;
        this.b = ajctVar;
        this.c = new defpackage.agtc(defpackage.ahqx.b(new defpackage.ahmg(this, 1)), ajctVar);
    }

    public apdi(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ajxw ajxwVar, android.app.Application application) {
        this.b = defpackage.ahvr.bI(new ahiw(this, 1));
        this.c = defpackage.ahvr.bI(new ahiw(this, 0));
        defpackage.afit afitVarD = defpackage.afit.d("tiktok");
        this.d = afitVarD;
        defpackage.afis afisVar = afitVarD.c;
        if (afisVar == null) {
            this.a = defpackage.afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.a = afisVar;
            ((defpackage.afiv) afisVar).f = ajxwVar;
        }
    }

    public apdi(android.content.Context context, defpackage.ajct ajctVar, java.util.concurrent.Executor executor, defpackage.ahyn ahynVar) {
        this.a = context;
        this.c = ajctVar;
        this.b = executor;
        this.d = (defpackage.ahua) ((defpackage.ahys) ahynVar).a;
    }

    public apdi(byte[] bArr) {
        this.d = new java.util.HashMap();
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
    }

    public apdi(defpackage.ajnb ajnbVar) {
        this.d = new java.util.HashMap(ajnbVar.a);
        this.a = new java.util.HashMap(ajnbVar.b);
        this.b = new java.util.HashMap(ajnbVar.c);
        this.c = new java.util.HashMap(ajnbVar.d);
    }
}
