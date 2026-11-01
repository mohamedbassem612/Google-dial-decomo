package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ojq extends defpackage.aomh implements defpackage.aonn {
    final /* synthetic */ defpackage.oju a;
    final /* synthetic */ android.media.AudioFocusRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojq(defpackage.oju ojuVar, android.media.AudioFocusRequest audioFocusRequest, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.a = ojuVar;
        this.b = audioFocusRequest;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ojq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        return new java.lang.Integer(this.a.a(this.b));
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.ojq(this.a, this.b, aolnVar);
    }
}
