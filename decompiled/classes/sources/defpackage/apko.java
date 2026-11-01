package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apko {
    public final defpackage.apkc a;
    public final long b;
    public long c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    public final java.util.concurrent.BlockingQueue e;
    public final defpackage.apkw f;

    public apko(defpackage.apkw apkwVar, defpackage.apkc apkcVar) {
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        this.f = apkwVar;
        this.a = apkcVar;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.b = 250000000L;
        this.c = Long.MIN_VALUE;
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        defpackage.zzx zzxVar = apkcVar.d;
        this.e = new java.util.concurrent.LinkedBlockingDeque();
    }

    public final void a() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            defpackage.apkz apkzVar = (defpackage.apkz) it.next();
            apkzVar.f();
            this.f.f.addLast(apkzVar.e());
        }
        copyOnWriteArrayList.clear();
    }
}
