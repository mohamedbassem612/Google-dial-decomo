package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jxc implements defpackage.stu {
    private final /* synthetic */ int $cid;

    public jxc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.stu
    public final void a(android.os.Bundle bundle, zrx zrxVar) {
        if (this.$cid == 0) {
            defpackage.aooh.f(zrxVar, "callParameter");
            jxb jxbVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).d;
            if (jxbVar == null) {
                jxbVar = jxb.b;
            }
            sns.v(bundle, "com.android.dialer.callintent.CALL_SPECIFIC_APP_DATA", jxbVar);
            return;
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        if (((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).b & 1) != 0) {
            zsa zsaVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).c;
            if (zsaVar == null) {
                zsaVar = zsa.a;
            }
            defpackage.aooh.e(zsaVar, "getAssistedDialingExtras(...)");
            java.lang.String str = zsaVar.c;
            defpackage.aooh.e(str, "getOriginalNumber(...)");
            java.lang.String str2 = zsaVar.d;
            defpackage.aooh.e(str2, "getTransformedNumber(...)");
            java.lang.String str3 = zsaVar.e;
            defpackage.aooh.e(str3, "getUserHomeCountryCode(...)");
            java.lang.String str4 = zsaVar.f;
            defpackage.aooh.e(str4, "getUserRoamingCountryCode(...)");
            bundle.putBundle("android.telecom.extra.ASSISTED_DIALING_EXTRAS", new hue(str, str2, str3, str4, zsaVar.g).a());
        }
    }
}
