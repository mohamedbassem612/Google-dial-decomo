package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class appc implements apqd {
    private final defpackage.appd a;
    private long b;
    private boolean c;

    public appc(defpackage.appd appdVar, long j) {
        this.a = appdVar;
        this.b = j;
    }

    public final long b(apoy apoyVar, long j) {
        long j2;
        long j3;
        long j4;
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.appd appdVar = this.a;
        long j5 = this.b;
        long j6 = j5 + 8192;
        long j7 = j5;
        while (true) {
            if (j7 < j6) {
                appy appyVarV = apoyVar.v(1);
                byte[] bArr = appyVarV.a;
                int i = appyVarV.c;
                j3 = -1;
                defpackage.appd appdVar2 = appdVar;
                j2 = j7;
                int iC = appdVar2.c(j2, bArr, i, (int) java.lang.Math.min(j6 - j7, 8192 - i));
                if (iC == -1) {
                    if (appyVarV.b == appyVarV.c) {
                        apoyVar.a = appyVarV.a();
                        appz.b(appyVarV);
                    }
                    if (j5 == j2) {
                        j4 = -1;
                        break;
                    }
                } else {
                    appyVarV.c += iC;
                    long j8 = iC;
                    apoyVar.b += j8;
                    j7 = j2 + j8;
                    appdVar = appdVar2;
                }
            } else {
                j2 = j7;
                j3 = -1;
            }
            j4 = j2 - j5;
            break;
        }
        if (j4 != j3) {
            this.b += j4;
        }
        return j4;
    }

    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.appd appdVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = appdVar.c;
        reentrantLock.lock();
        try {
            int i = appdVar.b - 1;
            appdVar.b = i;
            if (i == 0 && appdVar.a) {
                reentrantLock.unlock();
                this.a.e();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final apqf fP() {
        return apqf.k;
    }
}
