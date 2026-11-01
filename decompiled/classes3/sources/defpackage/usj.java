package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class usj {
    public static final aimz a = aimz.i("com/android/dialer/timekeeper/impl/database/SafeTimeKeeperDao");
    public final defpackage.usl b;
    public final ajct c;
    public final ajwr d = new ajwr();
    public final aogc e;

    public usj(ajcu ajcuVar, defpackage.usl uslVar, aogc aogcVar) {
        this.c = ajcuVar;
        this.b = uslVar;
        this.e = aogcVar;
    }

    public final ajcq a(java.lang.String str) {
        ajas ajasVarB = ahqx.b(new qat(this, str, 19, (byte[]) null));
        ajct ajctVar = this.c;
        return ahvr.B(this.d.e(ajasVarB, ajctVar), java.lang.Throwable.class, new defpackage.uqm(7), ajctVar);
    }

    public final ajcq b(long j) {
        ajas ajasVarB = ahqx.b(new lki(this, j, 3));
        ajct ajctVar = this.c;
        return ahvr.B(this.d.e(ajasVarB, ajctVar), java.lang.Throwable.class, new defpackage.uqm(8), ajctVar);
    }

    public final ajcq c() {
        ajas ajasVarB = ahqx.b(new defpackage.plx(this, 17));
        ajct ajctVar = this.c;
        return ahvr.B(this.d.e(ajasVarB, ajctVar), java.lang.Throwable.class, new defpackage.uqm(4), ajctVar);
    }

    public final ajcq d(long j) {
        return ahrv.g(b(j)).i(new defpackage.udu(this, 8), this.c);
    }

    public final ajcq e(defpackage.uru uruVar) {
        ajas ajasVarB = ahqx.b(new qat(this, uruVar, 18));
        ajct ajctVar = this.c;
        return ahvr.B(this.d.e(ajasVarB, ajctVar), java.lang.Throwable.class, new defpackage.uqm(5), ajctVar);
    }
}
