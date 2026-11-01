package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolx extends defpackage.aomf {
    final /* synthetic */ defpackage.aonn a;
    final /* synthetic */ java.lang.Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aolx(defpackage.aoln aolnVar, defpackage.aonn aonnVar, java.lang.Object obj) {
        super(aolnVar);
        this.a = aonnVar;
        this.b = obj;
    }

    @Override // defpackage.aomb
    protected final java.lang.Object b(java.lang.Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            defpackage.aooc.af(obj);
            return obj;
        }
        this.c = 1;
        defpackage.aooc.af(obj);
        defpackage.aonn aonnVar = this.a;
        defpackage.aooh.d(aonnVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        defpackage.aoov.f(aonnVar, 2);
        return aonnVar.a(this.b, this);
    }
}
