package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajnf {
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("UTF-8");

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(defpackage.ajex ajexVar) {
        for (int i = 0; i < ajexVar.a(); i++) {
            defpackage.ajew ajewVarC = ajexVar.c(i);
            if (ajewVarC.d && ajewVarC.b.equals(defpackage.ajeq.a)) {
                return true;
            }
        }
        return false;
    }
}
