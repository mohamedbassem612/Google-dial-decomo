package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afgg implements ajcb {
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
    final /* synthetic */ java.util.Set b;
    final /* synthetic */ ahzh c;
    final /* synthetic */ defpackage.afgj d;
    final /* synthetic */ java.lang.Integer e;
    final /* synthetic */ afgk f;

    public afgg(afgk afgkVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.Set set, ahzh ahzhVar, defpackage.afgj afgjVar, java.lang.Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = ahzhVar;
        this.d = afgjVar;
        this.e = num;
        j$.util.Objects.requireNonNull(afgkVar);
        this.f = afgkVar;
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        boolean z = this.a.get();
        java.util.Set set = this.b;
        if (z) {
            set.size();
            this.c.a(afgk.a);
            return;
        }
        set.size();
        defpackage.afgj afgjVar = this.d;
        synchronized (afgjVar.c) {
            aihd.o(afgjVar.b);
        }
        afgk.a.convert(this.e.intValue(), this.f.g);
    }

    public final void a(java.lang.Throwable th) {
    }
}
