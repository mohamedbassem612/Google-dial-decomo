package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uhp {
    public final android.content.Context a;
    public final aoin b;
    public final aoin c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    private final java.lang.Object l;

    public uhp(defpackage.ska skaVar, defpackage.whl whlVar, aogc aogcVar, android.content.Context context, aoss aossVar, sjy sjyVar, defpackage.rzs rzsVar, defpackage.sfa sfaVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(whlVar, "uiModelCache");
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(context, "appContext");
        aooh.f(aossVar, "blockingScope");
        this.h = skaVar;
        this.i = whlVar;
        this.j = aogcVar;
        this.a = context;
        this.f = aossVar;
        this.e = sjyVar;
        this.k = rzsVar;
        this.d = sfaVar;
        this.c = aoinVar;
        this.g = aoinVar2;
        this.l = aoinVar3;
        this.b = aoinVar4;
    }

    public final boolean A() {
        defpackage.skp skpVar;
        java.lang.Object obj = ((defpackage.whl) this.i).a;
        if (obj == null || (skpVar = ((defpackage.skq) obj).a) == null) {
            return false;
        }
        return skpVar.p;
    }

    public final void B() {
        z(new defpackage.sdi(2));
    }

    public final void C(int i) {
        z(new cos(i, 7));
    }

    public final ajcq a() {
        return ((aogc) this.k).bl(new lbn(14));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq b() {
        return ahvr.H(c(), new defpackage.uev(this, 5), (java.util.concurrent.Executor) this.g);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq c() {
        uhs uhsVar = (uhs) this.h;
        ajcq ajcqVarB = uhsVar.b();
        ajcq ajcqVarC = uhsVar.c();
        ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarC});
        defpackage.tbb tbbVar = new defpackage.tbb((java.lang.Object) this, ajcqVarB, ajcqVarC, 7);
        ?? r0 = this.g;
        return ahvr.I(ahdaVarAk.o(tbbVar, (java.util.concurrent.Executor) r0), new defpackage.udu(this, 3), (java.util.concurrent.Executor) r0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final void d(bo boVar, defpackage.uhn uhnVar, android.content.DialogInterface.OnDismissListener onDismissListener) {
        ?? r0 = this.f;
        ((agsm) this.l).g(a(), ((akzm) r0.a()).b, java.util.concurrent.TimeUnit.SECONDS);
        ahpm ahpmVarG = ahns.g();
        try {
            defpackage.uho uhoVar = new defpackage.uho();
            uhoVar.ak = uhnVar;
            uhoVar.al = onDismissListener;
            uhoVar.r(boVar, "SpamBlockingPromoDialog");
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final android.accounts.Account e() {
        return (android.accounts.Account) ((defpackage.whl) this.i).b;
    }

    public final defpackage.skn f() {
        defpackage.skp skpVar;
        java.lang.Object obj = ((defpackage.whl) this.i).a;
        if (obj == null || (skpVar = ((defpackage.skq) obj).a) == null) {
            return null;
        }
        defpackage.skn sknVar = skpVar.m;
        return sknVar == null ? defpackage.skn.a : sknVar;
    }

    public final defpackage.sko g() {
        defpackage.skp skpVar;
        java.lang.Object obj = ((defpackage.whl) this.i).a;
        defpackage.sko skoVar = null;
        if (obj != null && (skpVar = ((defpackage.skq) obj).a) != null && (skpVar.b & 65536) != 0 && (skoVar = skpVar.q) == null) {
            skoVar = defpackage.sko.a;
        }
        if (skoVar != null) {
            return skoVar;
        }
        defpackage.sko skoVar2 = defpackage.sjz.a.c;
        m(skoVar2);
        return skoVar2;
    }

    public final defpackage.sko h() {
        defpackage.skp skpVar;
        java.lang.Object obj = ((defpackage.whl) this.i).a;
        if (obj == null || (skpVar = ((defpackage.skq) obj).a) == null || (skpVar.b & 8) == 0) {
            return null;
        }
        defpackage.sko skoVar = skpVar.f;
        return skoVar == null ? defpackage.sko.a : skoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aoin, java.lang.Object] */
    public final java.lang.Object i(android.net.Uri uri, aoln aolnVar) {
        defpackage.skl sklVar;
        defpackage.skp skpVarB;
        char c;
        android.net.Uri uri2;
        int i;
        aoot aootVar;
        defpackage.skp skpVar;
        aoot aootVar2;
        defpackage.skp skpVar2;
        if (aolnVar instanceof defpackage.skl) {
            sklVar = (defpackage.skl) aolnVar;
            int i2 = sklVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sklVar.e = i2 - Integer.MIN_VALUE;
            } else {
                sklVar = new defpackage.skl(this, aolnVar);
            }
        } else {
            sklVar = new defpackage.skl(this, aolnVar);
        }
        java.lang.Object objAj = sklVar.d;
        aolu aoluVar = aolu.a;
        int i3 = sklVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = sklVar.c;
                aoot aootVar3 = sklVar.f;
                defpackage.skp skpVar3 = (defpackage.skp) sklVar.b;
                android.net.Uri uri3 = (android.net.Uri) sklVar.a;
                aooc.af(objAj);
                i = i4;
                aootVar = aootVar3;
                skpVar = skpVar3;
                uri2 = uri3;
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aootVar = sklVar.f;
                aootVar2 = (aoot) sklVar.b;
                skpVar2 = (defpackage.skp) sklVar.a;
                aooc.af(objAj);
            }
            aootVar.a = objAj;
            skpVar = skpVar2;
            aootVar = aootVar2;
            this.a.grantUriPermission("com.google.android.contacts", (android.net.Uri) aootVar.a, 1);
            defpackage.rze rzeVarI = snl.i(skpVar.p());
            java.lang.String string = ((android.net.Uri) aootVar.a).toString();
            aooh.e(string, "toString(...)");
            rzeVarI.c(string);
            y(rzeVarI.b());
            return aojh.a;
        }
        aooc.af(objAj);
        java.lang.Object obj = ((defpackage.whl) this.i).a;
        if (obj == null || (skpVarB = ((defpackage.skq) obj).a) == null) {
            skpVarB = snl.i(defpackage.skp.a.m()).b();
        }
        int i5 = skpVarB.s;
        if (i5 == 0) {
            c = 2;
        } else if (i5 != 1) {
            c = i5 != 2 ? (char) 0 : (char) 4;
        } else {
            c = 3;
        }
        int iLongValue = (int) ((c == 0 || c != 3) ? ((java.lang.Number) this.c.a()).longValue() : ((java.lang.Number) this.b.a()).longValue());
        aoot aootVar4 = new aoot();
        aootVar4.a = uri;
        java.lang.Object obj2 = this.e;
        sklVar.a = uri;
        sklVar.b = skpVarB;
        sklVar.f = aootVar4;
        sklVar.c = iLongValue;
        sklVar.e = 1;
        java.lang.Object objK = ((sjy) obj2).k(uri, sklVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        uri2 = uri;
        i = iLongValue;
        aootVar = aootVar4;
        skpVar = skpVarB;
        objAj = objK;
        if (((java.lang.Boolean) objAj).booleanValue()) {
            java.lang.Object obj3 = this.e;
            android.util.Size size = new android.util.Size((int) ((java.lang.Number) this.g.a()).longValue(), (int) ((java.lang.Number) this.l.a()).longValue());
            sklVar.a = skpVar;
            sklVar.b = aootVar;
            sklVar.f = aootVar;
            sklVar.e = 2;
            sjy sjyVar = (sjy) obj3;
            objAj = aoov.aj(sjyVar.g, new defpackage.sjq(sjyVar, uri2, size, i, null), sklVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            aootVar2 = aootVar;
            skpVar2 = skpVar;
            aootVar.a = objAj;
            skpVar = skpVar2;
            aootVar = aootVar2;
        }
        this.a.grantUriPermission("com.google.android.contacts", (android.net.Uri) aootVar.a, 1);
        defpackage.rze rzeVarI2 = snl.i(skpVar.p());
        java.lang.String string2 = ((android.net.Uri) aootVar.a).toString();
        aooh.e(string2, "toString(...)");
        rzeVarI2.c(string2);
        y(rzeVarI2.b());
        return aojh.a;
    }

    public final java.lang.String j() {
        defpackage.skp skpVar;
        java.lang.Object obj = ((defpackage.whl) this.i).a;
        if (obj == null || (skpVar = ((defpackage.skq) obj).a) == null) {
            return null;
        }
        return skpVar.d;
    }

    public final void k() {
        z(new defpackage.skk(1));
    }

    public final void l(java.lang.String str) {
        aooh.f(str, "contactName");
        z(new defpackage.rzt(str, 14));
    }

    public final void m(defpackage.sko skoVar) {
        aooh.f(skoVar, "fontStyle");
        z(new defpackage.rzt(skoVar, 13));
    }

    public final void n(java.lang.Float f, java.lang.Integer num, java.lang.Float f2) {
        defpackage.sko skoVarH = h();
        if (skoVarH == null) {
            skoVarH = defpackage.sjz.a.c;
        }
        defpackage.ryg rygVarK = snl.k(skoVarH.p());
        if (f != null) {
            f.floatValue();
            rygVarK.f(f.floatValue());
        }
        if (num != null) {
            num.intValue();
            rygVarK.e(num.intValue());
        }
        if (f2 != null) {
            f2.floatValue();
            rygVarK.c(f2.floatValue());
        }
        p(rygVarK.b());
    }

    public final void o(long j) {
        z(new bpd(j, 7));
    }

    public final void p(defpackage.sko skoVar) {
        aooh.f(skoVar, "fontStyle");
        z(new defpackage.rzt(skoVar, 12));
    }

    public final void q(final float f, final float f2, final int i, final int i2, final float f3) {
        z(new aonj() { // from class: skj
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.skp skpVar = (defpackage.skp) obj;
                aooh.f(skpVar, "uiModel");
                akzx akzxVarP = skpVar.p();
                akzx akzxVarM = defpackage.sko.a.m();
                akzxVarM.u();
                defpackage.sko skoVar = (defpackage.sko) akzxVarM.b;
                skoVar.b |= 1;
                skoVar.c = f;
                akzxVarM.u();
                defpackage.sko skoVar2 = (defpackage.sko) akzxVarM.b;
                skoVar2.b |= 2;
                skoVar2.d = f2;
                akzxVarM.u();
                defpackage.sko skoVar3 = (defpackage.sko) akzxVarM.b;
                skoVar3.b |= 4;
                skoVar3.e = i;
                akzxVarM.u();
                defpackage.sko skoVar4 = (defpackage.sko) akzxVarM.b;
                skoVar4.b |= 8;
                skoVar4.f = i2;
                akzxVarM.u();
                defpackage.sko skoVar5 = (defpackage.sko) akzxVarM.b;
                skoVar5.b |= 16;
                skoVar5.g = f3;
                defpackage.sko skoVar6 = (defpackage.sko) akzxVarM.p();
                akzxVarP.u();
                defpackage.skp skpVar2 = (defpackage.skp) akzxVarP.b;
                j$.util.Objects.requireNonNull(skoVar6);
                skpVar2.f = skoVar6;
                skpVar2.b |= 8;
                alad aladVarP = akzxVarP.p();
                aooh.e(aladVarP, "build(...)");
                return (defpackage.skp) aladVarP;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final void r(java.lang.String str) {
        aoov.an((aoss) this.f, (aolr) null, 0, new roz(this, str, (aoln) null, 7), 3);
    }

    public final void s(final float f, final float f2, final float f3) {
        z(new aonj() { // from class: skh
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.skp skpVar = (defpackage.skp) obj;
                aooh.f(skpVar, "uiModel");
                defpackage.rze rzeVarI = snl.i(skpVar.p());
                rzeVarI.g(f);
                rzeVarI.e(f2);
                rzeVarI.f(f3);
                return rzeVarI.b();
            }
        });
    }

    public final void t(boolean z) {
        z(new skg(z, 3));
    }

    public final void u(boolean z) {
        z(new skg(z, 2));
    }

    public final void v(long j) {
        z(new bpd(j, 6));
    }

    public final void w(boolean z) {
        z(new skg(z, 0));
    }

    public final void x(boolean z) {
        z(new skg(z, 5));
    }

    public final void y(defpackage.skp skpVar) {
        ((defpackage.whl) this.i).g(skpVar);
        ((aogc) this.j).s(ajcm.a, defpackage.ska.a);
    }

    public final void z(aonj aonjVar) {
        defpackage.skp skpVar;
        defpackage.whl whlVar = (defpackage.whl) this.i;
        java.lang.Object obj = whlVar.a;
        if (obj == null || (skpVar = ((defpackage.skq) obj).a) == null) {
            skpVar = defpackage.skp.a;
            aooh.e(skpVar, "getDefaultInstance(...)");
        }
        whlVar.g((defpackage.skp) aonjVar.a(skpVar));
        ((aogc) this.j).s(ajcm.a, defpackage.ska.a);
    }

    public uhp(android.content.Context context, uhs uhsVar, rlv rlvVar, zjm zjmVar, aoin aoinVar, aoin aoinVar2, rwi rwiVar, aoin aoinVar3, aogc aogcVar, ajct ajctVar, agsm agsmVar, zzx zzxVar) {
        this.a = context;
        this.h = uhsVar;
        this.d = rlvVar;
        this.j = zjmVar;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.e = rwiVar;
        this.f = aoinVar3;
        this.k = aogcVar;
        this.l = agsmVar;
        this.i = zzxVar;
        this.g = ajctVar;
    }
}
