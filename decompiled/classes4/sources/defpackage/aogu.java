package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogu implements defpackage.aogm {
    public int a;
    private final apoz b;
    private final apoy c;
    private final defpackage.aogp d;
    private boolean e;

    public aogu(apoz apozVar) {
        this.b = apozVar;
        apoy apoyVar = new apoy();
        this.c = apoyVar;
        this.d = new defpackage.aogp(apoyVar);
        this.a = 16384;
    }

    @Override // defpackage.aogm
    public final synchronized void a(aogy aogyVar) {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        int i = this.a;
        if ((aogyVar.a & 32) != 0) {
            i = ((int[]) aogyVar.b)[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void b() {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        java.util.logging.Logger logger = defpackage.aogv.a;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", java.lang.String.format(">> CONNECTION %s", defpackage.aogv.b.g()));
        }
        apoz apozVar = this.b;
        apozVar.aa(defpackage.aogv.b.o());
        apozVar.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void c(boolean z, int i, apoy apoyVar, int i2) {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.b.fQ(apoyVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.aogm
    public final synchronized void d() {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        this.b.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void e(boolean z, int i, int i2) {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        apoz apozVar = this.b;
        apozVar.Q(i);
        apozVar.Q(i2);
        apozVar.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void f(int i, defpackage.aogl aoglVar) {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        int i2 = aoglVar.s;
        if (i2 == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        apoz apozVar = this.b;
        apozVar.Q(i2);
        apozVar.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void g(aogy aogyVar) {
        int i;
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        int i2 = 0;
        k(0, java.lang.Integer.bitCount(aogyVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (aogyVar.c(i2)) {
                if (i2 == 4) {
                    int i3 = i2;
                    i2 = 3;
                    i = i3;
                } else {
                    i = 7;
                    if (i2 == 7) {
                        i2 = 4;
                    } else {
                        i = i2;
                    }
                }
                apoz apozVar = this.b;
                apozVar.R(i2);
                apozVar.Q(aogyVar.a(i));
                i2 = i;
            }
            i2++;
        }
        this.b.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void h(int i, long j) {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        if (j == 0) {
            throw defpackage.aogv.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        apoz apozVar = this.b;
        apozVar.Q((int) j);
        apozVar.flush();
    }

    @Override // defpackage.aogm
    public final synchronized void i(defpackage.aogl aoglVar, byte[] bArr) {
        if (this.e) {
            throw new java.io.IOException("closed");
        }
        int i = aoglVar.s;
        if (i == -1) {
            throw defpackage.aogv.d("errorCode.httpCode == -1", new java.lang.Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        apoz apozVar = this.b;
        apozVar.Q(0);
        apozVar.Q(i);
        apozVar.flush();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    @Override // defpackage.aogm
    public final synchronized void j(boolean z, int i, java.util.List list) {
        int i2;
        int i3;
        boolean z2 = this.e;
        if (z2) {
            throw new java.io.IOException("closed");
        }
        if (z2) {
            throw new java.io.IOException("closed");
        }
        defpackage.aogp aogpVar = this.d;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.aogn aognVar = (defpackage.aogn) list.get(i4);
            appb appbVarK = aognVar.f.k();
            appb appbVar = aognVar.g;
            java.lang.Integer num = (java.lang.Integer) defpackage.aogq.c.get(appbVarK);
            if (num != null) {
                int iIntValue = num.intValue();
                i3 = iIntValue + 1;
                if (i3 < 2 || i3 > 7) {
                    i2 = i3;
                    i3 = -1;
                } else {
                    defpackage.aogn[] aognVarArr = defpackage.aogq.b;
                    if (aognVarArr[iIntValue].g.equals(appbVar)) {
                        i2 = i3;
                    } else if (aognVarArr[i3].g.equals(appbVar)) {
                        i3 = iIntValue + 2;
                        i2 = i3;
                    } else {
                        i2 = i3;
                        i3 = -1;
                    }
                }
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i5 = aogpVar.d + 1;
                while (true) {
                    defpackage.aogn[] aognVarArr2 = aogpVar.b;
                    if (i5 >= aognVarArr2.length) {
                        i3 = -1;
                        break;
                    }
                    if (aognVarArr2[i5].f.equals(appbVarK)) {
                        if (aogpVar.b[i5].g.equals(appbVar)) {
                            int i6 = i5 - aogpVar.d;
                            int length = defpackage.aogq.b.length;
                            i3 = i6 + 61;
                            break;
                        } else if (i2 == -1) {
                            int i7 = i5 - aogpVar.d;
                            int length2 = defpackage.aogq.b.length;
                            i2 = i7 + 61;
                        }
                    }
                    i5++;
                }
            }
            if (i3 != -1) {
                aogpVar.c(i3, 127, 128);
            } else if (i2 == -1) {
                aogpVar.a.N(64);
                aogpVar.b(appbVarK);
                aogpVar.b(appbVar);
                aogpVar.a(aognVar);
            } else if (!appbVarK.m(defpackage.aogq.a) || defpackage.aogn.e.equals(appbVarK)) {
                aogpVar.c(i2, 63, 64);
                aogpVar.b(appbVar);
                aogpVar.a(aognVar);
            } else {
                aogpVar.c(i2, 15, 0);
                aogpVar.b(appbVar);
            }
        }
        apoy apoyVar = this.c;
        long j = apoyVar.b;
        int iMin = (int) java.lang.Math.min(this.a, j);
        long j2 = iMin;
        k(i, iMin, (byte) 1, j == j2 ? (byte) 4 : (byte) 0);
        apoz apozVar = this.b;
        apozVar.fQ(apoyVar, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int iMin2 = (int) java.lang.Math.min(this.a, j3);
                long j4 = iMin2;
                j3 -= j4;
                k(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                apozVar.fQ(apoyVar, j4);
            }
        }
    }

    final void k(int i, int i2, byte b, byte b2) {
        java.util.logging.Logger logger = defpackage.aogv.a;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", defpackage.aogs.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw defpackage.aogv.d("FRAME_SIZE_ERROR length > %d: %d", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw defpackage.aogv.d("reserved bit set: %s", java.lang.Integer.valueOf(i));
        }
        apoz apozVar = this.b;
        apozVar.O((i2 >>> 16) & 255);
        apozVar.O((i2 >>> 8) & 255);
        apozVar.O(i2 & 255);
        apozVar.O(b);
        apozVar.O(b2);
        apozVar.Q(i & Integer.MAX_VALUE);
    }
}
