package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uhy extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(uhz uhzVar, java.lang.String str, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = uhzVar;
        this.d = str;
        this.b = str2;
        this.c = "com.google.android.apps.messaging";
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r0 == r6) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, xjz] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [albh, java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhy.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.c;
                return new defpackage.uhy((uhz) obj2, (java.lang.String) obj3, (java.lang.String) this.d, (defpackage.uhu) this.e, aolnVar, 0);
            case 1:
                java.lang.Object obj4 = this.e;
                return new defpackage.uhy((uhz) obj4, (java.lang.String) this.d, (java.lang.String) this.b, aolnVar, 1);
            case 2:
                java.lang.Object obj5 = this.c;
                java.lang.Object obj6 = this.d;
                return new defpackage.uhy((defpackage.vjj) obj5, (defpackage.vjb) obj6, (android.telecom.PhoneAccountHandle) this.e, (defpackage.veo) this.b, aolnVar, 2);
            case 3:
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.b;
                return new defpackage.uhy((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj7, (defpackage.xfz) obj8, (defpackage.xlh) this.d, (android.os.PersistableBundle) this.e, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.e;
                return new defpackage.uhy((abvp) obj9, (android.net.Uri) obj10, (defpackage.afaw) this.d, (defpackage.amjp) this.c, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj11 = this.e;
                java.lang.Object obj12 = this.b;
                return new defpackage.uhy((acig) obj11, (akhn) obj12, (java.lang.String) this.c, (akst) this.d, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj13 = this.d;
                java.lang.Object obj14 = this.b;
                return new defpackage.uhy((defpackage.adwj) obj13, (aduy) obj14, (defpackage.aksh) this.c, (defpackage.aduc) this.e, aolnVar, 6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj15 = this.e;
                return new defpackage.uhy((aeeb) obj15, (java.util.List) this.c, (java.lang.String) this.d, (akrj) this.b, aolnVar, 7);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj16 = this.e;
                return new defpackage.uhy((aeeb) obj16, (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) this.b, (java.lang.String) this.c, (akrm) this.d, aolnVar, 8);
            default:
                java.lang.Object obj17 = this.b;
                java.lang.Object obj18 = this.e;
                return new defpackage.uhy((aeeu) obj17, (aeco) obj18, (java.lang.String) this.d, (java.util.List) this.c, aolnVar, 9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(acig acigVar, akhn akhnVar, java.lang.String str, akst akstVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = acigVar;
        this.b = akhnVar;
        this.c = str;
        this.d = akstVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(defpackage.adwj adwjVar, aduy aduyVar, defpackage.aksh akshVar, defpackage.aduc aducVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = adwjVar;
        this.b = aduyVar;
        this.c = akshVar;
        this.e = aducVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(aeeb aeebVar, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.lang.String str, akrm akrmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = aeebVar;
        this.b = accountRepresentation;
        this.c = str;
        this.d = akrmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(aeeb aeebVar, java.util.List list, java.lang.String str, akrj akrjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = aeebVar;
        this.c = list;
        this.d = str;
        this.b = akrjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(aeeu aeeuVar, aeco aecoVar, java.lang.String str, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aeeuVar;
        this.e = aecoVar;
        this.d = str;
        this.c = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, defpackage.xfz xfzVar, defpackage.xlh xlhVar, android.os.PersistableBundle persistableBundle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = erasedOnboardingTaskToken;
        this.b = xfzVar;
        this.d = xlhVar;
        this.e = persistableBundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(abvp abvpVar, android.net.Uri uri, defpackage.afaw afawVar, defpackage.amjp amjpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abvpVar;
        this.e = uri;
        this.d = afawVar;
        this.c = amjpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(uhz uhzVar, java.lang.String str, java.lang.String str2, defpackage.uhu uhuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uhzVar;
        this.c = str;
        this.d = str2;
        this.e = uhuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(defpackage.vjj vjjVar, defpackage.vjb vjbVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.veo veoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = vjjVar;
        this.d = vjbVar;
        this.e = phoneAccountHandle;
        this.b = veoVar;
    }
}
