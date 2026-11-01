package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agav {

    @java.lang.Deprecated
    public float a;

    @java.lang.Deprecated
    public float b;

    @java.lang.Deprecated
    public float c;

    @java.lang.Deprecated
    public float d;

    @java.lang.Deprecated
    public float e;

    @java.lang.Deprecated
    public float f;
    public final java.util.List g = new java.util.ArrayList();
    private final java.util.List h = new java.util.ArrayList();

    public agav() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    private final void f(float f) {
        float f2 = this.e;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.c;
                float f5 = this.d;
                defpackage.agar agarVar = new defpackage.agar(f4, f5, f4, f5);
                agarVar.e = this.e;
                agarVar.f = f3;
                this.h.add(new defpackage.agap(agarVar));
                this.e = f;
            }
        }
    }

    final defpackage.agau a(android.graphics.Matrix matrix) {
        f(this.f);
        return new agao(this, new java.util.ArrayList(this.h), new android.graphics.Matrix(matrix));
    }

    public final void b(defpackage.agau agauVar, float f, float f2) {
        f(f);
        this.h.add(agauVar);
        this.e = f2;
    }

    public final void c(android.graphics.Matrix matrix, android.graphics.Path path) {
        java.util.List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.agat) list.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        defpackage.agas agasVar = new defpackage.agas();
        agasVar.a = f;
        agasVar.b = f2;
        this.g.add(agasVar);
        defpackage.agaq agaqVar = new defpackage.agaq(agasVar, this.c, this.d);
        b(agaqVar, agaqVar.b() + 270.0f, agaqVar.b() + 270.0f);
        this.c = f;
        this.d = f2;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
