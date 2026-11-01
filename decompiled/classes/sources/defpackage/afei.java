package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afei {
    public java.lang.String a;
    private final android.content.Context c;
    private java.lang.String d = "files";
    private java.lang.String e = "common";
    private android.accounts.Account f = defpackage.afej.b;
    private java.lang.String g = "";
    public final defpackage.aift b = new defpackage.aift(4);

    public afei(android.content.Context context) {
        defpackage.agab.ah(context != null, "Context cannot be null", new java.lang.Object[0]);
        this.c = context;
        this.a = context.getPackageName();
    }

    public final android.net.Uri a() {
        return new android.net.Uri.Builder().scheme("android").authority(this.a).path("/" + this.d + '/' + this.e + '/' + defpackage.afeg.b(this.f) + '/' + this.g).encodedFragment(defpackage.affh.a(this.b.g())).build();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0099  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0146  */
    public final void b(java.lang.String str) {
        java.io.File fileAk;
        java.lang.String absolutePath;
        java.lang.String absolutePath2;
        java.lang.String strSubstring;
        android.content.Context context = this.c;
        java.io.File fileAl = defpackage.agab.al(context);
        java.lang.String absolutePath3 = new java.io.File(fileAl, "managed").getAbsolutePath();
        if (str.startsWith(absolutePath3)) {
            d("managed");
            strSubstring = str.substring(absolutePath3.length());
        } else {
            java.lang.String absolutePath4 = fileAl.getAbsolutePath();
            if (str.startsWith(absolutePath4)) {
                d("files");
                strSubstring = str.substring(absolutePath4.length());
            } else {
                java.lang.String absolutePath5 = context.getCacheDir().getAbsolutePath();
                if (str.startsWith(absolutePath5)) {
                    d("cache");
                    strSubstring = str.substring(absolutePath5.length());
                } else {
                    java.io.File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        java.lang.String absolutePath6 = externalFilesDir.getAbsolutePath();
                        if (str.startsWith(absolutePath6)) {
                            d("external");
                            strSubstring = str.substring(absolutePath6.length());
                        } else {
                            fileAk = defpackage.agab.ak(context);
                            absolutePath = new java.io.File(fileAk, "files").getAbsolutePath();
                            if (str.startsWith(absolutePath)) {
                                d("directboot-files");
                                strSubstring = str.substring(absolutePath.length());
                            } else {
                                absolutePath2 = new java.io.File(fileAk, "cache").getAbsolutePath();
                                if (str.startsWith(absolutePath2)) {
                                    throw new java.lang.IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(java.lang.String.valueOf(str)));
                                }
                                d("directboot-cache");
                                strSubstring = str.substring(absolutePath2.length());
                            }
                        }
                    } else {
                        fileAk = defpackage.agab.ak(context);
                        absolutePath = new java.io.File(fileAk, "files").getAbsolutePath();
                        if (str.startsWith(absolutePath)) {
                            d("directboot-files");
                            strSubstring = str.substring(absolutePath.length());
                        } else {
                            absolutePath2 = new java.io.File(fileAk, "cache").getAbsolutePath();
                            if (str.startsWith(absolutePath2)) {
                                throw new java.lang.IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(java.lang.String.valueOf(str)));
                            }
                            d("directboot-cache");
                            strSubstring = str.substring(absolutePath2.length());
                        }
                    }
                }
            }
        }
        java.util.List listAsList = java.util.Arrays.asList(strSubstring.split(java.io.File.separator));
        defpackage.agab.ah(listAsList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        e((java.lang.String) listAsList.get(1));
        java.lang.String str2 = (java.lang.String) listAsList.get(2);
        if ("managed".equals(this.d)) {
            android.accounts.Account account = defpackage.afeg.a;
            if (!"shared".equals(str2)) {
                try {
                    java.lang.Integer.parseInt(str2);
                    defpackage.agab.ah(false, "AccountManager cannot be null", new java.lang.Object[0]);
                    try {
                        throw null;
                    } catch (java.lang.InterruptedException e) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.lang.IllegalArgumentException(new defpackage.afex(e));
                    } catch (java.util.concurrent.ExecutionException e2) {
                        throw new java.lang.IllegalArgumentException(new defpackage.afex(e2.getCause()));
                    }
                } catch (java.lang.NumberFormatException e3) {
                    throw new java.lang.IllegalArgumentException(e3);
                }
            }
        }
        c(defpackage.afeg.a(str2));
        f(strSubstring.substring(this.e.length() + str2.length() + 2));
    }

    public final void c(android.accounts.Account account) {
        defpackage.afeg.b(account);
        this.f = account;
    }

    public final void d(java.lang.String str) {
        java.util.Set set = defpackage.afej.d;
        defpackage.agab.ah(set.contains(str), "The only supported locations are %s: %s", set, str);
        this.d = str;
    }

    public final void e(java.lang.String str) {
        defpackage.agab.ah(defpackage.afej.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        defpackage.agab.ah(!defpackage.afej.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.e = str;
    }

    public final void f(java.lang.String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        java.util.regex.Pattern pattern = defpackage.afej.a;
        this.g = str;
    }
}
