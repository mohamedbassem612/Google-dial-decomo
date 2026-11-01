package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anwp implements defpackage.anvr {
    public final defpackage.anvr a;
    public volatile boolean b;
    public java.util.List c = new java.util.ArrayList();

    public anwp(defpackage.anvr anvrVar) {
        this.a = anvrVar;
    }

    private final void b(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.anvr
    public final void a(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        b(new abb(this, anqwVar, anvqVar, anphVar, 17));
    }

    @Override // defpackage.anvr
    public final void c(anph anphVar) {
        b(new defpackage.alvh(this, anphVar, 17));
    }

    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        if (this.b) {
            this.a.d(aodlVar);
        } else {
            b(new defpackage.alvh(this, aodlVar, 16));
        }
    }

    @Override // defpackage.aodm
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new defpackage.anwo(this, 3));
        }
    }
}
