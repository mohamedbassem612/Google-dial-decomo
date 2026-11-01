package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybz implements defpackage.xuu {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public ybz(java.util.List list, defpackage.xxt xxtVar, boolean z, int i) {
        this.$cid = i;
        this.a = z ? new defpackage.uyg(list, xxtVar) : null;
        this.b = new defpackage.yao(z);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, xxm] */
    @Override // defpackage.xuu
    public final /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        defpackage.yby ybyVar;
        boolean z;
        defpackage.yfs yfsVar;
        int i3 = this.$cid;
        if (i3 == 0) {
            defpackage.xxe xxeVarC = ((defpackage.ycr) this.a).c((android.net.Uri) obj, xusVar);
            if (xxeVarC == null) {
                return null;
            }
            return defpackage.ybj.a(this.b, ((defpackage.yco) xxeVarC).c(), i, i2);
        }
        if (i3 == 1) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            java.lang.Object obj2 = this.a;
            return ((defpackage.yao) this.b).c(android.graphics.ImageDecoder.createSource(byteBuffer), i, i2, obj2 != null ? ((defpackage.uyg) obj2).m(byteBuffer, xusVar) : xusVar);
        }
        if (i3 != 2) {
            android.net.Uri uri = (android.net.Uri) obj;
            android.content.Context context = (android.content.Context) this.b;
            android.graphics.ImageDecoder.Source sourceM = ft$.ExternalSyntheticApiModelOutline0.m(context.getContentResolver(), uri);
            if (android.util.Log.isLoggable("UriBitmapDecoder", 2)) {
                java.lang.String type = context.getContentResolver().getType(uri);
                android.util.Log.v("UriBitmapDecoder", "decoding " + java.lang.String.valueOf(uri) + ", mimeType: " + type + ", [" + i + ", " + i2 + ']');
            }
            return ((defpackage.yao) this.a).c(sourceM, i, i2, xusVar);
        }
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        if (inputStream instanceof defpackage.yby) {
            ybyVar = (defpackage.yby) inputStream;
            z = false;
        } else {
            ybyVar = new defpackage.yby(inputStream, (defpackage.xxt) this.b);
            z = true;
        }
        java.util.Queue queue = defpackage.yfs.a;
        synchronized (queue) {
            yfsVar = (defpackage.yfs) queue.poll();
        }
        if (yfsVar == null) {
            yfsVar = new defpackage.yfs();
        }
        defpackage.yfs yfsVar2 = yfsVar;
        yfsVar2.b = ybyVar;
        defpackage.yfz yfzVar = new defpackage.yfz(yfsVar2);
        defpackage.yca ycaVar = new defpackage.yca(ybyVar, yfsVar2);
        try {
            java.lang.Object obj3 = this.a;
            defpackage.xxe xxeVarA = ((defpackage.ybh) obj3).a(new defpackage.ybs(yfzVar, ((defpackage.ybh) obj3).h, ((defpackage.ybh) obj3).i, 1), i, i2, xusVar, ycaVar);
        } finally {
            yfsVar2.a();
            if (z) {
                ybyVar.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    @Override // defpackage.xuu
    public final /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        java.lang.String type;
        int iLastIndexOf;
        int i = this.$cid;
        if (i == 0) {
            return "android.resource".equals(((android.net.Uri) obj).getScheme());
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return true;
        }
        android.net.Uri uri = (android.net.Uri) obj;
        java.lang.Long l = (java.lang.Long) xusVar.b(defpackage.yci.a);
        if ((l == null || l.longValue() == -1) && android.os.Build.VERSION.SDK_INT >= 35) {
            java.lang.String scheme = uri.getScheme();
            if ("content".equals(scheme) || "file".equals(scheme) || "android.resource".equals(scheme)) {
                java.lang.String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null || (iLastIndexOf = lastPathSegment.lastIndexOf(46)) == -1) {
                    type = ((android.content.Context) this.b).getContentResolver().getType(uri);
                } else {
                    type = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(lastPathSegment.substring(iLastIndexOf + 1).toLowerCase(java.util.Locale.ROOT));
                    if (type == null) {
                        type = ((android.content.Context) this.b).getContentResolver().getType(uri);
                    }
                }
                if (type == null) {
                    return "android.resource".equals(scheme);
                }
                if (type.startsWith("image/") && !type.equals("image/gif")) {
                    return true;
                }
            }
        }
        return false;
    }

    public ybz(android.content.Context context, int i) {
        this.$cid = i;
        this.a = new defpackage.yao(false);
        this.b = context.getApplicationContext();
    }

    public ybz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
