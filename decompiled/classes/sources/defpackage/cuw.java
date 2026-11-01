package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cuw {
    public final int a;

    public cuw(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
            }
            if (this.a == ((defpackage.cuw) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "AndroidPointerIcon(type=" + this.a + ')';
    }
}
