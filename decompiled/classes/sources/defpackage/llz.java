package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class llz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/tts/client/TtsRepository");
    public static final java.lang.String b = defpackage.akff.a("en-IE").q;
    public final defpackage.ajct c;
    public final defpackage.aogc d;
    private final defpackage.ajct e;
    private final defpackage.rsr f;

    public llz(defpackage.rsr rsrVar, defpackage.aogc aogcVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2) {
        this.f = rsrVar;
        this.d = aogcVar;
        this.e = ajctVar;
        this.c = ajctVar2;
    }

    public final defpackage.ajcq a(defpackage.akff akffVar) {
        java.lang.String str = java.lang.String.format("callscreen-tts-default-%s", akffVar);
        acvm acvmVarA = acvn.a();
        acvmVarA.b(str);
        acvn acvnVarA = acvmVarA.a();
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "findBestClientFileGroup", 188, "TtsRepository.java")).y("looking up ClientFileGroup with name %s", str);
        return defpackage.ahvr.I(this.f.G(acvnVarA), new juo(this, str, akffVar, 13, (char[]) null), this.e);
    }

    public final defpackage.ajcq b(lhr lhrVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "languagePackInterpreter", 148, "TtsRepository.java")).y("enter - userSettings=%s", lhrVar);
        j$.util.Optional optional = lhrVar.a;
        if (!optional.isPresent()) {
            return defpackage.aiql.z(j$.util.Optional.empty());
        }
        defpackage.ajcq ajcqVarA = a((defpackage.akff) optional.orElseThrow());
        lhy lhyVar = new lhy(this, 15);
        defpackage.ajct ajctVar = this.e;
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarA, lhyVar, ajctVar);
        return defpackage.ahvr.ak(ajcqVarA, ajcqVarI).o(new hsl(ajcqVarA, ajcqVarI, lhrVar, 9, (char[]) null), ajctVar);
    }

    public final defpackage.ajcq c(lhr lhrVar) {
        defpackage.ajcq ajcqVarO;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(307, "TtsRepository_voicePackInterpreter");
        try {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "voicePackInterpreter", 99, "TtsRepository.java")).y("enter - userSettings=%s", lhrVar);
            j$.util.Optional optional = lhrVar.a;
            if (optional.isPresent()) {
                defpackage.ajcq ajcqVarA = a((defpackage.akff) optional.orElseThrow());
                lhy lhyVar = new lhy(this, 15);
                defpackage.ajct ajctVar = this.e;
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarA, lhyVar, ajctVar);
                ajcqVarO = defpackage.ahvr.ak(ajcqVarA, ajcqVarI).o(new hsl(ajcqVarA, ajcqVarI, lhrVar, 8, (char[]) null), ajctVar);
                ahoqVarW.a(ajcqVarO);
            } else {
                ajcqVarO = defpackage.aiql.z(j$.util.Optional.empty());
            }
            ahoqVarW.close();
            return ajcqVarO;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
