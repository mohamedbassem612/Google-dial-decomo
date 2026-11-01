package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovj {
    public static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();

    public static final defpackage.aotm a() {
        java.lang.ThreadLocal threadLocal = a;
        defpackage.aotm aotmVar = (defpackage.aotm) threadLocal.get();
        if (aotmVar != null) {
            return aotmVar;
        }
        defpackage.aory aoryVar = new defpackage.aory(java.lang.Thread.currentThread());
        threadLocal.set(aoryVar);
        return aoryVar;
    }
}
