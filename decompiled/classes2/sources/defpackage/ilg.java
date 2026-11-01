package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ilg extends aomh implements aonn {
    boolean a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.ili d;
    final /* synthetic */ acuh e;
    final /* synthetic */ java.io.File f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilg(defpackage.ili iliVar, acuh acuhVar, java.io.File file, boolean z, aoln aolnVar) {
        super(2, aolnVar);
        this.d = iliVar;
        this.e = acuhVar;
        this.f = file;
        this.g = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Throwable th;
        ?? r7;
        boolean z;
        aolu aoluVar = aolu.a;
        if (this.c != 0) {
            z = this.a;
            r7 = this.b;
            try {
                aooc.af(obj);
                r7 = r7;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak((java.io.Closeable) r7, th);
                    throw th3;
                }
            }
        } else {
            aooc.af(obj);
            defpackage.ili iliVar = this.d;
            acuh acuhVar = this.e;
            java.io.File file = this.f;
            boolean z2 = this.g;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(122, "AudioPrismDuplexModelRunner_unzipAndGetUnzippedDirectoryPath");
            try {
                aogc aogcVar = iliVar.p;
                java.lang.String str = acuhVar.d;
                aooh.e(str, "getFileUri(...)");
                android.net.Uri uri = android.net.Uri.parse(str);
                aooh.e(uri, "parse(...)");
                ajcq ajcqVarBh = iliVar.o.bh(new java.io.BufferedInputStream((java.io.InputStream) aogcVar.M(uri, new affr())), file.getAbsolutePath());
                this.b = ahoqVarZ;
                this.a = z2;
                this.c = 1;
                obj = aosv.D(ajcqVarBh, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                z = z2;
                r7 = ahoqVarZ;
            } catch (java.lang.Throwable th4) {
                th = th4;
                r7 = ahoqVarZ;
                throw th;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        new java.io.File(str2, "succeeded").createNewFile();
        if (z) {
            new java.io.File(str2, "verified").createNewFile();
        }
        ajsz.ak((java.io.Closeable) r7, (java.lang.Throwable) null);
        return str2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ilg(this.d, this.e, this.f, this.g, aolnVar);
    }
}
