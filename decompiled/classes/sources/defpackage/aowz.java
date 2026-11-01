package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aowz extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.aoxa b;
    int c;
    defpackage.aows d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aowz(defpackage.aoxa aoxaVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = aoxaVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
