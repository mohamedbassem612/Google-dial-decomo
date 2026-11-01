package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xly implements defpackage.xjz {
    public final android.content.Context a;
    public final defpackage.xmw b;
    public final aolr d;
    public final defpackage.xpz f;
    private final defpackage.xjz g;

    public xly(android.content.Context context, defpackage.xjz xjzVar, defpackage.xmw xmwVar, aolr aolrVar, defpackage.xpz xpzVar, defpackage.xkx xkxVar) {
        aooh.f(context, "applicationContext");
        aooh.f(aolrVar, "coroutineContext");
        aooh.f(xpzVar, "onboardingChanges");
        aooh.f(xkxVar, "onboardingTaskManager");
        this.a = context;
        this.g = xjzVar;
        this.b = xmwVar;
        this.d = aolrVar;
        this.f = xpzVar;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return this.g.asNodeRef();
    }

    @Override // defpackage.xhx
    public final long d() {
        return this.g.d();
    }

    @Override // defpackage.xjz
    public final defpackage.xjx f() {
        return this.g.f();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.g.getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.g.getNodeName();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return this.g.getNodePackage();
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return this.g.identity();
    }
}
