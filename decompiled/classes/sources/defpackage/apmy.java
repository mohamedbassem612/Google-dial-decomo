package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmy extends defpackage.apow {
    final /* synthetic */ defpackage.apmz a;

    public apmy(defpackage.apmz apmzVar) {
        this.a = apmzVar;
    }

    @Override // defpackage.apow
    protected final void a() {
        defpackage.apmz apmzVar = this.a;
        apmzVar.h(defpackage.apme.CANCEL);
        defpackage.apms apmsVar = apmzVar.b;
        synchronized (apmsVar) {
            long j = apmsVar.n;
            long j2 = apmsVar.m;
            if (j >= j2) {
                apmsVar.m = j2 + 1;
                apmsVar.p = java.lang.System.nanoTime() + 1000000000;
                defpackage.apkb apkbVar = apmsVar.i;
                java.lang.String str = apmsVar.d;
                apkbVar.e(java.lang.String.valueOf(str).concat(" ping"), new ahca(apmsVar, 10));
            }
        }
    }

    public final void b() {
        if (e()) {
            throw new java.net.SocketTimeoutException("timeout");
        }
    }
}
