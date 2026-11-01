package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jxe {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllauncher/CallLauncher");
    public static final java.lang.String[] b = {"*272", "#31#*272", "*31#*272"};
    public final android.content.Context c;
    public final defpackage.zjs d;
    public final defpackage.oko e;
    public final android.os.UserManager f;
    public final defpackage.aoin g;
    public final j$.util.Optional h;
    public final defpackage.aoin i;
    public final defpackage.ajcu j;
    public final defpackage.ahzi k = defpackage.ahvr.bI(new defpackage.hlv(this, 5));
    public final defpackage.rlv l;
    public final defpackage.zpm m;
    public final defpackage.gat n;
    public final defpackage.gpd o;
    public final defpackage.rsr p;
    private final defpackage.ajct q;

    public jxe(android.content.Context context, defpackage.zjs zjsVar, defpackage.oko okoVar, defpackage.zpm zpmVar, android.os.UserManager userManager, defpackage.aoin aoinVar, defpackage.ajct ajctVar, defpackage.ajcu ajcuVar, defpackage.gat gatVar, defpackage.gpd gpdVar, defpackage.rsr rsrVar, defpackage.rlv rlvVar, j$.util.Optional optional, defpackage.aoin aoinVar2) {
        this.c = context;
        this.d = zjsVar;
        this.e = okoVar;
        this.m = zpmVar;
        this.f = userManager;
        this.g = aoinVar;
        this.q = ajctVar;
        this.j = ajcuVar;
        this.n = gatVar;
        this.o = gpdVar;
        this.h = optional;
        this.i = aoinVar2;
        this.p = rsrVar;
        this.l = rlvVar;
    }

    public static j$.util.Optional a(android.content.Intent intent) {
        jxb jxbVarA = jxa.a(intent.getBundleExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS"));
        return (jxbVarA == null || (jxbVarA.c & 8388608) == 0) ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Long.valueOf(jxbVarA.y));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [aoss, java.lang.Object] */
    public final void b(android.content.Context context, android.content.Intent intent) {
        if (!c(intent)) {
            this.o.i(null).a(defpackage.mcd.PLACE_CALL_NO_CALL_PERMISSION);
            android.widget.Toast.makeText(context, "Cannot place call without Phone permission", 0).show();
        }
        j$.util.Optional optionalA = a(intent);
        jrs jrsVar = new jrs(this, 4);
        if (true == optionalA.isPresent()) {
            java.lang.Object obj = optionalA.get();
            java.lang.Object obj2 = jrsVar.a;
            long jLongValue = ((java.lang.Long) obj).longValue();
            defpackage.jxe jxeVar = (defpackage.jxe) obj2;
            defpackage.rsr rsrVar = jxeVar.p;
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.aosv.F(rsrVar.a, 0, new atg(rsrVar, jLongValue, (defpackage.aoln) null, 9), 3));
            jss jssVar = new jss(obj2, 11);
            defpackage.ajcu ajcuVar = jxeVar.j;
            ahrvVarG.h(jssVar, ajcuVar).k(new kxu(jxeVar, 1), ajcuVar);
        }
    }

    public final boolean c(android.content.Intent intent) {
        defpackage.ajcq ajcqVarH;
        defpackage.zjs zjsVar = this.d;
        android.content.Context context = this.c;
        j$.util.Optional optionalA = a(intent);
        boolean z = android.text.TextUtils.equals(context.getPackageName(), (java.lang.CharSequence) zjsVar.f().orElse((java.lang.Object) null)) || defpackage.zqz.a(context, "android.permission.CALL_PHONE");
        java.lang.Boolean.valueOf(z).getClass();
        if (!z) {
            jrs jrsVar = new jrs(this, 6);
            if (true != optionalA.isPresent()) {
                return false;
            }
            java.lang.Object obj = optionalA.get();
            defpackage.agsm.i(183, ((defpackage.jxe) jrsVar.a).n.i(((java.lang.Long) obj).longValue(), jxn.o), "Emitting event MISSING_CALL_PHONE_PERMISSION failed.", new java.lang.Object[0]);
            return false;
        }
        android.net.Uri data = intent.getData();
        if (data == null || !data.getSchemeSpecificPart().matches("^(\\*|\\#)(.+)$")) {
            ajcqVarH = defpackage.ahvr.H(defpackage.ahvr.F(new hkx(this, 20), this.q), new iau(this, intent, 11, (byte[]) null), this.j);
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calllauncher/CallLauncher", "shouldExpectOnCallAddedResponseFromTelecom", 379, "CallLauncher.java")).v("not starting in-call UI, user dialed a MMI code");
            this.l.o(defpackage.rmx.NO_RESPONSE_FROM_TELECOM_FOR_OUTGOING_CALL_EXPECTED_MMI_CODE);
            ajcqVarH = defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
        defpackage.agsm.i(186, defpackage.ahvr.I(ajcqVarH, new idd(this, optionalA, 19), this.j), "Task chain involving shouldExpectOnCallAddedResponseFromTelecom() failed.", new java.lang.Object[0]);
        jrs jrsVar2 = new jrs(this, 3);
        if (true == optionalA.isPresent()) {
            java.lang.Object obj2 = optionalA.get();
            defpackage.agsm.i(184, ((defpackage.jxe) jrsVar2.a).n.i(((java.lang.Long) obj2).longValue(), jxn.b), "Emitting event INVOKING_TELECOM_MANAGER_PLACE_CALL failed.", new java.lang.Object[0]);
        }
        zjsVar.u(intent.getData(), intent.getExtras());
        return true;
    }
}
