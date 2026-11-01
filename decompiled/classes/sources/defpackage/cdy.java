package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdy implements defpackage.aoss, defpackage.cdv {
    public static final defpackage.aolr a = new defpackage.cam();
    public final defpackage.aolr b;
    public final defpackage.aolr c;
    private final java.lang.Object d = this;
    private volatile defpackage.aolr e;

    public cdy(defpackage.aolr aolrVar, defpackage.aolr aolrVar2) {
        this.b = aolrVar;
        this.c = aolrVar2;
    }

    public final void a() {
        synchronized (this.d) {
            defpackage.aolr aolrVar = this.e;
            if (aolrVar == null) {
                this.e = a;
            } else {
                defpackage.aooc.W(aolrVar, new defpackage.cbq());
            }
        }
    }

    @Override // defpackage.aoss
    public final defpackage.aolr c() {
        defpackage.aolr aolrVarPlus = this.e;
        if (aolrVarPlus == null || aolrVarPlus == a) {
            defpackage.aolr aolrVar = this.b;
            defpackage.cmc cmcVar = (defpackage.cmc) aolrVar.get(defpackage.cmc.a);
            cdx cdxVar = cmcVar != null ? new cdx(kotlinx.coroutines.CoroutineExceptionHandler.c, cmcVar, this) : defpackage.aols.a;
            synchronized (this.d) {
                defpackage.aolr aolrVar2 = this.e;
                if (aolrVar2 == null) {
                    aolrVarPlus = aolrVar.plus(new defpackage.aoud((defpackage.aoub) aolrVar.get(defpackage.aoub.d))).plus(this.c).plus(cdxVar);
                } else if (aolrVar2 == a) {
                    defpackage.aoud aoudVar = new defpackage.aoud((defpackage.aoub) aolrVar.get(defpackage.aoub.d));
                    aoudVar.s(new defpackage.cbq());
                    aolrVarPlus = aolrVar.plus(aoudVar).plus(this.c).plus(cdxVar);
                } else {
                    aolrVarPlus = aolrVar2;
                }
                this.e = aolrVarPlus;
            }
        }
        if (aolrVarPlus == null) {
            defpackage.aooh.g();
        }
        return aolrVarPlus;
    }

    @Override // defpackage.cdv
    public final void h() {
        a();
    }

    @Override // defpackage.cdv
    public final void i() {
        a();
    }

    @Override // defpackage.cdv
    public final void j() {
    }
}
