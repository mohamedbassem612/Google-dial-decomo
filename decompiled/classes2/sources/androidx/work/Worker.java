package androidx.work;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class Worker extends gsg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        aooh.f(context, "context");
        aooh.f(workerParameters, "workerParams");
    }

    public final ajcq a() {
        return defpackage.fsu.u(h(), new defpackage.eli(7));
    }

    public final ajcq b() {
        return defpackage.fsu.u(h(), new defpackage.fxt(this, 11));
    }

    public abstract gus c();
}
