package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ajar extends defpackage.ajab {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.ajar.class, java.util.Set.class, "seenExceptionsField");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.ajar.class, "remainingField");
    volatile int remainingField;
    volatile java.util.Set seenExceptionsField = null;

    public ajar(int i) {
        this.remainingField = i;
    }

    public abstract void d(java.util.Set set);
}
