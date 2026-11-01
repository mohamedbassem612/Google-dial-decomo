package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class vnh extends defpackage.aomd {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.vnj c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnh(defpackage.vnj vnjVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = vnjVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
