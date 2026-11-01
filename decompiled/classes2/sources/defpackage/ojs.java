package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ojs extends aomh implements aonn {
    final /* synthetic */ oju a;
    final /* synthetic */ android.media.AudioFocusRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojs(oju ojuVar, android.media.AudioFocusRequest audioFocusRequest, aoln aolnVar) {
        super(2, aolnVar);
        this.a = ojuVar;
        this.b = audioFocusRequest;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        return new java.lang.Integer(this.a.d(this.b));
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ojs(this.a, this.b, aolnVar);
    }
}
