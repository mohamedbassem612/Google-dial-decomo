package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dmx {
    public final int a;

    public static java.lang.String a(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dmx) && this.a == ((defpackage.dmx) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
