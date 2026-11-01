package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bxy {
    public float d;
    public float e;
    public csm g;
    public csm h;
    public float i;
    public float j;
    public boolean k;
    public final float[] l;
    public final float[] m;
    public float n;
    public final cpx o;
    public final cpx p;
    public final cpx q;
    public final cpx r;
    public final defpackage.ni s;
    public final defpackage.ni t;
    public float a = -1.0f;
    public float b = -1.0f;
    public long c = 9205357640488583168L;
    public float f = -1.0f;

    public bxy() {
        csm csmVar = new csm(0.0f, 0.0f, 0, 0, 31);
        this.g = csmVar;
        this.h = csmVar;
        this.l = cqt.e();
        this.m = cqt.e();
        this.o = new cpx((byte[]) null);
        this.p = new cpx((byte[]) null);
        this.q = new cpx((byte[]) null);
        this.r = new cpx((byte[]) null);
        this.s = defpackage.cpy.f();
        this.t = defpackage.cpy.f();
    }

    public static final void a(cpx cpxVar, long j, float[] fArr) {
        cpxVar.n(fArr);
        cpxVar.o(mni.aM(cdh.q(j), cpxVar.b().b()));
    }
}
