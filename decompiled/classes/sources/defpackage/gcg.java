package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gcg extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    int b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    final /* synthetic */ defpackage.gdc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcg(defpackage.gdc gdcVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.f = gdcVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.fM(null, this);
    }
}
