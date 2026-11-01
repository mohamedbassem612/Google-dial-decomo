package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class y {
    public static j$.util.Optional a(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? j$.util.Optional.of(optional.get()) : j$.util.Optional.empty();
    }

    public static j$.util.OptionalDouble b(java.util.OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new j$.util.OptionalDouble(optionalDouble.getAsDouble()) : j$.util.OptionalDouble.c;
    }

    public static j$.util.OptionalInt c(java.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? j$.util.OptionalInt.of(optionalInt.getAsInt()) : j$.util.OptionalInt.empty();
    }

    public static j$.util.OptionalLong d(java.util.OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? j$.util.OptionalLong.of(optionalLong.getAsLong()) : j$.util.OptionalLong.empty();
    }

    public static java.util.Optional e(j$.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static java.util.OptionalDouble f(j$.util.OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        boolean z = optionalDouble.a;
        if (!z) {
            return java.util.OptionalDouble.empty();
        }
        if (z) {
            return java.util.OptionalDouble.of(optionalDouble.b);
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public static java.util.OptionalInt g(j$.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? java.util.OptionalInt.of(optionalInt.getAsInt()) : java.util.OptionalInt.empty();
    }

    public static java.util.OptionalLong h(j$.util.OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? java.util.OptionalLong.of(optionalLong.getAsLong()) : java.util.OptionalLong.empty();
    }
}
