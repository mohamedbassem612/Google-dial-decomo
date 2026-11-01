package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ue implements emx {
    public final emy a;
    public final defpackage.tt b;
    private final emy c;
    private final emw d;

    public ue() {
        defpackage.ud udVar = new defpackage.ud(this, 0);
        this.d = udVar;
        emy emyVar = new emy(this, true);
        this.c = emyVar;
        this.a = new emy(this, true);
        emyVar.c(udVar);
        this.b = new defpackage.tt(emyVar, new defpackage.tw());
    }

    public final ems P() {
        return this.a;
    }

    public final defpackage.tt a() {
        return (defpackage.tt) j$.util.Objects.requireNonNull(this.b);
    }

    public abstract defpackage.ub b(android.content.Intent intent);

    public final void c(emp empVar) {
        this.c.f(empVar);
    }

    public void d(android.content.Intent intent) {
    }
}
