package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahyv extends java.util.Random {
    private final boolean a = true;

    static java.security.SecureRandom a() {
        return (java.security.SecureRandom) j$.util.Objects.requireNonNull((java.security.SecureRandom) defpackage.ahyw.c.get());
    }

    @Override // java.util.Random
    protected final int next(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return a().nextBoolean();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        a().nextBytes(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return a().nextDouble();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return a().nextFloat();
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        return a().nextGaussian();
    }

    @Override // java.util.Random
    public final int nextInt() {
        return a().nextInt();
    }

    @Override // java.util.Random
    public final long nextLong() {
        return a().nextLong();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.a) {
            throw new java.lang.UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
        }
        super.setSeed(j);
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return a().nextInt(i);
    }
}
