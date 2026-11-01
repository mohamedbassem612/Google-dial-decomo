package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xkq implements defpackage.xke, defpackage.xhh {
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public xkq() {
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    public abstract boolean c(defpackage.xfz xfzVar);

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        return defpackage.xhp.f(this);
    }

    @Override // defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfc.b(this);
    }
}
