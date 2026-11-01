package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mew implements defpackage.soq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/darpa/impl/DarpaPhenotypeFlagsCommitSucceededListener");
    public final defpackage.men b;
    private final defpackage.aoss c;
    private final defpackage.ajcu d;

    public mew(defpackage.aoss aossVar, defpackage.ajcu ajcuVar, defpackage.men menVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (ajcuVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        this.c = aossVar;
        this.d = ajcuVar;
        this.b = menVar;
    }

    @Override // defpackage.soq
    public final void a() {
        defpackage.ajcq ajcqVarF = defpackage.aosv.F(this.c, 0, new defpackage.mev(this, (defpackage.aoln) null, 0), 3);
        defpackage.lcn lcnVar = new defpackage.lcn(2);
        long j = defpackage.ahqx.a;
        ajcqVarF.c(new defpackage.ajcc(ajcqVarF, new defpackage.sqh(defpackage.ahns.c(false), lcnVar, 2)), this.d);
    }
}
