package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxd implements defpackage.xxe, defpackage.ygh {
    private static final dxz a = defpackage.ygj.a(20, new defpackage.xyh(1));
    private final defpackage.ygk b = new defpackage.ygk();
    private defpackage.xxe c;
    private boolean d;
    private boolean e;

    static defpackage.xxd d(defpackage.xxe xxeVar) {
        defpackage.xxd xxdVar = (defpackage.xxd) a.a();
        xxdVar.e = false;
        xxdVar.d = true;
        xxdVar.c = xxeVar;
        return xxdVar;
    }

    @Override // defpackage.xxe
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        return this.c.b();
    }

    @Override // defpackage.xxe
    public final java.lang.Object c() {
        return this.c.c();
    }

    @Override // defpackage.xxe
    public final synchronized void e() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.e();
            this.c = null;
            a.b(this);
        }
    }

    @Override // defpackage.ygh
    public final defpackage.ygk ez() {
        return this.b;
    }

    final synchronized void f() {
        this.b.a();
        if (!this.d) {
            throw new java.lang.IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            e();
        }
    }
}
