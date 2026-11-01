package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aebd extends defpackage.aomd {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.aebs e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aebd(defpackage.aebs aebsVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.e = aebsVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, this);
    }
}
