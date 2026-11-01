package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqo implements defpackage.adqq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/audiomessages/TtsAudioFileProvider");
    public final defpackage.adsg b;
    public final defpackage.adqj c;
    public final defpackage.ajct d;
    public final java.util.concurrent.ConcurrentMap e = new j$.util.concurrent.ConcurrentHashMap();
    private final defpackage.aihd f;

    public adqo(defpackage.ajct ajctVar, defpackage.adsg adsgVar, defpackage.adqj adqjVar) {
        this.d = ajctVar;
        this.b = adsgVar;
        this.c = adqjVar;
        this.f = (defpackage.aihd) j$.util.Collection.-EL.stream(adsgVar.a()).map(new defpackage.vaq(14)).collect(defpackage.aido.b);
    }

    @Override // defpackage.adqq
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        java.util.Set set = (java.util.Set) j$.util.Collection.-EL.stream(aihdVar).filter(new defpackage.tcw(this, 10)).collect(j$.util.stream.Collectors.toSet());
        return !set.isEmpty() ? new defpackage.ajdd(new defpackage.adnt(set)) : new defpackage.adqr(new defpackage.ajbh(defpackage.aify.j((java.util.List) j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.okq(this, 8)).collect(j$.util.stream.Collectors.toList())), true));
    }

    @Override // defpackage.adqq
    public final j$.util.Optional c(defpackage.adnv adnvVar) {
        java.lang.String str = adnvVar.b;
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("message text cannot be empty");
        }
        defpackage.aihd aihdVar = this.f;
        java.lang.String str2 = adnvVar.a;
        defpackage.ahvr.bR(aihdVar.contains(str2), "unsupported voice %s", str2);
        java.io.File fileA = this.c.a(str2, str);
        return fileA.isFile() ? j$.util.Optional.of(fileA) : j$.util.Optional.empty();
    }

    @Override // defpackage.adqq
    public final boolean e(defpackage.adnv adnvVar) {
        java.lang.String str = adnvVar.b;
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("message text cannot be empty");
        }
        return !str.isEmpty() && this.f.contains(adnvVar.a);
    }
}
