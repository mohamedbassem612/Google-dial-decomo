package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class emt implements defpackage.aoss, defpackage.emv {
    public final defpackage.ems a;
    private final defpackage.aolr b;

    public emt(defpackage.ems emsVar, defpackage.aolr aolrVar) {
        if (emsVar == null) {
            defpackage.aooh.i("lifecycle");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("coroutineContext");
        }
        this.a = emsVar;
        this.b = aolrVar;
        if (emsVar.a() == defpackage.emq.a) {
            defpackage.aooc.W(aolrVar, null);
        }
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        defpackage.ems emsVar = this.a;
        if (emsVar.a().compareTo(defpackage.emq.a) <= 0) {
            emsVar.d(this);
            defpackage.aooc.W(this.b, null);
        }
    }

    public final void b() {
        defpackage.aosp aospVar = defpackage.aoth.a;
        defpackage.aoov.an(this, defpackage.apcg.a.j(), 0, new defpackage.emu(this, (defpackage.aoln) null, 0), 2);
    }

    @Override // defpackage.aoss
    public final defpackage.aolr c() {
        return this.b;
    }

    public emt() {
        throw null;
    }
}
