package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adkm implements defpackage.adhi {
    public final defpackage.aogc a;
    public final defpackage.agab b;

    public adkm(defpackage.ajct ajctVar, defpackage.agab agabVar) {
        this.a = new defpackage.aogc(ajctVar, "ChecksumValidator");
        this.b = agabVar;
    }

    @Override // defpackage.adhp
    public final java.lang.String a() {
        return "ChecksumValidator";
    }

    @Override // defpackage.adhi
    public final defpackage.ajcq b(defpackage.adhw adhwVar) {
        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/packs/ChecksumValidator", "cancel", 122, "ChecksumValidator.java")).y("Canceling checksum validation of %s", adhwVar);
        return this.a.ag(adhwVar);
    }
}
