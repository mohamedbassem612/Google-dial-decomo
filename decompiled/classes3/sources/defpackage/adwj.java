package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adwj implements defpackage.advw {
    public static final aiof a = aiof.i("GnpSdk");
    public final aoin b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final android.content.Context i;
    private final aoin j;
    private final aoin k;
    private final aoin l;
    private final aoin m;
    private final aolr n;

    public adwj(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, android.content.Context context, aoin aoinVar7, aoin aoinVar8, aoin aoinVar9, aoin aoinVar10, aoin aoinVar11, aolr aolrVar) {
        aooh.f(aoinVar, "androidPayloadsHelper");
        aooh.f(aoinVar2, "clearcutLogger");
        aooh.f(aoinVar3, "logEventFactory");
        aooh.f(aoinVar4, "clock");
        aooh.f(aoinVar5, "gnpEncryptionManager");
        aooh.f(aoinVar6, "gnpCompressionManager");
        aooh.f(context, "context");
        aooh.f(aoinVar7, "clientStreamz");
        aooh.f(aoinVar8, "gnpConfig");
        aooh.f(aoinVar9, "payloadExtractionListener");
        aooh.f(aoinVar10, "systemTrayPushHandler");
        aooh.f(aoinVar11, "inAppPushHandler");
        aooh.f(aolrVar, "blockingContext");
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
        this.h = aoinVar6;
        this.i = context;
        this.j = aoinVar7;
        this.k = aoinVar8;
        this.l = aoinVar9;
        this.b = aoinVar10;
        this.m = aoinVar11;
        this.n = aolrVar;
    }

    private final void i() {
        ahyn ahynVar = (ahyn) this.l.b;
        if (ahynVar.f()) {
            ((defpackage.advv) ahynVar.b()).a();
        }
    }

    private final byte[] j(byte[] bArr, boolean z, defpackage.advu advuVar) {
        adub adubVarA = ((defpackage.adxq) this.h.a()).a(bArr);
        if (adubVarA instanceof adub) {
            return (byte[]) adubVarA.a;
        }
        hgb.b(a.d(), "Payload decompression failed.", adubVarA.f());
        int i = true != z ? 62 : 61;
        adxm adxmVar = (adxm) this.d.a();
        defpackage.adxn adxnVarP = ((gat) this.e.a()).p(i);
        defpackage.akqc akqcVarB = advuVar.b();
        aooh.e(akqcVarB, "toLog(...)");
        adxnVarP.a(akqcVarB);
        adxmVar.a(adxnVarP);
        l(13);
        return null;
    }

    private static final defpackage.adwa k(defpackage.advu advuVar, boolean z) {
        byte[] bArrDecode;
        defpackage.aksh akshVarA;
        aiof aiofVar = defpackage.advz.a;
        java.lang.String str = advuVar.a;
        if (str == null) {
            akshVarA = null;
        } else {
            try {
                bArrDecode = android.util.Base64.decode(str, 1);
            } catch (java.lang.IllegalArgumentException e) {
                hgb.b(defpackage.advz.a.c(), "Failed to decode payload string into bytes.", e);
                bArrDecode = null;
            }
            akshVarA = defpackage.advz.a(bArrDecode);
        }
        if (akshVarA != null) {
            return new defpackage.adwa(akshVarA, true == z ? 3 : 1);
        }
        return null;
    }

    private final void l(int i) {
        java.lang.String str;
        aeey aeeyVar = (aeey) this.j.a();
        java.lang.String packageName = this.i.getPackageName();
        java.lang.String str2 = ((aduu) this.k.a()).a;
        int i2 = android.os.Build.VERSION.SDK_INT;
        switch (i) {
            case 1:
                str = "DELIVERED_FCM_PUSH";
                break;
            case 2:
                str = "DELIVERED";
                break;
            case 3:
                str = "DELIVERED_COUNTERFACTUAL";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "DELIVERED_SYNC_INSTRUCTION";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "DELIVERED_UPDATE_THREAD_STATE";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "DELIVERED_INSTRUCTION";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "LOCAL_NOTIFICATION_CREATED";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = "BAD_PAYLOAD";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                str = "RECIPIENT_NOT_FOUND";
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                str = "RECIPIENT_NOT_REGISTERED";
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                str = "RECIPIENT_INVALID_CREDENTIALS";
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                str = "DECRYPTION_FAILURE";
                break;
            default:
                str = "DECOMPRESSION_FAILURE";
                break;
        }
        ((afip) aeeyVar.e.eZ()).b(1L, new java.lang.Object[]{packageName, str2, java.lang.Integer.valueOf(i2), str});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.advd
    public final java.lang.Object a(android.content.Intent intent, defpackage.aduc aducVar, long j, aoln aolnVar) throws aois {
        java.lang.Object objB = b(defpackage.advu.a(intent), aducVar, j, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.advw
    public final java.lang.Object b(defpackage.advu advuVar, defpackage.aduc aducVar, long j, aoln aolnVar) throws aois {
        java.lang.Object objA;
        aoin aoinVar = this.d;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        adxm adxmVar = (adxm) aoinVar.a();
        defpackage.adxn adxnVarQ = ((gat) this.e.a()).q(34);
        defpackage.akqc akqcVarB = advuVar.b();
        aooh.e(akqcVarB, "toLog(...)");
        adxnVarQ.a(akqcVarB);
        ((defpackage.adxp) adxnVarQ).m = j;
        adxmVar.a(adxnVarQ);
        l(1);
        int i = advuVar.f;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                java.lang.Object objE = e(advuVar, aducVar, j, jElapsedRealtime, aolnVar);
                if (objE == aolu.a) {
                    return objE;
                }
            } else if (i2 == 2) {
                ahyn ahynVar = (ahyn) this.b.b;
                if (ahynVar.f() && (objA = ((defpackage.adtl) ahynVar.b()).a()) == aolu.a) {
                    return objA;
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(akzc akzcVar, boolean z, defpackage.advu advuVar, aoln aolnVar) {
        defpackage.adwc adwcVar;
        byte[] bArrJ;
        if (aolnVar instanceof defpackage.adwc) {
            adwcVar = (defpackage.adwc) aolnVar;
            int i = adwcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwcVar.d = i - Integer.MIN_VALUE;
            } else {
                adwcVar = new defpackage.adwc(this, aolnVar);
            }
        } else {
            adwcVar = new defpackage.adwc(this, aolnVar);
        }
        java.lang.Object objG = adwcVar.b;
        aolu aoluVar = aolu.a;
        int i2 = adwcVar.d;
        if (i2 == 0) {
            aooc.af(objG);
            akzcVar.D();
            adwcVar.e = advuVar;
            adwcVar.a = z;
            adwcVar.d = 1;
            objG = g(z, advuVar, adwcVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = adwcVar.a;
            advuVar = adwcVar.e;
            aooc.af(objG);
        }
        byte[] bArr = (byte[]) objG;
        if (bArr == null || (bArrJ = j(bArr, z, advuVar)) == null) {
            return null;
        }
        aiof aiofVar = defpackage.advz.a;
        return defpackage.advz.a(bArrJ);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.advu advuVar, aoln aolnVar) throws aois {
        defpackage.adwd adwdVar;
        defpackage.aksg aksgVar;
        int i;
        defpackage.aksg aksgVar2;
        defpackage.advu advuVar2;
        int i2;
        java.lang.String str;
        int i3;
        int i4;
        int iE;
        int i5;
        defpackage.adwa adwaVar;
        defpackage.aksh akshVar;
        akzc akzcVar;
        byte[] bArrJ;
        defpackage.aksh akshVarA;
        if (aolnVar instanceof defpackage.adwd) {
            adwdVar = (defpackage.adwd) aolnVar;
            int i6 = adwdVar.d;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                adwdVar.d = i6 - Integer.MIN_VALUE;
            } else {
                adwdVar = new defpackage.adwd(this, aolnVar);
            }
        } else {
            adwdVar = new defpackage.adwd(this, aolnVar);
        }
        java.lang.Object obj = adwdVar.b;
        aolu aoluVar = aolu.a;
        int i7 = adwdVar.d;
        if (i7 == 0) {
            aooc.af(obj);
            byte[] bArr = advuVar.b;
            if (bArr != null) {
                aiof aiofVar = defpackage.advz.a;
                try {
                    aksgVar = (defpackage.aksg) alad.B(defpackage.aksg.a, bArr, akzq.a());
                } catch (alaz e) {
                    hgb.b(defpackage.advz.a.c(), "Failed to parse AndroidFcmPayload proto.", e);
                    aksgVar = null;
                }
            } else {
                aksgVar = null;
            }
            if (aksgVar == null) {
                return k(advuVar, false);
            }
            boolean zC = aksgVar.d.C();
            i = !zC ? 1 : 0;
            if (!zC) {
                boolean z = (aklu.e(aksgVar.b) == 3 && ((str = advuVar.a) == null || str.length() == 0)) ? false : true;
                akzc akzcVar2 = aksgVar.d;
                aooh.e(akzcVar2, "getEncryptedPayload(...)");
                adwdVar.f = advuVar;
                adwdVar.e = aksgVar;
                adwdVar.a = 1;
                adwdVar.d = 1;
                java.lang.Object objC = c(akzcVar2, z, advuVar, adwdVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                aksgVar2 = aksgVar;
                obj = objC;
                advuVar2 = advuVar;
                i2 = i;
            }
            if (i != 0) {
                i3 = 3;
            } else {
                i3 = 1;
            }
            i4 = aksgVar.b;
            iE = aklu.e(i4);
            if (iE != 0) {
                throw null;
            }
            i5 = iE - 1;
            if (i5 != 0) {
                if (i4 == 1) {
                    akshVar = (defpackage.aksh) aksgVar.c;
                } else {
                    akshVar = defpackage.aksh.a;
                }
                aooh.e(akshVar, "getPayload(...)");
                adwaVar = new defpackage.adwa(akshVar, i3);
            } else {
                if (i5 != 1) {
                    if (i4 == 3) {
                        akzcVar = (akzc) aksgVar.c;
                    } else {
                        akzcVar = akzc.d;
                    }
                    aooh.e(akzcVar, "getCompressedPayload(...)");
                    bArrJ = j(akzcVar.D(), false, advuVar);
                    if (bArrJ != null) {
                        aiof aiofVar2 = defpackage.advz.a;
                        akshVarA = defpackage.advz.a(bArrJ);
                        if (akshVarA != null) {
                            return new defpackage.adwa(akshVarA, i3);
                        }
                    }
                    return null;
                }
                if (i5 == 2) {
                    throw new aois();
                }
                adwaVar = k(advuVar, 1 == i);
            }
            return adwaVar;
        }
        if (i7 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = adwdVar.a;
        aksgVar2 = adwdVar.e;
        advuVar2 = adwdVar.f;
        aooc.af(obj);
        defpackage.aksh akshVar2 = (defpackage.aksh) obj;
        if (akshVar2 != null) {
            return new defpackage.adwa(akshVar2, 2);
        }
        i = i2;
        advuVar = advuVar2;
        aksgVar = aksgVar2;
        if (i != 0) {
            i3 = 3;
        } else {
            i3 = 1;
        }
        i4 = aksgVar.b;
        iE = aklu.e(i4);
        if (iE != 0) {
            throw null;
        }
        i5 = iE - 1;
        if (i5 != 0) {
            if (i4 == 1) {
                akshVar = (defpackage.aksh) aksgVar.c;
            } else {
                akshVar = defpackage.aksh.a;
            }
            aooh.e(akshVar, "getPayload(...)");
            adwaVar = new defpackage.adwa(akshVar, i3);
        } else {
            if (i5 != 1) {
                if (i4 == 3) {
                    akzcVar = (akzc) aksgVar.c;
                } else {
                    akzcVar = akzc.d;
                }
                aooh.e(akzcVar, "getCompressedPayload(...)");
                bArrJ = j(akzcVar.D(), false, advuVar);
                if (bArrJ != null) {
                    aiof aiofVar3 = defpackage.advz.a;
                    akshVarA = defpackage.advz.a(bArrJ);
                    if (akshVarA != null) {
                        return new defpackage.adwa(akshVarA, i3);
                    }
                }
                return null;
            }
            if (i5 == 2) {
                throw new aois();
            }
            adwaVar = k(advuVar, 1 == i);
        }
        return adwaVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:101:0x033a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0352  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0133  */
    /* JADX WARN: Code duplicated, block: B:41:0x013f  */
    /* JADX WARN: Code duplicated, block: B:43:0x014b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0151  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x020e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0252  */
    /* JADX WARN: Code duplicated, block: B:73:0x026a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0297  */
    /* JADX WARN: Code duplicated, block: B:78:0x029a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x02af  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:92:0x02da  */
    /* JADX WARN: Code duplicated, block: B:95:0x031c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0330  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0160, code lost:
    
        if (r9.length() > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016c, code lost:
    
        if (r9.length() > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016e, code lost:
    
        r0 = ((gat) r29.e.a()).p(10);
        r5 = r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        r5 = aksx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        aooh.e(r5, "getNotificationThread(...)");
        r0.d(r5);
        r4 = r4.b();
        aooh.e(r4, "toLog(...)");
        r0.a(r4);
        r4 = defpackage.angl.c();
        r5 = r29.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0198, code lost:
    
        if (r4 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        r3 = (adxm) r5.a();
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a2, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
    
        r1 = defpackage.akth.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a6, code lost:
    
        r1 = r1.d;
        aooh.e(r1, "getRepresentativeTargetId(...)");
        aooh.f(r1, "representativeTargetId");
        ((defpackage.adxp) r0).n = r1;
        r3.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b9, code lost:
    
        r4 = (adxm) r5.a();
        r1 = r1.c;
        aooh.e(r1, "getRecipientOid(...)");
        aooh.f(r1, "recipientOid");
        ((defpackage.adxp) r0).h = r1;
        r4.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d1, code lost:
    
        l(9);
        i();
        defpackage.adwj.a.d().v("Recipient was not found on the device for this user targeted notification.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e8, code lost:
    
        return aojh.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.advu r30, defpackage.aduc r31, long r32, long r34, aoln r36) throws aois {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwj.e(advu, aduc, long, long, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.advu advuVar, aoln aolnVar) {
        defpackage.adwi adwiVar;
        if (aolnVar instanceof defpackage.adwi) {
            adwiVar = (defpackage.adwi) aolnVar;
            int i = adwiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwiVar.c = i - Integer.MIN_VALUE;
            } else {
                adwiVar = new defpackage.adwi(this, aolnVar);
            }
        } else {
            adwiVar = new defpackage.adwi(this, aolnVar);
        }
        java.lang.Object obj = adwiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwiVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (advuVar.d != null) {
                    ahyn ahynVar = (ahyn) this.g.b;
                    if (ahynVar.f()) {
                        defpackage.adyd adydVar = (defpackage.adyd) ahynVar.b();
                        adwiVar.c = 1;
                        if (adydVar.b() == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        a.c().v("Can't save key to invalidate because GnpEncryptionManager is missing.");
                    }
                }
                return aojh.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        } catch (java.lang.Exception e) {
            hgb.b(a.d(), "Failed to save the key to invalidate in shared preferences.", e);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(boolean z, defpackage.advu advuVar, aoln aolnVar) {
        defpackage.adwb adwbVar;
        int i;
        if (aolnVar instanceof defpackage.adwb) {
            adwbVar = (defpackage.adwb) aolnVar;
            int i2 = adwbVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adwbVar.d = i2 - Integer.MIN_VALUE;
            } else {
                adwbVar = new defpackage.adwb(this, aolnVar);
            }
        } else {
            adwbVar = new defpackage.adwb(this, aolnVar);
        }
        java.lang.Object objA = adwbVar.b;
        aolu aoluVar = aolu.a;
        int i3 = adwbVar.d;
        if (i3 == 0) {
            aooc.af(objA);
            ahyn ahynVar = (ahyn) this.g.b;
            if (ahynVar.f()) {
                defpackage.adyd adydVar = (defpackage.adyd) ahynVar.b();
                adwbVar.e = advuVar;
                adwbVar.a = z;
                adwbVar.d = 1;
                objA = adydVar.a();
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                a.c().v("Encrypted payload couldn't be decrypted since GnpEncryptionManager is not found.");
            }
            return null;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = adwbVar.a;
        advuVar = adwbVar.e;
        aooc.af(objA);
        adtv adtvVar = (adtz) objA;
        if (adtvVar instanceof adtv) {
            hgb.b(a.d(), "Failed to retrieve the decrypted data.", adtvVar.b());
        }
        byte[] bArr = (byte[]) adtvVar.d();
        ((afip) ((aeey) this.j.a()).f.eZ()).b(1L, new java.lang.Object[]{this.i.getPackageName(), ((aduu) this.k.a()).a, java.lang.Boolean.valueOf(bArr == null), java.lang.Boolean.valueOf(z), java.lang.Boolean.FALSE});
        if (bArr != null) {
            return bArr;
        }
        if (z) {
            i = 58;
        } else {
            l(12);
            i = 59;
        }
        adxm adxmVar = (adxm) this.d.a();
        defpackage.adxn adxnVarP = ((gat) this.e.a()).p(i);
        defpackage.akqc akqcVarB = advuVar.b();
        aooh.e(akqcVarB, "toLog(...)");
        adxnVarP.a(akqcVarB);
        adxmVar.a(adxnVarP);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aksh akshVar, aduy aduyVar, defpackage.advu advuVar, aoln aolnVar) {
        defpackage.adwh adwhVar;
        if (aolnVar instanceof defpackage.adwh) {
            adwhVar = (defpackage.adwh) aolnVar;
            int i = adwhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwhVar.c = i - Integer.MIN_VALUE;
            } else {
                adwhVar = new defpackage.adwh(this, aolnVar);
            }
        } else {
            adwhVar = new defpackage.adwh(this, aolnVar);
        }
        java.lang.Object obj = adwhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwhVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.aktl aktlVar = akshVar.f;
                if (aktlVar == null) {
                    aktlVar = defpackage.aktl.a;
                }
                defpackage.akte akteVarB = defpackage.akte.b(aktlVar.c);
                if (akteVarB == null) {
                    akteVarB = defpackage.akte.UNKNOWN;
                }
                if (akteVarB == defpackage.akte.UNKNOWN || akteVarB == defpackage.akte.SYSTEM_TRAY) {
                    ahyn ahynVar = (ahyn) this.b.b;
                    if (!ahynVar.f()) {
                        a.c().y("Received %s surface instruction, but the system tray push handler is missing.", akteVarB.name());
                        return aojh.a;
                    }
                    defpackage.adtl adtlVar = (defpackage.adtl) ahynVar.b();
                    defpackage.aktl aktlVar2 = akshVar.f;
                    if (aktlVar2 == null) {
                        aktlVar2 = defpackage.aktl.a;
                    }
                    aooh.e(aktlVar2, "getSyncInstruction(...)");
                    aooh.e(advuVar.b(), "toLog(...)");
                    adwhVar.c = 1;
                    if (adtlVar.d() == aoluVar) {
                        return aoluVar;
                    }
                } else if (akteVarB == defpackage.akte.IN_APP) {
                    aoin aoinVar = this.m;
                    if (!((ahyn) aoinVar.a()).f()) {
                        a.c().v("Received an IN_APP surface instruction, but the in-app push handler is missing.");
                        return aojh.a;
                    }
                    if (aduyVar == null) {
                        a.d().v("IN_APP sync instructions account must not be null.");
                        return aojh.a;
                    }
                    defpackage.aceb acebVar = (defpackage.aceb) ((ahyn) aoinVar.a()).b();
                    defpackage.aktl aktlVar3 = akshVar.f;
                    if (aktlVar3 == null) {
                        aktlVar3 = defpackage.aktl.a;
                    }
                    aooh.e(aktlVar3, "getSyncInstruction(...)");
                    defpackage.akqc akqcVarB = advuVar.b();
                    aooh.e(akqcVarB, "toLog(...)");
                    adwhVar.c = 2;
                    if (acebVar.a(aduyVar, aktlVar3, akqcVarB, adwhVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (java.lang.Exception e) {
            hgb.b(a.d(), "Could not handle in-app sync instruction.", e);
        }
        return aojh.a;
    }
}
