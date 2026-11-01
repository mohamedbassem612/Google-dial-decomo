package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aajv implements defpackage.aajq {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ defpackage.aajm b;
    public final /* synthetic */ defpackage.aajl c;
    public final /* synthetic */ ahbq d;

    public /* synthetic */ aajv(ahbq ahbqVar, java.lang.String str, defpackage.aajm aajmVar, defpackage.aajl aajlVar) {
        this.d = ahbqVar;
        this.a = str;
        this.b = aajmVar;
        this.c = aajlVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aajq
    public final java.lang.Object a(aagp aagpVar) {
        ahbq ahbqVar = this.d;
        gat gatVar = (gat) ahbqVar.a;
        java.lang.String str = this.a;
        defpackage.aajm aajmVar = this.b;
        int iV = gatVar.v();
        defpackage.aajl aajlVar = this.c;
        defpackage.aajx aajxVarK = ahbq.k(aagpVar, str, aajmVar, iV, aajlVar);
        java.lang.Object obj = ahbqVar.d;
        if (obj == null) {
            throw new java.lang.NullPointerException("Null eventCollectorProvider");
        }
        return new defpackage.aakb(gatVar, ahbqVar.c, (aaju) ahbqVar.b, str, aajmVar, aajlVar, (aiyy) obj, aajxVarK.a);
    }
}
