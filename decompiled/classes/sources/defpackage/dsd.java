package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dsd {
    public java.lang.Object a;
    public defpackage.dsh b;
    public defpackage.dsj c = new defpackage.dsj();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.dsj dsjVar = this.c;
        if (dsjVar != null) {
            dsjVar.c(runnable, executor);
        }
    }

    public final void b(java.lang.Object obj) {
        this.d = true;
        defpackage.dsh dshVar = this.b;
        if (dshVar == null || !dshVar.b.f(obj)) {
            return;
        }
        e();
    }

    public final void c() {
        this.d = true;
        defpackage.dsh dshVar = this.b;
        if (dshVar == null || !dshVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void d(java.lang.Throwable th) {
        this.d = true;
        defpackage.dsh dshVar = this.b;
        if (dshVar == null || !dshVar.a(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        defpackage.dsj dsjVar;
        defpackage.dsh dshVar = this.b;
        if (dshVar != null && !dshVar.isDone()) {
            dshVar.a(new dse("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a)))));
        }
        if (this.d || (dsjVar = this.c) == null) {
            return;
        }
        dsjVar.f(null);
    }
}
