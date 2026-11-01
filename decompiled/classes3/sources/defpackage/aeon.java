package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeon implements defpackage.aeoo {
    private final /* synthetic */ int $cid;
    private final boolean a;
    private final j$.time.Instant b;
    private final alad c;

    private aeon(alad aladVar, boolean z, j$.time.Instant instant, int i) {
        this.$cid = i;
        this.c = aladVar;
        this.a = z;
        this.b = instant;
    }

    public static defpackage.aeon c(aphg aphgVar) {
        j$.time.Instant instant = j$.time.Instant.EPOCH;
        alcf alcfVar = aphgVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        j$.time.Instant instantDK = ajsz.dK(alcfVar);
        boolean z = false;
        for (defpackage.aphf aphfVar : aphgVar.d) {
            akzm akzmVar = aphfVar.f;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            j$.time.Instant instantPlus = instantDK.plus(ajsz.dJ(akzmVar));
            akzm akzmVar2 = aphfVar.g;
            if (akzmVar2 == null) {
                akzmVar2 = akzm.a;
            }
            j$.time.Instant instantPlus2 = instantPlus.plus(ajsz.dJ(akzmVar2));
            if (true == instantPlus2.isAfter(instant)) {
                instant = instantPlus2;
            }
            z |= !((aphfVar.b & 16) != 0);
        }
        return new defpackage.aeon(aphgVar, z, instant, 0);
    }

    public static defpackage.aeon d(apfr apfrVar) {
        j$.time.Instant instant = j$.time.Instant.EPOCH;
        alcf alcfVar = apfrVar.g;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        j$.time.Instant instantDK = ajsz.dK(alcfVar);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (apfw apfwVar : apfrVar.k) {
            akzm akzmVar = apfwVar.f;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            j$.time.Instant instantPlus = instantDK.plus(ajsz.dJ(akzmVar));
            if (true == instantPlus.isAfter(instant)) {
                instant = instantPlus;
            }
            int i = apfwVar.c;
            int i2 = 4;
            if (i != 0) {
                if (i == 3) {
                    i2 = 1;
                } else if (i != 4) {
                    i2 = i != 5 ? 0 : 3;
                } else {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(java.lang.Long.valueOf(apfwVar.e));
            } else if (i3 == 1) {
                hashSet.remove(java.lang.Long.valueOf(apfwVar.e));
            }
        }
        return new defpackage.aeon(apfrVar, !hashSet.isEmpty(), instant, 1);
    }

    @Override // defpackage.aeoo
    public final long a() {
        int i = this.$cid;
        alad aladVar = this.c;
        return i != 0 ? aladVar.e((albw) null) : aladVar.e((albw) null);
    }

    @Override // defpackage.aeoo
    public final /* synthetic */ java.lang.Object b() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.aeon aeonVar = (defpackage.aeon) obj;
            boolean z = aeonVar.a;
            boolean z2 = this.a;
            if (z2 == z) {
                return aeonVar.b.compareTo(this.b);
            }
            if (!z2) {
                return 1;
            }
        } else {
            defpackage.aeon aeonVar2 = (defpackage.aeon) obj;
            boolean z3 = aeonVar2.a;
            boolean z4 = this.a;
            if (z4 == z3) {
                return aeonVar2.b.compareTo(this.b);
            }
            if (!z4) {
                return 1;
            }
        }
        return -1;
    }
}
