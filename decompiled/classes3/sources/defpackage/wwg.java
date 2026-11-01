package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wwg implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ wwg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v63, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v45, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.List] */
    public final ajcq a() {
        int i = 11;
        int i2 = 19;
        byte[] bArr = null;
        int i3 = 0;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                j$.util.Objects.requireNonNull(obj);
                return ahvr.F(new defpackage.wwy(obj, i4), (java.util.concurrent.Executor) this.b);
            case 1:
                defpackage.wwd wwdVar = (defpackage.wwd) this.b;
                if (!wwdVar.f.isPresent()) {
                    hgb.h(defpackage.wwd.a.d(), "Tried to submit data when Soda transcription not started.", "com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner", "submitData", 'o', "SodaModelRunner.java", (byte) 10, zct.b, java.util.concurrent.TimeUnit.SECONDS);
                    return ajcm.a;
                }
                defpackage.wvg wvgVar = (defpackage.wvg) this.a;
                if ((wvgVar.c == 1 ? (defpackage.wvf) wvgVar.d : defpackage.wvf.a).c.C()) {
                    hgb.h(defpackage.wwd.a.d(), "Received empty data when trying to transcribe audio through SODA.", "com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner", "submitData", 'x', "SodaModelRunner.java", (byte) 10, zct.b, java.util.concurrent.TimeUnit.SECONDS);
                    return ajcm.a;
                }
                if ((wvgVar.c == 1 ? (defpackage.wvf) wvgVar.d : defpackage.wvf.a).d != 16000) {
                    hgb.h(defpackage.wwd.a.d(), "input sample rate different from default; consider resampling input", "com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner", "submitData", (char) 130, "SodaModelRunner.java", (byte) 10, zct.b, java.util.concurrent.TimeUnit.SECONDS);
                }
                return ((defpackage.twi) wwdVar.f.orElseThrow()).a((wvgVar.c == 1 ? (defpackage.wvf) wvgVar.d : defpackage.wvf.a).c);
            case 2:
                java.lang.Object obj2 = this.b;
                defpackage.wxb wxbVar = (defpackage.wxb) obj2;
                wxbVar.k = false;
                ahrv ahrvVarG = ahrv.g(wxbVar.n.d.a());
                defpackage.wrn wrnVar = new defpackage.wrn(obj2, 9);
                ajcu ajcuVar = wxbVar.h;
                return ahrvVarG.e(java.lang.Throwable.class, wrnVar, ajcuVar).i(new defpackage.whr(obj2, this.a, 16, bArr), ajcuVar);
            case 3:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((defpackage.xac) this.b).d.iterator();
                while (true) {
                    java.lang.Object obj3 = this.a;
                    if (!it.hasNext()) {
                        return ahvr.aj(arrayList).o(new defpackage.wwy(arrayList, 5), ((defpackage.wze) obj3).b);
                    }
                    java.util.Iterator it2 = ((defpackage.xab) it.next()).b.iterator();
                    while (it2.hasNext()) {
                        java.lang.String str = ((defpackage.wzw) it2.next()).c;
                        java.lang.String strValueOf = java.lang.String.valueOf(str.substring(0, str.lastIndexOf(".")));
                        defpackage.wwy wwyVar = new defpackage.wwy(str, 6);
                        defpackage.wze wzeVar = (defpackage.wze) obj3;
                        ahrv ahrvVarG2 = ahrv.g(ahvr.F(wwyVar, wzeVar.b));
                        defpackage.wzg wzgVar = new defpackage.wzg(obj3, strValueOf.concat("_scotty.flac"), i4, bArr);
                        ajct ajctVar = wzeVar.c;
                        arrayList.add(ahrvVarG2.i(wzgVar, ajctVar).h(new defpackage.wro(i2), ajctVar).e(java.lang.Throwable.class, new defpackage.wro(20), ajctVar));
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.xbc xbcVar = (defpackage.xbc) this.b;
                ahvr.bY(xbcVar.c.get());
                defpackage.wvn wvnVarA = xbcVar.d.a();
                return wvnVarA.i.d(ahqx.i(new defpackage.whv(wvnVarA, this.a, i, bArr)), wvnVarA.e);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj4 = this.a;
                defpackage.xbc xbcVar2 = (defpackage.xbc) obj4;
                defpackage.wvn wvnVarA2 = xbcVar2.d.a();
                return ahrv.g(wvnVarA2.i.e(ahqx.b(new defpackage.xdy(wvnVarA2, xbcVar2.b, (defpackage.xbk) this.b, 1)), wvnVarA2.d)).h(new defpackage.wrn(obj4, 18), xbcVar2.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.xcn xcnVar = (defpackage.xcn) this.b;
                if (xcnVar.h.isPresent()) {
                    defpackage.xcn.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "startRinging", 111, "HoldForMeRingtoneController.java").v("ringtone is being played");
                    return ajcm.a;
                }
                oju ojuVar = xcnVar.c;
                android.media.AudioManager audioManager = xcnVar.b;
                int iC = ojuVar.c();
                int streamVolume = audioManager.getStreamVolume(2);
                int streamMaxVolume = audioManager.getStreamMaxVolume(2);
                defpackage.xcf xcfVar = new defpackage.xcf();
                defpackage.xcf xcfVar2 = new defpackage.xcf();
                if (iC != 2) {
                    xcfVar.b(iC);
                    xcfVar.a = j$.util.OptionalInt.of(xcnVar.f.a());
                    xcfVar2.b(2);
                }
                if (streamVolume < streamMaxVolume) {
                    xcfVar.c(streamVolume);
                    xcfVar2.c(streamMaxVolume);
                }
                java.lang.Object obj5 = this.a;
                xcnVar.j = j$.util.Optional.of(xcfVar.a());
                aimz aimzVar = defpackage.xcn.a;
                aimw aimwVarB = aimzVar.b();
                ainp ainpVar = zct.a;
                aimwVarB.i(ainpVar).l("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "startRinging", 140, "HoldForMeRingtoneController.java").y("system config to restore: %s", xcnVar.j);
                xcnVar.d(xcfVar2.a());
                defpackage.xck xckVar = (defpackage.xck) obj5;
                a.bt(aimzVar.b(), "start ringing in %s mode", xckVar.name(), "com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "startRinging", (char) 144, "HoldForMeRingtoneController.java", ainpVar);
                return xcnVar.a(xckVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.xcn xcnVar2 = (defpackage.xcn) this.b;
                if (!xcnVar2.h.isPresent()) {
                    defpackage.xcn.a.d().l("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "switchRingingMode", 163, "HoldForMeRingtoneController.java").v("unable to switch mode as no ringtone is being played");
                    return ajcm.a;
                }
                java.lang.Object obj6 = this.a;
                if (xcnVar2.h.orElseThrow() == obj6) {
                    defpackage.xcn.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "switchRingingMode", 168, "HoldForMeRingtoneController.java").v("the same ringtone is being played");
                    return ajcm.a;
                }
                defpackage.xck xckVar2 = (defpackage.xck) obj6;
                a.bt(defpackage.xcn.a.b(), "switch ringing mode to %s", xckVar2.name(), "com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "switchRingingMode", (char) 172, "HoldForMeRingtoneController.java", zct.a);
                return xcnVar2.a(xckVar2);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                return ((vda) ((j$.util.Optional) this.b).get()).a(((com.android.voicemail.impl.sms.AutoValue_VvmMessage) this.a).a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return aosv.F(((defpackage.ysu) this.a).b, 0, new defpackage.xtn((aonj) this.b, (aoln) null, 2), 3);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ahvr.F((java.util.concurrent.Callable) this.b, (java.util.concurrent.Executor) this.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ahvr.F((java.util.concurrent.Callable) this.b, (java.util.concurrent.Executor) this.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return aosv.F((aoss) this.b, 0, new defpackage.xtn((aonj) this.a, (aoln) null, 14, (short[]) null), 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return aosv.F((aoss) this.b, 0, new defpackage.xtn((aonj) this.a, (aoln) null, 15, (int[]) null), 3);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                acwx acwxVar = (acwx) obj8;
                return ahvr.I(acwxVar.j((defpackage.acvj) obj7), new defpackage.wzg(obj8, obj7, i), acwxVar.f);
            case 15:
                akzx akzxVarM = defpackage.acwb.a.m();
                akzxVarM.u();
                defpackage.acwb acwbVar = (defpackage.acwb) akzxVarM.b;
                java.lang.Object obj9 = this.a;
                java.lang.String str2 = ((defpackage.acvn) obj9).a;
                j$.util.Objects.requireNonNull(str2);
                acwbVar.b |= 1;
                acwbVar.c = str2;
                java.lang.Object obj10 = this.b;
                acwx acwxVar2 = (acwx) obj10;
                java.lang.String packageName = acwxVar2.a.getPackageName();
                akzxVarM.u();
                defpackage.acwb acwbVar2 = (defpackage.acwb) akzxVarM.b;
                j$.util.Objects.requireNonNull(packageName);
                acwbVar2.b |= 2;
                acwbVar2.d = packageName;
                defpackage.acwb acwbVar3 = (defpackage.acwb) akzxVarM.p();
                return ahvr.I(acwxVar2.d.d(acwbVar3, true), new defpackage.zum(obj10, obj9, (alad) acwbVar3, 12), acwxVar2.f);
            case 16:
                defpackage.acuo acuoVar = (defpackage.acuo) this.a;
                acux acuxVar = acuoVar.a;
                java.lang.String str3 = acuxVar.c;
                java.lang.String str4 = acuxVar.j;
                long j = acuxVar.i;
                ahyn ahynVar = acuoVar.b;
                java.lang.String.valueOf(ahynVar.e());
                int i5 = adbe.a;
                java.lang.Object obj11 = this.b;
                acwx acwxVar3 = (acwx) obj11;
                acwxVar3.e.G();
                if ((acuxVar.b & 2) != 0) {
                    android.content.Context context = acwxVar3.a;
                    if (!context.getPackageName().equals(acuxVar.d)) {
                        adbe.e("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", new java.lang.Object[]{"MobileDataDownload", acuxVar.c, context.getPackageName(), acuxVar.d});
                        return aiql.z(java.lang.Boolean.FALSE);
                    }
                } else {
                    akzx akzxVarP = acuxVar.p();
                    java.lang.String packageName2 = acwxVar3.a.getPackageName();
                    akzxVarP.u();
                    acux acuxVar2 = akzxVarP.b;
                    j$.util.Objects.requireNonNull(packageName2);
                    acuxVar2.b |= 2;
                    acuxVar2.d = packageName2;
                    acuxVar = (acux) akzxVarP.p();
                }
                akzx akzxVarM2 = defpackage.acwb.a.m();
                java.lang.String str5 = acuxVar.c;
                akzxVarM2.u();
                defpackage.acwb acwbVar4 = (defpackage.acwb) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str5);
                acwbVar4.b |= 1;
                acwbVar4.c = str5;
                java.lang.String str6 = acuxVar.d;
                akzxVarM2.u();
                defpackage.acwb acwbVar5 = (defpackage.acwb) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str6);
                acwbVar5.b |= 2;
                acwbVar5.d = str6;
                if (ahynVar.f()) {
                    java.lang.String strAI = afsq.aI((android.accounts.Account) ahynVar.b());
                    akzxVarM2.u();
                    defpackage.acwb acwbVar6 = (defpackage.acwb) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strAI);
                    acwbVar6.b |= 4;
                    acwbVar6.e = strAI;
                }
                try {
                    defpackage.acvu acvuVar = (defpackage.acvu) alad.B(defpackage.acvu.a, acuxVar.i(), akzq.a);
                    aify aifyVar = (aify) j$.util.Collection.-EL.stream(acuxVar.h).map(new defpackage.vxb(acvuVar, i2)).collect(aido.a);
                    akzx akzxVarP2 = acvuVar.p();
                    akzxVarP2.u();
                    ((defpackage.acvu) akzxVarP2.b).o = albq.a;
                    akzxVarP2.ai(aifyVar);
                    final defpackage.acvu acvuVar2 = (defpackage.acvu) akzxVarP2.p();
                    final aczk aczkVar = ((acwx) obj11).d;
                    final defpackage.acwb acwbVar7 = (defpackage.acwb) akzxVarM2.p();
                    final ajat ajatVar = ((acwx) obj11).i;
                    java.lang.String str7 = acwbVar7.c;
                    return ahvr.C(ahvr.I(aczkVar.e(), new ajat() { // from class: aczh
                        /* JADX INFO: Thrown type has an unknown type hierarchy: acyc */
                        /* JADX INFO: Thrown type has an unknown type hierarchy: adab */
                        /* JADX WARN: Code duplicated, block: B:101:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:104:0x018c  */
                        /* JADX WARN: Code duplicated, block: B:107:0x019a  */
                        /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
                        /* JADX WARN: Code duplicated, block: B:170:0x02da  */
                        /* JADX WARN: Code duplicated, block: B:182:0x0314  */
                        /* JADX WARN: Code duplicated, block: B:184:0x0322  */
                        /* JADX WARN: Code duplicated, block: B:190:0x0338  */
                        /* JADX WARN: Code duplicated, block: B:192:0x0346  */
                        /* JADX WARN: Code duplicated, block: B:197:0x0357  */
                        /* JADX WARN: Code duplicated, block: B:198:0x035a  */
                        /* JADX WARN: Code duplicated, block: B:201:0x0371  */
                        /* JADX WARN: Code duplicated, block: B:202:0x0384  */
                        /* JADX WARN: Code duplicated, block: B:211:0x03df A[Catch: IOException -> 0x0481, acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, TRY_ENTER, TryCatch #2 {acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, IOException -> 0x0481, blocks: (B:208:0x03cf, B:211:0x03df, B:213:0x03e7, B:215:0x03f5, B:217:0x03f9, B:218:0x03fb, B:222:0x0406, B:223:0x0415, B:224:0x044b, B:225:0x046c, B:226:0x046d, B:227:0x0480), top: B:237:0x03cf }] */
                        /* JADX WARN: Code duplicated, block: B:213:0x03e7 A[Catch: IOException -> 0x0481, acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, TryCatch #2 {acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, IOException -> 0x0481, blocks: (B:208:0x03cf, B:211:0x03df, B:213:0x03e7, B:215:0x03f5, B:217:0x03f9, B:218:0x03fb, B:222:0x0406, B:223:0x0415, B:224:0x044b, B:225:0x046c, B:226:0x046d, B:227:0x0480), top: B:237:0x03cf }] */
                        /* JADX WARN: Code duplicated, block: B:215:0x03f5 A[Catch: IOException -> 0x0481, acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, TryCatch #2 {acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, IOException -> 0x0481, blocks: (B:208:0x03cf, B:211:0x03df, B:213:0x03e7, B:215:0x03f5, B:217:0x03f9, B:218:0x03fb, B:222:0x0406, B:223:0x0415, B:224:0x044b, B:225:0x046c, B:226:0x046d, B:227:0x0480), top: B:237:0x03cf }] */
                        /* JADX WARN: Code duplicated, block: B:217:0x03f9 A[Catch: IOException -> 0x0481, acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, TryCatch #2 {acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, IOException -> 0x0481, blocks: (B:208:0x03cf, B:211:0x03df, B:213:0x03e7, B:215:0x03f5, B:217:0x03f9, B:218:0x03fb, B:222:0x0406, B:223:0x0415, B:224:0x044b, B:225:0x046c, B:226:0x046d, B:227:0x0480), top: B:237:0x03cf }] */
                        /* JADX WARN: Code duplicated, block: B:224:0x044b A[Catch: IOException -> 0x0481, acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, TryCatch #2 {acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, IOException -> 0x0481, blocks: (B:208:0x03cf, B:211:0x03df, B:213:0x03e7, B:215:0x03f5, B:217:0x03f9, B:218:0x03fb, B:222:0x0406, B:223:0x0415, B:224:0x044b, B:225:0x046c, B:226:0x046d, B:227:0x0480), top: B:237:0x03cf }] */
                        /* JADX WARN: Code duplicated, block: B:226:0x046d A[Catch: IOException -> 0x0481, acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, TryCatch #2 {acxw -> 0x0493, adab -> 0x0495, acyc -> 0x0497, IOException -> 0x0481, blocks: (B:208:0x03cf, B:211:0x03df, B:213:0x03e7, B:215:0x03f5, B:217:0x03f9, B:218:0x03fb, B:222:0x0406, B:223:0x0415, B:224:0x044b, B:225:0x046c, B:226:0x046d, B:227:0x0480), top: B:237:0x03cf }] */
                        /* JADX WARN: Code duplicated, block: B:252:0x02f2 A[EDGE_INSN: B:252:0x02f2->B:177:0x02f2 BREAK  A[LOOP:0: B:12:0x004b->B:267:0x004b], SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:253:0x0207 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:265:0x0229 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:268:0x004b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:270:0x0222 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:274:0x03b3 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:275:0x0326 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:276:? A[LOOP:4: B:180:0x030e->B:276:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:277:0x03aa A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:279:0x034b A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:90:0x015e  */
                        /* JADX WARN: Code duplicated, block: B:97:0x017a  */
                        /* JADX WARN: Code duplicated, block: B:99:0x0180  */
                        public final ajcq a(java.lang.Object obj12) {
                            alat<defpackage.acvr> alatVar;
                            java.util.Iterator it3;
                            aify aifyVarN;
                            defpackage.acvu acvuVar3;
                            acyu acyuVar;
                            boolean zAv;
                            defpackage.acwb acwbVar8;
                            ajcq ajcqVarZ;
                            int i6;
                            defpackage.acvw acvwVar;
                            int iAe;
                            int iAe2;
                            aift aiftVarD;
                            int iAe3;
                            akzx akzxVarP3;
                            java.lang.String str8;
                            java.security.MessageDigest messageDigestB;
                            java.lang.String strA;
                            int iAQ;
                            int i7;
                            boolean z;
                            java.lang.String str9;
                            java.util.Iterator it4;
                            defpackage.acvv acvvVar;
                            java.lang.String str10;
                            acvl acvlVar;
                            int iAe4;
                            defpackage.amlu amluVar;
                            int iAe5;
                            defpackage.acvu acvuVar4 = acvuVar2;
                            boolean zIsEmpty = acvuVar4.d.isEmpty();
                            aczk aczkVar2 = aczkVar;
                            ajat ajatVar2 = ajatVar;
                            if (!zIsEmpty) {
                                if (!acvuVar4.d.contains("|")) {
                                    if (!acvuVar4.e.contains("|")) {
                                        java.util.Iterator it5 = acvuVar4.o.iterator();
                                        loop0: while (true) {
                                            if (!it5.hasNext()) {
                                                int i8 = 0;
                                                while (i8 < acvuVar4.o.size()) {
                                                    int i9 = i8 + 1;
                                                    for (int i10 = i9; i10 < acvuVar4.o.size(); i10++) {
                                                        if (((defpackage.acvr) acvuVar4.o.get(i8)).c.equals(((defpackage.acvr) acvuVar4.o.get(i10)).c)) {
                                                            adbe.e("%s Repeated file id in added group = %s, file id = %s", new java.lang.Object[]{"DataFileGroupValidator", acvuVar4.d, ((defpackage.acvr) acvuVar4.o.get(i8)).c});
                                                            break;
                                                        }
                                                    }
                                                    i8 = i9;
                                                }
                                                defpackage.acvw acvwVar2 = acvuVar4.m;
                                                if (acvwVar2 == null) {
                                                    acvwVar2 = defpackage.acvw.a;
                                                }
                                                int iAQ2 = a.aQ(acvwVar2.d);
                                                if (iAQ2 != 0 && iAQ2 == 3) {
                                                    defpackage.acvw acvwVar3 = acvuVar4.m;
                                                    if (acvwVar3 == null) {
                                                        acvwVar3 = defpackage.acvw.a;
                                                    }
                                                    if (acvwVar3.e <= 0) {
                                                        adbe.c("%s For DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK policy, the download_first_on_wifi_period_secs must be > 0", "DataFileGroupValidator");
                                                        break;
                                                    }
                                                    if (afsq.aD(aczkVar2.b)) {
                                                    }
                                                    alatVar = acvuVar4.o;
                                                    it3 = alatVar.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            aifyVarN = aify.n(alatVar);
                                                            break;
                                                        }
                                                        iAe2 = a.ae(((defpackage.acvr) it3.next()).f);
                                                        if (iAe2 == 0) {
                                                            iAe2 = 1;
                                                        }
                                                        if (iAe2 == 2) {
                                                            aiftVarD = aify.d(alatVar.size());
                                                            for (defpackage.acvr acvrVar : alatVar) {
                                                                iAe3 = a.ae(acvrVar.f);
                                                                if (iAe3 == 0) {
                                                                    iAe3 = 1;
                                                                }
                                                                if (iAe3 - 1 != 0) {
                                                                    akzxVarP3 = acvrVar.p();
                                                                    str8 = acvrVar.d;
                                                                    messageDigestB = defpackage.adau.b();
                                                                    if (messageDigestB == null) {
                                                                        strA = "";
                                                                    } else {
                                                                        byte[] bytes = str8.getBytes();
                                                                        messageDigestB.update(bytes, 0, bytes.length);
                                                                        strA = defpackage.adau.a(messageDigestB.digest());
                                                                    }
                                                                    if (afsq.aq(acvrVar)) {
                                                                        akzxVarP3.u();
                                                                        defpackage.acvr acvrVar2 = (defpackage.acvr) akzxVarP3.b;
                                                                        j$.util.Objects.requireNonNull(strA);
                                                                        acvrVar2.b |= 64;
                                                                        acvrVar2.i = strA;
                                                                    } else {
                                                                        akzxVarP3.u();
                                                                        defpackage.acvr acvrVar3 = (defpackage.acvr) akzxVarP3.b;
                                                                        j$.util.Objects.requireNonNull(strA);
                                                                        acvrVar3.b |= 16;
                                                                        acvrVar3.g = strA;
                                                                    }
                                                                    defpackage.acvr acvrVar4 = (defpackage.acvr) akzxVarP3.b;
                                                                    java.lang.String str11 = acvrVar4.c;
                                                                    java.lang.String str12 = acvrVar4.g;
                                                                    int i11 = adbe.a;
                                                                    aiftVarD.i((defpackage.acvr) akzxVarP3.p());
                                                                } else {
                                                                    aiftVarD.i(acvrVar);
                                                                }
                                                            }
                                                            aifyVarN = aiftVarD.h();
                                                            break;
                                                        }
                                                    }
                                                    akzx akzxVarP4 = acvuVar4.p();
                                                    akzxVarP4.u();
                                                    ((defpackage.acvu) akzxVarP4.b).o = albq.a;
                                                    akzxVarP4.ai(aifyVarN);
                                                    acvuVar3 = (defpackage.acvu) akzxVarP4.p();
                                                    acyuVar = aczkVar2.d;
                                                    zAv = afsq.av(afsq.al(acvuVar3));
                                                    acwbVar8 = acwbVar7;
                                                    if (!zAv) {
                                                        adbe.d("%s: Trying to add expired group %s.", "FileGroupManager", acwbVar8.c);
                                                        acyu.A(1048, acyuVar.b, acvuVar3);
                                                        throw new acyc();
                                                    }
                                                    if (acyuVar.t(acwbVar8.d)) {
                                                        adbe.e("%s: Trying to add group %s for uninstalled app %s.", new java.lang.Object[]{"FileGroupManager", acwbVar8.c, acwbVar8.d});
                                                        acyu.A(1042, acyuVar.b, acvuVar3);
                                                        throw new adab();
                                                    }
                                                    ajcqVarZ = aiql.z((java.lang.Object) null);
                                                    i6 = 6;
                                                    if (acyuVar.i.D()) {
                                                        acvwVar = acvuVar3.m;
                                                        if (acvwVar == null) {
                                                            acvwVar = defpackage.acvw.a;
                                                        }
                                                        iAe = a.ae(acvwVar.f);
                                                        if (iAe != 0) {
                                                            ajcqVarZ = acyuVar.q(acyuVar.d.h(acwbVar8), new defpackage.acyh((java.lang.Object) acyuVar, acwbVar8, acvuVar3, i6));
                                                        }
                                                    }
                                                    defpackage.adcs adcsVarE = defpackage.adcs.e(ajcqVarZ);
                                                    defpackage.acyh acyhVar = new defpackage.acyh((java.lang.Object) acyuVar, acwbVar8, acvuVar3, 7);
                                                    java.util.concurrent.Executor executor = acyuVar.f;
                                                    defpackage.adcs adcsVarE2 = defpackage.adcs.e(adcsVarE.g(acyhVar, executor).g(new defpackage.acyh((java.lang.Object) acyuVar, acwbVar8, acvuVar3, 8), executor));
                                                    defpackage.acyh acyhVar2 = new defpackage.acyh(aczkVar2, acwbVar8, ajatVar2, 19);
                                                    java.util.concurrent.Executor executor2 = aczkVar2.i;
                                                    return adcsVarE2.g(acyhVar2, executor2).f(new defpackage.acyx(6), executor2);
                                                }
                                                if (afsq.aD(aczkVar2.b) && (iAQ = a.aQ(acvuVar4.j)) != 0 && iAQ == 3) {
                                                    adbe.c("%s For AllowedReaders ALL_APPS policy, the device should be migrated to new key", "DataFileGroupValidator");
                                                    break;
                                                }
                                                alatVar = acvuVar4.o;
                                                it3 = alatVar.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        aifyVarN = aify.n(alatVar);
                                                        break;
                                                    }
                                                    iAe2 = a.ae(((defpackage.acvr) it3.next()).f);
                                                    if (iAe2 == 0) {
                                                        iAe2 = 1;
                                                    }
                                                    if (iAe2 == 2) {
                                                        aiftVarD = aify.d(alatVar.size());
                                                        while (r4.hasNext()) {
                                                            iAe3 = a.ae(acvrVar.f);
                                                            if (iAe3 == 0) {
                                                                iAe3 = 1;
                                                            }
                                                            if (iAe3 - 1 != 0) {
                                                                akzxVarP3 = acvrVar.p();
                                                                str8 = acvrVar.d;
                                                                messageDigestB = defpackage.adau.b();
                                                                if (messageDigestB == null) {
                                                                    strA = "";
                                                                } else {
                                                                    byte[] bytes2 = str8.getBytes();
                                                                    messageDigestB.update(bytes2, 0, bytes2.length);
                                                                    strA = defpackage.adau.a(messageDigestB.digest());
                                                                }
                                                                if (afsq.aq(acvrVar)) {
                                                                    akzxVarP3.u();
                                                                    defpackage.acvr acvrVar5 = (defpackage.acvr) akzxVarP3.b;
                                                                    j$.util.Objects.requireNonNull(strA);
                                                                    acvrVar5.b |= 64;
                                                                    acvrVar5.i = strA;
                                                                } else {
                                                                    akzxVarP3.u();
                                                                    defpackage.acvr acvrVar6 = (defpackage.acvr) akzxVarP3.b;
                                                                    j$.util.Objects.requireNonNull(strA);
                                                                    acvrVar6.b |= 16;
                                                                    acvrVar6.g = strA;
                                                                }
                                                                defpackage.acvr acvrVar7 = (defpackage.acvr) akzxVarP3.b;
                                                                java.lang.String str13 = acvrVar7.c;
                                                                java.lang.String str14 = acvrVar7.g;
                                                                int i12 = adbe.a;
                                                                aiftVarD.i((defpackage.acvr) akzxVarP3.p());
                                                            } else {
                                                                aiftVarD.i(acvrVar);
                                                            }
                                                        }
                                                        aifyVarN = aiftVarD.h();
                                                        break;
                                                    }
                                                }
                                                akzx akzxVarP5 = acvuVar4.p();
                                                akzxVarP5.u();
                                                ((defpackage.acvu) akzxVarP5.b).o = albq.a;
                                                akzxVarP5.ai(aifyVarN);
                                                acvuVar3 = (defpackage.acvu) akzxVarP5.p();
                                                try {
                                                    acyuVar = aczkVar2.d;
                                                    zAv = afsq.av(afsq.al(acvuVar3));
                                                    acwbVar8 = acwbVar7;
                                                    if (!zAv) {
                                                        adbe.d("%s: Trying to add expired group %s.", "FileGroupManager", acwbVar8.c);
                                                        acyu.A(1048, acyuVar.b, acvuVar3);
                                                        throw new acyc();
                                                    }
                                                    if (acyuVar.t(acwbVar8.d)) {
                                                        adbe.e("%s: Trying to add group %s for uninstalled app %s.", new java.lang.Object[]{"FileGroupManager", acwbVar8.c, acwbVar8.d});
                                                        acyu.A(1042, acyuVar.b, acvuVar3);
                                                        throw new adab();
                                                    }
                                                    ajcqVarZ = aiql.z((java.lang.Object) null);
                                                    i6 = 6;
                                                    if (acyuVar.i.D()) {
                                                        acvwVar = acvuVar3.m;
                                                        if (acvwVar == null) {
                                                            acvwVar = defpackage.acvw.a;
                                                        }
                                                        iAe = a.ae(acvwVar.f);
                                                        if (iAe != 0 && iAe == 2) {
                                                            ajcqVarZ = acyuVar.q(acyuVar.d.h(acwbVar8), new defpackage.acyh((java.lang.Object) acyuVar, acwbVar8, acvuVar3, i6));
                                                        }
                                                    }
                                                    defpackage.adcs adcsVarE3 = defpackage.adcs.e(ajcqVarZ);
                                                    defpackage.acyh acyhVar3 = new defpackage.acyh((java.lang.Object) acyuVar, acwbVar8, acvuVar3, 7);
                                                    java.util.concurrent.Executor executor3 = acyuVar.f;
                                                    defpackage.adcs adcsVarE4 = defpackage.adcs.e(adcsVarE3.g(acyhVar3, executor3).g(new defpackage.acyh((java.lang.Object) acyuVar, acwbVar8, acvuVar3, 8), executor3));
                                                    defpackage.acyh acyhVar4 = new defpackage.acyh(aczkVar2, acwbVar8, ajatVar2, 19);
                                                    java.util.concurrent.Executor executor4 = aczkVar2.i;
                                                    return adcsVarE4.g(acyhVar4, executor4).f(new defpackage.acyx(6), executor4);
                                                } catch (acxw e) {
                                                    e = e;
                                                    adbe.i("%s %s", "MDDManager", e.getClass());
                                                    return aiql.y(e);
                                                } catch (adab e2) {
                                                    e = e2;
                                                    adbe.i("%s %s", "MDDManager", e.getClass());
                                                    return aiql.y(e);
                                                } catch (acyc e3) {
                                                    e = e3;
                                                    adbe.i("%s %s", "MDDManager", e.getClass());
                                                    return aiql.y(e);
                                                } catch (java.io.IOException e4) {
                                                    adbe.d("%s %s", "MDDManager", e4.getClass());
                                                    aczkVar2.g.a();
                                                    return aiql.y(e4);
                                                }
                                            }
                                            defpackage.acvr acvrVar8 = (defpackage.acvr) it5.next();
                                            if (!acvrVar8.c.isEmpty() && !acvrVar8.c.contains("|")) {
                                                boolean z2 = !afsq.aq(acvrVar8) ? (acvrVar8.b & 16) == 0 || acvrVar8.g.isEmpty() : (acvrVar8.b & 64) == 0 || acvrVar8.i.isEmpty();
                                                int iAe6 = a.ae(acvrVar8.f);
                                                if (iAe6 == 0) {
                                                    iAe6 = 1;
                                                }
                                                boolean z3 = (iAe6 - 1 != 0 ? !z2 : z2) | (afsq.aq(acvrVar8) && !z2);
                                                int iAe7 = a.ae(acvrVar8.n);
                                                if (iAe7 != 0 && iAe7 == 2 && acvrVar8.o.isEmpty()) {
                                                    i7 = 3;
                                                    z = false;
                                                } else {
                                                    z = true;
                                                    i7 = 3;
                                                }
                                                if (acvrVar8.d.isEmpty() || acvrVar8.d.contains("|") || acvrVar8.e < 0 || !z3 || !z || afsq.ap(acvrVar8).contains("|")) {
                                                    java.lang.String str15 = acvuVar4.d;
                                                    java.lang.String str16 = acvrVar8.c;
                                                    java.lang.Object[] objArr = new java.lang.Object[i7];
                                                    objArr[0] = "DataFileGroupValidator";
                                                    objArr[1] = str15;
                                                    objArr[2] = str16;
                                                    adbe.e("%s File details missing in added group = %s, file id = %s", objArr);
                                                    break;
                                                }
                                                acvl acvlVar2 = aczkVar2.k;
                                                if ((acvrVar8.b & 32) == 0) {
                                                    if ((acvrVar8.b & 256) != 0) {
                                                        str9 = acvuVar4.d;
                                                        it4 = acvrVar8.l.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                acvvVar = (defpackage.acvv) it4.next();
                                                                if (!acvvVar.c.isEmpty() || acvvVar.c.contains("|") || (acvvVar.b & 2) == 0) {
                                                                    str10 = str9;
                                                                } else {
                                                                    acvlVar = acvlVar2;
                                                                    str10 = str9;
                                                                    if (acvvVar.d >= 0 && !acvvVar.e.isEmpty() && !acvvVar.e.contains("|")) {
                                                                        int i13 = acvvVar.b;
                                                                        if ((i13 & 8) != 0 && (iAe4 = a.ae(acvvVar.f)) != 0 && iAe4 != 1 && (i13 & 16) != 0) {
                                                                            defpackage.acvq acvqVar = acvvVar.g;
                                                                            if (acvqVar == null) {
                                                                                acvqVar = defpackage.acvq.a;
                                                                            }
                                                                            if (!acvqVar.b.isEmpty()) {
                                                                                defpackage.acvq acvqVar2 = acvvVar.g;
                                                                                if (acvqVar2 == null) {
                                                                                    acvqVar2 = defpackage.acvq.a;
                                                                                }
                                                                                if (!acvqVar2.b.contains("|")) {
                                                                                    acvlVar2 = acvlVar;
                                                                                    str9 = str10;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                java.lang.String str17 = acvrVar8.c;
                                                                java.lang.String str18 = acvvVar.c;
                                                                java.lang.Object[] objArr2 = new java.lang.Object[4];
                                                                objArr2[0] = "DataFileGroupValidator";
                                                                objArr2[1] = str10;
                                                                objArr2[2] = str17;
                                                                objArr2[i7] = str18;
                                                                adbe.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr2);
                                                                break loop0;
                                                            }
                                                            acvl acvlVar3 = acvlVar2;
                                                            if (!afsq.au(acvrVar8) && !acvlVar3.I()) {
                                                                java.lang.String str19 = acvuVar4.d;
                                                                java.lang.String str20 = acvrVar8.c;
                                                                java.lang.String str21 = acvrVar8.d;
                                                                java.lang.Object[] objArr3 = new java.lang.Object[4];
                                                                objArr3[0] = "DataFileGroupValidator";
                                                                objArr3[1] = str19;
                                                                objArr3[2] = str20;
                                                                objArr3[i7] = str21;
                                                                adbe.e("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", objArr3);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        amluVar = acvrVar8.k;
                                                        if (amluVar == null) {
                                                            amluVar = defpackage.amlu.a;
                                                        }
                                                        if (afsq.aH(amluVar)) {
                                                            break;
                                                        }
                                                        str9 = acvuVar4.d;
                                                        it4 = acvrVar8.l.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                acvvVar = (defpackage.acvv) it4.next();
                                                                if (acvvVar.c.isEmpty()) {
                                                                }
                                                                str10 = str9;
                                                                java.lang.String str110 = acvrVar8.c;
                                                                java.lang.String str111 = acvvVar.c;
                                                                java.lang.Object[] objArr4 = new java.lang.Object[4];
                                                                objArr4[0] = "DataFileGroupValidator";
                                                                objArr4[1] = str10;
                                                                objArr4[2] = str110;
                                                                objArr4[i7] = str111;
                                                                adbe.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr4);
                                                                break loop0;
                                                            }
                                                            acvl acvlVar4 = acvlVar2;
                                                            if (!afsq.au(acvrVar8)) {
                                                            }
                                                            acvlVar2 = acvlVar;
                                                            str9 = str10;
                                                        }
                                                    }
                                                } else {
                                                    defpackage.amlu amluVar2 = acvrVar8.h;
                                                    if (amluVar2 == null) {
                                                        amluVar2 = defpackage.amlu.a;
                                                    }
                                                    if (!afsq.aH(amluVar2)) {
                                                        break;
                                                    }
                                                    java.lang.String str22 = acvuVar4.d;
                                                    if (afsq.aq(acvrVar8)) {
                                                        if (!acvlVar2.J()) {
                                                            adbe.d("Feature enableZipFolder is not enabled. Group = %s, file id = %s", str22, acvrVar8.c);
                                                            break;
                                                        }
                                                        defpackage.amlu amluVar3 = acvrVar8.h;
                                                        if (amluVar3 == null) {
                                                            amluVar3 = defpackage.amlu.a;
                                                        }
                                                        if (amluVar3.b.size() <= 1) {
                                                            defpackage.amlu amluVar4 = acvrVar8.h;
                                                            if (amluVar4 == null) {
                                                                amluVar4 = defpackage.amlu.a;
                                                            }
                                                            amlt amltVar = (amlt) amluVar4.b.get(0);
                                                            if (!"*".equals((amltVar.b == 4 ? (amlv) amltVar.c : amlv.a).c)) {
                                                                adbe.d("Download zip folder transform can only have * as target. Group = %s, file id = %s", str22, acvrVar8.c);
                                                                break;
                                                            }
                                                            iAe5 = a.ae(acvrVar8.f);
                                                            if (iAe5 == 0) {
                                                                adbe.d("Download checksum must be provided. Group = %s, file id = %s", acvuVar4.d, acvrVar8.c);
                                                                break;
                                                            }
                                                            adbe.d("Download checksum must be provided. Group = %s, file id = %s", acvuVar4.d, acvrVar8.c);
                                                            break;
                                                        }
                                                        adbe.d("Download zip folder transform cannot not be applied with other transforms. Group = %s, file id = %s", str22, acvrVar8.c);
                                                        break;
                                                    }
                                                    iAe5 = a.ae(acvrVar8.f);
                                                    if ((iAe5 == 0 || iAe5 != 2) && (acvrVar8.b & 64) == 0) {
                                                        adbe.d("Download checksum must be provided. Group = %s, file id = %s", acvuVar4.d, acvrVar8.c);
                                                        break;
                                                    }
                                                    if ((acvrVar8.b & 256) != 0) {
                                                        amluVar = acvrVar8.k;
                                                        if (amluVar == null) {
                                                            amluVar = defpackage.amlu.a;
                                                        }
                                                        if (afsq.aH(amluVar)) {
                                                            break;
                                                            break;
                                                        }
                                                        str9 = acvuVar4.d;
                                                        it4 = acvrVar8.l.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                acvvVar = (defpackage.acvv) it4.next();
                                                                if (acvvVar.c.isEmpty()) {
                                                                }
                                                                str10 = str9;
                                                                java.lang.String str112 = acvrVar8.c;
                                                                java.lang.String str113 = acvvVar.c;
                                                                java.lang.Object[] objArr5 = new java.lang.Object[4];
                                                                objArr5[0] = "DataFileGroupValidator";
                                                                objArr5[1] = str10;
                                                                objArr5[2] = str112;
                                                                objArr5[i7] = str113;
                                                                adbe.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr5);
                                                                break loop0;
                                                            }
                                                            acvl acvlVar5 = acvlVar2;
                                                            if (!afsq.au(acvrVar8)) {
                                                            }
                                                            acvlVar2 = acvlVar;
                                                            str9 = str10;
                                                        }
                                                    } else {
                                                        str9 = acvuVar4.d;
                                                        it4 = acvrVar8.l.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                acvvVar = (defpackage.acvv) it4.next();
                                                                if (acvvVar.c.isEmpty()) {
                                                                }
                                                                str10 = str9;
                                                                java.lang.String str114 = acvrVar8.c;
                                                                java.lang.String str115 = acvvVar.c;
                                                                java.lang.Object[] objArr6 = new java.lang.Object[4];
                                                                objArr6[0] = "DataFileGroupValidator";
                                                                objArr6[1] = str10;
                                                                objArr6[2] = str114;
                                                                objArr6[i7] = str115;
                                                                adbe.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr6);
                                                                break loop0;
                                                            }
                                                            acvl acvlVar6 = acvlVar2;
                                                            if (!afsq.au(acvrVar8)) {
                                                            }
                                                            acvlVar2 = acvlVar;
                                                            str9 = str10;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i7 = 3;
                                                java.lang.String str116 = acvuVar4.d;
                                                java.lang.String str117 = acvrVar8.c;
                                                java.lang.Object[] objArr7 = new java.lang.Object[i7];
                                                objArr7[0] = "DataFileGroupValidator";
                                                objArr7[1] = str116;
                                                objArr7[2] = str117;
                                                adbe.e("%s File details missing in added group = %s, file id = %s", objArr7);
                                                break;
                                            }
                                        }
                                    } else {
                                        adbe.d("%s Owner package = %s contains '|'", "DataFileGroupValidator", acvuVar4.e);
                                    }
                                } else {
                                    adbe.d("%s Group name = %s contains '|'", "DataFileGroupValidator", acvuVar4.d);
                                }
                            } else {
                                adbe.c("%s Group name missing in added group", "DataFileGroupValidator");
                            }
                            aczkVar2.c.m(1020, acvuVar4.d, acvuVar4.f, acvuVar4.s, acvuVar4.t);
                            return aiql.z(java.lang.Boolean.FALSE);
                        }
                    }, aczkVar.i), java.io.IOException.class, new defpackage.acwn(0), ((acwx) obj11).f);
                } catch (alaz e) {
                    adbe.g(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", new java.lang.Object[]{"MobileDataDownload"});
                    return aiql.z(java.lang.Boolean.FALSE);
                }
            case 17:
                java.lang.Object obj12 = this.a;
                final acwx acwxVar4 = (acwx) this.b;
                final defpackage.acvj acvjVar = (defpackage.acvj) obj12;
                return ahvr.I(acwxVar4.j(acvjVar), new ajat() { // from class: acwp
                    public final ajcq a(java.lang.Object obj13) {
                        defpackage.acyb acybVar = (defpackage.acyb) obj13;
                        int iB = acybVar.b() - 1;
                        if (iB == 1) {
                            return acybVar.c();
                        }
                        if (iB == 2) {
                            return aiql.z(acybVar.a());
                        }
                        defpackage.acvj acvjVar2 = acvjVar;
                        acwx acwxVar5 = acwxVar4;
                        defpackage.acvu acvuVarD = acybVar.d();
                        android.content.Context context2 = acwxVar5.a;
                        ((android.app.NotificationManager) context2.getSystemService(android.app.NotificationManager.class)).createNotificationChannel(new android.app.NotificationChannel("download-notification-channel-id", context2.getResources().getString(2132019325), 3));
                        akzx akzxVarM3 = defpackage.acwb.a.m();
                        akzxVarM3.u();
                        defpackage.acwb acwbVar8 = (defpackage.acwb) akzxVarM3.b;
                        java.lang.String str8 = acvjVar2.a;
                        j$.util.Objects.requireNonNull(str8);
                        acwbVar8.b |= 1;
                        acwbVar8.c = str8;
                        java.lang.String packageName3 = context2.getPackageName();
                        akzxVarM3.u();
                        defpackage.acwb acwbVar9 = (defpackage.acwb) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(packageName3);
                        acwbVar9.b |= 2;
                        acwbVar9.d = packageName3;
                        defpackage.acwb acwbVar10 = (defpackage.acwb) akzxVarM3.p();
                        defpackage.acxu acxuVarA = defpackage.acxu.a(str8);
                        defpackage.acvw acvwVar = acvuVarD.m;
                        if (acvwVar == null) {
                            acvwVar = defpackage.acvw.a;
                        }
                        int iAQ = a.aQ(acvwVar.d);
                        if (iAQ == 0) {
                            iAQ = 1;
                        }
                        ahyn ahynVar2 = acvjVar2.f;
                        if (ahynVar2.f()) {
                            try {
                                iAQ = a.aQ(afsq.ah((acuz) ahynVar2.b()).d);
                                if (iAQ == 0) {
                                    iAQ = 1;
                                }
                            } catch (alaz unused) {
                            }
                        }
                        int i6 = iAQ - 1;
                        java.lang.String string = (i6 == 0 || i6 == 2) ? acwxVar5.a.getResources().getString(2132019330) : acwxVar5.a.getResources().getString(2132019329);
                        android.content.Context context3 = acwxVar5.a;
                        dvr dvrVar = new dvr(context3);
                        java.lang.String str9 = acvjVar2.a;
                        ahyn ahynVar3 = acvjVar2.d;
                        defpackage.acxu acxuVarA2 = defpackage.acxu.a(str9);
                        ahynVar3.d(str9);
                        acvjVar2.e.d(str9);
                        dva dvaVarY = abrz.Y(context3);
                        dvaVarY.h(str9);
                        dvaVarY.g(str9);
                        dvaVarY.g = null;
                        dvaVarY.n(android.R.drawable.stat_sys_download);
                        dvaVarY.d(2, true);
                        dvaVarY.s(0, false);
                        if (acvjVar2.i == 2) {
                            dvaVarY.a();
                            int iHashCode = str9.hashCode();
                            ahyn ahynVar4 = acwxVar5.h;
                            java.lang.String str10 = acxuVarA2.a;
                            android.content.Intent intent = new android.content.Intent(context3, (java.lang.Class<?>) ahynVar4.b());
                            intent.setPackage(context3.getPackageName());
                            intent.putExtra("cancel-action", iHashCode);
                            intent.putExtra("key", str10);
                            android.app.PendingIntent foregroundService = android.app.PendingIntent.getForegroundService(context3, iHashCode, defpackage.afap.a(intent, 1140850688), 1140850688);
                            java.lang.String string2 = context3.getResources().getString(2132019327);
                            ahvr.ci(foregroundService);
                            dvaVarY.f(dux.e(androidx.core.graphics.drawable.IconCompat.h((android.content.res.Resources) null, "", android.R.drawable.stat_sys_warning), dva.c(string2), foregroundService, new android.os.Bundle()));
                            dvrVar.b(iHashCode, dvaVarY.a());
                        }
                        defpackage.acwu acwuVar = new defpackage.acwu(acwxVar5, acxuVarA2, acvjVar2, dvaVarY, dvrVar, string);
                        java.lang.Object objB = acwxVar5.g.b();
                        synchronized (adce.class) {
                            java.util.HashMap map = ((adce) objB).c;
                            if (!map.containsKey(str9)) {
                                defpackage.adcd adcdVar = new defpackage.adcd((adce) objB, str9, acwuVar);
                                j$.util.Objects.requireNonNull(((adce) objB).d);
                                map.put(str9, new defpackage.affl(adcdVar, new defpackage.adcf(1), 1000L, java.util.concurrent.TimeUnit.MILLISECONDS));
                            }
                        }
                        try {
                            ahyn ahynVar5 = acvjVar2.f;
                            ahyn ahynVarH = ahynVar5.f() ? ahyn.h(afsq.ah((acuz) ahynVar5.b())) : ahwt.a;
                            ajcr ajcrVar = new ajcr(new defpackage.vnc(12));
                            defpackage.adcs adcsVarE = defpackage.adcs.e(ajcrVar);
                            defpackage.zum zumVar = new defpackage.zum((java.lang.Object) acwxVar5, (alad) acwbVar10, (java.lang.Object) ahynVarH, 7);
                            java.util.concurrent.Executor executor = acwxVar5.f;
                            defpackage.adcs adcsVarF = adcsVarE.g(zumVar, executor).g(new defpackage.zum(acwxVar5, acwbVar10, acvjVar2, 8, (char[]) null), executor).f(new defpackage.ymu(19), executor);
                            ajcq ajcqVarI = ahvr.I(acwxVar5.j.e(acxuVarA.a, adcsVarF), new defpackage.wzg(ajcrVar, adcsVarF, 13), executor);
                            ahvr.J(ajcqVarI, new defpackage.uwo(acwxVar5, acwuVar, 7), executor);
                            return ajcqVarI;
                        } catch (alaz e2) {
                            return aiql.y(e2);
                        }
                    }
                }, acwxVar4.f);
            case 18:
                java.lang.Object obj13 = this.a;
                acyu acyuVar = (acyu) this.b;
                defpackage.acwb acwbVar8 = (defpackage.acwb) obj13;
                ajcq ajcqVarG = acyuVar.g(acwbVar8, false);
                ajcq ajcqVarG2 = acyuVar.g(acwbVar8, true);
                return abrz.ae(new ajcq[]{ajcqVarG, ajcqVarG2}).E(new defpackage.wwg(ajcqVarG, ajcqVarG2, i2, bArr), acyuVar.f);
            case 19:
                return aiql.z(new defpackage.adad((defpackage.acvu) aiql.H((java.util.concurrent.Future) this.a), (defpackage.acvu) aiql.H((java.util.concurrent.Future) this.b)));
            default:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (true) {
                    ?? r2 = this.a;
                    if (i3 >= r2.size()) {
                        return aiql.z(arrayList2);
                    }
                    ?? r3 = this.b;
                    defpackage.acwb acwbVar9 = (defpackage.acwb) r2.get(i3);
                    defpackage.acvu acvuVar3 = (defpackage.acvu) aiql.H((java.util.concurrent.Future) r3.get(i3));
                    if (acvuVar3 != null) {
                        arrayList2.add(new defpackage.adac(acwbVar9, acvuVar3));
                    }
                    i3++;
                }
                break;
        }
    }

    public /* synthetic */ wwg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
