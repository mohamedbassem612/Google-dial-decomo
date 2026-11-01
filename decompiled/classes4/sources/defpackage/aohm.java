package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aohm extends defpackage.aohl {
    private final defpackage.aohy a;
    private final defpackage.aohj b;
    private boolean c;

    public aohm(defpackage.aohy aohyVar, defpackage.aohj aohjVar) {
        this.a = aohyVar;
        this.b = aohjVar;
        if (aohyVar instanceof defpackage.aohq) {
            ((defpackage.aohq) aohyVar).a();
        }
    }

    public final void a(anqw anqwVar, anph anphVar) {
        boolean zH = anqwVar.h();
        defpackage.aohy aohyVar = this.a;
        if (zH) {
            aohyVar.e();
        } else {
            aohyVar.f(new defpackage.anqz(anqwVar, anphVar));
        }
    }

    public final void d(java.lang.Object obj) {
        if (this.c && !this.b.a) {
            throw new defpackage.anqz(anqw.k.f("More than one responses received for unary or client-streaming call"), null);
        }
        this.c = true;
        this.a.g(obj);
        defpackage.aohj aohjVar = this.b;
        if (aohjVar.a) {
            aohjVar.a();
        }
    }

    @Override // defpackage.aohl
    public final void f() {
        this.b.a();
    }

    public final void e() {
    }

    public final void c(anph anphVar) {
    }
}
