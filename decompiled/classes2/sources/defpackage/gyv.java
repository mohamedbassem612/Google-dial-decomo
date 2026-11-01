package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gyv extends aomd {
    public /* synthetic */ java.lang.Object a;
    final /* synthetic */ androidx.work.impl.workers.ConstraintTrackingWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyv(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, aoln aolnVar) {
        super(aolnVar);
        this.b = constraintTrackingWorker;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, null, null, this);
    }
}
