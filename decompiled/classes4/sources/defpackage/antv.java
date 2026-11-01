package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antv implements defpackage.aocx {
    private final defpackage.ansq a;
    private final defpackage.antj b;
    private final defpackage.anlw c;
    private anph d;
    private java.io.InputStream e;

    public antv(defpackage.ansq ansqVar, defpackage.antj antjVar, defpackage.anlw anlwVar) {
        this.a = ansqVar;
        this.b = antjVar;
        this.c = anlwVar;
    }

    @Override // defpackage.aocx
    public final defpackage.anlw a() {
        return this.c;
    }

    @Override // defpackage.aocx
    public final defpackage.aodj b() {
        return this.b.f;
    }

    @Override // defpackage.aocx
    public final void c(anqw anqwVar) {
        defpackage.ansq ansqVar = this.a;
        synchronized (ansqVar) {
            ansqVar.i(anqwVar);
        }
    }

    @Override // defpackage.aocx
    public final void e(anqw anqwVar, anph anphVar) {
        try {
            defpackage.antj antjVar = this.b;
            synchronized (antjVar) {
                anph anphVar2 = this.d;
                java.io.InputStream inputStream = this.e;
                if (antjVar.b == null) {
                    if (anphVar2 != null) {
                        antjVar.a = anphVar2;
                    }
                    antjVar.e();
                    if (inputStream != null) {
                        antjVar.d(inputStream);
                    }
                    ahvr.bY(antjVar.c == null);
                    antjVar.b = anqwVar;
                    antjVar.c = anphVar;
                    antjVar.f();
                    antjVar.g();
                }
            }
            defpackage.ansq ansqVar = this.a;
            synchronized (ansqVar) {
                ansqVar.f();
            }
        } catch (anqx e) {
            defpackage.ansq ansqVar2 = this.a;
            synchronized (ansqVar2) {
                anqw anqwVar2 = e.a;
                ansqVar2.h(anqwVar2, anqwVar2, false);
            }
        }
    }

    @Override // defpackage.aodk
    public final void g(int i) {
        defpackage.ansq ansqVar = this.a;
        synchronized (ansqVar) {
            ansqVar.n(i);
        }
    }

    @Override // defpackage.aocx
    public final void i(defpackage.aocy aocyVar) {
        defpackage.ansq ansqVar = this.a;
        synchronized (ansqVar) {
            ansqVar.l(this.b, aocyVar);
        }
    }

    @Override // defpackage.aocx
    public final void j(anph anphVar) {
        this.d = anphVar;
    }

    @Override // defpackage.aocx
    public final void k() {
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        if (this.e == null) {
            this.e = inputStream;
            return;
        }
        defpackage.ansq ansqVar = this.a;
        synchronized (ansqVar) {
            anqw anqwVarF = anqw.k.f("too many messages");
            ansqVar.h(anqwVarF, anqwVarF, false);
        }
    }

    @Override // defpackage.aodk
    public final boolean o() {
        return this.b.h();
    }

    public final java.lang.String toString() {
        defpackage.antj antjVar = this.b;
        return "SingleMessageServerStream[" + this.a.toString() + '/' + antjVar.toString() + ']';
    }

    @Override // defpackage.aodk
    public final void d() {
    }

    @Override // defpackage.aodk
    public final void f() {
    }

    @Override // defpackage.aodk
    public final void h(anmj anmjVar) {
    }
}
