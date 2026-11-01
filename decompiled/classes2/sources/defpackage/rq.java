package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class rq {
    public rq(byte[] bArr) {
    }

    public static java.util.List a(android.app.appsearch.AppSearchSchema.DocumentPropertyConfig documentPropertyConfig) {
        return mp$.ExternalSyntheticApiModelOutline1.m(documentPropertyConfig);
    }

    public static int b(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd();
        }
        return 0;
    }

    public static int c(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static int d(android.view.View view) {
        int measuredHeight = view.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    public static int e(android.view.View view) {
        return c(view) + b(view);
    }

    public static int f(android.view.View view) {
        return view.getMeasuredWidth() + e(view);
    }

    public static long g(defpackage.cuf cufVar, aso asoVar, cue cueVar) {
        float fIntBitsToFloat;
        if (asoVar != null) {
            int i = cueVar.a;
            if (i == 1) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cufVar.c >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cufVar.c & 4294967295L));
            }
            return asoVar == aso.b ? ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        }
        return cufVar.c;
    }

    public static long h(defpackage.cuf cufVar, aso asoVar, cue cueVar) {
        float fIntBitsToFloat;
        if (asoVar != null) {
            int i = cueVar.a;
            if (i == 1) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cufVar.e >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cufVar.e & 4294967295L));
            }
            return asoVar == aso.b ? ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        }
        return cufVar.e;
    }

    public static boolean i(defpackage.cuf cufVar) {
        return !cufVar.f && cufVar.d;
    }

    public static boolean j(defpackage.cuf cufVar) {
        return cufVar.f && !cufVar.d;
    }

    public static defpackage.ely k(defpackage.ely elyVar, float[] fArr) {
        return elyVar.d(new defpackage.byy(fArr));
    }

    public static /* synthetic */ cpx l(defpackage.ely elyVar, cpx cpxVar, boolean z, int i) {
        if ((i & 1) != 0) {
            cpxVar = new cpx((byte[]) null);
        }
        cpx cpxVar2 = cpxVar;
        u(cpxVar2, (i & 2) != 0 ? 270 : 0, ((i & 4) == 0) & z, true, elyVar.b, elyVar.a(), elyVar.b());
        return cpxVar2;
    }

    public static int m(czc czcVar) {
        if (czcVar != null) {
            return czcVar.b;
        }
        return 0;
    }

    public static int n(czc czcVar) {
        if (czcVar != null) {
            return czcVar.a;
        }
        return 0;
    }

    public static int o(int i, int i2) {
        return i != Integer.MAX_VALUE ? aooc.t(i - i2, 0) : androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static void p(defpackage.drr drrVar, aonn aonnVar, defpackage.bwj bwjVar, cmw cmwVar, boolean z, boolean z2, aonn aonnVar2, cav cavVar, int i) {
        int i2;
        boolean z3;
        boolean z4;
        ccp ccpVar;
        boolean z5;
        boolean z6;
        defpackage.bwj bwjVar2 = bwjVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1221877520);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(drrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cbtVarB.B(bwjVar2) : cbtVarB.D(bwjVar2)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != cbtVarB.C(false) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.C(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cbtVarB.C(z2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cbtVarB.D(aonnVar2) ? 33554432 : 67108864;
        }
        if (cbtVarB.H((38347923 & i2) != 38347922, i2 & 1)) {
            int i4 = i2 >> 6;
            int i5 = i2 >> 3;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = cbp.a(aols.a, cbtVarB);
                cbtVar.ab(objR);
            }
            aoss aossVar = (aoss) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR2 = parcelableSnapshotMutableState;
            }
            ccp ccpVar2 = (ccp) objR2;
            if (z2) {
                cbtVarB.u(-1698204881);
                boolean zBooleanValue = ((java.lang.Boolean) ccpVar2.a()).booleanValue();
                if (((java.lang.Boolean) defpackage.ro.s(true, cbtVarB).a()).booleanValue() || zBooleanValue) {
                    z3 = false;
                    z6 = true;
                } else {
                    z3 = false;
                    z6 = false;
                }
                cbtVar.W(z3);
                z4 = z6;
            } else {
                z3 = false;
                cbtVarB.u(-1104742522);
                cbtVar.W(false);
                z4 = false;
            }
            cmt cmtVar = cmw.c;
            cye cyeVarB = awo.b(cmh.a, z3);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmtVar);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            boolean z7 = z4;
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            int i6 = i5 & 112;
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            if (bwjVar.c()) {
                cbtVarB.u(-1891243071);
                q(drrVar, bwjVar, aossVar, z7, ccpVar2, aonnVar, cbtVarB, (i2 & 14) | 196608 | i6 | (i4 & 896) | ((i2 << 15) & 3670016));
                ccpVar = ccpVar2;
                z5 = false;
                cbtVar.W(false);
            } else {
                ccpVar = ccpVar2;
                z5 = false;
                cbtVarB.u(-1890863476);
                cbtVar.W(false);
            }
            int i7 = 14;
            bwjVar2 = bwjVar;
            r(z, bwjVar2, ccpVar, z2, cmwVar, aonnVar2, cbtVarB, ((i2 >> 18) & 14) | 384 | i6 | ((i2 >> 12) & 7168) | ((i2 << 3) & 57344) | ((i2 >> 9) & 458752));
            cbtVar.W(true);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && cbtVarB.D(bwjVar2))) {
                z5 = true;
            }
            java.lang.Object objR3 = cbtVar.R();
            if (z5 || objR3 == obj) {
                objR3 = new defpackage.bru(bwjVar2, i7);
                cbtVar.ab(objR3);
            }
            cbp.c(bwjVar2, (aonj) objR3, cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpx(drrVar, aonnVar, bwjVar2, cmwVar, z, z2, aonnVar2, i, 2);
        }
    }

    public static void q(defpackage.drr drrVar, defpackage.bwj bwjVar, aoss aossVar, boolean z, ccp ccpVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1413720282);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(drrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(bwjVar) : cbtVarB.D(bwjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cbtVarB.B(aossVar) : cbtVarB.D(aossVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.B(ccpVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (cbtVarB.H((599187 & i4) != 599186, i4 & 1)) {
            java.lang.String strF = dfa.f(2132020592, cbtVarB);
            boolean z3 = ((i4 & 896) == 256) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && cbtVarB.D(bwjVar))) | ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && cbtVarB.D(aossVar)));
            boolean z4 = (458752 & i4) == 131072;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z3 || z4) || objR == cau.a) {
                z2 = false;
                defpackage.af afVar = new defpackage.af((java.lang.Object) bwjVar, (java.lang.Object) aossVar, (java.lang.Object) ccpVar, 10, (byte[]) null);
                cbtVar.ab(afVar);
                objR = afVar;
            } else {
                z2 = false;
            }
            defpackage.dra.b(drrVar, (aomy) objR, new defpackage.drs(z, z2, 1002, 1536), cfo.j(-1287705660, new defpackage.awu(strF, aonnVar, 20), cbtVarB), cbtVarB, (i4 & 14) | 3072, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bxp(drrVar, bwjVar, aossVar, z, ccpVar, aonnVar, i, 0);
        }
    }

    public static void r(boolean z, defpackage.bwj bwjVar, ccp ccpVar, boolean z2, cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cmw cmwVarA;
        boolean z3 = z;
        defpackage.bwj bwjVar2 = bwjVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1873232064);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z3) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(bwjVar2) : cbtVarB.D(bwjVar2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(ccpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 65536 : 131072;
        }
        int i4 = i2;
        if (cbtVarB.H((74899 & i4) != 74898, i4 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = cbp.a(aols.a, cbtVarB);
                cbtVar.ab(objR);
            }
            aoss aossVar = (aoss) objR;
            java.lang.String strF = dfa.f(2132020593, cbtVarB);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR2 = parcelableSnapshotMutableState;
            }
            ccp ccpVar2 = (ccp) objR2;
            if (z3) {
                cmw cmwVarA2 = cvy.a(cvy.a(cmwVar, bwjVar2, new defpackage.bil(bwjVar2, 7)), bwjVar2, new defpackage.bil(bwjVar2, 8));
                bwjVar2 = bwjVar;
                cmwVarA = defpackage.rv.k(cmwVarA2.a(new defpackage.byv(new afx(strF, aossVar, bwjVar, 10, (byte[]) null))), new afx(aossVar, ccpVar2, bwjVar2, 9)).a(new defpackage.cuj(null, new defpackage.bxv(bwjVar2, ccpVar, z2, ccpVar2)));
                z3 = true;
            } else {
                ccpVar.b(java.lang.Boolean.FALSE);
                cmwVarA = cmwVar;
                z3 = false;
            }
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarA);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            aonnVar.a(cbtVarB, java.lang.Integer.valueOf((i4 >> 15) & 14));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        boolean z4 = z3;
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.lpl(z4, bwjVar2, ccpVar, z2, cmwVar, aonnVar, i, 1);
        }
    }

    public static void s(boolean z, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1437916225);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(aonnVar) : cavVarB.D(aonnVar)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.kj.r(z, aonnVar, cavVarB, i2 & 126);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.oa(z, aonnVar, i, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static /* synthetic */ cpx t(izg izgVar, float f, cpx cpxVar, boolean z, float f2, float f3, int i) {
        defpackage.ell ellVar = null;
        cpx cpxVar2 = (i & 2) != 0 ? new cpx((byte[]) null) : cpxVar;
        int i2 = (i & 4) != 0 ? 270 : 0;
        boolean z2 = ((i & 8) == 0) & z;
        boolean z3 = (i & 16) != 0;
        float f4 = (i & 32) != 0 ? 0.0f : f2;
        float f5 = (i & 64) == 0 ? f3 : 0.0f;
        aokv aokvVar = new aokv(10);
        ?? r9 = izgVar.c;
        int size = r9.size();
        defpackage.ell ellVar2 = null;
        int i3 = 0;
        while (i3 < size) {
            float[] fArr = new float[8];
            int i4 = 0;
            for (int i5 = 8; i4 < i5; i5 = 8) {
                float f6 = ((defpackage.ell) ((aoiu) r9.get(i3)).a).a[i4];
                float f7 = ((defpackage.ell) ((aoiu) r9.get(i3)).b).a[i4];
                float f8 = defpackage.ema.a;
                fArr[i4] = ((1.0f - f) * f6) + (f7 * f);
                i4++;
            }
            defpackage.ell ellVar3 = new defpackage.ell(fArr);
            if (ellVar2 == null) {
                ellVar2 = ellVar3;
            }
            if (ellVar != null) {
                aokvVar.add(ellVar);
            }
            i3++;
            ellVar = ellVar3;
        }
        if (ellVar != null && ellVar2 != null) {
            aokvVar.add(defpackage.aaf.h(ellVar.a(), ellVar.b(), ellVar.e(), ellVar.f(), ellVar.g(), ellVar.h(), ellVar2.a(), ellVar2.b()));
        }
        u(cpxVar2, i2, z2, z3, ajsz.aX(aokvVar), f4, f5);
        return cpxVar2;
    }

    private static void u(cpx cpxVar, int i, boolean z, boolean z2, java.util.List list, float f, float f2) {
        cpxVar.l();
        aokv aokvVar = (aokv) list;
        int i2 = aokvVar.b;
        boolean z3 = true;
        defpackage.ell ellVar = null;
        int i3 = 0;
        boolean z4 = true;
        while (i3 < i2) {
            defpackage.ell ellVar2 = (defpackage.ell) list.get(i3);
            if (z4) {
                cpxVar.f(ellVar2.a(), ellVar2.b());
                if (i != 0) {
                    ellVar = ellVar2;
                }
            }
            cpxVar.d(ellVar2.e(), ellVar2.f(), ellVar2.g(), ellVar2.h(), ellVar2.c(), ellVar2.d());
            i3++;
            z4 = false;
        }
        if (z) {
            int i4 = aokvVar.b;
            int i5 = 0;
            while (i5 < i4) {
                defpackage.ell ellVar3 = (defpackage.ell) list.get(i5);
                if (z3) {
                    cpxVar.e(ellVar3.a(), ellVar3.b());
                }
                cpxVar.d(ellVar3.e(), ellVar3.f(), ellVar3.g(), ellVar3.h(), ellVar3.c(), ellVar3.d());
                i5++;
                z3 = false;
            }
        }
        if (z2) {
            cpxVar.c();
        }
        if (i == 0 || ellVar == null) {
            return;
        }
        float fB = ((defpackage.ell) list.get(0)).b() - f2;
        float[] fArrE = cqt.e();
        cqt.d(fArrE, (-((float) ((((double) ((float) java.lang.Math.atan2(fB, ((defpackage.ell) list.get(0)).a() - f))) * 180.0d) / 3.141592653589793d))) + i);
        cpxVar.n(fArrE);
    }
}
