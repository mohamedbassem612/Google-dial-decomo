package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class goy implements defpackage.gom {
    public static volatile defpackage.goy a;
    public static final java.util.concurrent.locks.ReentrantLock b = new java.util.concurrent.locks.ReentrantLock();
    public final android.content.Context c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    public final defpackage.gou e;
    private final defpackage.gox f;
    private final defpackage.aoir g;
    private final defpackage.rsr h;

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.window.extensions.embedding.ActivityEmbeddingComponent, java.lang.Object] */
    public goy(android.content.Context context, defpackage.gou gouVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (context == null) {
            defpackage.aooh.i("applicationContext");
        }
        this.c = context;
        this.e = gouVar;
        defpackage.gox goxVar = new defpackage.gox(this);
        this.f = goxVar;
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        if (gouVar != null) {
            int i = ((defpackage.gms) gouVar.e).a;
            if (i == 1) {
                java.lang.Object obj = gouVar.c;
                java.lang.Object obj2 = gouVar.a;
                defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                defpackage.aopu aooaVar = new defpackage.aooa(java.util.List.class);
                defpackage.aonj dpzVar = new defpackage.dpz(goxVar, gouVar, 18);
                if (obj2 == null) {
                    defpackage.aooh.i("obj");
                }
                defpackage.gne gneVar = (defpackage.gne) obj;
                obj2.getClass().getMethod("setSplitInfoCallback", gneVar.e()).invoke(obj2, gneVar.f(aooaVar, dpzVar));
            } else if (i >= 2 && i < 5) {
                gouVar.a(goxVar);
            } else if (i >= 5) {
                gouVar.a(goxVar);
                ddz$.ExternalSyntheticApiModelOutline0.m((androidx.window.extensions.embedding.ActivityEmbeddingComponent) gouVar.a, new defpackage.so(2), new defpackage.gno(goxVar, (defpackage.goe) gouVar.b));
            }
        }
        this.h = new defpackage.rsr((byte[]) null);
        this.g = new defpackage.aoiy(new defpackage.ghb(this, 6));
    }

    @Override // defpackage.gom
    public final defpackage.gpn a() {
        return (defpackage.gpn) this.g.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.gom
    public final java.util.Set b() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            return defpackage.ajsz.cf(this.h.b);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0327 A[Catch: all -> 0x0389, TryCatch #2 {all -> 0x0389, blocks: (B:112:0x0383, B:110:0x0370, B:88:0x026e, B:94:0x02de, B:96:0x02f9, B:105:0x0317, B:109:0x0336, B:99:0x0307, B:102:0x0310, B:106:0x031f, B:107:0x0326, B:108:0x0327, B:111:0x037d), top: B:126:0x0370 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x038b  */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.window.extensions.embedding.ActivityEmbeddingComponent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.gom
    public final void c(defpackage.gow gowVar) throws java.lang.Throwable {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        java.lang.Class<?> clsA;
        java.util.Set setCf;
        java.util.Iterator it;
        defpackage.aoiu aoiuVar;
        androidx.window.extensions.embedding.ActivityRule activityRuleM;
        int i;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = b;
        reentrantLock2.lock();
        try {
            defpackage.rsr rsrVar = this.h;
            ?? r4 = rsrVar.b;
            if (((defpackage.acc) r4).contains(gowVar)) {
                reentrantLock = reentrantLock2;
            } else {
                if (!((defpackage.acc) r4).contains(gowVar)) {
                    java.lang.String strA = gowVar.a();
                    if (strA == null) {
                        ((defpackage.acc) r4).add(gowVar);
                    } else {
                        ?? r3 = rsrVar.a;
                        if (((java.util.HashMap) r3).containsKey(strA)) {
                            r4.remove((defpackage.gow) ((java.util.HashMap) r3).get(strA));
                            r3.put(strA, gowVar);
                            ((defpackage.acc) r4).add(gowVar);
                        } else {
                            r3.put(strA, gowVar);
                            ((defpackage.acc) r4).add(gowVar);
                        }
                    }
                }
                defpackage.gou gouVar = this.e;
                if (gouVar != null) {
                    java.util.Set setB = b();
                    if (setB == null) {
                        defpackage.aooh.i("rules");
                    }
                    java.util.Iterator it2 = setB.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((defpackage.gow) it2.next()) instanceof defpackage.gpt) {
                                if (!defpackage.aooh.n(defpackage.gus.T((android.content.Context) gouVar.d).y(), defpackage.gpn.a)) {
                                    if (gmw.a == defpackage.gnh.b) {
                                        android.util.Log.w("EmbeddingCompat", "Cannot set SplitRule because ActivityEmbedding Split is not supported or PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED is not set.");
                                    }
                                    reentrantLock = reentrantLock2;
                                }
                            }
                        }
                        java.lang.Object obj = gouVar.b;
                        java.lang.Object obj2 = gouVar.d;
                        if (obj2 == null) {
                            defpackage.aooh.i("context");
                        }
                        if (setB == null) {
                            defpackage.aooh.i("rules");
                        }
                        try {
                            clsA = ((defpackage.goe) obj).b.a();
                        } catch (java.lang.ClassNotFoundException unused) {
                            clsA = null;
                        }
                        if (clsA == null) {
                            setCf = defpackage.aoke.a;
                            reentrantLock = reentrantLock2;
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(setB, 10));
                            java.util.Iterator it3 = setB.iterator();
                            while (it3.hasNext()) {
                                defpackage.gow gowVar2 = (defpackage.gow) it3.next();
                                try {
                                    if (gowVar2 instanceof defpackage.gpq) {
                                        it = it3;
                                        final defpackage.gpq gpqVar = (defpackage.gpq) gowVar2;
                                        if (new defpackage.gms().a >= 2) {
                                            androidx.window.reflection.Predicate2 predicate2 = new androidx.window.reflection.Predicate2() { // from class: gny
                                                @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
                                                public final boolean test(java.lang.Object obj3) {
                                                    android.util.Pair pair = (android.util.Pair) obj3;
                                                    java.lang.String str = defpackage.goe.a;
                                                    defpackage.aooh.f(pair, "activitiesPair");
                                                    java.util.Set<defpackage.gpp> set = gpqVar.a;
                                                    if ((set instanceof java.util.Collection) && set.isEmpty()) {
                                                        return false;
                                                    }
                                                    for (defpackage.gpp gppVar : set) {
                                                        java.lang.Object obj4 = pair.first;
                                                        defpackage.aooh.e(obj4, "first");
                                                        java.lang.Object obj5 = pair.second;
                                                        defpackage.aooh.e(obj5, "second");
                                                        if (gppVar.b((android.app.Activity) obj4, (android.app.Activity) obj5)) {
                                                            return true;
                                                        }
                                                    }
                                                    return false;
                                                }
                                            };
                                            androidx.window.reflection.Predicate2 predicate3 = new androidx.window.reflection.Predicate2() { // from class: gnz
                                                @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
                                                public final boolean test(java.lang.Object obj3) {
                                                    android.util.Pair pair = (android.util.Pair) obj3;
                                                    java.lang.String str = defpackage.goe.a;
                                                    defpackage.aooh.f(pair, "activityIntentPair");
                                                    java.util.Set<defpackage.gpp> set = gpqVar.a;
                                                    if ((set instanceof java.util.Collection) && set.isEmpty()) {
                                                        return false;
                                                    }
                                                    for (defpackage.gpp gppVar : set) {
                                                        java.lang.Object obj4 = pair.first;
                                                        defpackage.aooh.e(obj4, "first");
                                                        java.lang.Object obj5 = pair.second;
                                                        defpackage.aooh.e(obj5, "second");
                                                        if (gppVar.a((android.app.Activity) obj4, (android.content.Intent) obj5)) {
                                                            return true;
                                                        }
                                                    }
                                                    return false;
                                                }
                                            };
                                            final android.content.Context context = (android.content.Context) obj2;
                                            androidx.window.reflection.Predicate2 predicate4 = new androidx.window.reflection.Predicate2() { // from class: goa
                                                @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
                                                public final boolean test(java.lang.Object obj3) {
                                                    android.view.WindowMetrics windowMetricsM = baa$.ExternalSyntheticApiModelOutline1.m(obj3);
                                                    java.lang.String str = defpackage.goe.a;
                                                    defpackage.aooh.f(windowMetricsM, "windowMetrics");
                                                    return gpqVar.b(context, windowMetricsM);
                                                }
                                            };
                                            java.lang.String strA2 = gpqVar.a();
                                            androidx.window.extensions.embedding.SplitPairRule.Builder builderM = ddz$.ExternalSyntheticApiModelOutline0.m(goy$.ExternalSyntheticApiModelOutline3.m$1(ddz$.ExternalSyntheticApiModelOutline0.m(new androidx.window.extensions.embedding.SplitPairRule.Builder(predicate2, predicate3, predicate4), ((defpackage.goe) obj).c(gpqVar.l)), defpackage.goe.f(gpqVar.b)), defpackage.goe.f(gpqVar.c));
                                            boolean z = gpqVar.d;
                                            androidx.window.extensions.embedding.SplitPairRule.Builder builderM2 = ddz$.ExternalSyntheticApiModelOutline0.m(builderM, true);
                                            defpackage.aooh.e(builderM2, "setShouldClearTop(...)");
                                            if (strA2 == null) {
                                                strA2 = defpackage.gus.O(gpqVar);
                                            }
                                            ddz$.ExternalSyntheticApiModelOutline0.m(builderM2, strA2);
                                            activityRuleM = ddz$.ExternalSyntheticApiModelOutline0.m(builderM2);
                                            defpackage.aooh.e(activityRuleM, "build(...)");
                                        } else {
                                            defpackage.god godVar = ((defpackage.goe) obj).c;
                                            if (obj2 == null) {
                                                defpackage.aooh.i("context");
                                            }
                                            if (gpqVar == null) {
                                                defpackage.aooh.i("rule");
                                            }
                                            java.lang.reflect.Constructor constructor = ddz$.ExternalSyntheticApiModelOutline0.m$22().getConstructor(clsA, clsA, clsA);
                                            java.util.Set set = gpqVar.a;
                                            defpackage.gne gneVar = godVar.a;
                                            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                                            java.lang.Object objNewInstance = constructor.newInstance(gneVar.b(new defpackage.aooa(android.app.Activity.class), new defpackage.aooa(android.app.Activity.class), new defpackage.brg(set, 15)), gneVar.b(new defpackage.aooa(android.app.Activity.class), new defpackage.aooa(android.content.Intent.class), new defpackage.brg(set, 14)), gneVar.c(new defpackage.aooa(baa$.ExternalSyntheticApiModelOutline1.m()), new defpackage.dpz(gpqVar, obj2, 17)));
                                            defpackage.aooh.e(objNewInstance, "newInstance(...)");
                                            androidx.window.extensions.embedding.SplitPairRule.Builder builderM3 = ddz$.ExternalSyntheticApiModelOutline0.m(objNewInstance);
                                            defpackage.gpl gplVar = gpqVar.l;
                                            float f = gplVar.b.d;
                                            double d = f;
                                            if (d < 0.0d || d > 1.0d || f == 1.0f) {
                                                aoiuVar = new defpackage.aoiu(java.lang.Float.valueOf(0.0f), 3);
                                            } else {
                                                defpackage.gpi gpiVar = defpackage.gpi.b;
                                                defpackage.gpi gpiVar2 = defpackage.gpi.c;
                                                defpackage.gpi gpiVar3 = defpackage.gpi.a;
                                                defpackage.gpi[] gpiVarArr = {gpiVar, gpiVar2, gpiVar3};
                                                defpackage.gpi gpiVar4 = gplVar.c;
                                                if (defpackage.ajsz.cJ(gpiVarArr, gpiVar4) >= 0) {
                                                    java.lang.Float fValueOf = java.lang.Float.valueOf(f);
                                                    if (defpackage.aooh.n(gpiVar4, gpiVar3)) {
                                                        i = 3;
                                                    } else if (defpackage.aooh.n(gpiVar4, gpiVar)) {
                                                        i = 0;
                                                    } else {
                                                        if (!defpackage.aooh.n(gpiVar4, gpiVar2)) {
                                                            throw new java.lang.IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                                                        }
                                                        i = 1;
                                                    }
                                                    aoiuVar = new defpackage.aoiu(fValueOf, java.lang.Integer.valueOf(i));
                                                } else {
                                                    aoiuVar = new defpackage.aoiu(java.lang.Float.valueOf(0.0f), 3);
                                                }
                                            }
                                            float fFloatValue = ((java.lang.Number) aoiuVar.a).floatValue();
                                            int iIntValue = ((java.lang.Number) aoiuVar.b).intValue();
                                            ddz$.ExternalSyntheticApiModelOutline0.m(builderM3, fFloatValue);
                                            goy$.ExternalSyntheticApiModelOutline3.m(builderM3, iIntValue);
                                            boolean z2 = gpqVar.d;
                                            androidx.window.extensions.embedding.SplitPairRule.Builder builderM4 = ddz$.ExternalSyntheticApiModelOutline0.m(builderM3, true);
                                            defpackage.goe goeVar = godVar.b;
                                            activityRuleM = ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(goy$.ExternalSyntheticApiModelOutline3.m$1(builderM4, defpackage.goe.f(gpqVar.b)), defpackage.goe.f(gpqVar.c)));
                                            defpackage.aooh.e(activityRuleM, "build(...)");
                                        }
                                        arrayList.add(activityRuleM);
                                        it3 = it;
                                        reentrantLock2 = reentrantLock2;
                                        clsA = clsA;
                                        obj = obj;
                                    } else {
                                        if (gowVar2 instanceof defpackage.gpr) {
                                            defpackage.gpr gprVar = (defpackage.gpr) gowVar2;
                                            if (new defpackage.gms().a >= 2) {
                                                gprVar.a();
                                                throw null;
                                            }
                                            if (obj2 == null) {
                                                defpackage.aooh.i("context");
                                            }
                                            if (gprVar == null) {
                                                defpackage.aooh.i("rule");
                                            }
                                            ddz$.ExternalSyntheticApiModelOutline0.m$19().getConstructor(android.content.Intent.class, clsA, clsA, clsA);
                                            throw null;
                                        }
                                        if (!(gowVar2 instanceof defpackage.gnm)) {
                                            throw new java.lang.IllegalArgumentException("Unsupported rule type");
                                        }
                                        final defpackage.gnm gnmVar = (defpackage.gnm) gowVar2;
                                        if (new defpackage.gms().a < 2) {
                                            defpackage.god godVar2 = ((defpackage.goe) obj).c;
                                            if (gnmVar == null) {
                                                defpackage.aooh.i("rule");
                                            }
                                            java.lang.reflect.Constructor constructor2 = ddz$.ExternalSyntheticApiModelOutline0.m$13().getConstructor(clsA, clsA);
                                            java.util.Set set2 = gnmVar.a;
                                            defpackage.aopu[] aopuVarArr2 = defpackage.aoou.a;
                                            defpackage.aooa aooaVar = new defpackage.aooa(android.app.Activity.class);
                                            it = it3;
                                            defpackage.aonj fxsVar = new fxs(set2, 11);
                                            defpackage.gne gneVar2 = godVar2.a;
                                            androidx.window.extensions.embedding.ActivityRule.Builder builderM5 = goy$.ExternalSyntheticApiModelOutline3.m(constructor2.newInstance(gneVar2.c(aooaVar, fxsVar), gneVar2.c(new defpackage.aooa(android.content.Intent.class), new fxs(set2, 10))));
                                            boolean z3 = gnmVar.b;
                                            activityRuleM = goy$.ExternalSyntheticApiModelOutline3.m(goy$.ExternalSyntheticApiModelOutline3.m(builderM5, true));
                                            defpackage.aooh.e(activityRuleM, "build(...)");
                                        } else {
                                            it = it3;
                                            androidx.window.extensions.embedding.ActivityRule.Builder builder = new androidx.window.extensions.embedding.ActivityRule.Builder(new androidx.window.reflection.Predicate2() { // from class: gob
                                                @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
                                                public final boolean test(java.lang.Object obj3) {
                                                    android.app.Activity activity = (android.app.Activity) obj3;
                                                    java.lang.String str = defpackage.goe.a;
                                                    if (activity == null) {
                                                        defpackage.aooh.i("activity");
                                                    }
                                                    java.util.Set set3 = gnmVar.a;
                                                    if ((set3 instanceof java.util.Collection) && set3.isEmpty()) {
                                                        return false;
                                                    }
                                                    java.util.Iterator it4 = set3.iterator();
                                                    while (it4.hasNext()) {
                                                        if (((defpackage.gnl) it4.next()).a(activity)) {
                                                            return true;
                                                        }
                                                    }
                                                    return false;
                                                }
                                            }, new androidx.window.reflection.Predicate2() { // from class: goc
                                                @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
                                                public final boolean test(java.lang.Object obj3) {
                                                    android.content.Intent intent = (android.content.Intent) obj3;
                                                    java.lang.String str = defpackage.goe.a;
                                                    defpackage.aooh.f(intent, "intent");
                                                    java.util.Set set3 = gnmVar.a;
                                                    if ((set3 instanceof java.util.Collection) && set3.isEmpty()) {
                                                        return false;
                                                    }
                                                    java.util.Iterator it4 = set3.iterator();
                                                    while (it4.hasNext()) {
                                                        if (((defpackage.gnl) it4.next()).b(intent)) {
                                                            return true;
                                                        }
                                                    }
                                                    return false;
                                                }
                                            });
                                            boolean z4 = gnmVar.b;
                                            androidx.window.extensions.embedding.ActivityRule.Builder builderM6 = goy$.ExternalSyntheticApiModelOutline3.m(builder, true);
                                            defpackage.aooh.e(builderM6, "setShouldAlwaysExpand(...)");
                                            java.lang.String strA3 = gnmVar.a();
                                            if (strA3 == null) {
                                                strA3 = defpackage.gus.O(gnmVar);
                                            }
                                            goy$.ExternalSyntheticApiModelOutline3.m(builderM6, strA3);
                                            activityRuleM = goy$.ExternalSyntheticApiModelOutline3.m(builderM6);
                                            defpackage.aooh.e(activityRuleM, "build(...)");
                                        }
                                    }
                                    arrayList.add(activityRuleM);
                                    it3 = it;
                                    reentrantLock2 = reentrantLock2;
                                    clsA = clsA;
                                    obj = obj;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    reentrantLock2.unlock();
                                    throw th;
                                }
                            }
                            reentrantLock = reentrantLock2;
                            setCf = defpackage.ajsz.cf(arrayList);
                        }
                        ddz$.ExternalSyntheticApiModelOutline0.m((androidx.window.extensions.embedding.ActivityEmbeddingComponent) gouVar.a, setCf);
                    }
                } else {
                    reentrantLock = reentrantLock2;
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th2) {
            th = th2;
            reentrantLock2 = reentrantLock2;
        }
    }

    @Override // defpackage.gom
    public final void d(defpackage.dxw dxwVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.d;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            defpackage.aooh.e(it, "iterator(...)");
            while (it.hasNext()) {
                defpackage.ajxw ajxwVar = (defpackage.ajxw) it.next();
                if (defpackage.aooh.n(ajxwVar.b, dxwVar)) {
                    copyOnWriteArrayList.remove(ajxwVar);
                    break;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.window.extensions.embedding.ActivityEmbeddingComponent, java.lang.Object] */
    @Override // defpackage.gom
    public final void e(final defpackage.aonj aonjVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            defpackage.gou gouVar = this.e;
            if (gouVar != null) {
                ((defpackage.gms) gouVar.e).a(2);
                ?? r1 = gouVar.a;
                final defpackage.goe goeVar = (defpackage.goe) gouVar.b;
                goy$.ExternalSyntheticApiModelOutline3.m((androidx.window.extensions.embedding.ActivityEmbeddingComponent) r1, new androidx.window.reflection.JFunction2() { // from class: gnx
                    @Override // androidx.window.reflection.JFunction2, androidx.window.extensions.core.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        androidx.window.extensions.embedding.SplitAttributesCalculatorParams splitAttributesCalculatorParamsM = ddz$.ExternalSyntheticApiModelOutline0.m(obj);
                        java.lang.String str = defpackage.goe.a;
                        defpackage.aooh.f(splitAttributesCalculatorParamsM, "oemParams");
                        defpackage.aooh.f(splitAttributesCalculatorParamsM, "params");
                        android.view.WindowMetrics windowMetricsM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                        defpackage.aooh.e(windowMetricsM, "getParentWindowMetrics(...)");
                        android.content.res.Configuration configurationM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                        defpackage.aooh.e(configurationM, "getParentConfiguration(...)");
                        androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfoM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                        defpackage.aooh.e(windowLayoutInfoM, "getParentWindowLayoutInfo(...)");
                        androidx.window.extensions.embedding.SplitAttributes splitAttributesM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                        defpackage.aooh.e(splitAttributesM, "getDefaultSplitAttributes(...)");
                        boolean zM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                        java.lang.String strM = null;
                        if (ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM) != null) {
                            java.lang.String strM2 = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                            defpackage.aooh.c(strM2);
                            defpackage.aooh.f(strM2, "tag");
                            java.lang.String strZ = defpackage.aoov.z(strM2, defpackage.goe.a);
                            if (defpackage.aooh.n(strZ, strM2) || defpackage.aoov.p(strZ, 16) == null) {
                                strM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributesCalculatorParamsM);
                            }
                        }
                        java.lang.String str2 = strM;
                        defpackage.aonj aonjVar2 = aonjVar;
                        defpackage.goe goeVar2 = goeVar;
                        defpackage.gqe gqeVarA = defpackage.gqg.a.a(windowMetricsM, defpackage.gus.J().b(configurationM, windowMetricsM));
                        return goeVar2.c((defpackage.gpl) aonjVar2.a(new gpm(gqeVarA, configurationM, fsu.z(gqeVarA, windowLayoutInfoM), goeVar2.b(splitAttributesM), zM, str2)));
                    }
                });
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.window.extensions.embedding.ActivityEmbeddingComponent, java.lang.Object] */
    @Override // defpackage.gom
    public final boolean f(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.gou gouVar = this.e;
        if (gouVar == null) {
            return false;
        }
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        return ddz$.ExternalSyntheticApiModelOutline0.m((androidx.window.extensions.embedding.ActivityEmbeddingComponent) gouVar.a, activity);
    }

    @Override // defpackage.gom
    public final void g(android.app.Activity activity, defpackage.dxw dxwVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.e == null) {
                android.util.Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                dxwVar.accept(defpackage.aokc.a);
            } else {
                defpackage.ajxw ajxwVar = new defpackage.ajxw(activity, dxwVar);
                this.d.add(ajxwVar);
                ajxwVar.f(this.f.a);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
