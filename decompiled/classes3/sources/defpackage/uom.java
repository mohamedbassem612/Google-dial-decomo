package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class uom extends aoof implements aonj {
    public uom(java.lang.Object obj) {
        super(1, obj, defpackage.uoo.class, "contactClicked", "contactClicked(J)V", 0);
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, nwu] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, rlv] */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.Object next;
        defpackage.upk upkVar;
        java.lang.String string;
        long jLongValue = ((java.lang.Number) obj).longValue();
        defpackage.uoo uooVar = (defpackage.uoo) this.e;
        java.lang.String[] strArr = defpackage.uoo.a;
        unc uncVarB = uooVar.b();
        unc uncVar = uncVarB instanceof unc ? uncVarB : null;
        if (uncVar == null) {
            defpackage.uoo.b.b().l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer", "contactClicked", 276, "FavoritesBarFragmentPeer.kt").v("cannot place call because the data is being loaded");
        } else {
            java.util.Iterator it = uncVar.a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((defpackage.umy) next).c != jLongValue);
            defpackage.umy umyVar = (defpackage.umy) next;
            if (umyVar == null) {
                defpackage.uoo.b.b().l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer", "contactClicked", 287, "FavoritesBarFragmentPeer.kt").v("cannot find the model corresponding to the contact id");
            } else {
                defpackage.abtr abtrVar = uooVar.y;
                java.util.List<defpackage.unf> list = umyVar.h;
                defpackage.unf unfVar = (defpackage.unf) ajsz.bO(list);
                defpackage.unf unfVar2 = umyVar.g;
                if (unfVar2 != null) {
                    unfVar = unfVar2;
                }
                if (unfVar != null) {
                    java.lang.String str = umyVar.e;
                    android.net.Uri uri = umyVar.f;
                    int i = umyVar.k;
                    int i2 = umyVar.l;
                    int i3 = unfVar.e;
                    int i4 = i3 - 1;
                    if (i4 == 2) {
                        abtrVar.b.o(rmx.if);
                        ((gpd) abtrVar.e).i((java.lang.String) null).b(mce.ez);
                    } else if (i4 == 3) {
                        abtrVar.b.n(rmw.im);
                        ((gpd) abtrVar.e).i((java.lang.String) null).b(mce.ex);
                    } else if (i4 != 4) {
                        ((gpd) abtrVar.e).i((java.lang.String) null).b(mce.F);
                    }
                    if (i3 == 4) {
                        abtrVar.d.k(unfVar.a, nwt.e);
                    } else {
                        akzx akzxVarM = defpackage.abvz.a.m();
                        akzxVarM.u();
                        defpackage.abvz abvzVar = (defpackage.abvz) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        abvzVar.b |= 1;
                        abvzVar.c = str;
                        if (uri == null || (string = uri.toString()) == null) {
                            string = "";
                        }
                        akzxVarM.u();
                        defpackage.abvz abvzVar2 = (defpackage.abvz) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string);
                        abvzVar2.b |= 4;
                        abvzVar2.e = string;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        akzx akzxVarM2 = jxb.b.m();
                        akzxVarM2.u();
                        jxb jxbVar = akzxVarM2.b;
                        jxbVar.d = 28;
                        jxbVar.c |= 1;
                        akzxVarM2.u();
                        jxb jxbVar2 = akzxVarM2.b;
                        jxbVar2.c |= 4096;
                        jxbVar2.n = i;
                        akzxVarM2.u();
                        jxb jxbVar3 = akzxVarM2.b;
                        jxbVar3.c |= 8192;
                        jxbVar3.o = i2;
                        jxb jxbVarP = akzxVarM2.p();
                        aooh.e(jxbVarP, "build(...)");
                        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
                        amdxVar.s(unfVar.a);
                        amdxVar.l(true);
                        amdxVar.o((defpackage.abvz) aladVarP);
                        amdxVar.m(jxbVarP);
                        amdxVar.q(i3 == 3);
                        if (i3 == 5) {
                            amdxVar.p(true);
                        }
                        ((acxg) abtrVar.c).w((defpackage.zrx) amdxVar.a);
                    }
                } else {
                    ((gpd) abtrVar.e).i((java.lang.String) null).b(mce.F);
                    akzx akzxVarM3 = jxb.b.m();
                    akzxVarM3.u();
                    jxb jxbVar4 = akzxVarM3.b;
                    jxbVar4.d = 28;
                    jxbVar4.c |= 1;
                    jxb jxbVarP2 = akzxVarM3.p();
                    aooh.e(jxbVarP2, "build(...)");
                    jxb jxbVar5 = jxbVarP2;
                    defpackage.vqu vquVarBM = wsc.bM(defpackage.upt.a.m());
                    vquVarBM.I(umyVar.c);
                    vquVarBM.G(umyVar.e);
                    vquVarBM.E(umyVar.a);
                    vquVarBM.F(umyVar.b);
                    android.net.Uri uri2 = umyVar.f;
                    if (uri2 != null) {
                        vquVarBM.H(uri2.toString());
                    }
                    vquVarBM.K();
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                    for (defpackage.unf unfVar3 : list) {
                        defpackage.vqu vquVarBN = wsc.bN(defpackage.upl.a.m());
                        vquVarBN.O(unfVar3.a);
                        vquVarBN.P(unfVar3.b);
                        vquVarBN.N(unfVar3.c);
                        int i5 = unfVar3.e - 1;
                        if (i5 == 0) {
                            upkVar = defpackage.upk.UNKNOWN;
                        } else if (i5 == 2) {
                            upkVar = defpackage.upk.IMS_VIDEO;
                        } else if (i5 != 3) {
                            upkVar = i5 != 4 ? defpackage.upk.VOICE : defpackage.upk.RTT;
                        } else {
                            upkVar = defpackage.upk.DUO;
                        }
                        vquVarBN.Q(upkVar);
                        vquVarBN.M(unfVar3.d);
                        arrayList.add(vquVarBN.L());
                    }
                    vquVarBM.J(arrayList);
                    defpackage.upt uptVarD = vquVarBM.D();
                    abtrVar.b.n(rmw.iQ);
                    defpackage.umr.aX(uptVarD, ((aw) abtrVar.f).I(), jxbVar5);
                }
            }
        }
        return aojh.a;
    }
}
