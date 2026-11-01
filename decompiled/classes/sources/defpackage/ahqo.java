package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahqo implements defpackage.ajba {
    public final /* synthetic */ defpackage.ahpj a;
    public final /* synthetic */ defpackage.ajba b;

    public /* synthetic */ ahqo(defpackage.ahpj ahpjVar, defpackage.ajba ajbaVar) {
        this.a = ahpjVar;
        this.b = ajbaVar;
    }

    @Override // defpackage.ajba
    public final defpackage.ajbg a(defpackage.ajyk ajykVar, java.lang.Object obj) {
        long j = defpackage.ahqx.a;
        defpackage.ajba ajbaVar = this.b;
        if (ajykVar == null) {
            defpackage.aooh.i("closer");
        }
        defpackage.ahpj ahpjVar = this.a;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, ahpjVar);
        try {
            defpackage.ajbg ajbgVarA = ajbaVar.a(ajykVar, obj);
            defpackage.ahns.d(ahpeVar, ahpjVarD);
            return ajbgVarA;
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
