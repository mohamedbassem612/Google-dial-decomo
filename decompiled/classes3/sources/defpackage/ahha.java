package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahha implements eoe {
    private final /* synthetic */ int $cid;

    public ahha(int i) {
        this.$cid = i;
    }

    public final eoa a(java.lang.Class cls) {
        if (this.$cid != 0) {
            return new epf();
        }
        ahvr.bN(defpackage.ahgw.class.equals(cls), "This ViewModelProvider.Factory only supports LifecycleMemoizingObserver.");
        return new defpackage.ahgw();
    }

    public final /* synthetic */ eoa b(java.lang.Class cls, eoq eoqVar) {
        return this.$cid != 0 ? enn.e(this, cls) : enn.e(this, cls);
    }

    public final /* synthetic */ eoa c(aopu aopuVar, eoq eoqVar) {
        return this.$cid != 0 ? enn.c(this, aopuVar, eoqVar) : enn.c(this, aopuVar, eoqVar);
    }
}
