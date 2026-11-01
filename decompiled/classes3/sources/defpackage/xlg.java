package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xlg extends aomh implements aonn {
    java.lang.Object a;
    long b;
    long c;
    long d;
    int e;
    final /* synthetic */ defpackage.xlh f;
    final /* synthetic */ com.android.onboarding.tasks.ErasedOnboardingTaskToken g;
    final /* synthetic */ defpackage.xlw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlg(defpackage.xlh xlhVar, com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, defpackage.xlw xlwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = xlhVar;
        this.g = erasedOnboardingTaskToken;
        this.h = xlwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e5 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:10:0x001d, B:65:0x0166, B:13:0x0028, B:57:0x0116, B:45:0x00df, B:47:0x00e5, B:49:0x00f1, B:53:0x00fe, B:55:0x0108, B:58:0x011b, B:60:0x0129, B:61:0x0148, B:62:0x0149, B:16:0x002f, B:17:0x0034, B:20:0x003b, B:31:0x0074, B:21:0x003f, B:26:0x0052, B:28:0x0060, B:33:0x008b, B:35:0x0093, B:38:0x009d, B:40:0x00a7, B:42:0x00ad, B:44:0x00d0, B:43:0x00c6, B:24:0x0046), top: B:73:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:10:0x001d, B:65:0x0166, B:13:0x0028, B:57:0x0116, B:45:0x00df, B:47:0x00e5, B:49:0x00f1, B:53:0x00fe, B:55:0x0108, B:58:0x011b, B:60:0x0129, B:61:0x0148, B:62:0x0149, B:16:0x002f, B:17:0x0034, B:20:0x003b, B:31:0x0074, B:21:0x003f, B:26:0x0052, B:28:0x0060, B:33:0x008b, B:35:0x0093, B:38:0x009d, B:40:0x00a7, B:42:0x00ad, B:44:0x00d0, B:43:0x00c6, B:24:0x0046), top: B:73:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:10:0x001d, B:65:0x0166, B:13:0x0028, B:57:0x0116, B:45:0x00df, B:47:0x00e5, B:49:0x00f1, B:53:0x00fe, B:55:0x0108, B:58:0x011b, B:60:0x0129, B:61:0x0148, B:62:0x0149, B:16:0x002f, B:17:0x0034, B:20:0x003b, B:31:0x0074, B:21:0x003f, B:26:0x0052, B:28:0x0060, B:33:0x008b, B:35:0x0093, B:38:0x009d, B:40:0x00a7, B:42:0x00ad, B:44:0x00d0, B:43:0x00c6, B:24:0x0046), top: B:73:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [xnh] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [xnh] */
    /* JADX WARN: Type inference failed for: r3v6, types: [xlh] */
    /* JADX WARN: Type inference failed for: r3v9, types: [xlh] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0114 -> B:57:0x0116). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlg.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.xlg(this.f, this.g, this.h, aolnVar);
    }
}
