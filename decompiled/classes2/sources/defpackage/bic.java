package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bic {
    public static final defpackage.bic a = new defpackage.bic();

    public final void a(android.graphics.drawable.Drawable drawable, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(257732500);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(drawable) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmt cmtVar = cmw.c;
            long j = defpackage.aoy.a;
            cmw cmwVarG = azm.g(cmtVar, 24.0f);
            boolean zD = cbtVarB.D(drawable);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == cau.a) {
                objR = new defpackage.bgf(drawable, 11);
                cbtVar.ab(objR);
            }
            awo.c(ru.k(cmwVarG, (aonj) objR), cbtVarB, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(this, drawable, i, 12, null);
        }
    }
}
