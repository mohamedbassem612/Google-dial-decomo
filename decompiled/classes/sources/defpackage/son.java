package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class son {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phenotype/Flags");
    private static final java.lang.String[] d = {"BUSINESS_VOICE", "CALLER_ID_EVENT", "ANDROID_DIALER", "DIALER_ANDROID_PRIMES", "SCOOBY_EVENTS", "SCOOBY_SPAM_REPORT_LOG", "CLIENT_LOGGING_PROD", "ANDROID_DIALER_REMOTE", "ANDROID_DIALER_ANONYMOUS"};
    public boolean b;
    public final defpackage.zzx c;
    private final android.content.Context e;
    private final defpackage.ajct f;
    private final defpackage.soo g;
    private final int h = 5;

    public son(android.content.Context context, int i, defpackage.soo sooVar, defpackage.zzx zzxVar, defpackage.ajct ajctVar) {
        this.e = context;
        this.g = sooVar;
        this.c = zzxVar;
        this.f = ajctVar;
    }

    public final void a() {
        defpackage.aexb.f(this.e);
        this.b = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b() {
        long jM;
        defpackage.ajcq ajcmVar;
        android.content.Context context = this.e;
        try {
            jM = ft$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.rlz.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/logging/appinfo/LegacyAppInfo", "getAppVersionCode", (char) 27, "LegacyAppInfo.java")).v("could not find own package");
            jM = -1;
        }
        android.content.Context context2 = this.e;
        defpackage.acxg acxgVar = defpackage.aasr.a;
        defpackage.aata aataVar = new defpackage.aata(context2);
        java.lang.String[] strArr = d;
        defpackage.akzx akzxVarM = defpackage.ypk.a.m();
        akzxVarM.u();
        defpackage.ypk ypkVar = (defpackage.ypk) akzxVarM.b;
        ypkVar.c = 5;
        ypkVar.b |= 1;
        aataVar.n("com.google.android.dialer", (int) jM, strArr, ((defpackage.ypk) akzxVarM.r()).i()).m(new defpackage.sol());
        if (defpackage.abyl.h(context2)) {
            defpackage.soo sooVar = this.g;
            defpackage.guy guyVar = new defpackage.guy(sooVar, 10);
            long j = defpackage.ahqx.a;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
            sooVar.b.execute(ajdkVar);
            ajcmVar = ajdkVar;
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phenotype/Flags", "commitFlagsAsync", 158, "Flags.java")).v("flags not committed since the user is locked in direct boot");
            ajcmVar = new defpackage.ajcm(java.lang.Boolean.FALSE);
        }
        defpackage.som somVar = new defpackage.som(this);
        defpackage.ajct ajctVar = this.f;
        long j2 = defpackage.ahqx.a;
        ajcmVar.c(new defpackage.ajcc(ajcmVar, new defpackage.sqh(defpackage.ahns.c(false), somVar, 2)), ajctVar);
    }
}
