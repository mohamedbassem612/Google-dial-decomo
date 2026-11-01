package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hji implements txi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public hji(defpackage.hil hilVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public final txk a(ok okVar, twa twaVar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            defpackage.him himVar = ((defpackage.hil) obj).a;
            return new txk((android.content.Context) himVar.s.a(), (ahpz) himVar.bb.a(), okVar, twaVar);
        }
        defpackage.hjj hjjVar = (defpackage.hjj) obj;
        return new txk((android.content.Context) hjjVar.a.s.a(), (ahpz) hjjVar.b.o.a(), okVar, twaVar);
    }

    public hji(defpackage.hjj hjjVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hjjVar);
        this.a = hjjVar;
    }
}
