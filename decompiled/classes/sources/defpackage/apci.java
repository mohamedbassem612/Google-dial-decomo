package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apci {
    public volatile java.util.concurrent.atomic.AtomicReferenceArray array;

    public apci(int i) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray(i);
    }

    public final java.lang.Object a(int i) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void b(int i, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray(defpackage.aooc.t(i + 1, length << 1));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
