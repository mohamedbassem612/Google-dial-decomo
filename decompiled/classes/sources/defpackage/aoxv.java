package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxv extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public java.lang.Object c;
    public java.lang.Object d;
    public long e;
    public int f;
    final /* synthetic */ defpackage.gdc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxv(defpackage.gdc gdcVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.g = gdcVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.g.fM(null, this);
    }
}
