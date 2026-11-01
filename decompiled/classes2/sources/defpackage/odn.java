package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class odn implements agza {
    final /* synthetic */ defpackage.odo a;
    final /* synthetic */ defpackage.odm b;
    final /* synthetic */ boolean c;
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public odn(defpackage.odo odoVar, defpackage.odm odmVar, boolean z) {
        this.a = odoVar;
        this.b = odmVar;
        this.c = z;
    }

    public final void a(java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.odo odoVar = this.a;
        if (((java.lang.Boolean) odoVar.d.a()).booleanValue()) {
            defpackage.odo.a.c().g(1, java.util.concurrent.TimeUnit.MINUTES).k(th).l("com/android/dialer/errors/dataservice/SubscriptionMixinCallbacksFactory$createLocalSubscriptionCallbacks$<anonymous>", "onLoadError", 71, "SubscriptionMixinCallbacksFactory.kt").v("LocalSubscriptionCallbacks onLoadError called");
        } else {
            defpackage.odo.a.c().i(zct.b).k(th).l("com/android/dialer/errors/dataservice/SubscriptionMixinCallbacksFactory$createLocalSubscriptionCallbacks$<anonymous>", "onLoadError", 77, "SubscriptionMixinCallbacksFactory.kt").v("LocalSubscriptionCallbacks onLoadError called");
        }
        odoVar.b.o(rmx.mm);
        this.b.b(th);
        if (this.c && !this.d.get()) {
            throw th;
        }
    }

    public final void b(java.lang.Object obj) {
        mhc mhcVarAB;
        if (obj instanceof j$.util.Optional) {
            j$.util.Optional optional = (j$.util.Optional) obj;
            mhcVarAB = optional.isPresent() ? gus.aB(optional.get().getClass()) : gus.aw("Optional.empty");
        } else {
            mhcVarAB = gus.aB(obj.getClass());
        }
        if (mhcVarAB == null) {
            gus.aw("null");
        }
        this.a.c.c();
        this.b.a(obj);
        this.d.set(true);
    }
}
