package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpq implements defpackage.kpe {
    private static final aimz a = aimz.i("com/android/dialer/callnotesinfra/summarizer/aicore/AiCoreCallNotesExtractor");
    private static final aorg b = new aorg("^:");
    private final defpackage.kqj c;
    private final rlv d;
    private final apdp e;
    private final defpackage.krv f;

    public kpq(defpackage.kqj kqjVar, defpackage.krv krvVar, rlv rlvVar, aazc aazcVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aazcVar, "clock");
        this.c = kqjVar;
        this.f = krvVar;
        this.d = rlvVar;
        this.e = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kpe
    public final java.lang.Object a(defpackage.kpd kpdVar, aoln aolnVar) {
        defpackage.kpl kplVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        defpackage.kpd kpdVar2;
        java.lang.Object obj;
        long j;
        vqu vquVarJ;
        java.lang.Throwable thC;
        defpackage.kpk kpkVar;
        defpackage.kqz kqzVar;
        if (aolnVar instanceof defpackage.kpl) {
            kplVar = (defpackage.kpl) aolnVar;
            int i = kplVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kplVar.d = i - Integer.MIN_VALUE;
            } else {
                kplVar = new defpackage.kpl(this, aolnVar);
            }
        } else {
            kplVar = new defpackage.kpl(this, aolnVar);
        }
        java.lang.Object obj2 = kplVar.b;
        aolu aoluVar = aolu.a;
        int i2 = kplVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = kplVar.a;
            ahoqVar = kplVar.f;
            kpdVar2 = kplVar.e;
            try {
                aooc.af(obj2);
                obj = ((aoiw) obj2).a;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                this.e.d();
                rlv rlvVar = this.d;
                int iBd = mni.bd(kpdVar2);
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
                vquVarJ = akky.J(amrp.a.m());
                vquVarJ.ao(iBd);
                vquVarJ.al(jElapsedRealtime);
                if (aoiw.d(obj)) {
                    vquVarJ.aj(defpackage.kqz.UNSET_ERROR);
                    vquVarJ.ak(((java.util.List) obj).size());
                }
                thC = aoiw.c(obj);
                if (thC != null) {
                    kpkVar = thC instanceof defpackage.kpk ? (defpackage.kpk) thC : null;
                    if (kpkVar != null || (kqzVar = kpkVar.a) == null) {
                        kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                    }
                    vquVarJ.aj(kqzVar);
                }
                rlvVar.u(vquVarJ.ai());
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        aooc.af(obj2);
        if (!this.e.c()) {
            return aooc.ae(new defpackage.kpk(defpackage.kqz.BUSY, null, null));
        }
        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        try {
            if (!ahvr.R(kplVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(210, "AiCoreCallNotesExtractor_generateCallActions");
            try {
                j$.time.ZonedDateTime zonedDateTimeN = defpackage.hgz.N(kpdVar);
                defpackage.kra kraVarA = this.f.a(kpdVar);
                kplVar.e = kpdVar;
                kplVar.f = ahoqVarZ;
                kplVar.a = jElapsedRealtime2;
                kplVar.d = 1;
                java.lang.Object objC = c(zonedDateTimeN, kraVarA, kplVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                kpdVar2 = kpdVar;
                ahoqVar = ahoqVarZ;
                obj = objC;
                j = jElapsedRealtime2;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                this.e.d();
                rlv rlvVar2 = this.d;
                int iBd2 = mni.bd(kpdVar2);
                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - j;
                vquVarJ = akky.J(amrp.a.m());
                vquVarJ.ao(iBd2);
                vquVarJ.al(jElapsedRealtime3);
                if (aoiw.d(obj)) {
                    vquVarJ.aj(defpackage.kqz.UNSET_ERROR);
                    vquVarJ.ak(((java.util.List) obj).size());
                }
                thC = aoiw.c(obj);
                if (thC != null) {
                    if (thC instanceof defpackage.kpk) {
                    }
                    if (kpkVar != null) {
                        kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                    } else {
                        kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                    }
                    vquVarJ.aj(kqzVar);
                }
                rlvVar2.u(vquVarJ.ai());
                return obj;
            } catch (java.lang.Throwable th4) {
                th = th4;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            this.e.d();
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kpe
    public final java.lang.Object b(defpackage.kpd kpdVar, aoln aolnVar) {
        defpackage.kpo kpoVar;
        java.lang.Object objE;
        long j;
        defpackage.kqz kqzVar;
        if (aolnVar instanceof defpackage.kpo) {
            kpoVar = (defpackage.kpo) aolnVar;
            int i = kpoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpoVar.d = i - Integer.MIN_VALUE;
            } else {
                kpoVar = new defpackage.kpo(this, aolnVar);
            }
        } else {
            kpoVar = new defpackage.kpo(this, aolnVar);
        }
        java.lang.Object obj = kpoVar.b;
        aolu aoluVar = aolu.a;
        int i2 = kpoVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (!this.e.c()) {
                    return aooc.ae(new defpackage.kpk(defpackage.kqz.BUSY, null, null));
                }
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                kpoVar.e = kpdVar;
                kpoVar.a = jElapsedRealtime;
                kpoVar.d = 1;
                objE = e(kpdVar, kpoVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                j = jElapsedRealtime;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = kpoVar.a;
                kpdVar = kpoVar.e;
                aooc.af(obj);
                objE = ((aoiw) obj).a;
            }
            this.e.d();
            this = this.d;
            int iBd = mni.bd(kpdVar);
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j;
            vqu vquVarJ = akky.J(amrp.a.m());
            vquVarJ.ao(iBd);
            vquVarJ.al(jElapsedRealtime2);
            if (aoiw.d(objE)) {
                defpackage.kpc kpcVar = (defpackage.kpc) objE;
                vquVarJ.an(kpcVar.a.length());
                defpackage.kqy kqyVar = kpcVar.b;
                if (kqyVar != null) {
                    defpackage.kqz kqzVarB = defpackage.kqz.b(kqyVar.d);
                    if (kqzVarB == null) {
                        kqzVarB = defpackage.kqz.UNSET_ERROR;
                    }
                    vquVarJ.aj(kqzVarB);
                    vquVarJ.ak(kqyVar.c.size());
                }
            }
            java.lang.Throwable thC = aoiw.c(objE);
            if (thC != null) {
                defpackage.kpk kpkVar = thC instanceof defpackage.kpk ? (defpackage.kpk) thC : null;
                if (kpkVar == null || (kqzVar = kpkVar.a) == null) {
                    kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                }
                vquVarJ.am(kqzVar);
            }
            this.u(vquVarJ.ai());
            return objE;
        } catch (java.lang.Throwable th) {
            this.e.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(j$.time.ZonedDateTime zonedDateTime, defpackage.kra kraVar, aoln aolnVar) {
        defpackage.kpm kpmVar;
        if (aolnVar instanceof defpackage.kpm) {
            kpmVar = (defpackage.kpm) aolnVar;
            int i = kpmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpmVar.c = i - Integer.MIN_VALUE;
            } else {
                kpmVar = new defpackage.kpm(this, aolnVar);
            }
        } else {
            kpmVar = new defpackage.kpm(this, aolnVar);
        }
        java.lang.Object obj = kpmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kpmVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return ((aoiw) obj).a;
        }
        aooc.af(obj);
        aooh.f(kraVar, "<this>");
        if (kraVar.e < 15) {
            return aokc.a;
        }
        defpackage.kqj kqjVar = this.c;
        java.lang.String str = kraVar.c;
        aooh.e(str, "getTextTranscript(...)");
        kpmVar.c = 1;
        java.lang.Object objB = kqjVar.b(str, zonedDateTime, kpmVar);
        return objB != aoluVar ? objB : aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object d(defpackage.kra kraVar, aoln aolnVar) {
        defpackage.kpn kpnVar;
        java.lang.String str;
        java.lang.Object objE;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.Throwable thC;
        defpackage.kpk kpkVar;
        defpackage.kqz kqzVar;
        if (aolnVar instanceof defpackage.kpn) {
            kpnVar = (defpackage.kpn) aolnVar;
            int i = kpnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpnVar.c = i - Integer.MIN_VALUE;
            } else {
                kpnVar = new defpackage.kpn(this, aolnVar);
            }
        } else {
            kpnVar = new defpackage.kpn(this, aolnVar);
        }
        java.lang.Object obj2 = kpnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kpnVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj2);
                objE = ((aoiw) obj2).a;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str3 = kpnVar.d;
                aooc.af(obj2);
                obj = ((aoiw) obj2).a;
                str2 = str3;
            }
            thC = aoiw.c(obj);
            if (thC == null) {
                if (((defpackage.krc) obj).c) {
                    return str2;
                }
                return aooc.ae(new defpackage.kpk(defpackage.kqz.RESPONSE_SAFETY_FAILURE, null, null));
            }
            if (thC instanceof defpackage.kpk) {
                kpkVar = (defpackage.kpk) thC;
            } else {
                kpkVar = null;
            }
            if (kpkVar != null) {
                kqzVar = kpkVar.a;
            } else {
                kqzVar = null;
            }
            return kqzVar == defpackage.kqz.REQUEST_SAFETY_FAILURE ? aooc.ae(new defpackage.kpk(defpackage.kqz.RESPONSE_SAFETY_FAILURE, "Summary fails aicore safety check before safety verdict", null)) : aooc.ae(thC);
        }
        aooc.af(obj2);
        aooh.f(kraVar, "<this>");
        int i3 = kraVar.e;
        java.lang.String str4 = i3 == 0 ? "No content to summarize." : i3 < 40 ? "The call was too short to summarize." : null;
        if (str4 != null) {
            return str4;
        }
        defpackage.kqj kqjVar = this.c;
        aooh.f(kraVar, "<this>");
        java.lang.String str5 = kraVar.c;
        aooh.e(str5, "getTextTranscript(...)");
        if (str5.length() == 0) {
            str = "";
        } else {
            java.lang.String str6 = kraVar.f;
            aooh.e(str6, "getCallDirectionHeader(...)");
            if (str6.length() > 0) {
                str = kraVar.f + '\n' + kraVar.c;
            } else {
                str = kraVar.c;
                aooh.c(str);
            }
        }
        kpnVar.c = 1;
        objE = kqjVar.e(str, kpnVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        java.lang.Throwable thC2 = aoiw.c(objE);
        if (thC2 != null) {
            return aooc.ae(thC2);
        }
        java.lang.String str7 = (java.lang.String) objE;
        aorg aorgVar = b;
        if (aorgVar.e(str7)) {
            a.d().l("com/android/dialer/callnotesinfra/summarizer/aicore/AiCoreCallNotesExtractor", "formatSummaryText", 166, "AiCoreCallNotesExtractor.kt").v("Summary text contains unexpected leading colon.");
        }
        aooh.f(str7, "input");
        java.lang.String strReplaceFirst = aorgVar.a.matcher(str7).replaceFirst("");
        aooh.e(strReplaceFirst, "replaceFirst(...)");
        java.util.List listS = aoov.S(strReplaceFirst, new java.lang.String[]{"*"}, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listS, 10));
        java.util.Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(aoov.x((java.lang.String) it.next()).toString());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (((java.lang.String) obj3).length() > 0) {
                arrayList2.add(obj3);
            }
        }
        java.lang.String strCr = ajsz.cr(ajsz.bQ(arrayList2), " \n• ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
        defpackage.kqj kqjVar2 = this.c;
        kpnVar.d = strCr;
        kpnVar.c = 2;
        java.lang.Object objD = kqjVar2.d(strCr, kpnVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        str2 = strCr;
        obj = objD;
        thC = aoiw.c(obj);
        if (thC == null) {
            if (((defpackage.krc) obj).c) {
                return aooc.ae(new defpackage.kpk(defpackage.kqz.RESPONSE_SAFETY_FAILURE, null, null));
            }
            return str2;
        }
        if (thC instanceof defpackage.kpk) {
            kpkVar = (defpackage.kpk) thC;
        } else {
            kpkVar = null;
        }
        if (kpkVar != null) {
            kqzVar = kpkVar.a;
        } else {
            kqzVar = null;
        }
        if (kqzVar == defpackage.kqz.REQUEST_SAFETY_FAILURE) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #4 {all -> 0x013d, blocks: (B:28:0x0098, B:30:0x009e, B:53:0x0134), top: B:75:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0039, B:33:0x00b6, B:35:0x00bc, B:45:0x010d, B:49:0x011b, B:36:0x00d3, B:38:0x00e1, B:41:0x00e7, B:44:0x00ed, B:43:0x00eb), top: B:69:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0039, B:33:0x00b6, B:35:0x00bc, B:45:0x010d, B:49:0x011b, B:36:0x00d3, B:38:0x00e1, B:41:0x00e7, B:44:0x00ed, B:43:0x00eb), top: B:69:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0039, B:33:0x00b6, B:35:0x00bc, B:45:0x010d, B:49:0x011b, B:36:0x00d3, B:38:0x00e1, B:41:0x00e7, B:44:0x00ed, B:43:0x00eb), top: B:69:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0039, B:33:0x00b6, B:35:0x00bc, B:45:0x010d, B:49:0x011b, B:36:0x00d3, B:38:0x00e1, B:41:0x00e7, B:44:0x00ed, B:43:0x00eb), top: B:69:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0039, B:33:0x00b6, B:35:0x00bc, B:45:0x010d, B:49:0x011b, B:36:0x00d3, B:38:0x00e1, B:41:0x00e7, B:44:0x00ed, B:43:0x00eb), top: B:69:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134 A[Catch: all -> 0x013d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x013d, blocks: (B:28:0x0098, B:30:0x009e, B:53:0x0134), top: B:75:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object e(defpackage.kpd kpdVar, aoln aolnVar) {
        defpackage.kpp kppVar;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        defpackage.kra kraVarA;
        java.io.Closeable closeable2;
        java.lang.Object obj;
        java.lang.Throwable thC;
        java.lang.String str;
        java.lang.Object objC;
        java.lang.String str2;
        defpackage.kra kraVar;
        java.lang.Object obj2;
        java.lang.Throwable thC2;
        defpackage.kpk kpkVar;
        defpackage.kqz kqzVar;
        defpackage.kqy kqyVarY;
        int iAQ;
        int i;
        defpackage.kpd kpdVar2 = kpdVar;
        if (aolnVar instanceof defpackage.kpp) {
            kppVar = (defpackage.kpp) aolnVar;
            int i2 = kppVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kppVar.f = i2 - Integer.MIN_VALUE;
            } else {
                kppVar = new defpackage.kpp(this, aolnVar);
            }
        } else {
            kppVar = new defpackage.kpp(this, aolnVar);
        }
        java.lang.Object obj3 = kppVar.d;
        java.lang.Object objAe = aolu.a;
        int i3 = kppVar.f;
        if (i3 == 0) {
            aooc.af(obj3);
            if (!ahvr.R(kppVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            java.io.Closeable closeableZ = ahvr.Z(211, "AiCoreCallNotesExtractor_requestSummary");
            try {
                kraVarA = this.f.a(kpdVar2);
                kppVar.a = kpdVar2;
                kppVar.b = closeableZ;
                kppVar.c = kraVarA;
                kppVar.f = 1;
                java.lang.Object objD = d(kraVarA, kppVar);
                if (objD != objAe) {
                    closeable2 = closeableZ;
                    obj = objD;
                    thC = aoiw.c(obj);
                    if (thC == null) {
                        str = (java.lang.String) obj;
                        j$.time.ZonedDateTime zonedDateTimeN = defpackage.hgz.N(kpdVar2);
                        kppVar.a = closeable2;
                        kppVar.b = kraVarA;
                        kppVar.c = str;
                        kppVar.f = 2;
                        objC = c(zonedDateTimeN, kraVarA, kppVar);
                        if (objC != objAe) {
                            str2 = str;
                            kraVar = kraVarA;
                            closeable = closeable2;
                            obj2 = objC;
                            thC2 = aoiw.c(obj2);
                            if (thC2 == null) {
                                defpackage.oq oqVarY = defpackage.hgz.Y(defpackage.kqy.a.m());
                                oqVarY.A();
                                oqVarY.z((java.util.List) obj2);
                                kqyVarY = oqVarY.y();
                            } else {
                                defpackage.oq oqVarY2 = defpackage.hgz.Y(defpackage.kqy.a.m());
                                if (thC2 instanceof defpackage.kpk) {
                                    kpkVar = (defpackage.kpk) thC2;
                                } else {
                                    kpkVar = null;
                                }
                                if (kpkVar != null) {
                                    kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                                } else {
                                    kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                                }
                                aooh.f(kqzVar, "value");
                                java.lang.Object obj4 = oqVarY2.a;
                                ((akzx) obj4).u();
                                defpackage.kqy kqyVar = (defpackage.kqy) ((akzx) obj4).b;
                                kqyVar.d = kqzVar.p;
                                kqyVar.b |= 1;
                                kqyVarY = oqVarY2.y();
                            }
                            defpackage.kqy kqyVar2 = kqyVarY;
                            iAQ = a.aQ(kraVar.d);
                            if (iAQ == 0) {
                                i = 1;
                            } else {
                                i = iAQ;
                            }
                            objAe = new defpackage.kpc(str2, i, kqyVar2, 0, 0, defpackage.hgu.I(defpackage.kov.a.m()).v());
                            closeable2 = closeable;
                            ajsz.ak(closeable2, (java.lang.Throwable) null);
                        }
                    } else {
                        objAe = aooc.ae(thC);
                        ajsz.ak(closeable2, (java.lang.Throwable) null);
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeable = closeableZ;
                throw th;
            }
        } else if (i3 == 1) {
            defpackage.kra kraVar2 = (defpackage.kra) kppVar.c;
            java.io.Closeable closeable3 = (java.io.Closeable) kppVar.b;
            defpackage.kpd kpdVar3 = (defpackage.kpd) kppVar.a;
            try {
                aooc.af(obj3);
                obj = ((aoiw) obj3).a;
                kraVarA = kraVar2;
                kpdVar2 = kpdVar3;
                closeable2 = closeable3;
                try {
                    thC = aoiw.c(obj);
                    if (thC == null) {
                        str = (java.lang.String) obj;
                        j$.time.ZonedDateTime zonedDateTimeN2 = defpackage.hgz.N(kpdVar2);
                        kppVar.a = closeable2;
                        kppVar.b = kraVarA;
                        kppVar.c = str;
                        kppVar.f = 2;
                        objC = c(zonedDateTimeN2, kraVarA, kppVar);
                        if (objC != objAe) {
                            str2 = str;
                            kraVar = kraVarA;
                            closeable = closeable2;
                            obj2 = objC;
                            thC2 = aoiw.c(obj2);
                            if (thC2 == null) {
                                defpackage.oq oqVarY3 = defpackage.hgz.Y(defpackage.kqy.a.m());
                                oqVarY3.A();
                                oqVarY3.z((java.util.List) obj2);
                                kqyVarY = oqVarY3.y();
                            } else {
                                defpackage.oq oqVarY4 = defpackage.hgz.Y(defpackage.kqy.a.m());
                                if (thC2 instanceof defpackage.kpk) {
                                    kpkVar = (defpackage.kpk) thC2;
                                } else {
                                    kpkVar = null;
                                }
                                if (kpkVar != null) {
                                    kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                                } else {
                                    kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                                }
                                aooh.f(kqzVar, "value");
                                java.lang.Object obj5 = oqVarY4.a;
                                ((akzx) obj5).u();
                                defpackage.kqy kqyVar3 = (defpackage.kqy) ((akzx) obj5).b;
                                kqyVar3.d = kqzVar.p;
                                kqyVar3.b |= 1;
                                kqyVarY = oqVarY4.y();
                            }
                            defpackage.kqy kqyVar4 = kqyVarY;
                            iAQ = a.aQ(kraVar.d);
                            if (iAQ == 0) {
                                i = 1;
                            } else {
                                i = iAQ;
                            }
                            objAe = new defpackage.kpc(str2, i, kqyVar4, 0, 0, defpackage.hgu.I(defpackage.kov.a.m()).v());
                            closeable2 = closeable;
                            ajsz.ak(closeable2, (java.lang.Throwable) null);
                        }
                    } else {
                        objAe = aooc.ae(thC);
                        ajsz.ak(closeable2, (java.lang.Throwable) null);
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    closeable = closeable2;
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                closeable = closeable3;
                throw th;
            }
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str3 = (java.lang.String) kppVar.c;
            kraVar = (defpackage.kra) kppVar.b;
            closeable = (java.io.Closeable) kppVar.a;
            try {
                aooc.af(obj3);
                obj2 = ((aoiw) obj3).a;
                str2 = str3;
                thC2 = aoiw.c(obj2);
                if (thC2 == null) {
                    defpackage.oq oqVarY5 = defpackage.hgz.Y(defpackage.kqy.a.m());
                    oqVarY5.A();
                    oqVarY5.z((java.util.List) obj2);
                    kqyVarY = oqVarY5.y();
                } else {
                    defpackage.oq oqVarY6 = defpackage.hgz.Y(defpackage.kqy.a.m());
                    if (thC2 instanceof defpackage.kpk) {
                        kpkVar = (defpackage.kpk) thC2;
                    } else {
                        kpkVar = null;
                    }
                    if (kpkVar != null || (kqzVar = kpkVar.a) == null) {
                        kqzVar = defpackage.kqz.GENERAL_UNEXPECTED_FAILURE;
                    }
                    aooh.f(kqzVar, "value");
                    java.lang.Object obj6 = oqVarY6.a;
                    ((akzx) obj6).u();
                    defpackage.kqy kqyVar5 = (defpackage.kqy) ((akzx) obj6).b;
                    kqyVar5.d = kqzVar.p;
                    kqyVar5.b |= 1;
                    kqyVarY = oqVarY6.y();
                }
                defpackage.kqy kqyVar6 = kqyVarY;
                iAQ = a.aQ(kraVar.d);
                if (iAQ == 0) {
                    i = 1;
                } else {
                    i = iAQ;
                }
                objAe = new defpackage.kpc(str2, i, kqyVar6, 0, 0, defpackage.hgu.I(defpackage.kov.a.m()).v());
                closeable2 = closeable;
                ajsz.ak(closeable2, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th5) {
                th = th5;
                try {
                    throw th;
                } catch (java.lang.Throwable th6) {
                    ajsz.ak(closeable, th);
                    throw th6;
                }
            }
        }
        return objAe;
    }
}
