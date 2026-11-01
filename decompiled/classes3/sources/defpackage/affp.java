package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affp implements afef {
    private boolean a = false;

    static {
        new java.util.concurrent.atomic.AtomicInteger();
    }

    public final void b() {
        this.a = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: affa */
    /* JADX WARN: Type inference failed for: r1v11, types: [affu, java.lang.Object] */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.io.File a(ahbz ahbzVar) throws affa {
        if (this.a) {
            if (ahbzVar.l()) {
                throw new affa("Short circuit would skip transforms.");
            }
            return ahbzVar.b.c((android.net.Uri) ahbzVar.c);
        }
        afey afeyVar = new afey(new affr().c(ahbzVar));
        try {
            afen afenVar = afeyVar.a;
            if (!(afenVar instanceof afen)) {
                throw new java.io.IOException("Not convertible and fallback to pipe is disabled.");
            }
            java.io.File fileC = afenVar.c();
            afeyVar.close();
            return fileC;
        } catch (java.lang.Throwable th) {
            try {
                afeyVar.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
