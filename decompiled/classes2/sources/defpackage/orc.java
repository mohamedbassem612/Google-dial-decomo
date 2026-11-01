package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class orc {
    public static final aimz a = aimz.i("com/android/dialer/historyitemactions/HistoryItemActionModulesBuilder");
    public final android.content.Context b;
    public final defpackage.oqy c;
    public final rlv d;
    public final zjm e;
    private final java.util.List f = new java.util.ArrayList();
    private final nwu g;
    private final aoin h;
    private final zjm i;
    private final rsr j;
    private final rai k;

    public orc(android.content.Context context, defpackage.oqy oqyVar) {
        this.b = context;
        this.c = oqyVar;
        orb orbVarAs = pez.as(context);
        this.g = orbVarAs.aS();
        this.d = orbVarAs.bt();
        this.i = orbVarAs.mU();
        this.e = orbVarAs.mV();
        this.j = orbVarAs.qS();
        this.h = orbVarAs.hM();
        this.k = orbVarAs.sQ();
    }

    private final boolean r() {
        defpackage.oqy oqyVar = this.c;
        return (oqyVar.c.isEmpty() || oqyVar.n || b() || oqyVar.r) ? false : true;
    }

    private final boolean s() {
        defpackage.oqy oqyVar = this.c;
        return (oqyVar.r || oqyVar.p || oqyVar.o || oqyVar.w || oqyVar.n || oqyVar.c.isEmpty() || b() || !zqz.a(this.b, "android.permission.WRITE_CONTACTS")) ? false : true;
    }

    private final amdx t() {
        amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
        defpackage.oqy oqyVar = this.c;
        amdxVar.s(oqyVar.c);
        amdxVar.l(oqyVar.l);
        amdxVar.u(true != oqyVar.n ? 5 : 4);
        amdxVar.v(8);
        akzx akzxVarM = defpackage.jxb.b.m();
        akzxVarM.u();
        defpackage.jxb jxbVar = (defpackage.jxb) akzxVarM.b;
        jxbVar.d = 7;
        jxbVar.c |= 1;
        int i = oqyVar.s;
        akzxVarM.u();
        defpackage.jxb jxbVar2 = (defpackage.jxb) akzxVarM.b;
        jxbVar2.c |= 65536;
        jxbVar2.r = i;
        amdxVar.m((defpackage.jxb) akzxVarM.p());
        return amdxVar;
    }

    public final java.util.List a() {
        return new java.util.ArrayList(this.f);
    }

    public final boolean b() {
        defpackage.oqy oqyVar = this.c;
        return (oqyVar.j.isEmpty() || abxl.d(android.net.Uri.parse(oqyVar.j))) ? false : true;
    }

    public final boolean c() {
        int iAQ = a.aQ(this.c.u);
        return iAQ != 0 && iAQ == 3;
    }

    public final void d() {
        defpackage.oqv oqvVar;
        defpackage.oqy oqyVar = this.c;
        if (oqyVar.r || oqyVar.p) {
            return;
        }
        akzx akzxVarM = defpackage.jjx.a.m();
        java.lang.String str = oqyVar.d;
        akzxVarM.u();
        defpackage.jjx jjxVar = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        jjxVar.b |= 1;
        jjxVar.c = str;
        java.lang.String str2 = oqyVar.e;
        akzxVarM.u();
        defpackage.jjx jjxVar2 = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        jjxVar2.b |= 2;
        jjxVar2.d = str2;
        java.lang.String str3 = oqyVar.f;
        akzxVarM.u();
        defpackage.jjx jjxVar3 = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        jjxVar3.b |= 4;
        jjxVar3.e = str3;
        int i = oqyVar.h;
        akzxVarM.u();
        defpackage.jjx jjxVar4 = (defpackage.jjx) akzxVarM.b;
        jjxVar4.b |= 8;
        jjxVar4.f = i;
        akzxVarM.u();
        defpackage.jjx jjxVar5 = (defpackage.jjx) akzxVarM.b;
        jjxVar5.g = 1;
        jjxVar5.b |= 16;
        rmt rmtVarB = rmt.b(oqyVar.q);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        akzxVarM.u();
        defpackage.jjx jjxVar6 = (defpackage.jjx) akzxVarM.b;
        jjxVar6.h = rmtVarB.q;
        jjxVar6.b |= 32;
        long j = oqyVar.t;
        akzxVarM.u();
        defpackage.jjx jjxVar7 = (defpackage.jjx) akzxVarM.b;
        jjxVar7.b |= 256;
        jjxVar7.k = j;
        boolean z = oqyVar.o;
        akzxVarM.u();
        defpackage.jjx jjxVar8 = (defpackage.jjx) akzxVarM.b;
        jjxVar8.b |= 1024;
        jjxVar8.q = z;
        boolean z2 = oqyVar.w;
        akzxVarM.u();
        defpackage.jjx jjxVar9 = (defpackage.jjx) akzxVarM.b;
        jjxVar9.b |= 2048;
        jjxVar9.r = z2;
        tkj tkjVar = oqyVar.x;
        if (tkjVar == null) {
            tkjVar = tkj.a;
        }
        akzxVarM.u();
        defpackage.jjx jjxVar10 = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(tkjVar);
        jjxVar10.l = tkjVar;
        jjxVar10.b |= 512;
        defpackage.jjx jjxVar11 = (defpackage.jjx) akzxVarM.p();
        rmw rmwVar = c() ? rmw.lk : rmw.hf;
        if (oqyVar.w) {
            java.util.List list = this.f;
            android.content.Context context = this.b;
            list.add(new defpackage.oqv(context, jjxVar11, c() ? rmx.vw : rmx.vv, 0));
            if (oqyVar.n) {
                oqvVar = new defpackage.oqv(context, jjxVar11, rmwVar, 2);
            } else {
                oqvVar = new defpackage.oqv(context, jjxVar11, c() ? rmw.ln : rmw.hd, 3);
            }
            list.add(oqvVar);
            return;
        }
        if (!oqyVar.o) {
            boolean z3 = oqyVar.n;
            java.util.List list2 = this.f;
            if (z3) {
                list2.add(new defpackage.oqv(this.b, jjxVar11, rmwVar, 2));
                return;
            } else {
                list2.add(new defpackage.oqv(this.b, jjxVar11, c() ? rmw.ln : rmw.hd, 3));
                return;
            }
        }
        java.util.List list3 = this.f;
        android.content.Context context2 = this.b;
        list3.add(new defpackage.oqv(context2, jjxVar11, c() ? rmw.ll : rmw.hg, 1));
        defpackage.oqv oqvVar2 = new defpackage.oqv(context2, jjxVar11, c() ? rmw.ln : rmw.hd, 3);
        if (oqyVar.n) {
            oqvVar2 = new defpackage.oqv(context2, jjxVar11, rmwVar, 2);
        }
        list3.add(oqvVar2);
    }

    public final void e(az azVar, kiu kiuVar) {
        defpackage.kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        zjm zjmVar = this.i;
        if (zjmVar.g().isPresent()) {
            if ((defpackage.hhv.i(rmtVarB) || rmtVarB == rmt.m) && r()) {
                this.f.add(new defpackage.oqz(this, (rsr) zjmVar.g().orElseThrow(), azVar, kiuVar, 2));
            }
        }
    }

    public final void f(az azVar, kiu kiuVar) {
        zjm zjmVar = this.i;
        if (zjmVar.g().isPresent()) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            rmt rmtVarB = rmt.b(kiwVar.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (rmtVarB == rmt.a) {
                defpackage.kiw kiwVar2 = kiuVar.r;
                if ((kiwVar2 == null ? defpackage.kiw.a : kiwVar2).A) {
                    if (kiwVar2 == null) {
                        kiwVar2 = defpackage.kiw.a;
                    }
                    zag zagVar = kiwVar2.u;
                    if (zagVar == null) {
                        zagVar = zag.a;
                    }
                    zai zaiVar = zagVar.c;
                    if (zaiVar == null) {
                        zaiVar = zai.a;
                    }
                    if (zaiVar.equals(zai.a) && r()) {
                        this.f.add(new defpackage.oqz(this, (rsr) zjmVar.g().orElseThrow(), azVar, kiuVar, 4, (char[]) null));
                    }
                }
            }
        }
    }

    public final void g(az azVar, kiu kiuVar) {
        zjm zjmVar = this.i;
        if (zjmVar.g().isPresent()) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            rmt rmtVarB = rmt.b(kiwVar.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (rmtVarB == rmt.a) {
                defpackage.kiw kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                zag zagVar = kiwVar2.u;
                if (zagVar == null) {
                    zagVar = zag.a;
                }
                zai zaiVar = zagVar.c;
                if (zaiVar == null) {
                    zaiVar = zai.a;
                }
                zai zaiVar2 = zai.a;
                if (zaiVar.equals(zaiVar2)) {
                    return;
                }
                java.lang.String languageTag = java.util.Locale.getDefault().toLanguageTag();
                defpackage.kiw kiwVar3 = kiuVar.r;
                if (kiwVar3 == null) {
                    kiwVar3 = defpackage.kiw.a;
                }
                zag zagVar2 = kiwVar3.u;
                if (zagVar2 == null) {
                    zagVar2 = zag.a;
                }
                zai zaiVar3 = zagVar2.c;
                if (zaiVar3 != null) {
                    zaiVar2 = zaiVar3;
                }
                if (languageTag.equals(zaiVar2.e) && r()) {
                    this.f.add(new defpackage.oqz(this, (rsr) zjmVar.g().orElseThrow(), azVar, kiuVar, 3, (byte[]) null));
                }
            }
        }
    }

    public final void h(az azVar, kiu kiuVar) {
        zjm zjmVar = this.i;
        if (zjmVar.g().isPresent()) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            rmt rmtVarB = rmt.b(kiwVar.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (rmtVarB == rmt.a) {
                defpackage.kiw kiwVar2 = kiuVar.r;
                if ((kiwVar2 == null ? defpackage.kiw.a : kiwVar2).A) {
                    return;
                }
                if (!(kiwVar2 == null ? defpackage.kiw.a : kiwVar2).y) {
                    if (!(kiwVar2 == null ? defpackage.kiw.a : kiwVar2).B) {
                        return;
                    }
                }
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                zag zagVar = kiwVar2.u;
                if (zagVar == null) {
                    zagVar = zag.a;
                }
                zai zaiVar = zagVar.c;
                if (zaiVar == null) {
                    zaiVar = zai.a;
                }
                if (zaiVar.equals(zai.a)) {
                    java.lang.String languageTag = java.util.Locale.getDefault().toLanguageTag();
                    defpackage.kiw kiwVar3 = kiuVar.r;
                    if (kiwVar3 == null) {
                        kiwVar3 = defpackage.kiw.a;
                    }
                    zag zagVar2 = kiwVar3.u;
                    if (zagVar2 == null) {
                        zagVar2 = zag.a;
                    }
                    if (languageTag.equals(zagVar2.d) && r()) {
                        this.f.add(new defpackage.oqz(this, (rsr) zjmVar.g().orElseThrow(), azVar, kiuVar, 5, (short[]) null));
                    }
                }
            }
        }
    }

    public final void i() {
        if (this.c.c.isEmpty()) {
            return;
        }
        this.f.add(new defpackage.ora(this));
    }

    public final void j(java.lang.String str, az azVar, kiu kiuVar) {
        if (this.j.O(kiuVar).l) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            rmt rmtVarB = rmt.b(kiwVar.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (rmtVarB == rmt.a) {
                defpackage.kiw kiwVar2 = kiuVar.r;
                if ((kiwVar2 == null ? defpackage.kiw.a : kiwVar2).j) {
                    return;
                }
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (kiwVar2.r || kiuVar.s) {
                    return;
                }
                this.f.add(new defpackage.oqz(this, azVar, kiuVar, str, 0));
            }
        }
    }

    public final void k() {
        defpackage.oqy oqyVar = this.c;
        if (oqyVar.c.isEmpty()) {
            return;
        }
        java.util.List list = this.f;
        android.content.Context context = this.b;
        defpackage.ord ordVarA = defpackage.ord.a();
        ordVarA.c(context);
        ordVarA.a = new android.content.Intent("android.intent.action.DIAL", uyb.b(oqyVar.c));
        ordVarA.f(2132018502);
        ordVarA.d(2131231952);
        ordVarA.e(aify.p(rmw.hq));
        list.add(ordVarA.b());
    }

    public final void l() {
        defpackage.oqy oqyVar = this.c;
        if (oqyVar.r || oqyVar.p || oqyVar.c.isEmpty()) {
            return;
        }
        java.util.List list = this.f;
        android.content.Context context = this.b;
        java.lang.String str = oqyVar.c;
        aify aifyVarP = aify.p(c() ? rmw.lj : rmw.hn);
        defpackage.ord ordVarA = defpackage.ord.a();
        ordVarA.c(context);
        ordVarA.a = wsc.aT(str);
        ordVarA.f(2132020074);
        ordVarA.d(2131231435);
        ordVarA.e(aifyVarP);
        list.add(ordVarA.b());
    }

    public final void m() {
        defpackage.oqy oqyVar = this.c;
        if ((oqyVar.i & 1) == 1 || oqyVar.r || oqyVar.p || oqyVar.o || oqyVar.n) {
            return;
        }
        android.content.Context context = this.b;
        int iA = uyb.a(context);
        int i = iA & 1;
        int i2 = iA & 2;
        if (i == 0 || i2 != 2 || !oqyVar.m) {
            if (((java.lang.Boolean) this.h.a()).booleanValue() ? oqyVar.v : this.g.l()) {
                this.f.add(new defpackage.oqz(this, context, oqyVar.c, defpackage.nwt.CALL_HISTORY_DROPDOWN_MENU, 1));
            }
        } else {
            java.util.List list = this.f;
            rai raiVar = this.k;
            amdx amdxVarT = t();
            amdxVarT.q(true);
            list.add(raiVar.k((zrx) amdxVarT.a, (mce) (c() ? j$.util.Optional.of(mce.dA) : j$.util.Optional.empty()).orElse((java.lang.Object) null), aify.p(c() ? rmw.lg : rmw.ex)));
        }
    }

    public final void n(j$.util.Optional optional) {
        java.lang.Object obj = t().a;
        zrx zrxVar = (zrx) obj;
        this.f.add(this.k.k(zrxVar, (mce) optional.orElse((java.lang.Object) null), java.util.Collections.EMPTY_LIST));
    }

    public final void o() {
        rmw rmwVar = rmw.eT;
        if (s()) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
            defpackage.oqy oqyVar = this.c;
            intent.putExtra("phone", oqyVar.c);
            if (!oqyVar.g.isEmpty()) {
                intent.putExtra("name", oqyVar.g);
            }
            java.util.List list = this.f;
            android.content.Context context = this.b;
            defpackage.ord ordVarA = defpackage.ord.a();
            ordVarA.c(context);
            ordVarA.a = intent;
            ordVarA.f(2132017293);
            ordVarA.d(2131231981);
            ordVarA.e(aify.p(rmwVar));
            list.add(ordVarA.b());
        }
    }

    public final void p() {
        rmw rmwVar = rmw.eP;
        if (s()) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
            defpackage.oqy oqyVar = this.c;
            intent.putExtra("phone", oqyVar.c);
            intent.addFlags(1);
            if (!oqyVar.g.isEmpty()) {
                intent.putExtra("name", oqyVar.g);
            }
            java.util.List list = this.f;
            android.content.Context context = this.b;
            defpackage.ord ordVarA = defpackage.ord.a();
            ordVarA.c(context);
            ordVarA.a = intent;
            ordVarA.f(2132018200);
            ordVarA.d(2131231981);
            ordVarA.e(aify.p(rmwVar));
            list.add(ordVarA.b());
        }
    }

    public final void q(int i) {
        defpackage.oqv oqvVar;
        defpackage.oqv oqvVar2;
        defpackage.oqy oqyVar = this.c;
        if (oqyVar.r || oqyVar.p) {
            return;
        }
        akzx akzxVarM = defpackage.jjx.a.m();
        java.lang.String str = oqyVar.d;
        akzxVarM.u();
        defpackage.jjx jjxVar = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        jjxVar.b |= 1;
        jjxVar.c = str;
        java.lang.String str2 = oqyVar.e;
        akzxVarM.u();
        defpackage.jjx jjxVar2 = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        jjxVar2.b |= 2;
        jjxVar2.d = str2;
        java.lang.String str3 = oqyVar.f;
        akzxVarM.u();
        defpackage.jjx jjxVar3 = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        jjxVar3.b |= 4;
        jjxVar3.e = str3;
        int i2 = oqyVar.h;
        akzxVarM.u();
        defpackage.jjx jjxVar4 = (defpackage.jjx) akzxVarM.b;
        jjxVar4.b |= 8;
        jjxVar4.f = i2;
        akzxVarM.u();
        defpackage.jjx jjxVar5 = (defpackage.jjx) akzxVarM.b;
        jjxVar5.g = i - 1;
        jjxVar5.b |= 16;
        rmt rmtVarB = rmt.b(oqyVar.q);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        akzxVarM.u();
        defpackage.jjx jjxVar6 = (defpackage.jjx) akzxVarM.b;
        jjxVar6.h = rmtVarB.q;
        jjxVar6.b |= 32;
        long j = oqyVar.t;
        akzxVarM.u();
        defpackage.jjx jjxVar7 = (defpackage.jjx) akzxVarM.b;
        jjxVar7.b |= 256;
        jjxVar7.k = j;
        tkj tkjVar = oqyVar.x;
        if (tkjVar == null) {
            tkjVar = tkj.a;
        }
        akzxVarM.u();
        defpackage.jjx jjxVar8 = (defpackage.jjx) akzxVarM.b;
        j$.util.Objects.requireNonNull(tkjVar);
        jjxVar8.l = tkjVar;
        jjxVar8.b |= 512;
        boolean z = oqyVar.o;
        akzxVarM.u();
        defpackage.jjx jjxVar9 = (defpackage.jjx) akzxVarM.b;
        jjxVar9.b |= 1024;
        jjxVar9.q = z;
        boolean z2 = oqyVar.w;
        akzxVarM.u();
        defpackage.jjx jjxVar10 = (defpackage.jjx) akzxVarM.b;
        jjxVar10.b |= 2048;
        jjxVar10.r = z2;
        defpackage.jjx jjxVar11 = (defpackage.jjx) akzxVarM.p();
        rmw rmwVar = c() ? rmw.lk : rmw.hf;
        if (oqyVar.w) {
            java.util.List list = this.f;
            android.content.Context context = this.b;
            list.add(new defpackage.oqv(context, jjxVar11, c() ? rmx.vw : rmx.vv, 0));
            if (oqyVar.n) {
                oqvVar2 = new defpackage.oqv(context, jjxVar11, rmwVar, 2);
            } else {
                oqvVar2 = new defpackage.oqv(context, jjxVar11, c() ? rmx.uj : rmx.uh, 4);
            }
            list.add(oqvVar2);
            return;
        }
        if (!oqyVar.o) {
            boolean z3 = oqyVar.n;
            java.util.List list2 = this.f;
            if (z3) {
                list2.add(new defpackage.oqv(this.b, jjxVar11, rmwVar, 2));
                return;
            } else {
                list2.add(new defpackage.oqv(this.b, jjxVar11, c() ? rmx.uj : rmx.uh, 4));
                return;
            }
        }
        java.util.List list3 = this.f;
        android.content.Context context2 = this.b;
        list3.add(new defpackage.oqv(context2, jjxVar11, c() ? rmw.ll : rmw.hg, 1));
        if (oqyVar.n) {
            oqvVar = new defpackage.oqv(context2, jjxVar11, rmwVar, 2);
        } else {
            oqvVar = new defpackage.oqv(context2, jjxVar11, c() ? rmx.uj : rmx.uh, 4);
        }
        list3.add(oqvVar);
    }
}
