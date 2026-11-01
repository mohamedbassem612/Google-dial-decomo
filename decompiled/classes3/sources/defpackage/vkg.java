package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vkg implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vkg(adlt adltVar, long j, defpackage.acwe acweVar, int i) {
        this.$cid = i;
        this.c = adltVar;
        this.a = j;
        this.b = acweVar;
    }

    /* JADX WARN: Type inference failed for: r10v17, types: [aczw, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        anpk anpkVarA;
        int i = this.$cid;
        if (i == 0) {
            java.lang.String str = (java.lang.String) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
            if (str == null || android.text.TextUtils.isEmpty(str)) {
                throw new defpackage.vki("mdn is empty");
            }
            long j = this.a;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.appendQueryParameter("VZW_MDN", str);
            builder.appendQueryParameter("VZW_SERVICE", "BVVM");
            builder.appendQueryParameter("DEVICE_MODEL", "DROID_4G");
            builder.appendQueryParameter("APP_TOKEN", "q8e3t5u2o1");
            builder.appendQueryParameter("SPG_LANGUAGE_PARAM", "ENGLISH");
            return ((defpackage.vkj) obj3).d((java.lang.String) obj2, "application/x-www-form-urlencoded", j$.util.Optional.of(builder.build().getEncodedQuery()), j);
        }
        if (i != 1) {
            if (i == 2) {
                java.lang.String str2 = (java.lang.String) obj;
                a.bI(defpackage.vkj.a.b(), "Retrieving self provisioning response", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber", "retrieveSubscribeLink", (char) 300, "AccountSubscriber.java", zct.a);
                java.lang.Object obj4 = this.b;
                defpackage.vkj vkjVar = (defpackage.vkj) this.c;
                ahrv ahrvVarI = ahrv.g(vkjVar.a((android.telecom.PhoneAccountHandle) obj4)).i(new defpackage.vkg(vkjVar, str2, this.a, 0), vkjVar.b);
                defpackage.vju vjuVar = new defpackage.vju(10);
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = vkjVar.c;
                return ahrvVarI.e(java.util.concurrent.TimeoutException.class, vjuVar, scheduledExecutorService).h(new defpackage.vju(13), scheduledExecutorService);
            }
            defpackage.acwg acwgVar = (defpackage.acwg) obj;
            long j2 = acwgVar.f;
            long j3 = this.a;
            if (j3 <= j2) {
                return aiql.z(java.lang.Boolean.TRUE);
            }
            java.lang.Object obj5 = this.b;
            java.lang.Object obj6 = this.c;
            akzx akzxVarP = acwgVar.p();
            akzxVarP.u();
            defpackage.acwg acwgVar2 = (defpackage.acwg) akzxVarP.b;
            acwgVar2.b |= 8;
            acwgVar2.f = j3;
            return ((adlt) obj6).e.h((defpackage.acwe) obj5, (defpackage.acwg) akzxVarP.p());
        }
        hkd hkdVar = (hkd) obj;
        uhk.a.b().l("com/android/dialer/spam/patronus/PatronusSpam", "getSpamStatus", 331, "PatronusSpam.java").y("rpc lookup number: %s", aais.aD(hkdVar));
        java.lang.String str3 = hkdVar.c;
        java.lang.Object obj7 = this.c;
        java.lang.Object obj8 = this.b;
        long j4 = this.a;
        ahoq ahoqVarW = ahvr.W(917, "PatronusSpam_querySpamProtectionServiceApiForCallerInfo");
        try {
            ajdv ajdvVar = ajdv.a;
            akzx akzxVarM = ajdvVar.m();
            akzxVarM.u();
            ajdv ajdvVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            ajdvVar2.d = str3;
            oko okoVar = ((uhk) obj7).m;
            java.lang.String str4 = (java.lang.String) okoVar.z().orElse((java.lang.Object) null);
            akzxVarM.u();
            ajdv ajdvVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            ajdvVar3.b = str4;
            java.lang.String str5 = (java.lang.String) okoVar.x().orElse((java.lang.Object) null);
            akzxVarM.u();
            ajdv ajdvVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str5);
            ajdvVar4.c = str5;
            akzxVarM.u();
            akzxVarM.b.f = a.U(2);
            akzxVarM.u();
            akzxVarM.b.g = j4;
            long jLongValue = ((java.lang.Long) ((uhk) obj7).s.a()).longValue();
            akzxVarM.u();
            akzxVarM.b.e = jLongValue;
            long j5 = ((udk) obj8).d;
            akzxVarM.u();
            akzxVarM.b.h = j5;
            ajdv ajdvVarP = akzxVarM.p();
            ajec ajecVarI = ((ajec) ((uhk) obj7).i.a()).k(defpackage.zcv.a, defpackage.zcv.a()).k(akar.a, ((uhk) obj7).q).i(((java.lang.Long) ((uhk) obj7).f.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            ((uhk) obj7).n.j(uhk.c);
            anmc anmcVar = ((aohh) ajecVarI).a;
            anpk anpkVar = ajee.b;
            if (anpkVar == null) {
                synchronized (ajee.class) {
                    try {
                        anpkVarA = ajee.b;
                        if (anpkVarA == null) {
                            aal aalVarD = anpk.d();
                            aalVarD.b = anpj.a;
                            aalVarD.d = anpk.c("scooby.SpamProtectionService", "GetCallerInfo");
                            aalVarD.b();
                            akzq akzqVar = aohd.a;
                            aalVarD.e = new aohc(ajdvVar);
                            aalVarD.c = new aohc(ajdw.a);
                            anpkVarA = aalVarD.a();
                            ajee.b = anpkVarA;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                anpkVar = anpkVarA;
            }
            ajcq ajcqVarA = aohp.a(anmcVar.b(anpkVar, ((aohh) ajecVarI).b), ajdvVarP);
            ahvr.J(ajcqVarA, new kxt((uhk) obj7, 20, (byte[]) null), ((uhk) obj7).k);
            ahoqVarW.a(ajcqVarA);
            ahoqVarW.close();
            return ajcqVarA;
        } catch (java.lang.Throwable th2) {
            try {
                ahoqVarW.close();
                throw th2;
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public /* synthetic */ vkg(java.lang.Object obj, java.lang.Object obj2, long j, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = j;
    }

    public /* synthetic */ vkg(defpackage.vkj vkjVar, java.lang.String str, long j, int i) {
        this.$cid = i;
        this.b = vkjVar;
        this.c = str;
        this.a = j;
    }
}
