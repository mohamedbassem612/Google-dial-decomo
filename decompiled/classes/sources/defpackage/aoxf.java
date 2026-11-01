package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxf implements defpackage.aoxh {
    public final defpackage.aonj a;
    public final defpackage.aonn b;
    private final defpackage.aoxh c;

    public aoxf(defpackage.aoxh aoxhVar, defpackage.aonj aonjVar, defpackage.aonn aonnVar) {
        this.c = aoxhVar;
        this.a = aonjVar;
        this.b = aonnVar;
    }

    @Override // defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) {
        defpackage.aoot aootVar = new defpackage.aoot();
        aootVar.a = defpackage.apam.a;
        java.lang.Object objFM = this.c.fM(new defpackage.fzp(this, aootVar, aoxiVar, 2), aolnVar);
        return objFM != defpackage.aolu.a ? defpackage.aojh.a : objFM;
    }
}
