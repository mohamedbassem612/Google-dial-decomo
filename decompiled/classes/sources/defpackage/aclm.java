package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aclm {
    private static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger();
    private static final long b;
    private static final defpackage.aiwe c;

    static {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() * 1000;
        b = jCurrentTimeMillis;
        android.os.SystemClock.elapsedRealtime();
        defpackage.akzx akzxVarM = defpackage.aiwe.a.m();
        akzxVarM.u();
        defpackage.aiwe aiweVar = (defpackage.aiwe) akzxVarM.b;
        aiweVar.b |= 2;
        aiweVar.d = 0;
        akzxVarM.u();
        defpackage.aiwe aiweVar2 = (defpackage.aiwe) akzxVarM.b;
        aiweVar2.b |= 4;
        aiweVar2.e = 0;
        akzxVarM.u();
        defpackage.aiwe aiweVar3 = (defpackage.aiwe) akzxVarM.b;
        aiweVar3.b |= 1;
        aiweVar3.c = jCurrentTimeMillis;
        c = (defpackage.aiwe) akzxVarM.r();
    }

    public static defpackage.aiwd a() {
        defpackage.akzx akzxVarM = defpackage.aiwd.a.m();
        long andIncrement = a.getAndIncrement();
        akzxVarM.u();
        defpackage.aiwd aiwdVar = (defpackage.aiwd) akzxVarM.b;
        aiwdVar.b |= 2;
        aiwdVar.d = andIncrement;
        defpackage.aiwe aiweVar = c;
        akzxVarM.u();
        defpackage.aiwd aiwdVar2 = (defpackage.aiwd) akzxVarM.b;
        j$.util.Objects.requireNonNull(aiweVar);
        aiwdVar2.c = aiweVar;
        aiwdVar2.b |= 1;
        return (defpackage.aiwd) akzxVarM.r();
    }
}
