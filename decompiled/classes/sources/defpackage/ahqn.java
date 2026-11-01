package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahqn implements defpackage.ajbc {
    public final /* synthetic */ defpackage.ahpj a;
    public final /* synthetic */ defpackage.ajbc b;

    public /* synthetic */ ahqn(defpackage.ahpj ahpjVar, defpackage.ajbc ajbcVar) {
        this.a = ahpjVar;
        this.b = ajbcVar;
    }

    @Override // defpackage.ajbc
    public final java.lang.Object a(defpackage.ajyk ajykVar, java.lang.Object obj) {
        long j = defpackage.ahqx.a;
        defpackage.ajbc ajbcVar = this.b;
        if (ajykVar == null) {
            defpackage.aooh.i("closer");
        }
        defpackage.ahpj ahpjVar = this.a;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, ahpjVar);
        try {
            java.lang.Object objA = ajbcVar.a(ajykVar, obj);
            defpackage.ahns.d(ahpeVar, ahpjVarD);
            return objA;
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
}
