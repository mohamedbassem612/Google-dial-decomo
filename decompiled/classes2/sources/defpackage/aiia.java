package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiia extends aibx {
    final /* synthetic */ java.util.Iterator a;
    final /* synthetic */ ahyp b;

    public aiia(java.util.Iterator it, ahyp ahypVar) {
        this.a = it;
        this.b = ahypVar;
    }

    protected final java.lang.Object a() {
        ahyp ahypVar;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            ahypVar = this.b;
            next = it.next();
        } while (!ahypVar.a(next));
        return next;
    }
}
