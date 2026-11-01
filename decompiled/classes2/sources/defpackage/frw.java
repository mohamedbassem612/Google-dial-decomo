package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class frw implements defpackage.fmk {
    public final defpackage.fmk a;
    public defpackage.eqg c;
    public boolean d;
    private final defpackage.frr e;
    private defpackage.frt i;
    private int f = 0;
    private int g = 0;
    private byte[] h = eum.b;
    public final defpackage.etx b = new defpackage.etx();

    public frw(defpackage.fmk fmkVar, defpackage.frr frrVar) {
        this.a = fmkVar;
        this.e = frrVar;
    }

    private final void e(int i) {
        int length = this.h.length;
        int i2 = this.g;
        if (length - i2 < i) {
            int i3 = i2 - this.f;
            int iMax = java.lang.Math.max(i3 << 1, i + i3);
            byte[] bArr = this.h;
            byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
            java.lang.System.arraycopy(bArr, this.f, bArr2, 0, i3);
            this.f = 0;
            this.g = i3;
            this.h = bArr2;
        }
    }

    @Override // defpackage.fmk
    public final /* synthetic */ int a(defpackage.epz epzVar, int i, boolean z) {
        return f(epzVar, i, z);
    }

    @Override // defpackage.fmk
    public final /* synthetic */ void b(defpackage.etx etxVar, int i) {
        c(etxVar, i, 0);
    }

    @Override // defpackage.fmk
    public final void c(defpackage.etx etxVar, int i, int i2) {
        if (this.i == null) {
            this.a.c(etxVar, i, i2);
            return;
        }
        e(i);
        etxVar.L(this.h, this.g, i);
        this.g += i;
    }

    @Override // defpackage.fmk
    public final void d(final long j, final int i, int i2, int i3, defpackage.fmj fmjVar) {
        int i4;
        if (this.i == null) {
            this.a.d(j, i, i2, i3, fmjVar);
            return;
        }
        ahvr.bN(fmjVar == null, "DRM on subtitles is not supported");
        int i5 = (this.g - i3) - i2;
        try {
            i4 = i5;
            try {
                this.i.b(this.h, i4, i2, defpackage.frs.a, new java.util.function.Consumer() { // from class: frv
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        defpackage.frw frwVar = this.a;
                        defpackage.frf frfVar = (defpackage.frf) obj;
                        ahvr.ci(frwVar.c);
                        byte[] bArrC = defpackage.fsu.c(frfVar.a, frfVar.c);
                        defpackage.etx etxVar = frwVar.b;
                        etxVar.N(bArrC);
                        int length = bArrC.length;
                        defpackage.fmk fmkVar = frwVar.a;
                        fmkVar.b(etxVar, length);
                        long j2 = frfVar.b;
                        long j3 = j;
                        if (j2 == -9223372036854775807L) {
                            ahvr.bY(frwVar.c.u == Long.MAX_VALUE);
                        } else {
                            long j4 = frwVar.c.u;
                            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                        }
                        fmkVar.d(j3, 1 | i, length, 0, null);
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                e = e;
                java.lang.RuntimeException runtimeException = e;
                if (!this.d) {
                    throw runtimeException;
                }
                defpackage.etr.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (java.lang.RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.f = i6;
        if (i6 == this.g) {
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.fmk
    public final int f(defpackage.epz epzVar, int i, boolean z) throws java.io.EOFException {
        if (this.i == null) {
            return this.a.f(epzVar, i, z);
        }
        e(i);
        int iA = epzVar.a(this.h, this.g, i);
        if (iA != -1) {
            this.g += iA;
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // defpackage.fmk
    public final void p(defpackage.eqg eqgVar) {
        java.lang.String str = eqgVar.p;
        ahvr.ci(str);
        ahvr.bM(defpackage.eqz.b(str) == 3);
        if (!eqgVar.equals(this.c)) {
            this.c = eqgVar;
            defpackage.frr frrVar = this.e;
            this.i = frrVar.c(eqgVar) ? frrVar.b(eqgVar) : null;
        }
        defpackage.frt frtVar = this.i;
        defpackage.fmk fmkVar = this.a;
        if (frtVar == null) {
            fmkVar.p(eqgVar);
            return;
        }
        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
        eqfVar.c("application/x-media3-cues");
        eqfVar.j = str;
        eqfVar.s = Long.MAX_VALUE;
        eqfVar.M = this.e.a(eqgVar);
        fmkVar.p(new defpackage.eqg(eqfVar));
    }

    @Override // defpackage.fmk
    public final /* synthetic */ void z() {
    }
}
