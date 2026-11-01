package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amae implements defpackage.amad {
    @Override // defpackage.amad
    public final defpackage.amaj b(java.lang.String str) throws defpackage.alio {
        java.lang.String str2 = str + java.io.File.separator + "off_hold_specs.pb";
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str2);
            try {
                defpackage.amaj amajVar = (defpackage.amaj) alad.A(defpackage.amaj.a, fileInputStream, akzq.a());
                fileInputStream.close();
                return amajVar;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new defpackage.alio(java.lang.String.format("failed to load %s", str2), defpackage.alti.SPECS_LOADING_FAILURE, e);
        }
    }

    @Override // defpackage.amad
    public final defpackage.amha c(java.lang.String str) throws defpackage.alio {
        java.lang.String str2 = str + java.io.File.separator + "robot_intent_specs.pb";
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str2);
            try {
                defpackage.amha amhaVar = (defpackage.amha) alad.A(defpackage.amha.a, fileInputStream, akzq.a());
                fileInputStream.close();
                return amhaVar;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new defpackage.alio(java.lang.String.format("failed to load %s", str2), defpackage.alti.SPECS_LOADING_FAILURE, e);
        }
    }
}
