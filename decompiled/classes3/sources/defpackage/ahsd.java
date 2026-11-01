package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahsd extends antw {
    private final ahqz a;
    private final antw b;

    public ahsd(antw antwVar, ahqz ahqzVar) {
        super((char[]) null);
        this.b = antwVar;
        this.a = ahqzVar;
    }

    public final void a() {
        ahpm ahpmVarA = this.a.a();
        try {
            this.b.a();
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

    public final void b() {
        ahpm ahpmVarA = this.a.a();
        try {
            this.b.b();
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

    public final void c() {
        ahpm ahpmVarA = this.a.a();
        try {
            this.b.c();
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

    public final void d(java.lang.Object obj) {
        ahpm ahpmVarA = this.a.a();
        try {
            this.b.d(obj);
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

    public final void e() {
        ahpm ahpmVarA = this.a.a();
        try {
            this.b.e();
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
