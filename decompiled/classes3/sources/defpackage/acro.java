package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acro {
    public final int a;

    public static java.lang.String a(int i) {
        return "EnergyState(value=" + i + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.acro) && this.a == ((defpackage.acro) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
