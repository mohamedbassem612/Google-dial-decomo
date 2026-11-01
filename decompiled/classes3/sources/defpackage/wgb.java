package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wgb {
    public final defpackage.wga a;
    public final defpackage.wfy b;
    public final defpackage.wga c;
    public final defpackage.wga d;
    public final defpackage.wga e;
    public final defpackage.wfz f;
    public final defpackage.wfz g;
    public final defpackage.wfz h;
    public int i;
    public float j;

    public wgb(defpackage.wga wgaVar, defpackage.wfy wfyVar, defpackage.wga wgaVar2, defpackage.wga wgaVar3, defpackage.wga wgaVar4, defpackage.wfz wfzVar, defpackage.wfz wfzVar2, defpackage.wfz wfzVar3) {
        this.a = wgaVar;
        this.b = wfyVar;
        this.c = wgaVar2;
        this.d = wgaVar3;
        this.e = wgaVar4;
        this.f = wfzVar;
        this.g = wfzVar2;
        this.h = wfzVar3;
    }

    public final float a() {
        return this.b.c;
    }

    public final float b() {
        return this.h.c;
    }

    public final float c() {
        return this.e.c;
    }

    public final float d() {
        return this.c.c;
    }

    public final float e() {
        return this.b.b;
    }

    public final void f(float f) {
        this.b.c(f);
    }

    public final void g(float f) {
        this.f.c(f);
    }

    public final void h(float f) {
        this.d.c(f);
    }

    public final void i(float f) {
        this.e.c(f);
    }

    public final void j(float f) {
        this.a.c(f);
    }

    public final void k(float f) {
        this.c.c(f);
    }

    public final void l(float f) {
        this.g.c(f);
    }

    public final void m(float f, float f2, float f3, int i) {
        this.a.e(f);
        this.b.e(f2);
        this.g.e(f3);
        this.c.e(4.0f);
        this.d.e(0.0f);
        this.e.e(0.0f);
        this.f.e(0.0f);
        this.i = i;
    }

    public final void n(int i) {
        this.h.c(i);
    }

    final void o(float f) {
        this.b.b(f);
    }

    public final void p(boolean z) {
        this.b.h(!z);
    }

    public final void q(boolean z) {
        this.e.h(!z);
    }

    public final void r(boolean z) {
        this.a.h(!z);
    }

    public final void s(boolean z) {
        this.c.h(!z);
    }

    public final void t(boolean z) {
        this.b.a = z;
    }

    public final void u(float f, float f2) {
        defpackage.wga wgaVar = this.a;
        float f3 = wgaVar.c;
        defpackage.wfy wfyVar = this.b;
        float fCos = f3 * ((float) java.lang.Math.cos(wfyVar.c));
        defpackage.wga wgaVar2 = this.d;
        float f4 = fCos + wgaVar2.c;
        float fSin = wgaVar.c * ((float) java.lang.Math.sin(wfyVar.c));
        defpackage.wga wgaVar3 = this.e;
        float f5 = fSin + wgaVar3.c;
        wfyVar.e(f);
        wgaVar.e(f2);
        float fCos2 = wgaVar.c * ((float) java.lang.Math.cos(wfyVar.c));
        float fSin2 = wgaVar.c * ((float) java.lang.Math.sin(wfyVar.c));
        wgaVar2.e(f4 - fCos2);
        wgaVar3.e(f5 - fSin2);
    }

    public final boolean v() {
        return this.h.c > 0.001f;
    }
}
