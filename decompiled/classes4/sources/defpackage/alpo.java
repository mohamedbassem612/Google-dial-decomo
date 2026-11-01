package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpo implements ajcb {
    final /* synthetic */ j$.util.Optional a;
    final /* synthetic */ boolean b;
    final /* synthetic */ defpackage.amac c;

    public alpo(defpackage.amac amacVar, j$.util.Optional optional, boolean z) {
        this.a = optional;
        this.b = z;
        j$.util.Objects.requireNonNull(amacVar);
        this.c = amacVar;
    }

    public final void a(java.lang.Throwable th) {
        if (this.b) {
            ((defpackage.alpg) this.c.a).b();
        }
        j$.util.Optional optional = this.a;
        defpackage.alju aljuVar = new defpackage.alju(th, 18);
        if (true == optional.isPresent()) {
            ((ajcb) optional.get()).a((java.lang.Throwable) aljuVar.a);
        }
    }

    public final void b(java.lang.Object obj) {
        defpackage.alju aljuVar = new defpackage.alju(obj, 17);
        j$.util.Optional optional = this.a;
        if (true == optional.isPresent()) {
            ((ajcb) optional.get()).b(aljuVar.a);
        }
        if (this.b) {
            ((defpackage.alpg) this.c.a).b();
        }
    }
}
