package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ljf {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser");
    public final android.content.Context b;
    public final defpackage.ajcu c;
    public final defpackage.twp d;
    private final defpackage.lht e;
    private final defpackage.lcx f;
    private final defpackage.adnm g;
    private final defpackage.ljb h;
    private final defpackage.lbw i;
    private final defpackage.ljn j;

    public ljf(android.content.Context context, defpackage.ajcu ajcuVar, defpackage.twp twpVar, defpackage.lht lhtVar, defpackage.lcx lcxVar, defpackage.adnm adnmVar, defpackage.ljn ljnVar, defpackage.ljb ljbVar, defpackage.lbw lbwVar) {
        this.b = context;
        this.c = ajcuVar;
        this.d = twpVar;
        this.f = lcxVar;
        this.e = lhtVar;
        this.g = adnmVar;
        this.j = ljnVar;
        this.h = ljbVar;
        this.i = lbwVar;
    }

    public final defpackage.ajcq a() {
        defpackage.ajcq ajcmVar;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(299, "CallScreenModelChooser_getModelAvailability", defpackage.ahot.a, true);
        try {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "getModelAvailability", 133, "CallScreenModelChooser.java")).v("avatarSession - getModelAvailability");
            if (this.i.a()) {
                defpackage.ajcq ajcqVarB = this.e.b();
                defpackage.lix lixVar = new defpackage.lix(3);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                long j = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), lixVar);
                int i = defpackage.ajan.c;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarB, ahqvVar);
                ajcqVarB.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
                ajcmVar = ajamVar;
            } else {
                j$.util.Optional optionalOf = j$.util.Optional.of(defpackage.akff.f(defpackage.akff.d(this.h.a()), 2));
                ajcmVar = optionalOf == null ? defpackage.ajcm.a : new defpackage.ajcm(optionalOf);
            }
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcmVar);
            defpackage.lcx lcxVar = this.f;
            j$.util.Objects.requireNonNull(lcxVar);
            defpackage.ahrv ahrvVarI = ahrvVarG.h(new defpackage.jyx(lcxVar, 4), this.c).i(new defpackage.kjs(this, ajcmVar, 7, null), defpackage.ajbm.INSTANCE);
            ahoqVarX.a(ahrvVarI);
            ahoqVarX.close();
            return ahrvVarI;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final j$.util.Optional b(defpackage.aigf aigfVar) {
        defpackage.ailj it = aigfVar.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((defpackage.lje) entry.getValue()).equals(defpackage.lje.a)) {
                defpackage.aimz aimzVar = a;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "avatarSessionManager", 99, "CallScreenModelChooser.java")).y("using ASR model: %s", ((defpackage.ypm) entry.getKey()).name());
                defpackage.ypm ypmVar = (defpackage.ypm) entry.getKey();
                int iOrdinal = ypmVar.ordinal();
                if (iOrdinal == 1) {
                    return j$.util.Optional.of(this.g);
                }
                if (iOrdinal == 2) {
                    return j$.util.Optional.of(this.j);
                }
                defpackage.ainm ainmVarM = ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM);
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarM).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "avatarSessionManager", 'z', "CallScreenModelChooser.java")).y("no CallAvatarSessionManager for model %s", ypmVar.name());
                return j$.util.Optional.empty();
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "avatarSessionManager", 'g', "CallScreenModelChooser.java")).v("no available ASR models");
        return j$.util.Optional.empty();
    }
}
