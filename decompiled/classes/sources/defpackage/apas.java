package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apas implements defpackage.aoln, defpackage.aome {
    private final defpackage.aoln a;
    private final defpackage.aolr b;

    public apas(defpackage.aoln aolnVar, defpackage.aolr aolrVar) {
        this.a = aolnVar;
        this.b = aolrVar;
    }

    @Override // defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return null;
    }

    @Override // defpackage.aome
    public final defpackage.aome cK() {
        defpackage.aoln aolnVar = this.a;
        if (aolnVar instanceof defpackage.aome) {
            return (defpackage.aome) aolnVar;
        }
        return null;
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.b;
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        this.a.w(obj);
    }
}
