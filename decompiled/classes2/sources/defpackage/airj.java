package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class airj extends aibx {
    final /* synthetic */ java.util.Deque a;
    final /* synthetic */ java.util.Deque b;

    public airj(defpackage.airh airhVar, java.util.Deque deque, java.util.Deque deque2) {
        this.a = deque;
        this.b = deque2;
        j$.util.Objects.requireNonNull(airhVar);
    }

    protected final java.lang.Object a() {
        java.util.Deque deque = this.a;
        while (true) {
            java.lang.Object objC = defpackage.airh.c(deque);
            if (objC == null) {
                java.util.Deque deque2 = this.b;
                if (!deque2.isEmpty()) {
                    return deque2.pop();
                }
                b();
                return null;
            }
            java.util.Iterator it = aiql.g(objC).iterator();
            if (!it.hasNext()) {
                return objC;
            }
            deque.addFirst(it);
            this.b.push(objC);
        }
    }
}
