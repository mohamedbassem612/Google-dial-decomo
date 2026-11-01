package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vlq implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ vlq(aemr aemrVar, defpackage.aemp aempVar, java.lang.String str, int i, int i2) {
        this.$cid = i2;
        this.c = aemrVar;
        this.b = aempVar;
        this.d = str;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r13v50, types: [aemp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        defpackage.vlu vluVarA;
        int i = this.$cid;
        if (i == 0) {
            defpackage.alic alicVar = (defpackage.alic) obj;
            int i2 = alicVar.a;
            ?? r4 = this.c;
            if (i2 == 204) {
                return aiql.z((java.lang.Object) r4);
            }
            vls vlsVar = (vls) this.b;
            defpackage.vly vlyVarD = vlsVar.f.d(alicVar);
            aike aikeVar = vlyVarD.a;
            if (aikeVar.isEmpty()) {
                vluVarA = defpackage.vlu.a(aike.a, j$.util.Optional.empty());
            } else {
                aift aiftVar = new aift(4);
                int i3 = aikeVar.d;
                for (int i4 = 0; i4 < i3; i4++) {
                    aiftVar.i(vma.b((defpackage.vlx) aikeVar.get(i4)));
                }
                vluVarA = defpackage.vlu.a(aiftVar.h(), vlyVarD.b);
            }
            aift aiftVar2 = new aift(4);
            aiftVar2.k((java.lang.Iterable) r4);
            aiftVar2.k(vluVarA.a);
            aify aifyVarH = aiftVar2.h();
            j$.util.Optional optional = vluVarA.b;
            if (!optional.isPresent()) {
                return aiql.z(aifyVarH);
            }
            return vlsVar.c((java.lang.String) this.d, aifyVarH, optional, this.a + 1);
        }
        if (i == 1) {
            defpackage.aprf aprfVar = (defpackage.aprf) obj;
            aimw aimwVarL = vku.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/VvmSmsRequestSender", "sendOmtpSmsMessage", 243, "VvmSmsRequestSender.java");
            java.lang.Object obj2 = this.b;
            aimwVarL.y("send visual voicemail sms for: %s", obj2);
            int i5 = this.a;
            vku vkuVar = (vku) this.c;
            vkuVar.e(i5, 3, 3);
            vbu vbuVar = (vbu) aprfVar.a;
            final java.lang.String str = (vbuVar.b & 2) != 0 ? vbuVar.d : null;
            vkw vkwVar = vkuVar.f;
            java.lang.Object obj3 = this.d;
            final int iU = aprfVar.u();
            android.content.Context context = vkuVar.c;
            final android.app.PendingIntent pendingIntentC = defpackage.afap.c(context, 0, new android.content.Intent("com.android.dialer.voicemail.ACTION_SEND_VISUAL_VOICEMAIL_SMS", null, context, com.android.dialer.voicemail.service.impl.vvmclients.omtp.sms.receiver.VvmSendSmsResultReceiver_Receiver.class), 335544320);
            final java.lang.String str2 = (java.lang.String) obj3;
            final vkw vkwVar2 = vkwVar;
            final android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj2;
            return ahvr.F(new java.util.concurrent.Callable() { // from class: vkv
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    aimw aimwVarL2 = vkw.a.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/impl/SmsSenderImpl", "sendVvmSms", 45, "SmsSenderImpl.java");
                    java.util.regex.Pattern pattern = vkw.b;
                    java.lang.String str3 = str2;
                    java.lang.String strReplaceAll = pattern.matcher(str3).replaceAll("l=[*]");
                    android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                    aimwVarL2.I("send visual voicemail sms: %s for %s", strReplaceAll, phoneAccountHandle2);
                    oko okoVarI = vkwVar2.d.i(phoneAccountHandle2);
                    rs$.ExternalSyntheticApiModelOutline0.m(okoVarI.j, str, iU, str3, pendingIntentC);
                    zjv zjvVar = okoVarI.g;
                    mgv mgvVar = mgv.bR;
                    aokc aokcVar = aokc.a;
                    android.telecom.PhoneAccountHandle phoneAccountHandle3 = okoVarI.i;
                    zjv.i(zjvVar, mgvVar, aokcVar, gus.aw(aais.aH(phoneAccountHandle3 != null ? phoneAccountHandle3.getId() : null)), 0, 24);
                    return null;
                }
            }, vkwVar2.c);
        }
        if (i != 2) {
            if (i != 3) {
                aemr aemrVar = (aemr) this.c;
                aemrVar.h((aemn) obj);
                return this.b.a(aemrVar.a, (java.lang.String) this.d, this.a);
            }
            ahyn ahynVar = (ahyn) obj;
            if (!ahynVar.f()) {
                return ((adff) this.c).k(this.a);
            }
            if (adff.j((adfl) this.d)) {
                return aiql.z((java.io.InputStream) ahynVar.b());
            }
            afsq.X((java.io.InputStream) ahynVar.b());
            return aiql.y(new defpackage.adfc());
        }
        defpackage.zsz zszVar = (defpackage.zsz) obj;
        zsq.a.b().l("com/google/android/dialershared/precall/impl/PrecallChain", "validate", 64, "PrecallChain.java").I("decision for %s: %s", this.d, zszVar);
        int iOrdinal = zszVar.ordinal();
        java.lang.Object obj4 = this.c;
        java.lang.Object obj5 = this.b;
        int i6 = this.a;
        if (iOrdinal == 1) {
            zsq zsqVar = (zsq) obj4;
            j$.util.Optional optional2 = zsqVar.d;
            optional2.isPresent();
            ((gou) optional2.get()).m();
            return zsqVar.b((defpackage.zrx) obj5, i6 + 1);
        }
        if (iOrdinal == 2) {
            akzx akzxVarM = defpackage.zsx.a.m();
            akzxVarM.u();
            defpackage.zsx zsxVar = (defpackage.zsx) akzxVarM.b;
            zsxVar.b |= 1;
            zsxVar.c = true;
            akzxVarM.u();
            defpackage.zsx zsxVar2 = (defpackage.zsx) akzxVarM.b;
            zsxVar2.b |= 4;
            zsxVar2.e = i6;
            akzxVarM.u();
            defpackage.zsx zsxVar3 = (defpackage.zsx) akzxVarM.b;
            j$.util.Objects.requireNonNull(obj5);
            zsxVar3.f = (defpackage.zrx) obj5;
            zsxVar3.b |= 8;
            return aiql.z((defpackage.zsx) akzxVarM.p());
        }
        if (iOrdinal == 3) {
            zsq zsqVar2 = (zsq) obj4;
            return ahvr.I(((zta) zsqVar2.b.get(i6)).c((defpackage.zrx) obj5), new lhb(obj4, i6, 8), zsqVar2.c);
        }
        if (iOrdinal == 4) {
            j$.util.Optional optional3 = ((zsq) obj4).d;
            optional3.isPresent();
            ((gou) optional3.get()).m();
            akzx akzxVarM2 = defpackage.zsx.a.m();
            akzxVarM2.u();
            defpackage.zsx zsxVar4 = (defpackage.zsx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(obj5);
            zsxVar4.f = (defpackage.zrx) obj5;
            zsxVar4.b |= 8;
            return aiql.z((defpackage.zsx) akzxVarM2.p());
        }
        if (iOrdinal != 5) {
            throw new java.lang.AssertionError("Unexpected precall decision.");
        }
        j$.util.Optional optional4 = ((zsq) obj4).d;
        optional4.isPresent();
        ((gou) optional4.get()).m();
        akzx akzxVarM3 = defpackage.zsx.a.m();
        akzxVarM3.u();
        defpackage.zsx zsxVar5 = (defpackage.zsx) akzxVarM3.b;
        zsxVar5.b |= 2;
        zsxVar5.d = true;
        return aiql.z((defpackage.zsx) akzxVarM3.p());
    }

    public /* synthetic */ vlq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.a = i;
    }

    public /* synthetic */ vlq(vku vkuVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i, java.lang.String str, int i2) {
        this.$cid = i2;
        this.c = vkuVar;
        this.b = phoneAccountHandle;
        this.a = i;
        this.d = str;
    }

    public /* synthetic */ vlq(vls vlsVar, aify aifyVar, java.lang.String str, int i, int i2) {
        this.$cid = i2;
        this.b = vlsVar;
        this.c = aifyVar;
        this.d = str;
        this.a = i;
    }
}
