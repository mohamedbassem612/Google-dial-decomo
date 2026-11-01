package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gyx extends aomd {
    public java.lang.Object a;
    public /* synthetic */ java.lang.Object b;
    final /* synthetic */ androidx.work.impl.workers.ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyx(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, aoln aolnVar) {
        super(aolnVar);
        this.c = constraintTrackingWorker;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(this);
    }
}
