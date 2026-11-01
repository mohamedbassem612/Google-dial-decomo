package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antc implements defpackage.anvp {
    private final defpackage.ansp a;
    private final defpackage.anti b;

    public antc(defpackage.ansp anspVar, defpackage.anti antiVar) {
        this.a = anspVar;
        this.b = antiVar;
    }

    @Override // defpackage.anvp
    public final defpackage.anlw a() {
        throw null;
    }

    @Override // defpackage.anvp
    public final void c(anqw anqwVar) {
        defpackage.ansp anspVar = this.a;
        synchronized (anspVar) {
            anspVar.i(anqwVar);
        }
    }

    @Override // defpackage.anvp
    public final void e() {
        try {
            defpackage.anti antiVar = this.b;
            synchronized (antiVar) {
                antiVar.f();
                antiVar.g();
            }
        } catch (anqx e) {
            defpackage.ansp anspVar = this.a;
            synchronized (anspVar) {
                anqw anqwVar = e.a;
                anspVar.h(anqwVar, anqwVar, false);
            }
        }
    }

    @Override // defpackage.aodk
    public final void g(int i) {
        defpackage.ansp anspVar = this.a;
        synchronized (anspVar) {
            anspVar.n(i);
        }
    }

    @Override // defpackage.anvp
    public final void i(anmw anmwVar) {
        defpackage.anti antiVar = this.b;
        synchronized (antiVar) {
            antiVar.c(anmwVar);
        }
    }

    @Override // defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        defpackage.ansp anspVar = this.a;
        synchronized (anspVar) {
            anspVar.l(this.b, anvrVar);
        }
        defpackage.anti antiVar = this.b;
        if (antiVar.h()) {
            anvrVar.e();
        }
        try {
            synchronized (antiVar) {
                antiVar.e();
                antiVar.g();
            }
        } catch (anqx e) {
            defpackage.ansp anspVar2 = this.a;
            synchronized (anspVar2) {
                anqw anqwVar = e.a;
                anspVar2.h(anqwVar, anqwVar, false);
            }
        }
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        try {
            defpackage.anti antiVar = this.b;
            synchronized (antiVar) {
                antiVar.d(inputStream);
                antiVar.g();
            }
        } catch (anqx e) {
            defpackage.ansp anspVar = this.a;
            synchronized (anspVar) {
                anqw anqwVar = e.a;
                anspVar.h(anqwVar, anqwVar, false);
            }
        }
    }

    @Override // defpackage.aodk
    public final boolean o() {
        return this.b.h();
    }

    public final java.lang.String toString() {
        defpackage.anti antiVar = this.b;
        return "MultiMessageClientStream[" + this.a.toString() + '/' + antiVar.toString() + ']';
    }

    @Override // defpackage.aodk
    public final void d() {
    }

    @Override // defpackage.aodk
    public final void f() {
    }

    @Override // defpackage.anvp
    public final void b(defpackage.anxu anxuVar) {
    }

    @Override // defpackage.aodk
    public final void h(anmj anmjVar) {
    }

    @Override // defpackage.anvp
    public final void j(anmy anmyVar) {
    }

    @Override // defpackage.anvp
    public final void k(int i) {
    }

    @Override // defpackage.anvp
    public final void l(int i) {
    }
}
