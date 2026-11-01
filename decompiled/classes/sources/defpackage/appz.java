package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class appz {
    private static final defpackage.appy a = new defpackage.appy(new byte[0], 0, 0, false);
    private static final int b;
    private static final java.util.concurrent.atomic.AtomicReference[] c;

    static {
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() << 1) - 1);
        b = iHighestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new java.util.concurrent.atomic.AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final defpackage.appy a() {
        java.util.concurrent.atomic.AtomicReference atomicReferenceC = c();
        defpackage.appy appyVar = a;
        defpackage.appy appyVar2 = (defpackage.appy) atomicReferenceC.getAndSet(appyVar);
        if (appyVar2 == appyVar) {
            return new defpackage.appy();
        }
        if (appyVar2 == null) {
            atomicReferenceC.set(null);
            return new defpackage.appy();
        }
        atomicReferenceC.set(appyVar2.f);
        appyVar2.f = null;
        appyVar2.c = 0;
        return appyVar2;
    }

    public static final void b(defpackage.appy appyVar) {
        if (appyVar == null) {
            defpackage.aooh.i("segment");
        }
        if (appyVar.f != null || appyVar.g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (appyVar.d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReferenceC = c();
        defpackage.appy appyVar2 = a;
        defpackage.appy appyVar3 = (defpackage.appy) atomicReferenceC.getAndSet(appyVar2);
        if (appyVar3 != appyVar2) {
            int i = appyVar3 != null ? appyVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(appyVar3);
                return;
            }
            appyVar.f = appyVar3;
            appyVar.b = 0;
            appyVar.c = i + 8192;
            atomicReferenceC.set(appyVar);
        }
    }

    private static final java.util.concurrent.atomic.AtomicReference c() {
        return c[(int) (java.lang.Thread.currentThread().getId() & (((long) b) - 1))];
    }
}
