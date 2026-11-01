package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apck {
    public static final boolean a(java.lang.Object obj) {
        return obj == defpackage.apbh.a;
    }

    public static final defpackage.apbi b(java.lang.Object obj) {
        if (obj == defpackage.apbh.a) {
            throw new java.lang.IllegalStateException("Does not contain segment");
        }
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
        return (defpackage.apbi) obj;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
