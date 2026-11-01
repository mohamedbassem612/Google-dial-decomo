package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mas implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ mas(mau mauVar, android.app.Activity activity, kiu kiuVar, boolean z, int i) {
        this.$cid = i;
        this.b = mauVar;
        this.c = activity;
        this.d = kiuVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, nwu] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i;
        int i2;
        int i3 = this.$cid;
        if (i3 == 0) {
            ((mau) this.b).n((android.content.Context) this.c, (kiu) this.d, this.a);
            return;
        }
        if (i3 != 1) {
            boolean z = this.a;
            if (i3 != 2) {
                java.lang.Object obj = this.d;
                if (z) {
                    mau mauVar = (mau) obj;
                    mauVar.j.i((java.lang.String) null).b(mce.C);
                    mauVar.c.n(rmw.hH);
                }
                mau mauVar2 = (mau) obj;
                mauVar2.l.w((zrx) mauVar2.q((kiu) this.c, z, false, ((wgi) this.b).c).a);
                return;
            }
            rmw rmwVar = z ? rmw.hG : rmw.ev;
            mau mauVar3 = (mau) this.d;
            mauVar3.c.n(rmwVar);
            i = z ? 11 : 8;
            java.lang.Object obj2 = this.c;
            com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
            kiu kiuVar = (kiu) obj2;
            callIntent$BuilderA.y(kiuVar.g);
            callIntent$BuilderA.z(i);
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            callIntent$BuilderA.p(!kiwVar.g.isEmpty());
            akzx akzxVarM = defpackage.jxb.b.m();
            akzxVarM.u();
            defpackage.jxb jxbVar = (defpackage.jxb) akzxVarM.b;
            jxbVar.d = i - 1;
            jxbVar.c |= 1;
            i2 = z ? -1 : kiuVar.y;
            rsr rsrVar = mauVar3.m;
            java.lang.Object obj3 = this.b;
            akzxVarM.u();
            defpackage.jxb jxbVar2 = (defpackage.jxb) akzxVarM.b;
            jxbVar2.c |= 65536;
            jxbVar2.r = i2;
            akzxVarM.u();
            defpackage.jxb jxbVar3 = (defpackage.jxb) akzxVarM.b;
            jxbVar3.c |= 131072;
            jxbVar3.s = false;
            callIntent$BuilderA.r((defpackage.jxb) akzxVarM.p());
            callIntent$BuilderA.t(true);
            rsrVar.b.k(callIntent$BuilderA.a().getSchemeSpecificPart(), (defpackage.nwt) obj3);
            return;
        }
        boolean z2 = this.a;
        java.lang.Object obj4 = this.c;
        rmw rmwVar2 = z2 ? rmw.hF : rmw.ex;
        mau mauVar4 = (mau) this.d;
        mauVar4.c.n(rmwVar2);
        if (z2) {
            mauVar4.j.i((java.lang.String) null).b(mce.dz);
        }
        java.lang.Object obj5 = this.b;
        rsr rsrVar2 = mauVar4.m;
        boolean z3 = ((wgi) obj5).d;
        ahoq ahoqVarW = ahvr.W(334, "PlaceCarrierVideoCall_ConversationHistoryAction");
        try {
            java.lang.Object obj6 = rsrVar2.a;
            i = z2 ? 11 : 8;
            amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
            amdxVar.s(((kiu) obj4).g);
            amdxVar.v(i);
            defpackage.kiw kiwVar2 = ((kiu) obj4).r;
            if (kiwVar2 == null) {
                kiwVar2 = defpackage.kiw.a;
            }
            amdxVar.l(!kiwVar2.g.isEmpty());
            akzx akzxVarM2 = defpackage.jxb.b.m();
            akzxVarM2.u();
            defpackage.jxb jxbVar4 = (defpackage.jxb) akzxVarM2.b;
            jxbVar4.d = i - 1;
            jxbVar4.c |= 1;
            i2 = z2 ? -1 : ((kiu) obj4).y;
            akzxVarM2.u();
            defpackage.jxb jxbVar5 = (defpackage.jxb) akzxVarM2.b;
            jxbVar5.c |= 65536;
            jxbVar5.r = i2;
            akzxVarM2.u();
            defpackage.jxb jxbVar6 = (defpackage.jxb) akzxVarM2.b;
            jxbVar6.c |= 131072;
            jxbVar6.s = z3;
            amdxVar.m((defpackage.jxb) akzxVarM2.p());
            amdxVar.q(true);
            ((acxg) obj6).w((zrx) amdxVar.a);
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ mas(mau mauVar, boolean z, kiu kiuVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.d = mauVar;
        this.a = z;
        this.c = kiuVar;
        this.b = obj;
    }
}
