package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aolv extends aomf {
    final /* synthetic */ aonj a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aolv(aoln aolnVar, aonj aonjVar) {
        super(aolnVar);
        this.a = aonjVar;
    }

    protected final java.lang.Object b(java.lang.Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed");
            }
            this.b = 2;
            aooc.af(obj);
            return obj;
        }
        this.b = 1;
        aooc.af(obj);
        aonj aonjVar = this.a;
        aoov.f(aonjVar, 1);
        return aonjVar.a(this);
    }
}
