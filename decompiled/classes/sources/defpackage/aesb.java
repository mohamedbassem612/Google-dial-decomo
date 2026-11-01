package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesb {
    public static final defpackage.agab d = new defpackage.agab((int[]) null);
    public final j$.util.concurrent.ConcurrentHashMap a;
    public final java.util.Queue b;
    public volatile defpackage.akzm c;
    private final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();
    private volatile boolean g;

    aesb() {
        new java.util.concurrent.atomic.AtomicReference(null);
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        this.b = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.c = null;
        this.g = false;
        defpackage.ajcq ajcqVar = defpackage.ajcm.a;
        new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    public static defpackage.aesb b(defpackage.aify aifyVar) {
        defpackage.aesb aesbVar;
        int i = 0;
        do {
            aesbVar = null;
            if (i >= ((defpackage.aike) aifyVar).d) {
                break;
            }
            defpackage.ahor ahorVarJ = defpackage.ahou.j(d, (defpackage.ahou) aifyVar.get(i));
            aesbVar = ahorVarJ.b() ? (defpackage.aesb) ahorVarJ.a() : null;
            i++;
        } while (aesbVar == null);
        return aesbVar;
    }

    public final aerz a() {
        if (c()) {
            return null;
        }
        return (aerz) this.e.get();
    }

    public final boolean c() {
        return this.f.get() != null;
    }
}
