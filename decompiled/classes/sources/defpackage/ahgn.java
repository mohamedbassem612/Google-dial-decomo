package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahgn extends defpackage.amyc {
    @Override // defpackage.amyc, defpackage.amyp
    public final /* bridge */ /* synthetic */ java.lang.Object B() {
        return B();
    }

    @Override // defpackage.amyc
    /* JADX INFO: renamed from: a */
    public final defpackage.amwz B() {
        if (!defpackage.ahns.q()) {
            return super.B();
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1390, "ScrRet#Comp", defpackage.ahot.a, true);
        try {
            defpackage.amwz amwzVarB = super.B();
            ahoqVarX.close();
            return amwzVarB;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
