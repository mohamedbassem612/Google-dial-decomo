package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsk implements aaug {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ahsk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aoln, aosb, java.lang.Object] */
    public final void a(aaum aaumVar) {
        if (this.$cid != 0) {
            ?? r1 = this.a;
            if (r1.h()) {
                if (aaumVar.k()) {
                    r1.w(new aoiw(aojh.a));
                    return;
                }
                java.lang.Throwable thF = aaumVar.f();
                if (thF == null) {
                    thF = new java.io.IOException("Failed to log audit");
                }
                r1.w(new aoiw(aooc.ae(thF)));
                return;
            }
            return;
        }
        if (aaumVar.k()) {
            ((dsd) this.a).b(aaumVar.g());
            return;
        }
        java.lang.Exception excF = aaumVar.f();
        java.lang.Object obj = this.a;
        if (excF != null) {
            ((dsd) obj).d(aaumVar.f());
        } else {
            ((dsd) obj).d(new java.lang.Exception("Task failed with unknown result"));
        }
    }
}
