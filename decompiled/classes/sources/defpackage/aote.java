package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aote extends defpackage.apcj {
    public final defpackage.aoro b;

    public aote(defpackage.aolr aolrVar, defpackage.aoln aolnVar) {
        super(aolrVar, aolnVar);
        this.b = new defpackage.aoro(0, defpackage.aorr.a);
    }

    @Override // defpackage.apcj, defpackage.aors
    protected final void fE(java.lang.Object obj) throws defpackage.aotd {
        defpackage.aoro aoroVar;
        do {
            aoroVar = this.b;
            int i = aoroVar.b;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                defpackage.aoln aolnVar = this.c;
                defpackage.apbo.a(defpackage.ajsz.ap(aolnVar), defpackage.aosv.u(obj, aolnVar));
                return;
            }
        } while (!aoroVar.c(0, 2));
    }

    @Override // defpackage.apcj, defpackage.aoul
    protected final void fx(java.lang.Object obj) {
        fE(obj);
    }
}
