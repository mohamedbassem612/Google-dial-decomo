package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahqm implements defpackage.ahqj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final defpackage.aoin b;
    public final java.util.concurrent.ConcurrentMap c = new j$.util.concurrent.ConcurrentHashMap(2, 0.75f, 1);
    public final java.util.concurrent.atomic.AtomicLong d;
    public final int e;
    public final int f;
    private final defpackage.ahoh g;
    private final defpackage.aoin h;
    private final defpackage.ahnt i;

    public ahqm(defpackage.ahoh ahohVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.ahnt ahntVar, java.util.Map map, java.util.Map map2) {
        int iA;
        this.g = ahohVar;
        this.b = aoinVar;
        this.h = aoinVar2;
        this.i = ahntVar;
        if (map.isEmpty()) {
            this.e = 500;
        } else {
            defpackage.aikj aikjVar = (defpackage.aikj) map;
            if (aikjVar.d != 1) {
                throw new java.lang.IllegalArgumentException("Please only specify the max number of spans once.");
            }
            this.e = ((ahoa) defpackage.ahvr.aZ(((defpackage.aikh) aikjVar.keySet()).iterator())).a();
        }
        if (map2.isEmpty()) {
            iA = 900000;
            this.f = 900000;
        } else {
            defpackage.aikj aikjVar2 = (defpackage.aikj) map2;
            if (aikjVar2.d != 1) {
                throw new java.lang.IllegalArgumentException("Please only specify the trace deadline limit once.");
            }
            iA = ((ahqa) defpackage.ahvr.aZ(((defpackage.aikh) aikjVar2.keySet()).iterator())).a();
            this.f = iA;
        }
        this.d = new java.util.concurrent.atomic.AtomicLong(iA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahng */
    private static final void f(defpackage.ahpj ahpjVar, java.lang.String str) throws ahng {
        ahng ahngVar;
        if (ahpjVar == null || ahpjVar == defpackage.ahoo.a || (ahpjVar instanceof defpackage.ahoi)) {
            return;
        }
        if (str == null) {
            defpackage.aooh.i("newTraceName");
        }
        if (defpackage.ahnf.a != 1) {
            if (str == null) {
                defpackage.aooh.i("newTraceName");
            }
            if (ahpjVar instanceof defpackage.ahnj) {
                java.lang.String strJ = defpackage.ahns.j(ahpjVar);
                defpackage.aooh.e(strJ, "traceName(...)");
                if (!defpackage.aooh.n("", strJ)) {
                    strJ = ": ".concat(java.lang.String.valueOf(strJ));
                }
                ahngVar = new ahng(strJ, str, ((defpackage.ahnj) ahpjVar).h());
            } else {
                ahngVar = new ahng(str);
            }
            aoil.b(ahngVar, defpackage.ahrc.c());
            if (defpackage.ahnf.a != 3) {
                throw ahngVar;
            }
            ((defpackage.aimw) ((defpackage.aimw) ahqi.a.c().j(defpackage.aiog.a, "TraceManager")).k(ahngVar).l("com/google/apps/tiktok/tracing/TraceManager$Companion", "reportDuplicateTraceException", 144, "TraceManager.kt")).y("Duplicate trace %s", new defpackage.aepg(str));
        }
    }

    private final defpackage.ahpj g(java.lang.String str, defpackage.ahou ahouVar, long j, long j2, int i, int i2, int i3) {
        java.util.UUID uuidB = this.i.b();
        java.lang.String strFo = defpackage.ahms.fo(uuidB);
        boolean zAa = defpackage.ahvr.aa(uuidB.getLeastSignificantBits(), 0.0f);
        defpackage.akzx akzxVarM = defpackage.ahqy.a.m();
        long leastSignificantBits = uuidB.getLeastSignificantBits();
        akzxVarM.u();
        defpackage.ahqy ahqyVar = (defpackage.ahqy) akzxVarM.b;
        ahqyVar.b |= 2;
        ahqyVar.d = leastSignificantBits;
        long mostSignificantBits = uuidB.getMostSignificantBits();
        akzxVarM.u();
        defpackage.ahqy ahqyVar2 = (defpackage.ahqy) akzxVarM.b;
        ahqyVar2.b |= 1;
        ahqyVar2.c = mostSignificantBits;
        akzxVarM.u();
        defpackage.ahqy ahqyVar3 = (defpackage.ahqy) akzxVarM.b;
        ahqyVar3.b |= 4;
        ahqyVar3.f = j;
        akzxVarM.u();
        defpackage.ahqy ahqyVar4 = (defpackage.ahqy) akzxVarM.b;
        ahqyVar4.b |= 8;
        ahqyVar4.g = j2 / 1000000;
        akzxVarM.u();
        defpackage.ahqy ahqyVar5 = (defpackage.ahqy) akzxVarM.b;
        ahqyVar5.j = 1;
        ahqyVar5.b |= 64;
        defpackage.ahqy ahqyVar6 = (defpackage.ahqy) akzxVarM.r();
        defpackage.ahrn ahrnVar = new defpackage.ahrn(str, i3, ahouVar, i);
        defpackage.ahro ahroVar = new defpackage.ahro(this, uuidB, strFo, ahqyVar6, ahrnVar, j2, zAa, false);
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahoj ahojVar = new defpackage.ahoj(ahrnVar, ahroVar, ahpeVar);
        defpackage.ahoh ahohVar = this.g;
        if (ahohVar.d.compareAndSet(false, true)) {
            ahohVar.c.execute(new defpackage.ahjn(ahohVar, 6));
        }
        defpackage.ahog ahogVar = new defpackage.ahog(ahojVar, ahohVar.b);
        defpackage.ahoh.a.put(ahogVar, java.lang.Boolean.TRUE);
        defpackage.ahof ahofVar = ahogVar.a;
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.b.a();
        ahroVar.g = ahofVar;
        ahofVar.c(ahroVar, executor);
        this.c.put(uuidB, ahroVar);
        defpackage.ahns.d(ahpeVar, ahojVar);
        return ahojVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahng */
    @Override // defpackage.ahqj
    public final defpackage.ahok a(java.lang.String str, defpackage.ahou ahouVar, int i, int i2) throws ahng {
        defpackage.ahpj ahpjVar = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
        f(ahpjVar, str);
        defpackage.ahpj ahpjVarG = g(str, ahouVar, j$.time.Instant.now().toEpochMilli(), defpackage.aazc.b(), 1, 2, i2);
        return ahpjVar != ((defpackage.ahoj) ahpjVarG).b ? new ahqk(ahpjVarG, ahpjVar, 0) : ahpjVarG;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahng */
    @Override // defpackage.ahqj
    public final defpackage.ahok b(defpackage.ahou ahouVar, long j, long j2, int i, int i2) throws ahng {
        defpackage.ahpj ahpjVar = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
        f(ahpjVar, "Application creation");
        defpackage.ahpj ahpjVarG = g("Application creation", ahouVar, j, j2, 1, 2, i2);
        return ahpjVar != ((defpackage.ahoj) ahpjVarG).b ? new ahqk(ahpjVarG, ahpjVar, 2) : ahpjVarG;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahng */
    @Override // defpackage.ahqj
    public final defpackage.ahpi c(java.lang.String str, defpackage.ahou ahouVar, int i, int i2) throws ahng {
        defpackage.ahpj ahpjVar = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
        f(ahpjVar, str);
        return new defpackage.ahql(this, new defpackage.ahoq(g(str, ahouVar, j$.time.Instant.now().toEpochMilli(), defpackage.aazc.b(), 2, 2, i2), false), ahpjVar);
    }

    public final /* bridge */ /* synthetic */ java.util.List d() {
        defpackage.aift aiftVar = new defpackage.aift(4);
        java.util.Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            aiftVar.i(((defpackage.ahro) ((java.util.Map.Entry) it.next()).getValue()).b());
        }
        return aiftVar.g();
    }

    public final void e(defpackage.ahqy ahqyVar, android.util.SparseArray sparseArray, java.lang.String str) {
        defpackage.ahnr ahnrVar = defpackage.ahns.d;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) ahnrVar.get();
        defpackage.ahpj ahpjVar = ahpeVar.c;
        defpackage.ahns.d((defpackage.ahpe) ahnrVar.get(), new defpackage.ahod(str, defpackage.ahod.a, defpackage.ahod.b, defpackage.ahot.a, ahpeVar));
        try {
            java.util.Iterator it = ((java.util.Set) this.h.a()).iterator();
            java.lang.RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    ((defpackage.ahqh) it.next()).a(ahqyVar, sparseArray);
                } catch (java.lang.RuntimeException e) {
                    if (runtimeException != null) {
                        runtimeException.addSuppressed(e);
                    } else {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException != null) {
                throw runtimeException;
            }
            defpackage.ahns.d(ahpeVar, ahpjVar);
        } catch (java.lang.Throwable th) {
            defpackage.ahns.d(ahpeVar, ahpjVar);
            throw th;
        }
    }
}
