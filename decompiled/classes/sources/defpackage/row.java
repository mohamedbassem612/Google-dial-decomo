package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class row extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.rpa b;
    int c;
    defpackage.rpa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public row(defpackage.rpa rpaVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = rpaVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
