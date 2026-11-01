package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ecz extends defpackage.aomd {
    java.lang.Object a;
    java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.eda d;
    int e;
    defpackage.eei f;
    defpackage.ecu g;
    defpackage.apdp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecz(defpackage.eda edaVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = edaVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
