package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gwf {
    public final android.content.Context a;
    public final java.lang.Object b;
    public final java.util.LinkedHashSet c;
    public java.lang.Object d;
    private final defpackage.gou e;

    protected gwf(android.content.Context context, defpackage.gou gouVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.e = gouVar;
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.aooh.e(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        this.b = new java.lang.Object();
        this.c = new java.util.LinkedHashSet();
    }

    public abstract java.lang.Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(java.lang.Object obj) {
        synchronized (this.b) {
            java.lang.Object obj2 = this.d;
            if (obj2 == null || !defpackage.aooh.n(obj2, obj)) {
                this.d = obj;
                this.e.c.execute(new gra(defpackage.ajsz.bZ(this.c), this, 5));
            }
        }
    }
}
