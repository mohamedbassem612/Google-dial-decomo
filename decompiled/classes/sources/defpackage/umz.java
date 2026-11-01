package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class umz extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.unb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umz(defpackage.unb unbVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = unbVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
