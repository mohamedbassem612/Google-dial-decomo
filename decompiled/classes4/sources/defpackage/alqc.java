package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqc implements defpackage.alpi {
    public static final defpackage.alpv a = new defpackage.alpv();
    public static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidDuplexAiCoreClient");
    public static final java.util.Set c = ajsz.cW(new java.lang.Integer[]{3, 1});
    public static final java.util.Map d = ajsz.aO(new aoiu[]{new aoiu(101, defpackage.alnq.AICORE_LLM_PER_LAYER_GEM_FEATURE), new aoiu(208, defpackage.alnq.AICORE_DIALER_SN_FEATURE), new aoiu(217, defpackage.alnq.AICORE_DIALER_SN_ACTIONS_FEATURE), new aoiu(218, defpackage.alnq.AICORE_DIALER_SN_SAFETY_FEATURE), new aoiu(219, defpackage.alnq.AICORE_DIALER_SN_TITLES_FEATURE), new aoiu(209, defpackage.alnq.AICORE_DIALER_SR_FEATURE), new aoiu(305, defpackage.alnq.AICORE_DIALER_AGENTIC_CALL_SCREEN_FEATURE), new aoiu(307, defpackage.alnq.AICORE_DIALER_CALL_SCREEN_LITE_FEATURE)});
    public final j$.util.concurrent.ConcurrentHashMap e;
    private final android.content.Context f;
    private final java.util.function.BiFunction g;
    private ymd h;
    private java.util.concurrent.ExecutorService i;
    private aosp j;
    private final j$.util.concurrent.ConcurrentHashMap k;
    private final j$.util.concurrent.ConcurrentHashMap l;
    private final j$.util.concurrent.ConcurrentHashMap m;

    public alqc(android.content.Context context, java.util.function.BiFunction biFunction) {
        aooh.f(context, "context");
        this.f = context;
        this.g = biFunction;
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.k = new j$.util.concurrent.ConcurrentHashMap();
        this.l = new j$.util.concurrent.ConcurrentHashMap();
        this.m = new j$.util.concurrent.ConcurrentHashMap();
    }

    private final ajcq k(ymj ymjVar, java.lang.Object obj, aonj aonjVar, java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        ajcq ajcqVarF = aosv.F(aosv.n(l()), 0, new defpackage.alqb(ymjVar, obj, consumer, aonjVar, consumer2, null), 3);
        aooh.d(ajcqVarF, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
        return ajcqVarF;
    }

    private final aosp l() {
        aosp aospVar = this.j;
        if (aospVar != null) {
            return aospVar;
        }
        throw new java.lang.NullPointerException("MonitoredExecutor not initialized.");
    }

    private final void m() {
        if (this.i == null) {
            throw new java.lang.NullPointerException("MonitoredExecutor not initialized.");
        }
        if (this.h == null) {
            throw new java.lang.NullPointerException("AiCoreClient not initialized.");
        }
    }

    @Override // defpackage.alpi
    public final defpackage.alpk a(defpackage.alnr alnrVar, aify aifyVar, java.lang.Float f, java.util.function.Consumer consumer, java.util.function.Consumer consumer2) throws defpackage.aljs {
        aooh.f(alnrVar, "featureInfo");
        aooh.f(aifyVar, "inputs");
        m();
        defpackage.alpu alpuVar = (defpackage.alpu) this.e.get(alnrVar);
        if (alpuVar == null) {
            defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
            if (alnqVarB == null) {
                alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
            }
            throw new defpackage.aljs("No available feature with ID " + alnqVarB.name() + " (version: " + alnrVar.d + ')', defpackage.aljr.g);
        }
        if (alpuVar.b != 3) {
            defpackage.alnq alnqVarB2 = defpackage.alnq.b(alnrVar.c);
            if (alnqVarB2 == null) {
                alnqVarB2 = defpackage.alnq.UNKNOWN_LLM_FEATURE;
            }
            throw new defpackage.aljs("No available feature with ID " + alnqVarB2.name() + " (version: " + alnrVar.d + ").", defpackage.aljr.g);
        }
        ymk ymkVar = alpuVar.a;
        int i = ymkVar.c;
        if (i != 1) {
            throw new defpackage.aljs(a.bj(i, "Unsupported AiCore feature type for multi-message inference: "), defpackage.aljr.l);
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.k;
        defpackage.alpv alpvVar = a;
        ymj ymjVarA = defpackage.alpv.a(concurrentHashMap, alnrVar);
        ynm ynmVarA = ynn.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
        ailk ailkVarY = aifyVar.y(0);
        while (ailkVarY.hasNext()) {
            arrayList.add(new ynk((java.lang.String) ailkVarY.next()));
        }
        ynmVarA.b(arrayList);
        ynmVarA.f(f != null ? f.floatValue() : 0.4f);
        ynmVarA.g(1);
        ynmVarA.c(aokc.a);
        ynmVarA.e(0);
        ynmVarA.d(500);
        ajcq ajcqVarK = k(ymjVarA, ynmVarA.a(), new ahdu(alpvVar, 5, (char[]) null), consumer, consumer2);
        defpackage.alpj alpjVar = new defpackage.alpj();
        alpjVar.c(ajcqVarK);
        alpjVar.b(ymkVar.e);
        alpjVar.a = ymkVar.a;
        alpjVar.d(ymkVar.f);
        return alpjVar.a();
    }

    @Override // defpackage.alpi
    public final defpackage.alpk b(defpackage.alnr alnrVar, java.lang.String str, java.lang.Float f, java.util.function.Consumer consumer, java.util.function.Consumer consumer2) throws defpackage.aljs {
        ajcq ajcqVarK;
        aooh.f(alnrVar, "featureInfo");
        aooh.f(str, "input");
        m();
        defpackage.alpu alpuVar = (defpackage.alpu) this.e.get(alnrVar);
        if (alpuVar == null) {
            defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
            if (alnqVarB == null) {
                alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
            }
            throw new defpackage.aljs("No available feature with ID " + alnqVarB.name() + " (version: " + alnrVar.d + ')', defpackage.aljr.g);
        }
        if (alpuVar.b != 3) {
            defpackage.alnq alnqVarB2 = defpackage.alnq.b(alnrVar.c);
            if (alnqVarB2 == null) {
                alnqVarB2 = defpackage.alnq.UNKNOWN_LLM_FEATURE;
            }
            throw new defpackage.aljs("No available feature with ID " + alnqVarB2.name() + " (version: " + alnrVar.d + ").", defpackage.aljr.g);
        }
        ymk ymkVar = alpuVar.a;
        int i = ymkVar.c;
        if (i == 1) {
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.k;
            defpackage.alpv alpvVar = a;
            ymj ymjVarA = defpackage.alpv.a(concurrentHashMap, alnrVar);
            ynm ynmVarA = ynn.a();
            ynmVarA.b(ajsz.aY(new ynk(str)));
            ynmVarA.f(f != null ? f.floatValue() : 0.4f);
            ynmVarA.g(1);
            ynmVarA.c(aokc.a);
            ynmVarA.e(0);
            ynmVarA.d(500);
            ajcqVarK = k(ymjVarA, ynmVarA.a(), new ahdu(alpvVar, 2, (char[]) null), consumer, consumer2);
        } else if (i == 3) {
            ajcqVarK = k(defpackage.alpv.a(this.l, alnrVar), yop.a(ajsz.aY(new yon(str))).a(), new ahdu(a, 4, (int[]) null), consumer, consumer2);
        } else {
            if (i != 4) {
                throw new defpackage.aljs(a.bj(i, "Unsupported AiCore feature type for inference: "), defpackage.aljr.l);
            }
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.m;
            defpackage.alpv alpvVar2 = a;
            ymj ymjVarA2 = defpackage.alpv.a(concurrentHashMap2, alnrVar);
            aify aifyVarN = aify.n(ajsz.aY(new yoe(str)));
            ymm ymmVar = ymm.a;
            if (aifyVarN == null) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(" messages"));
            }
            ajcqVarK = k(ymjVarA2, new yof(aifyVarN, ymmVar), new ahdu(alpvVar2, 3, (short[]) null), consumer, consumer2);
        }
        defpackage.alpj alpjVar = new defpackage.alpj();
        alpjVar.c(ajcqVarK);
        alpjVar.b(ymkVar.e);
        alpjVar.a = ymkVar.a;
        alpjVar.d(ymkVar.f);
        return alpjVar.a();
    }

    @Override // defpackage.alpi
    public final void c(java.util.function.Consumer consumer) {
        m();
        aoov.an(aosv.n(l()), (aolr) null, 0, new defpackage.alpw(this, consumer, null), 3);
    }

    @Override // defpackage.alpi
    public final void d() {
        ymd ymdVar = this.h;
        if (ymdVar != null) {
            ymdVar.close();
        }
    }

    @Override // defpackage.alpi
    public final void e(java.util.Collection collection, java.util.function.Consumer consumer) {
        aooh.f(collection, "featureInfos");
        m();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            defpackage.alnr alnrVar = (defpackage.alnr) it.next();
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.e;
            defpackage.alpu alpuVar = (defpackage.alpu) concurrentHashMap.get(alnrVar);
            if (alpuVar != null) {
                ymk ymkVar = alpuVar.a;
                int i = alpuVar.b;
                if (i == 1) {
                    concurrentHashMap.remove(alnrVar);
                    g().f(ymkVar, new defpackage.alpy(this, alnrVar, consumer));
                } else if (i == 3) {
                    j(alnrVar, ymkVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ajcu, java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // defpackage.alpi
    public final void f(defpackage.amac amacVar) throws defpackage.aljs {
        aooh.f(amacVar, "monitoredExecutor");
        amacVar.e();
        ?? r3 = ((j$.util.Optional) amacVar.b).get();
        this.i = r3;
        this.h = (ymd) this.g.apply(this.f, r3);
        this.j = new defpackage.alqa(r3);
    }

    public final ymd g() {
        ymd ymdVar = this.h;
        if (ymdVar != null) {
            return ymdVar;
        }
        throw new java.lang.NullPointerException("AiCoreClient not initialized.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(ymk ymkVar, aoln aolnVar) throws java.lang.Exception {
        defpackage.alpx alpxVar;
        if (aolnVar instanceof defpackage.alpx) {
            alpxVar = (defpackage.alpx) aolnVar;
            int i = alpxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                alpxVar.c = i - Integer.MIN_VALUE;
            } else {
                alpxVar = new defpackage.alpx(this, aolnVar);
            }
        } else {
            alpxVar = new defpackage.alpx(this, aolnVar);
        }
        java.lang.Object objD = alpxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = alpxVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objD);
                ajcq ajcqVarC = g().c(ymkVar);
                alpxVar.d = ymkVar;
                alpxVar.c = 1;
                objD = aosv.D(ajcqVarC, alpxVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ymkVar = alpxVar.d;
                aooc.af(objD);
            }
            java.lang.Integer num = (java.lang.Integer) objD;
            defpackage.alnq alnqVar = (defpackage.alnq) d.get(new java.lang.Integer(ymkVar.e));
            if (alnqVar == null) {
                return aojh.a;
            }
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.e;
            akzx akzxVarM = defpackage.alnr.a.m();
            akzxVarM.u();
            defpackage.alnr alnrVar = (defpackage.alnr) akzxVarM.b;
            alnrVar.c = alnqVar.j;
            alnrVar.b |= 1;
            long j = ymkVar.f;
            akzxVarM.u();
            defpackage.alnr alnrVar2 = (defpackage.alnr) akzxVarM.b;
            alnrVar2.b |= 2;
            alnrVar2.d = j;
            alad aladVarP = akzxVarM.p();
            aooh.c(num);
            concurrentHashMap.put(aladVarP, new defpackage.alpu(ymkVar, num.intValue()));
            return aojh.a;
        } catch (java.lang.Exception e) {
            if (e instanceof java.util.concurrent.CancellationException) {
                throw e;
            }
            b.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidDuplexAiCoreClient", "cacheFeatureIfAvailable", 316, "AndroidDuplexAiCoreClient.kt").w("Could not get feature status for %s", ymkVar.e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.util.List list, aoln aolnVar) {
        defpackage.alpz alpzVar;
        if (aolnVar instanceof defpackage.alpz) {
            alpzVar = (defpackage.alpz) aolnVar;
            int i = alpzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                alpzVar.c = i - Integer.MIN_VALUE;
            } else {
                alpzVar = new defpackage.alpz(this, aolnVar);
            }
        } else {
            alpzVar = new defpackage.alpz(this, aolnVar);
        }
        java.lang.Object obj = alpzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = alpzVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            pzf pzfVar = new pzf(list, this, (aoln) null, 9);
            alpzVar.c = 1;
            if (aosv.m(pzfVar, alpzVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final void j(defpackage.alnr alnrVar, ymk ymkVar) {
        int i = ymkVar.c;
        if (i == 1) {
            j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.k, alnrVar, new defpackage.aite(new agvo(this, ymkVar, 5, (byte[]) null), 13));
            return;
        }
        if (i == 3) {
            j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.l, alnrVar, new defpackage.aite(new agvo(this, ymkVar, 6, (byte[]) null), 14));
        } else if (i != 4) {
            b.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidDuplexAiCoreClient", "initServiceForFeature", 281, "AndroidDuplexAiCoreClient.kt").w("Request to initialize unsupported AiCore feature type: %s", i);
        } else {
            j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.m, alnrVar, new defpackage.aite(new agvo(this, ymkVar, 7, (byte[]) null), 15));
        }
    }
}
