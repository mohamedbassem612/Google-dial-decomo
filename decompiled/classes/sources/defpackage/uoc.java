package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class uoc extends defpackage.aoof implements defpackage.aonj {
    public uoc(java.lang.Object obj) {
        super(1, obj, defpackage.unb.class, "onContactClicked", "onContactClicked(J)V", 0);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, nwu] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, rlv] */
    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.Object next;
        java.lang.String string;
        long jLongValue = ((java.lang.Number) obj).longValue();
        defpackage.unb unbVar = (defpackage.unb) this.e;
        java.util.Iterator it = unbVar.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((umy) next).c != jLongValue);
        umy umyVar = (umy) next;
        if (umyVar != null) {
            umt umtVar = new umt(umyVar.e, umyVar.f, umyVar.h, umyVar.g, umyVar.k, umyVar.l);
            defpackage.zth zthVar = unbVar.j;
            unf unfVar = (unf) defpackage.ajsz.bO(umtVar.c);
            unf unfVar2 = umtVar.d;
            if (unfVar2 != null) {
                unfVar = unfVar2;
            }
            int i = 2;
            if (unfVar != null) {
                java.lang.String str = umtVar.a;
                android.net.Uri uri = umtVar.b;
                int i2 = umtVar.e;
                int i3 = umtVar.f;
                int i4 = unfVar.e;
                int i5 = i4 - 1;
                if (i5 == 2) {
                    zthVar.c.o(defpackage.rmx.IMS_VIDEO_REQUESTED_FROM_FAVORITE_CONTACT);
                    ((defpackage.gpd) zthVar.b).i(null).b(defpackage.mce.USER_CLICKED_VIDEO_CALL_CONTACT_FROM_FAVORITES);
                } else if (i5 == 3) {
                    zthVar.c.n(defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FOR_FAVORITE_CONTACT);
                    ((defpackage.gpd) zthVar.b).i(null).b(defpackage.mce.USER_CLICKED_VIDEO_APP_CALL_CONTACT_FROM_FAVORITES);
                } else if (i5 != 4) {
                    ((defpackage.gpd) zthVar.b).i(null).b(defpackage.mce.USER_CLICKED_CONTACT_FROM_FAVORITES);
                }
                i = 1;
                if (i4 == 4) {
                    zthVar.d.k(unfVar.a, nwt.e);
                } else {
                    defpackage.akzx akzxVarM = abvz.a.m();
                    akzxVarM.u();
                    abvz abvzVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    abvzVar.b |= 1;
                    abvzVar.c = str;
                    if (uri == null || (string = uri.toString()) == null) {
                        string = "";
                    }
                    akzxVarM.u();
                    abvz abvzVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(string);
                    abvzVar2.b |= 4;
                    abvzVar2.e = string;
                    abvz abvzVarR = akzxVarM.r();
                    defpackage.aooh.e(abvzVarR, "build(...)");
                    defpackage.akzx akzxVarM2 = jxb.b.m();
                    akzxVarM2.u();
                    jxb jxbVar = akzxVarM2.b;
                    jxbVar.d = 28;
                    jxbVar.c |= 1;
                    akzxVarM2.u();
                    jxb jxbVar2 = akzxVarM2.b;
                    jxbVar2.c |= 4096;
                    jxbVar2.n = i2;
                    akzxVarM2.u();
                    jxb jxbVar3 = akzxVarM2.b;
                    jxbVar3.c |= 8192;
                    jxbVar3.o = i3;
                    jxb jxbVarR = akzxVarM2.r();
                    defpackage.aooh.e(jxbVarR, "build(...)");
                    amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
                    amdxVar.s(unfVar.a);
                    amdxVar.l(true);
                    amdxVar.o(abvzVarR);
                    amdxVar.m(jxbVarR);
                    amdxVar.q(i4 == 3);
                    if (i4 == 5) {
                        amdxVar.p(true);
                    }
                    ((defpackage.acxg) zthVar.a).w((zrx) amdxVar.a);
                }
            } else {
                ((defpackage.gpd) zthVar.b).i(null).b(defpackage.mce.USER_CLICKED_CONTACT_FROM_FAVORITES);
                zthVar.c.n(defpackage.rmw.FAVORITE_OPEN_DISAMBIG_DIALOG);
            }
            if (i - 1 != 0) {
                unbVar.h.e(new ums(umyVar));
            }
        }
        return defpackage.aojh.a;
    }
}
