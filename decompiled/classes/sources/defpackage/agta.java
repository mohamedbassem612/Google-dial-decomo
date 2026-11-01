package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agta extends defpackage.ajac {
    private defpackage.agtc a;
    private final int b;

    public agta(defpackage.agtc agtcVar, int i) {
        this.a = agtcVar;
        this.b = i;
    }

    @Override // defpackage.ajac
    protected final void a() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.agtb agtbVar;
        defpackage.agtc agtcVar = this.a;
        this.a = null;
        if (agtcVar != null) {
            do {
                atomicLong = agtcVar.a;
                j = atomicLong.get();
                i = (int) j;
                long j2 = j >>> 32;
                if (i == Integer.MIN_VALUE) {
                    throw new java.lang.AssertionError(defpackage.a.bz(j, "Refcount is: "));
                }
                i2 = (int) j2;
                z = i == -2147483647;
                if (z) {
                    i2++;
                }
            } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (((long) (i - 1)) & 4294967295L)));
            if (z) {
                do {
                    atomicReference = agtcVar.b;
                    agtbVar = (defpackage.agtb) atomicReference.get();
                    if (agtbVar == null) {
                        return;
                    }
                    if (agtbVar.a > this.b) {
                        return;
                    } else {
                        agtbVar.cancel(true);
                    }
                } while (!defpackage.anty.ar(atomicReference, agtbVar));
            }
        }
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        java.lang.Object obj;
        defpackage.agtc agtcVar = this.a;
        if (agtcVar == null || (obj = agtcVar.d.a) == null) {
            return null;
        }
        java.lang.String strBG = defpackage.a.bG((byte) 93, obj, "callable=[");
        defpackage.agtb agtbVar = (defpackage.agtb) this.a.b.get();
        if (agtbVar == null) {
            return strBG;
        }
        return strBG + ", trial=[" + agtbVar.toString() + ']';
    }
}
