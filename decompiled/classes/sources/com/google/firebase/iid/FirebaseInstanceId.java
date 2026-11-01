package com.google.firebase.iid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public class FirebaseInstanceId {
    public static defpackage.aogc f;
    private static final java.util.regex.Pattern h;
    public final java.util.concurrent.Executor a;
    public final defpackage.ajtc b;
    public final defpackage.ajwa c;
    public final java.util.List d = new java.util.ArrayList();
    public final defpackage.ajyz e;
    public final defpackage.apni g;
    private final defpackage.ajwi i;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        h = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public FirebaseInstanceId(defpackage.ajtc ajtcVar, defpackage.ajwa ajwaVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, defpackage.ajwe ajweVar, defpackage.ajwe ajweVar2, defpackage.ajwi ajwiVar) {
        if (defpackage.a.f(ajtcVar) == null) {
            throw new java.lang.IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            if (f == null) {
                f = new defpackage.aogc(ajtcVar.a());
            }
        }
        this.b = ajtcVar;
        this.c = ajwaVar;
        this.e = new defpackage.ajyz(ajtcVar, ajwaVar, new defpackage.aabo(ajtcVar.a()), ajweVar, ajweVar2, ajwiVar);
        this.a = executor2;
        this.g = new defpackage.apni(executor, (byte[]) null);
        this.i = ajwiVar;
    }

    public static void d(defpackage.ajtc ajtcVar) {
        defpackage.aais.aq(ajtcVar.c().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        defpackage.aais.aq(ajtcVar.c().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        defpackage.aais.aq(ajtcVar.c().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        defpackage.aais.aj(ajtcVar.c().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        defpackage.aais.aj(h.matcher(ajtcVar.c().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static com.google.firebase.iid.FirebaseInstanceId getInstance(defpackage.ajtc ajtcVar) {
        d(ajtcVar);
        com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = (com.google.firebase.iid.FirebaseInstanceId) ajtcVar.d(com.google.firebase.iid.FirebaseInstanceId.class);
        defpackage.aais.at(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public final java.lang.Object a(defpackage.aaum aaumVar) throws java.io.IOException {
        try {
            return defpackage.aazc.u(aaumVar, 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException unused) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.io.IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    e();
                }
                throw ((java.io.IOException) cause);
            }
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.io.IOException(e);
        }
    }

    public final java.lang.String b() {
        try {
            f.i(this.b.f());
            defpackage.aaum aaumVarA = this.i.a();
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            aaumVarA.n(new defpackage.so(7), new defpackage.aaug() { // from class: ajvx
                @Override // defpackage.aaug
                public final void a(defpackage.aaum aaumVar) {
                    defpackage.aogc aogcVar = com.google.firebase.iid.FirebaseInstanceId.f;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (aaumVarA.k()) {
                return (java.lang.String) aaumVarA.g();
            }
            if (((defpackage.aauq) aaumVarA).c) {
                throw new java.util.concurrent.CancellationException("Task is already canceled");
            }
            if (aaumVarA.j()) {
                throw new java.lang.IllegalStateException(aaumVarA.f());
            }
            throw new java.lang.IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public final java.lang.String c() {
        defpackage.ajtc ajtcVar = this.b;
        return "[DEFAULT]".equals(ajtcVar.e()) ? "" : ajtcVar.f();
    }

    final synchronized void e() {
        f.g();
    }
}
