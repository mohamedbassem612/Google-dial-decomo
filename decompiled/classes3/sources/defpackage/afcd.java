package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afcd {
    public static volatile anpk a;
    public static volatile anpk b;
    public static volatile anpk c;
    public static volatile anpk d;

    private afcd() {
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, long j, int i) {
        android.content.res.Resources resources = context.getApplicationContext().getResources();
        java.io.InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(2131428073)));
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStreamOpenRawResource.read(bArr, 0, java.lang.Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString(java.nio.charset.StandardCharsets.UTF_8.name());
            } catch (java.io.UnsupportedEncodingException e) {
                throw new java.lang.RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static java.lang.String b(java.util.zip.ZipEntry zipEntry) throws java.util.zip.ZipException {
        java.lang.String name = zipEntry.getName();
        if (name.contains("..")) {
            for (java.io.File file = new java.io.File(name); file != null; file = file.getParentFile()) {
                if (file.getName().equals("..")) {
                    throw new java.util.zip.ZipException("Illegal name: ".concat(java.lang.String.valueOf(name)));
                }
            }
        }
        return name;
    }

    public static final void c(java.lang.String str, java.util.List list, java.util.Set set) {
        aift aiftVar = new aift(4);
        aiftVar.k(list);
        aiftVar.i(str);
        set.add(aiftVar.h());
    }

    public static final defpackage.afbe d(aigb aigbVar) {
        return new defpackage.afbe(aigbVar.e(true));
    }

    public static final void e(java.lang.String str, afbd afbdVar, aigb aigbVar) {
        aigbVar.i(str, afbdVar.d());
    }

    public static final defpackage.afao f(java.lang.StringBuilder sb, java.util.List list) {
        return new defpackage.afao(sb.toString(), list);
    }

    public static final void g(java.lang.String str, java.lang.String[] strArr, java.lang.StringBuilder sb) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(strArr[i]);
            }
        }
    }

    public static final void h(android.content.Context context, int i) {
        try {
            sw swVar = new sw();
            swVar.c.a(-1118482);
            vx vxVarA = swVar.a();
            ((android.content.Intent) vxVarA.a).addFlags(i);
            vxVarA.c(context, android.net.Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (android.content.ActivityNotFoundException unused) {
            throw new defpackage.afae();
        }
    }

    public static final /* synthetic */ xtq i(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq j(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new xtq(akzzVar);
    }

    public static final /* synthetic */ xtq k(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq l(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ defpackage.zoe m(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new defpackage.zoe(akzzVar);
    }

    public static final /* synthetic */ defpackage.zoe n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.zoe(akzxVar);
    }
}
