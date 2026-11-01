package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class OptionalInt {
    public static final j$.util.OptionalInt c = new j$.util.OptionalInt();
    public final boolean a;
    public final int b;

    public OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static j$.util.OptionalInt empty() {
        return c;
    }

    public static j$.util.OptionalInt of(int i) {
        return new j$.util.OptionalInt(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.util.OptionalInt) {
            j$.util.OptionalInt optionalInt = (j$.util.OptionalInt) obj;
            boolean z = optionalInt.a;
            boolean z2 = this.a;
            if (z2 && z) {
                if (this.b == optionalInt.b) {
                    return true;
                }
            } else if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public int getAsInt() {
        if (this.a) {
            return this.b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public void ifPresent(java.util.function.IntConsumer intConsumer) {
        if (this.a) {
            intConsumer.accept(this.b);
        }
    }

    public boolean isPresent() {
        return this.a;
    }

    public int orElse(int i) {
        return this.a ? this.b : i;
    }

    public int orElseGet(java.util.function.IntSupplier intSupplier) {
        return this.a ? this.b : intSupplier.getAsInt();
    }

    public final java.lang.String toString() {
        if (!this.a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.b + "]";
    }

    public OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }
}
