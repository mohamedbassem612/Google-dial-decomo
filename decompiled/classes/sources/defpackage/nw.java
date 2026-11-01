package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nw extends defpackage.ok {
    private final defpackage.aiyy a;

    public nw(defpackage.aiyy aiyyVar) {
        this.a = aiyyVar;
    }

    @Override // defpackage.ok
    public final void a() {
        throw null;
    }

    @Override // defpackage.ok
    public final void b(java.lang.Object obj) {
        java.lang.Object obj2 = this.a.a;
        if (obj2 == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized");
        }
        ((defpackage.ok) obj2).b(obj);
    }
}
