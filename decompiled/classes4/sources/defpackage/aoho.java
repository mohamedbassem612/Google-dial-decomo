package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoho extends defpackage.aohl {
    private final defpackage.aohk a;
    private java.lang.Object b;
    private boolean c = false;

    public aoho(defpackage.aohk aohkVar) {
        this.a = aohkVar;
    }

    public final void a(anqw anqwVar, anph anphVar) {
        if (!anqwVar.h()) {
            this.a.p(new defpackage.anqz(anqwVar, anphVar));
            return;
        }
        if (!this.c) {
            this.a.p(new defpackage.anqz(anqw.k.f("No value received for unary call"), anphVar));
        }
        this.a.o(this.b);
    }

    public final void d(java.lang.Object obj) {
        if (this.c) {
            throw new defpackage.anqz(anqw.k.f("More than one value received for unary call"), null);
        }
        this.b = obj;
        this.c = true;
    }

    @Override // defpackage.aohl
    public final void f() {
        this.a.a.dx(2);
    }

    public final void c(anph anphVar) {
    }
}
