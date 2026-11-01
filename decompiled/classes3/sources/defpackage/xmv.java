package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xmv extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.xmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmv(defpackage.xmw xmwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = xmwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objC;
        java.util.Iterator it;
        java.lang.Object xmpVar;
        java.lang.Object next;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.xmw xmwVar = this.b;
            if (xmwVar.a.e(416177493L)) {
                defpackage.xhe xheVar = xmwVar.b;
                defpackage.xpi xpiVar = new defpackage.xpi(defpackage.xjz.e, com.android.onboarding.tasks.ErasedOnboardingTaskState.CREATOR);
                this.a = 1;
                objC = xheVar.c("task_states", xpiVar, this);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        objC = obj;
        java.util.Map map = (java.util.Map) objC;
        if (map != null) {
            defpackage.xmw xmwVar2 = this.b;
            java.util.Objects.toString(map);
            defpackage.xox.b("TaskStateManager", "Restored task states from disk: ".concat(map.toString()));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(map.size()));
            java.util.Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                java.lang.Object key = entry.getKey();
                defpackage.xjx xjxVar = (defpackage.xjx) entry.getKey();
                com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskState = (com.android.onboarding.tasks.ErasedOnboardingTaskState) entry.getValue();
                defpackage.xfe xfeVar = new defpackage.xfe(xjxVar, 2);
                java.lang.String strG = erasedOnboardingTaskState.g();
                int iHashCode = strG.hashCode();
                if (iHashCode == -202516509) {
                    it = it2;
                    if (!strG.equals("Success")) {
                        throw new java.lang.IllegalStateException("Unknown OnboardingTaskState(type=" + erasedOnboardingTaskState.g() + ')');
                    }
                    defpackage.xia xiaVar = new defpackage.xia(erasedOnboardingTaskState);
                    android.os.PersistableBundle persistableBundle = erasedOnboardingTaskState.a;
                    aooh.f(persistableBundle, "bundle");
                    long jD = defpackage.xhp.d(persistableBundle);
                    aooh.f(persistableBundle, "<this>");
                    android.os.PersistableBundle persistableBundle2 = persistableBundle.containsKey("com.android.onboarding.task.RESULT") ? persistableBundle.getPersistableBundle("com.android.onboarding.task.RESULT") : null;
                    if (persistableBundle2 == null) {
                        throw new java.util.NoSuchElementException("Key com.android.onboarding.task.RESULT: " + android.os.PersistableBundle.class.getName() + " is missing in the " + persistableBundle.getClass().getName() + '.');
                    }
                    xmpVar = new defpackage.xmp(xfeVar, xiaVar, jD, persistableBundle2, (defpackage.xhn) defpackage.xfh.g(persistableBundle, "com.android.onboarding.task.LAST_METADATA", defpackage.xhn.a));
                    linkedHashMap.put(key, aozk.a(xmpVar));
                    it2 = it;
                } else if (iHashCode == 646453906) {
                    it = it2;
                    if (!strG.equals("InProgress")) {
                        throw new java.lang.IllegalStateException("Unknown OnboardingTaskState(type=" + erasedOnboardingTaskState.g() + ')');
                    }
                    defpackage.xia xiaVar2 = new defpackage.xia(erasedOnboardingTaskState);
                    android.os.PersistableBundle persistableBundle3 = erasedOnboardingTaskState.a;
                    aooh.f(persistableBundle3, "bundle");
                    xmpVar = new defpackage.xmo(xfeVar, xiaVar2, defpackage.xhp.d(persistableBundle3));
                    linkedHashMap.put(key, aozk.a(xmpVar));
                    it2 = it;
                } else {
                    if (iHashCode != 2096857181 || !strG.equals("Failed")) {
                        throw new java.lang.IllegalStateException("Unknown OnboardingTaskState(type=" + erasedOnboardingTaskState.g() + ')');
                    }
                    defpackage.xia xiaVar3 = new defpackage.xia(erasedOnboardingTaskState);
                    android.os.PersistableBundle persistableBundle4 = erasedOnboardingTaskState.a;
                    aooh.f(persistableBundle4, "bundle");
                    long jD2 = defpackage.xhp.d(persistableBundle4);
                    android.os.PersistableBundle persistableBundle5 = persistableBundle4.getPersistableBundle("com.android.onboarding.task.RESULT");
                    defpackage.xhn xhnVar = (defpackage.xhn) defpackage.xfh.g(persistableBundle4, "com.android.onboarding.task.LAST_METADATA", defpackage.xhn.a);
                    java.lang.String string = persistableBundle4.getString("com.android.onboarding.task.ERROR");
                    defpackage.xhl xhoVar = string != null ? new defpackage.xho(string) : new defpackage.xhm("Failed to parse error message in the bundle.");
                    defpackage.xmn xmnVar = defpackage.xmn.UNSPECIFIED;
                    defpackage.xmn xmnVar2 = defpackage.xmn.UNSPECIFIED;
                    int i2 = persistableBundle4.getInt("com.android.onboarding.task.FAILURE_REASON", xmnVar2.h);
                    aojl aojlVar = new aojl(defpackage.xmn.g);
                    while (true) {
                        if (!aojlVar.hasNext()) {
                            it = it2;
                            next = null;
                            break;
                        }
                        next = aojlVar.next();
                        it = it2;
                        if (((defpackage.xmn) next).h == i2) {
                            break;
                        }
                        it2 = it;
                    }
                    defpackage.xmn xmnVar3 = (defpackage.xmn) next;
                    xmpVar = new defpackage.xmm(xfeVar, xiaVar3, jD2, persistableBundle5, xhnVar, xhoVar, xmnVar3 == null ? xmnVar2 : xmnVar3);
                    linkedHashMap.put(key, aozk.a(xmpVar));
                    it2 = it;
                }
            }
            xmwVar2.d.putAll(linkedHashMap);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.xmv(this.b, aolnVar);
    }
}
