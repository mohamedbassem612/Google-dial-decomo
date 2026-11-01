package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mjl implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ mjl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int iAM;
        defpackage.omo omoVar;
        java.lang.String str;
        defpackage.omz omzVar;
        switch (this.$cid) {
            case 0:
                ((defpackage.mjm) this.a).c.set(false);
                return null;
            case 1:
                defpackage.mjh mjhVar = (defpackage.mjh) obj;
                int iAM2 = a.aM(mjhVar.c);
                if ((iAM2 == 0 || iAM2 != 5) && ((iAM = a.aM(mjhVar.c)) == 0 || iAM != 6)) {
                    return mjhVar;
                }
                defpackage.mji mjiVar = (defpackage.mji) this.a;
                mjiVar.h.o(rmx.zN);
                amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
                amdxVar.t((android.telecom.PhoneAccountHandle) null);
                amdxVar.v(3);
                mjiVar.j.w((zrx) amdxVar.a);
                akzx akzxVarM = defpackage.mjh.a.m();
                akzxVarM.u();
                defpackage.mjh mjhVar2 = (defpackage.mjh) akzxVarM.b;
                mjhVar2.c = 1;
                mjhVar2.b |= 1;
                return (defpackage.mjh) akzxVarM.p();
            case 2:
                int i = defpackage.nyo.a;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return java.lang.Boolean.TRUE;
                }
                ((qbe) this.a).c(qbc.eD);
                return java.lang.Boolean.FALSE;
            case 3:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                ((defpackage.nyz) this.a).a();
                return null;
            case 4:
                return a.k((aonj) this.a, obj);
            case 5:
                return (defpackage.oeu) ((aoom) this.a).b(obj);
            case 6:
                return (alic) this.a.a(obj);
            case 7:
                ((defpackage.olz) this.a).c.a(qbc.it);
                return null;
            case 8:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                defpackage.omk omkVar = (defpackage.omk) this.a;
                if (zBooleanValue == omkVar.d) {
                    return null;
                }
                if (bool.booleanValue()) {
                    omkVar.a.incrementAndGet();
                } else {
                    omkVar.b.incrementAndGet();
                }
                omkVar.d = bool.booleanValue();
                return null;
            case 9:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj2 = this.a;
                if (iIntValue == 0) {
                    omoVar = (defpackage.omo) obj2;
                    str = "silent";
                } else if (iIntValue == 1) {
                    omoVar = (defpackage.omo) obj2;
                    str = "vibrate";
                } else {
                    if (iIntValue != 2) {
                        return null;
                    }
                    omoVar = (defpackage.omo) obj2;
                    str = "normal";
                }
                omoVar.d = str;
                return null;
            case 10:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return new defpackage.onu(j$.util.Optional.empty(), j$.util.Optional.empty());
                }
                java.lang.Object obj3 = this.a;
                j$.util.Optional.empty();
                j$.util.Optional.empty();
                return new defpackage.onu(j$.util.Optional.of(java.lang.Long.valueOf(((apqr) obj3).a)), j$.util.Optional.of((defpackage.omz) optional.orElseThrow()));
            case 11:
                return (aigf) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).collect(aido.b(new defpackage.old(8), new defpackage.naa(this.a, 18)));
            case 12:
                aigf aigfVar = (aigf) obj;
                ?? r6 = this.a;
                defpackage.omz omzVar2 = defpackage.omz.a;
                for (java.util.Map.Entry entry : r6) {
                    java.lang.Long asLong = ((android.content.ContentValues) entry.getValue()).getAsLong("timestamp");
                    if (asLong != null && (omzVar = (defpackage.omz) aigfVar.get(asLong)) != null && !omzVar.equals(omzVar2)) {
                        ((android.content.ContentValues) entry.getValue()).put("fides_details", omzVar.i());
                    }
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                if (bool2 != null && !bool2.booleanValue()) {
                    return null;
                }
                java.lang.Object obj4 = this.a;
                ovb.a.b().l("com/android/dialer/incall/answer/answeredcall/AnsweredCallState", "markAsAnswered", 118, "AnsweredCallState.java").v("Marking as answered (async)");
                ovb ovbVar = (ovb) obj4;
                ovbVar.b.set(true);
                ovbVar.c.a(ajcm.a);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                owy owyVar = (owy) obj;
                return (owyVar == owy.a && ((oxg) this.a).a()) ? owy.c : owyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (optional2.isPresent()) {
                    return j$.util.Optional.of((oul) ((aoin) ((wjc) this.a).c.get(optional2.orElseThrow())).a());
                }
                return j$.util.Optional.empty();
            case 16:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                ((ovb) ((wjc) this.a).d).a();
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                spe speVar = (spe) obj;
                int size = speVar.b.size();
                java.lang.Object obj5 = this.a;
                if (size > 0) {
                    ((java.util.concurrent.atomic.AtomicBoolean) ((pgs) obj5).i.b).compareAndSet(false, true);
                }
                akzx akzxVarM2 = spn.a.m();
                ((pgs) obj5).b.h(akzxVarM2, speVar);
                return akzxVarM2.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((java.util.concurrent.atomic.AtomicBoolean) ((pgs) this.a).i.a).compareAndSet(false, true);
                pgs.a.b().l("com/android/dialer/incall/cachedphonelookup/CachedPhoneLookup", "phoneLookup", 204, "CachedPhoneLookup.java").v("timeout querying CP2");
                return spn.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((java.util.concurrent.atomic.AtomicBoolean) ((defpackage.krv) this.a).c).compareAndSet(false, true);
                phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup", "lookup", 168, "MultiStagePhoneLookup.java").v("timeout querying CP2");
                return spn.a;
            default:
                java.lang.String str2 = (java.lang.String) obj;
                gus.aJ();
                gus.aJ();
                android.telecom.Call.Details details = (android.telecom.Call.Details) this.a;
                java.lang.String strB = ura.b(details);
                j$.util.Optional optionalEmpty = android.text.TextUtils.isEmpty(strB) ? j$.util.Optional.empty() : j$.util.Optional.ofNullable(android.telephony.PhoneNumberUtils.formatNumberToE164(strB, str2));
                if (optionalEmpty.isPresent()) {
                    return optionalEmpty;
                }
                java.lang.String strB2 = ura.b(details);
                return android.text.TextUtils.isEmpty(strB2) ? j$.util.Optional.empty() : j$.util.Optional.of(android.telephony.PhoneNumberUtils.normalizeNumber(strB2));
        }
    }
}
