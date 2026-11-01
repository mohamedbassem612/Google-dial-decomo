package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahrc extends java.lang.RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public ahrc(java.lang.Throwable th, java.lang.StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static defpackage.ajcq a(defpackage.ajcq ajcqVar, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        defpackage.ajcq ajcqVarA = defpackage.aiql.A(ajcqVar);
        defpackage.ajcq ajcqVarG = defpackage.aiql.G(ajcqVarA, j, timeUnit, scheduledExecutorService);
        return defpackage.aizu.g(ajcqVarG, java.util.concurrent.TimeoutException.class, new defpackage.adlf(ajcqVar, ajcqVarG, ahpjVarB, ajcqVarA, 4), defpackage.ajbm.INSTANCE);
    }

    public static java.lang.RuntimeException b(java.lang.Thread thread) {
        defpackage.ahpe ahpeVar;
        java.util.WeakHashMap weakHashMap = defpackage.ahns.c;
        synchronized (weakHashMap) {
            ahpeVar = (defpackage.ahpe) weakHashMap.get(thread);
        }
        return new defpackage.ahrc(null, l(ahpeVar == null ? null : ahpeVar.c, null));
    }

    public static java.lang.RuntimeException c() {
        return new defpackage.ahrc(null, l(defpackage.ahns.b(), null));
    }

    public static java.lang.String d(java.lang.String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void e(java.util.Collection collection, java.lang.StackTraceElement[] stackTraceElementArr) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((java.lang.Throwable) it.next()).addSuppressed(new ahrb(stackTraceElementArr));
        }
    }

    public static void f(defpackage.aigf aigfVar) {
        defpackage.ahpj ahpjVar;
        defpackage.ahyn ahynVarG;
        boolean z = defpackage.ahns.a;
        java.util.HashMap map = new java.util.HashMap();
        java.util.WeakHashMap weakHashMap = defpackage.ahns.c;
        synchronized (weakHashMap) {
            for (java.util.Map.Entry entry : weakHashMap.entrySet()) {
                defpackage.ahpj ahpjVar2 = ((defpackage.ahpe) entry.getValue()).c;
                if (ahpjVar2 != null) {
                    map.put((java.lang.Thread) entry.getKey(), ahpjVar2);
                }
            }
        }
        defpackage.aihb aihbVar = new defpackage.aihb();
        defpackage.aikj aikjVar = (defpackage.aikj) aigfVar;
        defpackage.ailj it = ((defpackage.aikh) aikjVar.keySet()).iterator();
        while (it.hasNext()) {
            aihbVar.c(((defpackage.ahpj) it.next()).g());
        }
        defpackage.aihd aihdVarG = aihbVar.g();
        defpackage.ailj it2 = ((defpackage.aikh) aikjVar.keySet()).iterator();
        int iC = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            defpackage.ahpj ahpjVar3 = (defpackage.ahpj) it2.next();
            if (ahpjVar3 instanceof defpackage.ahoj) {
                defpackage.ahoj ahojVar = (defpackage.ahoj) ahpjVar3;
                if (ahojVar.c() < iC) {
                    iC = ahojVar.c();
                }
            }
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            java.lang.Thread thread = (java.lang.Thread) entry2.getKey();
            defpackage.ahpj ahpjVar4 = (defpackage.ahpj) entry2.getValue();
            if (thread != java.lang.Thread.currentThread()) {
                if (aihdVarG.contains(ahpjVar4.g())) {
                    defpackage.ahpj ahpjVarB = ahpjVar4;
                    while (true) {
                        if (ahpjVarB == null || ((ahpjVarB instanceof defpackage.ahoj) && ((defpackage.ahoj) ahpjVarB).c() < iC)) {
                            ahpjVar = null;
                            break;
                        } else if (map2.containsKey(ahpjVarB)) {
                            ahpjVar = (defpackage.ahpj) map2.get(ahpjVarB);
                            break;
                        } else {
                            if (aigfVar.containsKey(ahpjVarB)) {
                                ahpjVar = ahpjVarB;
                                break;
                            }
                            ahpjVarB = ahpjVarB.b();
                        }
                    }
                    defpackage.ahpj ahpjVarB2 = ahpjVar4;
                    while (true) {
                        if (j$.util.Objects.equals(ahpjVarB2, ahpjVar != null ? ahpjVar : ahpjVarB) || map2.containsKey(ahpjVarB2)) {
                            break;
                        }
                        map2.put(ahpjVarB2, ahpjVar);
                        ahpjVarB2 = ahpjVarB2.b();
                    }
                    ahynVarG = defpackage.ahyn.g(ahpjVar);
                } else {
                    ahynVarG = defpackage.ahwt.a;
                }
                if (ahynVarG.f()) {
                    java.lang.Throwable th = (java.lang.Throwable) aigfVar.get(ahynVarG.b());
                    abqt abqtVar = new abqt(thread, (java.lang.Throwable) null);
                    abqtVar.addSuppressed(new defpackage.ahrc(null, l(ahpjVar4, ((defpackage.ahpj) ahynVarG.b()).b())));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(new java.lang.StackTraceElement("tk_trace", d(abqtVar.getMessage()), null, 0));
                    java.util.Collections.addAll(arrayList, abqtVar.getStackTrace());
                    arrayList.toArray(new java.lang.StackTraceElement[0]);
                    th.addSuppressed(abqtVar);
                }
            }
        }
    }

    public static void g(defpackage.ahpj ahpjVar, java.lang.Throwable th) {
        if (defpackage.ahvr.U(ahpjVar)) {
            f(defpackage.aigf.k(ahpjVar, th));
        }
    }

    public static void h(defpackage.aigf aigfVar) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        defpackage.ailj it = aigfVar.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            defpackage.ahpj ahpjVar = (defpackage.ahpj) entry.getKey();
            if (ahpjVar instanceof defpackage.ahoj) {
                defpackage.ahqy ahqyVar = (defpackage.ahqy) map.get(((defpackage.ahpj) entry.getKey()).g());
                if (ahqyVar == null) {
                    ahqyVar = ((defpackage.ahoj) ahpjVar).a.b().c;
                    map.put(ahpjVar.g(), ahqyVar);
                }
                java.util.Map map3 = (java.util.Map) map2.get(ahqyVar);
                if (map3 == null) {
                    map3 = new java.util.HashMap();
                    map2.put(ahqyVar, map3);
                }
                map3.put(java.lang.Integer.valueOf(((defpackage.ahoj) ahpjVar).c()), (java.lang.Throwable) entry.getValue());
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            defpackage.ahqy ahqyVar2 = (defpackage.ahqy) entry2.getKey();
            int iIntValue = ((java.lang.Integer) java.util.Collections.min(((java.util.Map) entry2.getValue()).keySet())).intValue();
            java.util.HashMap map4 = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it2 = ahqyVar2.e.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(new java.lang.StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            } while ((((defpackage.ahop) it2.next()).b & 32) != 0);
            defpackage.ahna ahnaVar = ahqyVar2.i;
            if (ahnaVar == null) {
                ahnaVar = defpackage.ahna.a;
            }
            if ((ahnaVar.b & 1) != 0) {
                java.util.Locale locale = java.util.Locale.US;
                java.lang.String str = ((defpackage.ahop) ahqyVar2.e.get(0)).c;
                defpackage.ahna ahnaVar2 = ahqyVar2.i;
                if (ahnaVar2 == null) {
                    ahnaVar2 = defpackage.ahna.a;
                }
                ahmz ahmzVar = ahnaVar2.c;
                if (ahmzVar == null) {
                    ahmzVar = ahmz.a;
                }
                arrayList.add(new java.lang.StackTraceElement("tk_trace", d(java.lang.String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, java.lang.Integer.valueOf(ahmzVar.c))), null, 0));
            }
            if (arrayList.isEmpty()) {
                j(ahqyVar2, (java.util.Map) entry2.getValue(), iIntValue, map4);
            } else {
                e(((java.util.Map) entry2.getValue()).values(), (java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]));
            }
        }
    }

    public static void i(defpackage.ahpj ahpjVar, java.lang.Throwable th) {
        if (defpackage.ahvr.U(ahpjVar)) {
            h(defpackage.aigf.k(ahpjVar, th));
        }
    }

    public static void j(defpackage.ahqy ahqyVar, java.util.Map map, int i, java.util.Map map2) {
        int i2;
        int i3 = 0;
        for (defpackage.ahop ahopVar : defpackage.ahvr.aN(ahqyVar.e)) {
            java.lang.Integer numValueOf = null;
            if (i3 >= 10) {
                e(map.values(), new java.lang.StackTraceElement[]{new java.lang.StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((ahopVar.b & 32) == 0 && !map2.containsKey(ahopVar)) {
                defpackage.alat alatVar = ahqyVar.e;
                java.util.Set setKeySet = map.keySet();
                boolean z = false;
                defpackage.ahop ahopVar2 = ahopVar;
                while (!z) {
                    if (map2.containsKey(ahopVar2)) {
                        numValueOf = (java.lang.Integer) map2.get(ahopVar2);
                    } else if (setKeySet.contains(java.lang.Integer.valueOf(ahopVar2.d))) {
                        numValueOf = java.lang.Integer.valueOf(ahopVar2.d);
                    } else {
                        int i4 = ahopVar2.e;
                        if (i4 >= i) {
                            ahopVar2 = (defpackage.ahop) alatVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                defpackage.ahop ahopVar3 = ahopVar;
                while (!z2) {
                    if (!map2.containsKey(ahopVar3)) {
                        map2.put(ahopVar3, numValueOf);
                        if ((numValueOf == null || ahopVar3.e != numValueOf.intValue()) && (i2 = ahopVar3.e) >= 0) {
                            ahopVar3 = (defpackage.ahop) alatVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                defpackage.ahyn ahynVarG = defpackage.ahyn.g(numValueOf);
                if (ahynVarG.f()) {
                    i3++;
                    java.lang.Throwable th = (java.lang.Throwable) map.get(ahynVarG.b());
                    defpackage.alat alatVar2 = ahqyVar.e;
                    int iIntValue = ((java.lang.Integer) ahynVarG.b()).intValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(m(ahopVar));
                    while (ahopVar.d != iIntValue) {
                        ahopVar = (defpackage.ahop) alatVar2.get(ahopVar.e);
                        arrayList.add(m(ahopVar));
                    }
                    th.addSuppressed(new ahrb((java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0])));
                }
            }
        }
    }

    public static void k(java.lang.Throwable th) {
        ahnn.a(th);
        throw new defpackage.ahrc(th, l(defpackage.ahns.b(), null));
    }

    public static java.lang.StackTraceElement[] l(defpackage.ahpj ahpjVar, defpackage.ahpj ahpjVar2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.ahpj ahpjVarB = ahpjVar; ahpjVarB != ahpjVar2; ahpjVarB = ahpjVarB.b()) {
            arrayList.add(new java.lang.StackTraceElement("tk_trace", d(ahpjVarB.d()), null, 0));
        }
        if (ahpjVar instanceof defpackage.ahnj) {
            arrayList.add(new java.lang.StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]);
    }

    private static java.lang.StackTraceElement m(defpackage.ahop ahopVar) {
        java.lang.String str;
        if ((ahopVar.b & 32) != 0) {
            str = " " + ahopVar.h + " ms";
        } else {
            str = "(unfinished)";
        }
        return new java.lang.StackTraceElement("tk_trace", d(java.lang.String.valueOf(ahopVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
