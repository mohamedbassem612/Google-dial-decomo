package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hkt implements defpackage.amxf, defpackage.amyo {
    public final defpackage.enr a;
    public final defpackage.amww b;
    public final him c;
    final defpackage.amyz e;
    final defpackage.amyz f;
    final defpackage.amyz g;
    final defpackage.amyz h;
    final defpackage.amyz i;
    final defpackage.amyz j;
    final defpackage.amyz k;
    final defpackage.amyz l;
    public final defpackage.amyz m;
    final defpackage.amyz n;
    final defpackage.amyz o;
    final defpackage.amyz p;
    final defpackage.amyz q;
    final defpackage.amyz r;
    final defpackage.amyz s;
    final defpackage.amyz t;
    final defpackage.amyz u;
    final defpackage.amyz v;
    public final defpackage.hkh w;
    private final defpackage.hkt x = this;
    final defpackage.amyz d = defpackage.hka.a;

    public hkt(him himVar, defpackage.hkh hkhVar, defpackage.enr enrVar, defpackage.amww amwwVar) {
        this.c = himVar;
        this.w = hkhVar;
        this.a = enrVar;
        this.b = amwwVar;
        this.e = new defpackage.hjq(himVar, hkhVar, this, 0);
        this.f = new defpackage.hjq(himVar, hkhVar, this, 2);
        this.g = new defpackage.hjq(himVar, hkhVar, this, 1);
        this.h = new defpackage.hjq(himVar, hkhVar, this, 3);
        this.i = new defpackage.hjq(himVar, hkhVar, this, 4);
        this.j = new defpackage.hjq(himVar, hkhVar, this, 5);
        this.k = defpackage.amzc.b(new defpackage.hjq(himVar, hkhVar, this, 8));
        this.l = defpackage.amyu.c(new defpackage.hjq(himVar, hkhVar, this, 7));
        this.m = defpackage.amzc.b(new defpackage.hjq(himVar, hkhVar, this, 10));
        this.n = defpackage.amzc.b(new defpackage.hjq(himVar, hkhVar, this, 9));
        this.o = defpackage.amzc.b(new defpackage.hjq(himVar, hkhVar, this, 12));
        this.p = defpackage.amzc.b(new defpackage.hjq(himVar, hkhVar, this, 11));
        this.q = new defpackage.hjq(himVar, hkhVar, this, 6);
        this.r = new defpackage.hjq(himVar, hkhVar, this, 13);
        this.s = new defpackage.hjq(himVar, hkhVar, this, 14);
        this.t = new defpackage.hjq(himVar, hkhVar, this, 16);
        this.u = new defpackage.hjq(himVar, hkhVar, this, 15);
        this.v = new defpackage.hjq(himVar, hkhVar, this, 17);
    }

    @Override // defpackage.amxf
    public final java.util.Map a() {
        return defpackage.aikj.b;
    }

    @Override // defpackage.amxf
    public final java.util.Map b() {
        defpackage.aigb aigbVar = new defpackage.aigb(10);
        aigbVar.i("agmz", this.e);
        aigbVar.i("jzu", this.g);
        aigbVar.i("agyt", this.h);
        aigbVar.i("agoi", this.i);
        aigbVar.i("agtn", this.j);
        aigbVar.i("afov", this.q);
        aigbVar.i("ahaa", this.r);
        aigbVar.i("afow", this.s);
        aigbVar.i("jlq", this.u);
        aigbVar.i("agyj", this.v);
        return new defpackage.amyx(aigbVar.e(true));
    }

    public final afpl c() {
        android.content.Context context = (android.content.Context) this.c.s.a();
        defpackage.enr enrVar = this.a;
        defpackage.aooh.f(enrVar, "savedStateHandle");
        akpg akpgVarN = akmr.n(enrVar, "contacts_host", akpg.a, defpackage.akzq.a());
        defpackage.aooh.e(akpgVarN, "get(...)");
        akpg akpgVar = akpgVarN;
        defpackage.aooc.ap(akpgVar);
        defpackage.aooh.f(enrVar, "savedStateHandle");
        akoq akoqVarN = akmr.n(enrVar, "contacts_client", akoq.a, defpackage.akzq.a());
        defpackage.aooh.e(akoqVarN, "get(...)");
        akoq akoqVar = akoqVarN;
        defpackage.aooc.ap(akoqVar);
        defpackage.akzx akzxVarM = akoh.a.m();
        akzxVarM.u();
        akoh akohVar = akzxVarM.b;
        akohVar.c = 5;
        akohVar.b |= 1;
        akzxVarM.u();
        akoh akohVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akpgVar);
        akohVar2.d = akpgVar;
        akohVar2.b |= 2;
        akzxVarM.u();
        akoh akohVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akoqVar);
        akohVar3.e = akoqVar;
        akohVar3.b |= 4;
        akoh akohVarR = akzxVarM.r();
        defpackage.aooh.e(akohVarR, "build(...)");
        akoh akohVar4 = akohVarR;
        defpackage.aooc.ap(akohVar4);
        return new afpl(context, akohVar4);
    }

    public final zoe d() {
        return new zoe(this.c.a.kX, (byte[]) null);
    }

    public final zoe e() {
        return new zoe(new zoe((android.content.Context) this.c.s.a(), (byte[]) null));
    }
}
