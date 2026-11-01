package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xfp extends or implements defpackage.xkf, defpackage.xib, defpackage.xhg {
    private static final java.lang.String TAG = "OnboardingApiContract";
    public static final long UNKNOWN_NODE = -1;
    private defpackage.xfq resultRedirectionConfig;
    public static final defpackage.xff Companion = new defpackage.xff();
    private static final java.util.Map waitingForResumeActivity = new java.util.LinkedHashMap();
    private final aoir metadata$delegate = aooc.ag(new defpackage.wsn(this, 3));
    private final aoir nodeComponent$delegate = aooc.ag(new defpackage.wsn(this, 4));
    private final aoir nodeName$delegate = aooc.ag(new defpackage.wsn(this, 5));
    private final defpackage.xhf resultDecoder = new defpackage.xfe(this, 1);
    private final defpackage.xhf resultEncoder = new defpackage.xfe(this, 0);
    private final defpackage.xfk launcher = new defpackage.xfk(this);

    public static /* synthetic */ defpackage.xfb attach$default(defpackage.xfp xfpVar, android.app.Activity activity, ems emsVar, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attach");
        }
        if ((i & 4) != 0) {
            intent = activity.getIntent();
            aooh.e(intent, "getIntent(...)");
        }
        return xfpVar.attach(activity, emsVar, intent);
    }

    private final defpackage.xip intentToIntentData(android.content.Intent intent) {
        aola aolaVar = new aola(8);
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            for (java.lang.String str : extras.keySet()) {
                aooh.c(str);
                aolaVar.put(str, extras.get(str));
            }
        }
        return new defpackage.xip(intent.getAction(), aolaVar.e());
    }

    public static /* synthetic */ boolean isActivityAvailable$default(defpackage.xfp xfpVar, android.content.Context context, java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isActivityAvailable");
        }
        if ((i2 & 4) != 0) {
            i = 65536;
        }
        return xfpVar.isActivityAvailable(context, obj, i);
    }

    public static final com.android.onboarding.contracts.annotations.OnboardingNode metadata_delegate$lambda$0(defpackage.xfp xfpVar) {
        com.android.onboarding.contracts.annotations.OnboardingNode onboardingNode = (com.android.onboarding.contracts.annotations.OnboardingNode) xfpVar.getClass().getAnnotation(com.android.onboarding.contracts.annotations.OnboardingNode.class);
        if (onboardingNode != null) {
            return onboardingNode;
        }
        java.lang.Class<?> cls = xfpVar.getClass();
        aopu[] aopuVarArr = aoou.a;
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(new aooa(cls).b()).concat(" is missing OnboardingNode annotation"));
    }

    public static /* synthetic */ defpackage.xfh prepareResult$default(defpackage.xfp xfpVar, aonj aonjVar, aono aonoVar, aonj aonjVar2, java.lang.Object obj, aonn aonnVar, defpackage.xfq xfqVar, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareResult");
        }
        if ((i & 32) != 0) {
            xfqVar = xfpVar.resultRedirectionConfig;
        }
        return xfpVar.prepareResult(aonjVar, aonoVar, aonjVar2, obj, aonnVar, xfqVar);
    }

    static final java.lang.Object resultDecoder$lambda$0(defpackage.xfp xfpVar, androidx.activity.result.ActivityResult activityResult) {
        aooh.f(activityResult, "it");
        return xfpVar.performParseResult(activityResult);
    }

    public static /* synthetic */ boolean validate$default(defpackage.xfp xfpVar, android.app.Activity activity, ems emsVar, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
        }
        if ((i & 4) != 0) {
            intent = activity.getIntent();
            aooh.e(intent, "getIntent(...)");
        }
        return xfpVar.validate(activity, emsVar, intent);
    }

    private final boolean validateInternal(android.content.Intent intent) {
        java.lang.Object objAe;
        defpackage.xix xixVar = defpackage.xjb.c;
        long jC = defpackage.xhp.c(intent);
        defpackage.xip xipVarIntentToIntentData = intentToIntentData(intent);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xio(asNodeRef(), jC, xipVarIntentToIntentData, instantNow));
        try {
            objAe = extractArgument(intent);
        } catch (java.lang.Throwable th) {
            objAe = aooc.ae(th);
        }
        java.lang.Throwable thC = aoiw.c(objAe);
        if (thC != null) {
            defpackage.xix xixVar2 = defpackage.xjb.c;
            long jC2 = defpackage.xhp.c(intent);
            defpackage.xip xipVarIntentToIntentData2 = intentToIntentData(intent);
            j$.time.Instant instantNow2 = j$.time.Instant.now();
            aooh.e(instantNow2, "now(...)");
            aooh.f(instantNow2, "timestamp");
            xixVar2.a(new defpackage.xih(asNodeRef(), jC2, thC, xipVarIntentToIntentData2, instantNow2));
        }
        if (aoiw.d(objAe)) {
            objAe = java.lang.Boolean.TRUE;
        }
        boolean z = objAe instanceof aoiv;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (true == z) {
            objAe = bool;
        }
        return ((java.lang.Boolean) objAe).booleanValue();
    }

    @Override // defpackage.xhu
    public /* synthetic */ defpackage.xhs asComponentRef() {
        return new defpackage.xht(getNodeComponent());
    }

    @Override // defpackage.xib
    public /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final defpackage.xfb attach(aomy aomyVar, aomy aomyVar2, emx emxVar, android.content.Intent intent, nf nfVar) {
        ems emsVarP;
        aooh.f(aomyVar, "componentName");
        aooh.f(aomyVar2, "isFinishing");
        aooh.f(intent, "intent");
        if (emxVar != null && nfVar != null && getMetadata().e().a() == defpackage.xfv.DISABLED) {
            defpackage.xox.b(TAG, "Automatically disabling back button due to backButtonBehavior metadata");
            nfVar.d(emxVar, new defpackage.xfj());
        }
        boolean zValidateInternal = validateInternal(intent);
        if (emxVar != null && (emsVarP = emxVar.P()) != null) {
            emsVarP.c(new defpackage.xfg(aomyVar, intent, aomyVar2, this));
        }
        return new defpackage.xfb(zValidateInternal);
    }

    public final android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        defpackage.xkb xkbVarLauncher = launcher(obj);
        aooh.f(context, "context");
        android.content.Intent intentA = xkbVarLauncher.a(context, obj);
        long jA = defpackage.xhp.a(context);
        long j = xkbVarLauncher.d;
        if (j != -1) {
            aooh.c(intentA.putExtra("com.android.onboarding.ONBOARDING_NODE_ID", j));
        } else {
            xkbVarLauncher.d = intentA.getLongExtra("com.android.onboarding.ONBOARDING_NODE_ID", -1L);
            defpackage.xox.a(xkbVarLauncher.b, "COMPLIANCE: getSynchronousResult was not called when creating intent.");
        }
        defpackage.xix xixVar = defpackage.xjb.c;
        long j2 = xkbVarLauncher.d;
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        if (xkbVarLauncher == null) {
            aooh.i("nodeRef");
        }
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xid(xkbVarLauncher.asNodeRef(), jA, j2, obj, instantNow));
        xkbVarLauncher.d = -1L;
        return intentA;
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final androidx.activity.result.ActivityResult executePerformSetResult(java.lang.Object obj) {
        return performSetResult(obj);
    }

    public final java.lang.Object extractArgument(android.content.Intent intent) {
        aooh.f(intent, "intent");
        defpackage.xix xixVar = defpackage.xjb.c;
        long jC = defpackage.xhp.c(intent);
        defpackage.xip xipVarIntentToIntentData = intentToIntentData(intent);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xif(asNodeRef(), jC, xipVarIntentToIntentData, instantNow));
        defpackage.xer xerVar = defpackage.xfq.a;
        aooh.f(intent, "<this>");
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_redirection_config");
        this.resultRedirectionConfig = (defpackage.xfq) (bundleExtra != null ? xerVar.c(defpackage.xfh.p(bundleExtra, null)) : null);
        java.lang.Object objPerformExtractArgument = performExtractArgument(intent);
        long jC2 = defpackage.xhp.c(intent);
        j$.time.Instant instantNow2 = j$.time.Instant.now();
        aooh.e(instantNow2, "now(...)");
        aooh.f(instantNow2, "timestamp");
        xixVar.a(new defpackage.xic(asNodeRef(), jC2, objPerformExtractArgument, instantNow2));
        return objPerformExtractArgument;
    }

    public final com.android.onboarding.contracts.annotations.OnboardingNode getMetadata() {
        return (com.android.onboarding.contracts.annotations.OnboardingNode) this.metadata$delegate.a();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return (java.lang.String) this.nodeComponent$delegate.a();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return (java.lang.String) this.nodeName$delegate.a();
    }

    @Override // defpackage.xhu
    public /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhi
    public final defpackage.xhf getResultDecoder() {
        return this.resultDecoder;
    }

    @Override // defpackage.xhj
    public final defpackage.xhf getResultEncoder() {
        return this.resultEncoder;
    }

    @Override // defpackage.xhu
    public /* synthetic */ java.lang.String getSubcomponent() {
        return defpackage.xhp.f(this);
    }

    public final oq getSynchronousResult(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        defpackage.xkb xkbVarLauncher = launcher(obj);
        aooh.f(context, "context");
        long jA = defpackage.xhp.a(context);
        xkbVarLauncher.d = java.util.UUID.randomUUID().getLeastSignificantBits();
        defpackage.xix xixVar = defpackage.xjb.c;
        long j = xkbVarLauncher.d;
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        if (xkbVarLauncher == null) {
            aooh.i("nodeRef");
        }
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xin(xkbVarLauncher.asNodeRef(), jA, j, obj, instantNow));
        oq oqVarB = xkbVarLauncher.b(context, obj);
        if (oqVarB != null) {
            long j2 = xkbVarLauncher.d;
            j$.time.Instant instantNow2 = j$.time.Instant.now();
            aooh.e(instantNow2, "now(...)");
            if (xkbVarLauncher == null) {
                aooh.i("nodeRef");
            }
            java.lang.Object obj2 = oqVarB.a;
            aooh.f(instantNow2, "timestamp");
            xixVar.a(new defpackage.xie(xkbVarLauncher.asNodeRef(), j2, obj2, instantNow2));
        }
        return oqVarB;
    }

    public /* synthetic */ int getTargetUserId(java.lang.Object obj) {
        return android.os.Process.myUid() / 100000;
    }

    @Override // defpackage.xib, defpackage.xhu
    public /* synthetic */ java.lang.String identity() {
        return defpackage.xfc.b(this);
    }

    public boolean isActivityAvailable(android.content.Context context, java.lang.Object obj, int i) {
        aooh.f(context, "context");
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(createIntent(context, obj), i);
        aooh.e(listQueryIntentActivities, "queryIntentActivities(...)");
        return !listQueryIntentActivities.isEmpty();
    }

    public final java.lang.Object parseResult(int i, android.content.Intent intent) {
        long jC = intent != null ? defpackage.xhp.c(intent) : -1L;
        defpackage.xfk xfkVar = this.launcher;
        java.lang.Object objPerformParseResult = xfkVar.a.performParseResult(new androidx.activity.result.ActivityResult(i, intent));
        defpackage.xix xixVar = defpackage.xjb.c;
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        if (xfkVar == null) {
            aooh.i("nodeRef");
        }
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xij(new defpackage.xia(xfkVar), jC, objPerformParseResult, instantNow));
        if (objPerformParseResult instanceof defpackage.xfd) {
            xixVar.a(new defpackage.xig(jC, objPerformParseResult.toString()));
        }
        return objPerformParseResult;
    }

    protected abstract android.content.Intent performCreateIntent(android.content.Context context, java.lang.Object obj);

    protected abstract java.lang.Object performExtractArgument(android.content.Intent intent);

    protected oq performGetSynchronousResult(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        return null;
    }

    public abstract java.lang.Object performParseResult(androidx.activity.result.ActivityResult activityResult);

    public abstract androidx.activity.result.ActivityResult performSetResult(java.lang.Object obj);

    public final com.android.onboarding.pending.PendingContract$Activity prepare(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        com.android.onboarding.pending.PendingActivityContract pendingActivityContract = new com.android.onboarding.pending.PendingActivityContract(performCreateIntent(context, obj));
        java.lang.String nodeComponent = getNodeComponent();
        aooh.f(nodeComponent, "value");
        com.android.onboarding.utils.persistable.PersistableIntent persistableIntent = pendingActivityContract.a;
        persistableIntent.b.putString("com.android.onboarding.pending.COMPONENT", nodeComponent);
        java.lang.String nodeName = getNodeName();
        aooh.f(nodeName, "value");
        persistableIntent.b.putString("com.android.onboarding.pending.NODE", nodeName);
        persistableIntent.b.putLong("com.android.onboarding.pending.CREATOR_ID", defpackage.xhp.a(context));
        persistableIntent.b.putInt("com.android.onboarding.pending.TARGET_USER_ID", getTargetUserId(obj));
        com.android.onboarding.pending.PendingActivityContract.Resolved resolved = new com.android.onboarding.pending.PendingActivityContract.Resolved(pendingActivityContract);
        com.android.onboarding.pending.PendingActivityContract pendingActivityContract2 = resolved.a;
        defpackage.xix xixVar = defpackage.xjb.c;
        long j = pendingActivityContract2.a.b.getLong("com.android.onboarding.pending.CREATOR_ID", -1L);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xiu(asNodeRef(), j, obj, instantNow));
        return resolved;
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final defpackage.xfh prepareResult(aonj aonjVar, aono aonoVar, aonj aonjVar2, java.lang.Object obj, aonn aonnVar, defpackage.xfq xfqVar) {
        aooh.f(aonjVar, "getNodeId");
        aooh.f(aonoVar, "setResult");
        aooh.f(aonjVar2, "finish");
        aooh.f(aonnVar, "registerForActivityLaunch");
        return new defpackage.xfh(aonjVar, aonoVar, aonjVar2, aonnVar);
    }

    public final void setResult$third_party_java_android_onboarding_java_com_android_onboarding_contracts_contracts(long j, aonn aonnVar, java.lang.Object obj) {
        aooh.f(aonnVar, "setResult");
        defpackage.xix xixVar = defpackage.xjb.c;
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xim(asNodeRef(), j, obj, instantNow));
        if (obj instanceof defpackage.xfd) {
            xixVar.a(new defpackage.xig(j, obj.toString()));
        }
        androidx.activity.result.ActivityResult activityResultPerformSetResult = performSetResult(obj);
        android.content.Intent intent = activityResultPerformSetResult.b;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("com.android.onboarding.ONBOARDING_NODE_ID", j);
        aonnVar.a(java.lang.Integer.valueOf(activityResultPerformSetResult.a), intent);
    }

    public final boolean validate(android.app.Activity activity, ems emsVar, android.content.Intent intent) {
        aooh.f(activity, "activity");
        aooh.f(intent, "intent");
        boolean zValidateInternal = validateInternal(intent);
        if (emsVar != null) {
            aooh.f(activity, "activity");
            aooh.f(intent, "intent");
            emsVar.c(new defpackage.xfg(new defpackage.uon(activity, 5, (boolean[]) null), intent, new defpackage.uon(activity, 6, (float[]) null), this));
        }
        return zValidateInternal;
    }

    /* JADX INFO: renamed from: toActivityResultContract, reason: collision with other method in class */
    public final defpackage.xfp m57toActivityResultContract() {
        return this;
    }

    public defpackage.xkb launcher(java.lang.Object obj) {
        return this.launcher;
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    private static /* synthetic */ void getLauncher$annotations() {
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    public /* bridge */ /* synthetic */ or toActivityResultContract() {
        return this;
    }

    public final defpackage.xfh prepareResult(java.lang.Object obj) {
        return prepareResult$default(this, new aoom() { // from class: xfl
            public final java.lang.Object b(java.lang.Object obj2) {
                return java.lang.Long.valueOf(defpackage.xhp.b((android.app.Activity) obj2));
            }
        }, defpackage.xfm.a, defpackage.xfn.a, obj, defpackage.xfo.a, null, 32, null);
    }

    public static /* synthetic */ defpackage.xfb attach$default(defpackage.xfp xfpVar, mp mpVar, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attach");
        }
        if ((i & 2) != 0) {
            intent = mpVar.getIntent();
            aooh.e(intent, "getIntent(...)");
        }
        return xfpVar.attach(mpVar, intent);
    }

    public static /* synthetic */ boolean validate$default(defpackage.xfp xfpVar, mp mpVar, android.content.Intent intent, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
        }
        if ((i & 2) != 0) {
            intent = mpVar.getIntent();
            aooh.e(intent, "getIntent(...)");
        }
        return xfpVar.validate(mpVar, intent);
    }

    public final boolean validate(mp mpVar, android.content.Intent intent) {
        aooh.f(mpVar, "activity");
        aooh.f(intent, "intent");
        return validate(mpVar, mpVar.P(), intent);
    }

    public final defpackage.xfb attach(mp mpVar, android.content.Intent intent) {
        aooh.f(mpVar, "activity");
        aooh.f(intent, "intent");
        return attach(new defpackage.uon(mpVar, 7, (byte[][]) null), new defpackage.uon(mpVar, 8, (char[][]) null), mpVar, intent, mpVar.fc());
    }

    public final defpackage.xfb attach(android.app.Activity activity, ems emsVar, android.content.Intent intent) {
        aooh.f(activity, "activity");
        aooh.f(intent, "intent");
        return attach(new defpackage.uon(activity, 9, (boolean[]) null), new defpackage.uon(activity, 10, (float[]) null), emsVar != null ? new defpackage.xfi(emsVar, 0) : null, intent, null);
    }

    public final void setResult$third_party_java_android_onboarding_java_com_android_onboarding_contracts_contracts(android.app.Activity activity, java.lang.Object obj) {
        aooh.f(activity, "activity");
        setResult$third_party_java_android_onboarding_java_com_android_onboarding_contracts_contracts(defpackage.xhp.b(activity), new gfw(activity, 6, (float[]) null), obj);
    }
}
