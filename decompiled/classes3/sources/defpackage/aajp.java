package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aajp implements aaug {
    public final /* synthetic */ int a;
    public final /* synthetic */ gat b;

    public /* synthetic */ aajp(gat gatVar, int i) {
        this.b = gatVar;
        this.a = i;
    }

    public final void a(aaum aaumVar) {
        int iIncrementAndGet;
        gat gatVar = this.b;
        android.os.Handler handler = (android.os.Handler) gatVar.c;
        aais.al(handler);
        aais.al(handler);
        if (aaumVar.k()) {
            int i = this.a - 1;
            if (i == 0) {
                iIncrementAndGet = ((java.util.concurrent.atomic.AtomicInteger) gatVar.d).incrementAndGet();
            } else if (i != 2) {
                iIncrementAndGet = ((java.util.concurrent.atomic.AtomicInteger) gatVar.d).get();
            } else {
                iIncrementAndGet = j$.util.concurrent.atomic.DesugarAtomicInteger.updateAndGet((java.util.concurrent.atomic.AtomicInteger) gatVar.d, new defpackage.aajo());
            }
        } else {
            iIncrementAndGet = ((java.util.concurrent.atomic.AtomicInteger) gatVar.d).get();
        }
        int iDecrementAndGet = ((java.util.concurrent.atomic.AtomicInteger) gatVar.a).decrementAndGet();
        if (iIncrementAndGet > 0 || iDecrementAndGet > 0) {
            return;
        }
        aagf aagfVar = (aagf) gatVar.b;
        if (aagfVar.o()) {
            aagfVar.C();
        }
    }
}
