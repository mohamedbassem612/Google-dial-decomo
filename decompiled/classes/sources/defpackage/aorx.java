package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorx extends defpackage.aors implements defpackage.aovb {
    public final java.lang.Thread b;
    public final defpackage.aotm c;

    public aorx(defpackage.aolr aolrVar, java.lang.Thread thread, defpackage.aotm aotmVar) {
        super(aolrVar, true);
        this.b = thread;
        this.c = aotmVar;
    }

    @Override // defpackage.aome
    public final /* bridge */ java.lang.StackTraceElement cJ() {
        return aovc.a(this);
    }

    @Override // defpackage.aome
    public final /* bridge */ defpackage.aome cK() {
        int i;
        if (!defpackage.aovd.a || x()) {
            return null;
        }
        java.lang.StackTraceElement[] stackTrace = this.b.getStackTrace();
        if (stackTrace == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(stackTrace);
        defpackage.aooh.e(listAsList, "asList(...)");
        if (x()) {
            return null;
        }
        java.util.Iterator it = listAsList.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (defpackage.aooc.O((java.lang.StackTraceElement) it.next())) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        int size = listAsList.size();
        do {
            i2++;
            if (i2 < size) {
            }
            return defpackage.aooc.N(listAsList, i);
        } while (defpackage.aooc.O((java.lang.StackTraceElement) listAsList.get(i2)));
        i = i2;
        return defpackage.aooc.N(listAsList, i);
    }

    @Override // defpackage.aove
    public final /* bridge */ java.lang.StackTraceElement d() {
        return defpackage.aovd.e;
    }

    @Override // defpackage.aoul
    protected final boolean fK() {
        return true;
    }

    @Override // defpackage.aoul
    protected final void fx(java.lang.Object obj) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.b;
        if (defpackage.aooh.n(threadCurrentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
