package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apov implements apqd {
    final /* synthetic */ apow a;
    final /* synthetic */ apqd b;

    public apov(apow apowVar, apqd apqdVar) {
        this.a = apowVar;
        this.b = apqdVar;
    }

    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        apow apowVar = this.a;
        apowVar.d();
        try {
            try {
                long jB = this.b.b(apoyVar, j);
                if (apowVar.e()) {
                    throw apowVar.c((java.io.IOException) null);
                }
                return jB;
            } catch (java.io.IOException e) {
                if (apowVar.e()) {
                    throw apowVar.c(e);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            apowVar.e();
            throw th;
        }
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

    public final java.lang.String toString() {
        return "AsyncTimeout.source(" + this.b + ')';
    }
}
