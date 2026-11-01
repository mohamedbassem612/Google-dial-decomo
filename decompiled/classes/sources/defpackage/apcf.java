package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcf {
    public static final defpackage.apcm a = new defpackage.apcm("REMOVE_FROZEN");
    public final defpackage.aorp b;
    private final int c;
    private final boolean d;
    private final int e;
    private final defpackage.aorq f;
    private final defpackage.zzx g;

    public apcf(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.f = new defpackage.aorq(null, aorrVar);
        this.b = new defpackage.aorp(0L, aorrVar);
        this.g = new defpackage.zzx(i);
        if (i2 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final int a(java.lang.Object obj) {
        while (true) {
            defpackage.aorp aorpVar = this.b;
            long j = aorpVar.b;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = this.e;
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.d) {
                if (this.g.aa(i2 & i).a != null) {
                    int i4 = this.c;
                    if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                }
            }
            if (aorpVar.c(j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.g.aa(i & i2).c(obj);
                while ((this.b.b & 1152921504606846976L) != 0) {
                    this = this.c();
                    defpackage.zzx zzxVar = this.g;
                    int i5 = this.e & i2;
                    java.lang.Object obj2 = zzxVar.aa(i5).a;
                    if ((obj2 instanceof defpackage.apce) && ((defpackage.apce) obj2).a == i2) {
                        zzxVar.aa(i5).c(obj);
                    } else {
                        this = null;
                    }
                    if (this == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    public final java.lang.Object b() {
        long j;
        while (true) {
            defpackage.aorp aorpVar = this.b;
            long j2 = aorpVar.b;
            long j3 = 0;
            if ((j2 & 1152921504606846976L) != 0) {
                return a;
            }
            long j4 = 1073741823;
            int i = this.e;
            int i2 = ((int) ((1152921503533105152L & j2) >> 30)) & i;
            int i3 = (int) (j2 & 1073741823);
            int i4 = i & i3;
            if (i2 != i4) {
                defpackage.zzx zzxVar = this.g;
                java.lang.Object obj = zzxVar.aa(i4).a;
                if (obj == null) {
                    if (this.d) {
                    }
                } else if (!(obj instanceof defpackage.apce)) {
                    int i5 = (i3 + 1) & 1073741823;
                    if (aorpVar.c(j2, defpackage.aosv.A(j2, i5))) {
                        zzxVar.aa(i4).c(null);
                    } else if (this.d) {
                        defpackage.apcf apcfVarC = this;
                        while (true) {
                            defpackage.aorp aorpVar2 = apcfVarC.b;
                            while (true) {
                                long j5 = aorpVar2.b;
                                j = j4;
                                long j6 = j5 & j;
                                boolean z = defpackage.aosu.a;
                                if ((j5 & 1152921504606846976L) != j3) {
                                    apcfVarC = apcfVarC.c();
                                    break;
                                }
                                if (aorpVar2.c(j5, defpackage.aosv.A(j5, i5))) {
                                    apcfVarC.g.aa(((int) j6) & apcfVarC.e).c(null);
                                    apcfVarC = null;
                                    break;
                                }
                                j4 = j;
                                j3 = 0;
                            }
                            if (apcfVarC == null) {
                                break;
                            }
                            j4 = j;
                            j3 = 0;
                        }
                    }
                    return obj;
                }
            }
            return null;
        }
    }

    public final defpackage.apcf c() {
        long j;
        while (true) {
            defpackage.aorp aorpVar = this.b;
            j = aorpVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = 1152921504606846976L | j;
            if (aorpVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        defpackage.aorq aorqVar = this.f;
        while (true) {
            defpackage.apcf apcfVar = (defpackage.apcf) aorqVar.a;
            if (apcfVar != null) {
                return apcfVar;
            }
            defpackage.apcf apcfVar2 = new defpackage.apcf(this.c << 1, this.d);
            long j3 = 1152921503533105152L & j;
            int i = (int) (1073741823 & j);
            while (true) {
                int i2 = this.e;
                int i3 = i & i2;
                if (i3 != (((int) (j3 >> 30)) & i2)) {
                    java.lang.Object apceVar = this.g.aa(i3).a;
                    if (apceVar == null) {
                        apceVar = new defpackage.apce(i);
                    }
                    apcfVar2.g.aa(apcfVar2.e & i).c(apceVar);
                    i++;
                }
            }
            apcfVar2.b.b = (-1152921504606846977L) & j;
            aorqVar.d(null, apcfVar2);
        }
    }

    public final boolean d() {
        defpackage.aorp aorpVar;
        long j;
        do {
            aorpVar = this.b;
            j = aorpVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!aorpVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
