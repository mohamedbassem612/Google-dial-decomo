package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mdm extends defpackage.aomd {
    public java.lang.Object a;
    public /* synthetic */ java.lang.Object b;
    public int c;
    final /* synthetic */ defpackage.kaw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdm(defpackage.kaw kawVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = kawVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.U(null, this);
    }
}
