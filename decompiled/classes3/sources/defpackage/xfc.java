package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xfc {
    public xfc(defpackage.xsj xsjVar) {
        j$.util.Objects.requireNonNull(xsjVar);
    }

    public static android.os.PersistableBundle a(defpackage.xgt xgtVar) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.i(persistableBundle, "cc.TARGET", xgtVar.a());
        persistableBundle.putBoolean("cc.HANDLES_FAILURE", true);
        persistableBundle.putString("cc.KEY_ESTIMATED_CALLBACK_RUNTIME", null);
        return persistableBundle;
    }

    public static java.lang.String b(defpackage.xib xibVar) {
        return xibVar.getNodeComponent() + ':' + xibVar.getNodeName();
    }

    public static final long c() {
        return java.util.UUID.randomUUID().getLeastSignificantBits();
    }

    public static defpackage.xmx d(defpackage.xni xniVar, defpackage.xke xkeVar) {
        aooh.f(xkeVar, com.android.onboarding.config.WaitingScreenConfig.KEY_CONTRACT);
        long jB = xniVar.b();
        long jD = xniVar.d();
        int iA = xniVar.a();
        java.lang.String strE = xniVar.e();
        aooh.f(xkeVar, com.android.onboarding.config.WaitingScreenConfig.KEY_CONTRACT);
        aooh.f(strE, "targetPackageName");
        if (iA == -1) {
            iA = android.os.Process.myUid() / 100000;
        }
        int i = iA;
        if (aooh.n(strE, "unknown_target_package_name")) {
            strE = xkeVar.getNodePackage();
        }
        return new defpackage.xmx(jB, xkeVar, xkeVar, jD, i, strE, xkeVar.b());
    }

    public static com.android.onboarding.tasks.ErasedOnboardingTaskState e(defpackage.xnh xnhVar) {
        return new com.android.onboarding.tasks.ErasedOnboardingTaskState(xnhVar.toPersistableBundle());
    }

    public static final java.util.Map f(defpackage.xhu xhuVar, java.util.Set set, java.util.Set set2, java.lang.Object obj) {
        aooh.f(xhuVar, "component");
        aooh.f(set, "activities");
        aooh.f(set2, "tasks");
        aooh.f(xhuVar, "component");
        aooh.f(xhuVar, "p0");
        aooh.f(xhuVar, "component");
        aooh.f(xhuVar, "p0");
        defpackage.xme xmeVar = new defpackage.xme(new defpackage.xnb(xhuVar), defpackage.xnc.class, new obp(xhuVar, set, set2, 20, (char[]) null));
        aooh.f(xhuVar, "component");
        aooh.f(xhuVar, "p0");
        java.util.List listBb = ajsz.bb(new defpackage.xme[]{new defpackage.xme(new defpackage.xkt(xhuVar), defpackage.xku.class, new obp(xhuVar, set, set2, 19, (char[]) null)), xmeVar, new defpackage.xme(new defpackage.xln(xhuVar), defpackage.xlp.class, new defpackage.xtu(xhuVar, obj, 1))});
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(listBb, 10)), 16));
        for (java.lang.Object obj2 : listBb) {
            linkedHashMap.put(((defpackage.xme) obj2).asNodeRef(), obj2);
        }
        return linkedHashMap;
    }

    public static void g(android.content.Context context, defpackage.xrr xrrVar, defpackage.xss xssVar, java.util.List list, defpackage.yea yeaVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.yec yecVar = (defpackage.yec) it.next();
            try {
                yecVar.a(context, xrrVar, xssVar);
            } catch (java.lang.AbstractMethodError e) {
                throw new java.lang.IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(java.lang.String.valueOf(yecVar.getClass().getName())), e);
            }
        }
        if (yeaVar != null) {
            yeaVar.a(context, xrrVar, xssVar);
        }
    }

    public static int h(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string == null) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt(string);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static java.lang.String i(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        return string == null ? "" : string;
    }

    public static void j(java.lang.String str) {
        if (str != null) {
            try {
                new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm Z", java.util.Locale.US).parse(str).getTime();
            } catch (java.text.ParseException unused) {
            }
        }
    }

    public static xrh k(android.content.Context context) {
        return (xrh) agab.aH(context, xrh.class);
    }

    public xfc() {
    }
}
