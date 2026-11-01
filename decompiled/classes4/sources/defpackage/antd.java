package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antd implements defpackage.aocx {
    private final defpackage.ansq a;
    private final defpackage.antj b;
    private final defpackage.anlw c;

    public antd(defpackage.ansq ansqVar, defpackage.antj antjVar, defpackage.anlw anlwVar) {
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
                if (antjVar.b == null) {
                    ahvr.bY(antjVar.c == null);
                    antjVar.b = anqwVar;
                    antjVar.c = anphVar;
                    antjVar.e();
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
        try {
            defpackage.antj antjVar = this.b;
            synchronized (antjVar) {
                antjVar.a = anphVar;
                antjVar.e();
                antjVar.g();
            }
        } catch (anqx e) {
            defpackage.ansq ansqVar = this.a;
            synchronized (ansqVar) {
                anqw anqwVar = e.a;
                ansqVar.h(anqwVar, anqwVar, false);
            }
        }
    }

    @Override // defpackage.aocx
    public final void k() {
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        try {
            defpackage.antj antjVar = this.b;
            synchronized (antjVar) {
                antjVar.d(inputStream);
                antjVar.g();
            }
        } catch (anqx e) {
            defpackage.ansq ansqVar = this.a;
            synchronized (ansqVar) {
                anqw anqwVar = e.a;
                ansqVar.h(anqwVar, anqwVar, false);
            }
        }
    }

    @Override // defpackage.aodk
    public final boolean o() {
        return this.b.h();
    }

    public final java.lang.String toString() {
        defpackage.antj antjVar = this.b;
        return "MultiMessageServerStream[" + this.a.toString() + '/' + antjVar.toString() + ']';
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
