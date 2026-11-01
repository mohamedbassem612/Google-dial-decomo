package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jnc {
    private final yuo d;
    private static final aorg b = new aorg("^(business\\s*name|name)\\s*:\\s*", 2);
    public static final aorg a = new aorg("<\\s*/?\\s*(?:ctrl\\s*\\d+|start_of_turn|end_of_turn|eos|bos|transcript)\\s*>", 2);
    private static final aimz c = aimz.i("com/android/dialer/businessnameextractor/AiCoreBusinessNameExtractor");

    public jnc(yuo yuoVar) {
        this.d = yuoVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:106:0x020f A[Catch: all -> 0x0226, TRY_LEAVE, TryCatch #0 {all -> 0x0226, blocks: (B:21:0x0060, B:56:0x013e, B:60:0x014a, B:61:0x014e, B:62:0x0153, B:63:0x0154, B:64:0x0176, B:66:0x0182, B:69:0x018e, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ae, B:82:0x01c3, B:84:0x01cb, B:92:0x01dc, B:94:0x01e1, B:87:0x01d1, B:95:0x01e4, B:98:0x01f1, B:100:0x01f7, B:102:0x01fd, B:104:0x0205, B:105:0x0208, B:106:0x020f, B:24:0x006a, B:54:0x012e, B:52:0x00fd), top: B:116:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x014a A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:21:0x0060, B:56:0x013e, B:60:0x014a, B:61:0x014e, B:62:0x0153, B:63:0x0154, B:64:0x0176, B:66:0x0182, B:69:0x018e, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ae, B:82:0x01c3, B:84:0x01cb, B:92:0x01dc, B:94:0x01e1, B:87:0x01d1, B:95:0x01e4, B:98:0x01f1, B:100:0x01f7, B:102:0x01fd, B:104:0x0205, B:105:0x0208, B:106:0x020f, B:24:0x006a, B:54:0x012e, B:52:0x00fd), top: B:116:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014e A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:21:0x0060, B:56:0x013e, B:60:0x014a, B:61:0x014e, B:62:0x0153, B:63:0x0154, B:64:0x0176, B:66:0x0182, B:69:0x018e, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ae, B:82:0x01c3, B:84:0x01cb, B:92:0x01dc, B:94:0x01e1, B:87:0x01d1, B:95:0x01e4, B:98:0x01f1, B:100:0x01f7, B:102:0x01fd, B:104:0x0205, B:105:0x0208, B:106:0x020f, B:24:0x006a, B:54:0x012e, B:52:0x00fd), top: B:116:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0154 A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:21:0x0060, B:56:0x013e, B:60:0x014a, B:61:0x014e, B:62:0x0153, B:63:0x0154, B:64:0x0176, B:66:0x0182, B:69:0x018e, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ae, B:82:0x01c3, B:84:0x01cb, B:92:0x01dc, B:94:0x01e1, B:87:0x01d1, B:95:0x01e4, B:98:0x01f1, B:100:0x01f7, B:102:0x01fd, B:104:0x0205, B:105:0x0208, B:106:0x020f, B:24:0x006a, B:54:0x012e, B:52:0x00fd), top: B:116:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0176 A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:21:0x0060, B:56:0x013e, B:60:0x014a, B:61:0x014e, B:62:0x0153, B:63:0x0154, B:64:0x0176, B:66:0x0182, B:69:0x018e, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ae, B:82:0x01c3, B:84:0x01cb, B:92:0x01dc, B:94:0x01e1, B:87:0x01d1, B:95:0x01e4, B:98:0x01f1, B:100:0x01f7, B:102:0x01fd, B:104:0x0205, B:105:0x0208, B:106:0x020f, B:24:0x006a, B:54:0x012e, B:52:0x00fd), top: B:116:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0182 A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:21:0x0060, B:56:0x013e, B:60:0x014a, B:61:0x014e, B:62:0x0153, B:63:0x0154, B:64:0x0176, B:66:0x0182, B:69:0x018e, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ae, B:82:0x01c3, B:84:0x01cb, B:92:0x01dc, B:94:0x01e1, B:87:0x01d1, B:95:0x01e4, B:98:0x01f1, B:100:0x01f7, B:102:0x01fd, B:104:0x0205, B:105:0x0208, B:106:0x020f, B:24:0x006a, B:54:0x012e, B:52:0x00fd), top: B:116:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ee  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) throws java.lang.Throwable {
        defpackage.jnb jnbVar;
        java.lang.String str2;
        ahdv ahdvVar;
        ytp ytpVar;
        int iAd;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String string2;
        java.lang.Object jnjVar;
        java.util.List listE;
        java.lang.String str4;
        java.lang.String strB;
        java.lang.String string3;
        boolean z;
        aour aourVar;
        defpackage.jlk jlkVar;
        java.lang.String str5 = str;
        if (aolnVar instanceof defpackage.jnb) {
            jnbVar = (defpackage.jnb) aolnVar;
            int i = jnbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jnbVar.d = i - Integer.MIN_VALUE;
            } else {
                jnbVar = new defpackage.jnb(this, aolnVar);
            }
        } else {
            jnbVar = new defpackage.jnb(this, aolnVar);
        }
        java.lang.Object objA = jnbVar.b;
        aolu aoluVar = aolu.a;
        int i2 = jnbVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                if (!aoov.H(str5)) {
                    aooh.f(str5, "transcript");
                    if (aoov.J(str5, '<')) {
                        int i3 = 0;
                        while (i3 < 5) {
                            java.lang.String strB2 = a.b(str5, "");
                            if (aooh.n(strB2, str5)) {
                                break;
                            }
                            if (!aoov.J(strB2, '<')) {
                                str5 = strB2;
                                break;
                            }
                            i3++;
                            str5 = strB2;
                        }
                    }
                    if (!aoov.H(str5)) {
                        yts ytsVar = new yts(yse.m, (java.lang.Integer) null, 1);
                        yuo yuoVar = this.d;
                        jnbVar.a = str5;
                        jnbVar.d = 1;
                        objA = yuoVar.a(ytsVar, jnbVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        str2 = str5;
                    }
                }
                return defpackage.jnd.a;
            }
            if (i2 == 1) {
                str2 = (java.lang.String) jnbVar.a;
                aooc.af(objA);
            } else if (i2 == 2) {
                ahdvVar = (ahdv) jnbVar.a;
                aooc.af(objA);
                aoxh aoxhVarC = ahdvVar.c();
                jnbVar.a = ahdvVar;
                jnbVar.d = 3;
                objA = aoov.au(aoxhVarC, jnbVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        defpackage.jnk jnkVar = (defpackage.jnk) jnbVar.a;
                        aooc.af(objA);
                        return jnkVar;
                    }
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th = (java.lang.Throwable) jnbVar.a;
                    aooc.af(objA);
                    throw th;
                }
                ahdvVar = (ahdv) jnbVar.a;
                aooc.af(objA);
            }
            ytpVar = (ytr) objA;
            iAd = anty.ad(ytpVar);
            if (iAd != 0) {
                str3 = (java.lang.String) ajsz.bG(((ytq) ytpVar).a);
                if (str3 != null) {
                    string = aoov.x(str3).toString();
                } else {
                    string = null;
                }
                if (string != null || (listE = aoov.E(string)) == null || (str4 = (java.lang.String) ajsz.bG(listE)) == null || (strB = b.b(str4, "")) == null || (string3 = aoov.x(strB).toString()) == null) {
                    string2 = null;
                } else {
                    char[] cArr = {'\"', '\'', '`', '.'};
                    int length = string3.length() - 1;
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 <= length) {
                        char cCharAt = string3.charAt(true != z2 ? i4 : length);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 4) {
                                z = false;
                                break;
                            }
                            if (cCharAt == cArr[i5]) {
                                z = true;
                                break;
                            }
                            i5++;
                        }
                        if (z2) {
                            if (!z) {
                                break;
                            }
                            length--;
                        } else if (z) {
                            i4++;
                        } else {
                            z2 = true;
                        }
                    }
                    string2 = string3.subSequence(i4, length + 1).toString();
                }
                if (string2 != null || aoov.H(string2) || string2.length() > 60) {
                    jnjVar = defpackage.jnh.a;
                } else {
                    jnjVar = aoov.s(string2, "NONE", true) ? defpackage.jni.a : new defpackage.jnj(string2);
                }
            } else if (iAd != 1) {
                aimw aimwVarL = c.d().l("com/android/dialer/businessnameextractor/AiCoreBusinessNameExtractor", "extractBusinessName", 86, "AiCoreBusinessNameExtractor.kt");
                ytn ytnVar = ytpVar.a;
                aimwVarL.y("AiCore inference failed: %s", ytnVar);
                jnjVar = new defpackage.jnf(ytnVar.name());
            } else {
                if (iAd == 2) {
                    throw new aois();
                }
                jnjVar = defpackage.jne.a;
            }
            aourVar = aour.a;
            jlkVar = new defpackage.jlk(ahdvVar, (aoln) null, 5);
            jnbVar.a = jnjVar;
            jnbVar.d = 4;
            if (aoov.aj(aourVar, jlkVar, jnbVar) != aoluVar) {
                return jnjVar;
            }
            return aoluVar;
            ytx ytxVar = (yty) objA;
            int iY = anty.Y(ytxVar);
            if (iY != 0) {
                if (iY != 1) {
                    throw new aois();
                }
                defpackage.ytw ytwVar = (defpackage.ytw) ytxVar;
                c.d().l("com/android/dialer/businessnameextractor/AiCoreBusinessNameExtractor", "extractBusinessName", 45, "AiCoreBusinessNameExtractor.kt").y("Failed to create AiCore session for transcript business name: %s", ytwVar.a());
                return new defpackage.jng(ytwVar.a().name());
            }
            ahdvVar = ytxVar.a;
            java.lang.String str6 = java.lang.String.format("<ctrl99>user\nIdentify the name of the commercial business, clinic, or organization that the caller represents from the voicemail transcript.\nDo not extract personal or individual names (such as family, friends, or the individual name of the person calling), and do not extract third-party businesses mentioned only in passing (for example, as a meeting location).\nIf the call is personal or no represented business is identifiable, output \"NONE\". Otherwise, output only the business name in its original language without translation or surrounding text.\n\nTranscript:\n<transcript>\n%s\n</transcript>\n\nBusiness Name:<ctrl100>\n<ctrl99>model", java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
            aooh.e(str6, "format(...)");
            ynm ynmVarA = ynn.a();
            ynmVarA.b(ajsz.aY(new ynk(str6)));
            ynn ynnVarA = ynmVarA.a();
            jnbVar.a = ahdvVar;
            jnbVar.d = 2;
            objA = ahdvVar.a(ynnVarA, jnbVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            aoxh aoxhVarC2 = ahdvVar.c();
            jnbVar.a = ahdvVar;
            jnbVar.d = 3;
            objA = aoov.au(aoxhVarC2, jnbVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            ytpVar = (ytr) objA;
            iAd = anty.ad(ytpVar);
            if (iAd != 0) {
                str3 = (java.lang.String) ajsz.bG(((ytq) ytpVar).a);
                if (str3 != null) {
                    string = aoov.x(str3).toString();
                } else {
                    string = null;
                }
                if (string != null) {
                    string2 = null;
                } else {
                    string2 = null;
                }
                if (string2 != null) {
                    jnjVar = defpackage.jnh.a;
                } else {
                    jnjVar = defpackage.jnh.a;
                }
            } else if (iAd != 1) {
                aimw aimwVarL2 = c.d().l("com/android/dialer/businessnameextractor/AiCoreBusinessNameExtractor", "extractBusinessName", 86, "AiCoreBusinessNameExtractor.kt");
                ytn ytnVar2 = ytpVar.a;
                aimwVarL2.y("AiCore inference failed: %s", ytnVar2);
                jnjVar = new defpackage.jnf(ytnVar2.name());
            } else {
                if (iAd == 2) {
                    throw new aois();
                }
                jnjVar = defpackage.jne.a;
            }
            aourVar = aour.a;
            jlkVar = new defpackage.jlk(ahdvVar, (aoln) null, 5);
            jnbVar.a = jnjVar;
            jnbVar.d = 4;
            if (aoov.aj(aourVar, jlkVar, jnbVar) != aoluVar) {
                return jnjVar;
            }
            return aoluVar;
        } catch (java.lang.Throwable th2) {
            aour aourVar2 = aour.a;
            defpackage.jlk jlkVar2 = new defpackage.jlk((ahdv) str5, (aoln) null, 5);
            jnbVar.a = th2;
            jnbVar.d = 5;
            if (aoov.aj(aourVar2, jlkVar2, jnbVar) != aoluVar) {
                throw th2;
            }
            return aoluVar;
        }
    }
}
