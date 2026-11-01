package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xhy implements defpackage.xpb, defpackage.xpn {
    private final /* synthetic */ int $cid;
    public static final defpackage.xhy e = new defpackage.xhy(5);
    public static final /* synthetic */ defpackage.xhy d = new defpackage.xhy(4);
    static final /* synthetic */ defpackage.xhy c = new defpackage.xhy(3);
    public static final defpackage.xhy b = new defpackage.xhy(2);
    static final /* synthetic */ defpackage.xhy a = new defpackage.xhy(0);

    private xhy(int i) {
        this.$cid = i;
    }

    public static final defpackage.xhz f(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        defpackage.xhs xhsVarI = i(persistableBundle);
        java.lang.String string = persistableBundle.getString("nr.NODE_NAME");
        if (string != null) {
            return g(xhsVarI, string);
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public static final defpackage.xhz g(defpackage.xhu xhuVar, java.lang.String str) {
        aooh.f(str, "nodeName");
        return new defpackage.xia(xhuVar.getNodeComponent(), str);
    }

    public static final android.os.PersistableBundle h(defpackage.xib xibVar) {
        android.os.PersistableBundle persistableBundleK = k(xibVar);
        persistableBundleK.putString("nr.NODE_NAME", xibVar.getNodeName());
        return persistableBundleK;
    }

    public static final defpackage.xhs i(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        java.lang.String string = persistableBundle.getString("cr.KEY_NODE_COMPONENT");
        if (string != null) {
            return j(string);
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public static final defpackage.xhs j(java.lang.String str) {
        aooh.f(str, "nodeComponent");
        java.util.List listS = aoov.S(str, new java.lang.String[]{":"}, 0);
        if (listS.isEmpty()) {
            throw new java.lang.IllegalStateException(a.bg(listS, "Invalid identity ", " (not a ComponentRef)"));
        }
        return new defpackage.xht((java.lang.String) listS.get(0));
    }

    public static final android.os.PersistableBundle k(defpackage.xhu xhuVar) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("cr.KEY_NODE_COMPONENT", xhuVar.getNodeComponent());
        return persistableBundle;
    }

    public static final defpackage.xjx l(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return m(f(persistableBundle), persistableBundle.getLong("unr.NODE_ID", -1L));
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public static final defpackage.xjx m(defpackage.xib xibVar, long j) {
        aooh.f(xibVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_NODE);
        return new defpackage.xjy(xibVar.getNodeComponent(), xibVar.getNodeName(), j);
    }

    public static final android.os.PersistableBundle n(defpackage.xjz xjzVar) {
        android.os.PersistableBundle persistableBundleH = h(xjzVar);
        persistableBundleH.putLong("unr.NODE_ID", xjzVar.d());
        return persistableBundleH;
    }

    public static final android.os.PersistableBundle o(defpackage.xpa xpaVar) {
        aooh.f(xpaVar, "value");
        return xpaVar.toPersistableBundle();
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.xfh.d(this, persistableBundle);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            return defpackage.xfh.d(this, persistableBundle);
        }
        if (i != 3) {
            return i != 4 ? defpackage.xfh.d(this, persistableBundle) : defpackage.xfh.d(this, persistableBundle);
        }
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return b((android.os.PersistableBundle) obj);
        }
        if (i == 1) {
            throw null;
        }
        if (i != 2 && i != 3 && i == 4) {
            return b((android.os.PersistableBundle) obj);
        }
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        int i = this.$cid;
        if (i == 0) {
            return f(persistableBundle);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            aooh.f(persistableBundle, "persistableBundle");
            return l(persistableBundle);
        }
        if (i == 3) {
            return l(persistableBundle);
        }
        if (i != 4) {
            aooh.f(persistableBundle, "persistableBundle");
            return aojh.a;
        }
        aooh.f(persistableBundle, "persistableBundle");
        return new defpackage.xgh(persistableBundle, 5);
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.xoy(this);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            return new defpackage.xoy(this);
        }
        if (i != 3) {
            return i != 4 ? new defpackage.xoy(this) : new defpackage.xoy(this);
        }
        return new defpackage.xoy(this);
    }

    @Override // defpackage.xpn, defpackage.xoz
    public final /* synthetic */ android.os.PersistableBundle ew(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return h((defpackage.xib) obj);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            return n(((defpackage.xjz) obj).f());
        }
        if (i == 3) {
            return n((defpackage.xjz) obj);
        }
        if (i == 4) {
            return o((defpackage.xpa) obj);
        }
        return new android.os.PersistableBundle();
    }
}
