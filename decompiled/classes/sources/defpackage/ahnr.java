package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahnr extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        defpackage.ahpe ahpeVar = new defpackage.ahpe(defpackage.afec.h(java.lang.Thread.currentThread()));
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.util.WeakHashMap weakHashMap = defpackage.ahns.c;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, ahpeVar);
        }
        return ahpeVar;
    }
}
