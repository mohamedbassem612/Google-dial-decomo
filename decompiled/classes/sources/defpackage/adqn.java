package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqn implements defpackage.adnu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper");
    public final defpackage.adnu c;
    public final android.content.Context d;
    public defpackage.adqh e;
    public defpackage.ajct f;
    public defpackage.adqu g;
    public defpackage.aogc h;
    public final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    private final defpackage.adfr i = new defpackage.adfr("adqn", defpackage.ajbm.INSTANCE);

    public adqn(android.content.Context context, defpackage.adnu adnuVar) {
        this.d = context;
        this.c = adnuVar;
    }

    @Override // defpackage.adnu
    public final defpackage.aify a() {
        return this.c.a();
    }

    @Override // defpackage.adnu
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return this.c.b(aihdVar);
    }

    @Override // defpackage.adnu
    public final defpackage.ajcq c(java.util.concurrent.ExecutorService executorService, defpackage.adon adonVar) {
        return this.i.a(new defpackage.adqd(this, executorService, adonVar, 2));
    }

    @Override // defpackage.adnu
    public final defpackage.ajcq d(defpackage.aihd aihdVar) {
        return this.c.d(aihdVar);
    }

    public final defpackage.ajcq e(defpackage.aihd aihdVar) {
        java.lang.String strH = h();
        defpackage.aihb aihbVar = new defpackage.aihb();
        defpackage.ailj it = aihdVar.iterator();
        while (it.hasNext()) {
            aihbVar.c(new defpackage.adnv(strH, (java.lang.String) it.next()));
        }
        return d(aihbVar.g());
    }

    public final synchronized defpackage.ajcq f(java.lang.String str) {
        this.i.b();
        defpackage.ahvr.bR(this.h.ab(str).isPresent(), "unsupported voice ID %s", str);
        return defpackage.aiql.E(new adck(this, str, 3, (byte[]) null), this.f);
    }

    public final defpackage.ajcq g(java.lang.String str) {
        defpackage.ajcq ajcqVarA;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper", "updateVoiceId", 202, "PersistentVoiceFileManagerWrapper.java")).y("Attempting to change the current voiceId to %s", str);
        j$.util.Optional optionalAb = this.h.ab(str);
        if (optionalAb.isEmpty()) {
            return new defpackage.ajdd(new java.lang.IllegalArgumentException("unknown voice ".concat(java.lang.String.valueOf(str))));
        }
        java.lang.String str2 = ((defpackage.adsi) optionalAb.get()).b;
        synchronized (this) {
            try {
                if (str.equals(this.e.a())) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper", "updateVoiceId", 229, "PersistentVoiceFileManagerWrapper.java")).y("Current voiceId is already %s", str);
                    ajcqVarA = defpackage.ajcm.a;
                } else {
                    defpackage.adqh adqhVar = this.e;
                    if (defpackage.ahvr.cp(str)) {
                        throw new java.lang.IllegalArgumentException("Illegal null/empty voiceId");
                    }
                    if (defpackage.ahvr.cp(str2)) {
                        throw new java.lang.IllegalArgumentException("Illegal null/empty locale");
                    }
                    adqhVar.b(new defpackage.adqg(str, str2));
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper", "updateVoiceId", 220, "PersistentVoiceFileManagerWrapper.java")).y("Changed the current voiceId to %s", str);
                    ajcqVarA = this.g.a(new defpackage.nyf(this, str, 15), null);
                }
            } catch (java.io.IOException e) {
                return new defpackage.ajdd(e);
            }
        }
        return ajcqVarA;
    }

    public final synchronized java.lang.String h() {
        this.i.b();
        return this.e.a();
    }

    public final void i(defpackage.adop adopVar) {
        this.i.b();
        this.b.addIfAbsent(adopVar);
    }
}
