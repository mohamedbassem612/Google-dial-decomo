package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aomd extends defpackage.aomb {
    public transient defpackage.aoln B;
    private final defpackage.aolr a;

    public aomd(defpackage.aoln aolnVar) {
        this(aolnVar, aolnVar != null ? aolnVar.u() : null);
    }

    @Override // defpackage.aomb
    protected void f() {
        defpackage.aoln aolnVar = this.B;
        if (aolnVar != null && aolnVar != this) {
            defpackage.aolp aolpVar = u().get(defpackage.aolo.k);
            if (aolpVar == null) {
                defpackage.aooh.g();
            }
            ((defpackage.aolo) aolpVar).g(aolnVar);
        }
        this.B = defpackage.aomc.a;
    }

    @Override // defpackage.aoln
    public defpackage.aolr u() {
        defpackage.aolr aolrVar = this.a;
        if (aolrVar == null) {
            defpackage.aooh.g();
        }
        return aolrVar;
    }

    public aomd(defpackage.aoln aolnVar, defpackage.aolr aolrVar) {
        super(aolnVar);
        this.a = aolrVar;
    }
}
