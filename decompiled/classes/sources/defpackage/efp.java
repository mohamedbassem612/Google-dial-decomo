package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efp implements defpackage.aope {
    public final java.lang.String a;
    private final defpackage.efk b;
    private final defpackage.aonj c;
    private final defpackage.aoss d;
    private final java.lang.Object e = new java.lang.Object();
    private volatile defpackage.ecx f;

    public efp(java.lang.String str, defpackage.efk efkVar, defpackage.aonj aonjVar, defpackage.aoss aossVar) {
        this.a = str;
        this.b = efkVar;
        this.c = aonjVar;
        this.d = aossVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aope
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoqc aoqcVar) {
        defpackage.ecx ecxVar;
        if (obj == null) {
            defpackage.aooh.i("thisRef");
        }
        if (aoqcVar == null) {
            defpackage.aooh.i("property");
        }
        defpackage.ecx ecxVar2 = this.f;
        if (ecxVar2 != null) {
            return ecxVar2;
        }
        synchronized (this.e) {
            if (this.f == null) {
                android.content.Context applicationContext = ((android.content.Context) obj).getApplicationContext();
                defpackage.efk efkVar = this.b;
                defpackage.aonj aonjVar = this.c;
                if (applicationContext == null) {
                    defpackage.aooh.g();
                }
                ?? A = aonjVar.a(applicationContext);
                defpackage.aoss aossVar = this.d;
                defpackage.eeo eeoVar = new defpackage.eeo(defpackage.efy.a, new defpackage.ddw(new defpackage.bev(applicationContext, this, 10, null), 13));
                defpackage.aolr aolrVarPlus = ((defpackage.apbj) aossVar).a;
                if (aolrVarPlus.get(defpackage.aoub.d) == null) {
                    aolrVarPlus = aolrVarPlus.plus(new defpackage.aoud(null));
                }
                defpackage.ecw ecwVar = new defpackage.ecw(eeoVar, aolrVarPlus);
                ecwVar.a = efkVar;
                ecwVar.b(A);
                this.f = new defpackage.efv(new defpackage.efv(ecwVar.a()));
            }
            ecxVar = this.f;
            if (ecxVar == null) {
                defpackage.aooh.g();
            }
        }
        return ecxVar;
    }
}
