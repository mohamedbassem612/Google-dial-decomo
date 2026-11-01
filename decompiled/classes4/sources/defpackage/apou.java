package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apou implements apqb {
    final /* synthetic */ apow a;
    final /* synthetic */ apqb b;

    public apou(apow apowVar, apqb apqbVar) {
        this.a = apowVar;
        this.b = apqbVar;
    }

    public final void close() throws java.io.IOException {
        apow apowVar = this.a;
        apowVar.d();
        try {
            try {
                this.b.close();
                if (apowVar.e()) {
                    throw apowVar.c((java.io.IOException) null);
                }
            } catch (java.io.IOException e) {
                if (!apowVar.e()) {
                    throw e;
                }
                throw apowVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            apowVar.e();
            throw th;
        }
    }

    public final /* synthetic */ apqf fP() {
        return this.a;
    }

    public final void fQ(apoy apoyVar, long j) throws java.io.IOException {
        aoov.aV(apoyVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            appy appyVar = apoyVar.a;
            aooh.c(appyVar);
            while (j2 < 65536) {
                j2 += (long) (appyVar.c - appyVar.b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    appyVar = appyVar.f;
                    aooh.c(appyVar);
                }
            }
            apow apowVar = this.a;
            apqb apqbVar = this.b;
            apowVar.d();
            try {
                try {
                    apqbVar.fQ(apoyVar, j2);
                    if (apowVar.e()) {
                        throw apowVar.c((java.io.IOException) null);
                    }
                    j -= j2;
                } catch (java.io.IOException e) {
                    if (!apowVar.e()) {
                        throw e;
                    }
                    throw apowVar.c(e);
                }
            } catch (java.lang.Throwable th) {
                apowVar.e();
                throw th;
            }
        }
    }

    public final void flush() throws java.io.IOException {
        apow apowVar = this.a;
        apowVar.d();
        try {
            try {
                this.b.flush();
                if (apowVar.e()) {
                    throw apowVar.c((java.io.IOException) null);
                }
            } catch (java.io.IOException e) {
                if (!apowVar.e()) {
                    throw e;
                }
                throw apowVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            apowVar.e();
            throw th;
        }
    }

    public final java.lang.String toString() {
        return "AsyncTimeout.sink(" + this.b + ')';
    }
}
