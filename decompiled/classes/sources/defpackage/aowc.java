package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aowc extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.aowe b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aowc(defpackage.aowe aoweVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = aoweVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object objK = defpackage.aowe.k(this.b, this);
        return objK != defpackage.aolu.a ? new defpackage.aowm(objK) : objK;
    }
}
