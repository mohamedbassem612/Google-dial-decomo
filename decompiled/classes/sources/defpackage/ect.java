package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ect extends defpackage.aomd {
    public java.lang.Object a;
    public java.lang.Object b;
    public /* synthetic */ java.lang.Object c;
    public int d;
    public defpackage.aoot e;
    final /* synthetic */ defpackage.eaw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ect(defpackage.eaw eawVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.f = eawVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.e(null, null, this);
    }
}
