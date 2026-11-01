package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tez implements aonn {
    public static final aimz a = aimz.i("com/android/dialer/search/composables/DefaultSearchRowClickEventListener");
    public final nwu b;
    public final defpackage.zlr c;
    public final wsc d;
    private final aoss e;
    private final mkj f;
    private final aoin g;
    private final defpackage.rju h;
    private final acxg i;

    public tez(acxg acxgVar, defpackage.zlr zlrVar, aazc aazcVar, wsc wscVar, defpackage.rju rjuVar, nwu nwuVar, aoss aossVar, mkj mkjVar, aoin aoinVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(rjuVar, "openHistoryActionFutureFactory");
        aooh.f(nwuVar, "meetCallController");
        aooh.f(aossVar, "uiScope");
        aooh.f(mkjVar, "simSelectorService");
        aooh.f(aoinVar, "enableDialpadSimSelector");
        this.i = acxgVar;
        this.c = zlrVar;
        this.d = wscVar;
        this.h = rjuVar;
        this.b = nwuVar;
        this.e = aossVar;
        this.f = mkjVar;
        this.g = aoinVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        c((defpackage.tfz) obj, (android.app.Activity) obj2);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, rlv] */
    public final java.lang.Object b(defpackage.tft tftVar, android.app.Activity activity, aoln aolnVar) {
        defpackage.tey teyVar;
        if (aolnVar instanceof defpackage.tey) {
            teyVar = (defpackage.tey) aolnVar;
            int i = teyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                teyVar.c = i - Integer.MIN_VALUE;
            } else {
                teyVar = new defpackage.tey(this, aolnVar);
            }
        } else {
            teyVar = new defpackage.tey(this, aolnVar);
        }
        java.lang.Object objD = teyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = teyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarH = this.h.h(activity, tftVar.a.a);
            teyVar.d = tftVar;
            teyVar.c = 1;
            objD = aosv.D(ajcqVarH, teyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tftVar = teyVar.d;
            aooc.af(objD);
        }
        defpackage.tjh tjhVar = (defpackage.tjh) objD;
        if (tjhVar == null) {
            a.b().l("com/android/dialer/search/composables/DefaultSearchRowClickEventListener", "openHistory", 204, "DefaultSearchRowClickEventListener.kt").v("loaded action is null");
            return aojh.a;
        }
        tjhVar.a();
        this.c.a.n(tftVar.a.f == 2 ? rmw.jM : rmw.jJ);
        return aojh.a;
    }

    public final void c(defpackage.tfz tfzVar, android.app.Activity activity) {
        aooh.f(tfzVar, "event");
        aooh.f(activity, "activity");
        aoov.an(this.e, (aolr) null, 0, new defpackage.tex(tfzVar, this, activity, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, ruc] */
    public final void d(defpackage.tfj tfjVar, defpackage.abvz abvzVar, boolean z, android.app.Activity activity, int i) {
        mce mceVar;
        mce mceVar2;
        android.telecom.PhoneAccountHandle phoneAccountHandleA;
        int i2 = tfjVar.f;
        int i3 = i2 + (-1) != 0 ? 3 : 7;
        jhw jhwVarL = hmr.l(jxb.b.m());
        jhwVarL.C(i3);
        int i4 = tfjVar.b;
        akzx akzxVar = (akzx) jhwVarL.a;
        akzxVar.u();
        jxb jxbVar = akzxVar.b;
        jxbVar.c |= 2;
        jxbVar.e = i4;
        java.lang.String str = tfjVar.c;
        int length = str.length();
        akzxVar.u();
        jxb jxbVar2 = akzxVar.b;
        jxbVar2.c |= 4;
        jxbVar2.f = length;
        akzxVar.u();
        jxb jxbVar3 = akzxVar.b;
        jxbVar3.c |= 1024;
        jxbVar3.l = true;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - tfjVar.d;
        akzxVar.u();
        jxb jxbVar4 = akzxVar.b;
        jxbVar4.c |= 2048;
        jxbVar4.m = jElapsedRealtime;
        akzxVar.u();
        jxb jxbVar5 = akzxVar.b;
        jxbVar5.c |= 131072;
        jxbVar5.s = z;
        jxb jxbVarB = jhwVarL.B();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(tfjVar.a);
        amdxVar.m(jxbVarB);
        amdxVar.l(true);
        amdxVar.o(abvzVar);
        amdxVar.q(i == 3);
        amdxVar.p(i == 2);
        if (((java.lang.Boolean) this.g.a()).booleanValue() && (phoneAccountHandleA = this.f.a()) != null) {
            amdxVar.r(phoneAccountHandleA);
        }
        this.i.w((defpackage.zrx) amdxVar.a);
        defpackage.zlr zlrVar = this.c;
        zlrVar.c.m(ruc.H);
        int i5 = tfjVar.e;
        int i6 = i5 - 1;
        if (i5 == 2) {
            zlrVar.a.n(rmw.ld);
        }
        if (i == 3) {
            zlrVar.a.n(rmw.ew);
            if (i6 != 0) {
                mceVar2 = i6 != 4 ? mce.dv : mce.dt;
            } else {
                mceVar2 = mce.du;
            }
            ((gpd) zlrVar.d).i((java.lang.String) null).b(mceVar2);
        } else {
            if (i6 != 0) {
                mceVar = i6 != 4 ? mce.H : mce.bL;
            } else {
                mceVar = mce.I;
            }
            ((gpd) zlrVar.d).i((java.lang.String) null).b(mceVar);
        }
        if (abvzVar != null) {
            java.lang.String str2 = abvzVar.c;
            aooh.e(str2, "getName(...)");
            if (i2 == 2) {
                zlrVar.a.n(defpackage.ths.f(str, str2, (android.content.Context) zlrVar.b) ? rmw.jz : rmw.jA);
            }
        }
        ahvr.g(new defpackage.tjr(), activity);
    }
}
