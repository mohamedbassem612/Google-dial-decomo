package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eep extends defpackage.aomd {
    boolean a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.eer c;
    int d;
    defpackage.eem e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eep(defpackage.eer eerVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = eerVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
