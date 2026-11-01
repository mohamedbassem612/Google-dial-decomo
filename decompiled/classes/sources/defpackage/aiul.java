package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiul extends defpackage.ajac {
    public static final java.lang.Object a;
    public final defpackage.ahzi b;
    public final defpackage.aiue c;
    public final defpackage.ahyp d;
    public final defpackage.ahzh e;
    public final defpackage.ajcu f;
    public final defpackage.aiuk g;
    private final java.util.concurrent.Executor n;
    public volatile int h = 0;
    private final java.util.concurrent.atomic.AtomicReference o = new java.util.concurrent.atomic.AtomicReference(new defpackage.ajcm(new java.lang.Object()));

    static {
        java.util.logging.Logger.getLogger(defpackage.aiul.class.getCanonicalName());
        a = new java.lang.Object();
    }

    public aiul(defpackage.ahzi ahziVar, defpackage.aiue aiueVar, defpackage.ahyp ahypVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ahzp ahzpVar, defpackage.aiuk aiukVar) {
        this.b = ahziVar;
        this.c = aiueVar;
        ahypVar.getClass();
        this.d = ahypVar;
        this.n = new defpackage.aiui(this, executor);
        this.f = defpackage.aiql.s(scheduledExecutorService);
        this.g = aiukVar;
        defpackage.ahzh ahzhVar = new defpackage.ahzh(ahzpVar);
        ahzhVar.e();
        this.e = ahzhVar;
        d(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        c(new defpackage.aafk(this, 6), executor);
    }

    @Override // defpackage.ajac
    protected final void a() {
        defpackage.ajcl ajclVar = defpackage.ajcl.a;
        if (ajclVar == null) {
            ajclVar = new defpackage.ajcl();
        }
        defpackage.ajcq ajcqVar = (defpackage.ajcq) this.o.getAndSet(ajclVar);
        if (ajcqVar != null) {
            boolean z = true;
            if (isCancelled() && !r()) {
                z = false;
            }
            ajcqVar.cancel(z);
        }
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.ajcq ajcqVar = (defpackage.ajcq) this.o.get();
        java.lang.String string = ajcqVar.toString();
        defpackage.aiue aiueVar = this.c;
        defpackage.ahyp ahypVar = this.d;
        return "futureSupplier=[" + this.b.toString() + "], shouldContinue=[" + ahypVar.toString() + "], strategy=[" + aiueVar.toString() + "], tries=[" + this.h + ']' + (ajcqVar.isDone() ? "" : defpackage.a.bp((byte) 93, string, ", activeTry=["));
    }

    public final void d(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        defpackage.ajcq ajcqVar = (defpackage.ajcq) this.o.getAndSet(ajddVar);
        if (j != 0) {
            aiuf aiufVar = new aiuf(this, j, timeUnit);
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            int i = defpackage.ajan.c;
            defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, aiufVar);
            ajcqVar.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
            ajcqVar = ajalVar;
        }
        defpackage.ajat ajatVar = new defpackage.ajat() { // from class: aiug
            /* JADX WARN: Type inference failed for: r0v4, types: [ajcq, java.lang.Object] */
            @Override // defpackage.ajat
            public final defpackage.ajcq a(java.lang.Object obj) {
                defpackage.aiul aiulVar = this.a;
                aiulVar.h++;
                try {
                    return aiulVar.b.eZ();
                } catch (java.lang.Exception e) {
                    aiulVar.p(e);
                    return defpackage.ajcm.a;
                }
            }
        };
        java.util.concurrent.Executor executor = this.n;
        int i2 = defpackage.ajan.c;
        final defpackage.ajal ajalVar2 = new defpackage.ajal(ajcqVar, ajatVar);
        ajcqVar.c(ajalVar2, defpackage.aiql.t(executor, ajalVar2));
        defpackage.ajat ajatVar2 = new defpackage.ajat() { // from class: aiuh
            @Override // defpackage.ajat
            public final defpackage.ajcq a(java.lang.Object obj) throws defpackage.aitx {
                java.lang.Exception exc = (java.lang.Exception) obj;
                defpackage.ajcq ajcqVar2 = ajalVar2;
                if (ajcqVar2.isCancelled()) {
                    return ajcqVar2;
                }
                defpackage.aiul aiulVar = this.a;
                long millis = aiulVar.c.d(aiulVar.h, aiulVar.e.c()).toMillis();
                if (millis < 0 || !aiulVar.d.a(exc)) {
                    defpackage.aiof aiofVar = defpackage.adhn.a;
                    int i3 = aiulVar.h;
                    throw new defpackage.aitx(exc);
                }
                defpackage.aiof aiofVar2 = defpackage.adhn.a;
                aiulVar.d(millis, java.util.concurrent.TimeUnit.MILLISECONDS);
                java.lang.Object obj2 = defpackage.aiul.a;
                return obj2 == null ? defpackage.ajcm.a : new defpackage.ajcm(obj2);
            }
        };
        int i3 = defpackage.aizu.d;
        defpackage.aizs aizsVar = new defpackage.aizs(ajalVar2, java.lang.Exception.class, ajatVar2);
        ajalVar2.c(aizsVar, defpackage.aiql.t(executor, aizsVar));
        ajddVar.q(aizsVar);
        ajddVar.c(new defpackage.aiuj(this, ajddVar), defpackage.ajbm.INSTANCE);
    }
}
