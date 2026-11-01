package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgf implements defpackage.fgv {
    public final defpackage.fgv a;
    public final defpackage.fgv b;
    private final int e;
    private byte[] f;
    private long g;
    private boolean h;
    private boolean i;
    private final defpackage.hiz j = new defpackage.hiz();
    private final defpackage.ewu c = new defpackage.ewu(1);
    private final android.util.LongSparseArray d = new android.util.LongSparseArray();

    public fgf(defpackage.fgv fgvVar, defpackage.fgv fgvVar2, defpackage.eqg eqgVar) {
        this.a = fgvVar;
        this.b = fgvVar2;
        int i = eqgVar.r;
        this.e = i != -1 ? i + 2 : 18;
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.fgv
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fgv
    public final int b(long j) {
        return this.a.b(j);
    }

    @Override // defpackage.fgv
    public final void c() {
        this.a.c();
        if (this.h) {
            return;
        }
        this.b.c();
    }

    final void d() {
        this.d.clear();
        this.f = null;
        this.g = -9223372036854775807L;
        this.h = false;
        this.i = false;
        this.c.dJ();
    }

    @Override // defpackage.fgv
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.fgv
    public final int f(defpackage.hiz hizVar, defpackage.ewu ewuVar, int i) {
        byte[] bArr;
        int length;
        int i2;
        int iF = this.a.f(hizVar, ewuVar, i);
        if (iF != -4) {
            return iF;
        }
        int i3 = 4;
        if (!ewuVar.dL(4) && (i & 4) == 0) {
            boolean z = true;
            if ((i & 1) == 0 && !this.h) {
                long j = ewuVar.f;
                byte[] bArr2 = null;
                if (!this.i) {
                    long j2 = this.g;
                    if (j2 == -9223372036854775807L || j2 <= j) {
                        while (true) {
                            defpackage.ewu ewuVar2 = this.c;
                            ewuVar2.dJ();
                            defpackage.fgv fgvVar = this.b;
                            defpackage.hiz hizVar2 = this.j;
                            int iF2 = fgvVar.f(hizVar2, ewuVar2, 0);
                            if (iF2 != -3) {
                                if (iF2 != -5) {
                                    if (!ewuVar2.dL(i3)) {
                                        long j3 = ewuVar2.f;
                                        long j4 = this.g;
                                        if (j4 != -9223372036854775807L && j3 < j4) {
                                            this.h = z;
                                            this.d.clear();
                                            this.f = bArr2;
                                        }
                                        this.g = j3;
                                        java.nio.ByteBuffer byteBuffer = ewuVar2.d;
                                        if (!this.h && byteBuffer != null) {
                                            ewuVar2.e();
                                            java.lang.Object obj = hizVar2.a;
                                            if (obj != null) {
                                                int i4 = 0;
                                                length = 0;
                                                while (true) {
                                                    java.util.List list = ((defpackage.eqg) obj).s;
                                                    if (i4 >= list.size()) {
                                                        break;
                                                    }
                                                    length += ((byte[]) list.get(i4)).length;
                                                    i4++;
                                                }
                                            } else {
                                                length = 0;
                                            }
                                            byte[] bArr3 = new byte[length + byteBuffer.remaining()];
                                            if (obj != null) {
                                                int i5 = 0;
                                                i2 = 0;
                                                while (true) {
                                                    java.util.List list2 = ((defpackage.eqg) obj).s;
                                                    if (i5 >= list2.size()) {
                                                        break;
                                                    }
                                                    byte[] bArr4 = (byte[]) list2.get(i5);
                                                    int length2 = bArr4.length;
                                                    java.lang.System.arraycopy(bArr4, 0, bArr3, i2, length2);
                                                    i2 += length2;
                                                    i5++;
                                                }
                                            } else {
                                                i2 = 0;
                                            }
                                            byteBuffer.get(bArr3, i2, byteBuffer.remaining());
                                            android.util.LongSparseArray longSparseArray = this.d;
                                            longSparseArray.put(j3, bArr3);
                                            while (longSparseArray.size() > this.e) {
                                                longSparseArray.removeAt(0);
                                            }
                                        }
                                        if (j3 > j) {
                                            break;
                                        }
                                        i3 = 4;
                                        z = true;
                                        bArr2 = null;
                                    } else {
                                        this.i = z;
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                long j5 = ewuVar.f;
                android.util.LongSparseArray longSparseArray2 = this.d;
                int size = longSparseArray2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        bArr = null;
                        break;
                    }
                    if (longSparseArray2.keyAt(size) <= j5) {
                        bArr = (byte[]) longSparseArray2.valueAt(size);
                        break;
                    }
                }
                if (bArr != null) {
                    this.f = bArr;
                }
                byte[] bArr5 = this.f;
                if (bArr5 != null) {
                    ewuVar.f(bArr5.length);
                    ewuVar.g.put(bArr5);
                    ewuVar.dK(268435456);
                }
            }
        }
        return -4;
    }
}
