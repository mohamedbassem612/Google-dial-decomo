package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class wsc {
    public wsc(ahey aheyVar, com.android.dialer.xatu.impl.ui.XatuCachedIvrDataBannerView xatuCachedIvrDataBannerView) {
        com.android.dialer.xatu.impl.ui.XatuCachedIvrDataBannerView.inflate(xatuCachedIvrDataBannerView.getContext(), 2131624713, xatuCachedIvrDataBannerView);
        xatuCachedIvrDataBannerView.setBackgroundColor(defpackage.urg.c(aheyVar, 2130969108));
    }

    public static yta A(int i) {
        if (i == 0) {
            return yta.b;
        }
        if (i == 1) {
            return yta.d;
        }
        if (i == 2) {
            return yta.e;
        }
        if (i == 3) {
            return yta.f;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Unexpected AiFeatureStatus: "));
    }

    public static /* synthetic */ zoe B(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ zoe C(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static java.lang.Object D(defpackage.zzx zzxVar, java.lang.Object obj) {
        defpackage.aooh.f(zzxVar, "<this>");
        defpackage.aoin aoinVar = (defpackage.aoin) zzxVar.k().get(obj);
        if (aoinVar != null) {
            return aoinVar.a();
        }
        return null;
    }

    public static /* synthetic */ defpackage.xtq E(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.xtq(akzxVar);
    }

    public static /* synthetic */ uyg F(defpackage.wyc wycVar, defpackage.amzg amzgVar) {
        j$.util.Objects.requireNonNull(wycVar);
        tok tokVar = new tok(wycVar, 13);
        j$.util.Objects.requireNonNull(amzgVar);
        return new uyg(tokVar, new defpackage.xbw(amzgVar, 12));
    }

    public static defpackage.wsc G(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 8);
        if (obj != null) {
            if (obj instanceof java.lang.Boolean) {
                return new zch(((java.lang.Boolean) obj).booleanValue());
            }
            if (obj instanceof java.lang.String) {
                return new zco((java.lang.String) obj);
            }
            if (obj instanceof java.lang.Integer) {
                return new zck(((java.lang.Number) obj).intValue());
            }
            if (obj instanceof java.lang.Long) {
                return new zcl(((java.lang.Number) obj).longValue());
            }
            if (obj instanceof java.lang.Float) {
                return new zcj(((java.lang.Number) obj).floatValue());
            }
            if (obj instanceof byte[]) {
                return new zci((byte[]) obj);
            }
            if (obj instanceof defpackage.albh) {
                defpackage.albh albhVar = (defpackage.albh) obj;
                defpackage.akzx akzxVarM = defpackage.akyp.a.m();
                java.lang.String strValueOf = java.lang.String.valueOf(albhVar.getClass().getName());
                akzxVarM.u();
                defpackage.akyp akypVar = (defpackage.akyp) akzxVarM.b;
                java.lang.String strConcat = "type.googleapis.com/".concat(strValueOf);
                j$.util.Objects.requireNonNull(strConcat);
                akypVar.b = strConcat;
                defpackage.akzc akzcVarF = albhVar.f();
                akzxVarM.u();
                defpackage.akyp akypVar2 = (defpackage.akyp) akzxVarM.b;
                j$.util.Objects.requireNonNull(akzcVarF);
                akypVar2.c = akzcVarF;
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                return new zcn((defpackage.akyp) aladVarR);
            }
        }
        return null;
    }

    public static int H(int i) {
        if (i == 16) {
            return 14;
        }
        if (i == 1001) {
            return 26;
        }
        if (i == 1002) {
            return 27;
        }
        switch (i) {
            case 0:
                return 28;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            default:
                switch (i) {
                    case 9:
                        return 8;
                    case 10:
                        return 9;
                    case 11:
                        return 10;
                    case 12:
                        return 11;
                    case 13:
                        return 12;
                    case 14:
                        return 13;
                    default:
                        switch (i) {
                            case 18:
                                return 15;
                            case 19:
                                return 16;
                            case 20:
                                return 17;
                            case 21:
                                return 18;
                            case 22:
                                return 19;
                            case 23:
                                return 20;
                            case 24:
                                return 21;
                            case 25:
                                return 22;
                            case 26:
                                return 23;
                            case 27:
                                return 24;
                            case 28:
                                return 25;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int I(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        int i3 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i3 = 5;
                if (i != 5) {
                    if (i != 6) {
                        return 0;
                    }
                }
            }
            return i3;
        }
        return i2;
    }

    public static wlf J(int i) {
        defpackage.akzx akzxVarM = wlf.a.m();
        java.lang.String strN = N(i, 2);
        akzxVarM.u();
        wlf wlfVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strN);
        wlfVar.b |= 1;
        wlfVar.e = strN;
        defpackage.akzx akzxVarM2 = wmx.a.m();
        akzxVarM2.u();
        wmx wmxVar = akzxVarM2.b;
        wmxVar.b |= 1;
        wmxVar.c = 2132021107;
        akzxVarM.u();
        wlf wlfVar2 = akzxVarM.b;
        wmx wmxVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(wmxVarR);
        wlfVar2.d = wmxVarR;
        wlfVar2.c = 4;
        return akzxVarM.r();
    }

    public static wlf K(int i) {
        defpackage.akzx akzxVarM = wlf.a.m();
        java.lang.String strN = N(i, 3);
        akzxVarM.u();
        wlf wlfVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strN);
        wlfVar.b |= 1;
        wlfVar.e = strN;
        defpackage.akzx akzxVarM2 = wmx.a.m();
        akzxVarM2.u();
        wmx wmxVar = akzxVarM2.b;
        wmxVar.b |= 1;
        wmxVar.c = 2132021109;
        akzxVarM.u();
        wlf wlfVar2 = akzxVarM.b;
        wmx wmxVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(wmxVarR);
        wlfVar2.d = wmxVarR;
        wlfVar2.c = 4;
        return akzxVarM.r();
    }

    public static defpackage.aify L(int i, java.util.List list) {
        return (defpackage.aify) j$.util.Collection.-EL.stream(list).map(new exw(i, 4)).collect(defpackage.aido.a);
    }

    public static boolean M(java.util.List list) {
        return j$.util.Collection.-EL.stream(list).anyMatch(new defpackage.vgb(20));
    }

    public static java.lang.String N(int i, int i2) {
        java.lang.String str;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (i2 != 1) {
            str = i2 != 2 ? "TRANSCRIPTION_RESUMED" : "TRANSCRIPTION_INTERRUPTED";
        } else {
            str = "INTRO";
        }
        return java.lang.String.format(locale, "session_%d_%s_%s", numValueOf, "RIBBON", str);
    }

    public static int O(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 5;
            if (i != 4) {
                return i != 5 ? 0 : 6;
            }
        }
        return i2;
    }

    public static /* synthetic */ vqf P(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static /* synthetic */ vqf Q(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static /* synthetic */ vqu R(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu S(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ java.util.List T(wmz wmzVar, int i) {
        defpackage.alat alatVar;
        int i2 = wmzVar.c;
        int I = I(i2);
        java.util.ArrayList arrayList = null;
        if (I == 0) {
            throw null;
        }
        int i3 = I - 1;
        if (i3 == 0) {
            alatVar = (i2 == 2 ? (wnc) wmzVar.d : wnc.a).e;
        } else if (i3 == 1) {
            alatVar = (i2 == 3 ? (wnb) wmzVar.d : wnb.a).g;
        } else if (i3 != 3) {
            alatVar = null;
        } else {
            alatVar = (i2 == 5 ? (wng) wmzVar.d : wng.a).e;
        }
        if (alatVar != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : alatVar) {
                int iO = O(((wke) obj).e);
                if (iO == 0) {
                    iO = 1;
                }
                if (iO == i) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static int U(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 9998) {
            return i != 9999 ? 0 : 10000;
        }
        return 9999;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void V(al alVar, wgq wgqVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new vod(4));
        defpackage.ahvr.d(alVar, ahtf.class, new uzb(wgqVar, 19));
    }

    public static wfv W(wex wexVar) {
        switch (wexVar.ordinal()) {
            case 0:
            case 4:
                return wfv.m;
            case 1:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return wfv.b;
            case 2:
                return wfv.n;
            case 3:
                return wfv.c;
            case 5:
                return wfv.v;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return wfv.p;
            default:
                throw new java.lang.IllegalArgumentException("bad state group: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(wexVar))));
        }
    }

    public static wfv X(wex wexVar) {
        switch (wexVar.ordinal()) {
            case 0:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return wfv.b;
            case 1:
                return wfv.l;
            case 2:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return wfv.o;
            case 3:
                return wfv.e;
            case 4:
                return wfv.s;
            case 5:
                return wfv.x;
            default:
                throw new java.lang.IllegalArgumentException("bad state group: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(wexVar))));
        }
    }

    public static wfv Y(wew wewVar) {
        switch (wewVar.ordinal()) {
            case 0:
                return wfv.b;
            case 1:
                return wfv.f;
            case 2:
                return wfv.g;
            case 3:
                return wfv.h;
            case 4:
                return wfv.j;
            case 5:
                return wfv.k;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
                return wfv.q;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return wfv.d;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return wfv.i;
            case 9:
                return wfv.r;
            case 10:
                return wfv.t;
            case 11:
                return wfv.w;
            case 13:
                return wfv.u;
            default:
                throw new java.lang.IllegalArgumentException("bad state ".concat(java.lang.String.valueOf(java.lang.String.valueOf(wewVar))));
        }
    }

    public static wex Z(wew wewVar) {
        switch (wewVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return wex.a;
            case 4:
            case 5:
                return wex.b;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return wex.c;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return wex.d;
            case 9:
            case 10:
            case 13:
                return wex.e;
            case 11:
                return wex.f;
            case 12:
                return wex.g;
            default:
                throw new java.lang.IllegalArgumentException("bad state ".concat(java.lang.String.valueOf(java.lang.String.valueOf(wewVar))));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void a(ger gerVar, wqh wqhVar) throws afeb {
        defpackage.ahvr.e(gerVar, tyr.class, new uzb(wqhVar, 20));
    }

    public static defpackage.voi aA(android.content.Context context) {
        return (defpackage.voi) defpackage.agab.aH(context, defpackage.voi.class);
    }

    public static java.lang.String aB(android.content.Context context, long j) {
        android.content.res.Resources resources = context.getResources();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        int i = (int) (j / 60000);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        int i2 = (int) ((j / 1000) % 60);
        if (i > 0) {
            if (i2 > 0) {
                return context.getResources().getString(2132017274, resources.getQuantityString(2131886094, i, java.lang.Integer.valueOf(i)), resources.getQuantityString(2131886095, i2, java.lang.Integer.valueOf(i2)));
            }
            if (i2 == 0) {
                return resources.getQuantityString(2131886094, i, java.lang.Integer.valueOf(i));
            }
        }
        return resources.getQuantityString(2131886095, i2, java.lang.Integer.valueOf(i2));
    }

    public static java.lang.String aC(android.content.Context context, int i, int i2) {
        java.lang.String strCz = cz(context, i2);
        return i != 0 ? context.getString(2132020931, cz(context, i), strCz) : strCz;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aD(al alVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new vod(1));
        defpackage.ahvr.d(alVar, ahtf.class, new vod(0));
    }

    public static java.lang.String aE() {
        java.lang.String strCA = cA(android.os.Build.MANUFACTURER.replace('=', '_').replace(';', '_').replace('.', '_').replace(' ', '_'), 12);
        java.lang.String strCA2 = cA(android.os.Build.VERSION.RELEASE.replace('=', '_').replace(';', '_').replace('.', '_').replace(' ', '_'), 8);
        return java.lang.String.format("%s.%s.%s", strCA, cA(android.os.Build.MODEL.replace('=', '_').replace(';', '_').replace('.', '_').replace(' ', '_').replace("(", "").replace(")", ""), (28 - strCA.length()) - strCA2.length()), strCA2);
    }

    public static java.lang.String aF(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }

    public static byte[] aG(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            return messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.lang.String aH(vie vieVar, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(new java.lang.String(aG(((java.lang.String) vieVar.a) + ':' + ((java.lang.String) vieVar.c) + ':' + ((java.lang.String) vieVar.b)), java.nio.charset.StandardCharsets.ISO_8859_1));
        sb.append(':');
        java.lang.String str = (java.lang.String) vieVar.d;
        sb.append(str);
        sb.append(':');
        java.lang.String str2 = (java.lang.String) vieVar.f;
        sb.append(str2);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (!z) {
            sb2.append("AUTHENTICATE");
        }
        sb2.append(':');
        sb2.append((java.lang.String) vieVar.g);
        java.lang.String strAF = aF(aG(sb.toString()));
        java.lang.Object obj = vieVar.e;
        java.lang.Object obj2 = vieVar.h;
        return aF(aG(strAF + ':' + (str + ':' + ((java.lang.String) obj) + ':' + str2 + ':' + ((java.lang.String) obj2) + ':' + aF(aG(sb2.toString())))));
    }

    public static void aI(java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }

    public static void aJ(java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4 A[ORIG_RETURN, RETURN] */
    public static int aK(defpackage.vzi vziVar) {
        vbx vbxVarB;
        vbw vbwVarB;
        vbs vbsVarB;
        defpackage.vcp vcpVar = vziVar.g;
        if (vcpVar == null) {
            vcpVar = defpackage.vcp.a;
        }
        if (vcpVar.b == 1) {
            defpackage.vcp vcpVar2 = vziVar.g;
            if (vcpVar2 == null) {
                vcpVar2 = defpackage.vcp.a;
            }
            if (vcpVar2.b == 1) {
                vbsVarB = vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                if (vbsVarB == null) {
                    vbsVarB = vbs.H;
                }
            } else {
                vbsVarB = vbs.a;
            }
            switch (vbsVarB.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                case 20:
                case 26:
                case 30:
                case 31:
                case 32:
                case 33:
                    return 5;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                case 28:
                case 29:
                    return 2;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 27:
                    return 4;
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    return 1;
                default:
                    throw new defpackage.aois();
            }
        }
        defpackage.vcp vcpVar3 = vziVar.g;
        if ((vcpVar3 == null ? defpackage.vcp.a : vcpVar3).b == 3) {
            if (vcpVar3 == null) {
                vcpVar3 = defpackage.vcp.a;
            }
            if (vcpVar3.b == 3) {
                vbwVarB = vbw.b(((java.lang.Integer) vcpVar3.c).intValue());
                if (vbwVarB == null) {
                    vbwVarB = vbw.ab;
                }
            } else {
                vbwVarB = vbw.a;
            }
            switch (vbwVarB.ordinal()) {
                case 0:
                case 51:
                case 52:
                case 53:
                    return 5;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 47:
                case 48:
                case 49:
                    return 2;
                case 31:
                case 32:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                    return 1;
                case 45:
                case 46:
                    return 3;
                case 50:
                    return 4;
                default:
                    throw new defpackage.aois();
            }
        }
        if ((vcpVar3 == null ? defpackage.vcp.a : vcpVar3).b != 2) {
            throw new java.lang.IllegalStateException("No VVM error present.");
        }
        if (vcpVar3 == null) {
            vcpVar3 = defpackage.vcp.a;
        }
        if (vcpVar3.b == 2) {
            vbxVarB = vbx.b(((java.lang.Integer) vcpVar3.c).intValue());
            if (vbxVarB == null) {
                vbxVarB = vbx.o;
            }
        } else {
            vbxVarB = vbx.a;
        }
        switch (vbxVarB.ordinal()) {
            case 0:
            case 14:
                return 5;
            case 1:
            case 2:
            case 3:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1;
            case 4:
            case 5:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
                return 2;
            case 12:
                return 4;
            default:
                throw new defpackage.aois();
        }
    }

    public static /* synthetic */ vaa aL(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static defpackage.vbj aM(android.content.Context context) {
        return (defpackage.vbj) defpackage.agab.aH(context, defpackage.vbj.class);
    }

    public static /* synthetic */ uzx aN(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ vaa aO(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static defpackage.vba aP(android.content.Context context) {
        return (defpackage.vba) defpackage.agab.aH(context, defpackage.vba.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aQ(al alVar, uza uzaVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new uzb(uzaVar, 1));
        defpackage.ahvr.d(alVar, ahtf.class, new uzb(uzaVar, 0));
    }

    public static boolean aR(android.net.Uri uri, android.net.Uri uri2) {
        if (uri == null) {
            if (uri2 == null) {
                return true;
            }
        } else if (uri2 != null) {
            return uri.equals(uri2);
        }
        return false;
    }

    public static int aS(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
        return defpackage.aooc.t(cB(24.0f, activity), (defpackage.gqg.a.b().a(activity).a().width() - cB(560.0f, activity)) / 2);
    }

    public static android.content.Intent aT(java.lang.CharSequence charSequence) {
        return new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("sms:".concat(java.lang.String.valueOf(java.lang.String.valueOf(charSequence)))));
    }

    public static void aU(android.content.Intent intent, java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            intent.putExtra("phone", charSequence);
        }
    }

    public static defpackage.uxv aV(android.content.Context context) {
        return (defpackage.uxv) defpackage.agab.aH(context, defpackage.uxv.class);
    }

    public static j$.util.Optional aW(android.app.Activity activity, uxq uxqVar) {
        return j$.util.Optional.of(new uxs(activity, uxqVar, 1));
    }

    public static java.lang.String aX(uwt uwtVar) {
        defpackage.aooh.f(uwtVar, "<this>");
        int i = uwtVar.b;
        int iX = defpackage.a.X(i);
        if (iX == 0) {
            throw null;
        }
        int i2 = iX - 1;
        if (i2 == 0) {
            int i3 = (i == 1 ? (uwv) uwtVar.c : uwv.a).d;
        } else if (i2 == 1) {
            int iAR = defpackage.a.aR((i == 2 ? (uww) uwtVar.c : uww.a).d);
            if (iAR == 0) {
                iAR = 1;
            }
            int i4 = iAR - 2;
            if (i4 == 1) {
                return "x-bgs";
            }
            if (i4 == 2) {
                return "x-bgg";
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("No Voice Specified");
            }
            if (((i == 3 ? (uwx) uwtVar.c : uwx.a).d == 0 ? 2 : 1) - 2 == 0) {
                return "x-star02";
            }
        }
        return "default";
    }

    public static java.util.Locale aY(uwt uwtVar) {
        java.lang.String str;
        defpackage.aooh.f(uwtVar, "<this>");
        int i = uwtVar.b;
        int iX = defpackage.a.X(i);
        if (iX == 0) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        int i2 = iX - 1;
        if (i2 == 0) {
            if (((i == 1 ? (uwv) uwtVar.c : uwv.a).b & 1) == 0) {
                throw new java.lang.IllegalStateException("No Language Specified");
            }
            str = (uwtVar.b == 1 ? (uwv) uwtVar.c : uwv.a).c;
        } else if (i2 == 1) {
            if (((i == 2 ? (uww) uwtVar.c : uww.a).b & 1) == 0) {
                throw new java.lang.IllegalStateException("No Language Specified");
            }
            str = (uwtVar.b == 2 ? (uww) uwtVar.c : uww.a).c;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("No Voice Specified");
            }
            if (((i == 3 ? (uwx) uwtVar.c : uwx.a).b & 1) == 0) {
                throw new java.lang.IllegalStateException("No Language Specified");
            }
            str = (uwtVar.b == 3 ? (uwx) uwtVar.c : uwx.a).c;
        }
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        defpackage.aooh.e(localeForLanguageTag, "forLanguageTag(...)");
        return localeForLanguageTag;
    }

    public static /* synthetic */ uzx aZ(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ void aa(wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            wgb wgbVar = (wgb) it.next();
            wgbVar.i(wfv.a[wgcVar.b(wgbVar)]);
        }
    }

    public static defpackage.wef ab(android.content.Context context) {
        return (defpackage.wef) defpackage.agab.aH(context, defpackage.wef.class);
    }

    public static /* synthetic */ uzx ac(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ uzx ad(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ java.lang.String ae(int i) {
        if (i == 1) {
            return "COLLAPSED";
        }
        if (i == 2) {
            return "COLLAPSING";
        }
        if (i != 3) {
            return i != 4 ? "null" : "EXPANDING";
        }
        return "EXPANDED";
    }

    public static zkz af(int i) {
        defpackage.akzx akzxVarM = zkz.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        defpackage.akzx akzxVarM2 = zky.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        akzxVarM2.u();
        zky zkyVar = akzxVarM2.b;
        zkyVar.c = defpackage.a.R(i);
        zkyVar.b |= 1;
        zky zkyVarR = akzxVarM2.r();
        defpackage.aooh.e(zkyVarR, "build(...)");
        zky zkyVar2 = zkyVarR;
        defpackage.aooh.f(zkyVar2, "value");
        akzxVarM.u();
        zkz zkzVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(zkyVar2);
        zkzVar.c = zkyVar2;
        zkzVar.b |= 1;
        zkz zkzVarR = akzxVarM.r();
        defpackage.aooh.e(zkzVarR, "build(...)");
        return zkzVarR;
    }

    public static boolean ag(defpackage.zpm zpmVar) {
        defpackage.aooh.f(zpmVar, "<this>");
        return zpmVar.a().size() > 1;
    }

    public static defpackage.akzm ah(j$.time.Instant instant, j$.time.Instant instant2) {
        defpackage.aooh.f(instant, "<this>");
        defpackage.aooh.f(instant2, "toInstant");
        j$.time.Duration durationBetween = j$.time.Duration.between(instant, instant2);
        defpackage.aooh.e(durationBetween, "between(...)");
        return defpackage.aooc.at(durationBetween);
    }

    public static /* synthetic */ vqu ai(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu aj(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ uzx ak(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ int al(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof vyq) {
            return 0;
        }
        return obj instanceof vyo ? 1 : -2;
    }

    public static ied am(uzo uzoVar) {
        defpackage.aooh.f(uzoVar, "entry");
        heq heqVarT = hgz.t(ied.a.m());
        uzn uznVar = uzoVar.c;
        if (uznVar == null) {
            uznVar = uzn.a;
        }
        java.lang.String str = uznVar.f;
        defpackage.aooh.e(str, "getVoicemailUri(...)");
        heqVarT.H(str);
        uzn uznVar2 = uzoVar.c;
        if (uznVar2 == null) {
            uznVar2 = uzn.a;
        }
        heqVarT.F(uznVar2.g);
        heqVarT.E(iec.b);
        return heqVarT.D();
    }

    public static iek an(ied iedVar) {
        if (iedVar == null) {
            return ao();
        }
        defpackage.akzx akzxVarL = ao().L();
        akzxVarL.u();
        iek iekVar = akzxVarL.b;
        j$.util.Objects.requireNonNull(iedVar);
        iekVar.c = iedVar;
        iekVar.b |= 1;
        iek iekVarR = akzxVarL.r();
        defpackage.aooh.e(iekVarR, "build(...)");
        return iekVarR;
    }

    public static iek ao() {
        heq heqVarL = hhb.l(iek.a.m());
        heqVarL.B();
        heqVarL.C();
        defpackage.akzx akzxVar = (defpackage.akzx) heqVarL.a;
        akzxVar.u();
        akzxVar.b.f = true;
        akzxVar.u();
        akzxVar.b.g = true;
        return heqVarL.y();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void ap(defpackage.aw awVar, vxq vxqVar) throws afeb {
        defpackage.ahvr.e(awVar, ieh.class, new uzb(vxqVar, 10));
        defpackage.ahvr.e(awVar, iei.class, new uzb(vxqVar, 11));
        defpackage.ahvr.e(awVar, iej.class, new uzb(vxqVar, 12));
        defpackage.ahvr.e(awVar, vwg.class, new uzb(vxqVar, 13));
        defpackage.ahvr.e(awVar, vwr.class, new uzb(vxqVar, 14));
        defpackage.ahvr.e(awVar, vxu.class, new uzb(vxqVar, 15));
        defpackage.ahvr.e(awVar, vxv.class, new uzb(vxqVar, 16));
        defpackage.ahvr.e(awVar, vxw.class, new uzb(vxqVar, 17));
        defpackage.ahvr.e(awVar, vxx.class, new uzb(vxqVar, 18));
        defpackage.ahvr.e(awVar, wej.class, new uzb(vxqVar, 8));
        defpackage.ahvr.e(awVar, wek.class, new uzb(vxqVar, 9));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aq(al alVar, vwh vwhVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new uzb(vwhVar, 6));
        defpackage.ahvr.d(alVar, ahtf.class, new uzb(vwhVar, 7));
    }

    public static /* synthetic */ vqu ar(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqf as(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static android.telecom.PhoneAccountHandle at(vtq vtqVar) {
        return new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString(vtqVar.c), vtqVar.d);
    }

    public static vtq au(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        java.lang.String id = phoneAccountHandle.getId();
        defpackage.akzx akzxVarM = vtq.a.m();
        akzxVarM.u();
        vtq vtqVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strFlattenToString);
        vtqVar.b |= 1;
        vtqVar.c = strFlattenToString;
        akzxVarM.u();
        vtq vtqVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(id);
        vtqVar2.b |= 2;
        vtqVar2.d = id;
        return akzxVarM.r();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    public static j$.util.Optional av(android.content.Context context, j$.util.Optional optional) {
        vbs vbsVarB;
        int i;
        j$.util.Optional optionalOf;
        vmu vmuVar = new vmu(context, 11);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = vmuVar.a;
            defpackage.vzi vziVar = (defpackage.vzi) obj;
            if (vziVar.h == 4 || (vziVar.b & 16) != 0) {
                defpackage.vcp vcpVar = vziVar.g;
                if (vcpVar == null) {
                    vcpVar = defpackage.vcp.a;
                }
                if (vcpVar.b == 1) {
                    vbsVarB = vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                    if (vbsVarB == null) {
                        vbsVarB = vbs.H;
                    }
                } else {
                    vbsVarB = vbs.a;
                }
                int iOrdinal = vbsVarB.ordinal();
                if (iOrdinal == 0 || iOrdinal == 33) {
                    i = 0;
                } else if (iOrdinal != 23) {
                    i = iOrdinal != 24 ? 2132020890 : 2132017993;
                } else {
                    i = 2132019815;
                }
                if (i != 0) {
                    optionalOf = j$.util.Optional.of(((android.content.Context) obj2).getString(i));
                } else {
                    optionalOf = j$.util.Optional.empty();
                }
            } else {
                optionalOf = j$.util.Optional.empty();
            }
            optional = optionalOf;
            optional.getClass();
        }
        return optional;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aw(ger gerVar, vpc vpcVar) throws afeb {
        defpackage.ahvr.e(gerVar, tyr.class, new uzb(vpcVar, 2));
        defpackage.ahvr.e(gerVar, vnz.class, new vod(2));
        defpackage.ahvr.e(gerVar, voa.class, new vod(3));
        defpackage.ahvr.e(gerVar, vob.class, new uzb(vpcVar, 3));
    }

    public static defpackage.vow ax(android.content.Context context) {
        return (defpackage.vow) defpackage.agab.aH(context, defpackage.vow.class);
    }

    public static defpackage.vop ay(android.content.Context context) {
        return (defpackage.vop) defpackage.agab.aH(context, defpackage.vop.class);
    }

    public static /* synthetic */ vqf az(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void b(al alVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new vod(5));
    }

    public static java.util.List bA(java.util.List list) {
        android.net.Uri uri;
        defpackage.aooh.f(list, "items");
        java.util.List listBX = defpackage.ajsz.bX(list, new bdt(new defpackage.aonj[]{new defpackage.ukw(4), new defpackage.ukw(5)}, 16, (byte[]) null));
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listBX, 10));
        int i = 0;
        for (java.lang.Object obj : listBX) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.ajsz.bh();
            }
            unp unpVar = (unp) obj;
            int size = list.size();
            java.lang.String str = unpVar.c;
            java.lang.String str2 = unpVar.e;
            java.lang.String str3 = unpVar.g;
            if (str3 != null) {
                android.net.Uri uri2 = android.net.Uri.parse(str3);
                defpackage.aooh.e(uri2, "parse(...)");
                uri = uri2;
            } else {
                uri = null;
            }
            unf unfVar = unpVar.i;
            java.util.List list2 = unpVar.h;
            defpackage.wgi wgiVar = unpVar.j;
            arrayList.add(new umy(unpVar.d, str2, unpVar.a, unpVar.b, str, uri, unfVar, list2, wgiVar.c, wgiVar.d, i, size));
            i = i2;
        }
        return arrayList;
    }

    public static defpackage.umq bB(android.content.Context context) {
        return (defpackage.umq) defpackage.agab.aH(context, defpackage.umq.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bC(defpackage.aw awVar, umd umdVar) throws afeb {
        defpackage.ahvr.e(awVar, ulv.class, new rrj(umdVar, 9));
        defpackage.ahvr.e(awVar, ahtd.class, new rrj(umdVar, 10));
        defpackage.ahvr.e(awVar, ahte.class, new iya(19));
        defpackage.ahvr.e(awVar, ahtf.class, new rrj(umdVar, 11));
    }

    public static /* synthetic */ int bD(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof ukp) {
            return 0;
        }
        return obj instanceof ukq ? 1 : -2;
    }

    public static int bE(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object bF(defpackage.uha uhaVar, java.lang.String str, defpackage.aoln aolnVar) throws java.io.IOException {
        ugy ugyVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof ugy) {
            ugyVar = (ugy) aolnVar;
            int i = ugyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugyVar.b = i - Integer.MIN_VALUE;
            } else {
                ugyVar = new ugy(uhaVar, aolnVar);
            }
        } else {
            ugyVar = new ugy(uhaVar, aolnVar);
        }
        java.lang.Object obj = ugyVar.a;
        uhd uhdVar = defpackage.aolu.a;
        int i2 = ugyVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(ugyVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(915, "MoiraiDao.getMoiraiDataEntity");
            try {
                ugyVar.d = ahoqVarZ;
                ugyVar.b = 1;
                java.lang.Object objO = defpackage.dez.o(((defpackage.uhc) uhaVar).a, true, true, new defpackage.tge(str, 6), ugyVar);
                if (objO != uhdVar) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return uhdVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = ugyVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        uhdVar = (uhd) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return uhdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object bG(defpackage.uha uhaVar, uhd uhdVar, defpackage.aoln aolnVar) throws java.io.IOException {
        ugz ugzVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof ugz) {
            ugzVar = (ugz) aolnVar;
            int i = ugzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugzVar.b = i - Integer.MIN_VALUE;
            } else {
                ugzVar = new ugz(uhaVar, aolnVar);
            }
        } else {
            ugzVar = new ugz(uhaVar, aolnVar);
        }
        java.lang.Object obj = ugzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ugzVar.b;
        byte[] bArr = null;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = ugzVar.d;
            try {
                defpackage.aooc.af(obj);
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj);
        if (!defpackage.ahvr.R(ugzVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(916, "MoiraiDao.insertMoiraiDataEntity");
        try {
            ugzVar.d = ahoqVarZ;
            ugzVar.b = 1;
            if (uhdVar == null) {
                throw null;
            }
            if (defpackage.dez.o(((defpackage.uhc) uhaVar).a, false, true, new defpackage.uph(uhaVar, uhdVar, i3, bArr), ugzVar) == aoluVar) {
                return aoluVar;
            }
            ahoqVar = ahoqVarZ;
            defpackage.ajsz.ak(ahoqVar, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    public static int bH(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            default:
                return 1;
        }
    }

    public static /* synthetic */ vaa bI(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ vaa bJ(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ vaa bK(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ vqu bL(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu bM(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu bN(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu bO(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu bP(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu bQ(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static defpackage.ufc bR(android.content.Context context) {
        return (defpackage.ufc) defpackage.agab.aH(context, defpackage.ufc.class);
    }

    public static aiyn bS(defpackage.udk udkVar) {
        int iOrdinal = udkVar.ordinal();
        if (iOrdinal == 0) {
            return aiyn.d;
        }
        if (iOrdinal == 1) {
            return aiyn.b;
        }
        if (iOrdinal == 2) {
            return aiyn.c;
        }
        throw new defpackage.aois();
    }

    public static aiyh bT(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? aiyh.a : aiyh.b;
        }
        return aiyh.c;
    }

    public static boolean bU(ucu ucuVar) {
        defpackage.aooh.f(ucuVar, "<this>");
        defpackage.udj udjVarB = defpackage.udj.b(ucuVar.d);
        if (udjVarB == null) {
            udjVarB = defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        return udjVarB == defpackage.udj.SPAM_STATUS_SPAM;
    }

    public static void bV(ucg ucgVar, defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        boolean z2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-403724473);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ucgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.bvo.d(aomyVar2, defpackage.azm.e(cmwVar, 64.0f), z2, defpackage.bge.a, defpackage.den.ak(cavVarB).p, 0L, 0.0f, 0.0f, null, null, defpackage.cfo.j(1391956956, new defpackage.ubr(ucgVar, i4), cavVarB), cavVar2, 992);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(ucgVar, aomyVar, cmwVar, z, i, 9);
        }
    }

    public static void bW(uch uchVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1868247354);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(uchVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            boolean z = uchVar.g;
            if (z) {
                cavVarB.u(1524459292);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(1524397788);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                int i4 = i2 & 14;
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (i4 == 4 || objR == defpackage.cau.a) {
                    objR = new defpackage.uer(uchVar, (defpackage.aoln) null, 1);
                    cbtVar.ab(objR);
                }
                defpackage.cbp.g(bool, (defpackage.aonn) objR, cavVarB);
                cbtVar.W(false);
            }
            defpackage.mni.cs(uchVar.a, uchVar.b, uchVar.d, defpackage.den.x(cmwVar, "sonic_grid"), uchVar.h, !z, defpackage.cfo.j(-159669853, new defpackage.ubr(uchVar, 3), cavVarB), cavVarB, 1572864, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(uchVar, cmwVar, i, 6);
        }
    }

    public static tyv bX(int i) {
        int i2 = i - 2;
        if (i2 != 0) {
            if (i2 == 2) {
                return tyv.b;
            }
            if (i2 == 3) {
                return tyv.d;
            }
            if (i2 == 4) {
                return tyv.e;
            }
            if (i2 != 5 && i2 == 6) {
                return tyv.g;
            }
        }
        return tyv.f;
    }

    public static int bY(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 6;
        }
        if (i != 5) {
            return i != 6 ? 0 : 8;
        }
        return 7;
    }

    public static defpackage.aohh bZ(defpackage.aohh aohhVar, android.content.Context context, defpackage.aoin aoinVar) {
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || android.os.Build.VERSION.SDK_INT < 35) {
            return aohhVar;
        }
        android.content.AttributionSource attributionSourceM = ac$.ExternalSyntheticApiModelOutline0.m(rk$.ExternalSyntheticApiModelOutline0.m(context, rk$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline1.m(new android.content.ContextParams.Builder(), true))));
        defpackage.aooh.e(attributionSourceM, "getAttributionSource(...)");
        return agwm.q(aohhVar, afch.a(), attributionSourceM);
    }

    public static /* synthetic */ vaa ba(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ vqf bb(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static /* synthetic */ vqf bc(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static /* synthetic */ vqf bd(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static void be(android.view.ViewGroup viewGroup, defpackage.gkz gkzVar) {
        if (gkzVar == null) {
            gkzVar = new defpackage.glh(null);
        }
        gkzVar.H(com.google.android.material.tabs.TabLayout.class);
        defpackage.gld.b(viewGroup, gkzVar);
    }

    public static void bf(android.content.Context context, utu utuVar) throws java.io.IOException {
        defpackage.ahqx.l(context, uvd.a(context, utuVar));
    }

    public static void bg(android.content.Context context, utu utuVar) throws java.io.IOException {
        defpackage.ahqx.l(context, uvg.a(context, utuVar));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bh(al alVar, uwc uwcVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new rrj(uwcVar, 19));
        defpackage.ahvr.d(alVar, ahtf.class, new rrj(uwcVar, 20));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bi(al alVar, uvo uvoVar) throws afeb {
        defpackage.ahvr.d(alVar, utt.class, new rrj(uvoVar, 17));
        defpackage.ahvr.d(alVar, uwa.class, new iya(20));
        defpackage.ahvr.d(alVar, uwb.class, new rrj(uvoVar, 18));
    }

    public static defpackage.ajcq bj() {
        return defpackage.aiql.z(uts.a);
    }

    public static defpackage.ajcq bk() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    public static defpackage.ajcq bl() {
        return defpackage.aiql.z(java.lang.Boolean.TRUE);
    }

    public static defpackage.ajcq bm() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bn(defpackage.aw awVar, usy usyVar) throws afeb {
        defpackage.ahvr.e(awVar, uta.class, new rrj(usyVar, 14));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bo(al alVar, uss ussVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new rrj(ussVar, 12));
        defpackage.ahvr.d(alVar, ahtf.class, new rrj(ussVar, 13));
    }

    public static int bp(android.content.Context context, urp urpVar) {
        return defpackage.agab.u(context, urpVar.q, urpVar.r);
    }

    public static android.animation.TimeInterpolator bq(android.content.Context context, urq urqVar) {
        emb linearInterpolator;
        int iOrdinal = urqVar.ordinal();
        if (iOrdinal == 0) {
            linearInterpolator = new android.view.animation.LinearInterpolator();
        } else if (iOrdinal == 1) {
            linearInterpolator = new defpackage.emc();
        } else if (iOrdinal == 2) {
            linearInterpolator = new emb();
        } else if (iOrdinal == 3) {
            linearInterpolator = new defpackage.eme();
        } else {
            if (iOrdinal != 4) {
                throw new java.lang.UnsupportedOperationException(" unsupported MotionInterpolator");
            }
            linearInterpolator = new defpackage.emd();
        }
        return defpackage.agab.C(context, urqVar.f, linearInterpolator);
    }

    public static android.graphics.drawable.Drawable br(android.content.Context context) {
        int iBt = bt(context);
        float dimension = context.getResources().getDimension(2131165600);
        return bs(iBt, dimension, dimension, 0.0f, 0.0f);
    }

    public static android.graphics.drawable.Drawable bs(int i, float f, float f2, float f3, float f4) {
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static int bt(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        return defpackage.urg.c(context, 2130969108);
    }

    public static /* synthetic */ boolean bu(upl uplVar) {
        int i = uplVar.f;
        upk upkVarB = upk.b(i);
        if (upkVarB == null) {
            upkVarB = upk.f;
        }
        if (upkVarB != upk.c) {
            upk upkVarB2 = upk.b(i);
            if (upkVarB2 == null) {
                upkVarB2 = upk.f;
            }
            if (upkVarB2 != upk.d) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int bv(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof uov) {
            return 0;
        }
        return obj instanceof defpackage.uou ? 1 : -2;
    }

    public static /* synthetic */ vqf bw(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static /* synthetic */ vqf bx(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static /* synthetic */ vqf by(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqf(akzxVar);
    }

    public static void bz(ums umsVar, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(aomyVar, "onDismiss");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1723657887);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(umsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            boolean zD = cavVarB.D(umsVar) | cavVarB.D(context);
            boolean z = (i2 & 112) == 32;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((zD | z) || objR == defpackage.cau.a) {
                objR = new defpackage.hcn(umsVar, context, aomyVar, (defpackage.aoln) null, 19);
                cbtVar.ab(objR);
            }
            defpackage.cbp.g(umsVar, (defpackage.aonn) objR, cavVarB);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(umsVar, aomyVar, i, 7, null);
        }
    }

    public static /* synthetic */ int c(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof wsp) {
            return 0;
        }
        return obj instanceof wso ? 1 : -2;
    }

    private static java.lang.String cA(java.lang.String str, int i) {
        return str.substring(0, java.lang.Math.min(i, str.length()));
    }

    private static int cB(float f, android.app.Activity activity) {
        return (int) (f * activity.getResources().getDisplayMetrics().density);
    }

    public static defpackage.afcg ca(defpackage.afcg afcgVar, android.content.Context context, defpackage.aoin aoinVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aoinVar, "enableAttributionSource");
        return (defpackage.afcg) bZ(afcgVar, context, aoinVar);
    }

    public static java.util.List cb(android.os.Bundle bundle, defpackage.txd txdVar) {
        java.lang.String str = (java.lang.String) defpackage.txh.c.get(txdVar);
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray == null) {
            ((defpackage.aimw) defpackage.txh.a.d().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelAvailability$LanguageDetailsReceiver$Companion", "parseLanguagesFromExtras", 230, "SodaAndroidSpeechModelAvailability.kt")).y("Null %s", str);
            return defpackage.aokc.a;
        }
        try {
            amkq amkqVarB = defpackage.alad.B(amkq.a, byteArray, defpackage.akzq.a());
            defpackage.aooh.e(amkqVarB, "parseFrom(...)");
            defpackage.alat alatVar = amkqVarB.b;
            defpackage.aooh.e(alatVar, "getLanguagePackList(...)");
            return alatVar;
        } catch (defpackage.alaz e) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.txh.a.d()).k(e).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelAvailability$LanguageDetailsReceiver$Companion", "parseLanguagesFromExtras", 242, "SodaAndroidSpeechModelAvailability.kt")).y("Failed to parse language packs with availability: %s", str);
            return defpackage.aokc.a;
        }
    }

    public static /* synthetic */ uzx cc(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ uzx cd(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ vaa ce(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ uzx cf(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ vaa cg(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ uzx ch(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ uzx ci(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static defpackage.tvf cj(android.content.Context context) {
        return (defpackage.tvf) defpackage.agab.aH(context, defpackage.tvf.class);
    }

    public static void ck(tuu tuuVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1426175845);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(tuuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            aon aonVarE = rl.e(cavVarB, 0);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarF = rl.f(defpackage.azm.c(cmtVar, 1.0f), aonVarE, true);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarF);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aehj.V(tuuVar.a, defpackage.den.aY(defpackage.azm.o(defpackage.azm.d(cmtVar, 1.0f), null, 3), 16.0f), 0, false, null, cavVarB, 24624);
            defpackage.den.aR(defpackage.awy.b(cmtVar, 1.0f, true), cavVarB);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(tuuVar, i, 13);
        }
    }

    public static /* synthetic */ java.lang.String cl(int i) {
        if (i != 1) {
            return i != 2 ? "NOT_SCAM" : "SCAM";
        }
        return "UNKNOWN";
    }

    public static int cm(int i) {
        if (i == 0) {
            return 7;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        if (i != 1000) {
            return i != 1001 ? 0 : 6;
        }
        return 5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void cn(ger gerVar, tsq tsqVar) throws afeb {
        defpackage.ahvr.e(gerVar, tyr.class, new rrj(tsqVar, 5));
    }

    public static /* synthetic */ java.lang.String co(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "CONTENTTYPE_NOT_SET";
        }
        return "FIXED_CONTENT_ALERT";
    }

    public static int cp(int i) {
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    public static /* synthetic */ uzx cq(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ vqu cr(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu cs(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu ct(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu cu(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu cv(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu cw(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu cx(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    private static java.lang.String cz(android.content.Context context, int i) {
        java.util.Locale localeAe = defpackage.gus.ae(context);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j = i;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        return java.lang.String.format(localeAe, "%d:%02d", java.lang.Long.valueOf(j / 60000), java.lang.Long.valueOf((j / 1000) % 60));
    }

    public static /* synthetic */ vqu d(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static /* synthetic */ vqu e(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static boolean f(android.os.BaseBundle baseBundle, java.lang.String str) {
        defpackage.aooh.f(baseBundle, "<this>");
        java.lang.Object obj = baseBundle.get(str);
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return false;
        }
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).booleanValue();
        }
        if (obj instanceof java.lang.Integer) {
            return defpackage.aooh.n(obj, 1);
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void g(ger gerVar, xan xanVar) throws afeb {
        defpackage.ahvr.e(gerVar, tyr.class, new wtl(xanVar, 13));
    }

    public static /* synthetic */ java.lang.String h(int i) {
        if (i == 1) {
            return "GREETING_TO_AGENT";
        }
        if (i != 2) {
            return i != 3 ? "RECORDING_REFUSAL_ACK" : "DELAYED_USER_MESSAGE";
        }
        return "PROBING_PROMPT";
    }

    public static /* synthetic */ java.lang.String i(int i) {
        switch (i) {
            case 1:
                return "WAITING";
            case 2:
                return "READY";
            case 3:
                return "ACTIVATED";
            case 4:
                return "UNABLE_TO_DETECT_EVENT";
            case 5:
                return "EVENT_DETECTED";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CONNECTING";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "ERROR";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "VALUE_NOT_SET";
            default:
                return "null";
        }
    }

    public static int j(int i) {
        if (i == 0) {
            return 8;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 5;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 7;
            default:
                return 0;
        }
    }

    public static int k(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void l(al alVar, taq taqVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new wtl(taqVar, 11));
        defpackage.ahvr.d(alVar, ahtf.class, new wtl(taqVar, 12));
    }

    public static /* synthetic */ java.lang.String m(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_ISSUE";
            case 2:
                return "NO_INCOMING_AUDIO";
            case 3:
                return "NO_OUTGOING_AUDIO";
            case 4:
                return "MISSING_AUDIO_START";
            case 5:
                return "CHOPPY_AUDIO";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "LOW_VOLUME";
            default:
                return "OTHER";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object n(yqt yqtVar, defpackage.aolr aolrVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        zgh zghVar;
        if (aolnVar instanceof zgh) {
            zghVar = (zgh) aolnVar;
            int i = zghVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zghVar.b = i - Integer.MIN_VALUE;
            } else {
                zghVar = new zgh(aolnVar);
            }
        } else {
            zghVar = new zgh(aolnVar);
        }
        java.lang.Object objAj = zghVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zghVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.ytl ytlVar = new defpackage.ytl(aonnVar, yqtVar, (defpackage.aoln) null, 9);
            zghVar.b = 1;
            objAj = defpackage.aoov.aj(aolrVar, ytlVar, zghVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        return ((defpackage.aoiw) objAj).a;
    }

    public static boolean o(java.lang.Object obj) {
        java.lang.Throwable thC = defpackage.aoiw.c(obj);
        if (thC == null) {
            return false;
        }
        return defpackage.anqw.d(thC).equals(defpackage.anqw.j);
    }

    public static boolean p(zfe zfeVar, zfe zfeVar2) {
        return defpackage.aooh.n(zfeVar.a(), zfeVar2.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object q(zey zeyVar, long j, defpackage.aoln aolnVar) throws java.io.IOException {
        zev zevVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zev) {
            zevVar = (zev) aolnVar;
            int i = zevVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zevVar.b = i - Integer.MIN_VALUE;
            } else {
                zevVar = new zev(zeyVar, aolnVar);
            }
        } else {
            zevVar = new zev(zeyVar, aolnVar);
        }
        java.lang.Object obj = zevVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zevVar.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = zevVar.d;
            try {
                defpackage.aooc.af(obj);
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj);
        if (!defpackage.ahvr.R(zevVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1221, "DialerHasRcsDao.deleteEarlyThanInternal");
        try {
            zevVar.d = ahoqVarZ;
            zevVar.b = 1;
            if (defpackage.dez.o(((zfa) zeyVar).a, false, true, new bpd(j, 11), zevVar) == aoluVar) {
                return aoluVar;
            }
            ahoqVar = ahoqVarZ;
            defpackage.ajsz.ak(ahoqVar, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object r(zey zeyVar, java.lang.String str, defpackage.aoln aolnVar) throws java.io.IOException {
        zew zewVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zew) {
            zewVar = (zew) aolnVar;
            int i = zewVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zewVar.b = i - Integer.MIN_VALUE;
            } else {
                zewVar = new zew(zeyVar, aolnVar);
            }
        } else {
            zewVar = new zew(zeyVar, aolnVar);
        }
        java.lang.Object obj = zewVar.a;
        zfc zfcVar = defpackage.aolu.a;
        int i2 = zewVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(zewVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1222, "DialerHasRcsDao.hasRcs");
            try {
                zewVar.d = ahoqVarZ;
                zewVar.b = 1;
                java.lang.Object objO = defpackage.dez.o(((zfa) zeyVar).a, true, true, new xms(str, 9), zewVar);
                if (objO != zfcVar) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return zfcVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = zewVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        zfcVar = (zfc) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return zfcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object s(zey zeyVar, zfc zfcVar, defpackage.aoln aolnVar) throws java.io.IOException {
        zex zexVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zex) {
            zexVar = (zex) aolnVar;
            int i = zexVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zexVar.b = i - Integer.MIN_VALUE;
            } else {
                zexVar = new zex(zeyVar, aolnVar);
            }
        } else {
            zexVar = new zex(zeyVar, aolnVar);
        }
        java.lang.Object obj = zexVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zexVar.b;
        byte[] bArr = null;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = zexVar.d;
            try {
                defpackage.aooc.af(obj);
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj);
        if (!defpackage.ahvr.R(zexVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1223, "DialerHasRcsDao.insertOrUpdate");
        try {
            zexVar.d = ahoqVarZ;
            zexVar.b = 1;
            if (zfcVar == null) {
                throw null;
            }
            if (defpackage.dez.o(((zfa) zeyVar).a, false, true, new defpackage.uph(zeyVar, zfcVar, 20, bArr), zexVar) == aoluVar) {
                return aoluVar;
            }
            ahoqVar = ahoqVarZ;
            defpackage.ajsz.ak(ahoqVar, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object t(zer zerVar, java.util.List list, defpackage.aoln aolnVar) throws java.io.IOException {
        zep zepVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zep) {
            zepVar = (zep) aolnVar;
            int i = zepVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zepVar.b = i - Integer.MIN_VALUE;
            } else {
                zepVar = new zep(zerVar, aolnVar);
            }
        } else {
            zepVar = new zep(zerVar, aolnVar);
        }
        java.lang.Object obj = zepVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zepVar.b;
        byte[] bArr = null;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(zepVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1219, "DialerContactStatusDao.getStatus");
            try {
                zepVar.d = ahoqVarZ;
                zepVar.b = 1;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("SELECT * from dialer_contact_status_data where e164_phone_number IN (");
                defpackage.dzk.P(sb, list.size());
                sb.append(')');
                java.lang.Object objO = defpackage.dez.o(((zet) zerVar).a, true, true, new defpackage.uph(sb.toString(), list, 18, bArr), zepVar);
                if (objO != obj2) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = zepVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        obj2 = (java.util.List) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object u(zer zerVar, java.util.List list, defpackage.aoln aolnVar) throws java.io.IOException {
        zeq zeqVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zeq) {
            zeqVar = (zeq) aolnVar;
            int i = zeqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zeqVar.b = i - Integer.MIN_VALUE;
            } else {
                zeqVar = new zeq(zerVar, aolnVar);
            }
        } else {
            zeqVar = new zeq(zerVar, aolnVar);
        }
        java.lang.Object obj = zeqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zeqVar.b;
        byte[] bArr = null;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = zeqVar.d;
            try {
                defpackage.aooc.af(obj);
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj);
        if (!defpackage.ahvr.R(zeqVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1220, "DialerContactStatusDao.insertOrUpdate");
        try {
            zeqVar.d = ahoqVarZ;
            zeqVar.b = 1;
            if (list == null) {
                throw null;
            }
            if (defpackage.dez.o(((zet) zerVar).a, false, true, new defpackage.uph(zerVar, list, 19, bArr), zeqVar) == aoluVar) {
                return aoluVar;
            }
            ahoqVar = ahoqVarZ;
            defpackage.ajsz.ak(ahoqVar, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    public static /* synthetic */ defpackage.aojh v(zfp zfpVar, rze rzeVar) {
        defpackage.aooh.f(rzeVar, "it");
        int iOrdinal = zfpVar.ordinal();
        if (iOrdinal == 0) {
            ((qbe) rzeVar.a).c(defpackage.qbc.SESSION_PRECONDITION_FAILURE_NO_SERVICE);
        } else if (iOrdinal == 1) {
            ((qbe) rzeVar.a).c(defpackage.qbc.SESSION_PRECONDITION_FAILURE_CAPABILITY_NOT_RECOGNIZED);
        } else if (iOrdinal == 2) {
            ((qbe) rzeVar.a).c(defpackage.qbc.SESSION_PRECONDITION_FAILURE_CAPABILITY_NOT_AVAILABLE);
        } else if (iOrdinal == 3) {
            ((qbe) rzeVar.a).c(defpackage.qbc.SESSION_PRECONDITION_FAILURE_PROTOCOL_NOT_AVAILABLE);
        } else {
            if (iOrdinal != 4) {
                throw new defpackage.aois();
            }
            ((qbe) rzeVar.a).c(defpackage.qbc.SESSION_PRECONDITION_FAILURE_CALLEE_NOT_CAPABLE);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object w(zek zekVar, java.lang.String str, defpackage.aoln aolnVar) throws java.io.IOException {
        zei zeiVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zei) {
            zeiVar = (zei) aolnVar;
            int i = zeiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zeiVar.b = i - Integer.MIN_VALUE;
            } else {
                zeiVar = new zei(zekVar, aolnVar);
            }
        } else {
            zeiVar = new zei(zekVar, aolnVar);
        }
        java.lang.Object obj = zeiVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zeiVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(zeiVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1217, "DialerCapabilityDao.getCapability");
            try {
                zeiVar.d = ahoqVarZ;
                zeiVar.b = 1;
                java.lang.Object objO = defpackage.dez.o(((zem) zekVar).a, true, true, new xms(str, 8), zeiVar);
                if (objO != obj2) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = zeiVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        obj2 = (java.util.List) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object x(zek zekVar, java.util.List list, defpackage.aoln aolnVar) throws java.io.IOException {
        zej zejVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof zej) {
            zejVar = (zej) aolnVar;
            int i = zejVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zejVar.b = i - Integer.MIN_VALUE;
            } else {
                zejVar = new zej(zekVar, aolnVar);
            }
        } else {
            zejVar = new zej(zekVar, aolnVar);
        }
        java.lang.Object obj = zejVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zejVar.b;
        byte[] bArr = null;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = zejVar.d;
            try {
                defpackage.aooc.af(obj);
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj);
        if (!defpackage.ahvr.R(zejVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1218, "DialerCapabilityDao.insertOrUpdateList");
        try {
            zejVar.d = ahoqVarZ;
            zejVar.b = 1;
            if (list == null) {
                throw null;
            }
            if (defpackage.dez.o(((zem) zekVar).a, false, true, new defpackage.uph(zekVar, list, 17, bArr), zejVar) == aoluVar) {
                return aoluVar;
            }
            ahoqVar = ahoqVarZ;
            defpackage.ajsz.ak(ahoqVar, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    public static java.util.List y(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        defpackage.aooh.e(lowerCase, "toLowerCase(...)");
        java.util.List listS = defpackage.aoov.S(lowerCase, new java.lang.String[]{","}, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listS, 10));
        java.util.Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(defpackage.aoov.x((java.lang.String) it.next()).toString());
        }
        return arrayList;
    }

    public static ytw z(ytt yttVar, java.lang.Throwable th) {
        return th == null ? new ytv(yttVar) : new ytu(yttVar, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object cy(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        tzd tzdVar;
        if (aolnVar instanceof tzd) {
            tzdVar = (tzd) aolnVar;
            int i = tzdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzdVar.b = i - Integer.MIN_VALUE;
            } else {
                tzdVar = new tzd(this, aolnVar);
            }
        } else {
            tzdVar = new tzd(this, aolnVar);
        }
        java.lang.Object objD = tzdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tzdVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarX = afplVar.X();
            tzdVar.b = 1;
            objD = defpackage.aosv.D(ajcqVarX, tzdVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        java.lang.Object objAr = defpackage.aooc.ar(objD, tze.class);
        defpackage.aooh.e(objAr, "get(...)");
        return objAr;
    }

    public wsc(android.content.Context context, xkf xkfVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(xkfVar, "contract");
    }

    public /* synthetic */ wsc(byte[] bArr) {
    }

    public wsc() {
    }
}
