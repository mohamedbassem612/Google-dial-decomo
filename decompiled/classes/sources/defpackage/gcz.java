package defpackage;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gcz extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.gdc c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcz(defpackage.gdc gdcVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = gdcVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fM(null, this);
    }
}
