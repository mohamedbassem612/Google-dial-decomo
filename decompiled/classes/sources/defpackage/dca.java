package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dca implements defpackage.cmu {
    @Override // defpackage.cmw
    public final /* synthetic */ defpackage.cmw a(defpackage.cmw cmwVar) {
        return cmwVar != defpackage.cmw.c ? new defpackage.cmq(this, cmwVar) : this;
    }

    @Override // defpackage.cmw
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.cmw
    public final /* synthetic */ boolean c(defpackage.aonj aonjVar) {
        return ((java.lang.Boolean) aonjVar.a(this)).booleanValue();
    }

    public abstract defpackage.cmv d();

    public abstract void e(defpackage.cmv cmvVar);
}
