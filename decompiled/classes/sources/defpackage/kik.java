package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kik implements defpackage.rnt {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/mainscreenintegration/CallLogMainFragmentLifecycleObserver");
    private final defpackage.kew b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.zzx f;

    public kik(defpackage.kew kewVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallLogInCompose");
        }
        this.b = kewVar;
        this.f = zzxVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [aoss, java.lang.Object] */
    @Override // defpackage.emj
    public final void a(defpackage.emx emxVar) {
        defpackage.az azVarG;
        if (this.f.m()) {
            ((defpackage.aimw) a.b().l("com/android/dialer/calllog/mainscreenintegration/CallLogMainFragmentLifecycleObserver", "onCreate", 43, "CallLogMainFragmentLifecycleObserver.kt")).v("not loading data in direct boot mode");
            return;
        }
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                defpackage.aw awVar = emxVar instanceof defpackage.aw ? (defpackage.aw) emxVar : null;
                android.content.Intent intent = (awVar == null || (azVarG = awVar.G()) == null) ? null : azVarG.getIntent();
                if (intent != null && (defpackage.ttj.S(intent) || (defpackage.ttj.T(intent) && intent.getIntExtra("EXTRA_SHOW_TAB", -1) != 1))) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/calllog/mainscreenintegration/CallLogMainFragmentLifecycleObserver", "onCreate", 50, "CallLogMainFragmentLifecycleObserver.kt")).v("not prewarming call log data when launching into another screen");
                    return;
                }
            }
            defpackage.kgl kglVar = (defpackage.kgl) this.e.a();
            defpackage.aoov.an(kglVar.c, null, 0, new defpackage.dgz(kglVar, (defpackage.aoln) null, 17), 3);
            return;
        }
        defpackage.kew kewVar = this.b;
        defpackage.aimz aimzVar = defpackage.kew.a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "loadInitialUiModel", 41, "CallLogFragmentDataService.kt")).v("loadInitialUiModel");
        kgq kgqVar = new kgq(kewVar, 1);
        java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) kewVar.d.a;
        java.lang.Object obj = atomicReference.get();
        defpackage.kez kezVar = defpackage.kez.a;
        if (defpackage.aooh.n(obj, kezVar) && defpackage.anty.Q(atomicReference, kezVar, new kfb((defpackage.ajcq) kgqVar.a()))) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "loadInitialUiModel", 48, "CallLogFragmentDataService.kt")).v("initialUiModel set and stared loading");
        }
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void fn(defpackage.emx emxVar) {
    }
}
