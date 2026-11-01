package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aowx extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.aowy b;
    int c;
    defpackage.apan d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aowx(defpackage.aowy aowyVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = aowyVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.fM(null, this);
    }
}
