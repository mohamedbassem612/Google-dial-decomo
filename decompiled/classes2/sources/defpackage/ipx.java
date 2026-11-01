package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ipx {
    private final defpackage.iph a;
    private final java.io.File b;

    public ipx(defpackage.iph iphVar, java.io.File file) {
        this.a = iphVar;
        this.b = file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ipw ipwVar;
        ?? r0;
        if (aolnVar instanceof defpackage.ipw) {
            ipwVar = (defpackage.ipw) aolnVar;
            int i = ipwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipwVar.d = i - Integer.MIN_VALUE;
            } else {
                ipwVar = new defpackage.ipw(this, aolnVar);
            }
        } else {
            ipwVar = new defpackage.ipw(this, aolnVar);
        }
        java.lang.Object objB = ipwVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ipwVar.d;
        defpackage.ipg ipgVar = null;
        if (i2 == 0) {
            aooc.af(objB);
            defpackage.iph iphVar = this.a;
            if (iphVar == null) {
                return java.lang.Boolean.FALSE;
            }
            aimw aimwVarL = defpackage.ipz.a.b().l("com/android/dialer/backup/impl/PendingUnboundedRestores$PendingUnboundedRestore", "tryRestoreAndCleanup", 114, "PendingUnboundedRestores.kt");
            java.io.File file = this.b;
            aimwVarL.y("restoring %s", file.getName());
            try {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file), 8192);
                try {
                    ipwVar.a = bufferedInputStream;
                    ipwVar.d = 1;
                    objB = iphVar.b(bufferedInputStream, ipwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    r0 = bufferedInputStream;
                } catch (java.lang.Throwable th) {
                    th = th;
                    r0 = bufferedInputStream;
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                defpackage.ipz.a.c().k(e2).l("com/android/dialer/backup/impl/PendingUnboundedRestores$PendingUnboundedRestore", "tryRestoreAndCleanup", 121, "PendingUnboundedRestores.kt").y("%s failed to restore", this.b.getName());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0 = ipwVar.a;
            try {
                aooc.af(objB);
                r0 = r0;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak((java.io.Closeable) r0, th);
                    throw th3;
                }
            }
        }
        defpackage.ipg ipgVar2 = (defpackage.ipg) objB;
        ajsz.ak((java.io.Closeable) r0, (java.lang.Throwable) null);
        ipgVar = ipgVar2;
        if (ipgVar != defpackage.ipg.a) {
            defpackage.ipz.a.b().l("com/android/dialer/backup/impl/PendingUnboundedRestores$PendingUnboundedRestore", "tryRestoreAndCleanup", 126, "PendingUnboundedRestores.kt").y("%s cannot restore now, skipping", this.b.getName());
            return java.lang.Boolean.FALSE;
        }
        aimz aimzVar = defpackage.ipz.a;
        aimw aimwVarL2 = aimzVar.b().l("com/android/dialer/backup/impl/PendingUnboundedRestores$PendingUnboundedRestore", "tryRestoreAndCleanup", 130, "PendingUnboundedRestores.kt");
        java.io.File file2 = this.b;
        aimwVarL2.y("%s restored", file2.getName());
        file2.delete();
        aimzVar.b().l("com/android/dialer/backup/impl/PendingUnboundedRestores$PendingUnboundedRestore", "tryRestoreAndCleanup", 132, "PendingUnboundedRestores.kt").y("%s deleted", file2.getName());
        return java.lang.Boolean.TRUE;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ipx) {
            defpackage.ipx ipxVar = (defpackage.ipx) obj;
            if (aooh.n(this.a, ipxVar.a) && aooh.n(this.b, ipxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.iph iphVar = this.a;
        return ((iphVar == null ? 0 : iphVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PendingUnboundedRestore(integration=" + this.a + ", file=" + this.b + ')';
    }
}
