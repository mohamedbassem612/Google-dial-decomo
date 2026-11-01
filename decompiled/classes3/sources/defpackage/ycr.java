package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycr implements defpackage.xuu {
    public static final defpackage.xur a = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, defpackage.xur.a);
    private final android.content.Context b;

    public ycr(android.content.Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        return c((android.net.Uri) obj, xusVar);
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        java.lang.String scheme = ((android.net.Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final defpackage.xxe c(android.net.Uri uri, defpackage.xus xusVar) {
        int identifier;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.lang.IllegalStateException(hgb.i(uri, "Package name for ", " is null or empty"));
        }
        android.content.Context contextCreatePackageContext = this.b;
        if (!authority.equals(contextCreatePackageContext.getPackageName())) {
            try {
                contextCreatePackageContext = contextCreatePackageContext.createPackageContext(authority, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.content.Context context = this.b;
                if (!authority.contains(context.getPackageName())) {
                    throw new java.lang.IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))), e);
                }
                contextCreatePackageContext = context;
            }
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            java.util.List<java.lang.String> pathSegments2 = uri.getPathSegments();
            java.lang.String authority2 = uri.getAuthority();
            java.lang.String str = pathSegments2.get(0);
            java.lang.String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = android.content.res.Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new java.lang.IllegalArgumentException("Failed to find resource id for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new java.lang.IllegalArgumentException("Unrecognized Uri format: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
            }
            try {
                identifier = java.lang.Integer.parseInt(uri.getPathSegments().get(0));
            } catch (java.lang.NumberFormatException e2) {
                throw new java.lang.IllegalArgumentException("Unrecognized Uri format: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))), e2);
            }
        }
        anty.aI(authority, "Argument must not be null");
        android.content.Context context2 = this.b;
        android.content.res.Resources.Theme theme = authority.equals(context2.getPackageName()) ? (android.content.res.Resources.Theme) xusVar.b(a) : null;
        return defpackage.ycq.g(theme == null ? defpackage.ycn.a(context2, contextCreatePackageContext, identifier, null) : defpackage.ycn.a(context2, context2, identifier, theme));
    }
}
