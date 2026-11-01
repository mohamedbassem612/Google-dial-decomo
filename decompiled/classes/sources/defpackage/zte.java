package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zte {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/protodatastore/DialerProtoDataStoreConfigBuilder");

    public static final defpackage.ahkn a(java.lang.String str, defpackage.albh albhVar) {
        if (albhVar == null) {
            defpackage.aooh.i("defaultInstance");
        }
        defpackage.ahkn ahknVarA = defpackage.ahko.a();
        ahknVarA.a = str;
        ahknVarA.c(albhVar);
        ahknVarA.b(new defpackage.ztd(str, albhVar));
        return ahknVarA;
    }
}
