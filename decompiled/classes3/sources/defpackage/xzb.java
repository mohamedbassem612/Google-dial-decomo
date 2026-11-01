package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzb implements defpackage.xzp {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public xzb(android.content.Context context, defpackage.xza xzaVar, int i) {
        this.$cid = i;
        this.a = context.getApplicationContext();
        this.b = xzaVar;
    }

    private final android.net.Uri c(java.lang.Integer num) {
        try {
            return android.net.Uri.parse("android.resource://" + ((android.content.res.Resources) this.a).getResourcePackageName(num.intValue()) + '/' + num);
        } catch (android.content.res.Resources.NotFoundException e) {
            if (android.util.Log.isLoggable("ResourceLoader", 5)) {
                android.util.Log.w("ResourceLoader", "Received invalid resource id: ".concat(java.lang.String.valueOf(num)), e);
            }
            return null;
        }
    }

    @Override // defpackage.xzp
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            android.net.Uri uri = (android.net.Uri) obj;
            if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                return true;
            }
        } else {
            if (i == 2) {
                return true;
            }
            android.net.Uri uri2 = (android.net.Uri) obj;
            if ("android.resource".equals(uri2.getScheme()) && ((android.content.Context) this.a).getPackageName().equals(uri2.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, xza] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, xzp] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, xzp] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, xzp] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, xyo] */
    @Override // defpackage.xzp
    public final /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        int i3 = this.$cid;
        if (i3 == 0) {
            java.lang.Integer num = (java.lang.Integer) obj;
            android.content.res.Resources.Theme theme = (android.content.res.Resources.Theme) xusVar.b(defpackage.ycr.a);
            return new ucm(new defpackage.yfn(num), new defpackage.xyz(theme, theme != null ? theme.getResources() : ((android.content.Context) this.a).getResources(), this.b, num.intValue()));
        }
        if (i3 == 1) {
            android.net.Uri uri = (android.net.Uri) obj;
            return new ucm(new defpackage.yfn(uri), this.b.a((android.content.res.AssetManager) this.a, uri.toString().substring(22)));
        }
        if (i3 == 2) {
            android.net.Uri uriC = c((java.lang.Integer) obj);
            if (uriC != null) {
                return this.b.b(uriC, i, i2, xusVar);
            }
            return null;
        }
        android.net.Uri uri2 = (android.net.Uri) obj;
        java.util.List<java.lang.String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i4 = java.lang.Integer.parseInt(uri2.getPathSegments().get(0));
                if (i4 != 0) {
                    return this.b.b(java.lang.Integer.valueOf(i4), i, i2, xusVar);
                }
                if (!android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                android.util.Log.w("ResourceUriLoader", a.bH(uri2, "Failed to parse a valid non-0 resource id from: "));
                return null;
            } catch (java.lang.NumberFormatException e) {
                if (!android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                android.util.Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri2))), e);
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (!android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            android.util.Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri2))));
            return null;
        }
        java.util.List<java.lang.String> pathSegments2 = uri2.getPathSegments();
        java.lang.String str = pathSegments2.get(0);
        java.lang.String str2 = pathSegments2.get(1);
        android.content.Context context = (android.content.Context) this.a;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.b.b(java.lang.Integer.valueOf(identifier), i, i2, xusVar);
        }
        if (!android.util.Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        android.util.Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri2))));
        return null;
    }

    public xzb(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public xzb(android.content.Context context, defpackage.xzp xzpVar, int i) {
        this.$cid = i;
        this.a = context.getApplicationContext();
        this.b = xzpVar;
    }
}
