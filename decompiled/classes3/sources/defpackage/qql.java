package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qql {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/service/FullscreenController");
    public final defpackage.puu c;
    public final defpackage.puw d;
    private final ajcu e;
    private final android.view.accessibility.AccessibilityManager f;
    private final defpackage.qqm g;
    private final aoin j;
    private final defpackage.pvr k;
    private final defpackage.ptx l;
    private final zpz m;
    public final defpackage.put b = new defpackage.pvp(this, 5);
    private final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public qql(ajcu ajcuVar, android.view.accessibility.AccessibilityManager accessibilityManager, defpackage.pvr pvrVar, defpackage.ptx ptxVar, defpackage.qqm qqmVar, zpz zpzVar, aoin aoinVar) {
        int i = 2;
        this.c = new defpackage.qpi(this, i);
        this.d = new defpackage.qpj(this, i);
        this.e = ajcuVar;
        this.f = accessibilityManager;
        this.k = pvrVar;
        this.l = ptxVar;
        this.g = qqmVar;
        this.m = zpzVar;
        this.j = aoinVar;
    }

    private final void d(j$.util.Optional optional) {
        j$.util.Optional optional2 = (j$.util.Optional) this.i.getAndSet(optional);
        if (true == optional2.isPresent()) {
            ajcs ajcsVar = (ajcs) optional2.get();
            a.b().l("com/android/dialer/incall/video/service/FullscreenController", "setAutoEnterFuture", 149, "FullscreenController.java").v("timer for auto fullscreen will be canceled");
            ajcsVar.cancel(false);
        }
    }

    private final void e() {
        d(j$.util.Optional.empty());
    }

    public final void a() {
        e();
        aimz aimzVar = a;
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/video/service/FullscreenController", "isAutoFullscreenEnabled", 130, "FullscreenController.java");
        defpackage.ptx ptxVar = this.l;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(ptxVar.m());
        defpackage.pvr pvrVar = this.k;
        defpackage.zcy zcyVarA = pvrVar.a();
        defpackage.zcy zcyVar = defpackage.zcy.b;
        boolean z = zcyVarA == zcyVar;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f;
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z);
        java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(accessibilityManager.isEnabled());
        java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled());
        defpackage.qqm qqmVar = this.g;
        aimwVarL.O("isActiveVideo: %b, bidirectional: %b, accessibilityManager.isEnabled: %b, isTouchExplorationEnabled: %b, isDialogShowing: %b", boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, java.lang.Boolean.valueOf(qqmVar.b()));
        if (!ptxVar.m() || pvrVar.a() != zcyVar || accessibilityManager.isEnabled() || accessibilityManager.isTouchExplorationEnabled() || qqmVar.b()) {
            aimzVar.b().l("com/android/dialer/incall/video/service/FullscreenController", "resetAutoFullscreenTimer", 107, "FullscreenController.java").v("auto fullscreen mode is disabled");
            return;
        }
        aimzVar.b().l("com/android/dialer/incall/video/service/FullscreenController", "resetAutoFullscreenTimer", 110, "FullscreenController.java").v("set timer for auto fullscreen");
        ajcs ajcsVarB = this.e.b(ahqx.h(new defpackage.pmx(this, 18)), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        agsm.i(644, ajcsVarB, "auto fullscreen timer", new java.lang.Object[0]);
        d(j$.util.Optional.of(ajcsVarB));
    }

    public final void b(boolean z) {
        if (this.h.getAndSet(z) != z) {
            defpackage.pgi pgiVar = (defpackage.pgi) this.j.a();
            ((java.util.concurrent.atomic.AtomicBoolean) pgiVar.a).set(z);
            java.lang.Object obj = pgiVar.b;
            ajcq ajcqVar = ajcm.a;
            ((zpz) obj).a(ajcqVar);
            this.m.a(ajcqVar);
        }
        if (z) {
            e();
        } else {
            a();
        }
    }

    public final boolean c() {
        return this.h.get();
    }
}
