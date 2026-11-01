package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsv implements java.io.Closeable {
    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws afeb {
        defpackage.afec.c();
        int i = defpackage.agsw.a;
        if (i <= 0) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.agsw.a = i - 1;
    }
}
