package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoei extends defpackage.antw {
    final /* synthetic */ aoub a;
    final /* synthetic */ aowi b;
    final /* synthetic */ defpackage.anql c;
    final /* synthetic */ defpackage.apjb d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoei(aoub aoubVar, aowi aowiVar, defpackage.anql anqlVar, defpackage.apjb apjbVar) {
        super((char[]) null);
        this.a = aoubVar;
        this.b = aowiVar;
        this.c = anqlVar;
        this.d = apjbVar;
        this.e = true;
    }

    @Override // defpackage.antw
    public final void a() {
        aooc.X(this.a, "Cancellation received from client", (java.lang.Throwable) null);
    }

    @Override // defpackage.antw
    public final void c() {
        this.b.e((java.lang.Throwable) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    @Override // defpackage.antw
    public final void d(java.lang.Object obj) throws anqx {
        if (this.e) {
            java.lang.Object objB = this.b.b(obj);
            this.e = aowm.c(objB);
            if (objB instanceof aowl) {
                java.lang.Throwable thB = aowm.b(objB);
                if (!(thB instanceof java.util.concurrent.CancellationException)) {
                    throw new anqx(anqw.k.f("onMessage should never be called when requestsChannel is unready").e(thB), (anph) null);
                }
            }
        }
        if (this.e) {
            return;
        }
        this.c.c(1);
    }

    @Override // defpackage.antw
    public final void e() throws java.lang.Throwable {
        this.d.i();
    }
}
