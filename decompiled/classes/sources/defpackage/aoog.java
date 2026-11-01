package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoog {
    public aoog(java.util.concurrent.Executor executor, org.chromium.net.Proxy.HttpConnectCallback httpConnectCallback) {
        if (r() < 49) {
            throw new java.lang.AssertionError(java.lang.String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", java.lang.Integer.valueOf(r()), 49));
        }
    }

    public static java.lang.String a(j$.nio.file.Path path) {
        java.lang.String string;
        java.lang.String strV;
        defpackage.aooh.f(path, "<this>");
        j$.nio.file.Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strV = defpackage.aoov.V(string, string)) == null) ? "" : strV;
    }

    public static java.util.List b(j$.nio.file.Path path) throws java.io.IOException {
        java.nio.file.DirectoryStream directoryStreamNewDirectoryStream = j$.nio.file.Files.newDirectoryStream(path, "*");
        try {
            defpackage.aooh.c(directoryStreamNewDirectoryStream);
            java.util.List listBZ = defpackage.ajsz.bZ(directoryStreamNewDirectoryStream);
            defpackage.ajsz.ak(directoryStreamNewDirectoryStream, null);
            return listBZ;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(directoryStreamNewDirectoryStream, th);
                throw th2;
            }
        }
    }

    public static final java.lang.String c(java.io.Reader reader) throws java.io.IOException {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        java.lang.String string = stringWriter.toString();
        defpackage.aooh.e(string, "toString(...)");
        return string;
    }

    public static final void d(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static void e(android.database.Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean f(android.content.Context context, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static int g(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static int h(int i) {
        if (i == 99) {
            return 100;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    public static apys i(java.lang.Object obj, java.lang.Object obj2) {
        apys apysVarA = (apys) obj;
        apys apysVar = (apys) obj2;
        if (!apysVar.isEmpty()) {
            if (!apysVarA.b) {
                apysVarA = apysVarA.a();
            }
            apysVarA.b();
            if (!apysVar.isEmpty()) {
                apysVarA.putAll(apysVar);
            }
        }
        return apysVarA;
    }

    public static final apyr j(java.lang.Object obj) {
        return (apyr) ((uzx) obj).a;
    }

    public static final java.lang.Object k() {
        return apys.a.a();
    }

    public static apyi l(java.lang.Object obj, long j) {
        return (apyi) apzs.f(obj, j);
    }

    public static final java.util.List m(java.lang.Object obj, long j) {
        apyi apyiVarL = l(obj, j);
        if (apyiVarL.c()) {
            return apyiVarL;
        }
        int size = apyiVarL.size();
        apyi apyiVarD = apyiVarL.d(size == 0 ? 10 : size << 1);
        apzs.o(obj, j, apyiVarD);
        return apyiVarD;
    }

    public static apya n(java.lang.Object obj) {
        return ((apye) obj).extensions;
    }

    public static void o(java.lang.Object obj) {
        throw null;
    }

    public static final void p(java.lang.Object obj) {
        n(obj).c();
    }

    public static final apxo q(byte[] bArr, apxj apxjVar) {
        if (apxjVar.l() > 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
        if (apxjVar.l() >= 0) {
            return new apxn(bArr);
        }
        throw new java.lang.IllegalStateException("Wrote more data than expected.");
    }

    public static int r() {
        return java.lang.Integer.parseInt(org.chromium.net.ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 49;
    }

    private aoog() {
    }
}
