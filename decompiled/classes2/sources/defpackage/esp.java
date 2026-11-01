package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esp implements defpackage.esj {
    public float b = 1.0f;
    public float c = 1.0f;
    public defpackage.esf d;
    public defpackage.esf e;
    public boolean f;
    public defpackage.eso g;
    public long h;
    public long i;
    private int j;
    private defpackage.esf k;
    private defpackage.esf l;
    private java.nio.ByteBuffer m;
    private java.nio.ByteBuffer n;
    private boolean o;

    public esp() {
        defpackage.esf esfVar = defpackage.esf.a;
        this.k = esfVar;
        this.l = esfVar;
        this.d = esfVar;
        this.e = esfVar;
        java.nio.ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer;
        this.j = -1;
    }

    @Override // defpackage.esj
    public final long a(long j) {
        if (this.i < 1024) {
            return (long) (j / ((double) this.b));
        }
        long j2 = this.h;
        defpackage.eso esoVar = this.g;
        ahvr.ci(esoVar);
        long jB = j2 - ((long) esoVar.b());
        int i = this.e.b;
        int i2 = this.d.b;
        long j3 = this.i;
        return i == i2 ? eum.z(j, j3, jB) : eum.z(j, j3 * ((long) i2), jB * ((long) i));
    }

    @Override // defpackage.esj
    public final defpackage.esf b(defpackage.esf esfVar) throws defpackage.esi {
        int i = esfVar.d;
        if (i != 2 && i != 4) {
            throw new defpackage.esi("Unhandled input format:", esfVar);
        }
        int i2 = this.j;
        if (i2 == -1) {
            i2 = esfVar.b;
        }
        this.k = esfVar;
        defpackage.esf esfVar2 = new defpackage.esf(i2, esfVar.c, i);
        this.l = esfVar2;
        this.f = true;
        return esfVar2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // defpackage.esj
    public final java.nio.ByteBuffer c() {
        int iA;
        defpackage.eso esoVar = this.g;
        if (esoVar != null && (iA = esoVar.a()) > 0) {
            if (this.m.capacity() < iA) {
                this.m = java.nio.ByteBuffer.allocateDirect(iA).order(java.nio.ByteOrder.nativeOrder());
            } else {
                this.m.clear();
            }
            java.nio.ByteBuffer byteBuffer = this.m;
            ahvr.bY((boolean) ((esoVar.h ^ (-1)) >>> 31));
            int iRemaining = byteBuffer.remaining();
            int i = esoVar.a;
            defpackage.esm esmVar = esoVar.f;
            int iMin = java.lang.Math.min(iRemaining / (esmVar.a() * i), esoVar.h);
            esmVar.g(byteBuffer, iMin);
            esoVar.h -= iMin;
            java.lang.System.arraycopy(esmVar.d(), iMin * i, esmVar.d(), 0, esoVar.h * i);
            this.m.flip();
            this.i += (long) iA;
            this.n = this.m;
        }
        java.nio.ByteBuffer byteBuffer2 = this.n;
        this.n = a;
        return byteBuffer2;
    }

    @Override // defpackage.esj
    public final void d() {
        defpackage.eso esoVar = this.g;
        if (esoVar != null) {
            int i = esoVar.g;
            int i2 = esoVar.l;
            int i3 = i - i2;
            double d = i2;
            float f = esoVar.c;
            int i4 = esoVar.h + ((int) ((((((((double) i3) / ((double) (esoVar.b / f))) + d) + esoVar.n) + ((double) esoVar.i)) / ((double) (esoVar.d * f))) + 0.5d));
            esoVar.n = 0.0d;
            int i5 = esoVar.e << 1;
            defpackage.esm esmVar = esoVar.f;
            esmVar.i(i + i5);
            esmVar.p(i * esoVar.a, i5);
            esoVar.g += i5;
            esoVar.c();
            if (esoVar.h > i4) {
                esoVar.h = java.lang.Math.max(i4, 0);
            }
            esoVar.g = 0;
            esoVar.l = 0;
            esoVar.i = 0;
        }
        this.o = true;
    }

    @Override // defpackage.esj
    public final void e(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            defpackage.eso esoVar = this.g;
            ahvr.ci(esoVar);
            this.h += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = esoVar.a;
            defpackage.esm esmVar = esoVar.f;
            int iA = iRemaining / (i * esmVar.a());
            esmVar.i(iA);
            esmVar.f(byteBuffer, iRemaining);
            esoVar.g += iA;
            esoVar.c();
        }
    }

    @Override // defpackage.esj
    public final void f() {
        this.b = 1.0f;
        this.c = 1.0f;
        defpackage.esf esfVar = defpackage.esf.a;
        this.k = esfVar;
        this.l = esfVar;
        this.d = esfVar;
        this.e = esfVar;
        java.nio.ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer;
        this.j = -1;
        this.f = false;
        this.g = null;
        this.h = 0L;
        this.i = 0L;
        this.o = false;
    }

    @Override // defpackage.esj
    public final boolean g() {
        return this.l.b != -1 && (java.lang.Math.abs(this.b + (-1.0f)) >= 1.0E-4f || java.lang.Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b);
    }

    @Override // defpackage.esj
    public final boolean h() {
        if (!this.o) {
            return false;
        }
        defpackage.eso esoVar = this.g;
        return esoVar == null || esoVar.a() == 0;
    }

    @Override // defpackage.esj
    public final void i() {
        if (g()) {
            this.d = this.k;
            this.e = this.l;
            if (this.f) {
                defpackage.esf esfVar = this.d;
                this.g = new defpackage.eso(esfVar.b, esfVar.c, this.b, this.c, this.e.b, esfVar.d == 4);
            } else {
                defpackage.eso esoVar = this.g;
                if (esoVar != null) {
                    esoVar.g = 0;
                    esoVar.h = 0;
                    esoVar.i = 0;
                    esoVar.j = 0;
                    esoVar.k = 0;
                    esoVar.l = 0;
                    esoVar.m = 0;
                    esoVar.n = 0.0d;
                    esoVar.f.l();
                }
            }
        }
        this.n = a;
        this.h = 0L;
        this.i = 0L;
        this.o = false;
    }
}
