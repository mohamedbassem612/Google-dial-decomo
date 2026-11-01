package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class udw implements ajas {
    public final /* synthetic */ udy a;
    public final /* synthetic */ ajcq b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ android.telecom.Call.Details d;

    public /* synthetic */ udw(udy udyVar, ajcq ajcqVar, ajcq ajcqVar2, android.telecom.Call.Details details) {
        this.a = udyVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.d = details;
    }

    public final ajcq a() {
        final int i;
        ajcq ajcqVarF;
        uin uinVarA = (uip) aiql.H(this.b);
        uip uipVar = (uip) aiql.H(this.c);
        udy udyVar = this.a;
        uct uctVar = udyVar.i;
        android.telecom.Call.Details details = this.d;
        boolean zA = uctVar.a(details.getCreationTimeMillis());
        if (zA && ((java.lang.Boolean) udyVar.l.a()).booleanValue()) {
            aimz aimzVar = udy.a;
            aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatus", 244, "CompositeSpam.java").v("the call is sampled and need to skip denylist");
            uik uikVarA = uin.a();
            uikVarA.d((java.lang.Long) uinVarA.m().orElse((java.lang.Object) null));
            uil uilVar = new uil(uinVarA.k());
            uilVar.d(udm.a);
            uikVarA.b(uilVar.a());
            if (uinVarA == null || !defpackage.udn.b(uinVarA.k().g())) {
                aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpam", "removeGlobalDenylistStatus", 794, "CompositeSpam.java").v("the call is sample and skip denylist, no user classification, reset the spam status to unknown");
                uikVarA.c(udj.a);
            } else {
                uikVarA.c(uinVarA.j());
            }
            uinVarA = uikVarA.a();
        }
        defpackage.udz udzVar = new defpackage.udz();
        udzVar.b(j$.util.Optional.of(java.lang.Boolean.FALSE));
        if (uinVarA == null) {
            throw new java.lang.NullPointerException("Null inAppSpamStatus");
        }
        udzVar.a = uinVarA;
        if (uipVar == null) {
            throw new java.lang.NullPointerException("Null stirShakenSpamStatus");
        }
        udzVar.b = uipVar;
        udzVar.b(j$.util.Optional.of(java.lang.Boolean.valueOf(zA)));
        udzVar.e = 1;
        j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.TRUE);
        if (optionalOf == null) {
            throw new java.lang.NullPointerException("Null shouldSetVerdictSource");
        }
        udzVar.c = optionalOf;
        uio uioVarK = uinVarA.k();
        if (((defpackage.uim) uioVarK.c().orElse(defpackage.uim.e)).a() || defpackage.udn.b(uioVarK.g()) || defpackage.udn.b(uioVarK.b())) {
            udy.a.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatus", 257, "CompositeSpam.java").v("inAppSpamStatus is present, not querying patronus");
            ajcq ajcqVarEU = udyVar.d.eU(ahqx.i(new defpackage.tbb(udyVar, details, aiyg.b, 4, (byte[]) null)));
            ahyc ahycVarA = ahqx.a(new ubc(5));
            ajct ajctVar = udyVar.e;
            return ahvr.H(ahvr.B(ajcqVarEU, java.lang.Exception.class, ahycVarA, ajctVar), ahqx.a(new defpackage.tcy(udzVar, 17)), ajctVar);
        }
        aimz aimzVar2 = udy.a;
        aimzVar2.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatus", 263, "CompositeSpam.java").v("performing full compose");
        if (((java.lang.Boolean) udyVar.j.a()).booleanValue()) {
            int iM = da$.ExternalSyntheticApiModelOutline0.m(details);
            boolean z = da$.ExternalSyntheticApiModelOutline0.m(details) == 1 && ((java.lang.Boolean) udyVar.k.a()).booleanValue();
            if (iM != 0 && !z) {
                aimzVar2.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusPatronusCatchingAll", 370, "CompositeSpam.java").v("not calling patronus spam since this is not an incoming call and is not an outgoing call where outgoing call spam detection is enabled.");
                ajcqVarF = aiql.z(ttj.H());
            } else if (zqz.a(udyVar.g, "android.permission.READ_PHONE_STATE")) {
                aimzVar2.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusPatronusCatchingAll", 383, "CompositeSpam.java").v("querying patronusSpam");
                j$.util.Optional optionalF = uipVar.k().f();
                if (optionalF.isPresent()) {
                    udk udkVarB = udk.b(((udm) optionalF.orElseThrow()).f);
                    if (udkVarB == null) {
                        udkVarB = udk.a;
                    }
                    i = udkVarB.d;
                } else {
                    i = 0;
                }
                uhk uhkVar = udyVar.c;
                final java.lang.String strB = defpackage.ura.b(details);
                final long jLongValue = zA ? ((java.lang.Long) uhkVar.r.a()).longValue() : ((java.lang.Long) uhkVar.e.a()).longValue();
                final uhk uhkVar2 = uhkVar;
                ajcq ajcqVarI = ahvr.I(uhkVar2.j.eU(ahqx.i(new defpackage.syg(uhkVar, strB, 16))), new ajat() { // from class: uhh
                    public final ajcq a(java.lang.Object obj) {
                        ajcq ajcqVarG;
                        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        final int i2 = i;
                        final long j = jLongValue;
                        if (zBooleanValue) {
                            return aiql.z(uhk.d);
                        }
                        final java.lang.String str = strB;
                        final uhk uhkVar3 = uhkVar2;
                        android.util.LruCache lruCache = uhkVar3.o;
                        synchronized (lruCache) {
                            try {
                                if (str == null) {
                                    ajcqVarG = aiql.z(uhk.d);
                                } else {
                                    defpackage.uhg uhgVar = (defpackage.uhg) lruCache.get(str);
                                    long millis = aazc.c().toMillis();
                                    if (uhgVar == null || millis - uhgVar.b >= ((java.lang.Long) uhkVar3.g.a()).longValue()) {
                                        ajcqVarG = ahvr.G(new ajas() { // from class: uhi
                                            public final ajcq a() {
                                                uhk uhkVar4 = uhkVar3;
                                                rlv rlvVar = uhkVar4.l;
                                                udk udkVarB2 = udk.b(i2);
                                                rlvVar.o(rmx.dy);
                                                uhkVar4.n.j(uhk.b);
                                                android.content.Context context = uhkVar4.h;
                                                ahbv ahbvVar = uhkVar4.u;
                                                java.lang.String str2 = str;
                                                ahrv ahrvVarG = ahrv.g(ahbvVar.v(str2, rlt.a(context, (android.telecom.PhoneAccountHandle) null)));
                                                defpackage.vkg vkgVar = new defpackage.vkg(uhkVar4, udkVarB2, j, 1);
                                                ajct ajctVar2 = uhkVar4.k;
                                                ahrv ahrvVarH = ahrvVarG.i(vkgVar, ajctVar2).h(new ubc(16), ajctVar2);
                                                kxt kxtVar = new kxt(uhkVar4, 19);
                                                ajbm ajbmVar = ajbm.a;
                                                ahvr.J(ahrvVarH, kxtVar, ajbmVar);
                                                return ahvr.C(ahrvVarH, java.lang.Exception.class, new uhj(uhkVar4, str2, 0), ajbmVar);
                                            }
                                        }, uhkVar3.j);
                                        lruCache.put(str, new defpackage.uhg(ajcqVarG, millis));
                                    } else {
                                        ajcqVarG = uhgVar.a;
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        return ajcqVarG;
                    }
                }, uhkVar2.p);
                agsm.d("com/android/dialer/spam/composite/CompositeSpam", "storeResults", 436, ahvr.H(ajcqVarI, ahqx.a(new defpackage.tzs(udyVar, details, 3)), udyVar.d), zct.b, "failed to store patronus spam result", new java.lang.Object[0]);
                ajcqVarF = udy.f(ajcqVarI, ttj.H(), "patronusSpam");
            } else {
                aimzVar2.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusPatronusCatchingAll", 377, "CompositeSpam.java").v("read phone state permissions unavailable to check spam status");
                ajcqVarF = aiql.z(ttj.H());
            }
        } else {
            aimzVar2.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusPatronusCatchingAll", 360, "CompositeSpam.java").v("patronusSpam disabled");
            ajcqVarF = aiql.z(ttj.H());
        }
        return ahvr.H(ajcqVarF, new defpackage.tcy(udzVar, 19), udyVar.e);
    }
}
