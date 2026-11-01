package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wsn implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wsn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r8v27, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Iterable, java.lang.Object] */
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
    public final java.lang.Object a() {
        java.lang.String nodePackage;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(((defpackage.ahey) this.a).getResources().getDimensionPixelSize(2131168008));
            case 1:
                return new upp(((defpackage.ups) this.a).a);
            case 2:
                return java.lang.Integer.valueOf(((defpackage.ahey) this.a).getResources().getDimensionPixelSize(2131168009));
            case 3:
                return defpackage.xfp.metadata_delegate$lambda$0((defpackage.xfp) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.xfp) this.a).getMetadata().g();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.xfp) this.a).getMetadata().h();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.xhp.e(this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return defpackage.xhp.f(this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj = this.a;
                defpackage.xlh xlhVar = (defpackage.xlh) obj;
                java.util.Map mapF = defpackage.xfc.f(xlhVar.asComponentRef(), xlhVar.d, xlhVar.e, obj);
                java.util.Collection collection = xlhVar.b;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(collection, 10)), 16));
                for (java.lang.Object obj2 : collection) {
                    linkedHashMap.put(((defpackage.xme) obj2).asNodeRef(), obj2);
                }
                return new j$.util.concurrent.ConcurrentHashMap(ajsz.aQ(linkedHashMap, mapF));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj3 = this.a;
                defpackage.xhu xhuVar = obj3 instanceof defpackage.xhu ? (defpackage.xhu) obj3 : null;
                return (xhuVar == null || (nodePackage = xhuVar.getNodePackage()) == null) ? "unprivileged" : nodePackage;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.xlk xlkVar = (defpackage.xlk) this.a;
                return aoov.am(xlkVar.d, 0, new defpackage.wcj(xlkVar, (aoln) null, 14), 3);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new defpackage.xmh(this.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aopu[] aopuVarArr = aoou.a;
                aooa aooaVar = new aooa(this.a.getClass());
                java.lang.annotation.Annotation[] declaredAnnotations = aooc.I(aooaVar).getDeclaredAnnotations();
                aooh.e(declaredAnnotations, "getDeclaredAnnotations(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                    if (annotation instanceof com.android.onboarding.contracts.annotations.OnboardingNode) {
                        arrayList.add(annotation);
                    }
                }
                com.android.onboarding.contracts.annotations.OnboardingNode onboardingNode = (com.android.onboarding.contracts.annotations.OnboardingNode) ajsz.bO(arrayList);
                if (onboardingNode == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(aooaVar.b()).concat(" is missing OnboardingNode annotation"));
                }
                return onboardingNode;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                try {
                    return ((defpackage.xmd) this.a).d().d().b();
                } catch (java.lang.Exception e) {
                    defpackage.xox.h("OnboardingTaskContract", "Failed to extract `acceptsInterrupts` from metadata - assuming no accepted interrupts", e);
                    return new defpackage.xfz[0];
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.xmd) this.a).d().g();
            case 15:
                return ((defpackage.xmd) this.a).d().h();
            case 16:
                return defpackage.xkd.a.a(this.a);
            case 17:
                long j = aorh.a;
                long jB = aooh.B(((defpackage.xmd) this.a).d().b(), aorj.d);
                j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(aorh.i(jB), aorh.c(jB));
                aooh.e(durationOfSeconds, "toComponents-impl(...)");
                return durationOfSeconds;
            case 18:
                return java.lang.Boolean.valueOf(defpackage.xmy.class.isAssignableFrom(((defpackage.xme) this.a).b));
            case 19:
                ?? r8 = this.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r8, 10));
                java.util.Iterator it = r8.iterator();
                while (it.hasNext()) {
                    java.util.function.Supplier supplierM = fh$.ExternalSyntheticApiModelOutline0.m(it.next());
                    aooh.f(supplierM, "<this>");
                    java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplierM);
                    aooh.e(objM, "get(...)");
                    defpackage.xmb xmbVar = (defpackage.xmb) objM;
                    arrayList2.add(new defpackage.xme(xmbVar.a(), xmbVar.getClass(), new defpackage.uon(supplierM, 11, (boolean[][]) null)));
                }
                return arrayList2;
            default:
                defpackage.xmm xmmVar = (defpackage.xmm) this.a;
                android.os.PersistableBundle persistableBundle = xmmVar.b;
                if (persistableBundle != null) {
                    return xmmVar.a.b(persistableBundle);
                }
                return null;
        }
    }
}
