package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zlr {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public zlr(java.util.Set set, zpz zpzVar, aoss aossVar) {
        aooh.f(set, "stateHolders");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        this.a = set;
        this.b = zpzVar;
        this.c = aossVar;
        this.d = new ahda((byte[]) null);
    }

    public static void g(android.text.SpannableString spannableString, defpackage.wke wkeVar) {
        spannableString.setSpan(new android.text.style.StyleSpan(1), wkeVar.c, wkeVar.d, 17);
    }

    public static boolean j(vzi vziVar) {
        if (vziVar.j != 0 || vziVar.i != 0) {
            return true;
        }
        int i = vziVar.h;
        return (i == -100 || i == 0 || i == 3) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final void o(defpackage.zhk zhkVar, java.lang.String str) {
        this.b.put(zhkVar, new defpackage.zhl(str));
    }

    private final defpackage.vtw p() {
        akzx akzxVarM = defpackage.vtw.a.m();
        java.lang.String string = ((android.content.Context) this.d).getString(2132020838);
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar.b |= 2;
        vtwVar.d = string;
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        vtwVar2.c = 8;
        vtwVar2.b |= 1;
        return (defpackage.vtw) akzxVarM.p();
    }

    private final java.lang.CharSequence q(int i) {
        android.content.Context context = (android.content.Context) this.d;
        return pez.aq(context, context.getString(i, context.getString(2132020702)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r9, aoln r10) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlr.a(java.lang.String, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:60:0x014a  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0170 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v8, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(java.lang.String str, akfg akfgVar, aoln aolnVar) {
        defpackage.zhm zhmVar;
        defpackage.zhk zhkVar;
        java.lang.String strExtractNetworkPortion;
        java.lang.Object objAj;
        defpackage.akfx akfxVar;
        defpackage.akgu akguVarA;
        int i;
        akfg akfgVar2;
        defpackage.akgu akguVar;
        defpackage.zhk zhkVar2;
        java.lang.String str2;
        int i2;
        defpackage.akfx akfxVar2;
        java.lang.String str3;
        defpackage.zhk zhkVar3;
        akfg akfgVar3;
        akfg akfgVarD;
        java.lang.String str4;
        akfg akfgVarB;
        if (aolnVar instanceof defpackage.zhm) {
            zhmVar = (defpackage.zhm) aolnVar;
            int i3 = zhmVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zhmVar.c = i3 - Integer.MIN_VALUE;
            } else {
                zhmVar = new defpackage.zhm(this, aolnVar);
            }
        } else {
            zhmVar = new defpackage.zhm(this, aolnVar);
        }
        java.lang.Object objU = zhmVar.b;
        aolu aoluVar = aolu.a;
        int i4 = zhmVar.c;
        if (i4 == 0) {
            aooc.af(objU);
            if (str != null && !aoov.H(str)) {
                zhkVar = new defpackage.zhk(str, akfgVar);
                defpackage.zhl zhlVar = (defpackage.zhl) ((j$.util.concurrent.ConcurrentHashMap) this.b).get(zhkVar);
                if (zhlVar != null) {
                    return zhlVar.a;
                }
                strExtractNetworkPortion = android.telephony.PhoneNumberUtils.extractNetworkPortion(str);
                if (strExtractNetworkPortion == null || strExtractNetworkPortion.length() == 0) {
                    o(zhkVar, null);
                } else {
                    java.lang.Object obj = this.a;
                    zhmVar.d = akfgVar;
                    zhmVar.e = zhkVar;
                    zhmVar.f = strExtractNetworkPortion;
                    zhmVar.c = 1;
                    defpackage.uyg uygVar = (defpackage.uyg) obj;
                    objAj = aoov.aj((aolr) uygVar.a, new zhb(uygVar, (aoln) null, 2, (int[]) null), zhmVar);
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return null;
        }
        if (i4 == 1) {
            strExtractNetworkPortion = zhmVar.f;
            defpackage.zhk zhkVar4 = zhmVar.e;
            akfg akfgVar4 = zhmVar.d;
            aooc.af(objU);
            zhkVar = zhkVar4;
            akfgVar = akfgVar4;
            objAj = objU;
        } else {
            if (i4 == 2) {
                i2 = zhmVar.a;
                akguVar = zhmVar.h;
                akfxVar = zhmVar.g;
                str2 = zhmVar.f;
                zhkVar2 = zhmVar.e;
                akfgVar2 = zhmVar.d;
                aooc.af(objU);
                if (((java.lang.Boolean) objU).booleanValue()) {
                    ((zzx) this.d).l(new zbq(defpackage.zbr.bu));
                    java.lang.Object obj2 = this.c;
                    zhmVar.d = akfgVar2;
                    zhmVar.e = zhkVar2;
                    zhmVar.f = str2;
                    zhmVar.g = akfxVar;
                    zhmVar.h = akguVar;
                    zhmVar.a = i2;
                    zhmVar.c = 3;
                    objU = ((defpackage.uyg) obj2).u(zhmVar);
                    if (objU != aoluVar) {
                        return aoluVar;
                    }
                    akfxVar2 = akfxVar;
                    str3 = str2;
                    zhkVar3 = zhkVar2;
                    akfgVar3 = akfgVar2;
                } else {
                    i = i2;
                    zhkVar = zhkVar2;
                    akguVarA = akguVar;
                }
                if (i != 0 || akguVarA == null || (akfgVarD = akfxVar.d(akguVarA)) == null || akfgVarD == akfg.eq) {
                    o(zhkVar, null);
                    return null;
                }
                java.lang.String strX = akfxVar.x(akguVarA, 1);
                java.lang.String str5 = strX.length() == 0 ? null : strX;
                o(zhkVar, str5);
                return str5;
            }
            if (i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = zhmVar.a;
            akguVar = zhmVar.h;
            akfxVar2 = zhmVar.g;
            str3 = zhmVar.f;
            zhkVar3 = zhmVar.e;
            akfgVar3 = zhmVar.d;
            aooc.af(objU);
        }
        str4 = (java.lang.String) objU;
        if (str4 != null || aoov.H(str4) || (akfgVarB = akfg.b(str4)) == akfg.eq || akfgVarB == akfgVar3 || (akguVarA = defpackage.zhn.a(akfxVar2, str3, akfgVarB)) == null || !akfxVar2.q(akguVarA)) {
            i = i2;
            akguVarA = akguVar;
            akfxVar = akfxVar2;
            zhkVar = zhkVar3;
        } else {
            ((zzx) this.d).l(new zbq(defpackage.zbr.bv));
            akfxVar = akfxVar2;
            zhkVar = zhkVar3;
            i = 1;
        }
        if (i != 0) {
            o(zhkVar, null);
        } else {
            o(zhkVar, null);
        }
        return null;
        akfxVar = (defpackage.akfx) objAj;
        akguVarA = defpackage.zhn.a(akfxVar, strExtractNetworkPortion, akfgVar);
        i = (akguVarA == null || !akfxVar.q(akguVarA)) ? 0 : 1;
        if (i == 0) {
            java.lang.Object obj3 = this.c;
            zhmVar.d = akfgVar;
            zhmVar.e = zhkVar;
            zhmVar.f = strExtractNetworkPortion;
            zhmVar.g = akfxVar;
            zhmVar.h = akguVarA;
            zhmVar.a = 0;
            zhmVar.c = 2;
            defpackage.uyg uygVar2 = (defpackage.uyg) obj3;
            java.lang.Object objAj2 = aoov.aj((aolr) uygVar2.b, new zhb(uygVar2, (aoln) null, 8, (short[]) null), zhmVar);
            if (objAj2 == aoluVar) {
                return aoluVar;
            }
            akfgVar2 = akfgVar;
            akguVar = akguVarA;
            zhkVar2 = zhkVar;
            objU = objAj2;
            str2 = strExtractNetworkPortion;
            i2 = i;
            if (((java.lang.Boolean) objU).booleanValue()) {
                ((zzx) this.d).l(new zbq(defpackage.zbr.bu));
                java.lang.Object obj4 = this.c;
                zhmVar.d = akfgVar2;
                zhmVar.e = zhkVar2;
                zhmVar.f = str2;
                zhmVar.g = akfxVar;
                zhmVar.h = akguVar;
                zhmVar.a = i2;
                zhmVar.c = 3;
                objU = ((defpackage.uyg) obj4).u(zhmVar);
                if (objU != aoluVar) {
                    return aoluVar;
                }
                akfxVar2 = akfxVar;
                str3 = str2;
                zhkVar3 = zhkVar2;
                akfgVar3 = akfgVar2;
                str4 = (java.lang.String) objU;
                if (str4 != null) {
                    i = i2;
                    akguVarA = akguVar;
                    akfxVar = akfxVar2;
                    zhkVar = zhkVar3;
                } else {
                    i = i2;
                    akguVarA = akguVar;
                    akfxVar = akfxVar2;
                    zhkVar = zhkVar3;
                }
            } else {
                i = i2;
                zhkVar = zhkVar2;
                akguVarA = akguVar;
            }
            if (i != 0) {
                o(zhkVar, null);
            } else {
                o(zhkVar, null);
            }
        } else if (i != 0) {
            o(zhkVar, null);
        } else {
            o(zhkVar, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v4, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c2 -> B:40:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d4 -> B:37:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(aoln r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlr.c(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object d(defpackage.ywn ywnVar, aoln aolnVar) {
        defpackage.yxb yxbVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yxb) {
            yxbVar = (defpackage.yxb) aolnVar;
            int i = yxbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxbVar.b = i - Integer.MIN_VALUE;
            } else {
                yxbVar = new defpackage.yxb(this, aolnVar);
            }
        } else {
            yxbVar = new defpackage.yxb(this, aolnVar);
        }
        java.lang.Object obj = yxbVar.a;
        defpackage.ywr ywrVar = aolu.a;
        int i2 = yxbVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yxbVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1190, "SharpiePreconditionChecker_checkCall");
            try {
                ?? r2 = this.d;
                defpackage.rir rirVar = new defpackage.rir(this, ywnVar, (aoln) null, 12);
                yxbVar.c = ahoqVarZ;
                yxbVar.b = 1;
                java.lang.Object objAj = aoov.aj((aolr) r2, rirVar, yxbVar);
                if (objAj != ywrVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return ywrVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yxbVar.c;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        ywrVar = (defpackage.ywr) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return ywrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object e(defpackage.taq taqVar, aoln aolnVar) {
        defpackage.yxc yxcVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yxc) {
            yxcVar = (defpackage.yxc) aolnVar;
            int i = yxcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxcVar.b = i - Integer.MIN_VALUE;
            } else {
                yxcVar = new defpackage.yxc(this, aolnVar);
            }
        } else {
            yxcVar = new defpackage.yxc(this, aolnVar);
        }
        java.lang.Object obj = yxcVar.a;
        defpackage.ywz ywzVar = aolu.a;
        int i2 = yxcVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yxcVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1191, "SharpiePreconditionChecker_checkDevice");
            try {
                ?? r2 = this.d;
                defpackage.yzh yzhVar = new defpackage.yzh(this, taqVar, (aoln) null, 1);
                yxcVar.c = ahoqVarZ;
                yxcVar.b = 1;
                java.lang.Object objAj = aoov.aj((aolr) r2, yzhVar, yxcVar);
                if (objAj != ywzVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return ywzVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yxcVar.c;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        ywzVar = (defpackage.ywz) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return ywzVar;
    }

    public final android.text.Spannable f(final java.lang.String str, java.util.List list, final boolean z) {
        final android.text.SpannableString spannableString = new android.text.SpannableString(str);
        j$.lang.Iterable.-EL.forEach(list, new java.util.function.Consumer() { // from class: wty
            /* JADX WARN: Type inference failed for: r0v7, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v2, types: [ahzi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v7, types: [ahzi, java.lang.Object] */
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                int i;
                defpackage.wke wkeVar = (defpackage.wke) obj;
                int i2 = wkeVar.c;
                if (i2 < 0 || i2 >= (i = wkeVar.d) || i > str.length()) {
                    return;
                }
                int iO = wsc.O(wkeVar.e);
                if (iO == 0) {
                    iO = 1;
                }
                boolean z2 = z;
                android.text.SpannableString spannableString2 = spannableString;
                defpackage.zlr zlrVar = this.d;
                int i3 = iO - 1;
                if (i3 == 1) {
                    if (((java.lang.Boolean) zlrVar.b.a()).booleanValue()) {
                        spannableString2.setSpan(new defpackage.wuf((android.content.Context) zlrVar.d, ((java.lang.Integer) zlrVar.a.eZ()).intValue(), wkeVar.c, wkeVar.d), wkeVar.c, wkeVar.d, 17);
                    }
                } else {
                    if (i3 == 2) {
                        defpackage.zlr.g(spannableString2, wkeVar);
                        return;
                    }
                    if (i3 == 4) {
                        if (z2) {
                            return;
                        }
                        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) zlrVar.c.eZ()).intValue()), wkeVar.c, wkeVar.d, 17);
                    } else if (i3 == 5 && z2) {
                        defpackage.zlr.g(spannableString2, wkeVar);
                    }
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
            }
        });
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(android.view.ViewGroup viewGroup, kiu kiuVar, nwv nwvVar) {
        viewGroup.removeAllViews();
        android.content.Context context = viewGroup.getContext();
        akzx akzxVarM = oqy.a.m();
        akzxVarM.u();
        oqy oqyVar = akzxVarM.b;
        int i = 2;
        oqyVar.u = 2;
        oqyVar.b |= 262144;
        java.lang.String str = kiuVar.g;
        akzxVarM.u();
        oqy oqyVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        oqyVar2.b |= 1;
        oqyVar2.c = str;
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        java.lang.String str2 = hkdVar.c;
        akzxVarM.u();
        oqy oqyVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        oqyVar3.b |= 2;
        oqyVar3.d = str2;
        hkd hkdVar2 = kiuVar.f;
        if (hkdVar2 == null) {
            hkdVar2 = hkd.a;
        }
        java.lang.String str3 = hkdVar2.d;
        akzxVarM.u();
        oqy oqyVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        oqyVar4.b |= 8;
        oqyVar4.f = str3;
        java.lang.Object obj = this.c;
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        java.lang.String strA = ((kaw) obj).a(kiwVar);
        akzxVarM.u();
        oqy oqyVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strA);
        oqyVar5.b |= 16;
        oqyVar5.g = strA;
        int i2 = kiuVar.q;
        akzxVarM.u();
        oqy oqyVar6 = akzxVarM.b;
        oqyVar6.b |= 32;
        oqyVar6.h = i2;
        int i3 = kiuVar.o;
        akzxVarM.u();
        oqy oqyVar7 = akzxVarM.b;
        oqyVar7.b |= 64;
        oqyVar7.i = i3;
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        java.lang.String str4 = kiwVar2.g;
        akzxVarM.u();
        oqy oqyVar8 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str4);
        oqyVar8.b |= 128;
        oqyVar8.j = str4;
        java.lang.String str5 = kiuVar.m;
        akzxVarM.u();
        oqy oqyVar9 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str5);
        oqyVar9.b |= 256;
        oqyVar9.k = str5;
        kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = kiw.a;
        }
        boolean z = !kiwVar3.g.isEmpty();
        akzxVarM.u();
        oqy oqyVar10 = akzxVarM.b;
        oqyVar10.b |= 512;
        oqyVar10.l = z;
        kiw kiwVar4 = kiuVar.r;
        if (kiwVar4 == null) {
            kiwVar4 = kiw.a;
        }
        boolean z2 = kiwVar4.p;
        akzxVarM.u();
        oqy oqyVar11 = akzxVarM.b;
        oqyVar11.b |= 1024;
        oqyVar11.m = z2;
        kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = kiw.a;
        }
        boolean z3 = kiwVar5.j;
        akzxVarM.u();
        oqy oqyVar12 = akzxVarM.b;
        oqyVar12.b |= 2048;
        oqyVar12.n = z3;
        kiw kiwVar6 = kiuVar.r;
        if (kiwVar6 == null) {
            kiwVar6 = kiw.a;
        }
        boolean z4 = kiwVar6.r;
        akzxVarM.u();
        oqy oqyVar13 = akzxVarM.b;
        oqyVar13.b |= 32768;
        oqyVar13.r = z4;
        tkl tklVar = (tkl) this.a;
        boolean zV = tklVar.v(kiuVar);
        akzxVarM.u();
        oqy oqyVar14 = akzxVarM.b;
        oqyVar14.b |= 4096;
        oqyVar14.o = zV;
        boolean zT = tklVar.t(kiuVar);
        akzxVarM.u();
        oqy oqyVar15 = akzxVarM.b;
        oqyVar15.b |= 1048576;
        oqyVar15.w = zT;
        boolean z5 = kiuVar.s;
        akzxVarM.u();
        oqy oqyVar16 = akzxVarM.b;
        oqyVar16.b |= 8192;
        oqyVar16.p = z5;
        kiw kiwVar7 = kiuVar.r;
        if (kiwVar7 == null) {
            kiwVar7 = kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar7.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        akzxVarM.u();
        oqy oqyVar17 = akzxVarM.b;
        oqyVar17.q = rmtVarB.q;
        oqyVar17.b |= 16384;
        int i4 = kiuVar.y;
        akzxVarM.u();
        oqy oqyVar18 = akzxVarM.b;
        oqyVar18.b |= 65536;
        oqyVar18.s = i4;
        kiw kiwVar8 = kiuVar.r;
        if (kiwVar8 == null) {
            kiwVar8 = kiw.a;
        }
        nwx nwxVarB = nwx.b(kiwVar8.C);
        if (nwxVarB == null) {
            nwxVarB = nwx.a;
        }
        boolean z6 = nwvVar.equals(nwv.d) && !nwxVarB.equals(nwx.b);
        akzxVarM.u();
        oqy oqyVar19 = akzxVarM.b;
        oqyVar19.b |= 524288;
        oqyVar19.v = z6;
        java.lang.String str6 = kiuVar.h;
        akzxVarM.u();
        oqy oqyVar20 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str6);
        oqyVar20.b |= 4;
        oqyVar20.e = str6;
        orc orcVar = new orc(context, akzxVarM.p());
        if (((ssq) this.b).c(kiuVar.g, kiuVar.i)) {
            java.lang.String str7 = kiuVar.g;
            if (!android.text.TextUtils.isEmpty(str7)) {
                for (char c : str7.toString().toCharArray()) {
                    if (android.telephony.PhoneNumberUtils.isDialable(c)) {
                        orcVar.n(j$.util.Optional.of(mce.O));
                        orcVar.m();
                        orcVar.p();
                        orcVar.o();
                        orcVar.l();
                        orcVar.q(4);
                        break;
                    }
                }
            }
        }
        for (oqx oqxVar : orcVar.a()) {
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624016, viewGroup, false);
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) viewInflate;
            materialButton.n(oqxVar.a());
            materialButton.setText(oqxVar.b());
            j$.util.Objects.requireNonNull(oqxVar);
            viewInflate.setOnClickListener(new defpackage.vxa(oqxVar, i));
            viewGroup.addView(viewInflate);
        }
        int childCount = viewGroup.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            ((ahbv) this.d).C((com.google.android.material.button.MaterialButton) viewGroup.getChildAt(i5), new inx(i5 == 0, i5 == childCount + (-1)));
            i5++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, rlv] */
    public final j$.util.Optional i(vzi vziVar) {
        int i = vziVar.i;
        if (i == -9001) {
            akzx akzxVarM = defpackage.vtx.a.m();
            akzxVarM.u();
            defpackage.vtx vtxVar = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar.c = vziVar;
            vtxVar.b |= 1;
            java.lang.String string = ((android.content.Context) this.d).getString(2132021016);
            akzxVarM.u();
            defpackage.vtx vtxVar2 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            vtxVar2.b |= 2;
            vtxVar2.d = string;
            java.lang.String string2 = q(2132021015).toString();
            akzxVarM.u();
            defpackage.vtx vtxVar3 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            vtxVar3.b |= 4;
            vtxVar3.e = string2;
            boolean zJ = j(vziVar);
            akzxVarM.u();
            defpackage.vtx vtxVar4 = (defpackage.vtx) akzxVarM.b;
            vtxVar4.b |= 32;
            vtxVar4.h = zJ;
            defpackage.vtw vtwVarB = ((defpackage.vvb) this.a).b();
            akzxVarM.u();
            defpackage.vtx vtxVar5 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vtwVarB);
            vtxVar5.f = vtwVarB;
            vtxVar5.b |= 8;
            defpackage.vtw vtwVarP = p();
            akzxVarM.u();
            defpackage.vtx vtxVar6 = (defpackage.vtx) akzxVarM.b;
            j$.util.Objects.requireNonNull(vtwVarP);
            vtxVar6.g = vtwVarP;
            vtxVar6.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM.p());
        }
        int i2 = vziVar.h;
        if (i2 == -9002) {
            akzx akzxVarM2 = defpackage.vtx.a.m();
            akzxVarM2.u();
            defpackage.vtx vtxVar7 = (defpackage.vtx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar7.c = vziVar;
            vtxVar7.b |= 1;
            java.lang.String string3 = ((android.content.Context) this.d).getString(2132021010);
            akzxVarM2.u();
            defpackage.vtx vtxVar8 = (defpackage.vtx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string3);
            vtxVar8.b |= 2;
            vtxVar8.d = string3;
            java.lang.String string4 = q(2132021009).toString();
            akzxVarM2.u();
            defpackage.vtx vtxVar9 = (defpackage.vtx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string4);
            vtxVar9.b |= 4;
            vtxVar9.e = string4;
            boolean zJ2 = j(vziVar);
            akzxVarM2.u();
            defpackage.vtx vtxVar10 = (defpackage.vtx) akzxVarM2.b;
            vtxVar10.b |= 32;
            vtxVar10.h = zJ2;
            defpackage.vtw vtwVarB2 = ((defpackage.vvb) this.a).b();
            akzxVarM2.u();
            defpackage.vtx vtxVar11 = (defpackage.vtx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(vtwVarB2);
            vtxVar11.f = vtwVarB2;
            vtxVar11.b |= 8;
            defpackage.vtw vtwVarP2 = p();
            akzxVarM2.u();
            defpackage.vtx vtxVar12 = (defpackage.vtx) akzxVarM2.b;
            j$.util.Objects.requireNonNull(vtwVarP2);
            vtxVar12.g = vtwVarP2;
            vtxVar12.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM2.p());
        }
        if (i2 == -9003) {
            akzx akzxVarM3 = defpackage.vtx.a.m();
            akzxVarM3.u();
            defpackage.vtx vtxVar13 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar13.c = vziVar;
            vtxVar13.b |= 1;
            java.lang.String string5 = ((android.content.Context) this.d).getString(2132020994);
            akzxVarM3.u();
            defpackage.vtx vtxVar14 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(string5);
            vtxVar14.b |= 2;
            vtxVar14.d = string5;
            java.lang.String string6 = q(2132020993).toString();
            akzxVarM3.u();
            defpackage.vtx vtxVar15 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(string6);
            vtxVar15.b |= 4;
            vtxVar15.e = string6;
            boolean zJ3 = j(vziVar);
            akzxVarM3.u();
            defpackage.vtx vtxVar16 = (defpackage.vtx) akzxVarM3.b;
            vtxVar16.b |= 32;
            vtxVar16.h = zJ3;
            defpackage.vtw vtwVarB3 = ((defpackage.vvb) this.a).b();
            akzxVarM3.u();
            defpackage.vtx vtxVar17 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(vtwVarB3);
            vtxVar17.f = vtwVarB3;
            vtxVar17.b |= 8;
            defpackage.vtw vtwVarP3 = p();
            akzxVarM3.u();
            defpackage.vtx vtxVar18 = (defpackage.vtx) akzxVarM3.b;
            j$.util.Objects.requireNonNull(vtwVarP3);
            vtxVar18.g = vtwVarP3;
            vtxVar18.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM3.p());
        }
        if (i == -9004) {
            akzx akzxVarM4 = defpackage.vtx.a.m();
            akzxVarM4.u();
            defpackage.vtx vtxVar19 = (defpackage.vtx) akzxVarM4.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar19.c = vziVar;
            vtxVar19.b |= 1;
            java.lang.String string7 = ((android.content.Context) this.d).getString(2132021018);
            akzxVarM4.u();
            defpackage.vtx vtxVar20 = (defpackage.vtx) akzxVarM4.b;
            j$.util.Objects.requireNonNull(string7);
            vtxVar20.b |= 2;
            vtxVar20.d = string7;
            java.lang.String string8 = q(2132021017).toString();
            akzxVarM4.u();
            defpackage.vtx vtxVar21 = (defpackage.vtx) akzxVarM4.b;
            j$.util.Objects.requireNonNull(string8);
            vtxVar21.b |= 4;
            vtxVar21.e = string8;
            boolean zJ4 = j(vziVar);
            akzxVarM4.u();
            defpackage.vtx vtxVar22 = (defpackage.vtx) akzxVarM4.b;
            vtxVar22.b |= 32;
            vtxVar22.h = zJ4;
            defpackage.vtw vtwVarB4 = ((defpackage.vvb) this.a).b();
            akzxVarM4.u();
            defpackage.vtx vtxVar23 = (defpackage.vtx) akzxVarM4.b;
            j$.util.Objects.requireNonNull(vtwVarB4);
            vtxVar23.f = vtwVarB4;
            vtxVar23.b |= 8;
            defpackage.vtw vtwVarP4 = p();
            akzxVarM4.u();
            defpackage.vtx vtxVar24 = (defpackage.vtx) akzxVarM4.b;
            j$.util.Objects.requireNonNull(vtwVarP4);
            vtxVar24.g = vtwVarP4;
            vtxVar24.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM4.p());
        }
        if (i2 == -9005) {
            akzx akzxVarM5 = defpackage.vtx.a.m();
            akzxVarM5.u();
            defpackage.vtx vtxVar25 = (defpackage.vtx) akzxVarM5.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar25.c = vziVar;
            vtxVar25.b |= 1;
            java.lang.String string9 = ((android.content.Context) this.d).getString(2132021012);
            akzxVarM5.u();
            defpackage.vtx vtxVar26 = (defpackage.vtx) akzxVarM5.b;
            j$.util.Objects.requireNonNull(string9);
            vtxVar26.b |= 2;
            vtxVar26.d = string9;
            java.lang.String string10 = q(2132021011).toString();
            akzxVarM5.u();
            defpackage.vtx vtxVar27 = (defpackage.vtx) akzxVarM5.b;
            j$.util.Objects.requireNonNull(string10);
            vtxVar27.b |= 4;
            vtxVar27.e = string10;
            boolean zJ5 = j(vziVar);
            akzxVarM5.u();
            defpackage.vtx vtxVar28 = (defpackage.vtx) akzxVarM5.b;
            vtxVar28.b |= 32;
            vtxVar28.h = zJ5;
            defpackage.vtw vtwVarB5 = ((defpackage.vvb) this.a).b();
            akzxVarM5.u();
            defpackage.vtx vtxVar29 = (defpackage.vtx) akzxVarM5.b;
            j$.util.Objects.requireNonNull(vtwVarB5);
            vtxVar29.f = vtwVarB5;
            vtxVar29.b |= 8;
            defpackage.vtw vtwVarP5 = p();
            akzxVarM5.u();
            defpackage.vtx vtxVar30 = (defpackage.vtx) akzxVarM5.b;
            j$.util.Objects.requireNonNull(vtwVarP5);
            vtxVar30.g = vtwVarP5;
            vtxVar30.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM5.p());
        }
        if (i2 == -9006) {
            akzx akzxVarM6 = defpackage.vtx.a.m();
            akzxVarM6.u();
            defpackage.vtx vtxVar31 = (defpackage.vtx) akzxVarM6.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar31.c = vziVar;
            vtxVar31.b |= 1;
            java.lang.String string11 = ((android.content.Context) this.d).getString(2132020996);
            akzxVarM6.u();
            defpackage.vtx vtxVar32 = (defpackage.vtx) akzxVarM6.b;
            j$.util.Objects.requireNonNull(string11);
            vtxVar32.b |= 2;
            vtxVar32.d = string11;
            java.lang.String string12 = q(2132020995).toString();
            akzxVarM6.u();
            defpackage.vtx vtxVar33 = (defpackage.vtx) akzxVarM6.b;
            j$.util.Objects.requireNonNull(string12);
            vtxVar33.b |= 4;
            vtxVar33.e = string12;
            boolean zJ6 = j(vziVar);
            akzxVarM6.u();
            defpackage.vtx vtxVar34 = (defpackage.vtx) akzxVarM6.b;
            vtxVar34.b |= 32;
            vtxVar34.h = zJ6;
            defpackage.vtw vtwVarB6 = ((defpackage.vvb) this.a).b();
            akzxVarM6.u();
            defpackage.vtx vtxVar35 = (defpackage.vtx) akzxVarM6.b;
            j$.util.Objects.requireNonNull(vtwVarB6);
            vtxVar35.f = vtwVarB6;
            vtxVar35.b |= 8;
            defpackage.vtw vtwVarP6 = p();
            akzxVarM6.u();
            defpackage.vtx vtxVar36 = (defpackage.vtx) akzxVarM6.b;
            j$.util.Objects.requireNonNull(vtwVarP6);
            vtxVar36.g = vtwVarP6;
            vtxVar36.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM6.p());
        }
        if (i == -9007) {
            akzx akzxVarM7 = defpackage.vtx.a.m();
            akzxVarM7.u();
            defpackage.vtx vtxVar37 = (defpackage.vtx) akzxVarM7.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar37.c = vziVar;
            vtxVar37.b |= 1;
            java.lang.String string13 = ((android.content.Context) this.d).getString(2132021020);
            akzxVarM7.u();
            defpackage.vtx vtxVar38 = (defpackage.vtx) akzxVarM7.b;
            j$.util.Objects.requireNonNull(string13);
            vtxVar38.b |= 2;
            vtxVar38.d = string13;
            java.lang.String string14 = q(2132021019).toString();
            akzxVarM7.u();
            defpackage.vtx vtxVar39 = (defpackage.vtx) akzxVarM7.b;
            j$.util.Objects.requireNonNull(string14);
            vtxVar39.b |= 4;
            vtxVar39.e = string14;
            boolean zJ7 = j(vziVar);
            akzxVarM7.u();
            defpackage.vtx vtxVar40 = (defpackage.vtx) akzxVarM7.b;
            vtxVar40.b |= 32;
            vtxVar40.h = zJ7;
            defpackage.vtw vtwVarB7 = ((defpackage.vvb) this.a).b();
            akzxVarM7.u();
            defpackage.vtx vtxVar41 = (defpackage.vtx) akzxVarM7.b;
            j$.util.Objects.requireNonNull(vtwVarB7);
            vtxVar41.f = vtwVarB7;
            vtxVar41.b |= 8;
            defpackage.vtw vtwVarP7 = p();
            akzxVarM7.u();
            defpackage.vtx vtxVar42 = (defpackage.vtx) akzxVarM7.b;
            j$.util.Objects.requireNonNull(vtwVarP7);
            vtxVar42.g = vtwVarP7;
            vtxVar42.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM7.p());
        }
        if (i2 == -9008) {
            akzx akzxVarM8 = defpackage.vtx.a.m();
            akzxVarM8.u();
            defpackage.vtx vtxVar43 = (defpackage.vtx) akzxVarM8.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar43.c = vziVar;
            vtxVar43.b |= 1;
            java.lang.String string15 = ((android.content.Context) this.d).getString(2132021014);
            akzxVarM8.u();
            defpackage.vtx vtxVar44 = (defpackage.vtx) akzxVarM8.b;
            j$.util.Objects.requireNonNull(string15);
            vtxVar44.b |= 2;
            vtxVar44.d = string15;
            java.lang.String string16 = q(2132021013).toString();
            akzxVarM8.u();
            defpackage.vtx vtxVar45 = (defpackage.vtx) akzxVarM8.b;
            j$.util.Objects.requireNonNull(string16);
            vtxVar45.b |= 4;
            vtxVar45.e = string16;
            boolean zJ8 = j(vziVar);
            akzxVarM8.u();
            defpackage.vtx vtxVar46 = (defpackage.vtx) akzxVarM8.b;
            vtxVar46.b |= 32;
            vtxVar46.h = zJ8;
            defpackage.vtw vtwVarB8 = ((defpackage.vvb) this.a).b();
            akzxVarM8.u();
            defpackage.vtx vtxVar47 = (defpackage.vtx) akzxVarM8.b;
            j$.util.Objects.requireNonNull(vtwVarB8);
            vtxVar47.f = vtwVarB8;
            vtxVar47.b |= 8;
            defpackage.vtw vtwVarP8 = p();
            akzxVarM8.u();
            defpackage.vtx vtxVar48 = (defpackage.vtx) akzxVarM8.b;
            j$.util.Objects.requireNonNull(vtwVarP8);
            vtxVar48.g = vtwVarP8;
            vtxVar48.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM8.p());
        }
        if (vziVar.j == -9009) {
            akzx akzxVarM9 = defpackage.vtx.a.m();
            akzxVarM9.u();
            defpackage.vtx vtxVar49 = (defpackage.vtx) akzxVarM9.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar49.c = vziVar;
            vtxVar49.b |= 1;
            java.lang.String string17 = ((android.content.Context) this.d).getString(2132020998);
            akzxVarM9.u();
            defpackage.vtx vtxVar50 = (defpackage.vtx) akzxVarM9.b;
            j$.util.Objects.requireNonNull(string17);
            vtxVar50.b |= 2;
            vtxVar50.d = string17;
            java.lang.String string18 = q(2132020997).toString();
            akzxVarM9.u();
            defpackage.vtx vtxVar51 = (defpackage.vtx) akzxVarM9.b;
            j$.util.Objects.requireNonNull(string18);
            vtxVar51.b |= 4;
            vtxVar51.e = string18;
            boolean zJ9 = j(vziVar);
            akzxVarM9.u();
            defpackage.vtx vtxVar52 = (defpackage.vtx) akzxVarM9.b;
            vtxVar52.b |= 32;
            vtxVar52.h = zJ9;
            defpackage.vtw vtwVarB9 = ((defpackage.vvb) this.a).b();
            akzxVarM9.u();
            defpackage.vtx vtxVar53 = (defpackage.vtx) akzxVarM9.b;
            j$.util.Objects.requireNonNull(vtwVarB9);
            vtxVar53.f = vtwVarB9;
            vtxVar53.b |= 8;
            defpackage.vtw vtwVarP9 = p();
            akzxVarM9.u();
            defpackage.vtx vtxVar54 = (defpackage.vtx) akzxVarM9.b;
            j$.util.Objects.requireNonNull(vtwVarP9);
            vtxVar54.g = vtwVarP9;
            vtxVar54.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM9.p());
        }
        if (i2 == -9990) {
            akzx akzxVarM10 = defpackage.vtx.a.m();
            akzxVarM10.u();
            defpackage.vtx vtxVar55 = (defpackage.vtx) akzxVarM10.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar55.c = vziVar;
            vtxVar55.b |= 1;
            java.lang.String string19 = ((android.content.Context) this.d).getString(2132021000);
            akzxVarM10.u();
            defpackage.vtx vtxVar56 = (defpackage.vtx) akzxVarM10.b;
            j$.util.Objects.requireNonNull(string19);
            vtxVar56.b |= 2;
            vtxVar56.d = string19;
            java.lang.String string20 = q(2132020999).toString();
            akzxVarM10.u();
            defpackage.vtx vtxVar57 = (defpackage.vtx) akzxVarM10.b;
            j$.util.Objects.requireNonNull(string20);
            vtxVar57.b |= 4;
            vtxVar57.e = string20;
            boolean zJ10 = j(vziVar);
            akzxVarM10.u();
            defpackage.vtx vtxVar58 = (defpackage.vtx) akzxVarM10.b;
            vtxVar58.b |= 32;
            vtxVar58.h = zJ10;
            defpackage.vtw vtwVarB10 = ((defpackage.vvb) this.a).b();
            akzxVarM10.u();
            defpackage.vtx vtxVar59 = (defpackage.vtx) akzxVarM10.b;
            j$.util.Objects.requireNonNull(vtwVarB10);
            vtxVar59.f = vtwVarB10;
            vtxVar59.b |= 8;
            defpackage.vtw vtwVarP10 = p();
            akzxVarM10.u();
            defpackage.vtx vtxVar60 = (defpackage.vtx) akzxVarM10.b;
            j$.util.Objects.requireNonNull(vtwVarP10);
            vtxVar60.g = vtwVarP10;
            vtxVar60.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM10.p());
        }
        if (i2 == -9991) {
            akzx akzxVarM11 = defpackage.vtx.a.m();
            akzxVarM11.u();
            defpackage.vtx vtxVar61 = (defpackage.vtx) akzxVarM11.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar61.c = vziVar;
            vtxVar61.b |= 1;
            java.lang.String string21 = ((android.content.Context) this.d).getString(2132021006);
            akzxVarM11.u();
            defpackage.vtx vtxVar62 = (defpackage.vtx) akzxVarM11.b;
            j$.util.Objects.requireNonNull(string21);
            vtxVar62.b |= 2;
            vtxVar62.d = string21;
            java.lang.String string22 = q(2132021005).toString();
            akzxVarM11.u();
            defpackage.vtx vtxVar63 = (defpackage.vtx) akzxVarM11.b;
            j$.util.Objects.requireNonNull(string22);
            vtxVar63.b |= 4;
            vtxVar63.e = string22;
            boolean zJ11 = j(vziVar);
            akzxVarM11.u();
            defpackage.vtx vtxVar64 = (defpackage.vtx) akzxVarM11.b;
            vtxVar64.b |= 32;
            vtxVar64.h = zJ11;
            defpackage.vtw vtwVarA = ((defpackage.vvb) this.a).a();
            akzxVarM11.u();
            defpackage.vtx vtxVar65 = (defpackage.vtx) akzxVarM11.b;
            j$.util.Objects.requireNonNull(vtwVarA);
            vtxVar65.f = vtwVarA;
            vtxVar65.b |= 8;
            defpackage.vtw vtwVarP11 = p();
            akzxVarM11.u();
            defpackage.vtx vtxVar66 = (defpackage.vtx) akzxVarM11.b;
            j$.util.Objects.requireNonNull(vtwVarP11);
            vtxVar66.g = vtwVarP11;
            vtxVar66.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM11.p());
        }
        if (i2 == -9992) {
            akzx akzxVarM12 = defpackage.vtx.a.m();
            akzxVarM12.u();
            defpackage.vtx vtxVar67 = (defpackage.vtx) akzxVarM12.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar67.c = vziVar;
            vtxVar67.b |= 1;
            java.lang.String string23 = ((android.content.Context) this.d).getString(2132021004);
            akzxVarM12.u();
            defpackage.vtx vtxVar68 = (defpackage.vtx) akzxVarM12.b;
            j$.util.Objects.requireNonNull(string23);
            vtxVar68.b |= 2;
            vtxVar68.d = string23;
            java.lang.String string24 = q(2132021003).toString();
            akzxVarM12.u();
            defpackage.vtx vtxVar69 = (defpackage.vtx) akzxVarM12.b;
            j$.util.Objects.requireNonNull(string24);
            vtxVar69.b |= 4;
            vtxVar69.e = string24;
            boolean zJ12 = j(vziVar);
            akzxVarM12.u();
            defpackage.vtx vtxVar70 = (defpackage.vtx) akzxVarM12.b;
            vtxVar70.b |= 32;
            vtxVar70.h = zJ12;
            defpackage.vtw vtwVarA2 = ((defpackage.vvb) this.a).a();
            akzxVarM12.u();
            defpackage.vtx vtxVar71 = (defpackage.vtx) akzxVarM12.b;
            j$.util.Objects.requireNonNull(vtwVarA2);
            vtxVar71.f = vtwVarA2;
            vtxVar71.b |= 8;
            defpackage.vtw vtwVarP12 = p();
            akzxVarM12.u();
            defpackage.vtx vtxVar72 = (defpackage.vtx) akzxVarM12.b;
            j$.util.Objects.requireNonNull(vtwVarP12);
            vtxVar72.g = vtwVarP12;
            vtxVar72.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM12.p());
        }
        if (i2 == -9993) {
            akzx akzxVarM13 = defpackage.vtx.a.m();
            akzxVarM13.u();
            defpackage.vtx vtxVar73 = (defpackage.vtx) akzxVarM13.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar73.c = vziVar;
            vtxVar73.b |= 1;
            java.lang.String string25 = ((android.content.Context) this.d).getString(2132020986);
            akzxVarM13.u();
            defpackage.vtx vtxVar74 = (defpackage.vtx) akzxVarM13.b;
            j$.util.Objects.requireNonNull(string25);
            vtxVar74.b |= 2;
            vtxVar74.d = string25;
            java.lang.String string26 = q(2132020985).toString();
            akzxVarM13.u();
            defpackage.vtx vtxVar75 = (defpackage.vtx) akzxVarM13.b;
            j$.util.Objects.requireNonNull(string26);
            vtxVar75.b |= 4;
            vtxVar75.e = string26;
            boolean zJ13 = j(vziVar);
            akzxVarM13.u();
            defpackage.vtx vtxVar76 = (defpackage.vtx) akzxVarM13.b;
            vtxVar76.b |= 32;
            vtxVar76.h = zJ13;
            defpackage.vtw vtwVarA3 = ((defpackage.vvb) this.a).a();
            akzxVarM13.u();
            defpackage.vtx vtxVar77 = (defpackage.vtx) akzxVarM13.b;
            j$.util.Objects.requireNonNull(vtwVarA3);
            vtxVar77.f = vtwVarA3;
            vtxVar77.b |= 8;
            defpackage.vtw vtwVarP13 = p();
            akzxVarM13.u();
            defpackage.vtx vtxVar78 = (defpackage.vtx) akzxVarM13.b;
            j$.util.Objects.requireNonNull(vtwVarP13);
            vtxVar78.g = vtwVarP13;
            vtxVar78.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM13.p());
        }
        if (i2 == -9994) {
            akzx akzxVarM14 = defpackage.vtx.a.m();
            akzxVarM14.u();
            defpackage.vtx vtxVar79 = (defpackage.vtx) akzxVarM14.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar79.c = vziVar;
            vtxVar79.b |= 1;
            java.lang.String string27 = ((android.content.Context) this.d).getString(2132020988);
            akzxVarM14.u();
            defpackage.vtx vtxVar80 = (defpackage.vtx) akzxVarM14.b;
            j$.util.Objects.requireNonNull(string27);
            vtxVar80.b |= 2;
            vtxVar80.d = string27;
            java.lang.String string28 = q(2132020987).toString();
            akzxVarM14.u();
            defpackage.vtx vtxVar81 = (defpackage.vtx) akzxVarM14.b;
            j$.util.Objects.requireNonNull(string28);
            vtxVar81.b |= 4;
            vtxVar81.e = string28;
            boolean zJ14 = j(vziVar);
            akzxVarM14.u();
            defpackage.vtx vtxVar82 = (defpackage.vtx) akzxVarM14.b;
            vtxVar82.b |= 32;
            vtxVar82.h = zJ14;
            defpackage.vtw vtwVarP14 = p();
            akzxVarM14.u();
            defpackage.vtx vtxVar83 = (defpackage.vtx) akzxVarM14.b;
            j$.util.Objects.requireNonNull(vtwVarP14);
            vtxVar83.f = vtwVarP14;
            vtxVar83.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM14.p());
        }
        if (i2 == -9995) {
            akzx akzxVarM15 = defpackage.vtx.a.m();
            akzxVarM15.u();
            defpackage.vtx vtxVar84 = (defpackage.vtx) akzxVarM15.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar84.c = vziVar;
            vtxVar84.b |= 1;
            java.lang.String string29 = ((android.content.Context) this.d).getString(2132020992);
            akzxVarM15.u();
            defpackage.vtx vtxVar85 = (defpackage.vtx) akzxVarM15.b;
            j$.util.Objects.requireNonNull(string29);
            vtxVar85.b |= 2;
            vtxVar85.d = string29;
            java.lang.String string30 = q(2132020991).toString();
            akzxVarM15.u();
            defpackage.vtx vtxVar86 = (defpackage.vtx) akzxVarM15.b;
            j$.util.Objects.requireNonNull(string30);
            vtxVar86.b |= 4;
            vtxVar86.e = string30;
            boolean zJ15 = j(vziVar);
            akzxVarM15.u();
            defpackage.vtx vtxVar87 = (defpackage.vtx) akzxVarM15.b;
            vtxVar87.b |= 32;
            vtxVar87.h = zJ15;
            defpackage.vtw vtwVarP15 = p();
            akzxVarM15.u();
            defpackage.vtx vtxVar88 = (defpackage.vtx) akzxVarM15.b;
            j$.util.Objects.requireNonNull(vtwVarP15);
            vtxVar88.f = vtwVarP15;
            vtxVar88.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM15.p());
        }
        if (i2 == -9996) {
            akzx akzxVarM16 = defpackage.vtx.a.m();
            akzxVarM16.u();
            defpackage.vtx vtxVar89 = (defpackage.vtx) akzxVarM16.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar89.c = vziVar;
            vtxVar89.b |= 1;
            java.lang.String string31 = ((android.content.Context) this.d).getString(2132020990);
            akzxVarM16.u();
            defpackage.vtx vtxVar90 = (defpackage.vtx) akzxVarM16.b;
            j$.util.Objects.requireNonNull(string31);
            vtxVar90.b |= 2;
            vtxVar90.d = string31;
            java.lang.String string32 = q(2132020989).toString();
            akzxVarM16.u();
            defpackage.vtx vtxVar91 = (defpackage.vtx) akzxVarM16.b;
            j$.util.Objects.requireNonNull(string32);
            vtxVar91.b |= 4;
            vtxVar91.e = string32;
            boolean zJ16 = j(vziVar);
            akzxVarM16.u();
            defpackage.vtx vtxVar92 = (defpackage.vtx) akzxVarM16.b;
            vtxVar92.b |= 32;
            vtxVar92.h = zJ16;
            defpackage.vtw vtwVarP16 = p();
            akzxVarM16.u();
            defpackage.vtx vtxVar93 = (defpackage.vtx) akzxVarM16.b;
            j$.util.Objects.requireNonNull(vtwVarP16);
            vtxVar93.f = vtwVarP16;
            vtxVar93.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM16.p());
        }
        if (i2 == -9998) {
            akzx akzxVarM17 = defpackage.vtx.a.m();
            akzxVarM17.u();
            defpackage.vtx vtxVar94 = (defpackage.vtx) akzxVarM17.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar94.c = vziVar;
            vtxVar94.b |= 1;
            java.lang.String string33 = ((android.content.Context) this.d).getString(2132021008);
            akzxVarM17.u();
            defpackage.vtx vtxVar95 = (defpackage.vtx) akzxVarM17.b;
            j$.util.Objects.requireNonNull(string33);
            vtxVar95.b |= 2;
            vtxVar95.d = string33;
            java.lang.String string34 = q(2132021007).toString();
            akzxVarM17.u();
            defpackage.vtx vtxVar96 = (defpackage.vtx) akzxVarM17.b;
            j$.util.Objects.requireNonNull(string34);
            vtxVar96.b |= 4;
            vtxVar96.e = string34;
            boolean zJ17 = j(vziVar);
            akzxVarM17.u();
            defpackage.vtx vtxVar97 = (defpackage.vtx) akzxVarM17.b;
            vtxVar97.b |= 32;
            vtxVar97.h = zJ17;
            defpackage.vtw vtwVarP17 = p();
            akzxVarM17.u();
            defpackage.vtx vtxVar98 = (defpackage.vtx) akzxVarM17.b;
            j$.util.Objects.requireNonNull(vtwVarP17);
            vtxVar98.f = vtwVarP17;
            vtxVar98.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM17.p());
        }
        if (i2 == -99) {
            akzx akzxVarM18 = defpackage.vtx.a.m();
            akzxVarM18.u();
            defpackage.vtx vtxVar99 = (defpackage.vtx) akzxVarM18.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar99.c = vziVar;
            vtxVar99.b |= 1;
            java.lang.String string35 = ((android.content.Context) this.d).getString(2132021002);
            akzxVarM18.u();
            defpackage.vtx vtxVar100 = (defpackage.vtx) akzxVarM18.b;
            j$.util.Objects.requireNonNull(string35);
            vtxVar100.b |= 2;
            vtxVar100.d = string35;
            java.lang.String string36 = q(2132021001).toString();
            akzxVarM18.u();
            defpackage.vtx vtxVar101 = (defpackage.vtx) akzxVarM18.b;
            j$.util.Objects.requireNonNull(string36);
            vtxVar101.b |= 4;
            vtxVar101.e = string36;
            boolean zJ18 = j(vziVar);
            akzxVarM18.u();
            defpackage.vtx vtxVar102 = (defpackage.vtx) akzxVarM18.b;
            vtxVar102.b |= 32;
            vtxVar102.h = zJ18;
            defpackage.vtw vtwVarA4 = ((defpackage.vvb) this.a).a();
            akzxVarM18.u();
            defpackage.vtx vtxVar103 = (defpackage.vtx) akzxVarM18.b;
            j$.util.Objects.requireNonNull(vtwVarA4);
            vtxVar103.f = vtwVarA4;
            vtxVar103.b |= 8;
            defpackage.vtw vtwVarP18 = p();
            akzxVarM18.u();
            defpackage.vtx vtxVar104 = (defpackage.vtx) akzxVarM18.b;
            j$.util.Objects.requireNonNull(vtwVarP18);
            vtxVar104.g = vtwVarP18;
            vtxVar104.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM18.p());
        }
        if (i == -9997) {
            akzx akzxVarM19 = defpackage.vtx.a.m();
            akzxVarM19.u();
            defpackage.vtx vtxVar105 = (defpackage.vtx) akzxVarM19.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar105.c = vziVar;
            vtxVar105.b |= 1;
            java.lang.String string37 = ((android.content.Context) this.d).getString(2132020982);
            akzxVarM19.u();
            defpackage.vtx vtxVar106 = (defpackage.vtx) akzxVarM19.b;
            j$.util.Objects.requireNonNull(string37);
            vtxVar106.b |= 2;
            vtxVar106.d = string37;
            java.lang.String string38 = q(2132020981).toString();
            akzxVarM19.u();
            defpackage.vtx vtxVar107 = (defpackage.vtx) akzxVarM19.b;
            j$.util.Objects.requireNonNull(string38);
            vtxVar107.b |= 4;
            vtxVar107.e = string38;
            boolean zJ19 = j(vziVar);
            akzxVarM19.u();
            defpackage.vtx vtxVar108 = (defpackage.vtx) akzxVarM19.b;
            vtxVar108.b |= 32;
            vtxVar108.h = zJ19;
            defpackage.vtw vtwVarA5 = ((defpackage.vvb) this.a).a();
            akzxVarM19.u();
            defpackage.vtx vtxVar109 = (defpackage.vtx) akzxVarM19.b;
            j$.util.Objects.requireNonNull(vtwVarA5);
            vtxVar109.f = vtwVarA5;
            vtxVar109.b |= 8;
            defpackage.vtw vtwVarP19 = p();
            akzxVarM19.u();
            defpackage.vtx vtxVar110 = (defpackage.vtx) akzxVarM19.b;
            j$.util.Objects.requireNonNull(vtwVarP19);
            vtxVar110.g = vtwVarP19;
            vtxVar110.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM19.p());
        }
        if (i == -9989) {
            akzx akzxVarM20 = defpackage.vtx.a.m();
            akzxVarM20.u();
            defpackage.vtx vtxVar111 = (defpackage.vtx) akzxVarM20.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar111.c = vziVar;
            vtxVar111.b |= 1;
            java.lang.String string39 = ((android.content.Context) this.d).getString(2132020984);
            akzxVarM20.u();
            defpackage.vtx vtxVar112 = (defpackage.vtx) akzxVarM20.b;
            j$.util.Objects.requireNonNull(string39);
            vtxVar112.b |= 2;
            vtxVar112.d = string39;
            java.lang.String string40 = q(2132020983).toString();
            akzxVarM20.u();
            defpackage.vtx vtxVar113 = (defpackage.vtx) akzxVarM20.b;
            j$.util.Objects.requireNonNull(string40);
            vtxVar113.b |= 4;
            vtxVar113.e = string40;
            boolean zJ20 = j(vziVar);
            akzxVarM20.u();
            defpackage.vtx vtxVar114 = (defpackage.vtx) akzxVarM20.b;
            vtxVar114.b |= 32;
            vtxVar114.h = zJ20;
            defpackage.vtw vtwVarA6 = ((defpackage.vvb) this.a).a();
            akzxVarM20.u();
            defpackage.vtx vtxVar115 = (defpackage.vtx) akzxVarM20.b;
            j$.util.Objects.requireNonNull(vtwVarA6);
            vtxVar115.f = vtwVarA6;
            vtxVar115.b |= 8;
            defpackage.vtw vtwVarP20 = p();
            akzxVarM20.u();
            defpackage.vtx vtxVar116 = (defpackage.vtx) akzxVarM20.b;
            j$.util.Objects.requireNonNull(vtwVarP20);
            vtxVar116.g = vtwVarP20;
            vtxVar116.b |= 16;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM20.p());
        }
        if (i != -9999) {
            if (i2 != -100) {
                return ((defpackage.vud) this.c).a(vziVar);
            }
            this.b.n(rmw.T);
            akzx akzxVarM21 = defpackage.vtx.a.m();
            akzxVarM21.u();
            defpackage.vtx vtxVar117 = (defpackage.vtx) akzxVarM21.b;
            j$.util.Objects.requireNonNull(vziVar);
            vtxVar117.c = vziVar;
            vtxVar117.b |= 1;
            java.lang.String string41 = ((android.content.Context) this.d).getString(2132020921);
            akzxVarM21.u();
            defpackage.vtx vtxVar118 = (defpackage.vtx) akzxVarM21.b;
            j$.util.Objects.requireNonNull(string41);
            vtxVar118.b |= 2;
            vtxVar118.d = string41;
            java.lang.String string42 = q(2132020920).toString();
            akzxVarM21.u();
            defpackage.vtx vtxVar119 = (defpackage.vtx) akzxVarM21.b;
            j$.util.Objects.requireNonNull(string42);
            vtxVar119.b |= 4;
            vtxVar119.e = string42;
            boolean zJ21 = j(vziVar);
            akzxVarM21.u();
            defpackage.vtx vtxVar120 = (defpackage.vtx) akzxVarM21.b;
            vtxVar120.b |= 32;
            vtxVar120.h = zJ21;
            defpackage.vtw vtwVarC = ((defpackage.vvb) this.a).c();
            akzxVarM21.u();
            defpackage.vtx vtxVar121 = (defpackage.vtx) akzxVarM21.b;
            j$.util.Objects.requireNonNull(vtwVarC);
            vtxVar121.f = vtwVarC;
            vtxVar121.b |= 8;
            return j$.util.Optional.of((defpackage.vtx) akzxVarM21.p());
        }
        akzx akzxVarM22 = defpackage.vtx.a.m();
        akzxVarM22.u();
        defpackage.vtx vtxVar122 = (defpackage.vtx) akzxVarM22.b;
        j$.util.Objects.requireNonNull(vziVar);
        vtxVar122.c = vziVar;
        vtxVar122.b |= 1;
        java.lang.String string43 = ((android.content.Context) this.d).getString(2132020980);
        akzxVarM22.u();
        defpackage.vtx vtxVar123 = (defpackage.vtx) akzxVarM22.b;
        j$.util.Objects.requireNonNull(string43);
        vtxVar123.b |= 2;
        vtxVar123.d = string43;
        java.lang.String string44 = q(2132020979).toString();
        akzxVarM22.u();
        defpackage.vtx vtxVar124 = (defpackage.vtx) akzxVarM22.b;
        j$.util.Objects.requireNonNull(string44);
        vtxVar124.b |= 4;
        vtxVar124.e = string44;
        boolean zJ22 = j(vziVar);
        akzxVarM22.u();
        defpackage.vtx vtxVar125 = (defpackage.vtx) akzxVarM22.b;
        vtxVar125.b |= 32;
        vtxVar125.h = zJ22;
        defpackage.vtw vtwVarA7 = ((defpackage.vvb) this.a).a();
        akzxVarM22.u();
        defpackage.vtx vtxVar126 = (defpackage.vtx) akzxVarM22.b;
        j$.util.Objects.requireNonNull(vtwVarA7);
        vtxVar126.f = vtwVarA7;
        vtxVar126.b |= 8;
        defpackage.vtw vtwVarP21 = p();
        akzxVarM22.u();
        defpackage.vtx vtxVar127 = (defpackage.vtx) akzxVarM22.b;
        j$.util.Objects.requireNonNull(vtwVarP21);
        vtxVar127.g = vtwVarP21;
        vtxVar127.b |= 16;
        return j$.util.Optional.of((defpackage.vtx) akzxVarM22.p());
    }

    public final void k() {
        agsm.i(961, ((defpackage.pvr) this.a).g(), "Failed to resume video.", new java.lang.Object[0]);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq l() {
        oko okoVar = (oko) this.b;
        ajcq ajcqVarF = aosv.F(okoVar.d, 0, new ogf(okoVar, (aoln) null, 11), 3);
        java.lang.Object obj = this.a;
        j$.util.Objects.requireNonNull(obj);
        ajcq ajcqVarF2 = ahvr.F(new defpackage.tvg(obj, 12), (java.util.concurrent.Executor) this.d);
        return ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarF2}).o(new defpackage.uwl(ajcqVarF2, ajcqVarF, 1), (java.util.concurrent.Executor) this.c);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    public final defpackage.tti m() {
        defpackage.tti ttiVarAd = wsc.cu(defpackage.tti.a.m()).ad();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ttiVarAd = ((defpackage.ttd) it.next()).b(ttiVarAd);
        }
        return ttiVarAd;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoss, java.lang.Object] */
    public final java.lang.Object n(defpackage.ttb ttbVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag((aoss) this.c, (ahda) this.d, new roz(this, ttbVar, (aoln) null, 18)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public zlr(android.content.Context context, defpackage.vud vudVar, defpackage.vvb vvbVar, rlv rlvVar) {
        this.d = context;
        this.c = vudVar;
        this.a = vvbVar;
        this.b = rlvVar;
    }

    public zlr(android.content.Context context, defpackage.vvb vvbVar, defpackage.vud vudVar, rlv rlvVar) {
        this.d = context;
        this.a = vvbVar;
        this.c = vudVar;
        this.b = rlvVar;
    }

    public zlr(aolr aolrVar, zzx zzxVar, zzx zzxVar2, tmi tmiVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(tmiVar, "sharpieConfigProvider");
        this.d = aolrVar;
        this.b = zzxVar;
        this.c = zzxVar2;
        this.a = tmiVar;
    }

    public zlr(java.util.List list, defpackage.xvu xvuVar, defpackage.xxt xxtVar, android.content.ContentResolver contentResolver) {
        this.c = xvuVar;
        this.d = xxtVar;
        this.b = contentResolver;
        this.a = list;
    }

    public zlr(oko okoVar, ajct ajctVar, ajct ajctVar2, android.os.UserManager userManager) {
        this.b = okoVar;
        this.c = ajctVar;
        this.d = ajctVar2;
        this.a = userManager;
    }

    public zlr(defpackage.qbe qbeVar, mba mbaVar) {
        aooh.f(qbeVar, "inCallLogging");
        this.c = qbeVar;
        this.a = mbaVar;
        this.d = new defpackage.ppr() { // from class: tur
            @Override // defpackage.ppr
            public final void b() {
                defpackage.zlr zlrVar = this.a;
                ((defpackage.qbe) zlrVar.c).a(qbc.jE);
                ((mba) zlrVar.a).b(mce.fz);
            }
        };
        this.b = new defpackage.ppq() { // from class: tus
            @Override // defpackage.ppq
            public final void a() {
                defpackage.zlr zlrVar = this.a;
                ((defpackage.qbe) zlrVar.c).a(qbc.jF);
                ((mba) zlrVar.a).b(mce.fA);
            }
        };
    }

    public zlr(rlv rlvVar, gpd gpdVar, ruc rucVar, android.content.Context context) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rucVar, "metrics");
        aooh.f(context, "appContext");
        this.a = rlvVar;
        this.d = gpdVar;
        this.c = rucVar;
        this.b = context;
    }

    public zlr(ssq ssqVar, kaw kawVar, tkl tklVar, ahbv ahbvVar) {
        this.b = ssqVar;
        this.c = kawVar;
        this.a = tklVar;
        this.d = ahbvVar;
    }

    public zlr(defpackage.uvb uvbVar, agab agabVar, ajct ajctVar, zzx zzxVar) {
        this.d = uvbVar;
        this.b = agabVar;
        this.c = ajctVar;
        this.a = zzxVar;
    }

    public zlr(defpackage.yhh yhhVar, defpackage.yhh yhhVar2, defpackage.yhh yhhVar3, defpackage.yhh yhhVar4) {
        this.a = yhhVar;
        this.d = yhhVar2;
        this.b = yhhVar3;
        this.c = yhhVar4;
    }

    public zlr(defpackage.zhp zhpVar, defpackage.zho zhoVar, defpackage.uyg uygVar, defpackage.uyg uygVar2) {
        aooh.f(zhpVar, "callingTelecom");
        this.d = zhpVar;
        this.c = zhoVar;
        this.a = uygVar;
        this.b = uygVar2;
    }

    public zlr(zpm zpmVar, defpackage.afpl afplVar, aoss aossVar, apni apniVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(afplVar, "inCallSharedFeatureModelCache");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        this.b = zpmVar;
        this.c = afplVar;
        this.a = aossVar;
        this.d = apniVar;
    }

    public zlr(ajct ajctVar, defpackage.afpl afplVar, defpackage.ute uteVar) {
        this.c = new java.util.concurrent.atomic.AtomicReference();
        this.a = afplVar;
        this.b = ajctVar;
        this.d = uteVar;
    }

    public zlr(android.content.Context context, aoin aoinVar) {
        this.d = context;
        this.b = aoinVar;
        this.a = ahvr.bI(new defpackage.wtx(context, 0));
        this.c = ahvr.bI(new defpackage.wtx(context, 2));
    }

    public zlr(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.c = aoinVar3;
        aoinVar4.getClass();
        this.d = aoinVar4;
    }

    public zlr(android.content.Context context, ajct ajctVar, aoin aoinVar, zzx zzxVar) {
        this.d = context;
        this.c = ajctVar;
        this.a = zzxVar;
        this.b = aoinVar;
    }

    public zlr(defpackage.pqm pqmVar, defpackage.pvr pvrVar, zpz zpzVar) {
        this.b = new java.util.concurrent.atomic.AtomicBoolean();
        this.d = pqmVar;
        this.a = pvrVar;
        this.c = zpzVar;
    }

    public zlr(defpackage.uyg uygVar, defpackage.uyg uygVar2, zzx zzxVar) {
        this.a = uygVar;
        this.c = uygVar2;
        this.d = zzxVar;
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }
}
