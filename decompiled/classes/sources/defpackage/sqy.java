package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqy extends defpackage.aomd {
    public long a;
    public /* synthetic */ java.lang.Object b;
    public int c;
    final /* synthetic */ defpackage.rsr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqy(defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = rsrVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
