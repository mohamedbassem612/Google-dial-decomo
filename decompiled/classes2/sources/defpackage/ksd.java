package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksd implements aonn {
    public final defpackage.krb a;
    final /* synthetic */ defpackage.ksg b;

    public ksd(defpackage.ksg ksgVar, defpackage.krb krbVar) {
        aooh.f(krbVar, "reminderAction");
        this.b = ksgVar;
        this.a = krbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        az azVar = (az) obj;
        defpackage.krk krkVar = (defpackage.krk) obj2;
        aooh.f(azVar, "activity");
        aooh.f(krkVar, "callActionEventListener");
        krkVar.a(new defpackage.kre(2));
        defpackage.ksg ksgVar = this.b;
        aoov.an(ksgVar.b, (aolr) null, 0, new defpackage.blv(ksgVar, azVar, this, krkVar, (aoln) null, 10), 3);
        return aojh.a;
    }
}
