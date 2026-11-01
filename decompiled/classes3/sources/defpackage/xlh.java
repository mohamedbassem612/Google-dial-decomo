package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xlh extends defpackage.xlt implements java.lang.AutoCloseable, defpackage.xhu {
    public static final /* synthetic */ int h = 0;
    public final java.util.Collection b;
    public final java.util.function.Supplier c;
    public final java.util.Set d;
    public final java.util.Set e;
    public final defpackage.xmw f;
    public final defpackage.xon g;
    private final /* synthetic */ defpackage.xhs j;
    private final java.util.function.Supplier k;
    private final defpackage.xkp l;
    private final aoss m;
    private final aoir n;
    static final /* synthetic */ aoqc[] a = {new defpackage.aooi(defpackage.xlh.class), new aoom(defpackage.xlh.class, "otm", "getOtm()Lcom/android/onboarding/tasks/OnboardingTaskManager;", 0)};
    private static final defpackage.xfs i = new defpackage.xky(new java.lang.String[]{"allow_default"}, 2);

    /* JADX WARN: Multi-variable type inference failed */
    public xlh(defpackage.xhu xhuVar, java.util.function.Supplier supplier, java.util.Collection collection, defpackage.xkp xkpVar, aolr aolrVar, java.util.function.Supplier supplier2, java.util.Set set, java.util.Set set2, defpackage.xmw xmwVar, defpackage.xkw xkwVar, defpackage.xov xovVar, defpackage.xhe xheVar, defpackage.aopd aopdVar, defpackage.xon xonVar) {
        aooh.f(xhuVar, "component");
        aooh.f(aolrVar, "coroutineContext");
        this.j = xhuVar;
        this.k = supplier;
        this.b = collection;
        this.l = xkpVar;
        this.c = supplier2;
        this.d = set;
        this.e = set2;
        this.f = xmwVar;
        this.g = xonVar;
        defpackage.xhs xhsVarAsComponentRef = asComponentRef();
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier2);
        aooh.e(objM, "get(...)");
        defpackage.xkx xkxVar = new defpackage.xkx(xhsVarAsComponentRef, aolrVar, xonVar, (defpackage.xpz) objM, xheVar);
        aoqc[] aoqcVarArr = a;
        aopdVar.b(aoqcVarArr[0], xkxVar);
        defpackage.xox.d("OTMServiceBinder", a.bi(this, xhuVar, "Component(", ") initiated binder instance: "));
        this.m = aosv.n(aolrVar.plus(new aovh((aoub) null)));
        this.n = aooc.ag(new defpackage.wsn(this, 8));
    }

    private final java.util.Map G() {
        return (java.util.Map) this.n.a();
    }

    private final aoub H(java.lang.String str, aonn aonnVar) {
        return aoov.an(this.m, (aolr) null, 0, new defpackage.vjf(aonnVar, str, (aoln) null, 18), 3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    public static final void u(defpackage.xjz xjzVar, defpackage.xmq xmqVar, java.lang.Throwable th) {
        j$.util.Objects.checkIndex(0, 3);
        defpackage.xou xosVar = null;
        if (xmqVar == null) {
            defpackage.xox.g("OTMServiceBinder", a.bm((byte) 41, xmqVar, xjzVar, "logCompleteTask called with non-complete task ", " ("));
        } else if (xmqVar instanceof defpackage.xmp) {
            defpackage.xmp xmpVar = (defpackage.xmp) xmqVar;
            java.lang.Object objG = xmpVar.g();
            xosVar = objG instanceof defpackage.xou ? (defpackage.xou) objG : null;
            if (xosVar == null) {
                xosVar = new defpackage.xot(xmpVar.g());
            }
        } else if (xmqVar instanceof defpackage.xmm) {
            defpackage.xmm xmmVar = (defpackage.xmm) xmqVar;
            java.lang.Object objG2 = xmmVar.g();
            xosVar = objG2 instanceof defpackage.xou ? (defpackage.xou) objG2 : null;
            if (xosVar == null) {
                xosVar = new defpackage.xos(th, xmmVar.d);
            }
        } else {
            defpackage.xox.g("OTMServiceBinder", a.bm((byte) 41, xmqVar, xjzVar, "logCompleteTask called with non-complete task ", " ("));
        }
        defpackage.xou xouVar = xosVar;
        if (xouVar != null) {
            defpackage.xjb.c.a(new defpackage.xis(xjzVar.getNodeName(), xjzVar.getNodeComponent(), xjzVar.d(), xouVar));
        }
    }

    public static final defpackage.xmx v(defpackage.xni xniVar) {
        return new defpackage.xmx(xniVar.b(), new defpackage.xia(xniVar), new defpackage.xle(), xniVar.d(), xniVar.a(), xniVar.e(), xniVar.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ defpackage.xob x(defpackage.xlh xlhVar, defpackage.xjz xjzVar, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "Unknown onboarding task service error.";
        }
        if (th instanceof defpackage.xoo) {
            return new defpackage.xob((defpackage.xpa) th);
        }
        if (xjzVar == null) {
            xjzVar = defpackage.xhy.m(defpackage.xhy.g(xlhVar, "UNKNOWN"), -1L);
        }
        return new defpackage.xob(new defpackage.xoo(xjzVar, th, message));
    }

    @Override // defpackage.xlu
    public final void A(defpackage.xoc xocVar, defpackage.xod xodVar) {
        aooh.f(xocVar, "token");
        aooh.f(xodVar, "callback");
        H("getTaskStateAsync", new defpackage.xkz(xocVar, this, android.os.Binder.getCallingUid(), xodVar, (aoln) null, 2, (char[]) null));
    }

    @Override // defpackage.xlu
    public final void B(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, defpackage.xls xlsVar) {
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(xlsVar, "listener");
        H("getTaskStateWithCallback", new defpackage.xla(this, erasedOnboardingTaskToken, android.os.Binder.getCallingUid(), xlsVar, (aoln) null, 1));
    }

    @Override // defpackage.xlu
    public final void C(defpackage.xoc xocVar, defpackage.xoc xocVar2, defpackage.xoe xoeVar) {
        aooh.f(xocVar, "token");
        aooh.f(xocVar2, "reason");
        aooh.f(xoeVar, "callback");
        H("interruptTaskAsync", new defpackage.xlf(xocVar, this, android.os.Binder.getCallingUid(), xocVar2, xoeVar, null, 1, null));
    }

    @Override // defpackage.xlu
    public final void D(defpackage.xoc xocVar, defpackage.xoc xocVar2, defpackage.xoe xoeVar) {
        aooh.f(xocVar, "token");
        aooh.f(xocVar2, "input");
        aooh.f(xoeVar, "callback");
        H("startTaskAsync", new defpackage.xlf(xocVar, this, android.os.Binder.getCallingUid(), xocVar2, xoeVar, null, 0));
    }

    public final java.lang.Object E(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken) {
        return this.g.f(v(erasedOnboardingTaskToken));
    }

    @Override // defpackage.xlu
    public final int a() {
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        return ((defpackage.xpz) objM).e(429537734L) ? 1 : 0;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        return this.j;
    }

    public final android.os.PersistableBundle b(android.os.PersistableBundle persistableBundle) {
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (!((defpackage.xpz) objM).e(394763768L) || !defpackage.xff.h(persistableBundle)) {
            return persistableBundle;
        }
        defpackage.xox.b("OTMServiceBinder", "Waiting until full bundle of id " + defpackage.xff.e(persistableBundle) + " is received.");
        android.os.PersistableBundle persistableBundle2 = (android.os.PersistableBundle) aoov.ah(this.m.a, new defpackage.wcj(persistableBundle, (aoln) null, 13));
        defpackage.xox.b("OTMServiceBinder", "Received full bundle of id " + defpackage.xff.e(persistableBundle));
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.xow.a;
        int iE = defpackage.xff.e(persistableBundle);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = defpackage.xow.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iE);
        defpackage.xow.b.remove(numValueOf);
        return persistableBundle2;
    }

    public final android.os.PersistableBundle c(android.os.PersistableBundle persistableBundle) {
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (!((defpackage.xpz) objM).e(394763768L) || !defpackage.xff.i(persistableBundle)) {
            return persistableBundle;
        }
        android.os.PersistableBundle persistableBundleG = defpackage.xff.g(persistableBundle);
        int iE = defpackage.xff.e(persistableBundleG);
        java.util.List listJ = defpackage.xff.j(persistableBundle);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.xow.a;
        defpackage.xow.b.put(java.lang.Integer.valueOf(iE), ajsz.cb(listJ));
        defpackage.xox.b("OTMServiceBinder", a.bj(iE, "Prepared data in chunks to be fetched. id="));
        return persistableBundleG;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.xlu
    public final android.os.PersistableBundle d(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken) {
        android.os.PersistableBundle persistableBundle;
        aooh.f(erasedOnboardingTaskToken, "token");
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (((defpackage.xpz) objM).e(429537734L)) {
            apbj apbjVar = this.m;
            return (android.os.PersistableBundle) aoov.ah(apbjVar.a, new kgx(this, erasedOnboardingTaskToken, callingUid, (aoln) null, 8));
        }
        o(erasedOnboardingTaskToken, callingUid);
        try {
            persistableBundle = this.f.a(erasedOnboardingTaskToken).toPersistableBundle();
        } catch (java.lang.Exception e) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(e);
            int i2 = defpackage.xox.a;
            android.util.Log.w("AndroidOnboarding", "OTMServiceBinder", illegalStateException);
            persistableBundle = new android.os.PersistableBundle();
        }
        return c(persistableBundle);
    }

    public final android.os.PersistableBundle e(defpackage.xnh xnhVar) {
        defpackage.xhn xhnVarB = xnhVar.b();
        return xhnVarB == null ? new defpackage.xhn().toPersistableBundle() : c(xhnVarB.toPersistableBundle());
    }

    public com.android.onboarding.tasks.ErasedOnboardingTaskState f(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken) {
        defpackage.xnh xnhVarH;
        aooh.f(erasedOnboardingTaskToken, "token");
        java.util.Objects.toString(erasedOnboardingTaskToken);
        defpackage.xox.b("OTMServiceBinder", "getTaskState token=".concat(java.lang.String.valueOf(erasedOnboardingTaskToken)));
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (((defpackage.xpz) objM).e(429537734L)) {
            apbj apbjVar = this.m;
            return g((com.android.onboarding.tasks.ErasedOnboardingTaskState) aoov.ah(apbjVar.a, new kgx(this, erasedOnboardingTaskToken, callingUid, (aoln) null, 9, (byte[]) null)));
        }
        o(erasedOnboardingTaskToken, callingUid);
        try {
            xnhVarH = h(erasedOnboardingTaskToken);
        } catch (java.lang.Exception e) {
            android.util.Log.w("AndroidOnboarding", "OTMServiceBinder", new java.lang.IllegalStateException(e));
            xnhVarH = defpackage.xhp.h(erasedOnboardingTaskToken, new defpackage.xhm("Task execution failed with an exception."), null, 12);
        }
        return g(xnhVarH.c());
    }

    public final com.android.onboarding.tasks.ErasedOnboardingTaskState g(com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskState) {
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (!((defpackage.xpz) objM).e(394763768L) || !erasedOnboardingTaskState.i()) {
            return erasedOnboardingTaskState;
        }
        if (!erasedOnboardingTaskState.i()) {
            throw new java.lang.IllegalArgumentException(a.bg(erasedOnboardingTaskState, "The task state {", "} is not too large for transaction."));
        }
        android.os.PersistableBundle persistableBundleA = erasedOnboardingTaskState.a();
        if (persistableBundleA == null) {
            throw new java.lang.IllegalArgumentException(a.bg(erasedOnboardingTaskState, "The task state {", "} doesn't have any result."));
        }
        android.os.PersistableBundle persistableBundle = erasedOnboardingTaskState.toPersistableBundle();
        persistableBundle.putPersistableBundle("com.android.onboarding.task.RESULT", defpackage.xff.g(persistableBundleA));
        com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskState2 = new com.android.onboarding.tasks.ErasedOnboardingTaskState(persistableBundle);
        android.os.PersistableBundle persistableBundleA2 = erasedOnboardingTaskState2.a();
        if (persistableBundleA2 == null || !defpackage.xff.h(persistableBundleA2)) {
            throw new java.lang.IllegalArgumentException(a.bg(erasedOnboardingTaskState2, "This {", "} is not a pending state."));
        }
        android.os.PersistableBundle persistableBundleA3 = erasedOnboardingTaskState2.a();
        if (persistableBundleA3 == null) {
            throw new java.lang.IllegalArgumentException(a.bg(erasedOnboardingTaskState2, "The task state {", "} doesn't have any result."));
        }
        int iE = defpackage.xff.e(persistableBundleA3);
        android.os.PersistableBundle persistableBundleA4 = erasedOnboardingTaskState.a();
        if (persistableBundleA4 == null) {
            throw new java.lang.IllegalArgumentException(a.bg(erasedOnboardingTaskState, "The task state {", "} doesn't have any result."));
        }
        java.util.List listJ = defpackage.xff.j(persistableBundleA4);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.xow.a;
        defpackage.xow.b.put(java.lang.Integer.valueOf(iE), ajsz.cb(listJ));
        defpackage.xox.b("OTMServiceBinder", a.bj(iE, "Prepared data in chunks to be fetched. id="));
        return erasedOnboardingTaskState2;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return ((defpackage.xht) this.j).a;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return this.j.getNodePackage();
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final defpackage.xnh h(defpackage.xni xniVar) {
        aooh.f(xniVar, "token");
        defpackage.xox.d("OTMServiceBinder", "getTaskStateUnsafe#[" + xniVar + ']');
        return this.f.c(xniVar);
    }

    @Override // defpackage.xlu
    public final defpackage.xnz i(defpackage.xoc xocVar, defpackage.xnx xnxVar) {
        aooh.f(xocVar, "token");
        aooh.f(xnxVar, "observer");
        return new defpackage.xlb(H("observeTaskMetadata", new defpackage.xkz(xocVar, this, android.os.Binder.getCallingUid(), xnxVar, (aoln) null, 4)));
    }

    @Override // defpackage.xhu
    public final java.lang.String identity() {
        throw null;
    }

    @Override // defpackage.xlu
    public final defpackage.xnz j(defpackage.xoc xocVar, defpackage.xnx xnxVar) {
        aooh.f(xocVar, "token");
        aooh.f(xnxVar, "observer");
        return new defpackage.xld(H("observeTaskState", new defpackage.xkz(xocVar, this, android.os.Binder.getCallingUid(), xnxVar, (aoln) null, 5, (byte[]) null)));
    }

    public final java.lang.Object k(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, aoln aolnVar) {
        return this.g.b(v(erasedOnboardingTaskToken), aolnVar);
    }

    public final java.lang.Object l(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, defpackage.xgk xgkVar, aoln aolnVar) {
        java.lang.Object objC = this.g.c(v(erasedOnboardingTaskToken), xgkVar, aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    public final java.lang.Object m(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, android.os.PersistableBundle persistableBundle, aoln aolnVar) {
        java.lang.Object objD = this.g.d(v(erasedOnboardingTaskToken), persistableBundle, aolnVar);
        return objD != aolu.a ? aojh.a : objD;
    }

    public final aoxh n(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken) {
        aooh.f(erasedOnboardingTaskToken, "token");
        return aoxo.a(new aowy(new defpackage.xok(this.g, v(erasedOnboardingTaskToken), null)));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    public final void o(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i2) {
        defpackage.xfs xkyVar;
        android.content.Context applicationContext = ((android.content.Context) aa$.ExternalSyntheticApiModelOutline1.m(this.k)).getApplicationContext();
        aooh.e(applicationContext, "getApplicationContext(...)");
        defpackage.xme xmeVar = (defpackage.xme) G().get(new defpackage.xia(erasedOnboardingTaskToken));
        defpackage.xkq xkqVar = xmeVar != null ? xmeVar.a : null;
        j$.util.Objects.checkIndex(0, 3);
        if (xkqVar == null) {
            xkyVar = new defpackage.xky(null, 3);
        } else if (xkqVar instanceof defpackage.xmd) {
            xkyVar = ((defpackage.xmd) xkqVar).d().c();
        } else if (xkqVar instanceof defpackage.xnd) {
            xkyVar = i;
        } else {
            xkyVar = new defpackage.xky(null, 3);
        }
        aooh.f(applicationContext, "context");
        aooh.f(xkyVar, "allowedCallers");
        aooh.f(applicationContext, "context");
        aooh.f(xkyVar, "allowedCallers");
        if (i2 == android.os.Process.myUid() || ajsz.cY(xkyVar.b(), "allow_all")) {
            return;
        }
        java.lang.String[] packagesForUid = applicationContext.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid == null) {
            packagesForUid = new java.lang.String[0];
        }
        if (packagesForUid.length != 0) {
            xkyVar.a();
            java.util.Set setCf = ajsz.cf(new java.util.ArrayList(0));
            if (!(setCf instanceof java.util.Collection) || !setCf.isEmpty()) {
                java.util.Iterator it = setCf.iterator();
                while (it.hasNext()) {
                    if (ajsz.cY(packagesForUid, (java.lang.String) it.next())) {
                        return;
                    }
                }
            }
            if (ajsz.cY(xkyVar.b(), "allow_default")) {
                aaco aacoVarA = aaco.a(applicationContext);
                aooh.e(aacoVarA, "getInstance(...)");
                for (java.lang.String str : packagesForUid) {
                    if (aacoVarA.b(str)) {
                        return;
                    }
                }
            }
        } else {
            defpackage.xox.e("GmsTaskPermissionMgr", "Caller cannot be identified.");
        }
        throw new java.lang.SecurityException("Caller is unauthorized to call " + applicationContext.getPackageName() + " to run or access tasks");
    }

    @Override // defpackage.xlu
    public final void p(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, android.os.PersistableBundle persistableBundle) {
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(persistableBundle, "reason");
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (((defpackage.xpz) objM).e(429537734L)) {
            apbj apbjVar = this.m;
            aoov.ah(apbjVar.a, new defpackage.xla(this, erasedOnboardingTaskToken, callingUid, persistableBundle, (aoln) null, 0));
        } else {
            o(erasedOnboardingTaskToken, callingUid);
            defpackage.xfz xfzVar = defpackage.xfz.USER_CANCELLED;
            H("interrupt", new defpackage.uhy(erasedOnboardingTaskToken, defpackage.xer.d(persistableBundle), this, persistableBundle, (aoln) null, 3));
        }
    }

    @Override // defpackage.xlu
    public final void q(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, defpackage.xlw xlwVar) {
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(xlwVar, "listener");
        java.util.function.Supplier supplier = this.c;
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        aooh.e(objM, "get(...)");
        if (((defpackage.xpz) objM).e(429537734L)) {
            H("listenForTaskMetadataChanges", new defpackage.xkz(this, erasedOnboardingTaskToken, callingUid, xlwVar, (aoln) null, 3));
        } else {
            o(erasedOnboardingTaskToken, callingUid);
            H("listenForTaskMetadataChanges", new defpackage.vpw(this, erasedOnboardingTaskToken, xlwVar, (aoln) null, 2));
        }
    }

    @Override // defpackage.xlu
    public final void r(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, defpackage.xlw xlwVar) {
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(xlwVar, "listener");
        java.util.function.Supplier supplier = this.c;
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        aooh.e(objM, "get(...)");
        if (((defpackage.xpz) objM).e(429537734L)) {
            H("waitForCompleted", new defpackage.xla(this, erasedOnboardingTaskToken, callingUid, xlwVar, (aoln) null, 3));
            return;
        }
        java.util.Objects.toString(erasedOnboardingTaskToken);
        defpackage.xox.b("OTMServiceBinder", "waitForCompleted token=".concat(java.lang.String.valueOf(erasedOnboardingTaskToken)));
        o(erasedOnboardingTaskToken, callingUid);
        H("waitForCompleted", new defpackage.xlg(this, erasedOnboardingTaskToken, xlwVar, null));
    }

    public boolean s(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, android.os.PersistableBundle persistableBundle) {
        defpackage.xmb xmbVarA;
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(persistableBundle, "bundle");
        defpackage.xox.b("OTMServiceBinder", a.bF((byte) 93, erasedOnboardingTaskToken, "startTask["));
        int callingUid = android.os.Binder.getCallingUid();
        java.util.function.Supplier supplier = this.c;
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        aooh.e(objM, "get(...)");
        if (((defpackage.xpz) objM).e(429537734L)) {
            return ((java.lang.Boolean) aoov.ah(this.m.a, new defpackage.xla(this, erasedOnboardingTaskToken, callingUid, persistableBundle, null, 2, null))).booleanValue();
        }
        o(erasedOnboardingTaskToken, callingUid);
        android.os.PersistableBundle persistableBundleB = b(persistableBundle);
        try {
            aooh.f(erasedOnboardingTaskToken, "token");
            defpackage.xme xmeVar = (defpackage.xme) G().get(new defpackage.xia(erasedOnboardingTaskToken));
            if (xmeVar != null) {
                xmbVarA = xmeVar.a();
                defpackage.xox.b("OTMServiceBinder", a.bi(xmbVarA, erasedOnboardingTaskToken, "createTaskInstance token=", " task="));
                if (xmbVarA.l()) {
                    defpackage.xox.g("OTMServiceBinder", a.bg(xmbVarA, "Task (", ") was already created. Please don't reuse the same task instance."));
                    xmbVarA = null;
                } else {
                    aooh.f(xmbVarA, "task");
                    this.g.g(xmbVarA, erasedOnboardingTaskToken);
                    defpackage.xmw xmwVar = this.f;
                    xmwVar.l(erasedOnboardingTaskToken);
                    xmwVar.j(erasedOnboardingTaskToken, xmbVarA);
                }
            } else {
                xmbVarA = null;
            }
            if (xmbVarA == null) {
                defpackage.xox.e("OTMServiceBinder", a.bg(erasedOnboardingTaskToken, "Task for node ", " not found!"));
                this.f.m(erasedOnboardingTaskToken, defpackage.xhp.g(erasedOnboardingTaskToken, erasedOnboardingTaskToken.d(), new defpackage.xhm("Task cannot be found."), defpackage.xmn.UNSPECIFIED));
                u(erasedOnboardingTaskToken, this.f.c(erasedOnboardingTaskToken), null);
                return false;
            }
            aooh.f(erasedOnboardingTaskToken, "token");
            aooh.f(persistableBundleB, "input");
            defpackage.xox.d("OTMServiceBinder", a.bF((byte) 93, xmbVarA, "startLocalTask["));
            java.lang.Object objM2 = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
            aooh.e(objM2, "get(...)");
            if (((defpackage.xpz) objM2).e(394763768L) && defpackage.xff.h(persistableBundleB)) {
                throw new java.lang.IllegalStateException("Cannot run task with a pending bundle.");
            }
            defpackage.xmx xmxVarD = defpackage.xfc.d(erasedOnboardingTaskToken, xmbVarA.a());
            defpackage.xmw xmwVar2 = this.f;
            xmwVar2.m(erasedOnboardingTaskToken, new defpackage.xmo(xmxVarD));
            xmwVar2.i(erasedOnboardingTaskToken, aoov.am(this.m, 0, new defpackage.yud(this, xmbVarA, xmxVarD, persistableBundleB, this.l.b(), (aoln) null, 1), 3));
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.w("AndroidOnboarding", "OTMServiceBinder", new java.lang.IllegalStateException(e));
        }
    }

    @Override // defpackage.xlu
    public final byte[] t(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i2, int i3, int i4) {
        byte[] bArr;
        aooh.f(erasedOnboardingTaskToken, "token");
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (!((defpackage.xpz) objM).e(394763768L)) {
            defpackage.xox.e("OTMServiceBinder", "Feature SEND_LARGE_DATA_IN_CHUNKS_CHANGE_ID is not enabled.");
            return new byte[0];
        }
        o(erasedOnboardingTaskToken, android.os.Binder.getCallingUid());
        defpackage.xox.b("OTMServiceBinder", "Fetching data chunk. id=" + i2 + " [" + (i3 + 1) + '/' + i4 + ']');
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.xow.a;
        java.util.List list = (java.util.List) defpackage.xow.b.get(java.lang.Integer.valueOf(i2));
        if (list == null || (bArr = (byte[]) list.get(i3)) == null) {
            throw new java.lang.IllegalStateException("can't fetch data chunk");
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // defpackage.xlu
    public final boolean w(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i2, byte[] bArr, int i3, int i4) {
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(bArr, "chunk");
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.c);
        aooh.e(objM, "get(...)");
        if (!((defpackage.xpz) objM).e(394763768L)) {
            defpackage.xox.e("OTMServiceBinder", "Feature SEND_LARGE_DATA_IN_CHUNKS_CHANGE_ID is not enabled.");
            return false;
        }
        o(erasedOnboardingTaskToken, android.os.Binder.getCallingUid());
        defpackage.xox.b("OTMServiceBinder", "sendDataChunk#[" + erasedOnboardingTaskToken + "] Receiving data chunk of id=" + i2 + " chunk[" + (i3 + 1) + '/' + i4 + ']');
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.xow.a;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = defpackage.xow.b;
        ?? arrayList = (java.util.List) concurrentHashMap2.get(java.lang.Integer.valueOf(i2));
        if (arrayList == 0) {
            arrayList = new java.util.ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(new byte[0]);
            }
        }
        arrayList.set(i3, bArr);
        concurrentHashMap2.put(java.lang.Integer.valueOf(i2), arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((byte[]) obj).length != 0) {
                arrayList2.add(obj);
            }
        }
        boolean z = arrayList2.size() == i4;
        if (z) {
            android.os.PersistableBundle persistableBundleF = defpackage.xff.f(arrayList);
            defpackage.xox.b("OTMServiceBinder", "Received full data of id=" + i2 + " sizeInBytes=" + defpackage.xfh.f(persistableBundleF));
            defpackage.xow.a(i2).Q(persistableBundleF);
        }
        return z;
    }

    @Override // defpackage.xlu
    public final void y(defpackage.xoc xocVar, defpackage.xod xodVar) {
        aooh.f(xocVar, "token");
        aooh.f(xodVar, "callback");
        H("awaitTaskCompletionAsync", new defpackage.xkz(xocVar, this, android.os.Binder.getCallingUid(), xodVar, (aoln) null, 1, (byte[]) null));
    }

    @Override // defpackage.xlu
    public final void z(defpackage.xoc xocVar, defpackage.xod xodVar) {
        aooh.f(xocVar, "token");
        aooh.f(xodVar, "callback");
        H("getTaskMetadataAsync", new defpackage.xkz(xocVar, this, android.os.Binder.getCallingUid(), xodVar, (aoln) null, 0));
    }
}
