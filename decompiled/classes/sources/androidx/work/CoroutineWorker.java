package androidx.work;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class CoroutineWorker extends defpackage.gsg {
    private final androidx.work.WorkerParameters d;
    private final defpackage.aosp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(workerParameters, "params");
        this.d = workerParameters;
        this.e = gro.a;
    }

    @Override // defpackage.gsg
    public final defpackage.ajcq a() {
        return defpackage.gus.y(this.e.plus(new defpackage.aoud(null)), 1, new defpackage.dmu(this, (defpackage.aoln) null, 7));
    }

    @Override // defpackage.gsg
    public final defpackage.ajcq b() {
        defpackage.aolr aolrVar = this.e;
        if (defpackage.aooh.n(aolrVar, gro.a)) {
            aolrVar = this.d.f;
        }
        defpackage.aooh.c(aolrVar);
        return defpackage.gus.y(aolrVar.plus(new defpackage.aoud(null)), 1, new defpackage.dmu(this, (defpackage.aoln) null, 8, (byte[]) null));
    }

    public abstract java.lang.Object c(defpackage.aoln aolnVar);

    @Override // defpackage.gsg
    public final void d() {
    }
}
