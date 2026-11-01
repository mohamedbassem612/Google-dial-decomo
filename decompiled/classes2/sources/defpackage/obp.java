package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class obp implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ obp(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:135:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r15v100, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r15v29, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v72, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v87, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v88, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v95, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v96, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v97, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object a() throws aois {
        java.lang.String str;
        java.lang.String string;
        int i;
        defpackage.pea peaVar;
        aihd aihdVarE;
        defpackage.pea peaVar2;
        aihd aihdVarE2;
        tfy tfpVar;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.b;
                defpackage.obr obrVar = (defpackage.obr) this.a;
                gpd gpdVar = obrVar.d;
                java.lang.String str2 = (java.lang.String) obj;
                gpdVar.i(str2).b(mce.fg);
                gpdVar.i(str2).b(mce.eZ);
                qbe qbeVarB = obrVar.b(str2);
                if (qbeVarB != null) {
                    qbeVarB.a(qbc.gQ);
                }
                com.google.android.material.imageview.ShapeableImageView shapeableImageViewFindViewById = ((defpackage.heq) this.c).ae().findViewById(2131428205);
                shapeableImageViewFindViewById.setVisibility(0);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                aooh.c(shapeableImageViewFindViewById);
                android.content.Context context = shapeableImageViewFindViewById.getContext();
                aooh.e(context, "getContext(...)");
                android.animation.Animator animatorC = defpackage.obr.c(shapeableImageViewFindViewById, context, 450L);
                android.content.Context context2 = shapeableImageViewFindViewById.getContext();
                aooh.e(context2, "getContext(...)");
                android.animation.Animator animatorC2 = defpackage.obr.c(shapeableImageViewFindViewById, context2, 1000L);
                android.content.Context context3 = shapeableImageViewFindViewById.getContext();
                aooh.e(context3, "getContext(...)");
                animatorSet.playSequentially(animatorC, animatorC2, defpackage.obr.c(shapeableImageViewFindViewById, context3, 1000L));
                animatorSet.start();
                qbe qbeVarB2 = obrVar.b(str2);
                if (qbeVarB2 != null) {
                    qbeVarB2.a(qbc.gT);
                }
                obrVar.c.a = 3;
                return aojh.a;
            case 1:
                android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) aooh.q((j$.util.Optional) this.c);
                if (disconnectCause == null) {
                    return null;
                }
                if (disconnectCause.getCode() != 1 && disconnectCause.getCode() != 8) {
                    return null;
                }
                java.lang.CharSequence description = disconnectCause.getDescription();
                if (description == null || description.length() == 0) {
                    description = null;
                }
                java.lang.Object obj2 = this.a;
                if (!((java.lang.Boolean) this.b.a()).booleanValue() || description != null || disconnectCause.getCode() != 1) {
                    if (description != null) {
                        string = description.toString();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        return null;
                    }
                    defpackage.mma.b.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "defaultErrorPrompt$<anonymous>", 245, "DisconnectPromptProducerModule.kt").y("produce default prompt with disconnect description: %s", str);
                    return new defpackage.mls(defpackage.mlt.PROMPT_TYPE_DEFAULT_ERROR, str, null, str, null, ((android.content.Context) obj2).getString(android.R.string.ok), null);
                }
                string = ((android.content.Context) obj2).getString(2132018338);
                str = string;
                if (str != null) {
                    return null;
                }
                defpackage.mma.b.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "defaultErrorPrompt$<anonymous>", 245, "DisconnectPromptProducerModule.kt").y("produce default prompt with disconnect description: %s", str);
                return new defpackage.mls(defpackage.mlt.PROMPT_TYPE_DEFAULT_ERROR, str, null, str, null, ((android.content.Context) obj2).getString(android.R.string.ok), null);
            case 2:
                return ((ojo) this.b).d.x(new defpackage.agxb((android.net.Uri) this.c, (android.content.ContentValues) this.a, 1));
            case 3:
                gat gatVarE = ((olc) this.a).e();
                com.google.android.gms.duokit.StartCallRequest startCallRequest = new com.google.android.gms.duokit.StartCallRequest();
                com.google.android.gms.duokit.DuoId duoId = new com.google.android.gms.duokit.DuoId();
                duoId.b = (java.lang.String) this.c;
                duoId.a = 1;
                startCallRequest.a = duoId;
                startCallRequest.b = 2;
                startCallRequest.d = (java.lang.String) this.b;
                ?? r15 = gatVarE.a;
                ((acxg) r15.eZ()).o(5, ahyn.g(startCallRequest.d));
                java.lang.Object obj3 = gatVarE.b;
                acxg acxgVar = (acxg) r15.eZ();
                aaum aaumVarA = ((aakn) gatVarE.e).a();
                zzx zzxVar = new zzx((char[]) null);
                aaumVarA.a(new aakt(zzxVar, (android.content.Context) obj3, acxgVar, startCallRequest));
                aaumVarA.q(new aaku(acxgVar, zzxVar, 0));
                return aazc.e((aaum) zzxVar.a);
            case 4:
                int iAR = a.aR(((pdu) this.a).g);
                i = iAR != 0 ? iAR : 1;
                j$.util.Optional optionalE = ((zpm) ((oyx) this.c).a).e((java.lang.String) this.b);
                aooh.e(optionalE, "get(...)");
                apqr apqrVar = (apqr) aooh.q(optionalE);
                if (apqrVar != null && (peaVar = (defpackage.pea) apqrVar.a(defpackage.pea.class)) != null && (aihdVarE = peaVar.ka().e()) != null) {
                    java.util.Iterator it = aihdVarE.iterator();
                    while (it.hasNext()) {
                        ((pdz) it.next()).b(i);
                    }
                }
                return aojh.a;
            case 5:
                int iAR2 = a.aR(((pdu) this.a).g);
                i = iAR2 != 0 ? iAR2 : 1;
                j$.util.Optional optionalE2 = ((zpm) ((oyx) this.c).a).e((java.lang.String) this.b);
                aooh.e(optionalE2, "get(...)");
                apqr apqrVar2 = (apqr) aooh.q(optionalE2);
                if (apqrVar2 != null && (peaVar2 = (defpackage.pea) apqrVar2.a(defpackage.pea.class)) != null && (aihdVarE2 = peaVar2.ka().e()) != null) {
                    java.util.Iterator it2 = aihdVarE2.iterator();
                    while (it2.hasNext()) {
                        ((pdz) it2.next()).c(i);
                    }
                }
                return aojh.a;
            case 6:
                this.b.a(this.c);
                ((rsa) this.a).a.a();
                return aojh.a;
            case 7:
                pez.aW((rsd) this.a, (aomy) this.c, (aonj) this.b);
                return aojh.a;
            case 8:
                pez.aW((rsd) this.a, (aomy) this.c, (aonj) this.b);
                return aojh.a;
            case 9:
                pez.aW((rsd) this.a, (aomy) this.c, (aonj) this.b);
                return aojh.a;
            case 10:
                ryp rypVar = (ryp) this.a;
                if (((java.lang.Boolean) rypVar.e.a()).booleanValue()) {
                    rypVar.f.b();
                } else {
                    java.lang.Object obj4 = this.b;
                    java.lang.Object obj5 = this.c;
                    vaa vaaVarC = abxl.C(abxn.a.m());
                    vaaVarC.P(rypVar.d);
                    vaaVarC.N((java.lang.String) obj5);
                    if (obj4 != null) {
                        vaaVarC.O((java.lang.String) obj4);
                    }
                    vaaVarC.Q(3);
                    abxn abxnVarM = vaaVarC.M();
                    sjh sjhVarA = rypVar.b.a();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("OnboardingFlowArgument", abxnVarM.i());
                    sjhVarA.a(0, intent);
                }
                return aojh.a;
            case 11:
                this.a.b(this.b);
                a.E((ccp) this.c, false);
                return aojh.a;
            case 12:
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.b;
                if (obj8 != null) {
                    sfz sfzVar = (sfz) obj7;
                    sfzVar.h.o(rmx.yA);
                    android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath(android.provider.ContactsContract.RawContacts.CONTENT_URI, java.lang.String.valueOf(((java.lang.Long) obj8).longValue()));
                    aooh.e(uriWithAppendedPath, "toContentUri(...)");
                    sfzVar.g(uriWithAppendedPath, sfzVar.f(((sfe) obj6).a));
                } else {
                    sfz sfzVar2 = (sfz) obj7;
                    sfzVar2.h.o(rmx.yW);
                    vaa vaaVarC2 = abxl.C(abxn.a.m());
                    sfe sfeVar = (sfe) obj6;
                    vaaVarC2.N(sfzVar2.f(sfeVar.a));
                    java.lang.String str3 = sfeVar.e;
                    if (str3 != null) {
                        vaaVarC2.O(str3);
                    }
                    abxt abxtVar = sfeVar.g;
                    if (abxtVar != null) {
                        vaaVarC2.P(abxtVar);
                    }
                    vaaVarC2.R(5);
                    vaaVarC2.Q(3);
                    abxn abxnVarM2 = vaaVarC2.M();
                    if (((java.lang.Boolean) sfzVar2.i.a()).booleanValue()) {
                        sfzVar2.r.b(abxnVarM2);
                    } else {
                        sfzVar2.t.b(abxnVarM2);
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ?? r0 = this.b;
                if (r0 != 0) {
                    ?? r1 = this.a;
                    ((kaw) this.c).ar(0);
                    r0.a(new cpm(((cpm) r1.a()).a));
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                tfk tfkVar = (tfk) this.c;
                this.b.a(new tfy(tfkVar.f, tfkVar.e, tfkVar.d), this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                this.b.a(((tfi) this.c).d, this.a);
                return aojh.a;
            case 16:
                j$.util.Objects.checkIndex(0, 6);
                java.lang.Object obj9 = this.b;
                if (obj9 != null) {
                    java.lang.Object obj10 = this.a;
                    if (obj9 instanceof tgu) {
                        tfpVar = new tfy((tfj) obj10, (abvz) null, ((tgu) obj9).a);
                    } else if (obj9 instanceof tgt) {
                        tfpVar = new tfw((tfj) obj10, ((tgt) obj9).a);
                    } else if (obj9 instanceof tgv) {
                        tfpVar = new tfv((tfj) obj10);
                    } else if ((obj9 instanceof tgs) || (obj9 instanceof tgr)) {
                        tfpVar = new tfp((tfj) obj10);
                    }
                    tgf tgfVar = (tgf) this.c;
                    java.lang.Object obj11 = tgfVar.b;
                    aooh.f(obj11, "activity");
                    ((thj) tgfVar.c).f.c(tfpVar, (android.app.Activity) obj11);
                    return aojh.a;
                }
                throw new aois();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (ttj.m((ccp) this.a) == null) {
                    this.b.a(java.lang.Long.valueOf(((uov) this.c).a));
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.b.a(java.lang.Long.valueOf(((uov) this.c).a));
                this.a.b((java.lang.Object) null);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ?? r2 = this.a;
                aooh.f((java.lang.Object) r2, "component");
                ?? r3 = this.c;
                aooh.f((java.lang.Object) r3, "activities");
                ?? r16 = this.b;
                aooh.f((java.lang.Object) r16, "tasks");
                return new xku((xhu) r2, ajsz.bT(new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r3, 10)), new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r16, 10))));
            default:
                return new xnc((xhu) this.a, (java.util.Set) this.c, (java.util.Set) this.b);
        }
    }

    public /* synthetic */ obp(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ obp(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ obp(defpackage.obr obrVar, java.lang.String str, defpackage.heq heqVar, int i) {
        this.$cid = i;
        this.a = obrVar;
        this.b = str;
        this.c = heqVar;
    }

    public /* synthetic */ obp(ryt rytVar, ccp ccpVar, ccp ccpVar2, int i) {
        this.$cid = i;
        this.b = rytVar;
        this.a = ccpVar;
        this.c = ccpVar2;
    }
}
