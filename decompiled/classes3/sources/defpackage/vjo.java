package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vjo implements java.util.function.Function {
    public final /* synthetic */ defpackage.vjr a;
    public final /* synthetic */ defpackage.vek b;

    public /* synthetic */ vjo(defpackage.vjr vjrVar, defpackage.vek vekVar) {
        this.a = vjrVar;
        this.b = vekVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vjr vjrVar = this.a;
        defpackage.vek vekVar = this.b;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
        int i = vekVar.b;
        if (i == 1) {
            defpackage.veo veoVar = (defpackage.veo) vekVar.c;
            defpackage.vjr.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processStatusMessage", 104, "DefaultOmtpSmsReceiver.java").v("enter");
            vjrVar.e.o(rmx.jZ);
            defpackage.vfm vfmVar = new defpackage.vfm(vjrVar, phoneAccountHandle, 4);
            ajct ajctVar = vjrVar.b;
            return ahvr.Q(vfmVar, ajctVar).i(new defpackage.vfv(phoneAccountHandle, veoVar, 11, null), ajctVar);
        }
        if (i != 2) {
            int iAQ = a.aQ(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unrecognized sms prefix: ");
            sb.append(iAQ - 1);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        defpackage.vep vepVar = (defpackage.vep) vekVar.c;
        aimz aimzVar = defpackage.vjr.a;
        aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", 116, "DefaultOmtpSmsReceiver.java").v("enter");
        defpackage.veq veqVarB = defpackage.veq.b(vepVar.c);
        if (veqVarB == null) {
            veqVarB = defpackage.veq.UNRECOGNIZED;
        }
        defpackage.veq veqVar = veqVarB;
        aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", 119, "DefaultOmtpSmsReceiver.java").y("Received SYNC sms with event %s", veqVar);
        int iOrdinal = veqVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                defpackage.vfm vfmVar2 = new defpackage.vfm(vjrVar, phoneAccountHandle, 3);
                ajct ajctVar2 = vjrVar.b;
                return ahvr.Q(vfmVar2, ajctVar2).i(new defpackage.vge(phoneAccountHandle, 5), ajctVar2);
            }
            if (iOrdinal == 3) {
                throw new java.lang.UnsupportedOperationException("Not implemented yet");
            }
            a.bt(aimzVar.c().m(aioa.b), "Unrecognized sync trigger event: %s", veqVar, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", (char) 199, "DefaultOmtpSmsReceiver.java", zct.b);
            return ajcm.a;
        }
        java.lang.String str = vepVar.d;
        if (!"v".equals(str)) {
            a.bt(aimzVar.d(), "Non-voice message of type '%s' received, ignoring", str, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", (char) 127, "DefaultOmtpSmsReceiver.java", zct.b);
            return ajcm.a;
        }
        if ((vepVar.b & 1) == 0) {
            return aiql.y(new java.lang.IllegalArgumentException("invalid vvm message"));
        }
        aoin aoinVar = vjrVar.f;
        ajcq ajcqVarH = ajcm.a;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            vdo vdoVar = vjrVar.g;
            defpackage.vdk vdkVar = new defpackage.vdk();
            defpackage.vcn vcnVar = vepVar.e;
            if (vcnVar == null) {
                vcnVar = defpackage.vcn.a;
            }
            vdkVar.f(vcnVar.c);
            defpackage.vcn vcnVar2 = vepVar.e;
            if (vcnVar2 == null) {
                vcnVar2 = defpackage.vcn.a;
            }
            alcf alcfVar = vcnVar2.d;
            if (alcfVar == null) {
                alcfVar = alcf.a;
            }
            vdkVar.b(j$.time.Duration.ofSeconds(alcfVar.b).toMillis());
            defpackage.vcn vcnVar3 = vepVar.e;
            if (vcnVar3 == null) {
                vcnVar3 = defpackage.vcn.a;
            }
            akzm akzmVar = vcnVar3.f;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            vdkVar.c(akzmVar.b);
            defpackage.vcn vcnVar4 = vepVar.e;
            if (vcnVar4 == null) {
                vcnVar4 = defpackage.vcn.a;
            }
            vdkVar.g(vcnVar4.e);
            vdkVar.h(vjrVar.h.getPackageName());
            vdkVar.e(phoneAccountHandle);
            vdkVar.d(false);
            ajcqVarH = ahvr.H(vdoVar.d(vdkVar.a()), new defpackage.vft(18), vjrVar.b);
        }
        ahrv ahrvVarG = ahrv.g(ajcqVarH);
        defpackage.vfv vfvVar = new defpackage.vfv(vjrVar, phoneAccountHandle, 12);
        ajct ajctVar3 = vjrVar.b;
        return ahrvVarG.i(vfvVar, ajctVar3).i(new defpackage.vfv(phoneAccountHandle, vepVar, 13, null), ajctVar3).e(defpackage.vcv.class, new defpackage.vft(19), ajctVar3);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
