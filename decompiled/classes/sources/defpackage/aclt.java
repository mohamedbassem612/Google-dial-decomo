package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aclt {
    public final defpackage.ajct a;
    public final defpackage.aclr b;
    private final defpackage.aoin c;
    private final java.util.Set d;
    private final java.util.concurrent.Executor e;
    private volatile defpackage.aigf f;

    public aclt(defpackage.ajct ajctVar, defpackage.aoin aoinVar, java.util.Set set, defpackage.aclr aclrVar) {
        this.a = ajctVar;
        this.c = aoinVar;
        this.d = set;
        this.b = aclrVar;
        this.e = new defpackage.ajdc(ajctVar);
        defpackage.ahvr.bZ(!set.isEmpty(), "No logging result handlers provided.");
    }

    private final void c(defpackage.ajcq ajcqVar) {
        defpackage.ailj it = ((defpackage.aile) this.d).iterator();
        while (it.hasNext()) {
            jya jyaVar = new jya((defpackage.aaoo) it.next(), 15);
            ajcqVar.c(new defpackage.ajcc(ajcqVar, jyaVar), defpackage.ajbm.INSTANCE);
        }
    }

    public final java.util.List a(java.lang.Class cls) {
        defpackage.aigf aigfVarI = this.f;
        if (aigfVarI == null) {
            synchronized (this) {
                aigfVarI = this.f;
                if (aigfVarI == null) {
                    java.util.HashMap map = new java.util.HashMap();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (defpackage.aclu acluVar : (java.util.Set) this.c.a()) {
                        if (acluVar.b().isEmpty()) {
                            arrayList.add(acluVar);
                        } else {
                            defpackage.ailj it = ((defpackage.aile) acluVar.b()).iterator();
                            while (it.hasNext()) {
                                java.lang.Class cls2 = (java.lang.Class) it.next();
                                java.util.List arrayList2 = (java.util.List) map.get(cls2);
                                if (arrayList2 == null) {
                                    arrayList2 = new java.util.ArrayList();
                                    map.put(cls2, arrayList2);
                                }
                                arrayList2.add(acluVar);
                            }
                        }
                    }
                    map.put(defpackage.aclv.class, arrayList);
                    aigfVarI = defpackage.aigf.i(map);
                    this.f = aigfVarI;
                }
            }
        }
        return (java.util.List) aigfVarI.getOrDefault(cls, defpackage.aike.a);
    }

    public final void b(defpackage.acls aclsVar) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                java.util.List listA = aclsVar.a();
                if (!listA.isEmpty()) {
                    defpackage.nyf nyfVar = new defpackage.nyf(this, listA, 10);
                    long j = defpackage.ahqx.a;
                    defpackage.ajav ajavVar = new defpackage.ajav(defpackage.ahns.c(false), nyfVar, 1);
                    java.util.concurrent.Executor executor = this.e;
                    defpackage.ajdk ajdkVar = new defpackage.ajdk(ajavVar);
                    executor.execute(ajdkVar);
                    defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), new defpackage.vmn(this, 13), 1);
                    int i = defpackage.ajan.c;
                    defpackage.ajal ajalVar = new defpackage.ajal(ajdkVar, ajaxVar);
                    ajdkVar.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
                    c(ajalVar);
                }
            } catch (java.lang.Throwable th) {
                defpackage.ajcq ajddVar = new defpackage.ajdd(th);
                new defpackage.ajdd(th);
                c(ajddVar);
            }
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
