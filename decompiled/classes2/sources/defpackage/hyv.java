package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyv {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/AudioControllerSelector");
    public final agsm b;
    public final java.util.Map c;
    public final defpackage.ibs d;
    public final ajcu e;
    public j$.util.Optional f = j$.util.Optional.empty();
    private final defpackage.hyy g;

    public hyv(agsm agsmVar, defpackage.hyy hyyVar, java.util.Map map, defpackage.ibs ibsVar, ajcu ajcuVar) {
        this.b = agsmVar;
        this.g = hyyVar;
        this.c = map;
        this.d = ibsVar;
        this.e = ajcuVar;
    }

    public final defpackage.hzi a() {
        lpb.b();
        ahvr.bZ(this.f.isPresent(), "audio mode not set");
        java.lang.Object objOrElseThrow = this.f.orElseThrow();
        java.util.Map map = this.c;
        ahvr.cc(map.containsKey(objOrElseThrow), "missing controller for %s", this.f);
        return (defpackage.hzi) map.get(this.f.orElseThrow());
    }

    public final ajcq b() {
        return this.e.eU(ahqx.i(new defpackage.hkx(this, 3)));
    }

    public final void c(defpackage.hwy hwyVar) {
        ahoq ahoqVarW = ahvr.W(88, "AudioControllerSelector_updateAudioMode");
        try {
            lpb.b();
            a.b().l("com/android/dialer/audio/impl/AudioControllerSelector", "updateAudioMode", 179, "AudioControllerSelector.java").y("setting audio mode to %s", hwyVar);
            this.f = j$.util.Optional.of(hwyVar);
            defpackage.hyy hyyVar = this.g;
            hyyVar.f = j$.util.Optional.of(a());
            hyyVar.g = j$.util.Optional.of(hwyVar);
            for (java.util.Map.Entry entry : hyyVar.e.entrySet()) {
                defpackage.hzh hzhVar = (defpackage.hzh) entry.getKey();
                defpackage.hzl hzlVar = (defpackage.hzl) entry.getValue();
                if (!((defpackage.hyw) hyyVar.b.get(hzhVar)).e()) {
                    defpackage.hyy.a.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "setAudioController", 164, "AudioSourceSelector.java").y("multicasterV2 for audioSourceType: %s has no endpoints, not activating source.", hzhVar);
                } else if (hzlVar instanceof defpackage.hze) {
                    defpackage.hyy.a.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "setAudioController", 171, "AudioSourceSelector.java").v("using external audio source, not reactivating source");
                } else {
                    hyyVar.b(hzhVar);
                    hyyVar.a(hzhVar);
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
