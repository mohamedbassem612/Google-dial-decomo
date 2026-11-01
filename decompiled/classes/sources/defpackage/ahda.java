package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahda {
    public final java.lang.Object a;

    public ahda(java.util.Map map, defpackage.ahcd ahcdVar) {
        if (map == null) {
            defpackage.aooh.i("map");
        }
        if (ahcdVar == null) {
            defpackage.aooh.i("metadata");
        }
        this.a = new java.util.concurrent.atomic.AtomicReference(new defpackage.ahcz(map, ahcdVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.ahpm c(java.lang.String str) {
        ahon ahonVar = new ahon(1);
        defpackage.ahos ahosVarB = defpackage.ahou.b();
        ahosVarB.a(defpackage.ahpc.c, ahonVar);
        return defpackage.ahvr.X(1419, str, ((defpackage.ahou) ahosVarB).f(), true);
    }

    public final defpackage.ahcd a() {
        return ((defpackage.ahcz) ((java.util.concurrent.atomic.AtomicReference) this.a).get()).a;
    }

    public final void b(java.lang.String str) {
        defpackage.aooh.f(str, "mendelPackage");
        java.lang.Object obj = ((defpackage.amyw) this.a).b;
        defpackage.aooh.e(obj, "get(...)");
        if (((defpackage.agab) defpackage.aooh.q((j$.util.Optional) obj)) != null) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final defpackage.ajcq d(defpackage.ajas ajasVar, defpackage.aihd aihdVar) {
        ?? r3;
        int i;
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashSet<defpackage.ahmh> hashSet = new java.util.HashSet();
        java.util.Iterator it = aihdVar.iterator();
        while (true) {
            r3 = this.a;
            int i2 = 2;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            defpackage.ahmi ahmiVar = (defpackage.ahmi) it.next();
            j$.util.Objects.requireNonNull(ahmiVar);
            defpackage.ahmg ahmgVar = new defpackage.ahmg(ahmiVar, i2);
            long j = defpackage.ahqx.a;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), new defpackage.ahqt(defpackage.ahns.c(false), ahmgVar, 0), 0));
            r3.execute(ajdkVar);
            defpackage.agsm.i(1406, ajdkVar, "Future Monitor failed", new java.lang.Object[0]);
            hashSet.add(new defpackage.ahmh(ahmiVar, ajdkVar));
        }
        long j2 = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar2 = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), new defpackage.ahqt(defpackage.ahns.c(false), ajasVar, 0), 0));
        ajdkVar2.run();
        defpackage.ajav ajavVar = new defpackage.ajav(defpackage.ahns.c(false), new java.util.concurrent.Callable() { // from class: ahmf
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }, 1);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ajcr ajcrVar = new defpackage.ajcr(ajavVar);
        ajdkVar2.c(ajcrVar, ajbmVar);
        ajcrVar.c(new defpackage.abqu(ajcrVar, ajdkVar2, 12), ajbmVar);
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (defpackage.ahmh ahmhVar : hashSet) {
            defpackage.ajcq ajcqVarP = new defpackage.ahda(new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ahmhVar.b, ajcrVar, ajdkVar2})), (byte[]) null).p(new defpackage.vuw(ahmhVar, ajcrVar, ajdkVar2, 8), r3);
            defpackage.agsm.i(1405, ajcqVarP, "Future Monitor failed", new java.lang.Object[0]);
            hashSet2.add(ajcqVarP);
        }
        return new defpackage.ahda(new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ajdkVar2, defpackage.aiql.G(defpackage.aiql.A(new defpackage.anpu(false, defpackage.aify.j(hashSet2)).b(new defpackage.ajav(defpackage.ahns.c(false), new defpackage.kve(11), 1), ajbmVar)), 10L, java.util.concurrent.TimeUnit.SECONDS, r3)})), (byte[]) null).p(new defpackage.ahqt(defpackage.ahns.c(false), new defpackage.ahmg(ajdkVar2, i), 0), ajbmVar);
    }

    public final defpackage.ahrv e(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return defpackage.ahrv.g(((defpackage.ahda) this.a).o(callable, executor));
    }

    public final defpackage.ahrv f(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        return defpackage.ahrv.g(((defpackage.ahda) this.a).p(ajasVar, executor));
    }

    public final defpackage.ajcq g(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        return ((defpackage.ajwr) this.a).d(new defpackage.ajav(defpackage.ahns.c(false), callable, 1), executor);
    }

    public final defpackage.ajcq h(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        return ((defpackage.ajwr) this.a).e(defpackage.ahqx.b(ajasVar), executor);
    }

    public final /* synthetic */ defpackage.aivp i() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.aivp) aladVarR;
    }

    public final ahtm j(defpackage.ahth ahthVar) {
        defpackage.aec aecVar = (defpackage.aec) this.a;
        if (!aecVar.isEmpty()) {
            java.lang.Class<?> cls = ahthVar.getClass();
            for (int i = 0; i < aecVar.d; i++) {
                java.lang.Class cls2 = (java.lang.Class) aecVar.d(i);
                defpackage.ahtl ahtlVar = (defpackage.ahtl) aecVar.g(i);
                if (cls2.isAssignableFrom(cls)) {
                    return ahtlVar.a(ahthVar);
                }
            }
        }
        return ahtm.b;
    }

    public final void k(java.lang.Class cls, defpackage.ahtl ahtlVar) {
        int i = 0;
        while (true) {
            defpackage.aec aecVar = (defpackage.aec) this.a;
            if (i >= aecVar.d) {
                aecVar.put(cls, ahtlVar);
                return;
            }
            java.lang.Class<?> cls2 = (java.lang.Class) aecVar.d(i);
            defpackage.ahvr.bR(!cls.equals(cls2), "Class %s is already registered as a listener. Are you adding the same listener twice?", cls.getSimpleName());
            defpackage.ahvr.bW(!cls.isAssignableFrom(cls2), "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName());
            defpackage.ahvr.bW(!cls2.isAssignableFrom(cls), "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName());
            i++;
        }
    }

    public final void l() {
        ((defpackage.aec) this.a).clear();
    }

    public final defpackage.aomy m(java.lang.String str, defpackage.ahth ahthVar, defpackage.cav cavVar) {
        android.view.View view = (android.view.View) cavVar.e(defpackage.dep.f);
        boolean zB = cavVar.B(this.a) | cavVar.B(view) | cavVar.B(ahthVar);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == defpackage.cau.a) {
            java.lang.Object ahtpVar = new defpackage.ahtp(this, str, ahthVar, view, 0);
            cavVar.w(ahtpVar);
            objG = ahtpVar;
        }
        return (defpackage.aomy) objG;
    }

    public final void n(java.lang.String str, defpackage.aomy aomyVar) throws java.io.IOException {
        if (!defpackage.agab.aw()) {
            aomyVar.a();
            return;
        }
        defpackage.ahok ahokVarF = ((defpackage.ahpz) this.a).f(1470, str);
        try {
            aomyVar.a();
            defpackage.ajsz.ak(ahokVarF, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    public final defpackage.ajcq o(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        return ((defpackage.anpu) this.a).b(new defpackage.ajav(defpackage.ahns.c(false), callable, 1), executor);
    }

    public final defpackage.ajcq p(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        return ((defpackage.anpu) this.a).c(new defpackage.ahqt(defpackage.ahns.c(false), ajasVar, 0), executor);
    }

    public final defpackage.ajcq q(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        return ((defpackage.anpu) this.a).b(java.util.concurrent.Executors.callable(defpackage.ahqx.h(runnable)), executor);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean r() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "G__show_legal_text_for_att").e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean s() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "G__show_legal_text_for_tmo").e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean t() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "G__enable_caller_id_and_spam_confirmation_dialogs").e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final long u() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "G__smart_dial_default_last_update_millis").b();
    }

    public ahda(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ahda(defpackage.ahpz ahpzVar) {
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        this.a = ahpzVar;
    }

    public ahda(defpackage.ahpz ahpzVar, char[] cArr, byte[] bArr) {
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        this.a = ahpzVar;
    }

    public ahda(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (aoinVar == null) {
            defpackage.aooh.i("processReaperConfig");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("subpackager");
        }
        this.a = aoinVar;
        new java.util.LinkedHashMap();
    }

    public ahda() {
        this.a = new defpackage.ajwr();
    }

    public ahda(defpackage.ahpz ahpzVar, char[] cArr) {
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        this.a = ahpzVar;
    }

    public ahda(java.lang.Object obj) {
        this.a = obj;
    }

    public ahda(byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.aec(0);
    }

    public ahda(byte[] bArr) {
        this.a = new defpackage.apdp();
    }
}
