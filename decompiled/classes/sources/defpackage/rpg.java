package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class rpg extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.rpj b;
    int c;
    defpackage.roc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpg(defpackage.rpj rpjVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = rpjVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
