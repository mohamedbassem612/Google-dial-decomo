package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ejx implements defpackage.eji {
    public static final ejw a = new ejn();
    public static final ejw b = new ejo();
    public static final ejw c = new ejp();
    public static final ejw d = new ejq();
    public static final ejw e = new ejr();
    public static final ejw f = new ejs();
    public static final ejw g = new ejt();
    public static final ejw h = new ejl();
    public float i;
    float j;
    boolean k;
    final java.lang.Object l;
    final defpackage.ejy m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public final java.util.ArrayList r;
    public final java.util.ArrayList s;
    private long t;

    public ejx(java.lang.Object obj, defpackage.ejy ejyVar) {
        this.i = 0.0f;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.t = 0L;
        this.r = new java.util.ArrayList();
        this.s = new java.util.ArrayList();
        this.l = obj;
        this.m = ejyVar;
        float f2 = 0.1f;
        if (ejyVar != e && ejyVar != f && ejyVar != g) {
            if (ejyVar == h) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (ejyVar != c && ejyVar != d) {
                    f2 = 1.0f;
                }
            }
        }
        this.q = f2;
    }

    private static void j(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.eji
    public final void a(long j) {
        long j2 = this.t;
        if (j2 == 0) {
            this.t = j;
            d(this.j);
            return;
        }
        long j3 = j - j2;
        this.t = j;
        float f2 = ejk.a().e;
        boolean zF = f(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float fMin = java.lang.Math.min(this.j, this.o);
        this.j = fMin;
        float fMax = java.lang.Math.max(fMin, this.p);
        this.j = fMax;
        d(fMax);
        if (zF) {
            c(false);
        }
    }

    public void b() {
        throw null;
    }

    public final void c(boolean z) {
        int i = 0;
        this.n = false;
        ejk ejkVarA = ejk.a();
        ejkVarA.a.remove(this);
        java.util.ArrayList arrayList = ejkVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            ejkVarA.d = true;
        }
        this.t = 0L;
        this.k = false;
        while (true) {
            java.util.ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                j(arrayList2);
                return;
            } else {
                if (arrayList2.get(i) != null) {
                    ((ejv) arrayList2.get(i)).a(this, z, this.j);
                }
                i++;
            }
        }
    }

    final void d(float f2) {
        this.m.b(this.l, f2);
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                j(arrayList);
                return;
            }
            if (arrayList.get(i) != null) {
                gkv gkvVar = (gkv) arrayList.get(i);
                long jMax = java.lang.Math.max(-1L, java.lang.Math.min(gkvVar.h() + 1, java.lang.Math.round(this.j)));
                gkvVar.g.y(jMax, gkvVar.a);
                gkvVar.a = jMax;
            }
            i++;
        }
    }

    public void e() {
        throw null;
    }

    public abstract boolean f(long j);

    public final void g(ejv ejvVar) {
        java.util.ArrayList arrayList = this.r;
        if (arrayList.contains(ejvVar)) {
            return;
        }
        arrayList.add(ejvVar);
    }

    public final void h(float f2) {
        if (f2 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.q = f2;
    }

    public final void i(float f2) {
        this.j = f2;
        this.k = true;
    }

    public ejx(agkk agkkVar) {
        this.i = 0.0f;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.t = 0L;
        this.r = new java.util.ArrayList();
        this.s = new java.util.ArrayList();
        this.l = null;
        this.m = new ejm(agkkVar);
        this.q = 1.0f;
    }
}
