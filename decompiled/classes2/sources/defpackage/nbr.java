package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nbr {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyDuplexRelay");
    public final defpackage.ihi b;
    public final defpackage.mqt c;
    public final defpackage.mfz d;
    private final aolr e;

    public nbr(aolr aolrVar, defpackage.ihi ihiVar, defpackage.mqt mqtVar, defpackage.mfz mfzVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ihiVar, "duplexRelay");
        aooh.f(mqtVar, "loggingCoordinator");
        this.e = aolrVar;
        this.b = ihiVar;
        this.c = mqtVar;
        this.d = mfzVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final defpackage.nvp d(alro alroVar) throws aois {
        apdi apdiVar = alqy.f;
        alroVar.c(apdiVar);
        if (((alaa) alroVar).n.l((alac) apdiVar.a)) {
            return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_BOT_SPEECH_STARTED;
        }
        apdi apdiVar2 = alqx.d;
        alroVar.c(apdiVar2);
        if (((alaa) alroVar).n.l((alac) apdiVar2.a)) {
            return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_BOT_SPEECH_ENDED;
        }
        apdi apdiVar3 = altd.d;
        alroVar.c(apdiVar3);
        if (((alaa) alroVar).n.l((alac) apdiVar3.a)) {
            return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_SUGGESTED_REPLY_SELECTED;
        }
        apdi apdiVar4 = alsd.b;
        alroVar.c(apdiVar4);
        if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
            return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_MANUAL_END_CALL;
        }
        apdi apdiVar5 = alsc.b;
        alroVar.c(apdiVar5);
        if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
            return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_MANUAL_ANSWER_CALL;
        }
        apdi apdiVar6 = alsr.b;
        alroVar.c(apdiVar6);
        if (((alaa) alroVar).n.l((alac) apdiVar6.a)) {
            return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_STARTED;
        }
        apdi apdiVar7 = alsq.d;
        alroVar.c(apdiVar7);
        akzs akzsVar = ((alaa) alroVar).n;
        alac alacVar = (alac) apdiVar7.a;
        if (!akzsVar.l(alacVar)) {
            return null;
        }
        alroVar.c(apdiVar7);
        java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar7.b;
        } else {
            apdiVar7.c(objJ);
        }
        aooh.e(objJ, "getExtension(...)");
        alsp alspVarB = alsp.b(((alsq) objJ).c);
        if (alspVarB == null) {
            alspVarB = alsp.a;
        }
        int iOrdinal = alspVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_NOT_REACHED;
            }
            if (iOrdinal == 2) {
                return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_DECLINED;
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        return defpackage.nvp.EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_ANSWERED;
    }

    public final java.lang.Object a(alro alroVar, aoln aolnVar) {
        return aoov.aj(this.e, new defpackage.nbo(this, alroVar, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.nbp nbpVar;
        if (aolnVar instanceof defpackage.nbp) {
            nbpVar = (defpackage.nbp) aolnVar;
            int i = nbpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbpVar.c = i - Integer.MIN_VALUE;
            } else {
                nbpVar = new defpackage.nbp(this, aolnVar);
            }
        } else {
            nbpVar = new defpackage.nbp(this, aolnVar);
        }
        java.lang.Object objA = nbpVar.a;
        java.lang.Boolean bool = aolu.a;
        int i2 = nbpVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexRelay", "relayToDuplexManualEndCallEvent", 92, "DobbyDuplexRelay.kt").v("relaying to Duplex manual end call event");
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = alsd.b;
            aooh.e(apdiVar, "manualEndCallEvent");
            akzx akzxVarM = alsd.a.m();
            aooh.f(akzxVarM, "builder");
            alsd alsdVarP = akzxVarM.p();
            aooh.e(alsdVarP, "build(...)");
            ajyiVarI.be(apdiVar, alsdVarP);
            alro alroVarBa = ajyiVarI.ba();
            nbpVar.c = 1;
            objA = a(alroVarBa, nbpVar);
            if (objA != bool) {
            }
            return bool;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        bool = (java.lang.Boolean) objA;
        if (!bool.booleanValue()) {
            a.d().l("com/android/dialer/dobby/impl/service/DobbyDuplexRelay", "relayToDuplexManualEndCallEvent", 96, "DobbyDuplexRelay.kt").v("NGCS.DuplexRelayFailed.ManualEndCallEvent");
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, aoln aolnVar) {
        defpackage.nbq nbqVar;
        if (aolnVar instanceof defpackage.nbq) {
            nbqVar = (defpackage.nbq) aolnVar;
            int i = nbqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbqVar.c = i - Integer.MIN_VALUE;
            } else {
                nbqVar = new defpackage.nbq(this, aolnVar);
            }
        } else {
            nbqVar = new defpackage.nbq(this, aolnVar);
        }
        java.lang.Object obj = nbqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nbqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexRelay", "relayToDuplexQuickReplyChipClickedEvent", 103, "DobbyDuplexRelay.kt").v("relaying to Duplex quick reply chip clicked event");
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = alsk.d;
            aooh.e(apdiVar, "quickReplyChipClicked");
            akzx akzxVarM = alsk.a.m();
            aooh.f(akzxVarM, "builder");
            if (str != null) {
                akzxVarM.u();
                alsk alskVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                alskVar.b |= 1;
                alskVar.c = str;
            }
            alsk alskVarP = akzxVarM.p();
            aooh.e(alskVarP, "build(...)");
            ajyiVarI.be(apdiVar, alskVarP);
            alro alroVarBa = ajyiVarI.ba();
            nbqVar.c = 1;
            if (a(alroVarBa, nbqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
