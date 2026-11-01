package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeta implements defpackage.aepj {
    final /* synthetic */ defpackage.amwu a;
    final /* synthetic */ defpackage.ajcu b;
    public final /* synthetic */ defpackage.aetc c;

    public aeta(defpackage.aetc aetcVar, defpackage.amwu amwuVar, defpackage.ajcu ajcuVar) {
        this.a = amwuVar;
        this.b = ajcuVar;
        j$.util.Objects.requireNonNull(aetcVar);
        this.c = aetcVar;
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        defpackage.aetc aetcVar = this.c;
        aetcVar.d.a(3, aenjVar.a);
        aetcVar.a();
        long jLongValue = ((java.lang.Long) this.a.a()).longValue();
        aetcVar.f = this.b.schedule(new aekf(this, aenjVar, 7, (byte[]) null), jLongValue, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // defpackage.aepj
    public final void j(defpackage.aenj aenjVar) {
        defpackage.aetc aetcVar = this.c;
        aetcVar.d.a(4, aenjVar.a);
        aetcVar.a();
        aetcVar.e = this.b.schedule(new defpackage.abqu(this, aenjVar, 6, null), 10L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
