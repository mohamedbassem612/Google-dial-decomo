package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ager {
    public static final xtq c = new xtq("ReviewService", (byte[]) null, (byte[]) null);
    public defpackage.agfc a;
    public final java.lang.String b;

    public ager(android.content.Context context) {
        this.b = context.getPackageName();
        xtq xtqVar = defpackage.agfe.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                defpackage.agfe.a.F("Play Store package is disabled.", new java.lang.Object[0]);
                return;
            }
            try {
                android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    defpackage.agfe.a.F("Play Store package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.content.pm.Signature signature : signatureArr) {
                    java.lang.String strU = afsq.u(signature.toByteArray());
                    arrayList.add(strU);
                    if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strU) || ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strU))) {
                        this.a = new defpackage.agfc(context, c, new android.content.Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                        return;
                    }
                }
                xtq xtqVar2 = defpackage.agfe.a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((java.lang.CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                    }
                }
                xtqVar2.F(java.lang.String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new java.lang.Object[0]);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                defpackage.agfe.a.F("Play Store package is not found.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            defpackage.agfe.a.F("Play Store package is not found.", new java.lang.Object[0]);
        }
    }
}
