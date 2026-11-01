package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anrj extends anar {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anrj.class.getName());
    private static final defpackage.anrh l;
    private static final java.lang.Class m;
    private static final java.lang.Class n;
    public final boolean b;
    public final ahvs c;
    public anph d;
    public java.util.Map e;
    public final boolean f;

    static {
        defpackage.anrh anrhVar;
        java.lang.Class clsAsSubclass;
        java.lang.ClassLoader classLoader = defpackage.anrj.class.getClassLoader();
        java.lang.Class<?> cls = null;
        try {
            try {
                anrhVar = new defpackage.anrh(java.lang.Class.forName("ahwe", false, classLoader), classLoader);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", e);
                anrhVar = null;
            }
        } catch (java.lang.ClassNotFoundException unused) {
        }
        l = anrhVar;
        try {
            clsAsSubclass = java.lang.Class.forName("ahvw").asSubclass(ahvs.class);
        } catch (java.lang.ClassNotFoundException e2) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (java.lang.Throwable) e2);
            clsAsSubclass = null;
        }
        m = clsAsSubclass;
        try {
            cls = java.lang.Class.forName("com.google.auth.appengine.AppEngineCredentials");
        } catch (java.lang.ClassNotFoundException e3) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", (java.lang.Throwable) e3);
        }
        n = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anrj(ahvs ahvsVar) {
        java.lang.Throwable th;
        ahvs ahvsVar2;
        super((char[]) null);
        defpackage.anrh anrhVar = l;
        java.lang.Class cls = m;
        boolean zIsInstance = cls != null ? cls.isInstance(ahvsVar) : false;
        if (anrhVar != null && anrhVar.a.isInstance(ahvsVar)) {
            try {
                ahvsVar2 = (ahvs) anrhVar.a.cast(ahvsVar);
                try {
                    if (((java.util.Collection) anrhVar.d.invoke(ahvsVar2, null)).size() == 0) {
                        java.lang.Object objInvoke = anrhVar.b.invoke(null, null);
                        for (defpackage.anri anriVar : anrhVar.e) {
                            anriVar.b.invoke(objInvoke, anriVar.a.invoke(ahvsVar2, null));
                        }
                        ahvsVar = (ahvs) anrhVar.c.invoke(objInvoke, null);
                    } else {
                        ahvsVar = ahvsVar2;
                    }
                } catch (java.lang.IllegalAccessException e) {
                    e = e;
                    th = e;
                    ahvsVar = ahvsVar2;
                    a.logp(java.util.logging.Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", th);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    e = e2;
                    th = e;
                    ahvsVar = ahvsVar2;
                    a.logp(java.util.logging.Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", th);
                }
            } catch (java.lang.IllegalAccessException e3) {
                e = e3;
                ahvsVar2 = ahvsVar;
            } catch (java.lang.reflect.InvocationTargetException e4) {
                th = e4;
                a.logp(java.util.logging.Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", th);
            }
        }
        this.b = zIsInstance;
        this.c = ahvsVar;
        java.lang.Class cls2 = n;
        if (cls2 == null) {
            this.f = false;
        } else {
            this.f = cls2.isInstance(ahvsVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    public static void a(java.lang.String str, defpackage.anpk anpkVar) throws anqx {
        try {
            java.net.URI uri = new java.net.URI("https", str, "/".concat(java.lang.String.valueOf(anpkVar.c)), null, null);
            if (uri.getPort() == 443) {
                b(uri);
            }
        } catch (java.net.URISyntaxException e) {
            throw new anqx(anqw.g.f("Unable to construct service URI for auth").e(e), (anph) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    private static void b(java.net.URI uri) throws anqx {
        try {
            new java.net.URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (java.net.URISyntaxException e) {
            throw new anqx(anqw.g.f("Unable to construct service URI after removing port").e(e), (anph) null);
        }
    }
}
