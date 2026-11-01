package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxj extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public java.lang.Object c;
    public int d;
    public int e;
    final /* synthetic */ defpackage.fzh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxj(defpackage.fzh fzhVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.f = fzhVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.fM(null, this);
    }
}
