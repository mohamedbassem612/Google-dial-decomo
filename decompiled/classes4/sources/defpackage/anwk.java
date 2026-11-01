package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anwk extends anty {
    public volatile boolean a;
    public volatile anqw b;
    public java.util.List c;
    public final anty d;
    private final defpackage.anwl e;

    public anwk(defpackage.anwl anwlVar, anty antyVar) {
        super((byte[]) null, (byte[]) null, (byte[]) null);
        this.c = new java.util.ArrayList();
        this.e = anwlVar;
        this.d = antyVar;
    }

    private final void i(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    private final void j(java.lang.Throwable th, java.lang.String str) {
        this.b = anqw.c.e(th).f(str);
        this.e.dv(str, th);
    }

    public final void a(anqw anqwVar, anph anphVar) {
        i(new defpackage.akaz(this, anqwVar, anphVar, 13));
    }

    public final void c(anph anphVar) {
        if (this.a) {
            f(anphVar);
        } else {
            i(new defpackage.alvh(this, anphVar, 9));
        }
    }

    public final void d(java.lang.Object obj) {
        if (this.a) {
            g(obj);
        } else {
            i(new defpackage.alvh(this, obj, 10));
        }
    }

    public final void e() {
        if (this.a) {
            h();
        } else {
            i(new defpackage.alvr(this, 18));
        }
    }

    public final void f(anph anphVar) {
        if (this.b == null) {
            try {
                this.d.c(anphVar);
            } catch (java.lang.Throwable th) {
                j(th, "Failed to read headers");
            }
        }
    }

    public final void g(java.lang.Object obj) {
        if (this.b == null) {
            try {
                this.d.d(obj);
            } catch (java.lang.Throwable th) {
                j(th, "Failed to read message.");
            }
        }
    }

    public final void h() {
        if (this.b == null) {
            try {
                this.d.e();
            } catch (java.lang.Throwable th) {
                j(th, "Failed to call onReady.");
            }
        }
    }
}
