package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gkd implements java.lang.AutoCloseable {
    public final defpackage.gkb c;

    /* JADX WARN: Illegal instructions before constructor call */
    public gkd(defpackage.gkd gkdVar) {
        defpackage.gkb gkbVar = gkdVar.c;
        defpackage.gjr.a.incrementAndGet();
        this(gkbVar);
        boolean z = this.c.e;
    }

    public gkd(defpackage.gkb gkbVar) {
        this.c = gkbVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
