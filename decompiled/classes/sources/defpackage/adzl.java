package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adzl implements defpackage.adzg {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final android.content.Context b;
    private final java.lang.Class c;
    private final defpackage.aduu d;
    private final defpackage.aeey e;

    public adzl(android.content.Context context, java.lang.Class cls, defpackage.aduu aduuVar, defpackage.aeey aeeyVar, defpackage.aazc aazcVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(cls, "workerClass");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        defpackage.aooh.f(aazcVar, "clock");
        this.b = context;
        this.c = cls;
        this.d = aduuVar;
        this.e = aeeyVar;
    }

    private static final void d(defpackage.gsz gszVar, defpackage.adzf adzfVar, java.lang.Long l) {
        gszVar.b("GNP_SDK_JOB");
        if (l != null) {
            gszVar.e(l.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        adzfVar.i();
        java.lang.Long lC = adzfVar.c();
        if (lC != null) {
            gszVar.c(defpackage.grj.a, lC.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.adzg
    public final java.lang.Object a(java.lang.String str, defpackage.aoln aolnVar) {
        adzi adziVar;
        if (aolnVar instanceof adzi) {
            adziVar = (adzi) aolnVar;
            int i = adziVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adziVar.c = i - Integer.MIN_VALUE;
            } else {
                adziVar = new adzi(this, aolnVar);
            }
        } else {
            adziVar = new adzi(this, aolnVar);
        }
        java.lang.Object obj = adziVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = adziVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            android.content.Context context = this.b;
            defpackage.aduu aduuVar = this.d;
            defpackage.gsy gsyVarW = defpackage.gus.w(context);
            defpackage.agab.bN(str, aduuVar);
            defpackage.ajcq ajcqVar = ((defpackage.gsp) gsyVarW.a(str)).c;
            adziVar.c = 1;
            if (defpackage.aosv.D(ajcqVar, adziVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [adzf] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.adzg
    public final java.lang.Object b(java.lang.String str, defpackage.adzf adzfVar, defpackage.grp grpVar, defpackage.grn grnVar, java.lang.Long l, defpackage.aoln aolnVar) {
        adzj adzjVar;
        defpackage.gso gsoVarD;
        long j;
        ?? r5;
        defpackage.adzf adzfVar2 = adzfVar;
        if (aolnVar instanceof adzj) {
            adzjVar = (adzj) aolnVar;
            int i = adzjVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                adzjVar.e = i - Integer.MIN_VALUE;
            } else {
                adzjVar = new adzj(this, aolnVar);
            }
        } else {
            adzjVar = new adzj(this, aolnVar);
        }
        java.lang.Object obj = adzjVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = adzjVar.e;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.aduu aduuVar = this.d;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.agab.bN(str, aduuVar);
                boolean zF = adzfVar2.f();
                java.lang.Class cls = this.c;
                if (zF) {
                    defpackage.gst gstVar = new defpackage.gst(cls, adzfVar2.b(), java.util.concurrent.TimeUnit.MILLISECONDS);
                    gstVar.f(grpVar);
                    gstVar.d(grnVar);
                    d(gstVar, adzfVar2, l);
                    defpackage.aogc aogcVarG = gstVar.g();
                    defpackage.gsy gsyVarW = defpackage.gus.w(this.b);
                    adzfVar2.j();
                    gsoVarD = gsyVarW.g(str, 3, aogcVarG);
                } else {
                    defpackage.gsk gskVar = new defpackage.gsk(cls);
                    gskVar.f(grpVar);
                    gskVar.d(grnVar);
                    d(gskVar, adzfVar2, l);
                    adzfVar2.a();
                    defpackage.adur adurVar = aduuVar.k;
                    defpackage.aooh.e(adurVar, "getExpeditedJobs(...)");
                    adzfVar2.f();
                    defpackage.aooh.f(adurVar, "expeditedJobs");
                    defpackage.aogc aogcVarG2 = gskVar.g();
                    defpackage.gsy gsyVarW2 = defpackage.gus.w(this.b);
                    defpackage.aooh.f(str, "uniqueWorkName");
                    gsoVarD = gsyVarW2.d(str, 1, defpackage.ajsz.aY(aogcVarG2));
                }
                if (defpackage.anfw.c()) {
                    defpackage.aiql.I(((defpackage.gsp) gsoVarD).c, new adzk(this, jElapsedRealtime, str, adzfVar2), defpackage.ajbm.INSTANCE);
                    return new defpackage.adub(defpackage.aojh.a);
                }
                j = jElapsedRealtime;
                defpackage.ajcq ajcqVar = ((defpackage.gsp) gsoVarD).c;
                adzjVar.a = adzfVar2;
                adzjVar.f = str;
                adzjVar.b = j;
                adzjVar.e = 1;
                if (defpackage.aosv.D(ajcqVar, adzjVar) == aoluVar) {
                    r5 = adzfVar2;
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = adzjVar.b;
                java.lang.String str2 = adzjVar.f;
                java.lang.Object obj2 = adzjVar.a;
                defpackage.aooc.af(obj);
                r5 = obj2;
            }
            r5 = adzfVar2;
            r5.a();
            c(j);
            return new defpackage.adub(defpackage.aojh.a);
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e)).M("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", this.b.getApplicationContext().getPackageName(), str, new java.lang.Integer(adzfVar2.a()));
            return new adtw(e, defpackage.adty.N);
        }
    }

    public final void c(long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        android.content.Context context = this.b;
        this.e.m(jElapsedRealtime, context.getPackageName(), this.d.a, android.os.Build.VERSION.SDK_INT, "ENQUEUE_WORKMANAGER");
        context.getApplicationContext().getPackageName();
    }
}
