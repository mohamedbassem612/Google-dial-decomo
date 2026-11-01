package com.android.dialer.debug.dump.dumptools;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class DialerDebugDumpContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/debug/dump/dumptools/DialerDebugDumpContentProvider");

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        android.content.Context context = getContext();
        if (context == null) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/debug/dump/dumptools/DialerDebugDumpContentProvider", "dump", '*', "DialerDebugDumpContentProvider.java")).v("missing context");
            return;
        }
        mfs mfsVarAB = ((defpackage.mft) defpackage.agab.aH(context, defpackage.mft.class)).aB();
        java.util.List listAsList = java.util.Arrays.asList((java.lang.String[]) j$.util.Optional.ofNullable(strArr).orElse(new java.lang.String[0]));
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        boolean zContains = listAsList.contains("pii");
        boolean zContains2 = listAsList.contains("pii-nodes");
        defpackage.ahok ahokVarF = mfsVarAB.e.f(353, "dump");
        try {
            mfu mfuVar = new mfu(android.os.Build.VERSION.SDK_INT >= 34, zContains, zContains2);
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) mfs.a.b()).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "dump", 102, "DebugDumper.java");
            java.lang.Object objValueOf = java.lang.Boolean.valueOf(mfuVar.b);
            aimwVar.M("Generating dump. Arguments: pii=%b, pii-nodes=%b, immediate=%b", objValueOf, java.lang.Boolean.valueOf(mfuVar.c), java.lang.Boolean.valueOf(mfuVar.a));
            if (zContains2) {
                printWriter.printf("pii-nodes only %s\n", mfuVar);
                mfsVarAB.f.o(defpackage.rmx.DEBUG_DUMP_PII_NODES_FLAG);
            } else {
                if (zContains) {
                    mfsVarAB.f.o(defpackage.rmx.DEBUG_DUMP_PII_FLAG);
                }
                printWriter.printf("pii=%b %s\n", objValueOf, mfuVar);
            }
            defpackage.akzx akzxVarM = mfr.a.m();
            mfsVarAB.c.isPresent();
            try {
                defpackage.akzx akzxVarM2 = mhj.a.m();
                defpackage.aify aifyVar = (defpackage.aify) j$.util.Collection.-EL.stream(mfsVarAB.g.e()).map(new jil(mfuVar, 12)).collect(defpackage.aido.a);
                mhj mhjVar = (mhj) ((defpackage.ajac) defpackage.ahvr.ah(aifyVar).o(new lly(aifyVar, akzxVarM2, 6), mfsVarAB.d)).t(2L, java.util.concurrent.TimeUnit.SECONDS);
                akzxVarM.u();
                mfr mfrVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(mhjVar);
                mfrVar.d = mhjVar;
                mfrVar.b |= 2;
                mfr mfrVar2 = akzxVarM.b;
                if ((mfrVar2.b & 1) != 0) {
                    mgz mgzVar = mfrVar2.c;
                    if (mgzVar == null) {
                        mgzVar = mgz.a;
                    }
                    defpackage.akzx akzxVarL = mgzVar.L();
                    akzxVarL.u();
                    mgz mgzVar2 = akzxVarL.b;
                    mgzVar2.d = null;
                    mgzVar2.b &= -9;
                    mgz mgzVarR = akzxVarL.r();
                    akzxVarM.u();
                    mfr mfrVar3 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(mgzVarR);
                    mfrVar3.c = mgzVarR;
                    mfrVar3.b |= 1;
                }
            } catch (java.lang.Exception e) {
                if (e instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) mfs.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "mergePublicDump", (char) 270, "DebugDumper.java")).v("error dumping debug data");
            }
            mfr mfrVarR = akzxVarM.r();
            defpackage.aimz aimzVar = mfs.a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "dump", 124, "DebugDumper.java")).v("Writing dump");
            try {
                printWriter.print("session start timestamp: ");
                mgz mgzVar3 = mfrVarR.c;
                if (mgzVar3 == null) {
                    mgzVar3 = mgz.a;
                }
                mgy mgyVar = mgzVar3.c;
                if (mgyVar == null) {
                    mgyVar = mgy.a;
                }
                printWriter.println(mgyVar.b);
                printWriter.print("session end timestamp: ");
                mgz mgzVar4 = mfrVarR.c;
                if (mgzVar4 == null) {
                    mgzVar4 = mgz.a;
                }
                mgy mgyVar2 = mgzVar4.c;
                if (mgyVar2 == null) {
                    mgyVar2 = mgy.a;
                }
                printWriter.println(mgyVar2.c);
                java.lang.String str = mfs.b;
                printWriter.println(str);
                mfsVarAB.c.isPresent();
                printWriter.println(str);
                printWriter.println("Raw dump");
                printWriter.println(str);
                printWriter.println("use go/dialer-dump to parse the result.");
                printWriter.println(defpackage.mni.aL("*", 10));
                printWriter.println(defpackage.aish.e.k(mfrVarR.i()));
                printWriter.flush();
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "dump", 143, "DebugDumper.java")).x("Debug dump total completion time: %dms", j$.time.Instant.now().minusMillis(epochMilli).toEpochMilli());
            } catch (java.lang.Exception e2) {
                defpackage.aimz aimzVar2 = mfs.a;
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "dump", 149, "DebugDumper.java")).v("error writing debug data to provider");
                if (e2 instanceof java.io.IOException) {
                    mfsVarAB.f.o(defpackage.rmx.DUMP_BROKEN_PIPE_EXCEPTION);
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "dump", 156, "DebugDumper.java")).x("Debug dump total timeout time: %dms", j$.time.Instant.now().minusMillis(epochMilli).toEpochMilli());
                }
            }
            ((defpackage.aimw) ((defpackage.aimw) mfs.a.b()).l("com/android/dialer/debug/dump/dumptools/DebugDumper", "dump", 159, "DebugDumper.java")).v("dump completed");
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
