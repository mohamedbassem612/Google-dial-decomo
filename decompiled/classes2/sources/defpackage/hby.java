package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hby extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.hcb b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ float e;
    final /* synthetic */ defpackage.hch f;
    final /* synthetic */ defpackage.gzh g;
    final /* synthetic */ float h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hby(defpackage.hcb hcbVar, int i, int i2, float f, defpackage.hch hchVar, defpackage.gzh gzhVar, float f2, int i3, aoln aolnVar) {
        super(1, aolnVar);
        this.b = hcbVar;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = hchVar;
        this.g = gzhVar;
        this.h = f2;
        this.i = i3;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.hby(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.hcb hcbVar = this.b;
                int i = this.c;
                hcbVar.k(i);
                int i2 = this.d;
                hcbVar.a.b(java.lang.Integer.valueOf(i2));
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                hcbVar.b.b(bool);
                float f = this.e;
                hcbVar.d.b(java.lang.Float.valueOf(f));
                hcbVar.c.b(this.f);
                defpackage.gzh gzhVar = this.g;
                hcbVar.j(gzhVar);
                hcbVar.n(this.h);
                hcbVar.e.b(bool);
                hcbVar.l(Long.MIN_VALUE);
                if (gzhVar == null) {
                    hcbVar.m(false);
                    return aojh.a;
                }
                if (java.lang.Float.isInfinite(f)) {
                    hcbVar.n(hcbVar.b());
                    hcbVar.m(false);
                    hcbVar.k(i2);
                    return aojh.a;
                }
                hcbVar.m(true);
                int i3 = this.i;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 != 0) {
                    throw new aois();
                }
                aols aolsVar = aols.a;
                defpackage.hbx hbxVar = new defpackage.hbx(aooc.V(u()), i2, i, hcbVar, null);
                this.a = 1;
                if (aoov.aj(aolsVar, hbxVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            aooc.Y(u());
            this.b.m(false);
            return aojh.a;
        } catch (java.lang.Throwable th) {
            this.b.m(false);
            throw th;
        }
    }
}
