package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyk extends defpackage.jlr {
    public final int a;

    public jyk(int i) {
        super(null);
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jyk) && this.a == ((defpackage.jyk) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ChipTextResourceId(textResourceId=" + this.a + ')';
    }
}
