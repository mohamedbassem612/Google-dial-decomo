package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antu implements defpackage.anvp {
    private final defpackage.ansp a;
    private final defpackage.anti b;
    private java.io.InputStream c;
    private anmw d;

    public antu(defpackage.ansp anspVar, defpackage.anti antiVar) {
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
                anmw anmwVar = this.d;
                if (anmwVar != null) {
                    antiVar.c(anmwVar);
                }
                antiVar.e();
                java.io.InputStream inputStream = this.c;
                if (inputStream != null) {
                    antiVar.d(inputStream);
                }
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
        this.d = anmwVar;
    }

    @Override // defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        defpackage.ansp anspVar = this.a;
        synchronized (anspVar) {
            anspVar.l(this.b, anvrVar);
        }
        if (this.b.h()) {
            anvrVar.e();
        }
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        if (this.c == null) {
            this.c = inputStream;
            return;
        }
        defpackage.ansp anspVar = this.a;
        synchronized (anspVar) {
            anqw anqwVarF = anqw.k.f("too many messages");
            anspVar.h(anqwVarF, anqwVarF, false);
        }
    }

    @Override // defpackage.aodk
    public final boolean o() {
        return this.b.h();
    }

    public final java.lang.String toString() {
        defpackage.anti antiVar = this.b;
        return "SingleMessageClientStream[" + this.a.toString() + '/' + antiVar.toString() + ']';
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
