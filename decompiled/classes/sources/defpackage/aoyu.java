package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoyu implements defpackage.aotj {
    public final defpackage.aoyw a;
    public final long b;
    public final java.lang.Object c;
    public final defpackage.aoln d;

    public aoyu(defpackage.aoyw aoywVar, long j, java.lang.Object obj, defpackage.aoln aolnVar) {
        this.a = aoywVar;
        this.b = j;
        this.c = obj;
        this.d = aolnVar;
    }

    @Override // defpackage.aotj
    public final void fz() {
        defpackage.aoyw aoywVar = this.a;
        synchronized (aoywVar) {
            long j = this.b;
            if (j >= aoywVar.f()) {
                java.lang.Object[] objArr = aoywVar.a;
                defpackage.aooh.c(objArr);
                int length = ((int) j) & (objArr.length - 1);
                if (objArr[length] == this) {
                    objArr[length] = defpackage.aoyx.a;
                    aoywVar.j();
                }
            }
        }
    }
}
