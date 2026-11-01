package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoqe extends defpackage.aojk {
    private final java.util.Iterator a;
    private final aonj b;
    private final java.util.HashSet c = new java.util.HashSet();

    public aoqe(java.util.Iterator it, aonj aonjVar) {
        this.a = it;
        this.b = aonjVar;
    }

    @Override // defpackage.aojk
    protected final void a() {
        aonj aonjVar;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return;
            } else {
                aonjVar = this.b;
                next = it.next();
            }
        } while (!this.c.add(aonjVar.a(next)));
        c(next);
    }
}
