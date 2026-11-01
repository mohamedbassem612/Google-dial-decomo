package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fyz extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    int b;
    java.lang.Object c;
    final /* synthetic */ defpackage.fza d;
    java.lang.Object e;
    java.lang.Object f;
    java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyz(defpackage.fza fzaVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = fzaVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
