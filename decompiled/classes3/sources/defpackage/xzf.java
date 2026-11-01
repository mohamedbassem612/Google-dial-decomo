package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzf implements defpackage.xzp {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public xzf(android.content.Context context, int i, byte[] bArr) {
        this.$cid = i;
        this.a = context.getApplicationContext();
    }

    private static android.net.Uri c(java.lang.String str) {
        return android.net.Uri.fromFile(new java.io.File(str));
    }

    @Override // defpackage.xzp
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return defpackage.xff.x((android.net.Uri) obj);
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            android.net.Uri uri = (android.net.Uri) obj;
            if (defpackage.xff.x(uri) && !defpackage.xff.z(uri)) {
                return true;
            }
        } else {
            if (i != 5) {
                return true;
            }
            android.net.Uri uri2 = (android.net.Uri) obj;
            if (defpackage.xff.x(uri2) && defpackage.xff.z(uri2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, xzd] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, xzp] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xyq] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, xzp] */
    @Override // defpackage.xzp
    public final /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        android.net.Uri uriC;
        java.lang.Long l;
        int i3 = this.$cid;
        if (i3 == 0) {
            java.io.File file = (java.io.File) obj;
            return new ucm(new defpackage.yfn(file), new defpackage.xzc(file, (defpackage.xzd) this.a, 0));
        }
        if (i3 == 1) {
            byte[] bArr = (byte[]) obj;
            return new ucm(new defpackage.yfn(bArr), new defpackage.xyr(bArr, (defpackage.xyq) this.a, 0));
        }
        if (i3 == 2) {
            android.net.Uri uri = (android.net.Uri) obj;
            return new ucm(new defpackage.yfn(uri), new defpackage.xzl((android.content.Context) this.a, uri));
        }
        if (i3 == 3) {
            java.lang.String str = (java.lang.String) obj;
            if (android.text.TextUtils.isEmpty(str)) {
                uriC = null;
            } else if (str.charAt(0) == '/') {
                uriC = c(str);
            } else {
                android.net.Uri uri2 = android.net.Uri.parse(str);
                uriC = uri2.getScheme() == null ? c(str) : uri2;
            }
            if (uriC == null) {
                return null;
            }
            ?? r4 = this.a;
            if (r4.a(uriC)) {
                return r4.b(uriC, i, i2, xusVar);
            }
            return null;
        }
        if (i3 == 4) {
            android.net.Uri uri3 = (android.net.Uri) obj;
            if (!defpackage.xff.y(i, i2)) {
                return null;
            }
            defpackage.yfn yfnVar = new defpackage.yfn(uri3);
            android.content.Context context = (android.content.Context) this.a;
            return new ucm(yfnVar, defpackage.xzc.c(context, uri3, new defpackage.xvs(context.getContentResolver())));
        }
        if (i3 != 5) {
            return this.a.b(new defpackage.xzg((java.net.URL) obj), i, i2, xusVar);
        }
        android.net.Uri uri4 = (android.net.Uri) obj;
        if (!defpackage.xff.y(i, i2) || (l = (java.lang.Long) xusVar.b(defpackage.yci.a)) == null || l.longValue() != -1) {
            return null;
        }
        defpackage.yfn yfnVar2 = new defpackage.yfn(uri4);
        android.content.Context context2 = (android.content.Context) this.a;
        return new ucm(yfnVar2, defpackage.xzc.c(context2, uri4, new defpackage.xvt(context2.getContentResolver())));
    }

    public xzf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public xzf(android.content.Context context, int i, char[] cArr) {
        this.$cid = i;
        this.a = context.getApplicationContext();
    }
}
