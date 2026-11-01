package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eny implements java.lang.Runnable {
    private final emy a;
    private final emp b;
    private boolean c;

    public eny(emy emyVar, emp empVar) {
        aooh.f(empVar, "event");
        this.a = emyVar;
        this.b = empVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.f(this.b);
        this.c = true;
    }
}
