package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoed implements aovi {
    public static final abcl a = new abcl();
    private final defpackage.anmv b;

    public aoed(defpackage.anmv anmvVar) {
        aooh.f(anmvVar, "grpcContext");
        this.b = anmvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(aolr aolrVar) {
        aooh.f(aolrVar, "context");
        defpackage.anmv anmvVarA = this.b.a();
        aooh.e(anmvVarA, "attach(...)");
        return anmvVarA;
    }

    public final /* bridge */ /* synthetic */ void c(aolr aolrVar, java.lang.Object obj) {
        defpackage.anmv anmvVar = (defpackage.anmv) obj;
        aooh.f(aolrVar, "context");
        aooh.f(anmvVar, "oldState");
        this.b.f(anmvVar);
    }

    public final java.lang.Object fold(java.lang.Object obj, aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    public final aolp get(aolq aolqVar) {
        return ajsz.aq(this, aolqVar);
    }

    public final aolq getKey() {
        return a;
    }

    public final aolr minusKey(aolq aolqVar) {
        return ajsz.ar(this, aolqVar);
    }

    public final aolr plus(aolr aolrVar) {
        return ajsz.as(this, aolrVar);
    }
}
