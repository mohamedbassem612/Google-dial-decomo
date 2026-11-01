package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apdk extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.apdm b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apdk(defpackage.apdm apdmVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = apdmVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
