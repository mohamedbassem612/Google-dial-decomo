package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eto {
    public final defpackage.etk a;
    public final defpackage.etm b;
    public final java.util.concurrent.CopyOnWriteArraySet c;
    public boolean d;
    private final java.lang.Thread e;
    private final java.util.ArrayDeque f;
    private final java.util.ArrayDeque g;
    private final java.lang.Object h;
    private boolean i;

    public eto(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, java.lang.Thread thread, defpackage.etc etcVar, defpackage.etm etmVar, boolean z) {
        this.e = thread;
        this.c = copyOnWriteArraySet;
        this.b = etmVar;
        this.h = new java.lang.Object();
        this.f = new java.util.ArrayDeque();
        this.g = new java.util.ArrayDeque();
        this.a = (looper == null || etcVar == null || etmVar == null) ? null : etcVar.b(looper, new defpackage.etz(this, 1));
        this.d = z;
    }

    public final void a(java.lang.Object obj) {
        ahvr.ci(obj);
        synchronized (this.h) {
            if (this.i) {
                return;
            }
            this.c.add(new defpackage.etn(obj));
        }
    }

    public final void b() {
        f();
        java.util.ArrayDeque arrayDeque = this.g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.b != null) {
            defpackage.etk etkVar = this.a;
            ahvr.ci(etkVar);
            if (!etkVar.c(1)) {
                etkVar.k(etkVar.h(1));
            }
        }
        java.util.ArrayDeque arrayDeque2 = this.f;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((java.lang.Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, defpackage.etl etlVar) {
        f();
        this.g.add(new defpackage.mo(new java.util.concurrent.CopyOnWriteArraySet(this.c), i, etlVar, 3));
    }

    public final void d() {
        f();
        synchronized (this.h) {
            this.i = true;
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((defpackage.etn) it.next()).a(this.b);
        }
        copyOnWriteArraySet.clear();
    }

    public final void e(int i, defpackage.etl etlVar) {
        c(i, etlVar);
        b();
    }

    public final void f() {
        if (this.d) {
            ahvr.bY(g());
        }
    }

    public final boolean g() {
        return java.lang.Thread.currentThread() == this.e;
    }

    public eto(java.lang.Thread thread) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
