package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqt extends aiql {
    public final defpackage.ajqy a;
    public final ajyi b;

    private ajqt(defpackage.ajqy ajqyVar, ajyi ajyiVar) {
        this.a = ajqyVar;
        this.b = ajyiVar;
    }

    public static defpackage.ajqt ap(defpackage.ajqy ajqyVar, ajyi ajyiVar) throws java.security.GeneralSecurityException {
        if (ajqyVar.e() == ajyiVar.j()) {
            return new defpackage.ajqt(ajqyVar, ajyiVar);
        }
        throw new java.security.GeneralSecurityException("Key size mismatch");
    }

    public final /* synthetic */ ajsz ac() {
        return this.a;
    }
}
