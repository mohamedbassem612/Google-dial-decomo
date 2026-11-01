package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class of {
    private final dzl a;
    public final na c = new defpackage.oe(this);
    public final fya d;

    public of(dzl dzlVar) {
        this.a = dzlVar;
        this.d = new defpackage.od(this, dzlVar);
    }

    public abstract void a();

    public void d(boolean z) {
        this.c.f(z);
        this.d.g(z);
    }

    public final boolean f() {
        return this.c.b && this.d.h();
    }

    public void b() {
    }

    public void e() {
    }

    public void c(defpackage.mk mkVar) {
    }
}
