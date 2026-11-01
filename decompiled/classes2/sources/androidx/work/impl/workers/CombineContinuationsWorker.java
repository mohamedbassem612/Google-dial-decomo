package androidx.work.impl.workers;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CombineContinuationsWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        aooh.f(context, "context");
        aooh.f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final gus c() {
        return new gsf(f());
    }
}
