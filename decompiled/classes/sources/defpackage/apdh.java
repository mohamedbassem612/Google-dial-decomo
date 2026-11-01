package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdh {
    public final long a;

    public apdh() {
        this.a = java.lang.System.nanoTime();
    }

    public final defpackage.akzm a() {
        long jNanoTime = java.lang.System.nanoTime() - this.a;
        defpackage.akzx akzxVarM = defpackage.akzm.a.m();
        akzxVarM.u();
        ((defpackage.akzm) akzxVarM.b).b = jNanoTime / 1000000000;
        akzxVarM.u();
        ((defpackage.akzm) akzxVarM.b).c = (int) (jNanoTime % 1000000000);
        return (defpackage.akzm) akzxVarM.r();
    }

    public final defpackage.alcf b() {
        defpackage.akzx akzxVarM = defpackage.alcf.a.m();
        akzxVarM.u();
        defpackage.alcf alcfVar = (defpackage.alcf) akzxVarM.b;
        long j = this.a;
        alcfVar.b = j / 1000000000;
        akzxVarM.u();
        ((defpackage.alcf) akzxVarM.b).c = (int) (j % 1000000000);
        return (defpackage.alcf) akzxVarM.r();
    }

    public apdh(long j) {
        this.a = j;
    }
}
