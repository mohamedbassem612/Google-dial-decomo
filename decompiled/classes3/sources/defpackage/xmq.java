package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xmq implements defpackage.xnh {
    protected abstract defpackage.xib a();

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xnh
    public final /* synthetic */ com.android.onboarding.tasks.ErasedOnboardingTaskState c() {
        return defpackage.xfc.e(this);
    }

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return a().getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return a().getNodeName();
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    protected abstract java.lang.String i();

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    @Override // defpackage.xnh, defpackage.xpa
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putLong("com.android.onboarding.ONBOARDING_NODE_ID", d());
        persistableBundle.putString("com.android.onboarding.task.COMPONENT", getNodeComponent());
        persistableBundle.putString("com.android.onboarding.task.NODE", getNodeName());
        persistableBundle.putString("com.android.onboarding.task.TYPE", i());
        return persistableBundle;
    }
}
