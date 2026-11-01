package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public final class xkx extends defpackage.xlk implements java.lang.AutoCloseable, defpackage.xhu {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ defpackage.xhs g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkx(defpackage.xhu xhuVar, aolr aolrVar, defpackage.xon xonVar, defpackage.xpz xpzVar, defpackage.xhe xheVar) {
        super(aolrVar, xpzVar, xheVar);
        aooh.f(xhuVar, "component");
        aooh.f(aolrVar, "coroutineContext");
        aooh.f(xonVar, "localServer");
        aooh.f(xpzVar, "onboardingChanges");
        this.g = xhuVar.asComponentRef();
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.g.getNodeComponent();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return this.g.getNodePackage();
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    @Override // defpackage.xhu
    public final java.lang.String identity() {
        throw null;
    }
}
