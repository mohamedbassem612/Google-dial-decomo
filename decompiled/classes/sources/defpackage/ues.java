package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ues implements defpackage.iox {
    public static final defpackage.iot a = new defpackage.iot(uep.a, ueq.a, new jot(5), owv.d);
    public final defpackage.ueu b;
    public final defpackage.rlv c;
    private final defpackage.aolr d;

    public ues(defpackage.ueu ueuVar, defpackage.aolr aolrVar, defpackage.rlv rlvVar) {
        defpackage.aooh.f(ueuVar, "spamDatabaseHelper");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.b = ueuVar;
        this.d = aolrVar;
        this.c = rlvVar;
    }

    @Override // defpackage.iox
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.uer(this, (defpackage.aoln) null, 0), aolnVar);
    }

    @Override // defpackage.iox
    public final defpackage.iot c() {
        return a;
    }
}
