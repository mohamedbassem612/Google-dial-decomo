package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dib {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dib) && this.a == ((defpackage.dib) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        return i == 4 ? "Tab" : "Image";
    }
}
