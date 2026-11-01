package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apok implements defpackage.apix {
    final /* synthetic */ defpackage.apol a;
    private boolean b;

    public apok(defpackage.apol apolVar) {
        j$.util.Objects.requireNonNull(apolVar);
        this.a = apolVar;
    }

    @Override // defpackage.apix
    public final defpackage.apjm a(defpackage.aplr aplrVar) {
        defpackage.apol apolVar = this.a;
        java.lang.Object obj = apolVar.g;
        synchronized (obj) {
            apolVar.i = false;
            apolVar.j = aplrVar.b().b.b;
            apolVar.k = aplrVar.b().d;
            obj.notifyAll();
            while (!this.b) {
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    throw new java.io.InterruptedIOException();
                }
            }
        }
        defpackage.apjh apjhVarB = aplrVar.c;
        defpackage.apjk apjkVar = apjhVarB.d;
        if (apjkVar instanceof defpackage.apon) {
            apjhVarB = ((defpackage.apon) apjkVar).b(apjhVarB);
        }
        defpackage.apjm apjmVarA = aplrVar.a(apjhVarB);
        synchronized (obj) {
            apolVar.h = apjmVarA;
            apolVar.url = apjmVarA.a.a.g();
        }
        return apjmVarA;
    }

    public final void b() {
        java.lang.Object obj = this.a.g;
        synchronized (obj) {
            this.b = true;
            obj.notifyAll();
        }
    }
}
