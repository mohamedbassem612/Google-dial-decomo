package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edu extends defpackage.aomd {
    boolean a;
    java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.eei d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edu(defpackage.eei eeiVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = eeiVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(false, null, this);
    }
}
