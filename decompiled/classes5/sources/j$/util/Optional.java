package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class Optional<T> {
    public static final j$.util.Optional b = new j$.util.Optional();
    public final java.lang.Object a;

    public Optional(java.lang.Object obj) {
        this.a = j$.util.Objects.requireNonNull(obj);
    }

    public static <T> j$.util.Optional<T> empty() {
        return b;
    }

    public static <T> j$.util.Optional<T> of(T t) {
        return new j$.util.Optional<>(t);
    }

    public static <T> j$.util.Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.util.Optional) {
            return j$.util.Objects.equals(this.a, ((j$.util.Optional) obj).a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public void ifPresentOrElse(java.util.function.Consumer<? super T> consumer, java.lang.Runnable runnable) {
        android.R.bool boolVar = (java.lang.Object) this.a;
        if (boolVar != null) {
            consumer.accept(boolVar);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public j$.util.Optional<T> or(java.util.function.Supplier<? extends j$.util.Optional<? extends T>> supplier) {
        j$.util.Objects.requireNonNull(supplier);
        return !isPresent() ? (j$.util.Optional) j$.util.Objects.requireNonNull(supplier.get()) : this;
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public T orElseThrow() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public java.lang.String toString() {
        java.lang.Object obj = this.a;
        return obj != null ? java.lang.String.format("Optional[%s]", obj) : "Optional.empty";
    }

    public Optional() {
        this.a = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends java.lang.Throwable> T orElseThrow(java.util.function.Supplier<? extends X> supplier) throws X {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }
}
