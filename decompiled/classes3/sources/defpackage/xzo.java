package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzo {
    private static final java.util.Queue a;
    private int b;
    private int c;
    private java.lang.Object d;

    static {
        char[] cArr = defpackage.ygc.a;
        a = new java.util.ArrayDeque(0);
    }

    private xzo() {
    }

    public static defpackage.xzo a(java.lang.Object obj, int i, int i2) {
        defpackage.xzo xzoVar;
        java.util.Queue queue = a;
        synchronized (queue) {
            xzoVar = (defpackage.xzo) queue.poll();
        }
        if (xzoVar == null) {
            xzoVar = new defpackage.xzo();
        }
        xzoVar.d = obj;
        xzoVar.c = i;
        xzoVar.b = i2;
        return xzoVar;
    }

    public final void b() {
        java.util.Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xzo)) {
            return false;
        }
        defpackage.xzo xzoVar = (defpackage.xzo) obj;
        return this.c == xzoVar.c && this.b == xzoVar.b && this.d.equals(xzoVar.d);
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
