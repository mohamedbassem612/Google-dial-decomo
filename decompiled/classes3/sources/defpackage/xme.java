package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xme implements defpackage.xib {
    public final defpackage.xkq a;
    public final java.lang.Class b;
    private final aomy d;
    private final aoir e;
    private final java.util.concurrent.atomic.AtomicReference f;

    public xme(defpackage.xkq xkqVar, java.lang.Class cls, aomy aomyVar) {
        aooh.f(xkqVar, com.android.onboarding.config.WaitingScreenConfig.KEY_CONTRACT);
        aooh.f(cls, "taskClass");
        this.a = xkqVar;
        this.b = cls;
        this.d = aomyVar;
        this.e = aooc.ah(2, new defpackage.wsn(this, 18));
        this.f = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public final defpackage.xmb a() {
        defpackage.xmb xmbVar = (defpackage.xmb) this.d.a();
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f.getAndSet(new java.lang.ref.WeakReference(xmbVar));
        if ((weakReference != null ? (defpackage.xmb) weakReference.get() : null) == xmbVar) {
            defpackage.xox.g("OnboardingTaskFactory", "Factory for " + identity() + " returned the same task instance (" + xmbVar + ") twice. OnboardingTaskFactory must create a new instance on every call.");
        }
        if (!defpackage.xff.d(xmbVar, this)) {
            defpackage.xox.g("OnboardingTaskFactory", "Factory for " + identity() + " returned a task (" + xmbVar.getClass().getName() + ") implementing a different contract: " + new defpackage.xia(xmbVar) + '.');
        }
        boolean z = xmbVar instanceof defpackage.xmy;
        if (z != b()) {
            defpackage.xox.g("OnboardingTaskFactory", "Factory for " + identity() + " returned a task (" + xmbVar.getClass().getName() + ") with isSynchronous=" + z + " but declared task class " + this.b.getName() + " with isSynchronous=" + b() + ". Declare the concrete task class.");
        }
        return xmbVar;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return new defpackage.xia(this.a);
    }

    public final boolean b() {
        return ((java.lang.Boolean) this.e.a()).booleanValue();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.a.getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.a.getNodeName();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return defpackage.xhp.e(this.a);
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    @Override // defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return defpackage.xfc.b(this.a);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.b;
        return "OnboardingTaskFactory(ref=" + identity() + ", impl=" + cls.getName() + ')';
    }
}
