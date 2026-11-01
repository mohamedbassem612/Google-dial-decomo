package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ecy extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.eez c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecy(defpackage.eez eezVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = eezVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
