package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxr extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public java.lang.Object c;
    public defpackage.apan d;
    final /* synthetic */ defpackage.gdc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxr(defpackage.gdc gdcVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.e = gdcVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.fM(null, this);
    }
}
