package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbw {
    public java.nio.ByteBuffer A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public defpackage.epv I;
    public android.media.AudioDeviceInfo J;
    public int K;
    public long L;
    public boolean M;
    public boolean N;
    public long O;
    public long P;
    public android.os.Handler Q;
    public defpackage.fbn R;
    public anwx S;
    public anwx T;
    public final izg U;
    public rai V;
    public rai W;
    public rai X;
    private final defpackage.fbv Y;
    private long Z;
    public final android.content.Context a;
    private long aa;
    private java.nio.ByteBuffer ab;
    private java.nio.ByteBuffer ac;
    public final defpackage.fbr b;
    public final defpackage.fcf c;
    public final defpackage.esq d;
    public final defpackage.fce e;
    public final aify f;
    public final java.util.ArrayDeque g;
    public final defpackage.fbv h;
    public defpackage.fag i;
    public defpackage.fbu j;
    public defpackage.fbu k;
    public defpackage.ese l;
    public defpackage.fax m;
    public defpackage.epu n;
    public defpackage.erc o;
    public boolean p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public float z;

    public fbw(defpackage.fbt fbtVar) {
        android.content.Context context;
        android.content.Context context2 = fbtVar.a;
        this.a = context2 == null ? null : context2.getApplicationContext();
        this.n = defpackage.epu.a;
        this.U = fbtVar.g;
        this.m = fbtVar.e;
        defpackage.fbr fbrVar = new defpackage.fbr();
        this.b = fbrVar;
        this.c = new defpackage.fcf();
        this.d = new defpackage.esq();
        this.e = new defpackage.fce();
        this.f = aify.p(fbrVar);
        this.ab = defpackage.esj.a;
        this.z = 1.0f;
        this.G = 0;
        this.I = new defpackage.epv();
        defpackage.erc ercVar = defpackage.erc.a;
        this.T = new anwx(ercVar, 0L, 0L);
        this.o = ercVar;
        this.p = false;
        this.g = new java.util.ArrayDeque();
        this.h = new defpackage.fbv(this);
        this.Y = new defpackage.fbv(this);
        int iB = -1;
        if (android.os.Build.VERSION.SDK_INT >= 34 && (context = fbtVar.a) != null) {
            iB = b(rp$.ExternalSyntheticApiModelOutline0.m(context));
        }
        this.K = iB;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0267  */
    /* JADX WARN: Code duplicated, block: B:102:0x026e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[PHI: r11
      0x00d3: PHI (r11v56 double) = (r11v55 double), (r11v67 double) binds: [B:42:0x00d1, B:34:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[PHI: r11
      0x00d9: PHI (r11v61 double) = (r11v55 double), (r11v67 double) binds: [B:42:0x00d1, B:34:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x016f A[PHI: r11
      0x016f: PHI (r11v26 float) = (r11v25 float), (r11v63 float) binds: [B:54:0x016d, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0174 A[PHI: r11
      0x0174: PHI (r11v31 float) = (r11v25 float), (r11v63 float) binds: [B:54:0x016d, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x019b  */
    /* JADX WARN: Code duplicated, block: B:65:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Code duplicated, block: B:95:0x021a  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:97:0x023a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0251  */
    /* JADX WARN: Code duplicated, block: B:99:0x0264  */
    private final void A(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        double d;
        float fA;
        float f4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double dAd;
        double d2;
        ahvr.bY(this.ac == null);
        if (byteBuffer.hasRemaining()) {
            if (this.k.c()) {
                int iT = (int) eum.t(eum.w(20L), this.k.e.b);
                long jC = c();
                long j = iT;
                if (jC < j) {
                    defpackage.fbu fbuVar = this.k;
                    int i12 = fbuVar.e.a;
                    int i13 = fbuVar.d;
                    java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining()).order(java.nio.ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i14 = (int) jC;
                    while (byteBuffer.hasRemaining() && i14 < iT) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i3 = ((byteBuffer.get() & 255) - 128) << 24;
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    if (i12 == 22) {
                                        i8 = byteBuffer.get() & 255;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    } else if (i12 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i12 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else if (i12 != 1610612736) {
                                        if (i12 == 1879048192) {
                                            dAd = eum.ad(byteBuffer.getDouble());
                                            if (dAd < 0.0d) {
                                                d2 = (-dAd) * (-2.147483648E9d);
                                            } else {
                                                d2 = dAd * 2.147483647E9d;
                                            }
                                        } else if (i12 == 1895825408) {
                                            fA = eum.a(java.lang.Float.intBitsToFloat(java.lang.Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                            if (fA < 0.0f) {
                                                f4 = (-fA) * (-2.1474836E9f);
                                            } else {
                                                f4 = fA * 2.1474836E9f;
                                            }
                                            i3 = (int) f4;
                                        } else {
                                            if (i12 != 1912602624) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            dAd = eum.ad(java.lang.Double.longBitsToDouble(java.lang.Long.reverseBytes(byteBuffer.getLong())));
                                            if (dAd < 0.0d) {
                                                d2 = (-dAd) * (-2.147483648E9d);
                                            } else {
                                                d2 = dAd * 2.147483647E9d;
                                            }
                                        }
                                        i3 = (int) d2;
                                    } else {
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = byteBuffer.get() & 255;
                                    }
                                    i3 = i8 | i9 | i10 | i11;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                fA = eum.a(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fA < 0.0f) {
                                    f4 = (-fA) * (-2.1474836E9f);
                                } else {
                                    f4 = fA * 2.1474836E9f;
                                }
                                i3 = (int) f4;
                            }
                            i4 = (int) ((((long) i3) * ((long) i14)) / j);
                            if (i12 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 3) {
                                byteBufferOrder.put((byte) ((i4 >> 24) + 128));
                            } else if (i12 != 4) {
                                f = i4;
                                if (i4 < 0) {
                                    byteBufferOrder.putFloat((-f) / (-2.1474836E9f));
                                } else {
                                    byteBufferOrder.putFloat(f / 2.1474836E9f);
                                }
                            } else if (i12 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i12 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i12 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i12 != 1879048192) {
                                if (i12 != 1895825408) {
                                    f2 = i4;
                                    if (i4 < 0) {
                                        f3 = (-f2) / (-2.1474836E9f);
                                    } else {
                                        f3 = f2 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(java.lang.Integer.reverseBytes(java.lang.Float.floatToIntBits(f3)));
                                } else {
                                    if (i12 == 1912602624) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(java.lang.Long.reverseBytes(java.lang.Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                            if (byteBuffer.position() == iPosition + i13) {
                                i14++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i14)) / j);
                        if (i12 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 3) {
                            byteBufferOrder.put((byte) ((i4 >> 24) + 128));
                        } else if (i12 != 4) {
                            f = i4;
                            if (i4 < 0) {
                                byteBufferOrder.putFloat((-f) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(f / 2.1474836E9f);
                            }
                        } else if (i12 != 21) {
                            byteBufferOrder.put((byte) (i4 >> 8));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 22) {
                            byteBufferOrder.put((byte) i4);
                            byteBufferOrder.put((byte) (i4 >> 8));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 268435456) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                            byteBufferOrder.put((byte) (i4 >> 16));
                        } else if (i12 != 1342177280) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 8));
                        } else if (i12 != 1610612736) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 8));
                            byteBufferOrder.put((byte) i4);
                        } else if (i12 != 1879048192) {
                            if (i12 != 1895825408) {
                                f2 = i4;
                                if (i4 < 0) {
                                    f3 = (-f2) / (-2.1474836E9f);
                                } else {
                                    f3 = f2 / 2.1474836E9f;
                                }
                                byteBufferOrder.putInt(java.lang.Integer.reverseBytes(java.lang.Float.floatToIntBits(f3)));
                            } else {
                                if (i12 == 1912602624) {
                                    throw new java.lang.IllegalStateException();
                                }
                                if (i4 < 0) {
                                    d = (-i4) / (-2.147483648E9d);
                                } else {
                                    d = ((double) i4) / 2.147483647E9d;
                                }
                                byteBufferOrder.putLong(java.lang.Long.reverseBytes(java.lang.Double.doubleToLongBits(d)));
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                        } else {
                            byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                        }
                        if (byteBuffer.position() == iPosition + i13) {
                            i14++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.ac = byteBuffer2;
        }
    }

    private final void B(long j) {
        long jA;
        defpackage.fbu fbuVar = this.k;
        this.l = fbuVar.f;
        if (j == -9223372036854775807L) {
            jA = 0;
        } else {
            jA = j - this.y;
            if (fbuVar.g != defpackage.erm.a && this.k.h != null) {
                defpackage.erk erkVar = new defpackage.erk();
                defpackage.fbu fbuVar2 = this.k;
                fbuVar2.g.m(fbuVar2.h, erkVar);
            }
        }
        if (this.k.c()) {
            jA = this.c.a(jA);
        }
        defpackage.esg esgVar = new defpackage.esg();
        defpackage.fbu fbuVar3 = this.k;
        esgVar.b = fbuVar3.g;
        esgVar.c = fbuVar3.h;
        esgVar.a = jA;
        defpackage.esh eshVarA = esgVar.a();
        defpackage.ese eseVar = this.l;
        java.util.List list = eseVar.b;
        list.clear();
        eseVar.e = false;
        int i = 0;
        while (true) {
            aike aikeVar = eseVar.a;
            if (i >= aikeVar.d) {
                break;
            }
            defpackage.esj esjVar = (defpackage.esj) aikeVar.get(i);
            esjVar.i();
            if (esjVar.g()) {
                defpackage.esg esgVar2 = new defpackage.esg(eshVarA);
                esgVar2.a = esjVar.a(eshVarA.a);
                eshVarA = esgVar2.a();
                list.add(esjVar);
            }
            i++;
        }
        eseVar.c = new java.nio.ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= eseVar.a(); i2++) {
            eseVar.c[i2] = ((defpackage.esj) list.get(i2)).c();
        }
    }

    private final boolean C() {
        return this.c.g() || this.ab.hasRemaining();
    }

    private final boolean D() {
        if (!this.k.c()) {
            return false;
        }
        int i = this.k.a.K;
        return true;
    }

    private final void E() throws java.lang.Exception {
        rai raiVar;
        rai raiVar2;
        if (this.ac == null || this.Y.c()) {
            return;
        }
        int iRemaining = this.ac.remaining();
        boolean z = false;
        try {
            defpackage.fbn fbnVar = this.R;
            java.nio.ByteBuffer byteBuffer = this.ac;
            int i = this.B;
            boolean z2 = fbnVar.i;
            if (!z2 && fbnVar.o == 0) {
                fbnVar.o = defpackage.hgu.aj(fbnVar.e.a, byteBuffer);
            }
            defpackage.eto etoVar = fbnVar.k;
            if (etoVar.g()) {
                int iM = fh$.ExternalSyntheticApiModelOutline0.m(fbnVar.d);
                int i2 = fbnVar.p;
                fbnVar.p = iM;
                if (iM > i2) {
                    etoVar.e(-1, new defpackage.ezt(9));
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            defpackage.faw fawVar = fbnVar.e;
            int iWrite = fbnVar.d.write(byteBuffer, byteBuffer.remaining(), 1);
            if (iWrite < 0) {
                boolean z3 = iWrite == -6 || iWrite == -32;
                if (z3 && (raiVar2 = fbnVar.q) != null) {
                    java.lang.Object obj = raiVar2.a;
                    if (((defpackage.fbp) obj).c != null) {
                        defpackage.fai faiVar = defpackage.fai.a;
                        ((defpackage.fbp) obj).b = faiVar;
                        ((defpackage.fbp) obj).c.b(faiVar);
                    }
                }
                throw new defpackage.fao(iWrite, z3);
            }
            boolean z4 = iWrite == iRemaining2;
            if (z2) {
                fbnVar.m += (long) iWrite;
            } else if (z4) {
                fbnVar.n += ((long) fbnVar.o) * ((long) i);
            }
            this.L = android.os.SystemClock.elapsedRealtime();
            this.Y.a();
            if (this.R.f()) {
                if (this.aa > 0) {
                    this.N = false;
                }
                if (this.F && (raiVar = this.V) != null && !z4) {
                }
            }
            int iRemaining3 = iRemaining - this.ac.remaining();
            if (this.k.c()) {
                this.Z += (long) iRemaining3;
            }
            defpackage.fbu fbuVar = this.k;
            if (z4) {
                if (!fbuVar.c()) {
                    ahvr.bY(this.ac == this.A);
                    this.aa += (((long) this.s) * ((long) this.B)) - this.u;
                    this.u = 0L;
                }
                this.ac = null;
                return;
            }
            if (fbuVar.c() || iRemaining3 <= 0) {
                return;
            }
            ahvr.bY(this.t > 0);
            long jA = eum.A(this.t - this.ac.remaining(), ((long) this.s) * ((long) this.B), this.t, java.math.RoundingMode.CEILING);
            this.aa += jA - this.u;
            this.u = jA;
        } catch (defpackage.fao e) {
            boolean z5 = e.b;
            if (z5) {
                if (c() > 0) {
                    z = true;
                } else if (this.R.f()) {
                    i();
                    z = true;
                }
            }
            defpackage.fbd fbdVar = new defpackage.fbd(e.a, this.k.a, z);
            rai raiVar3 = this.V;
            if (raiVar3 != null) {
                raiVar3.u(fbdVar);
            }
            if (z5) {
                throw fbdVar;
            }
            this.Y.b(fbdVar);
        }
    }

    public static int b(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    private final java.nio.ByteBuffer z() {
        if (!C()) {
            java.nio.ByteBuffer byteBuffer = this.A;
            return byteBuffer == null ? defpackage.esj.a : byteBuffer;
        }
        while (!this.ab.hasRemaining()) {
            defpackage.fcf fcfVar = this.c;
            if (fcfVar.h()) {
                break;
            }
            java.nio.ByteBuffer byteBufferC = fcfVar.c();
            this.ab = byteBufferC;
            if (!byteBufferC.hasRemaining()) {
                java.nio.ByteBuffer byteBuffer2 = this.A;
                if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                    return defpackage.esj.a;
                }
                fcfVar.e(this.A);
            }
        }
        return this.ab;
    }

    public final int a(defpackage.eqg eqgVar) {
        boolean z;
        int i = eqgVar.K;
        if (!eum.U(i) || i == 2) {
            z = false;
        } else {
            defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
            eqfVar.I = 2;
            eqgVar = new defpackage.eqg(eqfVar);
            z = true;
        }
        int i2 = this.m.a(y(eqgVar)).d;
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long c() {
        if (!this.k.c()) {
            return this.aa;
        }
        long j = this.Z;
        long j2 = this.k.d;
        java.lang.String str = eum.a;
        return ((j + j2) - 1) / j2;
    }

    public final void d(long j) {
        defpackage.erc ercVar;
        boolean z = false;
        if (D()) {
            izg izgVar = this.U;
            ercVar = this.o;
            float f = ercVar.b;
            ahvr.bM(f > 0.0f);
            defpackage.esp espVar = (defpackage.esp) izgVar.b;
            if (espVar.b != f) {
                espVar.b = f;
                espVar.f = true;
            }
            float f2 = ercVar.c;
            ahvr.bM(f2 > 0.0f);
            if (espVar.c != f2) {
                espVar.c = f2;
                espVar.f = true;
            }
        } else {
            ercVar = defpackage.erc.a;
        }
        defpackage.erc ercVar2 = ercVar;
        this.o = ercVar2;
        if (D()) {
            izg izgVar2 = this.U;
            z = this.p;
            ((defpackage.fcc) izgVar2.a).d = z;
        }
        this.p = z;
        this.g.add(new anwx(ercVar2, java.lang.Math.max(0L, j), this.k.a(c())));
        B(j);
        rai raiVar = this.V;
        if (raiVar != null) {
            boolean z2 = this.p;
            ils ilsVar = ((defpackage.fca) raiVar.a).q;
            java.lang.Object obj = ilsVar.b;
            if (obj != null) {
                ((android.os.Handler) obj).post(new defpackage.gql(ilsVar, z2, 1));
            }
        }
    }

    public final void e() {
        defpackage.fbu fbuVar = this.k;
        if (fbuVar == null || !fbuVar.c()) {
            return;
        }
        defpackage.fcf fcfVar = this.c;
        defpackage.fbu fbuVar2 = this.k;
        fcfVar.p(fbuVar2.i, fbuVar2.j);
        try {
            fcfVar.b(new defpackage.esf(this.k.a));
        } catch (defpackage.esi e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public final void f(boolean z) {
        boolean z2;
        defpackage.fbu fbuVar = this.j;
        if (fbuVar != null) {
            this.k = fbuVar;
            this.j = null;
            z2 = true;
        } else {
            z2 = false;
        }
        defpackage.fbu fbuVar2 = this.k;
        if (fbuVar2 != null) {
            if (z) {
                defpackage.eqg eqgVar = fbuVar2.a;
                fbuVar2.i = eqgVar.L;
                fbuVar2.j = eqgVar.M;
            }
            if (z2) {
                e();
            } else if (fbuVar2.c()) {
                defpackage.fcf fcfVar = this.c;
                defpackage.fbu fbuVar3 = this.k;
                fcfVar.p(fbuVar3.i, fbuVar3.j);
            }
        }
        this.c.d = 0L;
        if (v()) {
            this.q = 0L;
            this.r = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.N = false;
            this.s = 0;
            this.t = 0;
            this.u = 0L;
            this.T = new anwx(this.o, 0L, 0L);
            this.x = 0L;
            this.S = null;
            this.g.clear();
            this.A = null;
            this.B = 0;
            this.ac = null;
            this.D = false;
            this.C = false;
            this.E = false;
            g();
            B(-9223372036854775807L);
            this.W = null;
            defpackage.fbn fbnVar = this.R;
            android.media.AudioTrack audioTrack = fbnVar.h.c;
            ahvr.ci(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                fbnVar.d.pause();
            }
            if (fbnVar.f()) {
                defpackage.fbm fbmVar = fbnVar.j;
                ahvr.ci(fbmVar);
                fn$.ExternalSyntheticApiModelOutline0.m(fbmVar.c.d, fbmVar.b);
                fbmVar.a.removeCallbacksAndMessages(null);
            }
            defpackage.fbi fbiVar = fbnVar.g;
            if (fbiVar != null) {
                android.media.AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = fbiVar.c;
                ahvr.ci(audioRouting$OnRoutingChangedListener);
                fh$.ExternalSyntheticApiModelOutline0.m(fbiVar.a, audioRouting$OnRoutingChangedListener);
                fbiVar.c = null;
                fbnVar.g = null;
            }
            android.media.AudioTrack audioTrack2 = fbnVar.d;
            defpackage.eto etoVar = fbnVar.k;
            android.os.Handler handlerAh = eum.ah();
            boolean z3 = defpackage.eqe.b(9) || fn$.ExternalSyntheticApiModelOutline0.m(audioTrack2);
            synchronized (defpackage.fbn.a) {
                if (defpackage.fbn.b == null) {
                    defpackage.fbn.b = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new defpackage.eul(0));
                }
                defpackage.fbn.c++;
                defpackage.fbn.b.schedule((java.lang.Runnable) new pqh(z3, audioTrack2, handlerAh, etoVar, 1), 20L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            this.R = null;
        }
        this.Y.a();
        this.h.a();
        this.O = 0L;
        this.P = 0L;
        android.os.Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void g() {
        this.ab = defpackage.esj.a;
        boolean zC = this.k.c();
        defpackage.fcf fcfVar = this.c;
        if (!zC) {
            fcfVar.f();
        } else {
            int i = defpackage.esh.d;
            fcfVar.i();
        }
    }

    public final void h() {
        this.v = true;
    }

    public final void i() {
        if (this.k.e.d) {
            this.M = true;
        }
    }

    public final void j() {
        this.F = true;
        if (v()) {
            defpackage.fbn fbnVar = this.R;
            defpackage.fbq fbqVar = fbnVar.h;
            if (fbqVar.q != -9223372036854775807L) {
                defpackage.etc etcVar = fbqVar.a;
                fbqVar.q = eum.w(android.os.SystemClock.elapsedRealtime());
            }
            fbqVar.i = fbqVar.c();
            fbqVar.x = true;
            fbqVar.g.c(0);
            if (!fbnVar.l || fbnVar.f()) {
                fbnVar.d.play();
            }
        }
    }

    public final void k() {
        if (this.D) {
            return;
        }
        this.D = true;
        if (this.R.f()) {
            this.E = false;
        }
        defpackage.fbn fbnVar = this.R;
        if (fbnVar.l) {
            return;
        }
        fbnVar.l = true;
        defpackage.fbq fbqVar = fbnVar.h;
        long jD = fbnVar.d();
        fbqVar.s = fbqVar.a();
        defpackage.etc etcVar = fbqVar.a;
        fbqVar.q = eum.w(android.os.SystemClock.elapsedRealtime());
        fbqVar.t = jD;
        fbnVar.d.stop();
    }

    public final void l(long j) throws java.lang.Exception {
        E();
        if (this.ac == null) {
            if (!this.l.e()) {
                do {
                    java.nio.ByteBuffer byteBufferZ = z();
                    if (!byteBufferZ.hasRemaining()) {
                        return;
                    }
                    A(byteBufferZ);
                    E();
                } while (this.ac == null);
                return;
            }
            while (!this.l.d()) {
                java.nio.ByteBuffer byteBufferB = this.l.b();
                while (byteBufferB.hasRemaining()) {
                    A(byteBufferB);
                    E();
                    if (this.ac != null) {
                        return;
                    } else {
                        byteBufferB = this.l.b();
                    }
                }
                java.nio.ByteBuffer byteBufferZ2 = z();
                if (!byteBufferZ2.hasRemaining()) {
                    return;
                }
                defpackage.ese eseVar = this.l;
                if (eseVar.e() && !eseVar.e) {
                    eseVar.c(byteBufferZ2);
                }
            }
        }
    }

    public final void m() {
        f(false);
        defpackage.fbu fbuVar = this.k;
        if (fbuVar != null) {
            try {
                this.k = this.k.b(this.m.b(y(fbuVar.b)));
            } catch (defpackage.fap e) {
                throw new java.lang.IllegalStateException(new defpackage.fba(e, this.k.a));
            }
        }
    }

    public final void n() {
        f(true);
        int i = 0;
        while (true) {
            aike aikeVar = this.f;
            if (i >= aikeVar.d) {
                break;
            }
            ((defpackage.esj) aikeVar.get(i)).f();
            i++;
        }
        this.c.f();
        this.d.f();
        this.e.f();
        this.ab = defpackage.esj.a;
        defpackage.ese eseVar = this.l;
        if (eseVar != null) {
            int i2 = 0;
            while (true) {
                aike aikeVar2 = eseVar.a;
                if (i2 >= aikeVar2.d) {
                    break;
                }
                defpackage.esj esjVar = (defpackage.esj) aikeVar2.get(i2);
                int i3 = defpackage.esh.d;
                esjVar.i();
                esjVar.f();
                i2++;
            }
            eseVar.b.clear();
            eseVar.c = new java.nio.ByteBuffer[0];
            defpackage.esf esfVar = defpackage.esf.a;
            eseVar.d = defpackage.esf.a;
            eseVar.e = false;
        }
        this.F = false;
        this.M = false;
    }

    public final void o(defpackage.erc ercVar) {
        anwx anwxVar = new anwx(ercVar, -9223372036854775807L, -9223372036854775807L);
        if (v()) {
            this.S = anwxVar;
        } else {
            this.T = anwxVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final void p(int i) {
        ahvr.bM((boolean) ((i ^ (-1)) >>> 31));
        defpackage.fbu fbuVar = this.j;
        if (fbuVar == null) {
            fbuVar = this.k;
        }
        if (fbuVar == null || !fbuVar.c()) {
            return;
        }
        fbuVar.j = i;
        defpackage.fbu fbuVar2 = this.k;
        if (fbuVar == fbuVar2) {
            this.c.p(fbuVar2.i, i);
        }
    }

    public final void q() {
        if (v()) {
            defpackage.fbn fbnVar = this.R;
            fbnVar.d.setVolume(this.z);
        }
    }

    public final boolean r() throws java.lang.Exception {
        if (this.ab.hasRemaining()) {
            l(Long.MIN_VALUE);
            if (this.ab.hasRemaining()) {
                return false;
            }
        }
        if (this.l.e()) {
            defpackage.ese eseVar = this.l;
            if (eseVar.e() && !eseVar.e) {
                eseVar.e = true;
                ((defpackage.esj) eseVar.b.get(0)).d();
            }
            l(Long.MIN_VALUE);
            if (!this.l.d() || this.ac != null) {
                return false;
            }
        } else {
            E();
            if (this.ac != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4.ac == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r4.C()
            if (r0 == 0) goto L43
            r0 = -9223372036854775808
            r4.l(r0)
            java.nio.ByteBuffer r2 = r4.A
            if (r2 == 0) goto L15
            boolean r2 = r2.hasRemaining()
            if (r2 != 0) goto L41
        L15:
            java.nio.ByteBuffer r2 = r4.ab
            boolean r2 = r2.hasRemaining()
            if (r2 != 0) goto L41
            java.nio.ByteBuffer r2 = r4.ac
            if (r2 != 0) goto L41
            fcf r2 = r4.c
            boolean r3 = r2.h()
            if (r3 != 0) goto L2f
            r2.d()
            r4.l(r0)
        L2f:
            boolean r0 = r2.h()
            if (r0 == 0) goto L41
            java.nio.ByteBuffer r0 = r4.ab
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L41
            java.nio.ByteBuffer r0 = r4.ac
            if (r0 == 0) goto L43
        L41:
            r4 = 0
            goto L47
        L43:
            boolean r4 = r4.r()
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbw.s():boolean");
    }

    public final boolean t() {
        return this.m.e();
    }

    public final boolean u() {
        if (v() && (!this.R.f() || !this.E)) {
            long jC = c();
            long jC2 = this.R.c();
            defpackage.fbn fbnVar = this.R;
            ahvr.ci(fbnVar);
            if (jC > eum.t(jC2, fbnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.R != null;
    }

    public final boolean w(defpackage.eqg eqgVar) {
        return a(eqgVar) != 0;
    }

    public final defpackage.fbn x(defpackage.faw fawVar) throws defpackage.fbb {
        try {
            return this.m.f(fawVar);
        } catch (defpackage.fau e) {
            defpackage.fbb fbbVar = new defpackage.fbb(fawVar.b, fawVar.c, fawVar.a, fawVar.e, this.k.a, fawVar.d, e);
            rai raiVar = this.V;
            if (raiVar != null) {
                raiVar.u(fbbVar);
            }
            throw fbbVar;
        }
    }

    public final defpackage.far y(defpackage.eqg eqgVar) {
        defpackage.faq faqVar = new defpackage.faq(eqgVar);
        faqVar.b = this.n;
        faqVar.c = this.J;
        faqVar.d = this.G;
        faqVar.f = -1;
        faqVar.e = this.K;
        return new defpackage.far(faqVar);
    }
}
