package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahqv implements defpackage.ahyc {
    final /* synthetic */ defpackage.ahpj a;
    final /* synthetic */ defpackage.ahyc b;

    public ahqv(defpackage.ahpj ahpjVar, defpackage.ahyc ahycVar) {
        this.a = ahpjVar;
        this.b = ahycVar;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, this.a);
        try {
            java.lang.Object objApply = this.b.apply(obj);
            defpackage.ahns.d(ahpeVar, ahpjVarD);
            return objApply;
        } catch (java.lang.Throwable th) {
            try {
                ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ahns.d(ahpeVar, ahpjVarD);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        return "propagating=[" + this.b + ']';
    }
}
