package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajtn implements defpackage.ajtr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ajtn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ajtr
    public final java.lang.Object a(defpackage.ajtq ajtqVar) {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return this.a;
        }
        return i != 2 ? com.google.firebase.messaging.FirebaseMessagingRegistrar.lambda$getComponents$0((defpackage.ajui) this.a, ajtqVar) : new defpackage.ajvp((android.content.Context) ajtqVar.e(android.content.Context.class), ((defpackage.ajtc) ajtqVar.e(defpackage.ajtc.class)).f(), defpackage.ajsz.s(ajtqVar, defpackage.ajvq.class), ajtqVar.b(defpackage.ajyn.class), (java.util.concurrent.Executor) ajtqVar.d((defpackage.ajui) this.a));
    }
}
