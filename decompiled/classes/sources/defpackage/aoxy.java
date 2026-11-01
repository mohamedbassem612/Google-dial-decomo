package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxy extends defpackage.aomd {
    public java.lang.Object a;
    public /* synthetic */ java.lang.Object b;
    public int c;
    final /* synthetic */ defpackage.fzp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxy(defpackage.fzp fzpVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = fzpVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
