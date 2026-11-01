package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lgw {
    private static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger();

    public static final akzx a() {
        akzx akzxVarM = defpackage.lgo.a.m();
        int andIncrement = a.getAndIncrement();
        akzxVarM.u();
        defpackage.lgo lgoVar = (defpackage.lgo) akzxVarM.b;
        lgoVar.b |= 2;
        lgoVar.d = andIncrement;
        akzxVarM.u();
        defpackage.lgo lgoVar2 = (defpackage.lgo) akzxVarM.b;
        lgoVar2.b |= 256;
        lgoVar2.k = false;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVarM.u();
        defpackage.lgo lgoVar3 = (defpackage.lgo) akzxVarM.b;
        lgoVar3.b |= 1;
        lgoVar3.c = epochMilli;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM.u();
        defpackage.lgo lgoVar4 = (defpackage.lgo) akzxVarM.b;
        lgoVar4.b |= 512;
        lgoVar4.l = jElapsedRealtime;
        return akzxVarM;
    }
}
