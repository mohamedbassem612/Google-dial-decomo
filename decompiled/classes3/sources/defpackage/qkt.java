package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qkt extends aomh implements aonn {
    final /* synthetic */ boolean a;
    final /* synthetic */ aify b;
    final /* synthetic */ j$.util.Optional c;
    final /* synthetic */ j$.util.Optional d;
    final /* synthetic */ j$.util.Optional e;
    final /* synthetic */ int f;
    final /* synthetic */ j$.util.Optional g;
    final /* synthetic */ j$.util.Optional h;
    final /* synthetic */ j$.util.Optional i;
    final /* synthetic */ boolean j;
    final /* synthetic */ j$.util.Optional k;
    final /* synthetic */ j$.util.Optional l;
    final /* synthetic */ j$.util.Optional m;
    final /* synthetic */ java.lang.String n;
    final /* synthetic */ aify o;
    final /* synthetic */ defpackage.qin p;
    final /* synthetic */ int q;
    final /* synthetic */ defpackage.qiy r;
    final /* synthetic */ int s;
    final /* synthetic */ boolean t;
    final /* synthetic */ int u;
    final /* synthetic */ aify v;
    final /* synthetic */ boolean w;
    final /* synthetic */ boolean x;
    final /* synthetic */ boolean y;
    final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkt(boolean z, aify aifyVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, int i, j$.util.Optional optional4, j$.util.Optional optional5, j$.util.Optional optional6, boolean z2, j$.util.Optional optional7, j$.util.Optional optional8, j$.util.Optional optional9, java.lang.String str, aify aifyVar2, defpackage.qin qinVar, int i2, defpackage.qiy qiyVar, int i3, boolean z3, int i4, aify aifyVar3, boolean z4, boolean z5, boolean z6, boolean z7, aoln aolnVar) {
        super(2, aolnVar);
        this.a = z;
        this.b = aifyVar;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = i;
        this.g = optional4;
        this.h = optional5;
        this.i = optional6;
        this.j = z2;
        this.k = optional7;
        this.l = optional8;
        this.m = optional9;
        this.n = str;
        this.o = aifyVar2;
        this.p = qinVar;
        this.q = i2;
        this.r = qiyVar;
        this.s = i3;
        this.t = z3;
        this.u = i4;
        this.v = aifyVar3;
        this.w = z4;
        this.x = z5;
        this.y = z6;
        this.z = z7;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        boolean z;
        aooc.af(obj);
        defpackage.qit qitVar = defpackage.qit.DEFAULT;
        boolean z2 = this.a;
        aokc aokcVar = z2 ? aokc.a : this.b;
        defpackage.qir qirVar = (defpackage.qir) aooh.q(this.c);
        java.lang.String str = (java.lang.String) aooh.q(this.d);
        defpackage.pdv pdvVar = (defpackage.pdv) aooh.q(this.e);
        if (z2) {
            z = true;
            i = 0;
        } else {
            i = this.f;
            z = false;
        }
        return new defpackage.qjd(qitVar, this.n, this.o, aokcVar, this.p, qirVar, this.q, this.r, str, pdvVar, this.s, this.t, this.u, i, this.v, (java.lang.String) aooh.q(this.g), (android.app.PendingIntent) aooh.q(this.h), (android.app.PendingIntent) aooh.q(this.i), null, this.w, (defpackage.qil) aooh.p(this.k, defpackage.qjf.a), (defpackage.qij) aooh.q(this.l), this.x, this.y, z ? false : this.j, this.z, false, (defpackage.qie) aooh.q(this.m), 67371008);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.qkt(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, aolnVar);
    }
}
