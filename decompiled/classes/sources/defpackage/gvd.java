package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gvd extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.gve b;
    int c;
    androidx.work.WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvd(defpackage.gve gveVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = gveVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
