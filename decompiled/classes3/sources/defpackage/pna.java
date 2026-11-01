package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pna implements agye {
    final /* synthetic */ defpackage.pnb a;

    public pna(defpackage.pnb pnbVar) {
        this.a = pnbVar;
    }

    public final void a(java.lang.Throwable th) {
        aooh.f(th, "t");
        defpackage.pnb.a.c().i(zct.b).k(th).l("com/android/dialer/incall/contactgrid/ContactGridSubscriber$subscriptionCallbacks$<anonymous>", "onError", 152, "ContactGridSubscriber.kt").v("Error with ContactGridSubscriber SubscriptionCallbacks");
        defpackage.pnb pnbVar = this.a;
        pnbVar.c.o(rmx.mm);
        pnbVar.l.i((java.lang.String) null).a(mcd.n);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.pom pomVar = (defpackage.pom) obj;
        aooh.f(pomVar, "data");
        aooh.f(pomVar, "data");
        defpackage.pnb pnbVar = this.a;
        pnbVar.f = pomVar;
        if (pnbVar.e != null) {
            pnbVar.l(pomVar);
        }
    }

    public final /* synthetic */ void c() {
    }
}
