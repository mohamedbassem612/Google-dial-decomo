package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class abxm extends defpackage.aodw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abxm(aolr aolrVar) {
        super(aolrVar);
        aooh.f(aolrVar, "coroutineContext");
    }

    public java.lang.Object a(aoln aolnVar) {
        throw null;
    }

    public final apjb b() {
        anqq anqqVar = defpackage.abxl.a;
        if (anqqVar == null) {
            synchronized (defpackage.abxl.class) {
                anqqVar = defpackage.abxl.a;
                if (anqqVar == null) {
                    apjb apjbVar = new apjb("com.google.android.libraries.dialer.patrick.account.CallingCardAccountGrpcService");
                    apjbVar.l(defpackage.abxl.a());
                    anqqVar = new anqq(apjbVar);
                    defpackage.abxl.a = anqqVar;
                }
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        aolr aolrVar = this.a;
        anpk anpkVarA = defpackage.abxl.a();
        gfw gfwVar = new gfw(this, 7, (byte[][]) null);
        aooh.f(aolrVar, "context");
        if (anpkVarA.a != anpj.a) {
            java.util.Objects.toString(anpkVarA);
            throw new java.lang.IllegalArgumentException("Expected a unary method descriptor but got ".concat(anpkVarA.toString()));
        }
        java.lang.String str = anqqVar.a;
        antw.z(new apjb(anpkVarA, new aoeh(aolrVar, new defpackage.agvo(anpkVarA, gfwVar, 8))), str, map);
        return antw.y(str, anqqVar, map);
    }

    public abxm() {
        this(aols.a);
    }
}
