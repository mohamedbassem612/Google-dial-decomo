package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class frn implements defpackage.flj {
    private final defpackage.frt c;
    private defpackage.fmk f;
    private int g;
    private byte[] e = eum.b;
    private final defpackage.etx d = new defpackage.etx();
    public final java.util.List a = new java.util.ArrayList();
    private int h = 0;
    private long[] i = eum.c;
    public long b = -9223372036854775807L;

    public frn(defpackage.frt frtVar) {
        this.c = frtVar;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        ahvr.bY(this.h == 0);
        this.f = fllVar.r(0, 3);
        this.h = 1;
    }

    @Override // defpackage.flj
    public final void c() {
        if (this.h != 5) {
            this.c.c();
            this.h = 5;
        }
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        int i = this.h;
        boolean z = false;
        if (i != 0 && i != 5) {
            z = true;
        }
        ahvr.bY(z);
        this.b = j2;
        int i2 = this.h;
        if (i2 == 2) {
            this.h = 1;
        } else if (i2 == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: RuntimeException -> 0x00de, TryCatch #0 {RuntimeException -> 0x00de, blocks: (B:32:0x0077, B:34:0x007d, B:36:0x0085, B:37:0x00b2, B:39:0x00b8, B:40:0x00c7, B:42:0x00cf, B:43:0x00d7, B:35:0x0083), top: B:69:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: RuntimeException -> 0x00de, TryCatch #0 {RuntimeException -> 0x00de, blocks: (B:32:0x0077, B:34:0x007d, B:36:0x0085, B:37:0x00b2, B:39:0x00b8, B:40:0x00c7, B:42:0x00cf, B:43:0x00d7, B:35:0x0083), top: B:69:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[Catch: RuntimeException -> 0x00de, LOOP:1: B:37:0x00b2->B:39:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00de, blocks: (B:32:0x0077, B:34:0x007d, B:36:0x0085, B:37:0x00b2, B:39:0x00b8, B:40:0x00c7, B:42:0x00cf, B:43:0x00d7, B:35:0x0083), top: B:69:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf A[Catch: RuntimeException -> 0x00de, TryCatch #0 {RuntimeException -> 0x00de, blocks: (B:32:0x0077, B:34:0x007d, B:36:0x0085, B:37:0x00b2, B:39:0x00b8, B:40:0x00c7, B:42:0x00cf, B:43:0x00d7, B:35:0x0083), top: B:69:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119 A[LOOP:0: B:61:0x0111->B:63:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0077 A[EXC_TOP_SPLITTER, PHI: r16
      0x0077: PHI (r16v3 long) = (r16v4 long), (r16v5 long) binds: [B:31:0x0075, B:28:0x0070] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0125 A[EDGE_INSN: B:71:0x0125->B:64:0x0125 BREAK  A[LOOP:0: B:61:0x0111->B:63:0x0119], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        long j;
        long j2;
        int iP;
        long j3;
        int iAc;
        java.util.List list;
        long j4;
        defpackage.frs frsVar;
        java.util.concurrent.atomic.AtomicLong atomicLong;
        java.util.List list2;
        int i;
        int i2 = this.h;
        ahvr.bY((i2 == 0 || i2 == 5) ? false : true);
        int i3 = this.h;
        if (i3 != 1) {
            if (i3 != 2) {
                j = -1;
            }
            if (this.h == 3) {
                j2 = ((defpackage.flc) flkVar).a;
                if (j2 != j) {
                    iP = aiql.P(j2);
                } else {
                    iP = 1024;
                }
                if (flkVar.c(iP) == -1) {
                    j3 = this.b;
                    if (j3 == -9223372036854775807L) {
                        iAc = 0;
                    } else {
                        iAc = eum.ac(this.i, j3, true);
                    }
                    while (true) {
                        list = this.a;
                        if (iAc >= list.size()) {
                            break;
                        }
                        h((defpackage.frm) list.get(iAc));
                        iAc++;
                    }
                    this.h = 4;
                }
            }
            if (this.h == 4) {
                return -1;
            }
            return 0;
        }
        long j5 = ((defpackage.flc) flkVar).a;
        int iP2 = j5 != -1 ? aiql.P(j5) : 1024;
        if (iP2 > this.e.length) {
            this.e = new byte[iP2];
        }
        this.g = 0;
        this.h = 2;
        byte[] bArrCopyOf = this.e;
        int length = bArrCopyOf.length;
        if (length == this.g) {
            bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, length + 1024);
            this.e = bArrCopyOf;
        }
        int i4 = this.g;
        int iA = flkVar.a(bArrCopyOf, i4, bArrCopyOf.length - i4);
        if (iA != -1) {
            this.g += iA;
        }
        long j6 = ((defpackage.flc) flkVar).a;
        if (j6 != -1) {
            j = -1;
            if (this.g == j6) {
                try {
                    j4 = this.b;
                    if (j4 != -9223372036854775807L) {
                        frsVar = new defpackage.frs(j4, true);
                    } else {
                        frsVar = defpackage.frs.a;
                    }
                    defpackage.frs frsVar2 = frsVar;
                    atomicLong = new java.util.concurrent.atomic.AtomicLong(-9223372036854775807L);
                    this.c.b(this.e, 0, this.g, frsVar2, new defpackage.rh(this, atomicLong, 3));
                    list2 = this.a;
                    java.util.Collections.sort(list2);
                    this.i = new long[list2.size()];
                    for (i = 0; i < list2.size(); i++) {
                        this.i[i] = ((defpackage.frm) list2.get(i)).a;
                    }
                    if (atomicLong.get() != -9223372036854775807L) {
                        ahvr.ci(this.f);
                        atomicLong.get();
                    }
                    this.e = eum.b;
                    this.h = 4;
                } catch (java.lang.RuntimeException e) {
                    throw new defpackage.era("SubtitleParser failed.", e, true, 1);
                }
            }
            if (this.h == 3) {
                j2 = ((defpackage.flc) flkVar).a;
                if (j2 != j) {
                    iP = aiql.P(j2);
                } else {
                    iP = 1024;
                }
                if (flkVar.c(iP) == -1) {
                    j3 = this.b;
                    if (j3 == -9223372036854775807L) {
                        iAc = 0;
                    } else {
                        iAc = eum.ac(this.i, j3, true);
                    }
                    while (true) {
                        list = this.a;
                        if (iAc >= list.size()) {
                            break;
                            break;
                        }
                        h((defpackage.frm) list.get(iAc));
                        iAc++;
                    }
                    this.h = 4;
                }
            }
            if (this.h == 4) {
                return -1;
            }
            return 0;
        }
        j = -1;
        if (iA == -1) {
            j4 = this.b;
            if (j4 != -9223372036854775807L) {
                frsVar = new defpackage.frs(j4, true);
            } else {
                frsVar = defpackage.frs.a;
            }
            defpackage.frs frsVar3 = frsVar;
            atomicLong = new java.util.concurrent.atomic.AtomicLong(-9223372036854775807L);
            this.c.b(this.e, 0, this.g, frsVar3, new defpackage.rh(this, atomicLong, 3));
            list2 = this.a;
            java.util.Collections.sort(list2);
            this.i = new long[list2.size()];
            while (i < list2.size()) {
                this.i[i] = ((defpackage.frm) list2.get(i)).a;
            }
            if (atomicLong.get() != -9223372036854775807L) {
                ahvr.ci(this.f);
                atomicLong.get();
            }
            this.e = eum.b;
            this.h = 4;
        }
        if (this.h == 3) {
            j2 = ((defpackage.flc) flkVar).a;
            if (j2 != j) {
                iP = aiql.P(j2);
            } else {
                iP = 1024;
            }
            if (flkVar.c(iP) == -1) {
                j3 = this.b;
                if (j3 == -9223372036854775807L) {
                    iAc = 0;
                } else {
                    iAc = eum.ac(this.i, j3, true);
                }
                while (true) {
                    list = this.a;
                    if (iAc >= list.size()) {
                        break;
                        break;
                    }
                    h((defpackage.frm) list.get(iAc));
                    iAc++;
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return 0;
    }

    public final void h(defpackage.frm frmVar) {
        ahvr.ci(this.f);
        byte[] bArr = frmVar.b;
        int length = bArr.length;
        defpackage.etx etxVar = this.d;
        etxVar.N(bArr);
        this.f.b(etxVar, length);
        this.f.d(frmVar.a, 1, length, 0, null);
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
