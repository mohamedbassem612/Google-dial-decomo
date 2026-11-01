package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqo extends aiql {
    public final defpackage.ajqs a;
    public final ajyi b;

    private ajqo(defpackage.ajqs ajqsVar, ajyi ajyiVar) {
        this.a = ajqsVar;
        this.b = ajyiVar;
    }

    public static defpackage.ajqo ap(defpackage.ajqs ajqsVar, ajyi ajyiVar) throws java.security.GeneralSecurityException {
        if (ajqsVar.f() == ajyiVar.j()) {
            return new defpackage.ajqo(ajqsVar, ajyiVar);
        }
        throw new java.security.GeneralSecurityException("Key size mismatch");
    }

    public final /* synthetic */ ajsz ac() {
        return this.a;
    }
}
