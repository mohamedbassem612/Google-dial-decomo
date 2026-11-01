package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lxl implements defpackage.rnw {
    private final /* synthetic */ int $cid;
    private final defpackage.rlv a;
    private final java.lang.Object b;

    public lxl(defpackage.aw awVar, defpackage.rlv rlvVar, int i) {
        this.$cid = i;
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = awVar;
        this.a = rlvVar;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.rnw
    public final void a() {
        java.lang.Object obj;
        int i = this.$cid;
        if (i == 0) {
            this.a.o(defpackage.rmx.HAMBURGER_MENU_CONTACTS_CLICKED);
            ((defpackage.lxm) this.b).a();
            return;
        }
        defpackage.rlv rlvVar = this.a;
        if (i == 1) {
            rlvVar.o(defpackage.rmx.HAMBURGER_MENU_CLEAR_CALL_HISTORY);
            defpackage.akzx akzxVarM = kmc.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            kmc kmcVar = akzxVarM.b;
            kmcVar.e = 4;
            kmcVar.b |= 1;
            defpackage.akzx akzxVarM2 = kmb.a.m();
            defpackage.aooh.f(akzxVarM2, "builder");
            kmb kmbVarR = akzxVarM2.r();
            defpackage.aooh.e(kmbVarR, "build(...)");
            kmb kmbVar = kmbVarR;
            defpackage.aooh.f(kmbVar, "value");
            akzxVarM.u();
            kmc kmcVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(kmbVar);
            kmcVar2.d = kmbVar;
            kmcVar2.c = 2;
            kmc kmcVarR = akzxVarM.r();
            defpackage.aooh.e(kmcVarR, "build(...)");
            kmc kmcVar3 = kmcVarR;
            defpackage.aooh.f(kmcVar3, "deleteCallsContext");
            kls klsVar = new kls();
            defpackage.amxr.g(klsVar);
            defpackage.ahgl.b(klsVar, kmcVar3);
            klsVar.r(((defpackage.aw) this.b).I(), "ClearCallLogHistoryDialogFragment");
            return;
        }
        rlvVar.n(defpackage.rmw.MAIN_TOOLBAR_SEND_FEEDBACK);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        defpackage.omd omdVar = (defpackage.omd) this.b;
        android.content.Context context = omdVar.b;
        intent.setData(android.net.Uri.parse(context.getString(2132019808)));
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse(context.getString(2132020552)));
        android.content.Intent intent3 = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) com.google.android.libraries.social.licenses.LicenseMenuActivity.class);
        ajqw ajqwVar = new ajqw((byte[]) null);
        ajqwVar.f();
        ajqwVar.f();
        android.net.Uri uri = defpackage.omd.a;
        if (uri == null) {
            throw new java.lang.NullPointerException("Null fallbackSupportUri");
        }
        ajqwVar.c = uri;
        ajqwVar.e(0, context.getString(2132019807), intent);
        ajqwVar.e(1, context.getString(2132020551), intent2);
        ajqwVar.e(2, context.getString(2132019163), intent3);
        java.lang.Object obj2 = ajqwVar.d;
        if (obj2 != null) {
            ajqwVar.b = ((defpackage.aift) obj2).g();
        } else if (ajqwVar.b == null) {
            ajqwVar.b = defpackage.aike.a;
        }
        java.lang.Object obj3 = ajqwVar.a;
        if (obj3 == null || (obj = ajqwVar.c) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (ajqwVar.a == null) {
                sb.append(" helpCenterContext");
            }
            if (ajqwVar.c == null) {
                sb.append(" fallbackSupportUri");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ahio ahioVar = new ahio((java.lang.String) obj3, (android.net.Uri) obj, (defpackage.aify) ajqwVar.b);
        defpackage.aoin aoinVar = omdVar.d;
        ahig ahigVarA = ahih.a();
        ahigVarA.c(!((java.lang.Boolean) aoinVar.a()).booleanValue());
        ahigVarA.a = "com.google.android.dialer.USER_INITIATED_FEEDBACK_REPORT";
        ahigVarA.b(true);
        ahih ahihVarA = ahigVarA.a();
        defpackage.ahim ahimVar = omdVar.c;
        abtr abtrVar = (abtr) ahimVar.e.a();
        defpackage.ahyn ahynVar = ahimVar.d;
        ahimVar.c.i(new zoe(defpackage.ajan.f(((defpackage.ucm) abtrVar.f).e(ahihVarA, new ahij(abtrVar, ahimVar.b)), defpackage.ahqx.a(new ahml(abtrVar, ahioVar, ahihVarA, 1)), abtrVar.d)), ahimVar.f);
    }

    public lxl(defpackage.lxm lxmVar, defpackage.rlv rlvVar, int i) {
        this.$cid = i;
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = lxmVar;
        this.a = rlvVar;
    }

    public lxl(defpackage.rlv rlvVar, defpackage.omd omdVar, int i) {
        this.$cid = i;
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.a = rlvVar;
        this.b = omdVar;
    }
}
