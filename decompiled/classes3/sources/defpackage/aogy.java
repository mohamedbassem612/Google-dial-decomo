package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aogy {
    public int a;
    public final java.lang.Object b;

    public aogy(char[] cArr) {
        this.a = 300;
        aco acoVar = acp.a;
        this.b = new aco(6);
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final boolean c(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public final void d(int i, int i2) {
        if (i < 10) {
            this.a |= 1 << i;
            ((int[]) this.b)[i] = i2;
        }
    }

    public final void e(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.a;
            this.a = i3 + 1;
            ((byte[]) this.b)[i3] = z ? (byte) 1 : (byte) 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final int f() {
        int i = this.a;
        if (i >= 0) {
            ?? r1 = this.b;
            if (i < r1.length()) {
                char cCharAt = r1.charAt(this.a);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    this.a++;
                    return cCharAt - '0';
                }
                throw new java.lang.IllegalArgumentException("non-digit character '" + cCharAt + "' [" + ((int) cCharAt) + "] at index " + this.a + " in: " + java.lang.String.valueOf((java.lang.Object) r1));
            }
        }
        throw new java.lang.IndexOutOfBoundsException("index '" + this.a + "' out of bounds for input: " + java.lang.String.valueOf(this.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final boolean g() {
        return this.a < this.b.length();
    }

    public final char h() {
        return ((java.lang.String) this.b).charAt(this.a);
    }

    public final char i() {
        char cH = h();
        this.a++;
        return cH;
    }

    public final void j(char c) {
        if (i() == c) {
            return;
        }
        throw new java.lang.IllegalStateException("unexpected character " + ((java.lang.String) this.b).charAt(this.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final int k() {
        java.util.Iterator it = this.b.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC += ((akzc) it.next()).c();
        }
        return iC - this.a;
    }

    public final akzc l(int i) {
        if (k() < i) {
            throw new java.lang.IllegalStateException("insufficient data in queue");
        }
        akzc akzcVar = akzc.d;
        defpackage.akzb akzbVar = new defpackage.akzb(128);
        while (akzbVar.a() < i) {
            int iA = i - akzbVar.a();
            aojw aojwVar = (aojw) this.b;
            if (((akzc) aojwVar.a()).c() - this.a < iA) {
                ((akzc) aojwVar.removeFirst()).x(this.a).m(akzbVar);
                this.a = 0;
            } else {
                akzc akzcVar2 = (akzc) aojwVar.a();
                int i2 = this.a;
                akzcVar2.e(i2, i2 + iA).m(akzbVar);
                this.a += iA;
            }
        }
        akzc akzcVarB = akzbVar.b();
        aooh.e(akzcVarB, "toByteString(...)");
        return akzcVarB;
    }

    public final long m(flk flkVar) {
        int i;
        etx etxVar = (etx) this.b;
        flc flcVar = (flc) flkVar;
        int i2 = 0;
        flcVar.n(etxVar.b, 0, 1, false);
        int i3 = etxVar.b[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        flcVar.n(etxVar.b, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (i6 << 8) + (etxVar.b[i2] & 255);
        }
        this.a += i;
        return i6;
    }

    public final ajz n(java.lang.Object obj, int i) {
        ajz ajzVar = new ajz(obj, ajk.d);
        ((aco) this.b).g(i, ajzVar);
        return ajzVar;
    }

    public final void o(java.lang.Object obj, float f) {
        n(obj, java.lang.Math.round(this.a * f));
    }

    public final java.lang.Object p() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        java.lang.Object[] objArr = (java.lang.Object[]) this.b;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void q(java.lang.Object obj) {
        int i = this.a;
        if (i < 256) {
            ((java.lang.Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public aogy(java.lang.CharSequence charSequence) {
        this.a = 0;
        this.b = charSequence;
    }

    public aogy(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = new java.lang.Object[256];
    }

    public aogy(int i) {
        this.b = new byte[i];
        this.a = 0;
    }

    public aogy() {
        this.b = new int[10];
    }

    public aogy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new etx(8);
    }

    public aogy(byte[] bArr, byte[] bArr2) {
        this.b = new aojw();
    }

    public aogy(byte[] bArr) {
        this.b = new java.util.concurrent.locks.ReentrantLock();
    }
}
