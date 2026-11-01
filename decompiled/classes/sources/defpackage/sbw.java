package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sbw {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/impl/phonenumber/CallingCardPhoneNumberService");
    private final defpackage.okj b;
    private final defpackage.oko c;
    private final defpackage.rsr d;
    private final defpackage.ahbv e;
    private final defpackage.ipc f;
    private final defpackage.aogc g;

    public sbw(defpackage.aogc aogcVar, defpackage.rsr rsrVar, defpackage.ahbv ahbvVar, defpackage.ipc ipcVar, defpackage.okj okjVar, defpackage.oko okoVar) {
        if (ahbvVar == null) {
            defpackage.aooh.i("dialerPhoneNumbers");
        }
        if (ipcVar == null) {
            defpackage.aooh.i("e164PhoneNumberCache");
        }
        this.g = aogcVar;
        this.d = rsrVar;
        this.e = ahbvVar;
        this.f = ipcVar;
        this.b = okjVar;
        this.c = okoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(hkd hkdVar, defpackage.aoln aolnVar) {
        sbp sbpVar;
        if (aolnVar instanceof sbp) {
            sbpVar = (sbp) aolnVar;
            int i = sbpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbpVar.c = i - Integer.MIN_VALUE;
            } else {
                sbpVar = new sbp(this, aolnVar);
            }
        } else {
            sbpVar = new sbp(this, aolnVar);
        }
        java.lang.Object objAK = sbpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sbpVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAK);
            defpackage.ipc ipcVar = this.f;
            defpackage.aooh.f(hkdVar, "dialerPhoneNumber");
            java.lang.String str = (java.lang.String) ((j$.util.concurrent.ConcurrentHashMap) ipcVar.a).get(hkdVar);
            if (str != null) {
                return str;
            }
            int i3 = hkdVar.b;
            if ((i3 & 4) == 0) {
                ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/phonenumber/CallingCardPhoneNumberService", "formatE164Number", 38, "CallingCardPhoneNumberService.kt")).v("no valid number information");
            } else if (!hkdVar.e) {
                ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/phonenumber/CallingCardPhoneNumberService", "formatE164Number", 42, "CallingCardPhoneNumberService.kt")).v("invalid phone number");
            } else if ((i3 & 32) != 0) {
                defpackage.aogc aogcVar = this.g;
                sbpVar.d = hkdVar;
                sbpVar.c = 1;
                objAK = aogcVar.aK(sbpVar);
                if (objAK == aoluVar) {
                    return aoluVar;
                }
            } else {
                ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/phonenumber/CallingCardPhoneNumberService", "formatE164Number", 46, "CallingCardPhoneNumberService.kt")).v("no region number for formatting");
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hkdVar = sbpVar.d;
        defpackage.aooc.af(objAK);
        akfx akfxVar = (akfx) objAK;
        java.lang.String strExtractNetworkPortion = android.telephony.PhoneNumberUtils.extractNetworkPortion(hkdVar.c);
        defpackage.aooh.e(strExtractNetworkPortion, "extractNetworkPortion(...)");
        akgu akguVarA = orv.a(akfxVar, strExtractNetworkPortion, defpackage.akfg.b(hkdVar.h));
        if (akguVarA != null) {
            try {
                java.lang.String strX = akfxVar.x(akguVarA, 1);
                defpackage.ipc ipcVar2 = this.f;
                defpackage.aooh.c(strX);
                defpackage.aooh.f(hkdVar, "dialerPhoneNumber");
                defpackage.aooh.f(strX, "e164Number");
                ((j$.util.concurrent.ConcurrentHashMap) ipcVar2.a).put(hkdVar, strX);
                return strX;
            } catch (java.lang.Exception e) {
                ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/patrick/impl/phonenumber/CallingCardPhoneNumberService", "formatE164Number", 63, "CallingCardPhoneNumberService.kt")).v("Failed to parse phone number - error: Unknown");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[PHI: r6 r9
      0x0069: PHI (r6v1 'this' sbw) = (r6v0 'this' sbw A[IMMUTABLE_TYPE, THIS]), (r6v3 'this' sbw) binds: [B:24:0x0067, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r9v7 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:24:0x0067, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r9 != r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, defpackage.aoln r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof sbq
            if (r0 == 0) goto L13
            r0 = r9
            sbq r0 = (sbq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sbq r0 = new sbq
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            aolu r1 = defpackage.aolu.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aooc.af(r9)
            goto L7c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.a
            sbw r6 = (defpackage.sbw) r6
            defpackage.aooc.af(r9)
            goto L69
        L3d:
            java.lang.Object r7 = r0.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.aooc.af(r9)
            goto L56
        L45:
            defpackage.aooc.af(r9)
            if (r8 != 0) goto L59
            rsr r8 = r6.d
            r0.a = r7
            r0.d = r5
            java.lang.Object r9 = r8.b(r0)
            if (r9 == r1) goto L7b
        L56:
            r8 = r9
            java.lang.String r8 = (java.lang.String) r8
        L59:
            ahbv r9 = r6.e
            ajcq r7 = r9.v(r7, r8)
            r0.a = r6
            r0.d = r4
            java.lang.Object r9 = defpackage.aosv.D(r7, r0)
            if (r9 == r1) goto L7b
        L69:
            java.lang.String r7 = "await(...)"
            defpackage.aooh.e(r9, r7)
            hkd r9 = (hkd) r9
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r9 = r6.a(r9, r0)
            if (r9 != r1) goto L7c
        L7b:
            r9 = r1
        L7c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbw.b(java.lang.String, java.lang.String, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        sbr sbrVar;
        if (aolnVar instanceof sbr) {
            sbrVar = (sbr) aolnVar;
            int i = sbrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbrVar.c = i - Integer.MIN_VALUE;
            } else {
                sbrVar = new sbr(this, aolnVar);
            }
        } else {
            sbrVar = new sbr(this, aolnVar);
        }
        java.lang.Object objK = sbrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sbrVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            defpackage.okj okjVar = this.b;
            sbrVar.c = 1;
            objK = okjVar.k(phoneAccountHandle, sbrVar);
            if (objK != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
            return objK;
        }
        defpackage.aooc.af(objK);
        int iIntValue = ((java.lang.Number) objK).intValue();
        sbrVar.c = 2;
        java.lang.Object objD = d(iIntValue, sbrVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(int i, defpackage.aoln aolnVar) {
        sbs sbsVar;
        if (aolnVar instanceof sbs) {
            sbsVar = (sbs) aolnVar;
            int i2 = sbsVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbsVar.c = i2 - Integer.MIN_VALUE;
            } else {
                sbsVar = new sbs(this, aolnVar);
            }
        } else {
            sbsVar = new sbs(this, aolnVar);
        }
        java.lang.Object objR = sbsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = sbsVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objR);
            defpackage.oko okoVar = this.c;
            sbsVar.c = 1;
            objR = okoVar.R(i, sbsVar);
            if (objR != aoluVar) {
            }
            return aoluVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objR);
            return objR;
        }
        defpackage.aooc.af(objR);
        sbsVar.c = 2;
        java.lang.Object objI = ((defpackage.oko) objR).I(sbsVar);
        if (objI != aoluVar) {
            return objI;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        sbt sbtVar;
        if (aolnVar instanceof sbt) {
            sbtVar = (sbt) aolnVar;
            int i = sbtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbtVar.c = i - Integer.MIN_VALUE;
            } else {
                sbtVar = new sbt(this, aolnVar);
            }
        } else {
            sbtVar = new sbt(this, aolnVar);
        }
        java.lang.Object objK = sbtVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sbtVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            defpackage.okj okjVar = this.b;
            sbtVar.c = 1;
            objK = okjVar.k(phoneAccountHandle, sbtVar);
            if (objK != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
            return objK;
        }
        defpackage.aooc.af(objK);
        int iIntValue = ((java.lang.Number) objK).intValue();
        sbtVar.c = 2;
        java.lang.Object objF = f(iIntValue, sbtVar);
        if (objF != aoluVar) {
            return objF;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(int i, defpackage.aoln aolnVar) {
        sbu sbuVar;
        java.lang.String str;
        java.lang.String str2;
        if (aolnVar instanceof sbu) {
            sbuVar = (sbu) aolnVar;
            int i2 = sbuVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbuVar.c = i2 - Integer.MIN_VALUE;
            } else {
                sbuVar = new sbu(this, aolnVar);
            }
        } else {
            sbuVar = new sbu(this, aolnVar);
        }
        java.lang.Object objR = sbuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = sbuVar.c;
        try {
            if (i3 == 0) {
                defpackage.aooc.af(objR);
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    defpackage.okj okjVar = this.b;
                    sbuVar.c = 1;
                    objR = okjVar.j(i, sbuVar);
                    if (objR == aoluVar) {
                        return aoluVar;
                    }
                    str = (java.lang.String) objR;
                    if (str != null) {
                        return str;
                    }
                } else {
                    defpackage.oko okoVar = this.c;
                    sbuVar.c = 2;
                    objR = okoVar.R(i, sbuVar);
                    if (objR == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.oko okoVar2 = (defpackage.oko) objR;
                    sbuVar.c = 3;
                    objR = defpackage.aoov.aj(okoVar2.e, new defpackage.ohg(okoVar2, (defpackage.aoln) null, 20, (short[]) null), sbuVar);
                    if (objR == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objR;
                    if (str2 != null) {
                        return str2;
                    }
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    defpackage.aooc.af(objR);
                    defpackage.oko okoVar3 = (defpackage.oko) objR;
                    sbuVar.c = 3;
                    objR = defpackage.aoov.aj(okoVar3.e, new defpackage.ohg(okoVar3, (defpackage.aoln) null, 20, (short[]) null), sbuVar);
                    if (objR == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.aooc.af(objR);
                }
                str2 = (java.lang.String) objR;
                if (str2 != null && str2.length() > 0) {
                    return str2;
                }
            } else {
                defpackage.aooc.af(objR);
                str = (java.lang.String) objR;
                if (str != null && str.length() > 0) {
                    return str;
                }
            }
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e).l("com/android/dialer/patrick/impl/phonenumber/CallingCardPhoneNumberService", "getLocalNumberFromSubscriptionId", 101, "CallingCardPhoneNumberService.kt")).v("Could not get device's phone number");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) throws java.lang.Throwable {
        sbv sbvVar;
        if (aolnVar instanceof sbv) {
            sbvVar = (sbv) aolnVar;
            int i = sbvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbvVar.c = i - Integer.MIN_VALUE;
            } else {
                sbvVar = new sbv(this, aolnVar);
            }
        } else {
            sbvVar = new sbv(this, aolnVar);
        }
        java.lang.Object objB = sbvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sbvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                str = sbvVar.d;
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            defpackage.aooh.e(objB, "await(...)");
            return objB;
        }
        defpackage.aooc.af(objB);
        if (str2 == null) {
            defpackage.rsr rsrVar = this.d;
            sbvVar.d = str;
            sbvVar.c = 1;
            objB = rsrVar.b(sbvVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.ajcq ajcqVarV = this.e.v(str, str2);
        sbvVar.d = null;
        sbvVar.c = 2;
        objB = defpackage.aosv.D(ajcqVarV, sbvVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.aooh.e(objB, "await(...)");
        return objB;
        str2 = (java.lang.String) objB;
        defpackage.ajcq ajcqVarV2 = this.e.v(str, str2);
        sbvVar.d = null;
        sbvVar.c = 2;
        objB = defpackage.aosv.D(ajcqVarV2, sbvVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.aooh.e(objB, "await(...)");
        return objB;
    }
}
