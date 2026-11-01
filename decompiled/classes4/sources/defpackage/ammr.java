package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ammr implements defpackage.ammt {
    public java.lang.String a;
    private final defpackage.ammp b;
    private final java.lang.String c;
    private double d = 0.0d;
    private long e = 1;
    private final java.util.Random f = new java.util.Random();
    private final defpackage.amms g;

    public ammr(java.lang.String str, defpackage.ammp ammpVar, defpackage.amms ammsVar) {
        this.c = str;
        this.b = ammpVar;
        this.g = ammsVar;
    }

    private final void d(defpackage.ammv ammvVar) throws defpackage.ammv {
        if (this.d >= 60.0d) {
            throw ammvVar;
        }
        double dNextDouble = this.f.nextDouble();
        try {
            double d = this.d;
            long j = this.e;
            this.d = d + (j * dNextDouble);
            java.lang.Thread.sleep((long) (j * 1000 * dNextDouble));
        } catch (java.lang.InterruptedException unused) {
        }
        this.e <<= 1;
    }

    private final void e() {
        this.e = 1L;
        this.d = 0.0d;
    }

    private final boolean f() throws defpackage.ammv {
        try {
            return this.g.g();
        } catch (java.io.IOException e) {
            throw new defpackage.ammv(defpackage.ammu.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean g(amwp amwpVar) {
        return amwpVar.a / 100 == 4;
    }

    private static final boolean h(amwp amwpVar) {
        java.lang.String strA;
        java.lang.Object obj = amwpVar.b;
        return (obj == null || (strA = ((defpackage.ammp) obj).a("X-Goog-Upload-Status")) == null || !ahvr.r("final", strA)) ? false : true;
    }

    private static final boolean i(amwp amwpVar) {
        java.lang.String strA;
        java.lang.Object obj = amwpVar.b;
        return obj != null && (strA = ((defpackage.ammp) obj).a("X-Goog-Upload-Status")) != null && ahvr.r("active", strA) && amwpVar.a == 200;
    }

    private final amwp j(defpackage.ammp ammpVar, java.lang.String str, defpackage.amms ammsVar) throws java.lang.Throwable {
        ajcq ajcqVarA;
        defpackage.ammp ammpVar2 = new defpackage.ammp();
        ammpVar2.d("X-Goog-Upload-Protocol", "resumable");
        ammpVar2.d("X-Goog-Upload-Command", str);
        for (java.lang.String str2 : ammpVar.c()) {
            java.util.Iterator it = ammpVar.b(str2).iterator();
            while (it.hasNext()) {
                ammpVar2.d(str2, (java.lang.String) it.next());
            }
        }
        if (!ammpVar2.a.containsKey("X-Goog-Hash".toLowerCase(java.util.Locale.US))) {
            ahyn ahynVarA = ahyn.g((java.lang.Object) null).a(new defpackage.ammx(0));
            if (ahynVarA.f() && (ahvr.r((java.lang.CharSequence) ahynVarA.b(), "md5") || ahvr.r((java.lang.CharSequence) ahynVarA.b(), "sha-1"))) {
                ahvr.r((java.lang.CharSequence) ahynVarA.b(), "md5");
                aish aishVar = aish.e;
                throw null;
            }
        }
        java.lang.String str3 = str.equals("start") ? this.c : this.a;
        str.contains("start");
        defpackage.ammt ammtVarAs = aooc.as(str3, ammpVar2, ammsVar);
        synchronized (this) {
            ajcqVarA = ammtVarAs.a();
        }
        try {
            defpackage.apjb apjbVar = (defpackage.apjb) ajcqVarA.get();
            if (!apjbVar.n()) {
                return (amwp) apjbVar.b;
            }
            java.lang.Object obj = apjbVar.a;
            if (((defpackage.ammv) obj).a != defpackage.ammu.CANCELED) {
                throw ((java.lang.Throwable) obj);
            }
            throw new defpackage.ammv(defpackage.ammu.CONNECTION_ERROR, "", null);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.RuntimeException("Unexpected error occurred: ".concat(java.lang.String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.ammt
    public final ajcq a() {
        java.lang.Runnable ajcrVar = new ajcr(new defpackage.agqr(this, 12));
        annk annkVar = new annk((byte[]) null, (byte[]) null, (byte[]) null);
        annkVar.o("Scotty-Uploader-ResumableTransfer-%d");
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(annk.p(annkVar));
        executorServiceNewSingleThreadExecutor.submit(ajcrVar);
        executorServiceNewSingleThreadExecutor.shutdown();
        return ajcrVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x015d A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final amwp b(boolean r8) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ammr.b(boolean):amwp");
    }

    public final amwp c() throws java.lang.Throwable {
        synchronized (this) {
        }
        e();
        while (true) {
            try {
                amwp amwpVarJ = j(this.b, "start", new defpackage.amms(ahvr.co((java.lang.String) null)));
                if (h(amwpVarJ)) {
                    return amwpVarJ;
                }
                if (i(amwpVarJ)) {
                    defpackage.ammp ammpVar = (defpackage.ammp) amwpVarJ.b;
                    java.lang.String strA = ammpVar.a("X-Goog-Upload-URL");
                    try {
                        new java.net.URL(strA);
                        this.a = strA;
                        synchronized (this) {
                            try {
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        java.lang.String strA2 = ammpVar.a("X-Goog-Upload-Chunk-Granularity");
                        if (strA2 != null) {
                            try {
                                java.lang.Integer.parseInt(strA2);
                            } catch (java.lang.NumberFormatException e) {
                                throw new defpackage.ammv(defpackage.ammu.SERVER_ERROR, "Server returned an invalid chunk granularity.", e);
                            }
                        }
                        return b(false);
                    } catch (java.net.MalformedURLException e2) {
                        throw new defpackage.ammv(defpackage.ammu.SERVER_ERROR, "Server returned an invalid upload url.", e2);
                    }
                }
                if (g(amwpVarJ)) {
                    return amwpVarJ;
                }
                d(new defpackage.ammv(defpackage.ammu.SERVER_ERROR, amwpVarJ.c(), null));
            } catch (defpackage.ammv e3) {
                if (!e3.a()) {
                    throw e3;
                }
                d(e3);
            }
        }
    }
}
