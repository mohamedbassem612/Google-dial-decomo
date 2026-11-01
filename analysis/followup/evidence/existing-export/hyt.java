package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hyt {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider");
    public final android.content.Context b;
    private final defpackage.ahzi c;
    private final defpackage.ahzi d;

    public hyt(android.content.Context context, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("countriesProvider");
        }
        this.b = context;
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.hlv(aoinVar, 2));
        defpackage.aooh.e(ahziVarBI, "memoize(...)");
        this.c = ahziVarBI;
        this.d = defpackage.ahvr.bJ(new defpackage.hlv(this, 3), j$.time.Duration.ofSeconds(15L));
    }

    public final j$.util.Optional a() {
        java.lang.Object objEZ;
        java.lang.Object objEZ2 = this.c.eZ();
        defpackage.aooh.e(objEZ2, "get(...)");
        java.util.Map map = (java.util.Map) objEZ2;
        defpackage.ahzi ahziVar = this.d;
        defpackage.aooh.e(ahziVar, "memoizedCurrentPhysicalCountryIso");
        if (ahziVar == null) {
            defpackage.aooh.i("<this>");
        }
        try {
            objEZ = ahziVar.eZ();
        } catch (java.lang.NullPointerException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e).l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getOrNull", 155, "TtsLocaleProvider.kt")).v("The supplied value is not available yet.");
            objEZ = null;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(defpackage.kcq.K(map, (java.lang.String) objEZ));
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }
}
