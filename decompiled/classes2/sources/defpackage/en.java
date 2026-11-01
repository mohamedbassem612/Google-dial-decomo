package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class en extends kh {
    public final defpackage.em a;
    private final a e;

    protected en(defpackage.kj kjVar) {
        a aVar = new a();
        this.e = aVar;
        defpackage.ep epVar = new defpackage.ep(this);
        synchronized (defpackage.ej.a) {
            if (defpackage.ej.b == null) {
                defpackage.ej.b = java.util.concurrent.Executors.newFixedThreadPool(2);
            }
        }
        defpackage.em emVar = new defpackage.em(epVar, new defpackage.ni(defpackage.ej.b));
        this.a = emVar;
        emVar.c.add(aVar);
    }

    public final int a() {
        return this.a.e.size();
    }
}
