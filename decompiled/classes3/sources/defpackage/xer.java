package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xer implements defpackage.xpb {
    private final /* synthetic */ int $cid;
    public static final /* synthetic */ defpackage.xer c = new defpackage.xer(8);
    public static final /* synthetic */ defpackage.xer b = new defpackage.xer(7);
    public static final /* synthetic */ defpackage.xer a = new defpackage.xer(6);

    public xer(int i) {
        this.$cid = i;
    }

    public static final defpackage.xfz d(android.os.PersistableBundle persistableBundle) {
        java.lang.Object next;
        aooh.f(persistableBundle, "persistableBundle");
        defpackage.xfz xfzVar = defpackage.xfz.UNKNOWN;
        int i = persistableBundle.getInt("type", xfzVar.f);
        aojl aojlVar = new aojl(defpackage.xfz.e);
        do {
            if (!aojlVar.hasNext()) {
                next = null;
                break;
            }
            next = aojlVar.next();
        } while (((defpackage.xfz) next).f != i);
        defpackage.xfz xfzVar2 = (defpackage.xfz) next;
        return xfzVar2 != null ? xfzVar2 : xfzVar;
    }

    public static final defpackage.xgs e(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        if (!aooh.n(persistableBundle.getString("cc.TYPE"), "Activity")) {
            throw new java.lang.IllegalArgumentException("Invalid type");
        }
        if (!aooh.n(persistableBundle.getString("cc.SUBTYPE"), "ActivityToActivity")) {
            throw new java.lang.IllegalArgumentException("Invalid subtype");
        }
        java.lang.Object objG = defpackage.xfh.g(persistableBundle, "cc.TARGET", com.android.onboarding.pending.PendingContract$Activity.b);
        if (objG == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        com.android.onboarding.pending.PendingContract$ErasedActivity pendingContract$ErasedActivity = (com.android.onboarding.pending.PendingContract$ErasedActivity) objG;
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("cc.SESSION");
        if (persistableBundle2 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.lang.Object objG2 = defpackage.xfh.g(persistableBundle, "cc.KEY_CALLBACK_REF", defpackage.xhy.b);
        if (objG2 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        defpackage.xjz xjzVar = (defpackage.xjz) objG2;
        java.lang.Object objG3 = defpackage.xfh.g(persistableBundle, "cc.KEY_CALLBACK_SERVICE_INTENT", com.android.onboarding.utils.persistable.PersistableIntent.CREATOR);
        if (objG3 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        com.android.onboarding.utils.persistable.PersistableIntent persistableIntent = (com.android.onboarding.utils.persistable.PersistableIntent) objG3;
        int iF = f(persistableBundle);
        java.lang.String string = persistableBundle.getString("cc.KEY_CALLBACK_KEY");
        if (string == null) {
            string = pendingContract$ErasedActivity.asNodeRef().identity();
        }
        return new defpackage.xgs(persistableBundle2, pendingContract$ErasedActivity, xjzVar, persistableIntent, iF, string);
    }

    public static final int f(android.os.PersistableBundle persistableBundle) {
        int i = persistableBundle.getInt("cc.KEY_CALLBACK_USER_ID", -69);
        if (i != -69) {
            return i;
        }
        int iMyUid = android.os.Process.myUid() / 100000;
        android.util.Log.w("ChainedContract", a.bj(iMyUid, "Callback user ID is not set, using current user ID: "));
        return iMyUid;
    }

    public static final com.android.onboarding.pending.PendingContract$ErasedActivity g(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return new com.android.onboarding.pending.PendingActivityContract(defpackage.xpg.f(persistableBundle));
    }

    public static final com.android.onboarding.pending.PendingContract$ErasedTask h(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return new com.android.onboarding.pending.PendingTaskContract(persistableBundle);
    }

    public static final defpackage.xpt i(aopu aopuVar, aopu[] aopuVarArr, java.util.Map map, java.util.Map map2) {
        java.util.List listAY;
        aooh.f(aopuVar, "source");
        aooh.f(map, "converters");
        aooh.f(map2, "keys");
        java.lang.annotation.Annotation[] annotations = aooc.I(aopuVar).getAnnotations();
        aooh.e(annotations, "getAnnotations(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.annotation.Annotation annotation : annotations) {
            aooh.c(annotation);
            try {
                java.lang.Class clsI = aooc.I(aooc.K(annotation));
                if (clsI.getMethods().length != 5) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                java.lang.reflect.Method method = clsI.getMethod("value", null);
                if (method == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                if (!method.getReturnType().isArray()) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                java.lang.Class<?> componentType = method.getReturnType().getComponentType();
                if (componentType == null || !componentType.isAnnotation()) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                java.lang.Object objInvoke = method.invoke(annotation, null);
                aooh.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<kotlin.Annotation>");
                listAY = ajsz.cw((java.lang.annotation.Annotation[]) objInvoke);
                ajsz.bv(arrayList, listAY);
            } catch (java.lang.Throwable unused) {
                listAY = ajsz.aY(annotation);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (ajsz.cY(aopuVarArr, aooc.K((java.lang.annotation.Annotation) obj))) {
                arrayList2.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            aopu aopuVarK = aooc.K((java.lang.annotation.Annotation) obj2);
            java.lang.Object arrayList3 = linkedHashMap.get(aopuVarK);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(aopuVarK, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            aopu aopuVar2 = (aopu) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.lang.String str = (java.lang.String) ajsz.aN(map2, aopuVar2);
            aonj aonjVar = (aonj) ajsz.aN(map, aopuVar2);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList5.add((defpackage.xpr) aonjVar.a((java.lang.annotation.Annotation) it.next()));
            }
            arrayList4.add(new aoiu(str, defpackage.xph.a.ew(arrayList5)));
        }
        java.util.Map mapAR = ajsz.aR(arrayList4);
        java.lang.String name = aooc.I(aopuVar).getName();
        if (name == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.lang.String canonicalName = aooc.I(aopuVar).getCanonicalName();
        if (canonicalName != null) {
            return new defpackage.xpt(name, canonicalName, mapAR);
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public static final defpackage.xpt j(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        java.lang.String string = persistableBundle.getString("NAME");
        if (string == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.lang.String string2 = persistableBundle.getString("CANONICAL_NAME");
        if (string2 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.lang.Object objG = defpackage.xfh.g(persistableBundle, "DATA", new defpackage.xpi(new defpackage.xps(defpackage.xpp.a, 1), new defpackage.xps(defpackage.xpm.a, 0)));
        if (objG != null) {
            return new defpackage.xpt(string, string2, (java.util.Map) objG);
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        switch (this.$cid) {
            case 0:
                return defpackage.xfh.d(this, persistableBundle);
            case 1:
                return defpackage.xfh.d(this, persistableBundle);
            case 2:
                throw null;
            case 3:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return defpackage.xfh.d(this, persistableBundle);
            case 15:
                return defpackage.xfh.d(this, persistableBundle);
            default:
                throw null;
        }
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return b((android.os.PersistableBundle) obj);
            case 1:
                return b((android.os.PersistableBundle) obj);
            case 2:
                throw null;
            case 3:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return b((android.os.PersistableBundle) obj);
            case 15:
                return b((android.os.PersistableBundle) obj);
            default:
                throw null;
        }
    }

    @Override // defpackage.xpb
    public final /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        j$.time.Duration duration = null;
        switch (this.$cid) {
            case 0:
                aooh.f(persistableBundle, "persistableBundle");
                return new com.android.onboarding.config.OnboardingConfig((com.android.onboarding.config.WaitingScreenConfig) defpackage.xfh.g(persistableBundle, com.android.onboarding.config.OnboardingConfig.KEY_WAITING_SCREEN_CONFIG, com.android.onboarding.config.WaitingScreenConfig.Companion), (com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig) defpackage.xfh.g(persistableBundle, com.android.onboarding.config.OnboardingConfig.KEY_WORKER_FOREGROUND_PRIORITY_CONFIG, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig.Companion), (com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig) defpackage.xfh.g(persistableBundle, com.android.onboarding.config.OnboardingConfig.KEY_FOREGROUND_PRIORITY_CONFIG, com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig.Companion), persistableBundle.getString(com.android.onboarding.config.OnboardingConfig.KEY_CONFIG_URI));
            case 1:
                aooh.f(persistableBundle, "persistableBundle");
                return new defpackage.xfq((defpackage.xgs) defpackage.xfh.g(persistableBundle, "next_activity", defpackage.xgs.a));
            case 2:
                throw null;
            case 3:
                return e(persistableBundle);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooh.f(persistableBundle, "persistableBundle");
                if (persistableBundle.isEmpty()) {
                    return new defpackage.xhn();
                }
                j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(persistableBundle.getLong("lastUpdate"));
                aooh.e(instantOfEpochSecond, "ofEpochSecond(...)");
                android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("bundle");
                if (persistableBundle2 != null) {
                    return new defpackage.xhn(instantOfEpochSecond, persistableBundle2);
                }
                throw new java.lang.IllegalStateException("Missing bundle in OnboardingMetadataStore");
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooh.f(persistableBundle, "persistableBundle");
                java.lang.String string = persistableBundle.getString("com.android.onboarding.pending.TYPE");
                if (aooh.n(string, "ACTIVITY")) {
                    return defpackage.xki.e(persistableBundle);
                }
                if (aooh.n(string, "TASK")) {
                    return defpackage.xkj.e(persistableBundle);
                }
                throw new java.lang.IllegalStateException(a.bk(string, "Type ", " is unrecognised"));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return g(persistableBundle);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return h(persistableBundle);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooh.f(persistableBundle, "persistableBundle");
                boolean zF = wsc.f(persistableBundle, "IS_TASK");
                boolean zF2 = wsc.f(persistableBundle, "IS_ACTIVITY");
                java.lang.Object objG = defpackage.xfh.g(persistableBundle, "ONBOARDING_NODE", com.android.onboarding.contracts.annotations.OnboardingNode.a);
                if (objG == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                defpackage.xgj xgjVar = (defpackage.xgj) objG;
                int i = persistableBundle.getInt("WORKER_ID", -1);
                defpackage.xnq xnqVar = (defpackage.xnq) defpackage.xfh.g(persistableBundle, "USES_PRECALCULATION_RESULT", defpackage.xnu.a);
                defpackage.xnp xnpVar = (defpackage.xnp) defpackage.xfh.g(persistableBundle, "PRECALCULATION", defpackage.xnp.e);
                android.os.PersistableBundle persistableBundle3 = persistableBundle.getPersistableBundle("HAS_TASK_ALTERNATIVE");
                if (persistableBundle3 != null) {
                    if (persistableBundle3.containsKey("requiredChanges")) {
                        duration = (defpackage.xgo) defpackage.xgm.a.c(persistableBundle3);
                    } else {
                        android.os.PersistableBundle persistableBundle4 = new android.os.PersistableBundle(persistableBundle3);
                        persistableBundle4.putPersistableBundle("requiredChanges", defpackage.xph.a.ew(aokc.a));
                        duration = (defpackage.xgo) defpackage.xgm.a.c(persistableBundle4);
                    }
                }
                return new defpackage.xkr(zF, zF2, xgjVar, i, xnqVar, xnpVar, duration, wsc.f(persistableBundle, "IS_CROSS_PROCESS_SYNCHRONOUS"));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooh.f(persistableBundle, "persistableBundle");
                java.util.List listH = defpackage.xfh.h(persistableBundle, "TaskExecutionHistoryList", defpackage.xlj.a);
                if (listH != null) {
                    return new defpackage.xli(ajsz.bS(listH));
                }
                throw new java.lang.IllegalStateException("Missing persistable task execution histories");
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aooh.f(persistableBundle, "persistableBundle");
                int i2 = persistableBundle.getInt("contractInputHash");
                java.lang.Object objG2 = defpackage.xfh.g(persistableBundle, "token", com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                if (objG2 == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(persistableBundle.getLong("executionTime"));
                aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
                return new defpackage.xlj(i2, (com.android.onboarding.tasks.ErasedOnboardingTaskToken) objG2, instantOfEpochMilli);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooh.f(persistableBundle, "persistableBundle");
                java.lang.String string2 = persistableBundle.getString("delayFor");
                return new defpackage.xll(string2 != null ? j$.time.Duration.parse(string2) : null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aooh.f(persistableBundle, "persistableBundle");
                return new defpackage.xlm(defpackage.xfh.n(persistableBundle, "ownerIdentityHash"));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooh.f(persistableBundle, "persistableBundle");
                defpackage.xhz xhzVarF = defpackage.xhy.f(persistableBundle);
                android.os.PersistableBundle persistableBundle5 = persistableBundle.getPersistableBundle("INPUT");
                if (persistableBundle5 != null) {
                    return new defpackage.xmz(xhzVarF, persistableBundle5);
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case 15:
                aooh.f(persistableBundle, "persistableBundle");
                java.lang.String string3 = persistableBundle.getString("com.android.onboarding.tasks.TestTaskInterrupt.VALUE");
                if (string3 != null) {
                    return new defpackage.xng(string3);
                }
                throw new java.lang.IllegalStateException("Required value was null.");
            default:
                throw null;
        }
    }
}
