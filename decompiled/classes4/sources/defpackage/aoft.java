package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoft {
    public final apoy a;
    public int b;
    public int c;
    public boolean d;
    final /* synthetic */ aofv e;
    private final int f;
    private final defpackage.aofs g;

    public aoft(aofv aofvVar, int i, int i2, defpackage.aofs aofsVar) {
        j$.util.Objects.requireNonNull(aofvVar);
        this.e = aofvVar;
        this.a = new apoy();
        this.d = false;
        this.f = i;
        this.b = i2;
        this.g = aofsVar;
    }

    final int a() {
        return java.lang.Math.max(0, java.lang.Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int b() {
        return java.lang.Math.min(this.b, ((defpackage.aoft) this.e.d).b);
    }

    final void c(apoy apoyVar, int i, boolean z) {
        while (true) {
            aofv aofvVar = this.e;
            java.lang.Object obj = aofvVar.c;
            defpackage.aogm aogmVar = ((defpackage.aoeu) ((defpackage.aoet) obj).b).a;
            int iMin = java.lang.Math.min(i, ((defpackage.aogu) aogmVar).a);
            int i2 = -iMin;
            ((defpackage.aoft) aofvVar.d).e(i2);
            e(i2);
            try {
                boolean z2 = false;
                if (apoyVar.b == iMin && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                int i3 = this.f;
                apoy apoyVar2 = apoyVar;
                ((defpackage.aoet) obj).c.b(2, i3, apoyVar2, iMin, z3);
                try {
                    aogmVar.c(z3, i3, apoyVar2, iMin);
                } catch (java.io.IOException e) {
                    ((defpackage.aoet) obj).a.e(e);
                }
                this.g.h(iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    apoyVar = apoyVar2;
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.b) {
            this.b += i;
            return;
        }
        throw new java.lang.IllegalArgumentException("Window size overflow for stream: " + this.f);
    }

    final void f(int i, defpackage.xm xmVar) {
        int iMin = java.lang.Math.min(i, b());
        int i2 = 0;
        while (d() && iMin > 0) {
            apoy apoyVar = this.a;
            long j = iMin;
            long j2 = apoyVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(apoyVar, i3, this.d);
            } else {
                i2 += iMin;
                c(apoyVar, iMin, false);
            }
            xmVar.a++;
            iMin = java.lang.Math.min(i - i2, b());
        }
    }
}
