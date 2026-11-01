package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csp {
    private boolean A;
    private boolean B;
    public final defpackage.csh a;
    public final android.graphics.RenderNode b;
    public long c;
    public android.graphics.Paint d;
    public android.graphics.Matrix e;
    public float f;
    public int g;
    public long h;
    public float i;
    public float j;
    public float k;
    public float l;
    public long m;
    public long n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public final defpackage.kaw x;
    private boolean y;
    private boolean z;

    public csp(defpackage.kaw kawVar, defpackage.csh cshVar) {
        this.x = kawVar;
        this.a = cshVar;
        android.graphics.RenderNode renderNode = new android.graphics.RenderNode("graphicsLayer");
        this.b = renderNode;
        this.c = 0L;
        da$.ExternalSyntheticApiModelOutline0.m(renderNode, false);
        h(renderNode, 0);
        this.f = 1.0f;
        this.g = 3;
        this.h = 9205357640488583168L;
        this.i = 1.0f;
        this.j = 1.0f;
        this.m = -72057594037927936L;
        this.n = -72057594037927936L;
        this.p = 8.0f;
        this.w = 0;
    }

    private final void g() {
        boolean z = this.z;
        boolean z2 = z && !this.y;
        boolean z3 = z && this.y;
        if (z2 != this.A) {
            this.A = z2;
            da$.ExternalSyntheticApiModelOutline0.m(this.b, z2);
        }
        if (z3 != this.B) {
            this.B = z3;
            da$.ExternalSyntheticApiModelOutline0.m$2(this.b, z3);
        }
    }

    private final void h(android.graphics.RenderNode renderNode, int i) {
        android.graphics.Paint paint = this.d;
        if (i == 1) {
            da$.ExternalSyntheticApiModelOutline0.m(renderNode, true, paint);
            da$.ExternalSyntheticApiModelOutline0.m$1(renderNode, true);
        } else {
            da$.ExternalSyntheticApiModelOutline0.m(renderNode, false, paint);
            da$.ExternalSyntheticApiModelOutline0.m$1(renderNode, true);
        }
    }

    public final void a() {
        da$.ExternalSyntheticApiModelOutline0.m$1(this.b);
    }

    public final void b(boolean z) {
        this.z = z;
        g();
    }

    public final void c() {
        if (this.w == 1 || this.g != 3) {
            h(this.b, 1);
        } else {
            h(this.b, 0);
        }
    }

    public final void d() {
        long j = this.h;
        long j2 = 9223372034707292159L & j;
        android.graphics.RenderNode renderNode = this.b;
        if (j2 == 9205357640488583168L) {
            da$.ExternalSyntheticApiModelOutline0.m(renderNode, (java.lang.Float.intBitsToFloat((int) (this.c >> 32)) / 2.0f) + this.q);
            da$.ExternalSyntheticApiModelOutline0.m$1(renderNode, (java.lang.Float.intBitsToFloat((int) (this.c & 4294967295L)) / 2.0f) + this.r);
        } else {
            da$.ExternalSyntheticApiModelOutline0.m(renderNode, java.lang.Float.intBitsToFloat((int) (j >> 32)) + this.q);
            da$.ExternalSyntheticApiModelOutline0.m$1(renderNode, java.lang.Float.intBitsToFloat((int) (this.h & 4294967295L)) + this.r);
        }
    }

    public final void e() {
        int i = this.u;
        da$.ExternalSyntheticApiModelOutline0.m(this.b, i - this.q, this.v - this.r, i + ((int) java.lang.Float.intBitsToFloat((int) (this.c >> 32))) + this.s, this.v + ((int) java.lang.Float.intBitsToFloat((int) (this.c & 4294967295L))) + this.t);
    }

    public final void f(android.graphics.Outline outline) {
        da$.ExternalSyntheticApiModelOutline0.m(this.b, outline);
        this.y = outline != null;
        g();
    }
}
