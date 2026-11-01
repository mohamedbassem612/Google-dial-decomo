package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkr implements defpackage.xpa, defpackage.xib {
    public static final defpackage.xer b = new defpackage.xer(9);
    public final /* synthetic */ defpackage.xhz a;
    private final boolean d;
    private final boolean e;
    private final defpackage.xgj f;
    private final int g;
    private final defpackage.xnq h;
    private final defpackage.xnp i;
    private final defpackage.xgo j;
    private final boolean k;

    public xkr(boolean z, boolean z2, defpackage.xgj xgjVar, int i, defpackage.xnq xnqVar, defpackage.xnp xnpVar, defpackage.xgo xgoVar, boolean z3) {
        this.a = defpackage.xhy.g(defpackage.xhy.j(xgjVar.a), xgjVar.b);
        this.d = z;
        this.e = z2;
        this.f = xgjVar;
        this.g = i;
        this.h = xnqVar;
        this.i = xnpVar;
        this.j = xgoVar;
        this.k = z3;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xkr) {
            defpackage.xkr xkrVar = (defpackage.xkr) obj;
            if (this.d == xkrVar.d && this.e == xkrVar.e && aooh.n(this.f, xkrVar.f) && this.g == xkrVar.g && aooh.n(this.h, xkrVar.h) && aooh.n(this.i, xkrVar.i) && aooh.n(this.j, xkrVar.j) && this.k == xkrVar.k) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return ((defpackage.xia) this.a).a;
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return ((defpackage.xia) this.a).b;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return defpackage.xhp.e(this.a);
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        int iL = (((anty.L(this.d) * 31) + anty.L(this.e)) * 31) + this.f.hashCode();
        defpackage.xnq xnqVar = this.h;
        int iHashCode = ((((iL * 31) + this.g) * 31) + (xnqVar == null ? 0 : xnqVar.hashCode())) * 31;
        defpackage.xnp xnpVar = this.i;
        int iHashCode2 = (iHashCode + (xnpVar == null ? 0 : xnpVar.hashCode())) * 31;
        defpackage.xgo xgoVar = this.j;
        return ((iHashCode2 + (xgoVar != null ? xgoVar.hashCode() : 0)) * 31) + anty.L(this.k);
    }

    @Override // defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return defpackage.xfc.b(this.a);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.i(persistableBundle, "ONBOARDING_NODE", this.f);
        persistableBundle.putInt("WORKER_ID", this.g);
        defpackage.xfh.i(persistableBundle, "USES_PRECALCULATION_RESULT", this.h);
        defpackage.xfh.i(persistableBundle, "PRECALCULATION", this.i);
        defpackage.xfh.i(persistableBundle, "HAS_TASK_ALTERNATIVE", this.j);
        persistableBundle.putBoolean("IS_TASK", this.d);
        persistableBundle.putBoolean("IS_ACTIVITY", this.e);
        persistableBundle.putBoolean("IS_CROSS_PROCESS_SYNCHRONOUS", this.k);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "ContractMetadata(isTask=" + this.d + ", isActivity=" + this.e + ", onboardingNode=" + this.f + ", workerId=" + this.g + ", usesPrecalculatedResult=" + this.h + ", precalculation=" + this.i + ", hasTaskAlternative=" + this.j + ", isCrossProcessSynchronous=" + this.k + ')';
    }
}
