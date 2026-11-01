package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajoa extends aiql {
    public final ajyi a;
    private final defpackage.ajob b;

    private ajoa(defpackage.ajob ajobVar, ajyi ajyiVar) {
        this.b = ajobVar;
        this.a = ajyiVar;
    }

    public static defpackage.ajoa ap(defpackage.ajob ajobVar, ajyi ajyiVar) throws java.security.GeneralSecurityException {
        if (ajobVar.a == ajyiVar.j()) {
            return new defpackage.ajoa(ajobVar, ajyiVar);
        }
        throw new java.security.GeneralSecurityException("Key size mismatch");
    }

    public final /* synthetic */ ajsz ac() {
        return this.b;
    }

    public final java.lang.Integer m() {
        return null;
    }
}
