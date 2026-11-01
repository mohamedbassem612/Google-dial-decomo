package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dfc implements android.view.translation.ViewTranslationCallback {
    public static final defpackage.dfc a = new defpackage.dfc();

    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[LOOP:0: B:5:0x001b->B:22:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0076 A[EDGE_INSN: B:25:0x0076->B:23:0x0076 BREAK  A[LOOP:0: B:5:0x001b->B:22:0x0073], SYNTHETIC] */
    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(android.view.View view) {
        int i;
        defpackage.dhr dhrVar;
        defpackage.aomy aomyVar;
        defpackage.aooh.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        defpackage.cnn cnnVar = ((defpackage.deg) view).r;
        cnnVar.f = 1;
        defpackage.aco acoVarH = cnnVar.h();
        java.lang.Object[] objArr = acoVarH.c;
        long[] jArr = acoVarH.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            defpackage.die dieVar = ((defpackage.dij) ((defpackage.ajwz) objArr[(i2 << 3) + i4]).c).b;
                            if (dieVar.g(defpackage.din.F) != null && (dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.n)) != null && (aomyVar = (defpackage.aomy) dhrVar.b) != null) {
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b A[LOOP:0: B:5:0x001b->B:22:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x007e A[EDGE_INSN: B:25:0x007e->B:23:0x007e BREAK  A[LOOP:0: B:5:0x001b->B:22:0x007b], SYNTHETIC] */
    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(android.view.View view) {
        int i;
        defpackage.dhr dhrVar;
        defpackage.aonj aonjVar;
        defpackage.aooh.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        defpackage.cnn cnnVar = ((defpackage.deg) view).r;
        cnnVar.f = 1;
        defpackage.aco acoVarH = cnnVar.h();
        java.lang.Object[] objArr = acoVarH.c;
        long[] jArr = acoVarH.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            defpackage.die dieVar = ((defpackage.dij) ((defpackage.ajwz) objArr[(i2 << 3) + i4]).c).b;
                            if (defpackage.aooh.n(dieVar.g(defpackage.din.F), java.lang.Boolean.TRUE) && (dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.m)) != null && (aonjVar = (defpackage.aonj) dhrVar.b) != null) {
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(android.view.View view) {
        int i;
        defpackage.dhr dhrVar;
        defpackage.aonj aonjVar;
        defpackage.aooh.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        defpackage.cnn cnnVar = ((defpackage.deg) view).r;
        cnnVar.f = 2;
        defpackage.aco acoVarH = cnnVar.h();
        java.lang.Object[] objArr = acoVarH.c;
        long[] jArr = acoVarH.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        defpackage.die dieVar = ((defpackage.dij) ((defpackage.ajwz) objArr[(i2 << 3) + i4]).c).b;
                        if (defpackage.aooh.n(dieVar.g(defpackage.din.F), java.lang.Boolean.FALSE) && (dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.m)) != null && (aonjVar = (defpackage.aonj) dhrVar.b) != null) {
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }
}
