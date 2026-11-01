package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class fzm extends defpackage.aomd {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    int c;
    defpackage.aoot d;
    final /* synthetic */ defpackage.fzp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzm(defpackage.fzp fzpVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.e = fzpVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
