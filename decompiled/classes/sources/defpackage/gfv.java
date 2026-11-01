package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gfv {
    public final java.util.List a;
    public defpackage.gis b;
    public boolean c;
    public long d;
    public java.util.concurrent.TimeUnit e;
    public boolean f;
    public boolean g;
    public boolean h;
    private final defpackage.aopu i;
    private final android.content.Context j;
    private final java.lang.String k;
    private final java.util.List l;
    private java.util.concurrent.Executor m;
    private java.util.concurrent.Executor n;
    private final java.util.Set o;
    private final java.util.Set p;
    private final java.util.List q;
    private defpackage.aolr r;
    private final int s;
    private final defpackage.ipc t;

    public gfv(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.l = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
        this.s = 1;
        this.d = -1L;
        this.t = new defpackage.ipc((byte[]) null, (char[]) null);
        this.o = new java.util.LinkedHashSet();
        this.p = new java.util.LinkedHashSet();
        this.q = new java.util.ArrayList();
        this.f = true;
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        this.i = new defpackage.aooa(cls);
        this.j = context;
        this.k = str;
    }

    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.Object, java.util.Map] */
    public final defpackage.gfy a() {
        defpackage.ggb ggbVarC;
        java.util.LinkedHashMap linkedHashMap;
        java.util.List list;
        int size;
        boolean[] zArr;
        java.util.Iterator it;
        java.lang.Object objA;
        java.lang.Object objA2;
        defpackage.aolr aolrVarPlus;
        boolean zContainsKey;
        java.util.concurrent.Executor executor = this.m;
        java.util.concurrent.Executor executor2 = this.n;
        if (executor == null) {
            if (executor2 == null) {
                java.util.concurrent.Executor executor3 = defpackage.sp.a;
                this.n = executor3;
                this.m = executor3;
            } else {
                this.m = executor2;
            }
        } else if (executor2 == null) {
            this.n = executor;
        }
        java.util.Set set = this.p;
        java.util.Set set2 = this.o;
        if (!set.isEmpty()) {
            java.util.Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((java.lang.Number) it2.next()).intValue();
                if (set2.contains(java.lang.Integer.valueOf(iIntValue))) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bj(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                }
            }
        }
        defpackage.gis ghoVar = this.b;
        if (ghoVar == null) {
            ghoVar = new defpackage.gje();
        }
        long j = this.d;
        if (j > 0) {
            if (this.k == null) {
                throw new java.lang.IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            java.util.concurrent.TimeUnit timeUnit = this.e;
            if (timeUnit == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            ghoVar = new defpackage.gho(ghoVar, new defpackage.ghh(j, timeUnit));
        }
        android.content.Context context = this.j;
        java.lang.String str = this.k;
        defpackage.ipc ipcVar = this.t;
        java.util.List list2 = this.l;
        boolean z = this.c;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        java.lang.Object systemService = context.getSystemService("activity");
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        int i = 2;
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            i = 3;
        }
        int i2 = i;
        java.util.concurrent.Executor executor4 = this.m;
        if (executor4 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.util.concurrent.Executor executor5 = this.n;
        if (executor5 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        defpackage.gfg gfgVar = new defpackage.gfg(context, str, ghoVar, ipcVar, list2, z, i2, executor4, executor5, this.f, this.g, set2, this.a, this.q, this.h, this.r);
        gfgVar.o = true;
        java.lang.Class cls = ((defpackage.aooa) this.i).b;
        if (cls == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        defpackage.gfy gfyVar = (defpackage.gfy) defpackage.dez.k(cls);
        gfyVar.j = gfgVar.o;
        try {
            ggbVarC = gfyVar.c();
            while (true) {
                int i3 = -1;
                if (!it.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i4 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size2 = i4;
                        }
                    }
                    for (defpackage.ghg ghgVar : gfyVar.f(linkedHashMap)) {
                        defpackage.ipc ipcVar2 = gfgVar.r;
                        int i5 = ghgVar.a;
                        int i6 = ghgVar.b;
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i5);
                        ?? r11 = ipcVar2.a;
                        if (r11.containsKey(numValueOf)) {
                            java.util.Map map = (java.util.Map) r11.get(numValueOf);
                            if (map == null) {
                                map = defpackage.aokd.a;
                            }
                            zContainsKey = map.containsKey(java.lang.Integer.valueOf(i6));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            ipcVar2.A(ghgVar);
                        }
                    }
                    if (gfyVar == null) {
                        defpackage.aooh.i("<this>");
                    }
                    java.util.Map mapG = gfyVar.g();
                    java.util.List list3 = gfgVar.k;
                    boolean[] zArr2 = new boolean[list3.size()];
                    for (java.util.Map.Entry entry : mapG.entrySet()) {
                        defpackage.aopu aopuVar = (defpackage.aopu) entry.getKey();
                        for (defpackage.aopu aopuVar2 : (java.util.List) entry.getValue()) {
                            int size3 = list3.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i7 = size3 - 1;
                                if (aopuVar2.d(list3.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i7 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i7;
                            }
                            if (size3 < 0) {
                                throw new java.lang.IllegalArgumentException("A required type converter (" + aopuVar2.b() + ") for " + aopuVar.b() + " is missing in the database configuration.");
                            }
                            java.lang.Object obj = list3.get(size3);
                            if (aopuVar2 == null) {
                                defpackage.aooh.i("kclass");
                            }
                            if (obj == null) {
                                defpackage.aooh.i("converter");
                            }
                            gfyVar.i.put(aopuVar2, obj);
                        }
                    }
                    int size4 = list3.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i8 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new java.lang.IllegalArgumentException("Unexpected type converter " + list3.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i8 < 0) {
                                break;
                            }
                            size4 = i8;
                        }
                    }
                    defpackage.aolr aolrVar = gfgVar.n;
                    if (aolrVar != null) {
                        defpackage.aolp aolpVar = aolrVar.get(defpackage.aolo.k);
                        if (aolpVar == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                        }
                        defpackage.aosp aospVar = (defpackage.aosp) aolpVar;
                        gfyVar.c = defpackage.aooc.ab(aospVar);
                        java.util.concurrent.Executor executor6 = gfyVar.c;
                        if (executor6 == null) {
                            defpackage.aooh.j("internalQueryExecutor");
                            executor6 = null;
                        }
                        gfyVar.d = new defpackage.ggf(executor6);
                        gfyVar.a = defpackage.aosv.n(aolrVar.plus(new defpackage.aovh((defpackage.aoub) aolrVar.get(defpackage.aoub.d))));
                        if (gfyVar.r()) {
                            defpackage.aoss aossVar = gfyVar.a;
                            if (aossVar == null) {
                                defpackage.aooh.j("coroutineScope");
                                aossVar = null;
                            }
                            aolrVarPlus = ((defpackage.apbj) aossVar).a.plus(aospVar.e(1));
                        } else {
                            defpackage.aoss aossVar2 = gfyVar.a;
                            if (aossVar2 == null) {
                                defpackage.aooh.j("coroutineScope");
                                aossVar2 = null;
                            }
                            aolrVarPlus = ((defpackage.apbj) aossVar2).a;
                        }
                        gfyVar.b = aolrVarPlus;
                    } else {
                        gfyVar.c = gfgVar.f;
                        gfyVar.d = new defpackage.ggf(gfgVar.g);
                        java.util.concurrent.Executor executor7 = gfyVar.c;
                        if (executor7 == null) {
                            defpackage.aooh.j("internalQueryExecutor");
                            executor7 = null;
                        }
                        gfyVar.a = defpackage.aosv.n(defpackage.aooc.ac(executor7).plus(new defpackage.aovh(null)));
                        defpackage.aoss aossVar3 = gfyVar.a;
                        if (aossVar3 == null) {
                            defpackage.aooh.j("coroutineScope");
                            aossVar3 = null;
                        }
                        java.util.concurrent.Executor executor8 = gfyVar.d;
                        if (executor8 == null) {
                            defpackage.aooh.j("internalTransactionExecutor");
                            executor8 = null;
                        }
                        gfyVar.b = ((defpackage.apbj) aossVar3).a.plus(defpackage.aooc.ac(executor8));
                    }
                    gfyVar.f = gfgVar.e;
                    defpackage.maw mawVar = gfyVar.k;
                    if (mawVar == null) {
                        defpackage.aooh.j("connectionManager");
                        mawVar = null;
                    }
                    java.lang.Object obj2 = mawVar.c;
                    if (obj2 == null) {
                        objA = null;
                        break;
                    }
                    objA = obj2;
                    while (!(objA instanceof defpackage.ghp)) {
                        if (!(objA instanceof defpackage.gfh)) {
                            objA = null;
                            break;
                        }
                        objA = ((defpackage.gfh) objA).a();
                    }
                    defpackage.maw mawVar2 = gfyVar.k;
                    if (mawVar2 == null) {
                        defpackage.aooh.j("connectionManager");
                        mawVar2 = null;
                    }
                    java.lang.Object obj3 = mawVar2.c;
                    if (obj3 == null) {
                        objA2 = null;
                        break;
                    }
                    objA2 = obj3;
                    while (!(objA2 instanceof defpackage.ghn)) {
                        if (!(objA2 instanceof defpackage.gfh)) {
                            objA2 = null;
                            break;
                        }
                        objA2 = ((defpackage.gfh) objA2).a();
                    }
                    defpackage.ghn ghnVar = (defpackage.ghn) objA2;
                    if (ghnVar != null) {
                        defpackage.ghh ghhVar = ghnVar.a;
                        gfyVar.g = ghhVar;
                        defpackage.aoss aossVar4 = gfyVar.a;
                        if (aossVar4 == null) {
                            defpackage.aooh.j("coroutineScope");
                            aossVar4 = null;
                        }
                        if (aossVar4 == null) {
                            defpackage.aooh.i("coroutineScope");
                        }
                        ghhVar.b = aossVar4;
                        defpackage.gfn gfnVarB = gfyVar.b();
                        gfnVarB.g = ghhVar;
                        ghhVar.c = new defpackage.ded((java.lang.Object) gfnVarB, 4, (int[]) null);
                    }
                    return gfyVar;
                }
                defpackage.aopu aopuVar3 = (defpackage.aopu) it.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i9 = size5 - 1;
                        if (aopuVar3.d(list.get(size5))) {
                            zArr[size5] = true;
                            i3 = size5;
                            break;
                        }
                        if (i9 < 0) {
                            break;
                        }
                        size5 = i9;
                    }
                }
                if (i3 < 0) {
                    throw new java.lang.IllegalArgumentException("A required auto migration spec (" + aopuVar3.b() + ") is missing in the database configuration.");
                }
                linkedHashMap.put(aopuVar3, list.get(i3));
            }
        } catch (defpackage.aoit unused) {
            ggbVarC = null;
        }
        gfyVar.k = ggbVarC == null ? new defpackage.maw(gfgVar, (defpackage.aonj) new fvt(15), (defpackage.aonn) new gfw(gfyVar, 0)) : new defpackage.maw(gfgVar, (defpackage.gga) ggbVarC, new defpackage.gfx(gfyVar, 0));
        gfyVar.e = gfyVar.a();
        if (gfyVar == null) {
            defpackage.aooh.i("<this>");
        }
        linkedHashMap = new java.util.LinkedHashMap();
        list = gfgVar.l;
        java.util.Set setI = gfyVar.i();
        size = list.size();
        zArr = new boolean[size];
        it = setI.iterator();
    }

    public final void b(defpackage.ghg... ghgVarArr) {
        if (ghgVarArr == null) {
            defpackage.aooh.i("migrations");
        }
        for (defpackage.ghg ghgVar : ghgVarArr) {
            java.util.Set set = this.p;
            set.add(java.lang.Integer.valueOf(ghgVar.a));
            set.add(java.lang.Integer.valueOf(ghgVar.b));
        }
        defpackage.ipc ipcVar = this.t;
        defpackage.ghg[] ghgVarArr2 = (defpackage.ghg[]) java.util.Arrays.copyOf(ghgVarArr, ghgVarArr.length);
        if (ghgVarArr2 == null) {
            defpackage.aooh.i("migrations");
        }
        for (defpackage.ghg ghgVar2 : ghgVarArr2) {
            ipcVar.A(ghgVar2);
        }
    }

    public final void c() {
        this.f = false;
        this.g = true;
    }

    public final void d() {
        this.f = true;
        this.g = true;
        this.h = false;
    }

    public final void e(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        if (this.m != null || this.n != null) {
            throw new java.lang.IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (aolrVar.get(defpackage.aolo.k) == null) {
            throw new java.lang.IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        this.r = aolrVar;
    }

    public final void f(java.util.concurrent.Executor executor) {
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        if (this.r != null) {
            throw new java.lang.IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        this.m = executor;
    }

    public final void g(defpackage.gfz gfzVar) {
        if (gfzVar == null) {
            defpackage.aooh.i("callback");
        }
        this.l.add(gfzVar);
    }
}
