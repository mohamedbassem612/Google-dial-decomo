package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class zru extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.zrw b;
    int c;
    defpackage.mgu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zru(defpackage.zrw zrwVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.b = zrwVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z(this);
    }
}
