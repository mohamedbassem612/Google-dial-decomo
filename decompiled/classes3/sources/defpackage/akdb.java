package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akdb extends aipo {
    public static final /* synthetic */ int d = 0;
    private static final long e;
    public final java.util.concurrent.Executor a;
    public final ahzi b;
    public final apjb c;
    private final android.content.Context f;
    private final aoin g;
    private final defpackage.akdj h;
    private final aoin i;
    private final boolean j;
    private volatile defpackage.aevx k;
    private final defpackage.agwm l;
    private final apjb m;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        e = 3600L;
    }

    public akdb(android.content.Context context, zzz zzzVar, aevo aevoVar, java.util.concurrent.Executor executor, aoin aoinVar, defpackage.agwm agwmVar, aoin aoinVar2, boolean z, apjb apjbVar) {
        apjb apjbVar2 = new apjb(context, zzzVar);
        super((java.lang.String) null);
        this.f = context;
        this.c = apjbVar2;
        this.a = executor;
        this.i = aoinVar;
        this.l = agwmVar;
        this.j = z;
        this.m = apjbVar;
        defpackage.akcz akczVar = new defpackage.akcz(this, context, aoinVar2, aoinVar);
        this.g = akczVar;
        this.h = new defpackage.akdj(e, akczVar);
        this.b = ahvr.bI(new fff(aevoVar, context, 10));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[Catch: all -> 0x0094, TryCatch #0 {, blocks: (B:27:0x0085, B:29:0x0089, B:30:0x0090), top: B:39:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void e(defpackage.akdq akdqVar, ajcq ajcqVar) {
        defpackage.aevx aevxVar;
        ajcq ajcqVarA;
        apjb apjbVar = this.m;
        if (apjbVar != null) {
            long jE = akdqVar.e((albw) null);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = (-86400000) + jElapsedRealtime;
            if (j > 0) {
                j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (j$.util.concurrent.ConcurrentLinkedQueue) apjbVar.a;
                for (defpackage.akdg akdgVar = (defpackage.akdg) concurrentLinkedQueue.peek(); akdgVar != null && akdgVar.a <= j; akdgVar = (defpackage.akdg) concurrentLinkedQueue.peek()) {
                    if (concurrentLinkedQueue.remove(akdgVar)) {
                        ((java.util.concurrent.atomic.AtomicLong) apjbVar.b).addAndGet(-akdgVar.b);
                    }
                }
            }
            java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) apjbVar.b;
            long j2 = atomicLong.get();
            int i = 0;
            while (true) {
                if (i >= 10 || j2 + jE >= 1048576) {
                    android.util.Log.w("ClientLoggingBackend", "Log rate too high, dropping logs.");
                    ajcqVarA = aiql.z(java.lang.Boolean.FALSE);
                } else {
                    j2 = atomicLong.get();
                    if (atomicLong.compareAndSet(j2, j2 + jE)) {
                        ((j$.util.concurrent.ConcurrentLinkedQueue) apjbVar.a).offer(new defpackage.akdg(jElapsedRealtime, jE));
                        break;
                    }
                    i++;
                }
            }
            aevxVar = this.k;
            if (aevxVar == null) {
                synchronized (this) {
                    aevxVar = this.k;
                    if (aevxVar == null) {
                        aevxVar = new defpackage.aevx();
                        this.k = aevxVar;
                    }
                }
            }
            ajcqVarA = aevxVar.a(this.f, this.j, true);
        } else {
            aevxVar = this.k;
            if (aevxVar == null) {
                synchronized (this) {
                    aevxVar = this.k;
                    if (aevxVar == null) {
                        aevxVar = new defpackage.aevx();
                        this.k = aevxVar;
                    }
                }
            }
            ajcqVarA = aevxVar.a(this.f, this.j, true);
        }
        aiql.I(ajcqVarA, ahqx.f(new afjo(this, ajcqVar, akdqVar, 5)), ajbm.a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0177  */
    /* JADX WARN: Type inference failed for: r1v8, types: [akcr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [akcr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [akcr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [akcr, java.lang.Object] */
    public final void a(aiom aiomVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        long j;
        java.lang.Throwable th2;
        aoin aoinVar = this.i;
        if (aoinVar.a().c(aiomVar)) {
            java.lang.Throwable th3 = null;
            ajcq ajcqVar = (ajcq) this.l.n(aiomVar).d(aiql.z((java.lang.Object) null));
            defpackage.akdj akdjVar = this.h;
            defpackage.akdi akdiVar = new defpackage.akdi(aiomVar.f(), aiomVar.o() != null ? aiomVar.o().b : null);
            long jE = aiomVar.e();
            synchronized (akdjVar) {
                if (jE < akdjVar.c && akdjVar.d.size() < 1000) {
                    th = th3;
                    j = 0;
                    break;
                }
                long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(akdjVar.a);
                java.util.LinkedHashMap linkedHashMap = akdjVar.d;
                java.util.Iterator it = linkedHashMap.values().iterator();
                int size = linkedHashMap.size();
                while (true) {
                    if (!it.hasNext()) {
                        th = th3;
                        j = 0;
                        break;
                    }
                    th = th3;
                    defpackage.akdh akdhVar = (defpackage.akdh) it.next();
                    j = 0;
                    long j2 = akdhVar.b + nanos;
                    if (j2 >= jE && size <= 1000) {
                        akdjVar.c = j2;
                        break;
                    }
                    if (akdhVar.c > 0 && akdjVar.e.size() < 1000) {
                        akdjVar.e.add(akdhVar);
                    }
                    it.remove();
                    size--;
                    th3 = th;
                }
                java.util.LinkedHashMap linkedHashMap2 = akdjVar.d;
                defpackage.akdh akdhVar2 = (defpackage.akdh) linkedHashMap2.get(akdiVar);
                if (akdhVar2 != null) {
                    if (akdhVar2.c == j) {
                        akdhVar2.d = ((defpackage.akcz) akdjVar.b).a().b(aiomVar, 3, defpackage.akcw.a);
                    }
                    akdhVar2.c++;
                    for (defpackage.akdh akdhVar3 : akdjVar.a()) {
                        ahvr.bY(akdhVar3.c > j);
                        akzx akzxVar = akdhVar3.d;
                        ahvr.ci(akzxVar);
                        long j3 = akdhVar3.c;
                        akzxVar.u();
                        defpackage.akdq akdqVar = (defpackage.akdq) akzxVar.b;
                        defpackage.akdq akdqVar2 = defpackage.akdq.a;
                        akdqVar.b |= 2;
                        akdqVar.d = j3;
                        e((defpackage.akdq) akzxVar.p(), akdhVar3.a);
                    }
                    return;
                }
                linkedHashMap2.put(akdiVar, new defpackage.akdh(ajcqVar, jE));
                defpackage.akcw akcwVarA = ((defpackage.akcz) this.g).a();
                defpackage.akcu akcuVarA = defpackage.akcv.a();
                akcuVarA.b(true);
                akcuVarA.c(true);
                akcuVarA.d(true);
                akzx akzxVarB = akcwVarA.b(aiomVar, 2, akcuVarA.a());
                java.lang.Throwable th4 = (java.lang.Throwable) defpackage.akcw.a(aiomVar, ainc.a);
                aoinVar.a().d();
                if (aiomVar.r().intValue() >= Integer.MAX_VALUE && !(th4 instanceof aink)) {
                    aiwf aiwfVar = ((defpackage.akdq) akzxVarB.b).g;
                    if (aiwfVar == null) {
                        aiwfVar = aiwf.a;
                    }
                    akzx akzxVarP = aiwfVar.p();
                    aoinVar.a().d();
                    akzx akzxVarT = ajee.t(new defpackage.akda(th4));
                    akzxVarP.u();
                    aiwf aiwfVar2 = akzxVarP.b;
                    aiwk aiwkVarP = akzxVarT.p();
                    j$.util.Objects.requireNonNull(aiwkVarP);
                    aiwfVar2.k = aiwkVarP;
                    aiwfVar2.b |= 1024;
                    aiwf aiwfVarP = akzxVarP.p();
                    akzxVarB.u();
                    defpackage.akdq akdqVar3 = (defpackage.akdq) akzxVarB.b;
                    j$.util.Objects.requireNonNull(aiwfVarP);
                    akdqVar3.g = aiwfVarP;
                    akdqVar3.b |= 64;
                }
                if (aoinVar.a().a()) {
                    if (!ahns.q() || (ahns.b() instanceof ahnj)) {
                        th2 = th;
                    } else {
                        ahor ahorVarV = ahns.v(((ahpe) ahns.d.get()).c, aesb.d);
                        if (ahorVarV.b()) {
                            th2 = (aesb) ahorVarV.a();
                        } else {
                            th2 = th;
                        }
                    }
                    ahwt ahwtVarG = th2 == null ? ahwt.a : ahyn.g(th2.a());
                    if (ahwtVarG.f()) {
                        throw th;
                    }
                }
                boolean z = ahns.a;
                aift aiftVar = new aift(4);
                for (ahpj ahpjVarB = ahns.b(); ahpjVarB != null; ahpjVarB = ahpjVarB.b()) {
                    aiftVar.i(ahpjVarB.d());
                }
                java.util.List listAN = ahvr.aN(aiftVar.h());
                if (!listAN.isEmpty()) {
                    akzx akzxVarM = defpackage.akdn.a.m();
                    akzxVarM.u();
                    defpackage.akdn akdnVar = (defpackage.akdn) akzxVarM.b;
                    alat alatVar = akdnVar.b;
                    if (!alatVar.c()) {
                        akdnVar.b = alad.J(alatVar);
                    }
                    akyl.i(listAN, akdnVar.b);
                    akzxVarB.u();
                    defpackage.akdq akdqVar4 = (defpackage.akdq) akzxVarB.b;
                    defpackage.akdn akdnVar2 = (defpackage.akdn) akzxVarM.p();
                    defpackage.akdq akdqVar5 = defpackage.akdq.a;
                    j$.util.Objects.requireNonNull(akdnVar2);
                    akdqVar4.h = akdnVar2;
                    akdqVar4.b |= 128;
                }
                e((defpackage.akdq) akzxVarB.p(), ajcqVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [akcr, java.lang.Object] */
    public final boolean b(java.util.logging.Level level) {
        return this.i.a().b(level);
    }

    public final void c(java.lang.RuntimeException runtimeException, aiom aiomVar) {
        android.util.Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }
}
