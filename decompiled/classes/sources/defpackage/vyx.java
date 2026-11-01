package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class vyx extends defpackage.aomd {
    boolean a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.vyy c;
    int d;
    defpackage.apdp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyx(defpackage.vyy vyyVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = vyyVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
