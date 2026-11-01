package com.android.dialer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Dialer_Application extends defpackage.hkv {
    @Override // defpackage.hkv, defpackage.hkc, defpackage.ahfu, android.app.Application
    public final void onCreate() {
        if (!d()) {
            super.onCreate();
            return;
        }
        defpackage.ahqz ahqzVar = new defpackage.ahqz(defpackage.ahns.k);
        if (ahqzVar.e()) {
            long jAG = defpackage.agab.aG();
            defpackage.ahok ahokVarB = ((defpackage.ahfv) defpackage.agab.aH(this, defpackage.ahfv.class)).fh().b(1386, defpackage.agab.aF(jAG), 1000000 * jAG);
            try {
                defpackage.ahns.k = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
                defpackage.afec.a().post(new defpackage.aafk(4));
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(4, "Application.onCreate", defpackage.ahot.a, true);
                try {
                    super.onCreate();
                    ahoqVarX.close();
                    ahokVarB.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarX.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahokVarB.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        defpackage.ahpm ahpmVarA = ahqzVar.a();
        try {
            defpackage.ahou ahouVar = defpackage.ahot.a;
            defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(2, "Application creation", ahouVar, true);
            try {
                defpackage.ahoq ahoqVarX3 = defpackage.ahvr.X(3, "Application.onCreate", ahouVar, true);
                try {
                    super.onCreate();
                    ahoqVarX3.close();
                    ahoqVarX2.close();
                    ahpmVarA.close();
                } catch (java.lang.Throwable th5) {
                    try {
                        ahoqVarX3.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (java.lang.Throwable th7) {
                try {
                    ahoqVarX2.close();
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th9) {
            try {
                ahpmVarA.close();
                throw th9;
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }
}
