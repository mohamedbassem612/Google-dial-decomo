package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzj extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public defpackage.apdp c;
    final /* synthetic */ defpackage.afab d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(defpackage.afab afabVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = afabVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
