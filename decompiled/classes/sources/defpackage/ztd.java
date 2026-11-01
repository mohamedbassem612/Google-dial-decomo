package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ztd extends defpackage.afgd {
    private final defpackage.afhi a;
    private final defpackage.aepd b;

    public ztd(java.lang.String str, defpackage.albh albhVar) {
        if (albhVar == null) {
            defpackage.aooh.i("defaultInstance");
        }
        this.a = new defpackage.afhi(albhVar);
        this.b = new defpackage.aepg(str);
    }

    @Override // defpackage.afgd
    public final defpackage.ajcq a(java.io.IOException iOException, defpackage.afge afgeVar) {
        defpackage.aooh.f(afgeVar, "handlerApi");
        ((defpackage.aimw) ((defpackage.aimw) defpackage.zte.a.c()).k(iOException).l("com/google/android/dialershared/protodatastore/DialerProtoDataStoreConfigBuilder$DialerReplaceFileIOExceptionHandler", "handleReadException", 39, "DialerProtoDataStoreConfigBuilder.kt")).y("Failed to read ProtoDataStore for %s", this.b);
        return this.a.a(iOException, afgeVar);
    }
}
