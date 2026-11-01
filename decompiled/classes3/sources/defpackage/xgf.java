package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgf implements defpackage.xpn, defpackage.xpb, defpackage.xpu {
    private final /* synthetic */ int $cid;

    public xgf(int i) {
        this.$cid = i;
    }

    public static final defpackage.xgg f(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        defpackage.xfw xfwVar = defpackage.xfx.a;
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("uiType");
        if (persistableBundle2 == null) {
            throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: uiType");
        }
        defpackage.xfx xfxVarE = xfwVar.c(persistableBundle2);
        defpackage.xfu xfuVar = defpackage.xfv.a;
        android.os.PersistableBundle persistableBundle3 = persistableBundle.getPersistableBundle("backButtonBehavior");
        if (persistableBundle3 == null) {
            throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: backButtonBehavior");
        }
        defpackage.xfv xfvVarE = xfuVar.c(persistableBundle3);
        java.lang.String string = persistableBundle.getString("empty");
        if (string != null) {
            return new defpackage.xgg(xfxVarE, xfvVarE, java.lang.Boolean.parseBoolean(string));
        }
        throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: empty");
    }

    public static final defpackage.xge g(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        defpackage.xpq xpqVar = new defpackage.xpq(new defpackage.xgi(1));
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("acceptsInterrupts");
        if (persistableBundle2 == null) {
            throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: acceptsInterrupts");
        }
        java.util.List listD = xpqVar.c(persistableBundle2);
        java.lang.String string = persistableBundle.getString("empty");
        if (string != null) {
            return new defpackage.xge(listD, java.lang.Boolean.parseBoolean(string));
        }
        throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: empty");
    }

    public static final defpackage.xgp h(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        java.lang.String string = persistableBundle.getString("component");
        if (string != null) {
            return new defpackage.xgp(string, persistableBundle.getLong("changeId"));
        }
        throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: component");
    }

    public static final defpackage.xno i(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("task");
        if (persistableBundle2 == null) {
            throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: task");
        }
        defpackage.xpt xptVarJ = defpackage.xer.j(persistableBundle2);
        java.lang.String string = persistableBundle.getString("extraKey");
        if (string != null) {
            return new defpackage.xno(xptVarJ, string);
        }
        throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: extraKey");
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return defpackage.xfh.d(this, persistableBundle);
            case 3:
                return defpackage.xfh.d(this, persistableBundle);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.xfh.d(this, persistableBundle);
            default:
                return defpackage.xfh.d(this, persistableBundle);
        }
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return b((android.os.PersistableBundle) obj);
            case 3:
                return b((android.os.PersistableBundle) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return b((android.os.PersistableBundle) obj);
            default:
                return b((android.os.PersistableBundle) obj);
        }
    }

    @Override // defpackage.xpb
    public final /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                aooh.f(persistableBundle, "persistableBundle");
                java.lang.String string = persistableBundle.getString("component");
                if (string == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: component");
                }
                java.lang.String string2 = persistableBundle.getString("name");
                if (string2 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: name");
                }
                android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("foreground");
                if (persistableBundle2 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: foreground");
                }
                defpackage.xgg xggVarF = f(persistableBundle2);
                android.os.PersistableBundle persistableBundle3 = persistableBundle.getPersistableBundle("background");
                if (persistableBundle3 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: background");
                }
                defpackage.xge xgeVarG = g(persistableBundle3);
                defpackage.xgb xgbVar = defpackage.xgc.a;
                android.os.PersistableBundle persistableBundle4 = persistableBundle.getPersistableBundle("specificationType");
                if (persistableBundle4 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: specificationType");
                }
                defpackage.xgc xgcVarE = xgbVar.c(persistableBundle4);
                java.lang.String[] stringArray = persistableBundle.getStringArray("offGraphCallers");
                if (stringArray == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: offGraphCallers");
                }
                java.util.List listCU = ajsz.cU(stringArray);
                java.lang.String string3 = persistableBundle.getString("isTerminalNode");
                if (string3 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: isTerminalNode");
                }
                boolean z = java.lang.Boolean.parseBoolean(string3);
                long j = persistableBundle.getLong("timeoutInSeconds");
                defpackage.xpq xpqVar = new defpackage.xpq(new defpackage.xgi(0));
                android.os.PersistableBundle persistableBundle5 = persistableBundle.getPersistableBundle("metadata");
                if (persistableBundle5 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: metadata");
                }
                java.util.List listD = xpqVar.c(persistableBundle5);
                android.os.PersistableBundle persistableBundle6 = persistableBundle.getPersistableBundle("allowedCallers");
                if (persistableBundle6 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: allowedCallers");
                }
                java.lang.String[] stringArray2 = persistableBundle6.getStringArray("scopes");
                if (stringArray2 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: scopes");
                }
                java.util.List listCU2 = ajsz.cU(stringArray2);
                java.lang.String[] stringArray3 = persistableBundle6.getStringArray("components");
                if (stringArray3 != null) {
                    return new defpackage.xgj(string, string2, xggVarF, xgeVarG, xgcVarE, listCU, z, j, listD, new defpackage.xgd(listCU2, ajsz.cU(stringArray3)), persistableBundle.getInt(com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_WORKER_ID));
                }
                throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: components");
            case 3:
                aooh.f(persistableBundle, "persistableBundle");
                android.os.PersistableBundle persistableBundle7 = persistableBundle.getPersistableBundle("task");
                if (persistableBundle7 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: task");
                }
                defpackage.xpt xptVarJ = defpackage.xer.j(persistableBundle7);
                defpackage.xpq xpqVar2 = new defpackage.xpq(new defpackage.xgi(2));
                android.os.PersistableBundle persistableBundle8 = persistableBundle.getPersistableBundle("requiredChanges");
                if (persistableBundle8 != null) {
                    return new defpackage.xgo(xptVarJ, xpqVar2.c(persistableBundle8));
                }
                throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: requiredChanges");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooh.f(persistableBundle, "persistableBundle");
                defpackage.xpq xpqVar3 = new defpackage.xpq(new defpackage.xgi(3));
                android.os.PersistableBundle persistableBundle9 = persistableBundle.getPersistableBundle("triggers");
                if (persistableBundle9 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: triggers");
                }
                java.util.List listD2 = xpqVar3.c(persistableBundle9);
                java.lang.String string4 = persistableBundle.getString("readOnlyOnce");
                if (string4 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: readOnlyOnce");
                }
                boolean z2 = java.lang.Boolean.parseBoolean(string4);
                java.lang.String string5 = persistableBundle.getString("runAgainOnSuccessiveTriggers");
                if (string5 == null) {
                    throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: runAgainOnSuccessiveTriggers");
                }
                boolean z3 = java.lang.Boolean.parseBoolean(string5);
                java.lang.String string6 = persistableBundle.getString("requireAllTriggers");
                if (string6 != null) {
                    return new defpackage.xnp(listD2, z2, z3, java.lang.Boolean.parseBoolean(string6));
                }
                throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: requireAllTriggers");
            default:
                aooh.f(persistableBundle, "persistableBundle");
                defpackage.xpq xpqVar4 = new defpackage.xpq(new defpackage.xgi(4));
                android.os.PersistableBundle persistableBundle10 = persistableBundle.getPersistableBundle("results");
                if (persistableBundle10 != null) {
                    return new defpackage.xnq(xpqVar4.c(persistableBundle10));
                }
                throw new java.lang.IllegalArgumentException("PersistableBundle is missing value for key: results");
        }
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return new defpackage.xoy(this);
            case 3:
                return new defpackage.xoy(this);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.xoy(this);
            default:
                return new defpackage.xoy(this);
        }
    }

    @Override // defpackage.xpn, defpackage.xoz
    public final /* synthetic */ android.os.PersistableBundle ew(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return new defpackage.xgj((com.android.onboarding.contracts.annotations.OnboardingNode) obj).toPersistableBundle();
            case 3:
                defpackage.xgm xgmVar = (defpackage.xgm) obj;
                java.lang.Class clsA = xgmVar.a();
                aopu[] aopuVarArr = aoou.a;
                defpackage.xpt xptVarI = defpackage.xer.i(new aooa(clsA), new aopu[]{new aooa(com.android.onboarding.contracts.annotations.OnboardingNode.class)}, ajsz.aM(new aoiu(new aooa(com.android.onboarding.contracts.annotations.OnboardingNode.class), new defpackage.xgn(i))), ajsz.aM(new aoiu(new aooa(com.android.onboarding.contracts.annotations.OnboardingNode.class), "com.android.onboarding.contracts.annotations.OnboardingNode")));
                defpackage.xgq[] xgqVarArrB = xgmVar.b();
                int length = xgqVarArrB.length;
                java.util.ArrayList arrayList = new java.util.ArrayList(length);
                while (i < length) {
                    arrayList.add(new defpackage.xgp(xgqVarArrB[i]));
                    i++;
                }
                return new defpackage.xgo(xptVarI, arrayList).toPersistableBundle();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.xnp((defpackage.xns) obj).toPersistableBundle();
            default:
                defpackage.xnr[] xnrVarArrA = ((defpackage.xnu) obj).a();
                int length2 = xnrVarArrA.length;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(new defpackage.xno(xnrVarArrA[i]));
                    i++;
                }
                return new defpackage.xnq(arrayList2).toPersistableBundle();
        }
    }
}
