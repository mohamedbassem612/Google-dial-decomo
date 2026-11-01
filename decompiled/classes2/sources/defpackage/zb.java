package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class zb {
    public static final float a(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        try {
            return ac$.ExternalSyntheticApiModelOutline0.m(edgeEffect);
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static final void b(android.widget.EdgeEffect edgeEffect, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final float c(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        try {
            return ac$.ExternalSyntheticApiModelOutline0.m(edgeEffect, f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static final void d(android.widget.EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof defpackage.anl)) {
            edgeEffect.onRelease();
            return;
        }
        defpackage.anl anlVar = (defpackage.anl) edgeEffect;
        float f2 = anlVar.b + f;
        anlVar.b = f2;
        if (java.lang.Math.abs(f2) > anlVar.a) {
            anlVar.onRelease();
        }
    }

    public static final float e(android.widget.EdgeEffect edgeEffect, float f, float f2, dpf dpfVar) {
        float f3 = defpackage.anf.a;
        float fA = dpfVar.a() * 386.0878f;
        float fAbs = java.lang.Math.abs(f) * 0.35f;
        double d = ((double) defpackage.anf.a) * ((double) (fA * 160.0f * 0.84f));
        double dExp = d * java.lang.Math.exp((defpackage.anf.b / defpackage.anf.c) * java.lang.Math.log(((double) fAbs) / d));
        if (((float) dExp) > a(edgeEffect) * f2) {
            return 0.0f;
        }
        b(edgeEffect, aopc.i(f));
        return f;
    }

    public static final defpackage.bis f(aonq aonqVar, cav cavVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !cavVar.B(aonqVar)) && (i & 6) != 4) {
            z = false;
        }
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (z || objR == cau.a) {
            objR = new defpackage.bis(aonqVar);
            cbtVar.ab(objR);
        }
        defpackage.bis bisVar = (defpackage.bis) objR;
        boolean zB = cavVar.B(bisVar);
        java.lang.Object objR2 = cbtVar.R();
        if (zB || objR2 == cau.a) {
            objR2 = new defpackage.bgf(bisVar, 15);
            cbtVar.ab(objR2);
        }
        cbp.c(bisVar, (aonj) objR2, cavVar);
        return bisVar;
    }

    public static final void g(cmw cmwVar, cbd cbdVar, aonq aonqVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        aonn aonnVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-714464401);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cbdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cbtVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.b);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.bis bisVarF = f(aonqVar, cbtVarB, (i2 >> 6) & 14);
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            den.ab(cbdVar.b(bisVarF), cfo.j(274270255, new defpackage.bit(cmwVar2, (ccp) objR, aonnVar2, bisVarF, 0), cbtVarB), cbtVarB, 48);
        } else {
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(cmwVar2, cbdVar, aonqVar, aonnVar2, i, 0);
        }
    }

    public static final defpackage.bhe h(dao daoVar) {
        vx vxVar = new vx((char[]) null);
        den.o(daoVar, defpackage.bij.a, new defpackage.bgf(new defpackage.bgf(vxVar, 14), 13));
        adq adqVar = new adq(16);
        adq adqVar2 = (adq) vxVar.a;
        java.lang.Object[] objArr = adqVar2.a;
        int i = adqVar2.b;
        defpackage.bhd bhdVar = null;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.bhd bhdVar2 = (defpackage.bhd) objArr[i2];
            if (z && bhdVar2 == defpackage.bhh.b) {
                z = true;
            } else if (defpackage.xa.b(bhdVar2) && defpackage.xa.b(bhdVar)) {
                z = false;
            } else {
                if (!defpackage.xa.b(bhdVar2)) {
                    adq adqVar3 = (adq) vxVar.b;
                    java.lang.Object[] objArr2 = adqVar3.a;
                    int i3 = adqVar3.b;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            if (((java.lang.Boolean) ((aonj) objArr2[i4]).a(bhdVar2)).booleanValue()) {
                                i4++;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
                adqVar.q(bhdVar2);
                z = false;
                bhdVar = bhdVar2;
            }
        }
        if (defpackage.xa.b((defpackage.bhd) (adqVar.f() ? null : adqVar.a[adqVar.b - 1]))) {
            adqVar.h(adqVar.b - 1);
        }
        return new defpackage.bhe(adqVar.j());
    }

    public static final aw i(android.view.View view) {
        aooh.f(view, "<this>");
        aw awVarF = bo.f(view);
        if (awVarF != null) {
            return awVarF;
        }
        throw new java.lang.IllegalStateException(a.bg(view, "View ", " does not have a Fragment set"));
    }

    public static final eoi j(aoir aoirVar) {
        return (eoi) aoirVar.a();
    }

    public static final aoir k(aw awVar, aopu aopuVar, aomy aomyVar, aomy aomyVar2, aomy aomyVar3) {
        aooh.f(awVar, "<this>");
        return new defpackage.eoc(aopuVar, aomyVar, aomyVar3, aomyVar2);
    }

    public static void l(java.io.FileDescriptor fileDescriptor) {
        try {
            android.system.Os.close(fileDescriptor);
        } catch (android.system.ErrnoException e) {
            android.util.Log.e("ExifInterfaceUtils", "Error closing fd.", e);
        }
    }

    public static void m(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = java.lang.Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new java.io.IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    public static boolean n(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] o(java.lang.Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void p(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    public static boolean q(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z) {
        defpackage.ekc[] ekcVarArr;
        if (!android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (s(selectionStart, selectionEnd) || (ekcVarArr = (defpackage.ekc[]) editable.getSpans(selectionStart, selectionEnd, defpackage.ekc.class)) == null || (ekcVarArr.length) <= 0) {
            return false;
        }
        for (defpackage.ekc ekcVar : ekcVarArr) {
            int spanStart = editable.getSpanStart(ekcVar);
            int spanEnd = editable.getSpanEnd(ekcVar);
            if (z) {
                if (spanStart != selectionStart) {
                    if (selectionStart > spanStart || selectionStart >= spanEnd) {
                    }
                }
            } else if (spanEnd != selectionStart) {
                if (selectionStart > spanStart) {
                }
            }
            editable.delete(spanStart, spanEnd);
            return true;
        }
        return false;
    }

    public static boolean r(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (s(selectionStart, selectionEnd)) {
            return false;
        }
        if (z) {
            int iMax = java.lang.Math.max(i, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z2 = false;
                    while (true) {
                        if (iMax != 0) {
                            selectionStart--;
                            if (selectionStart < 0) {
                                if (!z2) {
                                    selectionStart = 0;
                                    break loop0;
                                }
                            } else {
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (java.lang.Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!java.lang.Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                            }
                            selectionStart = -1;
                            break loop0;
                        }
                        break loop0;
                    }
                }
            }
            selectionStart = -1;
            break loop0;
            int iMax2 = java.lang.Math.max(i2, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (iMax2 == 0) {
                            iMin = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd >= iMin) {
                            if (!z3) {
                                break loop2;
                            }
                            break loop2;
                        }
                        char cCharAt2 = editable.charAt(selectionEnd);
                        if (z3) {
                            if (java.lang.Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                iMax2--;
                            }
                        } else if (!java.lang.Character.isSurrogate(cCharAt2)) {
                            selectionEnd++;
                            iMax2--;
                        } else if (!java.lang.Character.isLowSurrogate(cCharAt2)) {
                            selectionEnd++;
                            z3 = true;
                        }
                        iMin = -1;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = java.lang.Math.max(selectionStart - i, 0);
            iMin = java.lang.Math.min(selectionEnd + i2, editable.length());
        }
        defpackage.ekc[] ekcVarArr = (defpackage.ekc[]) editable.getSpans(selectionStart, iMin, defpackage.ekc.class);
        if (ekcVarArr == null || (ekcVarArr.length) <= 0) {
            return false;
        }
        for (defpackage.ekc ekcVar : ekcVarArr) {
            int spanStart = editable.getSpanStart(ekcVar);
            int spanEnd = editable.getSpanEnd(ekcVar);
            selectionStart = java.lang.Math.min(spanStart, selectionStart);
            iMin = java.lang.Math.max(spanEnd, iMin);
        }
        int iMax3 = java.lang.Math.max(selectionStart, 0);
        int iMin2 = java.lang.Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    private static boolean s(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
