package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofd extends defpackage.anxr implements defpackage.aofs {
    public static final /* synthetic */ int z = 0;
    private final int A;
    private int B;
    private int C;
    public final java.lang.Object a;
    public java.util.List b;
    public final apoy c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final defpackage.aoet g;
    public final aofv h;
    public final defpackage.aofk i;
    public boolean u;
    public final defpackage.aoil v;
    public defpackage.aoft w;
    public int x;
    final /* synthetic */ defpackage.aofe y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aofd(defpackage.aofe aofeVar, int i, defpackage.aodj aodjVar, java.lang.Object obj, defpackage.aoet aoetVar, aofv aofvVar, defpackage.aofk aofkVar, int i2) {
        super(i, aodjVar, aofeVar.t);
        j$.util.Objects.requireNonNull(aofeVar);
        this.y = aofeVar;
        this.c = new apoy();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.x = -1;
        this.a = obj;
        this.g = aoetVar;
        this.h = aofvVar;
        this.i = aofkVar;
        this.B = i2;
        this.C = i2;
        this.A = i2;
        int i3 = defpackage.aoik.a;
        this.v = defpackage.aoij.a;
    }

    @Override // defpackage.anzw
    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        int i3 = this.A;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.g.h(this.x, i4);
        }
    }

    @Override // defpackage.anzw
    public final void b(java.lang.Throwable th) {
        q(anqw.d(th), true, new anph());
    }

    @Override // defpackage.anxr
    protected final void c(anqw anqwVar, boolean z2, anph anphVar) {
        q(anqwVar, false, anphVar);
    }

    @Override // defpackage.anur
    protected final void d() {
        super.d();
        aodq aodqVar = this.l;
        aodqVar.b++;
        aodqVar.a.a();
    }

    @Override // defpackage.anuu
    public final void e(java.lang.Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    final defpackage.aoft f() {
        defpackage.aoft aoftVar;
        synchronized (this.a) {
            aoftVar = this.w;
        }
        return aoftVar;
    }

    @Override // defpackage.anur, defpackage.anzw
    public final void k(boolean z2) {
        if (!this.s || this.w.d()) {
            this.i.i(this.x, null, defpackage.anvq.a, false, defpackage.aogl.CANCEL, null);
        } else {
            this.i.i(this.x, null, defpackage.anvq.a, false, null, null);
        }
        super.k(z2);
    }

    public final void q(anqw anqwVar, boolean z2, anph anphVar) {
        if (this.f) {
            return;
        }
        this.f = true;
        boolean z3 = this.u;
        defpackage.aofk aofkVar = this.i;
        if (!z3) {
            aofkVar.i(this.x, anqwVar, defpackage.anvq.a, z2, defpackage.aogl.CANCEL, anphVar);
            return;
        }
        defpackage.aofe aofeVar = this.y;
        aofkVar.A.remove(aofeVar);
        aofkVar.j(aofeVar);
        this.b = null;
        this.c.y();
        this.u = false;
        if (anphVar == null) {
            anphVar = new anph();
        }
        l(anqwVar, true, anphVar);
    }

    public final void r(apoy apoyVar, boolean z2, int i) {
        int i2 = this.B - (((int) apoyVar.b) + i);
        this.B = i2;
        this.C -= i;
        if (i2 >= 0) {
            super.n(new defpackage.aofo(apoyVar), z2);
        } else {
            this.g.f(this.x, defpackage.aogl.FLOW_CONTROL_ERROR);
            this.i.i(this.x, anqw.k.f("Received data size exceeded our receiving window size"), defpackage.anvq.a, false, null, null);
        }
    }
}
