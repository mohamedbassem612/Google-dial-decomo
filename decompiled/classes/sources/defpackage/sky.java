package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class sky implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public sky(defpackage.alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Type inference failed for: r8v18, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, ykp] */
    /* JADX WARN: Type inference failed for: r8v58, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v62, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v66, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v68, types: [ccp, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                sle sleVar = (sle) obj;
                sleVar.i.o(defpackage.rmx.KAPPA_NAVIGATION_BUTTON_CLICKED);
                sleVar.s.e();
                return defpackage.aojh.a;
            case 1:
                ((sle) this.a).K.k();
                return defpackage.aojh.a;
            case 2:
                return ((defpackage.alg) this.a).h();
            case 3:
                return ((defpackage.alg) this.a).h();
            case 4:
                return ((defpackage.alg) this.a).h();
            case 5:
                this.a.b(java.lang.Boolean.valueOf(false));
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.a.r(this.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.a();
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((defpackage.bbh) this.a).h());
            case 9:
                ((defpackage.aimw) tmc.a.b().l("com/android/dialer/sharpie/impl/promo/marquee/SharpieFollowUpPromoMarquee", "getMarqueeUiModel$<anonymous>", 105, "SharpieFollowUpPromoMarquee.kt")).v("Sharpie follow-up promo action button clicked");
                java.lang.Object obj2 = this.a;
                tmc tmcVar = (tmc) obj2;
                tmcVar.d.o(defpackage.rmx.SHARPIE_FOLLOW_UP_PROMO_ACTION_BUTTON_CLICKED);
                defpackage.aoov.an(tmcVar.c, null, 0, new tkx(tmcVar, (defpackage.aoln) null, 4), 3);
                ryg rygVarAU = defpackage.pez.aU(rvq.a.m());
                ryg rygVarAS = defpackage.pez.aS(rvo.a.m());
                rygVarAS.k(rvc.d);
                defpackage.akzx akzxVarM = rvm.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                akzxVarM.b.b = true;
                rvm rvmVarR = akzxVarM.r();
                defpackage.aooh.e(rvmVarR, "build(...)");
                rvm rvmVar = rvmVarR;
                defpackage.aooh.f(rvmVar, "value");
                defpackage.akzx akzxVar = (defpackage.akzx) rygVarAS.a;
                akzxVar.u();
                rvo rvoVar = akzxVar.b;
                j$.util.Objects.requireNonNull(rvmVar);
                rvoVar.c = rvmVar;
                rvoVar.b = 8;
                rygVarAU.o(rygVarAS.i());
                android.content.Intent intentAddFlags = tmcVar.e.aL(rygVarAU.n()).addFlags(268435456);
                defpackage.aooh.e(intentAddFlags, "addFlags(...)");
                defpackage.ahqx.l(tmcVar.b, intentAddFlags);
                return defpackage.aojh.a;
            case 10:
                java.lang.Object obj3 = this.a;
                defpackage.ahok ahokVarF = ((ubw) obj3).f.f(905, "SonicGridFragmentPeer_handleOnClose");
                try {
                    qbe qbeVarC = ((ubw) obj3).c();
                    if (qbeVarC != null) {
                        qbeVarC.a(defpackage.qbc.SONIC_EMOJI_GRID_EXIT_CLICKED);
                    }
                    tzx tzxVarA = ((ubw) obj3).a();
                    if (tzxVarA != null) {
                        tzxVarA.a();
                        break;
                    }
                    defpackage.ajsz.ak(ahokVarF, null);
                    return defpackage.aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.ajsz.ak(ahokVarF, th);
                        throw th2;
                    }
                }
            case 11:
                java.lang.Object obj4 = this.a;
                ubw ubwVar = (ubw) obj4;
                ubwVar.k.i(ubwVar.b()).b(defpackage.mce.SONIC_GRID_SHOWN);
                return defpackage.aojh.a;
            case 12:
                ucc uccVar = (ucc) this.a;
                defpackage.gpd gpdVar = uccVar.h;
                gpdVar.i(uccVar.c()).b(defpackage.mce.SONIC_PROMO_CLICKED);
                j$.util.Optional optionalB = uccVar.b();
                if (true == optionalB.isPresent()) {
                    uaq uaqVar = (uaq) optionalB.get();
                    uaqVar.c();
                    uaqVar.i = qzp.a;
                }
                j$.util.Optional optionalA = uccVar.a();
                if (true == optionalA.isPresent()) {
                    ((qbe) optionalA.get()).a(defpackage.qbc.SONIC_PROMO_CARD_CLICKED);
                }
                return defpackage.aojh.a;
            case 13:
                ucc uccVar2 = (ucc) this.a;
                j$.util.Optional optionalB2 = uccVar2.b();
                if (true == optionalB2.isPresent()) {
                    uaq uaqVar2 = (uaq) optionalB2.get();
                    uaqVar2.a();
                    uaqVar2.i = qzp.b;
                }
                j$.util.Optional optionalA2 = uccVar2.a();
                if (true == optionalA2.isPresent()) {
                    ((qbe) optionalA2.get()).a(defpackage.qbc.SONIC_PROMO_CARD_DISMISSED_BY_USER);
                }
                return defpackage.aojh.a;
            case 14:
                java.lang.Object obj5 = this.a;
                defpackage.aojh aojhVar = defpackage.aojh.a;
                ((uoo) obj5).u.b(aojhVar);
                return aojhVar;
            case 15:
                return defpackage.a.r(this.a);
            case 16:
                return defpackage.a.r(this.a);
            case 17:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case 18:
                return defpackage.a.r(this.a);
            case 19:
                return defpackage.a.r(this.a);
            default:
                this.a.b(null);
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ sky(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
