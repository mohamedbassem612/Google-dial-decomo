package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajdb implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    java.lang.Runnable a;
    final /* synthetic */ java.lang.Object b;

    public ajdb(defpackage.agtg agtgVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agtgVar);
        this.b = agtgVar;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0151, code lost:
    
        if (r7 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0160, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0161, code lost:
    
        r14.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0166, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0169, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x016b, code lost:
    
        defpackage.ajdc.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r14.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0191, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0195, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0196, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0198, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r7 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r14.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        defpackage.ajuu.a.logp(java.util.logging.Level.SEVERE, "com.google.firebase.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r14.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ea, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00eb, code lost:
    
        r14.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdb.run():void");
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        java.lang.String str = "QUEUING";
        java.lang.String str2 = "null";
        if (i == 0) {
            java.lang.Runnable runnable = this.a;
            if (runnable != null) {
                return defpackage.a.bG((byte) 125, runnable, "SequentialExecutorWorker{running=");
            }
            int i2 = ((defpackage.ajdc) this.b).d;
            if (i2 == 1) {
                str = "IDLE";
            } else if (i2 != 2) {
                if (i2 != 3) {
                    str = i2 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
            }
            return defpackage.a.bp((byte) 125, str, "SequentialExecutorWorker{state=");
        }
        java.lang.Runnable runnable2 = this.a;
        if (i != 1) {
            if (runnable2 != null) {
                return defpackage.a.bG((byte) 125, runnable2, "SequentialExecutorWorker{running=");
            }
            int i3 = ((defpackage.ajuu) this.b).d;
            if (i3 == 1) {
                str = "IDLE";
            } else if (i3 != 2) {
                if (i3 != 3) {
                    str = i3 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
            }
            return defpackage.a.bp((byte) 125, str, "SequentialExecutorWorker{state=");
        }
        if (runnable2 != null) {
            return defpackage.a.bG((byte) 125, runnable2, "SequentialExecutorWorker{running=");
        }
        int i4 = ((defpackage.agtg) this.b).b;
        if (i4 == 1) {
            str2 = "IDLE";
        } else if (i4 == 2) {
            str2 = "QUEUED";
        } else if (i4 == 3) {
            str2 = "RUNNING";
        }
        return defpackage.a.bp((byte) 125, str2, "SequentialExecutorWorker{state=");
    }

    public ajdb(defpackage.ajdc ajdcVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ajdcVar);
        this.b = ajdcVar;
    }

    public ajdb(defpackage.ajuu ajuuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ajuuVar);
        this.b = ajuuVar;
    }
}
