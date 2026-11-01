package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class srf extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.srl b;
    int c;
    defpackage.apdp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srf(defpackage.srl srlVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = srlVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
