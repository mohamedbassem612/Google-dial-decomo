package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class OptionalLong {
    public static final j$.util.OptionalLong c = new j$.util.OptionalLong();
    public final boolean a;
    public final long b;

    public OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public static j$.util.OptionalLong empty() {
        return c;
    }

    public static j$.util.OptionalLong of(long j) {
        return new j$.util.OptionalLong(j);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.util.OptionalLong) {
            j$.util.OptionalLong optionalLong = (j$.util.OptionalLong) obj;
            boolean z = optionalLong.a;
            boolean z2 = this.a;
            if (z2 && z) {
                if (this.b == optionalLong.b) {
                    return true;
                }
            } else if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public long getAsLong() {
        if (this.a) {
            return this.b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public void ifPresent(java.util.function.LongConsumer longConsumer) {
        if (this.a) {
            longConsumer.accept(this.b);
        }
    }

    public boolean isPresent() {
        return this.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends java.lang.Throwable> long orElseThrow(java.util.function.Supplier<? extends X> supplier) throws X {
        if (this.a) {
            return this.b;
        }
        throw supplier.get();
    }

    public final java.lang.String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
