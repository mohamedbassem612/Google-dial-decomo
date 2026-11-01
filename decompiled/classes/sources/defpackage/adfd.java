package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adfd implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ adfd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v22, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v30, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v60, types: [afgl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v62, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException {
        defpackage.ajcq ajcqVarZ;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                return defpackage.ahvr.I(((defpackage.adff) obj2).f.ad(), new acze(obj2, (defpackage.akof) obj, 16), defpackage.ajbm.INSTANCE);
            case 1:
                java.io.FileNotFoundException fileNotFoundException = (java.io.FileNotFoundException) obj;
                if (!defpackage.anhc.a.eZ().a(((defpackage.adff) this.a).c)) {
                    return defpackage.aiql.y(fileNotFoundException);
                }
                android.util.Log.w("GmsCoreProfileCache", "Falling back to monogram avatar due to missing photo file.");
                return defpackage.aiql.y(new adfc());
            case 2:
                ?? r11 = this.a;
                r11.putAll((java.util.Map) obj);
                return defpackage.aiql.z(r11);
            case 3:
                return ((adow) this.a).o.b();
            case 4:
                return ((adow) this.a).o.b();
            case 5:
                defpackage.aimz aimzVar = adow.a;
                return this.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj3 = this.a;
                if (!zBooleanValue) {
                    ((defpackage.aimw) ((defpackage.aimw) adow.a.d()).l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "stop", 416, "IncomingCallFlowManager.java")).w("%d:stop():Could not play call stop message to caller", ((adow) obj3).j);
                }
                return ((adow) obj3).c();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                adow adowVar = (adow) this.a;
                adowVar.k.set(false);
                adpe adpeVar = adowVar.i;
                if (!adpeVar.h()) {
                    adpeVar.f();
                }
                adowVar.j();
                return adowVar.f.schedule(new defpackage.aczf(7), 500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aimz aimzVar2 = adow.a;
                return this.a;
            case 9:
                java.lang.Object obj4 = this.a;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                synchronized (((adow) obj4).e) {
                    adpe adpeVar2 = ((adow) obj4).i;
                    if (adpeVar2.h() && !adpeVar2.b().f() && !((adow) obj4).k.get()) {
                        try {
                            adpeVar2.b().d();
                        } catch (defpackage.adpd e) {
                            ((defpackage.aimw) ((defpackage.aimw) adow.a.c()).l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "playAudioMessage", 766, "IncomingCallFlowManager.java")).v("Mute controllers failed");
                            return defpackage.aiql.y(new adof(e, adoe.e));
                        }
                    }
                    ajcqVarZ = defpackage.aiql.z(bool);
                    break;
                }
                return ajcqVarZ;
            case 10:
                adof adofVar = (adof) obj;
                java.lang.Object obj5 = this.a;
                adov adovVar = adov.f;
                adow adowVar2 = (adow) obj5;
                synchronized (adowVar2.c) {
                    ((adow) obj5).l = adovVar;
                    break;
                }
                return defpackage.ajan.g(adowVar2.c(), new adot(obj5, adofVar, 2, (byte[]) null), adowVar2.f);
            case 11:
                return ((defpackage.aeod) this.a).a((aeob) obj);
            case 12:
                defpackage.aify aifyVar = (defpackage.aify) obj;
                if (aifyVar.isEmpty()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj6 = this.a;
                defpackage.aerx aerxVar = (defpackage.aerx) obj6;
                defpackage.apeh apehVar = (defpackage.apeh) aerxVar.g.a();
                defpackage.akzx akzxVarM = defpackage.apeg.a.m();
                int size = aifyVar.size();
                akzxVarM.u();
                defpackage.apeg apegVar = (defpackage.apeg) akzxVarM.b;
                apegVar.b |= 2;
                apegVar.e = size;
                akzxVarM.u();
                defpackage.apeg apegVar2 = (defpackage.apeg) akzxVarM.b;
                j$.util.Objects.requireNonNull(apehVar);
                apegVar2.d = apehVar;
                apegVar2.b |= 1;
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i = 0; i < apehVar.b.size(); i++) {
                    int iH = defpackage.aoog.h(apehVar.b.e(i));
                    if (iH == 0) {
                        iH = 1;
                    }
                    hashSet.add(java.lang.Integer.valueOf(iH - 1));
                }
                int size2 = aifyVar.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.apef apefVar = (defpackage.apef) aifyVar.get(i2);
                    int iH2 = defpackage.aoog.h(apefVar.d);
                    if (iH2 == 0) {
                        iH2 = 1;
                    }
                    if (hashSet.contains(java.lang.Integer.valueOf(iH2 - 1))) {
                        akzxVarM.u();
                        defpackage.apeg apegVar3 = (defpackage.apeg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(apefVar);
                        defpackage.alat alatVar = apegVar3.c;
                        if (!alatVar.c()) {
                            apegVar3.c = defpackage.alad.J(alatVar);
                        }
                        apegVar3.c.add(apefVar);
                    }
                }
                defpackage.apeg apegVar4 = (defpackage.apeg) akzxVarM.r();
                defpackage.aequ aequVar = aerxVar.a;
                defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                defpackage.akzx akzxVarM2 = defpackage.apgu.a.m();
                akzxVarM2.u();
                defpackage.apgu apguVar = (defpackage.apgu) akzxVarM2.b;
                j$.util.Objects.requireNonNull(apegVar4);
                apguVar.o = apegVar4;
                apguVar.b |= 65536;
                aeqqVarA.f((defpackage.apgu) akzxVarM2.r());
                return defpackage.ajan.f(aequVar.a(aeqqVarA.a()), new defpackage.wym(obj6, aifyVar, 18, bArr), aerxVar.c);
            case 13:
                return ((defpackage.aezt) this.a).d((aezu) obj);
            case 14:
                return ((defpackage.aezt) this.a).d((aezu) obj);
            case 15:
                return ((defpackage.aezt) this.a).d(defpackage.aezt.b((defpackage.aexg) obj));
            case 16:
                return this.a.b((defpackage.albh) obj);
            case 17:
                return this.a;
            case 18:
                java.lang.Object obj7 = this.a;
                defpackage.afgx afgxVar = (defpackage.afgx) obj7;
                android.net.Uri uri = (android.net.Uri) defpackage.aiql.H(afgxVar.b);
                android.net.Uri uriAf = defpackage.agab.af(uri, ".tmp");
                try {
                    defpackage.ahoq ahoqVarB = ((defpackage.afgx) obj7).f.b("Write " + ((defpackage.afgx) obj7).a);
                    try {
                        defpackage.ajiu ajiuVar = new defpackage.ajiu((char[]) null);
                        try {
                            defpackage.aogc aogcVar = ((defpackage.afgx) obj7).m;
                            defpackage.afft afftVar = new defpackage.afft();
                            afftVar.a = new defpackage.ajiu[]{ajiuVar};
                            java.io.OutputStream outputStream = (java.io.OutputStream) aogcVar.M(uriAf, afftVar);
                            try {
                                ((defpackage.albh) obj).h(outputStream);
                                ajiuVar.e();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                ahoqVarB.close();
                                ((defpackage.afgx) obj7).m.Q(uriAf, uri);
                                synchronized (afgxVar.g) {
                                    ((defpackage.afgx) obj7).h = obj;
                                    break;
                                }
                                return defpackage.ajcm.a;
                            } catch (java.lang.Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (java.io.IOException e2) {
                            throw defpackage.aehj.cx(((defpackage.afgx) obj7).m, uri, e2, ((defpackage.afgx) obj7).a);
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            ahoqVarB.close();
                            break;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (java.io.IOException e3) {
                    defpackage.aogc aogcVar2 = afgxVar.m;
                    if (aogcVar2.R(uriAf)) {
                        try {
                            aogcVar2.P(uriAf);
                        } catch (java.io.IOException e4) {
                            e3.addSuppressed(e4);
                        }
                        break;
                    }
                    throw e3;
                }
            case 19:
                defpackage.afhc afhcVar = (defpackage.afhc) this.a;
                afhcVar.c((android.net.Uri) defpackage.aiql.H(afhcVar.a), obj);
                return defpackage.ajcm.a;
            default:
                defpackage.afhc afhcVar2 = (defpackage.afhc) this.a;
                return defpackage.aiql.z(afhcVar2.b((android.net.Uri) defpackage.aiql.H(afhcVar2.a)));
        }
    }
}
