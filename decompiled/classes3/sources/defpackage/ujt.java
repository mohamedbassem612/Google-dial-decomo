package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujt implements defpackage.ucs {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ujt(aosb aosbVar, int i) {
        this.$cid = i;
        this.a = aosbVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoln, aosb, java.lang.Object] */
    @Override // defpackage.ucs
    public final void a(boolean z) {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i != 0) {
            ((dsd) r1).b(java.lang.Boolean.valueOf(z));
        } else if (r1.h()) {
            r1.w(java.lang.Boolean.valueOf(z));
        }
    }

    public /* synthetic */ ujt(dsd dsdVar, int i) {
        this.$cid = i;
        this.a = dsdVar;
    }
}
