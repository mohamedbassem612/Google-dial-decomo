package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qpt implements defpackage.qub {
    private final /* synthetic */ int $cid;
    final java.lang.Object a;

    public qpt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.qub
    public final void b(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            throw new java.lang.AssertionError("Call recording snackbar message does not have action text.");
        }
        if (i == 1) {
            throw new java.lang.AssertionError("Call recording snackbar message does not have action text.");
        }
        throw new java.lang.AssertionError("Sonic snackbar message does not have action text.");
    }

    @Override // defpackage.qub
    public final void c() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.pgi) this.a).a();
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            ((java.util.concurrent.atomic.AtomicReference) ((defpackage.taq) obj).b).set(j$.util.Optional.empty());
        } else {
            kxx kxxVar = (kxx) obj;
            if (((j$.util.Optional) kxxVar.j.getAndSet(j$.util.Optional.empty())).isPresent()) {
                kxxVar.n.a(ajcm.a);
            }
        }
    }
}
