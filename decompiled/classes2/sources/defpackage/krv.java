package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public krv(rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.b = rlvVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean();
        this.a = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static final long b(defpackage.kow kowVar) {
        amlg amlgVar;
        amle amleVar = kowVar.c;
        if (amleVar == null) {
            amleVar = amle.a;
        }
        amld amldVar = amleVar.c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        aooh.e(amldVar, "getRecognitionEvent(...)");
        int i = amldVar.b;
        if (i == 1) {
            amlgVar = ((amkw) amldVar.c).e;
            if (amlgVar == null) {
                amlgVar = amlg.a;
            }
        } else {
            amlgVar = (i == 2 ? (amla) amldVar.c : amla.a).d;
            if (amlgVar == null) {
                amlgVar = amlg.a;
            }
        }
        return amlgVar.c;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0276  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd  */
    /* JADX WARN: Type inference failed for: r0v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [aoin, java.lang.Object] */
    public final defpackage.kra a(defpackage.kpd kpdVar) {
        java.lang.String strCr;
        int i;
        int i2;
        int i3;
        int i4;
        alat alatVar;
        defpackage.kra kraVarU;
        int iAM;
        aooh.f(kpdVar, "request");
        int i5 = kpdVar.d;
        alat alatVar2 = kpdVar.c.b;
        java.util.Iterator it = alatVar2.iterator();
        while (true) {
            if (!it.hasNext()) {
                aooh.e(alatVar2, "onEach(...)");
                java.util.List listBX = ajsz.bX(alatVar2, new defpackage.hte(11));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it2 = listBX.iterator();
                while (true) {
                    strCr = "";
                    int i6 = 3;
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    defpackage.kow kowVar = (defpackage.kow) it2.next();
                    aooh.c(kowVar);
                    java.lang.String str = kowVar.d;
                    aooh.e(str, "getTranscript(...)");
                    java.lang.String string = aoov.x(aoov.Q(str, "</S>", "")).toString();
                    if (string.length() == 0) {
                        kraVarU = null;
                    } else {
                        int iO = defpackage.hgu.o(kowVar.f);
                        if (iO == 0) {
                            iO = 1;
                        }
                        int i7 = iO - 2;
                        java.lang.String str2 = i7 != 2 ? i7 != 3 ? "Speaker ?" : "Other" : "You";
                        defpackage.oq oqVarX = defpackage.hgz.X(defpackage.kra.a.m());
                        oqVarX.v(a.br(string, str2, ": "));
                        if (aoov.H(string)) {
                            i4 = 0;
                        } else {
                            android.icu.text.BreakIterator breakIteratorM$1 = fh$.ExternalSyntheticApiModelOutline0.m$1();
                            fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1, string);
                            i4 = 0;
                            while (fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1) != -1) {
                                if (fh$.ExternalSyntheticApiModelOutline0.m$1(breakIteratorM$1) != 0) {
                                    i4++;
                                }
                            }
                        }
                        oqVarX.w(i4);
                        amle amleVar = kowVar.c;
                        if (amleVar == null) {
                            amleVar = amle.a;
                        }
                        amld amldVar = amleVar.c;
                        if (amldVar == null) {
                            amldVar = amld.a;
                        }
                        aooh.e(amldVar, "getRecognitionEvent(...)");
                        int i8 = amldVar.b;
                        if (i8 == 1) {
                            alatVar = ((amkw) amldVar.c).d;
                            aooh.e(alatVar, "getHypothesisPartsList(...)");
                        } else {
                            if (i8 == 2) {
                                alatVar = ((amla) amldVar.c).c;
                                aooh.e(alatVar, "getHypothesisPartsList(...)");
                            } else {
                                i6 = 3;
                            }
                            oqVarX.x(i6);
                            kraVarU = oqVarX.u();
                        }
                        if (!alatVar.isEmpty() && alatVar.size() >= 2) {
                            java.util.Iterator it3 = alatVar.iterator();
                            int length = 0;
                            while (it3.hasNext()) {
                                length += ((java.lang.String) ((amkz) it3.next()).b.get(0)).length();
                            }
                            if (length != 0) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (java.lang.Object obj : alatVar) {
                                    amkz amkzVar = (amkz) obj;
                                    alat alatVar3 = amkzVar.e;
                                    aooh.e(alatVar3, "getVersionedWordConfidenceList(...)");
                                    if (alatVar3.isEmpty()) {
                                        iAM = a.aM(amkzVar.d);
                                        if (iAM == 0) {
                                            iAM = 1;
                                        }
                                    } else {
                                        alat alatVar4 = amkzVar.e;
                                        aooh.e(alatVar4, "getVersionedWordConfidenceList(...)");
                                        iAM = a.aM(((amlh) ajsz.bI(alatVar4)).c);
                                        if (iAM == 0) {
                                            iAM = 1;
                                        }
                                    }
                                    int i9 = iAM - 1;
                                    if (i9 == 0 || i9 == 1 || i9 == 2) {
                                        arrayList2.add(obj);
                                    }
                                }
                                java.util.Iterator it4 = arrayList2.iterator();
                                int length2 = 0;
                                while (it4.hasNext()) {
                                    length2 += ((java.lang.String) ((amkz) it4.next()).b.get(0)).length();
                                }
                                if (((double) length2) / ((double) length) >= ((java.lang.Number) this.b.a()).doubleValue()) {
                                    i6 = 2;
                                } else {
                                    i6 = 3;
                                }
                            }
                        }
                        oqVarX.x(i6);
                        kraVarU = oqVarX.u();
                    }
                    if (kraVarU != null) {
                        arrayList.add(kraVarU);
                    }
                }
                java.lang.Long l = (java.lang.Long) this.c.a();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int i10 = 0;
                for (java.lang.Object obj2 : arrayList) {
                    i10 += ((defpackage.kra) obj2).e;
                    if (i10 > l.longValue()) {
                        break;
                    }
                    arrayList3.add(obj2);
                }
                if (!arrayList3.isEmpty()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(arrayList3, 10));
                    java.util.Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(((defpackage.kra) it5.next()).c);
                    }
                    strCr = ajsz.cr(arrayList4, "\n", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
                }
                if (!arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        i3 = 0;
                    } else {
                        java.util.Iterator it6 = arrayList3.iterator();
                        i3 = 0;
                        while (it6.hasNext()) {
                            int iAQ = a.aQ(((defpackage.kra) it6.next()).d);
                            if (iAQ == 0) {
                                iAQ = 1;
                            }
                            if (iAQ == 2 && (i3 = i3 + 1) < 0) {
                                ajsz.bg();
                            }
                        }
                    }
                    i2 = ((double) i3) / ((double) arrayList3.size()) <= ((java.lang.Number) this.a.a()).doubleValue() ? 3 : 2;
                }
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    i += ((defpackage.kra) it7.next()).e;
                }
                defpackage.oq oqVarX2 = defpackage.hgz.X(defpackage.kra.a.m());
                oqVarX2.v(strCr);
                akzx akzxVar = (akzx) oqVarX2.a;
                akzxVar.u();
                defpackage.kra kraVar = (defpackage.kra) akzxVar.b;
                j$.util.Objects.requireNonNull("**Incoming Call**");
                kraVar.b |= 8;
                kraVar.f = "**Incoming Call**";
                oqVarX2.x(i2);
                oqVarX2.w(i);
                return oqVarX2.u();
            }
            defpackage.kow kowVar2 = (defpackage.kow) it.next();
            aooh.c(kowVar2);
            if ((kowVar2.b & 1) == 0) {
                throw new java.lang.IllegalStateException("AsrResult is missing SodaEvent.");
            }
            amle amleVar2 = kowVar2.c;
            if (amleVar2 == null) {
                amleVar2 = amle.a;
            }
            amld amldVar2 = amleVar2.c;
            if (amldVar2 == null) {
                amldVar2 = amld.a;
            }
            aooh.e(amldVar2, "getRecognitionEvent(...)");
            int i11 = amldVar2.b;
            if (i11 != 1 && i11 != 2) {
                throw new java.lang.IllegalStateException("RecognitionEvent has neither finalResult nor partialResult.");
            }
        }
    }

    public final defpackage.aixy c(defpackage.jrz jrzVar, java.lang.String str) {
        int i;
        defpackage.aixm aixmVar;
        oko okoVarI = ((oko) this.c).i((android.telecom.PhoneAccountHandle) sos.a(jrzVar.i, jrzVar.j).orElse((java.lang.Object) null));
        akzx akzxVarM = defpackage.aixy.a.m();
        akzx akzxVarM2 = alcf.a.m();
        long j = jrzVar.e;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j2 = j / 1000;
        akzxVarM2.u();
        akzxVarM2.b.b = j2 - (j2 % 3600);
        akzxVarM.u();
        defpackage.aixy aixyVar = (defpackage.aixy) akzxVarM.b;
        alcf alcfVarP = akzxVarM2.p();
        j$.util.Objects.requireNonNull(alcfVarP);
        aixyVar.c = alcfVarP;
        int i2 = 1;
        aixyVar.b |= 1;
        defpackage.hkd hkdVar = jrzVar.c;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        java.lang.String str2 = hkdVar.c;
        aca acaVar = new aca();
        acaVar.put("phone_number", str2);
        acaVar.put("caller_id", str);
        java.lang.String strA = ((aaiz) this.b).a("dialer_caller_id_event", acaVar);
        akzxVarM.u();
        defpackage.aixy aixyVar2 = (defpackage.aixy) akzxVarM.b;
        j$.util.Objects.requireNonNull(strA);
        aixyVar2.b |= 2;
        aixyVar2.d = strA;
        switch (jrzVar.g) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 6;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            default:
                i = 1;
                break;
        }
        akzxVarM.u();
        defpackage.aixy aixyVar3 = (defpackage.aixy) akzxVarM.b;
        aixyVar3.e = i - 1;
        aixyVar3.b |= 4;
        java.lang.String str3 = (java.lang.String) okoVarI.z().orElse((java.lang.Object) null);
        akzxVarM.u();
        defpackage.aixy aixyVar4 = (defpackage.aixy) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aixyVar4.b |= 8;
        aixyVar4.f = str3;
        java.lang.String str4 = (java.lang.String) okoVarI.x().orElse((java.lang.Object) null);
        akzxVarM.u();
        defpackage.aixy aixyVar5 = (defpackage.aixy) akzxVarM.b;
        j$.util.Objects.requireNonNull(str4);
        aixyVar5.b |= 16;
        aixyVar5.g = str4;
        int iAg = a.ag(jrzVar.f);
        if (iAg == 0) {
            iAg = 1;
        }
        switch (iAg - 1) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
        }
        akzxVarM.u();
        defpackage.aixy aixyVar6 = (defpackage.aixy) akzxVarM.b;
        aixyVar6.h = i2 - 1;
        aixyVar6.b |= 32;
        long j3 = jrzVar.h;
        if (j3 < 30000) {
            aixmVar = defpackage.aixm.CALL_DURATION_VERY_SHORT;
        } else if (j3 < 60000) {
            aixmVar = defpackage.aixm.CALL_DURATION_SHORT;
        } else {
            aixmVar = j3 < 120000 ? defpackage.aixm.CALL_DURATION_MEDIUM : defpackage.aixm.CALL_DURATION_LONG;
        }
        akzxVarM.u();
        defpackage.aixy aixyVar7 = (defpackage.aixy) akzxVarM.b;
        aixyVar7.j = aixmVar.f;
        aixyVar7.b |= 128;
        java.lang.String strA2 = rlz.a((android.content.Context) this.a);
        akzxVarM.u();
        defpackage.aixy aixyVar8 = (defpackage.aixy) akzxVarM.b;
        j$.util.Objects.requireNonNull(strA2);
        aixyVar8.b |= 256;
        aixyVar8.k = strA2;
        java.lang.String languageTag = java.util.Locale.getDefault().toLanguageTag();
        akzxVarM.u();
        defpackage.aixy aixyVar9 = (defpackage.aixy) akzxVarM.b;
        j$.util.Objects.requireNonNull(languageTag);
        aixyVar9.b |= 512;
        aixyVar9.l = languageTag;
        defpackage.kiw kiwVar = jrzVar.d;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        akzxVarM.u();
        defpackage.aixy aixyVar10 = (defpackage.aixy) akzxVarM.b;
        aixyVar10.i = rmtVarB.q;
        aixyVar10.b |= 64;
        return (defpackage.aixy) akzxVarM.p();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, rlv] */
    public final void d() {
        akzx akzxVarM = amqy.a.m();
        akzx akzxVarM2 = ampo.a.m();
        boolean z = ((java.util.concurrent.atomic.AtomicBoolean) this.c).get();
        akzxVarM2.u();
        ampo ampoVar = akzxVarM2.b;
        ampoVar.b |= 1;
        ampoVar.c = z;
        boolean z2 = ((java.util.concurrent.atomic.AtomicBoolean) this.a).get();
        akzxVarM2.u();
        ampo ampoVar2 = akzxVarM2.b;
        ampoVar2.b |= 2;
        ampoVar2.d = z2;
        ampo ampoVarP = akzxVarM2.p();
        akzxVarM.u();
        amqy amqyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ampoVarP);
        amqyVar.c = ampoVarP;
        amqyVar.b |= 1;
        amqy amqyVarP = akzxVarM.p();
        aooh.e(amqyVarP, "build(...)");
        this.b.r(amqyVarP);
    }

    public krv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        this.b = aoinVar;
        this.a = aoinVar2;
        this.c = aoinVar3;
    }

    public krv(aoss aossVar, oxc oxcVar) {
        aooh.f(aossVar, "lightweightScope");
        this.b = aossVar;
        this.a = oxcVar;
        this.c = oxcVar;
    }

    public krv(defpackage.krt krtVar, ahey aheyVar, rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.a = krtVar;
        this.b = aheyVar;
        this.c = rlvVar;
    }

    public krv(pqm pqmVar, rlv rlvVar) {
        this.b = new java.util.concurrent.atomic.AtomicReference(pat.a);
        this.a = pqmVar;
        this.c = rlvVar;
    }

    public krv(android.content.Context context, aaiz aaizVar, oko okoVar) {
        this.a = context;
        this.b = aaizVar;
        this.c = okoVar;
    }

    public krv(ajct ajctVar, aogc aogcVar) {
        this.c = new j$.util.concurrent.ConcurrentHashMap();
        this.a = ajctVar;
        this.b = aogcVar;
    }
}
