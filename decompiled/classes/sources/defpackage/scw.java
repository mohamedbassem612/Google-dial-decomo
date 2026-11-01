package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class scw {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/impl/security/PatrickSecurityService");
    public final defpackage.okj b;
    public final android.content.Context c;
    public final defpackage.sbw d;
    public final defpackage.ipc e;
    public final defpackage.ipc f;
    private final defpackage.zrw g;
    private final defpackage.aolr h;
    private final defpackage.ajct i;
    private final defpackage.ojo j;
    private final defpackage.zjs k;
    private final defpackage.ahbv l;
    private final defpackage.zzx m;

    public scw(defpackage.zrw zrwVar, defpackage.aolr aolrVar, defpackage.zzx zzxVar, defpackage.okj okjVar, android.content.Context context, defpackage.ipc ipcVar, defpackage.ajct ajctVar, defpackage.ojo ojoVar, defpackage.zjs zjsVar, defpackage.aazc aazcVar, defpackage.rlv rlvVar, defpackage.sbw sbwVar, defpackage.ipc ipcVar2, defpackage.ahbv ahbvVar, defpackage.aais aaisVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (zjsVar == null) {
            defpackage.aooh.i("dialerTelecom");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (ahbvVar == null) {
            defpackage.aooh.i("dialerPhoneNumbers");
        }
        if (aaisVar == null) {
            defpackage.aooh.i("sanitizer");
        }
        this.g = zrwVar;
        this.h = aolrVar;
        this.m = zzxVar;
        this.b = okjVar;
        this.c = context;
        this.e = ipcVar;
        this.i = ajctVar;
        this.j = ojoVar;
        this.k = zjsVar;
        this.d = sbwVar;
        this.f = ipcVar2;
        this.l = ahbvVar;
    }

    public final java.lang.Object a(boolean z, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.h, new scp(z, this, (defpackage.aoln) null), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new scq(this, (defpackage.aoln) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        scr scrVar;
        defpackage.rsr rsrVar;
        defpackage.ojo ojoVar;
        if (aolnVar instanceof scr) {
            scrVar = (scr) aolnVar;
            int i = scrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrVar.c = i - Integer.MIN_VALUE;
            } else {
                scrVar = new scr(this, aolnVar);
            }
        } else {
            scrVar = new scr(this, aolnVar);
        }
        java.lang.Object objJ = scrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = scrVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objJ);
            } else if (i2 == 2) {
                defpackage.ojo ojoVar2 = scrVar.d;
                defpackage.rsr rsrVar2 = scrVar.e;
                defpackage.aooc.af(objJ);
                ojoVar = ojoVar2;
                rsrVar = rsrVar2;
                defpackage.ajck ajckVarH = ojoVar.d((android.net.Uri) objJ, new java.lang.String[]{"date"}, (java.lang.String) rsrVar.b, (java.lang.String[]) rsrVar.a, null).c(defpackage.ahqx.e(new defpackage.kwb(6)), this.i).h();
                defpackage.aooh.e(ajckVarH, "finishToFuture(...)");
                scrVar.e = null;
                scrVar.d = null;
                scrVar.c = 3;
                objJ = defpackage.aosv.D(ajckVarH, scrVar);
                if (objJ == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objJ);
            }
            defpackage.aooh.e(objJ, "await(...)");
            return objJ;
        }
        defpackage.aooc.af(objJ);
        defpackage.zrw zrwVar = this.g;
        scrVar.c = 1;
        objJ = zrwVar.j(scrVar);
        if (objJ == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objJ).booleanValue()) {
            ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/security/PatrickSecurityService", "hasCallInPast24Hours", 375, "PatrickSecurityService.kt")).v("Missing call log read permissions.");
            return java.lang.Boolean.FALSE;
        }
        defpackage.rsr rsrVar3 = new defpackage.rsr();
        defpackage.kaw kawVar = new defpackage.kaw("date");
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        long j = defpackage.aorh.a;
        rsrVar3.aC(kawVar.aI(">", new java.lang.Long(epochMilli - defpackage.aorh.g(defpackage.aooh.A(1, defpackage.aorj.DAYS)))));
        defpackage.rsr rsrVarAB = rsrVar3.aB();
        defpackage.ojo ojoVar3 = this.j;
        defpackage.zjs zjsVar = this.k;
        scrVar.e = rsrVarAB;
        scrVar.d = ojoVar3;
        scrVar.c = 2;
        java.lang.Object objN = zjsVar.n(scrVar);
        if (objN == aoluVar) {
            return aoluVar;
        }
        rsrVar = rsrVarAB;
        objJ = objN;
        ojoVar = ojoVar3;
        defpackage.ajck ajckVarH2 = ojoVar.d((android.net.Uri) objJ, new java.lang.String[]{"date"}, (java.lang.String) rsrVar.b, (java.lang.String[]) rsrVar.a, null).c(defpackage.ahqx.e(new defpackage.kwb(6)), this.i).h();
        defpackage.aooh.e(ajckVarH2, "finishToFuture(...)");
        scrVar.e = null;
        scrVar.d = null;
        scrVar.c = 3;
        objJ = defpackage.aosv.D(ajckVarH2, scrVar);
        if (objJ == aoluVar) {
            return aoluVar;
        }
        defpackage.aooh.e(objJ, "await(...)");
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:29:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b5 -> B:34:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(android.accounts.Account r9, java.util.Set r10, java.util.List r11, defpackage.aoln r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scw.d(android.accounts.Account, java.util.Set, java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(akoa akoaVar, sco scoVar, android.accounts.Account account, defpackage.aoln aolnVar) throws java.lang.Throwable {
        sct sctVar;
        java.lang.String str;
        java.lang.Object objG;
        java.lang.Object obj;
        java.lang.Object objD;
        akoa akoaVar2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        akob akobVar;
        int i;
        int i2;
        if (aolnVar instanceof sct) {
            sctVar = (sct) aolnVar;
            int i3 = sctVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sctVar.d = i3 - Integer.MIN_VALUE;
            } else {
                sctVar = new sct(this, aolnVar);
            }
        } else {
            sctVar = new sct(this, aolnVar);
        }
        java.lang.Object objB = sctVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i4 = sctVar.d;
        int i5 = 3;
        if (i4 != 0) {
            if (i4 == 1) {
                java.lang.String str5 = sctVar.g;
                java.lang.Object obj4 = sctVar.a;
                scoVar = sctVar.f;
                akoa akoaVar3 = sctVar.e;
                defpackage.aooc.af(objB);
                str = str5;
                akoaVar = akoaVar3;
                objG = objB;
                obj = obj4;
            } else if (i4 == 2) {
                java.lang.String str6 = sctVar.g;
                java.lang.Object obj5 = sctVar.a;
                sco scoVar2 = sctVar.f;
                akoa akoaVar4 = sctVar.e;
                defpackage.aooc.af(objB);
                str = str6;
                obj2 = obj5;
                scoVar = scoVar2;
                akoaVar2 = akoaVar4;
                objD = objB;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) a.b()).j(defpackage.zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/patrick/impl/security/PatrickSecurityService", "processNumberMatching", 277, "PatrickSecurityService.kt")).I("No matching between device (%s) and account number (%s)", defpackage.aais.aC(scoVar.a), defpackage.aais.aC(akoaVar2.b));
                    return scn.c;
                }
                defpackage.sbw sbwVar = this.d;
                java.lang.String str7 = akoaVar2.b;
                defpackage.aooh.e(str7, "getPhoneNumber(...)");
                sctVar.e = akoaVar2;
                sctVar.f = scoVar;
                sctVar.a = obj2;
                sctVar.g = null;
                sctVar.d = 3;
                objB = sbwVar.b(str7, str, sctVar);
                if (objB == aoluVar) {
                    obj3 = obj2;
                    return aoluVar;
                }
                obj3 = obj2;
                str2 = scoVar.c;
                str3 = (java.lang.String) objB;
                if (str2 == null) {
                    if (str3 == null) {
                        return scn.b;
                    }
                    str2 = str3;
                }
                str4 = ((android.accounts.Account) obj3).name;
                defpackage.aooh.e(str4, "name");
                akobVar = akoaVar2.c;
                if (akobVar == null) {
                    akobVar = akob.a;
                }
                i = akobVar.b;
                if (i == 0) {
                    i5 = 2;
                } else if (i != 1) {
                    if (i == 2) {
                        i5 = 4;
                    } else if (i != 3) {
                        i5 = 0;
                    } else {
                        i5 = 5;
                    }
                }
                if (i5 != 0) {
                }
                sctVar.e = null;
                sctVar.f = null;
                sctVar.a = null;
                sctVar.d = 4;
                if (h(str4, str2, i2, sctVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i4 == 3) {
                java.lang.Object obj6 = sctVar.a;
                scoVar = sctVar.f;
                akoaVar2 = sctVar.e;
                defpackage.aooc.af(objB);
                obj3 = obj6;
                obj3 = obj2;
                str2 = scoVar.c;
                str3 = (java.lang.String) objB;
                if (str2 == null) {
                    if (str3 == null) {
                        return scn.b;
                    }
                    str2 = str3;
                }
                str4 = ((android.accounts.Account) obj3).name;
                defpackage.aooh.e(str4, "name");
                akobVar = akoaVar2.c;
                if (akobVar == null) {
                    akobVar = akob.a;
                }
                i = akobVar.b;
                if (i == 0) {
                    i5 = 2;
                } else if (i != 1) {
                    if (i == 2) {
                        i5 = 4;
                    } else if (i != 3) {
                        i5 = 0;
                    } else {
                        i5 = 5;
                    }
                }
                i2 = i5 != 0 ? i5 : 1;
                sctVar.e = null;
                sctVar.f = null;
                sctVar.a = null;
                sctVar.d = 4;
                if (h(str4, str2, i2, sctVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            return scn.a;
        }
        defpackage.aooc.af(objB);
        str = scoVar.b;
        defpackage.sbw sbwVar2 = this.d;
        java.lang.String str8 = akoaVar.b;
        sctVar.e = akoaVar;
        sctVar.f = scoVar;
        sctVar.a = account;
        sctVar.g = str;
        sctVar.d = 1;
        objG = sbwVar2.g(str8, str, sctVar);
        if (objG == aoluVar) {
            obj = account;
            return aoluVar;
        }
        obj = account;
        defpackage.ajcq ajcqVarT = this.l.t((hkd) objG, scoVar.d);
        sctVar.e = akoaVar;
        sctVar.f = scoVar;
        sctVar.a = obj;
        sctVar.g = str;
        sctVar.d = 2;
        objD = defpackage.aosv.D(ajcqVarT, sctVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj7 = obj;
        akoaVar2 = akoaVar;
        obj2 = obj7;
        if (((java.lang.Boolean) objD).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).j(defpackage.zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/patrick/impl/security/PatrickSecurityService", "processNumberMatching", 277, "PatrickSecurityService.kt")).I("No matching between device (%s) and account number (%s)", defpackage.aais.aC(scoVar.a), defpackage.aais.aC(akoaVar2.b));
            return scn.c;
        }
        defpackage.sbw sbwVar3 = this.d;
        java.lang.String str9 = akoaVar2.b;
        defpackage.aooh.e(str9, "getPhoneNumber(...)");
        sctVar.e = akoaVar2;
        sctVar.f = scoVar;
        sctVar.a = obj2;
        sctVar.g = null;
        sctVar.d = 3;
        objB = sbwVar3.b(str9, str, sctVar);
        if (objB == aoluVar) {
            obj3 = obj2;
            return aoluVar;
        }
        obj3 = obj2;
        str2 = scoVar.c;
        str3 = (java.lang.String) objB;
        if (str2 == null) {
            if (str3 == null) {
                return scn.b;
            }
            str2 = str3;
        }
        str4 = ((android.accounts.Account) obj3).name;
        defpackage.aooh.e(str4, "name");
        akobVar = akoaVar2.c;
        if (akobVar == null) {
            akobVar = akob.a;
        }
        i = akobVar.b;
        if (i == 0) {
            i5 = 2;
        } else if (i != 1) {
            if (i == 2) {
                i5 = 4;
            } else if (i != 3) {
                i5 = 0;
            } else {
                i5 = 5;
            }
        }
        if (i5 != 0) {
        }
        sctVar.e = null;
        sctVar.f = null;
        sctVar.a = null;
        sctVar.d = 4;
        if (h(str4, str2, i2, sctVar) == aoluVar) {
            return aoluVar;
        }
        return scn.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:110:0x0317  */
    /* JADX WARN: Code duplicated, block: B:114:0x032d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0333  */
    /* JADX WARN: Code duplicated, block: B:120:0x0364  */
    /* JADX WARN: Code duplicated, block: B:121:0x0366  */
    /* JADX WARN: Code duplicated, block: B:123:0x036c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0376  */
    /* JADX WARN: Code duplicated, block: B:145:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[LOOP:1: B:124:0x0370->B:149:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[LOOP:2: B:100:0x02d0->B:152:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01db  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x0217  */
    /* JADX WARN: Code duplicated, block: B:68:0x0224 A[LOOP:0: B:59:0x01e9->B:68:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r19v0, types: [scw] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0217 -> B:66:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0227 -> B:67:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02b6 -> B:41:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:68:0x0224
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(android.accounts.Account[] r20, java.util.Set r21, defpackage.aoln r22) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scw.f(android.accounts.Account[], java.util.Set, aoln):java.lang.Object");
    }

    public final java.lang.Object g(int i, defpackage.aoln aolnVar) {
        defpackage.akzx akzxVarM = defpackage.sdc.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.sdc sdcVar = (defpackage.sdc) akzxVarM.b;
        sdcVar.c = defpackage.a.V(i);
        sdcVar.b |= 1;
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        java.lang.Object objAK = this.f.aK((defpackage.sdc) aladVarR, aolnVar);
        return objAK != defpackage.aolu.a ? defpackage.aojh.a : objAK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(java.lang.String str, java.lang.String str2, int i, defpackage.aoln aolnVar) {
        scv scvVar;
        scx scxVar;
        if (aolnVar instanceof scv) {
            scvVar = (scv) aolnVar;
            int i2 = scvVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scvVar.c = i2 - Integer.MIN_VALUE;
            } else {
                scvVar = new scv(this, aolnVar);
            }
        } else {
            scvVar = new scv(this, aolnVar);
        }
        java.lang.Object objAH = scvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = scvVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objAH);
            ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/security/PatrickSecurityService", "storeDeviceNumberVerification", 298, "PatrickSecurityService.kt")).v("Storing device number verification.");
            defpackage.ipc ipcVar = this.e;
            defpackage.anqt anqtVar = defpackage.anqt.OK;
            int i4 = i - 2;
            if (i == 0) {
                throw null;
            }
            if (i4 == -1 || i4 == 0) {
                scxVar = scx.a;
            } else if (i4 == 1) {
                scxVar = scx.b;
            } else if (i4 == 2) {
                scxVar = scx.c;
            } else {
                if (i4 != 3) {
                    throw new defpackage.aois();
                }
                scxVar = scx.d;
            }
            scvVar.c = 1;
            objAH = ipcVar.aH(str, str2, scxVar, scvVar);
            if (objAH == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAH);
        }
        if (!((java.lang.Boolean) objAH).booleanValue()) {
            ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/security/PatrickSecurityService", "storeDeviceNumberVerification", 306, "PatrickSecurityService.kt")).v("Failed to store device number verification.");
        }
        return defpackage.aojh.a;
    }
}
