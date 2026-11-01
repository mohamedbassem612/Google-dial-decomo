package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tbq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository");
    public final defpackage.ajct b;
    public final defpackage.rsr c;
    private final defpackage.aoin d;
    private final defpackage.rsr e;

    public tbq(defpackage.rsr rsrVar, defpackage.rsr rsrVar2, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.c = rsrVar2;
        this.e = rsrVar;
        this.b = ajctVar;
        this.d = aoinVar;
    }

    public final defpackage.ajcq a(j$.util.Optional optional) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "audioGroupInterpreter", 57, "RevelioTtsRepository.java")).y("enter - voice=%s", optional);
        if (!optional.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "audioGroupInterpreter", 60, "RevelioTtsRepository.java")).v("voice is not present");
            return defpackage.aiql.z(j$.util.Optional.empty());
        }
        java.lang.String str = (java.lang.String) optional.orElseThrow();
        if (((defpackage.yqc) this.d.a()).b.contains(str)) {
            return defpackage.ahvr.H(b(), new oqe(this, str, 19), this.b);
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "audioGroupInterpreter", 66, "RevelioTtsRepository.java")).y("voice is unsupported=%s", str);
        return defpackage.aiql.z(j$.util.Optional.empty());
    }

    public final defpackage.ajcq b() {
        acvm acvmVarA = acvn.a();
        acvmVarA.b("revelio-strings-tts");
        acvn acvnVarA = acvmVarA.a();
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "getClientFileGroup", 95, "RevelioTtsRepository.java")).y("looking up ClientFileGroup with name %s", "revelio-strings-tts");
        return defpackage.ahvr.H(this.e.G(acvnVarA), new tbp(1), this.b);
    }
}
