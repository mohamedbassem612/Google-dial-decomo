package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vie {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;

    public vie(defpackage.vid vidVar, java.util.Map map) {
        this.a = vidVar.b;
        this.b = vidVar.c;
        this.c = (java.lang.String) j$.util.Map.-EL.getOrDefault(map, "realm", "");
        this.d = (java.lang.String) map.get("nonce");
        byte[] bArr = new byte[8];
        new java.security.SecureRandom().nextBytes(bArr);
        this.f = android.util.Base64.encodeToString(bArr, 2);
        this.e = "00000001";
        this.h = "auth";
        this.g = "imap/".concat(java.lang.String.valueOf(vidVar.e));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object a(aoln aolnVar) {
        return aoov.aj((aolr) this.h, new defpackage.txf(this, (aoln) null, 13), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:42:0x013d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, aoln aolnVar) {
        defpackage.ugh ughVar;
        java.lang.String str2;
        java.lang.String numberToE164;
        defpackage.uzx uzxVarY;
        java.lang.String str3;
        defpackage.uzx uzxVar;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        defpackage.uzx uzxVar2;
        java.lang.String str7;
        defpackage.uzx uzxVar3;
        defpackage.uzx uzxVar4;
        defpackage.uzx uzxVar5;
        defpackage.uzx uzxVar6;
        defpackage.uzx uzxVar7;
        java.lang.String str8;
        java.lang.String str9;
        if (aolnVar instanceof defpackage.ugh) {
            ughVar = (defpackage.ugh) aolnVar;
            int i = ughVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ughVar.b = i - Integer.MIN_VALUE;
            } else {
                ughVar = new defpackage.ugh(this, aolnVar);
            }
        } else {
            ughVar = new defpackage.ugh(this, aolnVar);
        }
        java.lang.Object objB = ughVar.a;
        aolu aoluVar = aolu.a;
        switch (ughVar.b) {
            case 0:
                aooc.af(objB);
                java.lang.Object obj = this.g;
                ughVar.c = str;
                ughVar.d = str;
                ughVar.b = 1;
                objB = ((rsr) obj).b(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(str, (java.lang.String) objB);
                uzxVarY = airh.y(aixo.a.m());
                java.lang.Object obj2 = this.e;
                ughVar.c = str2;
                ughVar.d = numberToE164;
                ughVar.f = uzxVarY;
                ughVar.g = uzxVarY;
                ughVar.b = 2;
                objB = ((oko) obj2).I(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                uzxVar = uzxVarY;
                str4 = (java.lang.String) objB;
                if (str4 != null) {
                    uzxVarY.au(str4);
                }
                java.lang.Object obj3 = this.e;
                ughVar.c = str3;
                ughVar.d = numberToE164;
                ughVar.f = uzxVar;
                ughVar.g = uzxVarY;
                ughVar.b = 3;
                objB = ((oko) obj3).G(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str5 = str3;
                str6 = numberToE164;
                uzxVar2 = uzxVar;
                str7 = (java.lang.String) objB;
                if (str7 != null) {
                    uzxVarY.aq(str7);
                }
                java.lang.Object obj4 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVarY;
                ughVar.h = uzxVarY;
                ughVar.b = 4;
                objB = ((defpackage.vaa) obj4).r(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar3 = uzxVarY;
                uzxVarY.al(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                java.lang.Object obj5 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 5;
                objB = ((defpackage.vaa) obj5).s(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                uzxVar4 = uzxVar3;
                uzxVar4.am(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                uzxVar3.aw();
                java.lang.Object obj6 = this.f;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 6;
                objB = ((defpackage.zde) obj6).a(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar5 = uzxVar3;
                uzxVar6 = uzxVar5;
                uzxVar7 = uzxVar2;
                str8 = str6;
                str9 = str5;
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null && str8.length() != 0) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            case 1:
                str = ughVar.d;
                str2 = ughVar.c;
                aooc.af(objB);
                numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(str, (java.lang.String) objB);
                uzxVarY = airh.y(aixo.a.m());
                java.lang.Object obj7 = this.e;
                ughVar.c = str2;
                ughVar.d = numberToE164;
                ughVar.f = uzxVarY;
                ughVar.g = uzxVarY;
                ughVar.b = 2;
                objB = ((oko) obj7).I(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                uzxVar = uzxVarY;
                str4 = (java.lang.String) objB;
                if (str4 != null) {
                    uzxVarY.au(str4);
                }
                java.lang.Object obj8 = this.e;
                ughVar.c = str3;
                ughVar.d = numberToE164;
                ughVar.f = uzxVar;
                ughVar.g = uzxVarY;
                ughVar.b = 3;
                objB = ((oko) obj8).G(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str5 = str3;
                str6 = numberToE164;
                uzxVar2 = uzxVar;
                str7 = (java.lang.String) objB;
                if (str7 != null) {
                    uzxVarY.aq(str7);
                }
                java.lang.Object obj9 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVarY;
                ughVar.h = uzxVarY;
                ughVar.b = 4;
                objB = ((defpackage.vaa) obj9).r(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar3 = uzxVarY;
                uzxVarY.al(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                java.lang.Object obj10 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 5;
                objB = ((defpackage.vaa) obj10).s(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                uzxVar4 = uzxVar3;
                uzxVar4.am(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                uzxVar3.aw();
                java.lang.Object obj11 = this.f;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 6;
                objB = ((defpackage.zde) obj11).a(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar5 = uzxVar3;
                uzxVar6 = uzxVar5;
                uzxVar7 = uzxVar2;
                str8 = str6;
                str9 = str5;
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            case 2:
                uzxVarY = ughVar.g;
                uzxVar = ughVar.f;
                numberToE164 = ughVar.d;
                str3 = ughVar.c;
                aooc.af(objB);
                str4 = (java.lang.String) objB;
                if (str4 != null) {
                    uzxVarY.au(str4);
                }
                java.lang.Object obj12 = this.e;
                ughVar.c = str3;
                ughVar.d = numberToE164;
                ughVar.f = uzxVar;
                ughVar.g = uzxVarY;
                ughVar.b = 3;
                objB = ((oko) obj12).G(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str5 = str3;
                str6 = numberToE164;
                uzxVar2 = uzxVar;
                str7 = (java.lang.String) objB;
                if (str7 != null) {
                    uzxVarY.aq(str7);
                }
                java.lang.Object obj13 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVarY;
                ughVar.h = uzxVarY;
                ughVar.b = 4;
                objB = ((defpackage.vaa) obj13).r(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar3 = uzxVarY;
                uzxVarY.al(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                java.lang.Object obj14 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 5;
                objB = ((defpackage.vaa) obj14).s(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                uzxVar4 = uzxVar3;
                uzxVar4.am(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                uzxVar3.aw();
                java.lang.Object obj15 = this.f;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 6;
                objB = ((defpackage.zde) obj15).a(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar5 = uzxVar3;
                uzxVar6 = uzxVar5;
                uzxVar7 = uzxVar2;
                str8 = str6;
                str9 = str5;
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            case 3:
                uzxVarY = ughVar.g;
                uzxVar = ughVar.f;
                numberToE164 = ughVar.d;
                str3 = ughVar.c;
                aooc.af(objB);
                str5 = str3;
                str6 = numberToE164;
                uzxVar2 = uzxVar;
                str7 = (java.lang.String) objB;
                if (str7 != null) {
                    uzxVarY.aq(str7);
                }
                java.lang.Object obj16 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVarY;
                ughVar.h = uzxVarY;
                ughVar.b = 4;
                objB = ((defpackage.vaa) obj16).r(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar3 = uzxVarY;
                uzxVarY.al(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                java.lang.Object obj17 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 5;
                objB = ((defpackage.vaa) obj17).s(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                uzxVar4 = uzxVar3;
                uzxVar4.am(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                uzxVar3.aw();
                java.lang.Object obj18 = this.f;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 6;
                objB = ((defpackage.zde) obj18).a(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar5 = uzxVar3;
                uzxVar6 = uzxVar5;
                uzxVar7 = uzxVar2;
                str8 = str6;
                str9 = str5;
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                uzxVarY = ughVar.h;
                uzxVar3 = ughVar.g;
                uzxVar2 = ughVar.f;
                str6 = ughVar.d;
                str5 = ughVar.c;
                aooc.af(objB);
                uzxVarY.al(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                java.lang.Object obj19 = this.b;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 5;
                objB = ((defpackage.vaa) obj19).s(ughVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                uzxVar4 = uzxVar3;
                uzxVar4.am(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                uzxVar3.aw();
                java.lang.Object obj110 = this.f;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 6;
                objB = ((defpackage.zde) obj110).a(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar5 = uzxVar3;
                uzxVar6 = uzxVar5;
                uzxVar7 = uzxVar2;
                str8 = str6;
                str9 = str5;
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                uzxVar4 = ughVar.h;
                uzxVar3 = ughVar.g;
                uzxVar2 = ughVar.f;
                str6 = ughVar.d;
                str5 = ughVar.c;
                aooc.af(objB);
                uzxVar4.am(java.lang.String.valueOf(((java.lang.Number) objB).longValue()));
                uzxVar3.aw();
                java.lang.Object obj111 = this.f;
                ughVar.c = str5;
                ughVar.d = str6;
                ughVar.f = uzxVar2;
                ughVar.g = uzxVar3;
                ughVar.h = uzxVar3;
                ughVar.b = 6;
                objB = ((defpackage.zde) obj111).a(ughVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                uzxVar5 = uzxVar3;
                uzxVar6 = uzxVar5;
                uzxVar7 = uzxVar2;
                str8 = str6;
                str9 = str5;
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                uzxVar5 = ughVar.h;
                uzxVar6 = ughVar.g;
                uzxVar7 = ughVar.f;
                str8 = ughVar.d;
                str9 = ughVar.c;
                aooc.af(objB);
                uzxVar5.aj((java.lang.String) objB);
                if (str8 != null) {
                    str9 = str8;
                }
                uzxVar6.as(str9);
                uzxVar6.av(j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.HOURS).getEpochSecond());
                uzxVar6.ao(aixn.e);
                uzxVar6.ar(true);
                return uzxVar7.ah();
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public vie(android.content.Context context, defpackage.szs szsVar, defpackage.tcl tclVar, ipc ipcVar, lev levVar, defpackage.qbe qbeVar, defpackage.ovb ovbVar) {
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = context;
        this.d = szsVar;
        this.f = tclVar;
        this.c = ipcVar;
        this.g = levVar;
        this.a = qbeVar;
        this.b = ovbVar;
    }

    public vie(android.content.Context context, aolr aolrVar, aazc aazcVar, rsr rsrVar, uhs uhsVar, defpackage.vaa vaaVar, defpackage.zde zdeVar, zzx zzxVar, oko okoVar, rlv rlvVar) {
        aooh.f(context, "context");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aazcVar, "clock");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(rlvVar, "loggingBindings");
        this.h = aolrVar;
        this.g = rsrVar;
        this.a = uhsVar;
        this.b = vaaVar;
        this.f = zdeVar;
        this.d = zzxVar;
        this.e = okoVar;
        this.c = rlvVar;
    }
}
