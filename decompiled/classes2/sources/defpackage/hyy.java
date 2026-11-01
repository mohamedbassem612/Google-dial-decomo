package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyy {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/AudioSourceSelector");
    public final aigf b;
    public final ajcu c;
    public final defpackage.hzf d;
    public final java.util.Map e = new java.util.EnumMap(defpackage.hzh.class);
    public j$.util.Optional f = j$.util.Optional.empty();
    public j$.util.Optional g = j$.util.Optional.empty();

    public hyy(aigf aigfVar, ajcu ajcuVar, defpackage.hzf hzfVar) {
        this.b = aigfVar;
        this.c = ajcuVar;
        this.d = hzfVar;
        ailj ailjVarK = aigfVar.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            defpackage.hyw hywVar = (defpackage.hyw) entry.getValue();
            hywVar.c.add(new defpackage.hyx(this, entry));
        }
    }

    public final void a(defpackage.hzh hzhVar) {
        lpb.b();
        defpackage.hzi hziVar = (defpackage.hzi) this.f.orElse((java.lang.Object) null);
        ahvr.cj(hziVar, "audio controller not set");
        defpackage.hyw hywVar = (defpackage.hyw) this.b.get(hzhVar);
        ahvr.bZ(hywVar.e(), "no audio tee listening yet");
        java.util.Map map = this.e;
        boolean zContainsKey = map.containsKey(hzhVar);
        aimz aimzVar = a;
        if (zContainsKey) {
            aimzVar.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "activateSource", 195, "AudioSourceSelector.java").v("active source already set");
            return;
        }
        aimzVar.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "activateSource", 199, "AudioSourceSelector.java").y("activating source for AudioSourceType: %s", hzhVar);
        defpackage.hzl hzlVarA = hziVar.a(hzhVar);
        hywVar.c(j$.util.Optional.of(hzlVarA.a()));
        hzlVarA.c(hywVar);
        map.put(hzhVar, hzlVarA);
    }

    public final void b(defpackage.hzh hzhVar) {
        lpb.b();
        a.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "deactivateSource", 219, "AudioSourceSelector.java").y("enter deactivateSource(%s)", hzhVar);
        java.util.Map map = this.e;
        defpackage.hzl hzlVar = (defpackage.hzl) map.get(hzhVar);
        if (hzlVar != null) {
            hzlVar.b();
            map.remove(hzhVar);
        }
    }
}
