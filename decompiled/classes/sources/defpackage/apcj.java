package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apcj extends defpackage.aors implements defpackage.aome {
    public final defpackage.aoln c;

    public apcj(defpackage.aolr aolrVar, defpackage.aoln aolnVar) {
        super(aolrVar, true);
        this.c = aolnVar;
    }

    @Override // defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return null;
    }

    @Override // defpackage.aome
    public final defpackage.aome cK() {
        defpackage.aoln aolnVar = this.c;
        if (aolnVar instanceof defpackage.aome) {
            return (defpackage.aome) aolnVar;
        }
        return null;
    }

    @Override // defpackage.aors
    protected void fE(java.lang.Object obj) {
        defpackage.aoln aolnVar = this.c;
        aolnVar.w(defpackage.aosv.u(obj, aolnVar));
    }

    @Override // defpackage.aoul
    protected final boolean fK() {
        return true;
    }

    @Override // defpackage.aoul
    protected void fx(java.lang.Object obj) throws defpackage.aotd {
        defpackage.aoln aolnVar = this.c;
        defpackage.apbo.a(defpackage.ajsz.ap(aolnVar), defpackage.aosv.u(obj, aolnVar));
    }

    public void V() {
    }
}
