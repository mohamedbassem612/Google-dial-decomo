package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsh implements aohy {
    private final aohy a;
    private final ahqz b;

    public ahsh(aohy aohyVar, ahqz ahqzVar) {
        this.a = aohyVar;
        this.b = ahqzVar;
    }

    public final void e() {
        ahpm ahpmVarA = this.b.a();
        try {
            this.a.e();
            ahpmVarA.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(java.lang.Throwable th) {
        ahpm ahpmVarA = this.b.a();
        try {
            this.a.f(th);
            ahpmVarA.close();
        } catch (java.lang.Throwable th2) {
            try {
                ahpmVarA.close();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(java.lang.Object obj) {
        ahpm ahpmVarA = this.b.a();
        try {
            this.a.g(obj);
            ahpmVarA.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
