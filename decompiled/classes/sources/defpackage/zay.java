package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zay implements defpackage.ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public zay(defpackage.kjw kjwVar, defpackage.aeun aeunVar, defpackage.aenj aenjVar, int i) {
        this.$cid = i;
        this.c = aeunVar;
        this.b = aenjVar;
        j$.util.Objects.requireNonNull(kjwVar);
        this.a = kjwVar;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        if (this.$cid != 0) {
            java.lang.Object obj = this.b;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.a;
            ((defpackage.kjw) obj3).k.q((defpackage.aeun) obj2, (defpackage.aenj) obj, defpackage.rub.c);
            return;
        }
        defpackage.aooh.f(th, "t");
        boolean z = th instanceof java.util.concurrent.CancellationException;
        java.lang.Object obj4 = this.a;
        if (z) {
            ((defpackage.zzx) ((defpackage.ahbv) obj4).a).l(new defpackage.zbv((defpackage.zbw) this.b, null, null, null, null));
        } else {
            ((defpackage.zzx) ((defpackage.ahbv) obj4).a).l(new defpackage.zbv((defpackage.zbw) this.c, null, null, null, null));
        }
    }

    @Override // defpackage.ajcb
    public final void b(java.lang.Object obj) {
        if (this.$cid != 0) {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.a;
            ((defpackage.kjw) obj4).k.q((defpackage.aeun) obj3, (defpackage.aenj) obj2, defpackage.rub.b);
        }
    }

    public zay(defpackage.ahbv ahbvVar, defpackage.zbw zbwVar, defpackage.zbw zbwVar2, int i) {
        this.$cid = i;
        this.a = ahbvVar;
        this.b = zbwVar;
        this.c = zbwVar2;
    }
}
