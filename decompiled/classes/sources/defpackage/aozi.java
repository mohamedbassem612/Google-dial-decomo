package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aozi extends defpackage.aomd {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.aozj e;
    int f;
    defpackage.aozl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aozi(defpackage.aozj aozjVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.e = aozjVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.fM(null, this);
    }
}
