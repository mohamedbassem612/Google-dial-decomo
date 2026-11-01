package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbq extends defpackage.aomh implements defpackage.aonj {
    final /* synthetic */ defpackage.aomy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbq(defpackage.aomy aomyVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.a = aomyVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.gbq(this.a, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        return this.a.a();
    }
}
