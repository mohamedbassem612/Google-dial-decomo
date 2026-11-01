package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aljc {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/AudioMulticaster");
    public ajcu b;
    public java.util.HashMap c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: Thrown type has an unknown type hierarchy: alio */
    public final java.io.InputStream a() throws alio {
        java.io.PipedInputStream pipedInputStream = new java.io.PipedInputStream();
        try {
            this.c.put(pipedInputStream, new java.io.PipedOutputStream(pipedInputStream));
            return pipedInputStream;
        } catch (java.io.IOException e) {
            throw new alio("Could not create a new audio input stream.", e);
        }
    }
}
